package com.google.common.eventbus;

import ch.qos.logback.core.CoreConstants;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.MoreExecutors;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes17.dex */
@ElementTypesAreNonnullByDefault
public class EventBus {
    private static final Logger logger = Logger.getLogger(EventBus.class.getName());
    private final Dispatcher dispatcher;
    private final SubscriberExceptionHandler exceptionHandler;
    private final Executor executor;
    private final String identifier;
    private final SubscriberRegistry subscribers;

    public static final class LoggingHandler implements SubscriberExceptionHandler {
        static final LoggingHandler INSTANCE = new LoggingHandler();

        private static Logger logger(SubscriberExceptionContext subscriberExceptionContext) {
            return Logger.getLogger(EventBus.class.getName() + "." + subscriberExceptionContext.getEventBus().identifier());
        }

        private static String message(SubscriberExceptionContext subscriberExceptionContext) {
            Method subscriberMethod = subscriberExceptionContext.getSubscriberMethod();
            return "Exception thrown by subscriber method " + subscriberMethod.getName() + CoreConstants.LEFT_PARENTHESIS_CHAR + subscriberMethod.getParameterTypes()[0].getName() + ") on subscriber " + subscriberExceptionContext.getSubscriber() + " when dispatching event: " + subscriberExceptionContext.getEvent();
        }

        @Override // com.google.common.eventbus.SubscriberExceptionHandler
        public void handleException(Throwable th10, SubscriberExceptionContext subscriberExceptionContext) {
            Logger logger = logger(subscriberExceptionContext);
            Level level = Level.SEVERE;
            if (logger.isLoggable(level)) {
                logger.log(level, message(subscriberExceptionContext), th10);
            }
        }
    }

    public EventBus() {
        this("default");
    }

    public final Executor executor() {
        return this.executor;
    }

    public void handleSubscriberException(Throwable th10, SubscriberExceptionContext subscriberExceptionContext) {
        Preconditions.checkNotNull(th10);
        Preconditions.checkNotNull(subscriberExceptionContext);
        try {
            this.exceptionHandler.handleException(th10, subscriberExceptionContext);
        } catch (Throwable th11) {
            logger.log(Level.SEVERE, String.format(Locale.ROOT, "Exception %s thrown while handling exception: %s", th11, th10), th11);
        }
    }

    public final String identifier() {
        return this.identifier;
    }

    public void post(Object obj2) {
        Iterator<Subscriber> subscribers = this.subscribers.getSubscribers(obj2);
        if (subscribers.hasNext()) {
            this.dispatcher.dispatch(obj2, subscribers);
        } else {
            if (obj2 instanceof DeadEvent) {
                return;
            }
            post(new DeadEvent(this, obj2));
        }
    }

    public void register(Object obj2) {
        this.subscribers.register(obj2);
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).addValue(this.identifier).toString();
    }

    public void unregister(Object obj2) {
        this.subscribers.unregister(obj2);
    }

    public EventBus(String str) {
        this(str, MoreExecutors.directExecutor(), Dispatcher.perThreadDispatchQueue(), LoggingHandler.INSTANCE);
    }

    public EventBus(SubscriberExceptionHandler subscriberExceptionHandler) {
        this("default", MoreExecutors.directExecutor(), Dispatcher.perThreadDispatchQueue(), subscriberExceptionHandler);
    }

    public EventBus(String str, Executor executor, Dispatcher dispatcher, SubscriberExceptionHandler subscriberExceptionHandler) {
        this.subscribers = new SubscriberRegistry(this);
        this.identifier = (String) Preconditions.checkNotNull(str);
        this.executor = (Executor) Preconditions.checkNotNull(executor);
        this.dispatcher = (Dispatcher) Preconditions.checkNotNull(dispatcher);
        this.exceptionHandler = (SubscriberExceptionHandler) Preconditions.checkNotNull(subscriberExceptionHandler);
    }
}
