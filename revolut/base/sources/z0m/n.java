package z0m;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.Looper;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import java.util.Locale;
import java.util.MissingResourceException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class n extends kotlin.jvm.internal.u implements Function0 {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ o f318649h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(o oVar, int i) {
        super(0);
        this.f = i;
        this.f318649h = oVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ActivityManager activityManager;
        int i = this.f;
        o oVar = this.f318649h;
        switch (i) {
            case 0:
                a1m.b bVar = oVar.f318652c;
                Context context = oVar.f;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                Object systemService = context.getSystemService("activity");
                activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                if (activityManager != null) {
                    activityManager.getMemoryInfo(memoryInfo);
                }
                return Long.valueOf(memoryInfo.availMem);
            case 1:
                oVar.f318652c.getClass();
                return Long.valueOf(new StatFs(Environment.getDataDirectory().getPath()).getFreeBytes());
            case 2:
                a1m.b bVar2 = oVar.f318652c;
                Context context2 = oVar.f;
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(context2, "context");
                return Boolean.valueOf(context2.getResources().getConfiguration().orientation == 1);
            case 3:
                oVar.f318652c.getClass();
                try {
                    return Locale.getDefault().getISO3Language();
                } catch (MissingResourceException unused) {
                    return null;
                }
            case 4:
                a1m.b bVar3 = oVar.f318652c;
                Context context3 = oVar.f;
                bVar3.getClass();
                Intrinsics.checkNotNullParameter(context3, "context");
                if (!Intrinsics.f(Looper.myLooper(), Looper.getMainLooper())) {
                    try {
                        a1m.a aVar = a1m.b.Companion;
                        Object objB = a1m.a.b(aVar, "com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", new Class[]{Context.class}, context3);
                        Object objA = objB != null ? a1m.a.a(aVar, objB, "isLimitAdTrackingEnabled", new Object[0]) : null;
                        if (Intrinsics.f(objA instanceof Boolean ? (Boolean) objA : null, Boolean.TRUE)) {
                            return "";
                        }
                        Object objA2 = objB != null ? a1m.a.a(aVar, objB, "getId", new Object[0]) : null;
                        if (objA2 instanceof String) {
                            return (String) objA2;
                        }
                    } catch (Exception e) {
                        c1m.j.Companion.getClass();
                        Intrinsics.checkNotNullExpressionValue("j", "TrackerConfiguration.TAG");
                        j.b("j", "Exception getting the Advertising ID: %s", e.toString());
                    }
                }
                return null;
            case 5:
                oVar.f318652c.getClass();
                return "android";
            case 6:
                oVar.f318652c.getClass();
                String RELEASE = Build.VERSION.RELEASE;
                Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
                return RELEASE;
            case 7:
                oVar.f318652c.getClass();
                String MODEL = Build.MODEL;
                Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                return MODEL;
            case 8:
                oVar.f318652c.getClass();
                String MANUFACTURER = Build.MANUFACTURER;
                Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
                return MANUFACTURER;
            case 9:
                a1m.b bVar4 = oVar.f318652c;
                Context context4 = oVar.f;
                bVar4.getClass();
                Intrinsics.checkNotNullParameter(context4, "context");
                Object systemService2 = context4.getSystemService("phone");
                TelephonyManager telephonyManager = systemService2 instanceof TelephonyManager ? (TelephonyManager) systemService2 : null;
                String networkOperatorName = telephonyManager != null ? telephonyManager.getNetworkOperatorName() : null;
                if (Intrinsics.f(networkOperatorName, "")) {
                    return null;
                }
                return networkOperatorName;
            case 10:
                a1m.b bVar5 = oVar.f318652c;
                Context context5 = oVar.f;
                bVar5.getClass();
                Intrinsics.checkNotNullParameter(context5, "context");
                Object systemService3 = context5.getSystemService("activity");
                activityManager = systemService3 instanceof ActivityManager ? (ActivityManager) systemService3 : null;
                ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
                if (activityManager != null) {
                    activityManager.getMemoryInfo(memoryInfo2);
                }
                return Long.valueOf(memoryInfo2.totalMem);
            case 11:
                oVar.f318652c.getClass();
                return Long.valueOf(new StatFs(Environment.getDataDirectory().getPath()).getTotalBytes());
            case 12:
                a1m.b bVar6 = oVar.f318652c;
                Context context6 = oVar.f;
                bVar6.getClass();
                Intrinsics.checkNotNullParameter(context6, "context");
                int i2 = context6.getResources().getDisplayMetrics().widthPixels;
                int i3 = context6.getResources().getDisplayMetrics().heightPixels;
                StringBuilder sb6 = new StringBuilder();
                sb6.append(i2);
                sb6.append('x');
                sb6.append(i3);
                return sb6.toString();
            default:
                a1m.b bVar7 = oVar.f318652c;
                Context context7 = oVar.f;
                bVar7.getClass();
                Intrinsics.checkNotNullParameter(context7, "context");
                return Float.valueOf(context7.getResources().getDisplayMetrics().density);
        }
    }
}
