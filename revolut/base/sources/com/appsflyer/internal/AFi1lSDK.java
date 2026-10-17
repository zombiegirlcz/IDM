package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFi1bSDK;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public class AFi1lSDK extends AFi1oSDK {

    @NonNull
    private final ExecutorService registerClient;
    public final Map<String, Object> values;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFi1lSDK$5, reason: invalid class name */
    public class AnonymousClass5 implements InstallReferrerStateListener {
        final /* synthetic */ Context val$context;
        final /* synthetic */ InstallReferrerClient val$referrerClient;

        public AnonymousClass5(InstallReferrerClient installReferrerClient, Context context) {
            this.val$referrerClient = installReferrerClient;
            this.val$context = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onInstallReferrerSetupFinished$0(InstallReferrerClient installReferrerClient, Context context, int i) {
            AFi1lSDK.this.AFInAppEventParameterName(installReferrerClient, context, i);
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public final void onInstallReferrerServiceDisconnected() {
            AFLogger.INSTANCE.d(AFg1bSDK.REFERRER, "Install Referrer service disconnected");
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public final void onInstallReferrerSetupFinished(final int i) {
            ExecutorService executorService = AFi1lSDK.this.registerClient;
            final InstallReferrerClient installReferrerClient = this.val$referrerClient;
            final Context context = this.val$context;
            executorService.execute(new Runnable() { // from class: com.appsflyer.internal.n
                @Override // java.lang.Runnable
                public final void run() {
                    this.f26058a.lambda$onInstallReferrerSetupFinished$0(installReferrerClient, context, i);
                }
            });
        }
    }

    public AFi1lSDK(@NonNull Runnable runnable, @NonNull ExecutorService executorService, @NonNull AFd1sSDK aFd1sSDK) {
        super("store", "google", aFd1sSDK, runnable);
        this.values = new HashMap();
        this.registerClient = executorService;
    }

    public final void AFInAppEventParameterName(InstallReferrerClient installReferrerClient, Context context, int i) {
        this.values.put("code", String.valueOf(i));
        this.valueOf.put("api_ver", Long.valueOf(AFb1vSDK.AFKeystoreWrapper(context, "com.android.vending")));
        this.valueOf.put("api_ver_name", AFb1vSDK.values(context, "com.android.vending"));
        if (i == -1) {
            AFLogger.INSTANCE.w(AFg1bSDK.REFERRER, "InstallReferrer SERVICE_DISCONNECTED");
            this.valueOf.put("response", "SERVICE_DISCONNECTED");
        } else if (i == 0) {
            this.valueOf.put("response", "OK");
            try {
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFg1bSDK aFg1bSDK = AFg1bSDK.REFERRER;
                aFLogger.d(aFg1bSDK, "InstallReferrer connected");
                if (installReferrerClient.isReady()) {
                    ReferrerDetails installReferrer = installReferrerClient.getInstallReferrer();
                    String installReferrer2 = installReferrer.getInstallReferrer();
                    if (installReferrer2 != null) {
                        this.values.put("val", installReferrer2);
                        this.valueOf.put("referrer", installReferrer2);
                    }
                    long referrerClickTimestampSeconds = installReferrer.getReferrerClickTimestampSeconds();
                    this.values.put("clk", Long.toString(referrerClickTimestampSeconds));
                    this.valueOf.put("click_ts", Long.valueOf(referrerClickTimestampSeconds));
                    long installBeginTimestampSeconds = installReferrer.getInstallBeginTimestampSeconds();
                    this.values.put("install", Long.toString(installBeginTimestampSeconds));
                    this.valueOf.put("install_begin_ts", Long.valueOf(installBeginTimestampSeconds));
                    HashMap map = new HashMap();
                    try {
                        boolean googlePlayInstantParam = installReferrer.getGooglePlayInstantParam();
                        this.values.put("instant", Boolean.valueOf(googlePlayInstantParam));
                        map.put("instant", Boolean.valueOf(googlePlayInstantParam));
                    } catch (NoSuchMethodError e) {
                        AFLogger.afErrorLogForExcManagerOnly("getGooglePlayInstantParam not exist", e);
                    }
                    try {
                        map.put("click_server_ts", Long.valueOf(installReferrer.getReferrerClickTimestampServerSeconds()));
                        map.put("install_begin_server_ts", Long.valueOf(installReferrer.getInstallBeginTimestampServerSeconds()));
                        map.put("install_version", installReferrer.getInstallVersion());
                    } catch (NoSuchMethodError e2) {
                        AFLogger.INSTANCE.e(AFg1bSDK.REFERRER, "some method not exist", e2, false, false);
                    }
                    if (!map.isEmpty()) {
                        this.valueOf.put("google_custom", map);
                    }
                    installReferrerClient.endConnection();
                } else {
                    aFLogger.w(aFg1bSDK, "ReferrerClient: InstallReferrer is not ready");
                    this.values.put("err", "ReferrerClient: InstallReferrer is not ready");
                }
            } catch (Throwable th10) {
                AFLogger aFLogger2 = AFLogger.INSTANCE;
                AFg1bSDK aFg1bSDK2 = AFg1bSDK.REFERRER;
                StringBuilder sb6 = new StringBuilder("Failed to get install referrer: ");
                sb6.append(th10.getMessage());
                aFLogger2.w(aFg1bSDK2, sb6.toString());
                this.values.put("err", th10.getMessage());
                aFLogger2.e(aFg1bSDK2, "Failed to get install referrer", th10, false, false);
            }
        } else if (i == 1) {
            this.valueOf.put("response", "SERVICE_UNAVAILABLE");
            AFLogger.INSTANCE.w(AFg1bSDK.REFERRER, "InstallReferrer not supported");
        } else if (i == 2) {
            AFLogger.INSTANCE.w(AFg1bSDK.REFERRER, "InstallReferrer FEATURE_NOT_SUPPORTED");
            this.valueOf.put("response", "FEATURE_NOT_SUPPORTED");
        } else if (i != 3) {
            AFLogger.INSTANCE.w(AFg1bSDK.REFERRER, "responseCode not found.");
        } else {
            AFLogger.INSTANCE.w(AFg1bSDK.REFERRER, "InstallReferrer DEVELOPER_ERROR");
            this.valueOf.put("response", "DEVELOPER_ERROR");
        }
        AFLogger.INSTANCE.d(AFg1bSDK.REFERRER, "Install Referrer collected locally");
        AFInAppEventType();
    }

    @Override // com.appsflyer.internal.AFi1bSDK
    public final void values(Context context) {
        if (AFKeystoreWrapper(context)) {
            this.AFLogger = System.currentTimeMillis();
            this.AFInAppEventType = AFi1bSDK.AFa1uSDK.STARTED;
            addObserver(new AFi1bSDK.AnonymousClass4());
            try {
                InstallReferrerClient installReferrerClientBuild = InstallReferrerClient.newBuilder(context).build();
                AFLogger.INSTANCE.d(AFg1bSDK.REFERRER, "Connecting to Install Referrer Library...");
                installReferrerClientBuild.startConnection(new AnonymousClass5(installReferrerClientBuild, context));
            } catch (Throwable th10) {
                AFLogger.INSTANCE.e(AFg1bSDK.REFERRER, "referrerClient -> startConnection", th10);
            }
        }
    }

    private boolean AFKeystoreWrapper(@NonNull Context context) {
        if (!AFKeystoreWrapper()) {
            return false;
        }
        try {
            if (AFb1vSDK.AFInAppEventType(context, "com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE")) {
                AFLogger.INSTANCE.d(AFg1bSDK.REFERRER, "Install referrer is allowed");
                return true;
            }
            AFLogger.INSTANCE.d(AFg1bSDK.REFERRER, "Install referrer is not allowed");
            return false;
        } catch (ClassNotFoundException e) {
            AFLogger.afErrorLogForExcManagerOnly("InstallReferrerClient not found", e);
            AFLogger.INSTANCE.v(AFg1bSDK.REFERRER, "Class com.android.installreferrer.api.InstallReferrerClient not found");
            return false;
        } catch (Throwable th10) {
            AFLogger.INSTANCE.e(AFg1bSDK.REFERRER, "An error occurred while trying to verify manifest : ".concat("com.android.installreferrer.api.InstallReferrerClient"), th10);
            return false;
        }
    }
}
