package com.appsflyer.internal;

import android.os.Build;
import com.appsflyer.AFKeystoreWrapper;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.security.KeyStoreException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\f\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\f\u0010\u000b"}, d2 = {"Lcom/appsflyer/internal/AFb1hSDK;", "", "Lcom/appsflyer/internal/AFd1nSDK;", "p0", "Lcom/appsflyer/internal/AFd1pSDK;", "p1", "", "AFInAppEventParameterName", "(Lcom/appsflyer/internal/AFd1nSDK;Lcom/appsflyer/internal/AFd1pSDK;)V", "", "AFInAppEventType", "()Ljava/lang/String;", "values", "<init>", "()V"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class AFb1hSDK {

    @NotNull
    public static final AFb1hSDK INSTANCE = new AFb1hSDK();

    private AFb1hSDK() {
    }

    public static final void AFInAppEventParameterName(@NotNull AFd1nSDK p0, @NotNull AFd1pSDK p17) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p17, "");
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        if (AFb1vSDK.valueOf()) {
            AFLogger.afRDLog("OPPO device found");
        }
        int i = Build.VERSION.SDK_INT;
        if (appsFlyerProperties.getBoolean("keyPropDisableAFKeystore", true)) {
            StringBuilder sb6 = new StringBuilder("OS SDK is=");
            sb6.append(i);
            sb6.append("; no KeyStore usage");
            AFLogger.afRDLog(sb6.toString());
            return;
        }
        StringBuilder sb9 = new StringBuilder("OS SDK is=");
        sb9.append(i);
        sb9.append("; use KeyStore");
        AFLogger.afRDLog(sb9.toString());
        AFKeystoreWrapper aFKeystoreWrapper = new AFKeystoreWrapper(p0.AFKeystoreWrapper);
        if (aFKeystoreWrapper.AFInAppEventParameterName()) {
            String strAFInAppEventType = aFKeystoreWrapper.AFInAppEventType();
            synchronized (aFKeystoreWrapper.values) {
                aFKeystoreWrapper.AFInAppEventType++;
                AFLogger.afInfoLog("Deleting key with alias: ".concat(String.valueOf(strAFInAppEventType)));
                try {
                    synchronized (aFKeystoreWrapper.values) {
                        aFKeystoreWrapper.AFInAppEventParameterName.deleteEntry(strAFInAppEventType);
                    }
                } catch (KeyStoreException e) {
                    StringBuilder sb10 = new StringBuilder("Exception ");
                    sb10.append(e.getMessage());
                    sb10.append(" occurred");
                    AFLogger.afErrorLog(sb10.toString(), e);
                }
            }
            aFKeystoreWrapper.valueOf(aFKeystoreWrapper.AFInAppEventType());
        } else {
            aFKeystoreWrapper.valueOf = AFb1jSDK.AFInAppEventType(p0, p17);
            aFKeystoreWrapper.AFInAppEventType = 0;
            aFKeystoreWrapper.valueOf(aFKeystoreWrapper.AFInAppEventType());
        }
        appsFlyerProperties.set("KSAppsFlyerId", aFKeystoreWrapper.valueOf());
        appsFlyerProperties.set("KSAppsFlyerRICounter", String.valueOf(aFKeystoreWrapper.values()));
    }

    public static String AFInAppEventType() {
        return AppsFlyerProperties.getInstance().getString("KSAppsFlyerId");
    }

    public static String values() {
        return AppsFlyerProperties.getInstance().getString("KSAppsFlyerRICounter");
    }
}
