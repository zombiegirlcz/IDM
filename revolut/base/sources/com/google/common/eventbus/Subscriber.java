package com.google.common.eventbus;

import a0.d;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes17.dex */
@ElementTypesAreNonnullByDefault
class Subscriber {
    private EventBus bus;
    private final Executor executor;
    private final Method method;

    @VisibleForTesting
    final Object target;

    @VisibleForTesting
    public static final class SynchronizedSubscriber extends Subscriber {
        @Override // com.google.common.eventbus.Subscriber
        public void invokeSubscriberMethod(Object obj2) throws InvocationTargetException {
            synchronized (this) {
                super.invokeSubscriberMethod(obj2);
            }
        }

        private SynchronizedSubscriber(EventBus eventBus, Object obj2, Method method) {
            super(eventBus, obj2, method);
        }
    }

    private SubscriberExceptionContext context(Object obj2) {
        return new SubscriberExceptionContext(this.bus, obj2, this.target, this.method);
    }

    public static Subscriber create(EventBus eventBus, Object obj2, Method method) {
        return isDeclaredThreadSafe(method) ? new Subscriber(eventBus, obj2, method) : new SynchronizedSubscriber(eventBus, obj2, method);
    }

    private static boolean isDeclaredThreadSafe(Method method) {
        return method.getAnnotation(AllowConcurrentEvents.class) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$dispatchEvent$0(Object obj2) {
        try {
            invokeSubscriberMethod(obj2);
        } catch (InvocationTargetException e) {
            this.bus.handleSubscriberException(e.getCause(), context(obj2));
        }
    }

    public final void dispatchEvent(final Object obj2) {
        this.executor.execute(new Runnable() { // from class: com.google.common.eventbus.a
            @Override // java.lang.Runnable
            public final void run() {
                this.lambda$dispatchEvent$0(obj2);
            }
        });
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof Subscriber) {
            Subscriber subscriber = (Subscriber) obj2;
            if (this.target == subscriber.target && this.method.equals(subscriber.method)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.target) + ((this.method.hashCode() + 31) * 31);
    }

    @VisibleForTesting
    public void invokeSubscriberMethod(Object obj2) throws InvocationTargetException {
        try {
            this.method.invoke(this.target, Preconditions.checkNotNull(obj2));
        } catch (IllegalAccessException e) {
            throw new Error(d.m(obj2, "Method became inaccessible: "), e);
        } catch (IllegalArgumentException e2) {
            throw new Error(d.m(obj2, "Method rejected target/argument: "), e2);
        } catch (InvocationTargetException e4) {
            if (!(e4.getCause() instanceof Error)) {
                throw e4;
            }
            throw ((Error) e4.getCause());
        }
    }

    private Subscriber(EventBus eventBus, Object obj2, Method method) {
        this.bus = eventBus;
        this.target = Preconditions.checkNotNull(obj2);
        this.method = method;
        method.setAccessible(true);
        this.executor = eventBus.executor();
    }
}
