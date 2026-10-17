package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.PurchaseHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AFd1kSDK implements AFd1fSDK {
    private static final int AFInAppEventType = (int) TimeUnit.SECONDS.toMillis(30);
    private ScheduledExecutorService AFInAppEventParameterName;
    private ExecutorService AFKeystoreWrapper;
    private AFe1tSDK AFLogger;
    private AFc1tSDK AFLogger$LogLevel;
    private AFc1fSDK AFPurchaseDetails;
    private AFd1bSDK afDebugLog;
    private AFi1pSDK afErrorLog;
    private AFi1vSDK afErrorLogForExcManagerOnly;
    private AFg1mSDK afInfoLog;
    private AFd1xSDK afLogForce;
    private AFe1bSDK afRDLog;
    private AFg1wSDK afVerboseLog;
    private AFb1tSDK afWarnLog;
    private AFd1oSDK component2;
    private AFg1qSDK component5;
    private AFg1ySDK d;
    private AFh1wSDK e;
    private AFb1aSDK force;
    private AFb1ySDK getCurrency;
    private AFd1uSDK getLevel;
    private AFh1ySDK getPrice;
    private AFi1rSDK getProductId;
    private AFg1uSDK getPurchaseToken;
    private AFc1pSDK getPurchaseType;
    private AFi1cSDK i;
    private AFd1sSDK registerClient;
    private PurchaseHandler unregisterClient;
    private AFj1zSDK v;
    private ExecutorService valueOf;
    public final AFd1nSDK values = new AFd1nSDK();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private AFe1aSDK f26019w;

    public static class AFa1uSDK implements ThreadFactory {
        private static final AtomicInteger AFInAppEventParameterName = new AtomicInteger();
        private final AtomicInteger AFInAppEventType = new AtomicInteger();

        public AFa1uSDK() {
            AFInAppEventParameterName.incrementAndGet();
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            int i = AFInAppEventParameterName.get();
            int iIncrementAndGet = this.AFInAppEventType.incrementAndGet();
            StringBuilder sb6 = new StringBuilder("queue-");
            sb6.append(i);
            sb6.append("-");
            sb6.append(iIncrementAndGet);
            return new Thread(runnable, sb6.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.appsflyer.internal.AFd1fSDK
    @NonNull
    /* JADX INFO: renamed from: component1, reason: merged with bridge method [inline-methods] */
    public synchronized AFd1bSDK getPrice() {
        try {
            if (this.afDebugLog == null) {
                this.afDebugLog = new AFd1bSDK(this);
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return this.afDebugLog;
    }

    @NonNull
    private synchronized AFg1qSDK component4() {
        try {
            if (this.component5 == null) {
                this.component5 = new AFg1qSDK(afInfoLog(), valueOf());
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return this.component5;
    }

    @NonNull
    private synchronized AFe1tSDK getProductId() {
        try {
            if (this.AFLogger == null) {
                this.AFLogger = new AFe1tSDK(new AFe1oSDK(AFInAppEventType), AFKeystoreWrapper());
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return this.AFLogger;
    }

    @NonNull
    private synchronized ExecutorService getPurchaseType() {
        try {
            if (this.AFKeystoreWrapper == null) {
                ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
                Intrinsics.checkNotNullExpressionValue(executorServiceNewSingleThreadExecutor, "");
                this.AFKeystoreWrapper = executorServiceNewSingleThreadExecutor;
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return this.AFKeystoreWrapper;
    }

    @Override // com.appsflyer.internal.AFd1fSDK
    @NonNull
    public final synchronized ScheduledExecutorService AFInAppEventParameterName() {
        try {
            if (this.AFInAppEventParameterName == null) {
                ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(2);
                Intrinsics.checkNotNullExpressionValue(scheduledExecutorServiceNewScheduledThreadPool, "");
                this.AFInAppEventParameterName = scheduledExecutorServiceNewScheduledThreadPool;
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return this.AFInAppEventParameterName;
    }

    @Override // com.appsflyer.internal.AFd1fSDK
    @NonNull
    public final AFd1pSDK AFInAppEventType() {
        Context context = this.values.AFKeystoreWrapper;
        if (context != null) {
            return new AFd1qSDK(AFb1rSDK.values(context));
        }
        throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
    }

    @Override // com.appsflyer.internal.AFd1fSDK
    @NonNull
    public final synchronized ExecutorService AFKeystoreWrapper() {
        try {
            if (this.valueOf == null) {
                this.valueOf = AFd1rSDK.AFInAppEventParameterName();
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return this.valueOf;
    }

    @Override // com.appsflyer.internal.AFd1fSDK
    @NonNull
    public final AFg1mSDK AFLogger() {
        if (this.afInfoLog == null) {
            Context context = this.values.AFKeystoreWrapper;
            if (context == null) {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
            if (this.afErrorLog == null) {
                this.afErrorLog = new AFi1mSDK();
            }
            AFi1pSDK aFi1pSDK = this.afErrorLog;
            if (this.afLogForce == null) {
                this.afLogForce = new com.appsflyer.internal.AFa1uSDK();
            }
            AFd1xSDK aFd1xSDK = this.afLogForce;
            if (this.v == null) {
                Context context2 = this.values.AFKeystoreWrapper;
                if (context2 == null) {
                    throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
                }
                this.v = new AFj1vSDK(context2, getPurchaseType());
            }
            AFj1zSDK aFj1zSDK = this.v;
            if (this.getCurrency == null) {
                this.getCurrency = new AFa1aSDK();
            }
            AFb1ySDK aFb1ySDK = this.getCurrency;
            AFh1wSDK aFh1wSDKRegisterClient = registerClient();
            AFd1pSDK aFd1pSDKAFInAppEventType = AFInAppEventType();
            AFd1sSDK aFd1sSDKValueOf = valueOf();
            if (this.afErrorLogForExcManagerOnly == null) {
                Context context3 = this.values.AFKeystoreWrapper;
                if (context3 == null) {
                    throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
                }
                this.afErrorLogForExcManagerOnly = new AFi1vSDK(context3);
            }
            AFi1vSDK aFi1vSDK = this.afErrorLogForExcManagerOnly;
            AFg1wSDK aFg1wSDKV = v();
            AFb1cSDK aFb1cSDK = new AFb1cSDK();
            AFd1nSDK aFd1nSDKAfInfoLog = afInfoLog();
            AFg1qSDK aFg1qSDKComponent4 = component4();
            if (this.component2 == null) {
                this.component2 = new AFd1oSDK();
            }
            this.afInfoLog = new AFg1iSDK(context, aFi1pSDK, aFd1xSDK, aFj1zSDK, aFb1ySDK, aFh1wSDKRegisterClient, aFd1pSDKAFInAppEventType, aFd1sSDKValueOf, aFi1vSDK, aFg1wSDKV, aFb1cSDK, aFd1nSDKAfInfoLog, aFg1qSDKComponent4, this.component2);
        }
        return this.afInfoLog;
    }

    @Override // com.appsflyer.internal.AFd1fSDK
    @NonNull
    public final AFh1ySDK AFLogger$LogLevel() {
        if (this.getPrice == null) {
            this.getPrice = new AFh1zSDK(this);
        }
        return this.getPrice;
    }

    @Override // com.appsflyer.internal.AFd1fSDK
    @NonNull
    public final AFi1vSDK AFPurchaseDetails() {
        if (this.afErrorLogForExcManagerOnly == null) {
            Context context = this.values.AFKeystoreWrapper;
            if (context == null) {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
            this.afErrorLogForExcManagerOnly = new AFi1vSDK(context);
        }
        return this.afErrorLogForExcManagerOnly;
    }

    @Override // com.appsflyer.internal.AFd1fSDK
    @NonNull
    public final synchronized AFc1tSDK afDebugLog() {
        try {
            if (this.AFLogger$LogLevel == null) {
                this.AFLogger$LogLevel = new AFc1tSDK(this);
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return this.AFLogger$LogLevel;
    }

    @Override // com.appsflyer.internal.AFd1fSDK
    @NonNull
    public final synchronized AFc1fSDK afErrorLog() {
        try {
            if (this.AFPurchaseDetails == null) {
                this.AFPurchaseDetails = new AFc1bSDK(afInfoLog());
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return this.AFPurchaseDetails;
    }

    @Override // com.appsflyer.internal.AFd1fSDK
    @NonNull
    public final AFd1uSDK afErrorLogForExcManagerOnly() {
        if (this.getLevel == null) {
            ExecutorService purchaseType = getPurchaseType();
            ScheduledExecutorService scheduledExecutorServiceAFInAppEventParameterName = AFInAppEventParameterName();
            AFc1tSDK aFc1tSDKAfDebugLog = afDebugLog();
            if (this.getProductId == null) {
                this.getProductId = new AFi1qSDK();
            }
            this.getLevel = new AFd1ySDK(purchaseType, scheduledExecutorServiceAFInAppEventParameterName, aFc1tSDKAfDebugLog, this.getProductId);
        }
        return this.getLevel;
    }

    @Override // com.appsflyer.internal.AFd1fSDK
    @NonNull
    public final synchronized AFd1nSDK afInfoLog() {
        return this.values;
    }

    @Override // com.appsflyer.internal.AFd1fSDK
    @NonNull
    public final AFi1rSDK afLogForce() {
        if (this.getProductId == null) {
            this.getProductId = new AFi1qSDK();
        }
        return this.getProductId;
    }

    @Override // com.appsflyer.internal.AFd1fSDK
    @NonNull
    public final synchronized AFe1bSDK afRDLog() {
        try {
            if (this.afRDLog == null) {
                this.afRDLog = new AFe1bSDK(valueOf(), AFInAppEventType());
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return this.afRDLog;
    }

    @Override // com.appsflyer.internal.AFd1fSDK
    @NonNull
    public final AFi1pSDK afVerboseLog() {
        if (this.afErrorLog == null) {
            this.afErrorLog = new AFi1mSDK();
        }
        return this.afErrorLog;
    }

    @Override // com.appsflyer.internal.AFd1fSDK
    @NonNull
    public final synchronized AFb1tSDK afWarnLog() {
        try {
            if (this.afWarnLog == null) {
                this.afWarnLog = new AFb1iSDK(afInfoLog());
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return this.afWarnLog;
    }

    @Override // com.appsflyer.internal.AFd1fSDK
    @NonNull
    public final synchronized PurchaseHandler d() {
        try {
            if (this.unregisterClient == null) {
                this.unregisterClient = new PurchaseHandler(this);
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return this.unregisterClient;
    }

    @Override // com.appsflyer.internal.AFd1fSDK
    @NonNull
    public final synchronized AFg1ySDK e() {
        try {
            if (this.d == null) {
                AFg1sSDK aFg1sSDK = new AFg1sSDK(AFInAppEventType());
                this.d = new AFg1ySDK(new AFg1xSDK(), valueOf(), v(), aFg1sSDK, new AFe1rSDK(getProductId(), valueOf(), AppsFlyerProperties.getInstance(), afRDLog()), new AFg1tSDK(valueOf(), aFg1sSDK), w());
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return this.d;
    }

    @Override // com.appsflyer.internal.AFd1fSDK
    @NonNull
    public final synchronized AFi1cSDK force() {
        try {
            if (this.i == null) {
                this.i = new AFi1cSDK(this);
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return this.i;
    }

    @Override // com.appsflyer.internal.AFd1fSDK
    @NonNull
    public final AFg1uSDK getCurrency() {
        if (this.getPurchaseToken == null) {
            Context context = this.values.AFKeystoreWrapper;
            if (context == null) {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
            AFg1rSDK aFg1rSDK = new AFg1rSDK(context, AppsFlyerProperties.getInstance());
            if (this.component2 == null) {
                this.component2 = new AFd1oSDK();
            }
            this.getPurchaseToken = new AFg1pSDK(aFg1rSDK, this.component2, AppsFlyerProperties.getInstance());
        }
        return this.getPurchaseToken;
    }

    @Override // com.appsflyer.internal.AFd1fSDK
    @NonNull
    public final AFd1oSDK getLevel() {
        if (this.component2 == null) {
            this.component2 = new AFd1oSDK();
        }
        return this.component2;
    }

    @Override // com.appsflyer.internal.AFd1fSDK
    @NonNull
    public final AFc1pSDK getPurchaseToken() {
        if (this.getPurchaseType == null) {
            this.getPurchaseType = new AFc1eSDK(AFInAppEventType());
        }
        return this.getPurchaseType;
    }

    @Override // com.appsflyer.internal.AFd1fSDK
    @NonNull
    public final synchronized AFb1aSDK i() {
        try {
            if (this.force == null) {
                this.force = new AFb1gSDK(this);
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return this.force;
    }

    @Override // com.appsflyer.internal.AFd1fSDK
    @NonNull
    public final synchronized AFh1wSDK registerClient() {
        try {
            if (this.e == null) {
                this.e = new AFh1wSDK(AFInAppEventType());
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return this.e;
    }

    @Override // com.appsflyer.internal.AFd1fSDK
    @NonNull
    public final AFj1zSDK unregisterClient() {
        if (this.v == null) {
            Context context = this.values.AFKeystoreWrapper;
            if (context == null) {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
            this.v = new AFj1vSDK(context, getPurchaseType());
        }
        return this.v;
    }

    @Override // com.appsflyer.internal.AFd1fSDK
    @NonNull
    public final synchronized AFg1wSDK v() {
        try {
            if (this.afVerboseLog == null) {
                this.afVerboseLog = new AFg1wSDK(afInfoLog(), new AFg1vSDK());
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return this.afVerboseLog;
    }

    @Override // com.appsflyer.internal.AFd1fSDK
    @NonNull
    public final synchronized AFd1sSDK valueOf() {
        try {
            if (this.registerClient == null) {
                AFd1nSDK aFd1nSDKAfInfoLog = afInfoLog();
                Context context = this.values.AFKeystoreWrapper;
                if (context == null) {
                    throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
                }
                AFd1qSDK aFd1qSDK = new AFd1qSDK(AFb1rSDK.values(context));
                if (this.component2 == null) {
                    this.component2 = new AFd1oSDK();
                }
                this.registerClient = new AFd1sSDK(aFd1nSDKAfInfoLog, aFd1qSDK, this.component2);
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return this.registerClient;
    }

    @Override // com.appsflyer.internal.AFd1fSDK
    @NonNull
    public final AFe1rSDK values() {
        return new AFe1rSDK(getProductId(), valueOf(), AppsFlyerProperties.getInstance(), afRDLog());
    }

    @Override // com.appsflyer.internal.AFd1fSDK
    @NonNull
    public final synchronized AFe1aSDK w() {
        try {
            if (this.f26019w == null) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 6, 300L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>() { // from class: com.appsflyer.internal.AFd1kSDK.1
                    /* JADX INFO: Access modifiers changed from: private */
                    @Override // java.util.concurrent.LinkedBlockingQueue, java.util.Queue, java.util.concurrent.BlockingQueue
                    /* JADX INFO: renamed from: valueOf, reason: merged with bridge method [inline-methods] */
                    public boolean offer(Runnable runnable) {
                        if (isEmpty()) {
                            return super.offer(runnable);
                        }
                        return false;
                    }
                }, new AFa1uSDK());
                threadPoolExecutor.setRejectedExecutionHandler(new e());
                this.f26019w = new AFe1aSDK(threadPoolExecutor);
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return this.f26019w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void values(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        try {
            threadPoolExecutor.getQueue().put(runnable);
        } catch (InterruptedException e) {
            AFLogger.afErrorLogForExcManagerOnly("could not create executor for queue", e);
            Thread.currentThread().interrupt();
        }
    }
}
