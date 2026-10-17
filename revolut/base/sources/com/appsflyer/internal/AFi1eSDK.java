package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFi1bSDK;
import com.miui.referrer.api.GetAppsReferrerClient;
import com.miui.referrer.api.GetAppsReferrerDetails;
import com.miui.referrer.api.GetAppsReferrerStateListener;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class AFi1eSDK extends AFi1oSDK {
    public AFi1eSDK(AFd1sSDK aFd1sSDK, Runnable runnable) {
        super("store", "xiaomi", aFd1sSDK, runnable);
    }

    private boolean AFInAppEventParameterName() {
        if (!AFKeystoreWrapper()) {
            return false;
        }
        try {
            Class.forName("com.miui.referrer.api.GetAppsReferrerClient");
            AFLogger.INSTANCE.d(AFg1bSDK.REFERRER, "Xiaomi Install Referrer is allowed");
            return true;
        } catch (ClassNotFoundException unused) {
            AFLogger.INSTANCE.v(AFg1bSDK.REFERRER, "Class com.miui.referrer.api.GetAppsReferrerClient not found");
            return false;
        } catch (Throwable th10) {
            AFLogger.INSTANCE.e(AFg1bSDK.REFERRER, "An error occurred while trying to access GetAppsReferrerClient", th10);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFi1bSDK
    public final void values(final Context context) {
        if (AFInAppEventParameterName()) {
            this.AFLogger = System.currentTimeMillis();
            this.AFInAppEventType = AFi1bSDK.AFa1uSDK.STARTED;
            addObserver(new AFi1bSDK.AnonymousClass4());
            final GetAppsReferrerClient getAppsReferrerClientBuild = GetAppsReferrerClient.Companion.newBuilder(context).build();
            getAppsReferrerClientBuild.startConnection(new GetAppsReferrerStateListener() { // from class: com.appsflyer.internal.AFi1eSDK.2
                public final void onGetAppsReferrerSetupFinished(int i) {
                    AFi1eSDK.this.valueOf.put("api_ver", Long.valueOf(AFb1vSDK.AFKeystoreWrapper(context, "com.xiaomi.mipicks")));
                    AFi1eSDK.this.valueOf.put("api_ver_name", AFb1vSDK.values(context, "com.xiaomi.mipicks"));
                    if (i == -1) {
                        AFLogger.INSTANCE.w(AFg1bSDK.REFERRER, "XiaomiInstallReferrer SERVICE_DISCONNECTED");
                        AFi1eSDK.this.valueOf.put("response", "SERVICE_DISCONNECTED");
                    } else if (i == 0) {
                        AFi1eSDK aFi1eSDK = AFi1eSDK.this;
                        GetAppsReferrerClient getAppsReferrerClient = getAppsReferrerClientBuild;
                        aFi1eSDK.valueOf.put("response", "OK");
                        try {
                            AFLogger aFLogger = AFLogger.INSTANCE;
                            AFg1bSDK aFg1bSDK = AFg1bSDK.REFERRER;
                            aFLogger.d(aFg1bSDK, "XiaomiInstallReferrer connected");
                            if (getAppsReferrerClient.isReady()) {
                                GetAppsReferrerDetails installReferrer = getAppsReferrerClient.getInstallReferrer();
                                String installReferrer2 = installReferrer.getInstallReferrer();
                                if (installReferrer2 != null) {
                                    aFi1eSDK.valueOf.put("referrer", installReferrer2);
                                }
                                aFi1eSDK.valueOf.put("click_ts", Long.valueOf(installReferrer.getReferrerClickTimestampSeconds()));
                                aFi1eSDK.valueOf.put("install_begin_ts", Long.valueOf(installReferrer.getInstallBeginTimestampSeconds()));
                                HashMap map = new HashMap();
                                map.put("click_server_ts", Long.valueOf(installReferrer.getReferrerClickTimestampServerSeconds()));
                                map.put("install_begin_server_ts", Long.valueOf(installReferrer.getInstallBeginTimestampServerSeconds()));
                                map.put("install_version", installReferrer.getInstallVersion());
                                aFi1eSDK.valueOf.put("xiaomi_custom", map);
                            } else {
                                aFLogger.w(aFg1bSDK, "XiaomiReferrerClient: XiaomiInstallReferrer is not ready");
                            }
                        } catch (Throwable th10) {
                            AFLogger aFLogger2 = AFLogger.INSTANCE;
                            AFg1bSDK aFg1bSDK2 = AFg1bSDK.REFERRER;
                            StringBuilder sb6 = new StringBuilder("Failed to get Xiaomi install referrer: ");
                            sb6.append(th10.getMessage());
                            aFLogger2.w(aFg1bSDK2, sb6.toString());
                        }
                    } else if (i == 1) {
                        AFi1eSDK.this.valueOf.put("response", "SERVICE_UNAVAILABLE");
                        AFLogger.INSTANCE.w(AFg1bSDK.REFERRER, "XiaomiInstallReferrer not supported");
                    } else if (i == 2) {
                        AFLogger.INSTANCE.w(AFg1bSDK.REFERRER, "XiaomiInstallReferrer FEATURE_NOT_SUPPORTED");
                        AFi1eSDK.this.valueOf.put("response", "FEATURE_NOT_SUPPORTED");
                    } else if (i == 3) {
                        AFLogger.INSTANCE.w(AFg1bSDK.REFERRER, "XiaomiInstallReferrer DEVELOPER_ERROR");
                        AFi1eSDK.this.valueOf.put("response", "DEVELOPER_ERROR");
                    } else if (i != 4) {
                        AFLogger.INSTANCE.w(AFg1bSDK.REFERRER, "responseCode not found.");
                    } else {
                        AFLogger.INSTANCE.w(AFg1bSDK.REFERRER, "XiaomiInstallReferrer DEVELOPER_ERROR");
                        AFi1eSDK.this.valueOf.put("response", "PERMISSION_ERROR");
                    }
                    AFLogger.INSTANCE.d(AFg1bSDK.REFERRER, "Xiaomi Install Referrer collected locally");
                    AFi1eSDK.this.AFInAppEventType();
                    getAppsReferrerClientBuild.endConnection();
                }

                public final void onGetAppsServiceDisconnected() {
                }
            });
        }
    }
}
