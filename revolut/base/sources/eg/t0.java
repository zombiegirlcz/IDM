package eg;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import com.google.android.gms.common.util.ProcessUtils;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t0 f125493a = new t0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final wif.a f125494b;

    static {
        xe.d dVar = new xe.d();
        dVar.registerEncoder(s0.class, g.f125433a);
        dVar.registerEncoder(d1.class, h.f125438a);
        dVar.registerEncoder(k.class, e.f125423a);
        dVar.registerEncoder(b.class, d.f125413a);
        dVar.registerEncoder(a.class, c.f125406a);
        dVar.registerEncoder(f0.class, f.f125427a);
        dVar.d = true;
        wif.a aVar = new wif.a(dVar);
        Intrinsics.checkNotNullExpressionValue(aVar, "JsonDataEncoderBuilder()…lues(true)\n      .build()");
        f125494b = aVar;
    }

    public static b a(pd.g firebaseApp) throws PackageManager.NameNotFoundException {
        Object next;
        String processName;
        Intrinsics.checkNotNullParameter(firebaseApp, "firebaseApp");
        firebaseApp.a();
        Context context = firebaseApp.f235023a;
        Intrinsics.checkNotNullExpressionValue(context, "firebaseApp.applicationContext");
        String packageName = context.getPackageName();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String strValueOf = String.valueOf(packageInfo.getLongVersionCode());
        firebaseApp.a();
        String str = firebaseApp.f235025c.f235031b;
        Intrinsics.checkNotNullExpressionValue(str, "firebaseApp.options.applicationId");
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        String RELEASE = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
        e0 e0Var = e0.LOG_ENVIRONMENT_PROD;
        Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
        String str2 = packageInfo.versionName;
        if (str2 == null) {
            str2 = strValueOf;
        }
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
        firebaseApp.a();
        Intrinsics.checkNotNullExpressionValue(context, "firebaseApp.applicationContext");
        Intrinsics.checkNotNullParameter(context, "context");
        int iMyPid = Process.myPid();
        Iterator it8 = com.bumptech.glide.c.j(context).iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((f0) next).f125431b == iMyPid) {
                break;
            }
        }
        f0 f0Var = (f0) next;
        if (f0Var == null) {
            if (Build.VERSION.SDK_INT > 33) {
                processName = Process.myProcessName();
                Intrinsics.checkNotNullExpressionValue(processName, "myProcessName()");
            } else {
                processName = Application.getProcessName();
                if (processName == null && (processName = ProcessUtils.getMyProcessName()) == null) {
                    processName = "";
                }
            }
            f0Var = new f0(processName, iMyPid, 0, false);
        }
        firebaseApp.a();
        Intrinsics.checkNotNullExpressionValue(context, "firebaseApp.applicationContext");
        return new b(str, e0Var, new a(packageName, str2, strValueOf, f0Var, com.bumptech.glide.c.j(context)));
    }
}
