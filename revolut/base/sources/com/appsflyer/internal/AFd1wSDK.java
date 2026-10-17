package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFd1uSDK;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
final class AFd1wSDK implements Application.ActivityLifecycleCallbacks {

    @NotNull
    private final ScheduledExecutorService AFInAppEventParameterName;

    @NotNull
    private final Executor AFInAppEventType;

    @NotNull
    private final AFi1rSDK AFKeystoreWrapper;
    private boolean AFLogger;
    private boolean e;

    @NotNull
    final AFd1uSDK.AFa1vSDK valueOf;

    @NotNull
    private final AFc1tSDK values;

    public AFd1wSDK(@NotNull Executor executor, @NotNull ScheduledExecutorService scheduledExecutorService, @NotNull AFc1tSDK aFc1tSDK, @NotNull AFi1rSDK aFi1rSDK, @NotNull AFd1uSDK.AFa1vSDK aFa1vSDK) {
        Intrinsics.checkNotNullParameter(executor, "");
        Intrinsics.checkNotNullParameter(scheduledExecutorService, "");
        Intrinsics.checkNotNullParameter(aFc1tSDK, "");
        Intrinsics.checkNotNullParameter(aFi1rSDK, "");
        Intrinsics.checkNotNullParameter(aFa1vSDK, "");
        this.AFInAppEventType = executor;
        this.AFInAppEventParameterName = scheduledExecutorService;
        this.values = aFc1tSDK;
        this.AFKeystoreWrapper = aFi1rSDK;
        this.valueOf = aFa1vSDK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFInAppEventType(AFd1wSDK aFd1wSDK, AFh1pSDK aFh1pSDK) {
        Intrinsics.checkNotNullParameter(aFd1wSDK, "");
        Intrinsics.checkNotNullParameter(aFh1pSDK, "");
        if (!aFd1wSDK.AFLogger) {
            try {
                aFd1wSDK.valueOf.values(aFh1pSDK);
            } catch (Exception e) {
                AFLogger.afErrorLog("Listener thrown an exception: ", e, true);
            }
        }
        aFd1wSDK.e = false;
        aFd1wSDK.AFLogger = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFKeystoreWrapper(AFd1wSDK aFd1wSDK) {
        Intrinsics.checkNotNullParameter(aFd1wSDK, "");
        int i = 1;
        aFd1wSDK.e = true;
        try {
            ScheduledExecutorService scheduledExecutorService = aFd1wSDK.AFInAppEventParameterName;
            h hVar = new h(aFd1wSDK, i);
            AFd1uSDK.Companion aFa1zSDK = AFd1uSDK.INSTANCE;
            scheduledExecutorService.schedule(hVar, AFd1uSDK.Companion.valueOf(), TimeUnit.MILLISECONDS);
        } catch (Throwable th10) {
            AFLogger.afErrorLog("Background task failed with a throwable: ", th10);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@NotNull Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        AFc1tSDK aFc1tSDK = this.values;
        Intent intent = activity.getIntent();
        if (((intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) ? null : intent.getData()) != null && intent != aFc1tSDK.AFInAppEventType) {
            aFc1tSDK.AFInAppEventType = intent;
        }
        this.AFKeystoreWrapper.AFInAppEventType(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.AFInAppEventType.execute(new h(this, 0));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.AFInAppEventType.execute(new g(this, new AFh1pSDK(activity, this.AFKeystoreWrapper), 0));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(bundle, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFInAppEventType(AFd1wSDK aFd1wSDK) {
        Intrinsics.checkNotNullParameter(aFd1wSDK, "");
        if (aFd1wSDK.AFLogger && aFd1wSDK.e) {
            aFd1wSDK.AFLogger = false;
            try {
                aFd1wSDK.valueOf.AFKeystoreWrapper();
            } catch (Exception e) {
                AFLogger.afErrorLog("Listener threw exception! ", e);
            }
        }
    }
}
