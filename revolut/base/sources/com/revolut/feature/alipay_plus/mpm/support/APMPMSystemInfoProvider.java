package com.revolut.feature.alipay_plus.mpm.support;

import a0.d;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.StatFs;
import android.webkit.WebView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import yhm.m;
import yhm.n;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\u0012"}, d2 = {"Lcom/revolut/feature/alipay_plus/mpm/support/APMPMSystemInfoProvider;", "", "<init>", "()V", "systemInfo", "Lorg/json/JSONObject;", "context", "Landroid/content/Context;", "siteName", "", "webView", "Landroid/webkit/WebView;", "appVersion", "storageDescription", "batteryDescription", "layoutDirection", "statusBarHeight", "", "feature_alipay_plus_nonsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class APMPMSystemInfoProvider {

    @NotNull
    public static final APMPMSystemInfoProvider INSTANCE = new APMPMSystemInfoProvider();

    private APMPMSystemInfoProvider() {
    }

    private final String appVersion(Context context) {
        Object objA;
        PackageInfo packageInfo;
        try {
            m.Companion companion = m.INSTANCE;
            if (Build.VERSION.SDK_INT >= 33) {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
                Intrinsics.h(packageInfo);
            } else {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                Intrinsics.h(packageInfo);
            }
            objA = packageInfo.versionName;
            if (objA == null) {
                objA = "";
            }
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = o.a(th10);
        }
        return (String) (objA instanceof n ? "" : objA);
    }

    private final String batteryDescription(Context context) {
        Object objA;
        try {
            m.Companion companion = m.INSTANCE;
            objA = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = o.a(th10);
        }
        Intent intent = (Intent) (objA instanceof n ? null : objA);
        int intExtra = intent != null ? intent.getIntExtra("level", -1) : -1;
        int intExtra2 = intent != null ? intent.getIntExtra("scale", -1) : -1;
        return (intExtra < 0 || intExtra2 <= 0) ? "" : d.h((int) ((intExtra * 100.0f) / intExtra2), "%");
    }

    private final String layoutDirection(Context context) {
        return context.getResources().getConfiguration().getLayoutDirection() == 1 ? "RTL" : "LTR";
    }

    private final int statusBarHeight(Context context) {
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private final String storageDescription(Context context) {
        Object objA;
        try {
            m.Companion companion = m.INSTANCE;
            StatFs statFs = new StatFs(context.getFilesDir().getAbsolutePath());
            double d = 1024;
            objA = String.format(Locale.US, "%.2f GB", Arrays.copyOf(new Object[]{Double.valueOf((((statFs.getBlockSizeLong() * statFs.getBlockCountLong()) / d) / d) / d)}, 1));
            Intrinsics.checkNotNullExpressionValue(objA, "format(...)");
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = o.a(th10);
        }
        if (objA instanceof n) {
            objA = "";
        }
        return (String) objA;
    }

    @NotNull
    public final JSONObject systemInfo(@NotNull Context context, String siteName, WebView webView) throws JSONException {
        Intrinsics.checkNotNullParameter(context, "context");
        Float fValueOf = Float.valueOf(context.getResources().getDisplayMetrics().density);
        if (fValueOf.floatValue() <= BitmapDescriptorFactory.HUE_RED) {
            fValueOf = null;
        }
        float fFloatValue = fValueOf != null ? fValueOf.floatValue() : 1.0f;
        if (siteName == null) {
            siteName = "";
        }
        JSONObject jSONObjectPut = new JSONObject().put("platform", "Android").put("system", "Android " + Build.VERSION.RELEASE).put("version", appVersion(context));
        String str = Build.MODEL;
        if (str == null) {
            str = "";
        }
        JSONObject jSONObjectPut2 = jSONObjectPut.put("model", str);
        String str2 = Build.BRAND;
        JSONObject jSONObjectPut3 = jSONObjectPut2.put("brand", str2 != null ? str2 : "").put("language", Locale.getDefault().toLanguageTag()).put("pixelRatio", Float.valueOf(fFloatValue)).put("screenWidth", (int) (r0.widthPixels / fFloatValue)).put("screenHeight", (int) (r0.heightPixels / fFloatValue)).put("windowWidth", Float.valueOf((webView != null ? webView.getWidth() : r0.widthPixels) / fFloatValue)).put("windowHeight", Float.valueOf((webView != null ? webView.getHeight() : r0.heightPixels) / fFloatValue)).put("storage", storageDescription(context)).put("fontSizeSetting", Float.valueOf(context.getResources().getConfiguration().fontScale * 16.0f)).put("app", siteName).put("layoutDirection", layoutDirection(context)).put("currentBattery", batteryDescription(context)).put("titleBarHeight", 52).put("statusBarHeight", statusBarHeight(context)).put("siteName", siteName);
        Intrinsics.checkNotNullExpressionValue(jSONObjectPut3, "put(...)");
        return jSONObjectPut3;
    }
}
