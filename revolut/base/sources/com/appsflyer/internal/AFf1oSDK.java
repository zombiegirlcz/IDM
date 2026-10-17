package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;

/* JADX INFO: loaded from: classes16.dex */
public final class AFf1oSDK extends AFf1qSDK<String> {

    @NonNull
    private final String AFLogger;
    private final AFj1nSDK force;
    private final AFd1sSDK v;

    public AFf1oSDK(@NonNull AFd1fSDK aFd1fSDK, @NonNull String str, AFj1nSDK aFj1nSDK) {
        super(AFf1ySDK.IMPRESSIONS, new AFf1ySDK[]{AFf1ySDK.RC_CDN, AFf1ySDK.FETCH_ADVERTISING_ID}, aFd1fSDK, str);
        this.AFLogger = str;
        this.force = aFj1nSDK;
        this.v = aFd1fSDK.valueOf();
    }

    @Override // com.appsflyer.internal.AFf1qSDK, com.appsflyer.internal.AFf1xSDK
    public final void AFInAppEventType() {
        super.AFInAppEventType();
        AFe1jSDK<Result> aFe1jSDK = ((AFf1qSDK) this).d;
        if (aFe1jSDK != 0) {
            int statusCode = aFe1jSDK.getStatusCode();
            if (statusCode == 200) {
                StringBuilder sb6 = new StringBuilder("Cross promotion impressions success: ");
                sb6.append(this.AFLogger);
                AFLogger.afInfoLog(sb6.toString(), false);
                return;
            }
            if (statusCode != 301 && statusCode != 302) {
                StringBuilder sb9 = new StringBuilder("call to ");
                sb9.append(this.AFLogger);
                sb9.append(" failed: ");
                sb9.append(statusCode);
                AFLogger.afInfoLog(sb9.toString());
                return;
            }
            StringBuilder sb10 = new StringBuilder("Cross promotion redirection success: ");
            sb10.append(this.AFLogger);
            AFLogger.afInfoLog(sb10.toString(), false);
            String strAFInAppEventParameterName = aFe1jSDK.AFInAppEventParameterName("Location");
            AFj1nSDK aFj1nSDK = this.force;
            if (aFj1nSDK == null || strAFInAppEventParameterName == null) {
                return;
            }
            aFj1nSDK.AFInAppEventParameterName = strAFInAppEventParameterName;
            Context context = aFj1nSDK.AFInAppEventType.get();
            if (context != null) {
                try {
                    if (aFj1nSDK.AFInAppEventParameterName != null) {
                        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(aFj1nSDK.AFInAppEventParameterName)).setFlags(268435456));
                    }
                } catch (Exception e) {
                    AFLogger.afErrorLog("Failed to open cross promotion url, does OS have browser installed?".concat(String.valueOf(e)), e);
                }
            }
        }
    }

    @Override // com.appsflyer.internal.AFf1qSDK
    public final AFe1uSDK<String> AFKeystoreWrapper(@NonNull String str) {
        AFe1rSDK aFe1rSDK = this.e;
        String strAFInAppEventType = this.v.AFInAppEventType();
        return aFe1rSDK.AFKeystoreWrapper(AFc1vSDK.valueOf(strAFInAppEventType) ? this.AFLogger : Uri.parse(this.AFLogger).buildUpon().appendQueryParameter("advertising_id", strAFInAppEventType).build().toString());
    }

    @Override // com.appsflyer.internal.AFf1qSDK
    public final AppsFlyerRequestListener e() {
        return null;
    }

    @Override // com.appsflyer.internal.AFf1qSDK
    public final boolean force() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1qSDK, com.appsflyer.internal.AFf1xSDK
    public final boolean values() {
        return false;
    }
}
