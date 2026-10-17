package z0m;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Looper;
import android.util.Pair;
import com.google.android.gms.tasks.Task;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.f0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class o {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f318650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f318651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a1m.b f318652c;
    public final List d;
    public final i1m.d e;
    public final Context f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f318653g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f318654h;
    public long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f318655j;

    public o(List list, i1m.d retriever, Context context) {
        a1m.b deviceInfoMonitor = new a1m.b();
        Intrinsics.checkNotNullParameter(deviceInfoMonitor, "deviceInfoMonitor");
        Intrinsics.checkNotNullParameter(retriever, "retriever");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f318650a = 1000L;
        this.f318651b = 10000L;
        this.f318652c = deviceInfoMonitor;
        this.d = list;
        this.e = retriever;
        this.f = context;
        this.f318653g = new HashMap();
    }

    public final void a() {
        NetworkInfo activeNetworkInfo;
        this.f318655j = System.currentTimeMillis();
        boolean zD = d(c1m.f.NETWORK_TYPE);
        boolean zD2 = d(c1m.f.NETWORK_TECHNOLOGY);
        if (zD || zD2) {
            this.f318652c.getClass();
            Context context = this.f;
            Intrinsics.checkNotNullParameter(context, "context");
            Object systemService = context.getSystemService("connectivity");
            NetworkInfo networkInfo = null;
            ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
            if (connectivityManager != null) {
                try {
                    activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                } catch (SecurityException e) {
                    c1m.j.Companion.getClass();
                    Intrinsics.checkNotNullExpressionValue("j", "TrackerConfiguration.TAG");
                    j.b("j", "Security exception getting NetworkInfo: %s", e.toString());
                }
            } else {
                activeNetworkInfo = null;
            }
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isConnected()) {
                    networkInfo = activeNetworkInfo;
                }
            }
            HashMap map = this.f318653g;
            i1m.d dVar = this.e;
            if (zD) {
                dVar.getClass();
                a1m.e.d("networkType", new m(this, networkInfo, 0).invoke(), map);
            }
            if (zD2) {
                dVar.getClass();
                a1m.e.d("networkTechnology", new m(this, networkInfo, 1).invoke(), map);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z0m.o.b():void");
    }

    public final void c() {
        Object objA;
        Object objA2;
        Object objA3;
        this.e.getClass();
        new n(this, 5).invoke();
        HashMap map = this.f318653g;
        a1m.e.d("osType", "android", map);
        new n(this, 6).invoke();
        a1m.e.d("osVersion", Build.VERSION.RELEASE, map);
        new n(this, 7).invoke();
        a1m.e.d("deviceModel", Build.MODEL, map);
        new n(this, 8).invoke();
        a1m.e.d("deviceManufacturer", Build.MANUFACTURER, map);
        if (d(c1m.f.CARRIER)) {
            a1m.e.d("carrier", new n(this, 9).invoke(), map);
        }
        if (d(c1m.f.PHYSICAL_MEMORY)) {
            a1m.e.d("physicalMemory", new n(this, 10).invoke(), map);
        }
        if (d(c1m.f.TOTAL_STORAGE)) {
            a1m.e.d("totalStorage", new n(this, 11).invoke(), map);
        }
        if (d(c1m.f.RESOLUTION)) {
            a1m.e.d("resolution", new n(this, 12).invoke(), map);
        }
        if (d(c1m.f.SCALE)) {
            a1m.e.d("scale", new n(this, 13).invoke(), map);
        }
        Pair pair = null;
        if (d(c1m.f.LANGUAGE)) {
            String str = (String) new n(this, 3).invoke();
            a1m.e.d("language", str != null ? f0.U0(8, str) : null, map);
        }
        if (d(c1m.f.ANDROID_IDFA)) {
            a1m.e.d("androidIdfa", new n(this, 4).invoke(), map);
        }
        boolean zD = d(c1m.f.APP_SET_ID);
        boolean zD2 = d(c1m.f.APP_SET_ID_SCOPE);
        if (zD || zD2) {
            this.f318652c.getClass();
            Context context = this.f;
            Intrinsics.checkNotNullParameter(context, "context");
            if (!Intrinsics.f(Looper.myLooper(), Looper.getMainLooper())) {
                try {
                    a1m.a aVar = a1m.b.Companion;
                    Object objB = a1m.a.b(aVar, "com.google.android.gms.appset.AppSet", "getClient", new Class[]{Context.class}, context);
                    if (objB != null && (objA = a1m.a.a(aVar, objB, "getAppSetIdInfo", new Object[0])) != null) {
                        Intrinsics.checkNotNullExpressionValue(Task.class, "forName(\"com.google.android.gms.tasks.Task\")");
                        Object objB2 = a1m.a.b(aVar, "com.google.android.gms.tasks.Tasks", "await", new Class[]{Task.class}, objA);
                        if (objB2 != null && (objA2 = a1m.a.a(aVar, objB2, "getId", new Object[0])) != null && (objA3 = a1m.a.a(aVar, objB2, "getScope", new Object[0])) != null) {
                            pair = new Pair((String) objA2, ((Integer) objA3).intValue() == 1 ? "app" : "developer");
                        }
                    }
                } catch (ClassNotFoundException unused) {
                    Intrinsics.checkNotNullExpressionValue("b", "TAG");
                    j.a("b", "AppSetID error: Google Play Services not found", new Object[0]);
                } catch (InvocationTargetException unused2) {
                    Intrinsics.checkNotNullExpressionValue("b", "TAG");
                    j.a("b", "AppSetID error: Google Play Services not available", new Object[0]);
                } catch (Exception unused3) {
                    Intrinsics.checkNotNullExpressionValue("b", "TAG");
                    j.a("b", "AppSetID error: couldn't connect to Google Play Services", new Object[0]);
                }
            }
            if (zD) {
                a1m.e.d("appSetId", (String) new l(pair, 0).invoke(), map);
            }
            if (zD2) {
                a1m.e.d("appSetIdScope", (String) new l(pair, 1).invoke(), map);
            }
        }
        this.f318654h = true;
    }

    public final boolean d(c1m.f fVar) {
        List list = this.d;
        if (list != null) {
            return list.contains(fVar);
        }
        return true;
    }
}
