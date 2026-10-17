package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.appsflyer.AFLogger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0003\u001a\u00020\u0002H%¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u000fX\u0085\u0002¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00128\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013"}, d2 = {"Lcom/appsflyer/internal/AFi1xSDK;", "", "", "values", "()Ljava/lang/String;", "Lcom/appsflyer/internal/AFi1uSDK;", "AFInAppEventType", "()Lcom/appsflyer/internal/AFi1uSDK;", "Landroid/net/NetworkInfo;", "p0", "", "valueOf", "(Landroid/net/NetworkInfo;)Z", "AFInAppEventParameterName", "()Z", "Landroid/net/ConnectivityManager;", "AFKeystoreWrapper", "Landroid/net/ConnectivityManager;", "Landroid/telephony/TelephonyManager;", "Landroid/telephony/TelephonyManager;", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "AFa1vSDK"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class AFi1xSDK {

    /* JADX INFO: renamed from: AFKeystoreWrapper, reason: from kotlin metadata */
    ConnectivityManager valueOf;

    /* JADX INFO: renamed from: values, reason: from kotlin metadata */
    private final TelephonyManager AFInAppEventType;

    public AFi1xSDK(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        Object systemService = context.getSystemService("connectivity");
        this.valueOf = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        Object systemService2 = context.getSystemService("phone");
        this.AFInAppEventType = systemService2 instanceof TelephonyManager ? (TelephonyManager) systemService2 : null;
    }

    public static boolean valueOf(NetworkInfo p0) {
        if (p0 != null) {
            return p0.isConnectedOrConnecting();
        }
        return false;
    }

    public abstract boolean AFInAppEventParameterName();

    @NotNull
    public final AFi1uSDK AFInAppEventType() {
        Throwable th10;
        String str;
        String simOperatorName;
        String networkOperatorName = null;
        try {
            TelephonyManager telephonyManager = this.AFInAppEventType;
            if (telephonyManager != null) {
                simOperatorName = telephonyManager.getSimOperatorName();
                try {
                    networkOperatorName = telephonyManager.getNetworkOperatorName();
                    if (networkOperatorName == null || networkOperatorName.length() == 0) {
                        if (telephonyManager.getPhoneType() == 2) {
                            networkOperatorName = "CDMA";
                        }
                    }
                } catch (Throwable th11) {
                    str = networkOperatorName;
                    networkOperatorName = simOperatorName;
                    th10 = th11;
                    AFLogger.afErrorLog("Exception while collecting network info. ", th10);
                    simOperatorName = networkOperatorName;
                    networkOperatorName = str;
                }
            } else {
                simOperatorName = null;
            }
        } catch (Throwable th12) {
            th10 = th12;
            str = null;
        }
        return new AFi1uSDK(values(), networkOperatorName, simOperatorName, AFInAppEventParameterName());
    }

    @NotNull
    public abstract String values();
}
