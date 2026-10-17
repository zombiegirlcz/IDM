package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.text.SimpleDateFormat;
import java.util.Locale;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1cSDK extends AFf1gSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int afDebugLog = 1;
    private static char[] afErrorLog = {23026, 40071, 54075, 2513, 19552};
    private static long afRDLog = 3502435465110685848L;
    private static int afWarnLog;
    private final AFg1mSDK afVerboseLog;
    private final AFd1sSDK i;
    private final AFd1nSDK v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final String f26021w;

    public AFf1cSDK(@NonNull String str, @NonNull AFd1fSDK aFd1fSDK) {
        super(new AFg1kSDK(aFd1fSDK.afInfoLog().AFKeystoreWrapper), aFd1fSDK, str);
        this.i = aFd1fSDK.valueOf();
        this.v = aFd1fSDK.afInfoLog();
        this.f26021w = str;
        this.afVerboseLog = aFd1fSDK.AFLogger();
    }

    private static void a(int i, int i2, char c2, Object[] objArr) {
        AFj1gSDK aFj1gSDK = new AFj1gSDK();
        long[] jArr = new long[i2];
        aFj1gSDK.valueOf = 0;
        $10 = ($11 + 11) % 128;
        while (true) {
            int i3 = aFj1gSDK.valueOf;
            if (i3 >= i2) {
                break;
            }
            $10 = ($11 + 35) % 128;
            jArr[i3] = (((long) ((char) (((long) afErrorLog[i + i3]) ^ 3814697783794912765L))) ^ (((long) i3) * (3814697783794912765L ^ afRDLog))) ^ ((long) c2);
            aFj1gSDK.valueOf = i3 + 1;
        }
        char[] cArr = new char[i2];
        aFj1gSDK.valueOf = 0;
        while (true) {
            int i5 = aFj1gSDK.valueOf;
            if (i5 >= i2) {
                objArr[0] = new String(cArr);
                return;
            } else {
                cArr[i5] = (char) jArr[i5];
                aFj1gSDK.valueOf = i5 + 1;
            }
        }
    }

    private void v() {
        afDebugLog = (afWarnLog + 25) % 128;
        this.afInfoLog.AFKeystoreWrapper("sentRegisterRequestToAF", true);
        AFLogger.afDebugLog("[register] Successfully registered for Uninstall Tracking");
        afDebugLog = (afWarnLog + 53) % 128;
    }

    @Override // com.appsflyer.internal.AFf1gSDK
    public final void AFInAppEventParameterName(AFa1pSDK aFa1pSDK) {
        afDebugLog = (afWarnLog + 73) % 128;
    }

    @Override // com.appsflyer.internal.AFf1gSDK
    public final void AFInAppEventType(AFa1pSDK aFa1pSDK) {
        afDebugLog = (afWarnLog + 29) % 128;
    }

    @Override // com.appsflyer.internal.AFf1gSDK
    public final void AFKeystoreWrapper(AFa1pSDK aFa1pSDK) {
        int i = afWarnLog + 45;
        afDebugLog = i % 128;
        if (i % 2 == 0) {
            super.AFKeystoreWrapper(aFa1pSDK);
            Context context = this.v.AFKeystoreWrapper;
            AFb1rSDK.AFInAppEventParameterName();
            throw null;
        }
        super.AFKeystoreWrapper(aFa1pSDK);
        Context context2 = this.v.AFKeystoreWrapper;
        AFb1rSDK aFb1rSDKAFInAppEventParameterName = AFb1rSDK.AFInAppEventParameterName();
        if (context2 == null) {
            throw new IllegalStateException("Context is not provided, can't send register request");
        }
        if (aFb1rSDKAFInAppEventParameterName.valueOf()) {
            AFLogger.afInfoLog("CustomerUserId not set, Tracking is disabled", true);
            throw new IllegalStateException("CustomerUserId not set, register is not sent");
        }
        PackageManager packageManager = context2.getPackageManager();
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(context2.getPackageName(), 0);
            aFa1pSDK.values("app_version_code", Integer.toString(packageInfo.versionCode));
            aFa1pSDK.values("app_version_name", packageInfo.versionName);
            aFa1pSDK.values("app_name", packageManager.getApplicationLabel(packageInfo.applicationInfo).toString());
            aFa1pSDK.values("installDate", AFb1rSDK.AFInAppEventType(new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US), packageInfo.firstInstallTime));
        } catch (Throwable th10) {
            AFLogger.afErrorLog("Exception while collecting application version info.", th10);
        }
        this.afVerboseLog.AFInAppEventParameterName(aFa1pSDK.AFInAppEventType());
        aFa1pSDK.AFInAppEventType().remove("ivc");
        String strValues = AFb1rSDK.values();
        if (strValues != null) {
            afDebugLog = (afWarnLog + 23) % 128;
            aFa1pSDK.values("appUserId", strValues);
        }
        try {
            aFa1pSDK.values("model", Build.MODEL);
            Object[] objArr = new Object[1];
            a((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 5, (char) (37997 - TextUtils.getOffsetAfter("", 0)), objArr);
            aFa1pSDK.values(((String) objArr[0]).intern(), Build.BRAND);
        } catch (Throwable th11) {
            AFLogger.afErrorLog("Exception while collecting device brand and model.", th11);
        }
        if (AppsFlyerProperties.getInstance().getBoolean("deviceTrackingDisabled", false)) {
            aFa1pSDK.values("deviceTrackingDisabled", "true");
        }
        AFa1cSDK aFa1cSDKAFInAppEventType = AFb1uSDK.AFInAppEventType(context2.getContentResolver());
        if (aFa1cSDKAFInAppEventType != null) {
            afDebugLog = (afWarnLog + LDSFile.EF_SOD_TAG) % 128;
            aFa1pSDK.values("amazon_aid", aFa1cSDKAFInAppEventType.valueOf);
            aFa1pSDK.values("amazon_aid_limit", String.valueOf(aFa1cSDKAFInAppEventType.values));
        }
        aFa1pSDK.values("devkey", ((AFf1qSDK) this).unregisterClient.AFLogger);
        aFa1pSDK.values("uid", AFb1jSDK.AFInAppEventType(this.v, this.afInfoLog));
        aFa1pSDK.values("af_gcm_token", this.f26021w);
        aFa1pSDK.values("launch_counter", Integer.toString(this.afInfoLog.valueOf("appsFlyerCount", 0)));
        aFa1pSDK.values("sdk", Integer.toString(Build.VERSION.SDK_INT));
        String strAFLogger = this.i.AFLogger();
        if (strAFLogger != null) {
            aFa1pSDK.values("channel", strAFLogger);
        }
    }

    @Override // com.appsflyer.internal.AFf1gSDK, com.appsflyer.internal.AFf1qSDK
    public final boolean force() {
        int i = afWarnLog + 75;
        int i2 = i % 128;
        afDebugLog = i2;
        boolean z = i % 2 == 0;
        int i3 = i2 + 9;
        afWarnLog = i3 % 128;
        if (i3 % 2 == 0) {
            return z;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFf1gSDK
    public final void valueOf(AFa1pSDK aFa1pSDK) {
        int i = afWarnLog + 55;
        afDebugLog = i % 128;
        if (i % 2 == 0) {
            this.i.AFInAppEventType();
            throw null;
        }
        String strAFInAppEventType = this.i.AFInAppEventType();
        if (strAFInAppEventType != null) {
            aFa1pSDK.values("advertiserId", strAFInAppEventType);
        }
        int i2 = afDebugLog + LDSFile.EF_DG2_TAG;
        afWarnLog = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFf1gSDK
    public final void values(AFa1pSDK aFa1pSDK) {
        int i = afDebugLog + 19;
        afWarnLog = i % 128;
        if (i % 2 != 0) {
            int i2 = 62 / 0;
        }
    }

    @Override // com.appsflyer.internal.AFf1qSDK, com.appsflyer.internal.AFf1xSDK
    public final void AFInAppEventType() {
        super.AFInAppEventType();
        ResponseNetwork responseNetwork = ((AFf1qSDK) this).d;
        if (responseNetwork != null) {
            afDebugLog = (afWarnLog + 89) % 128;
            if (responseNetwork.isSuccessful()) {
                v();
                afDebugLog = (afWarnLog + 27) % 128;
            }
        }
    }
}
