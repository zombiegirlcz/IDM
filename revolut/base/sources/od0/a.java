package od0;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f224253a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicReference f224254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReference f224255c;
    public static final AtomicReference d;
    public static final AtomicReference e;
    public static final AtomicReference f;

    static {
        Intrinsics.checkNotNullParameter("com.revolut.instrumentation_test_core.libs.mock.network.aclient.InstrumentationTestInterceptor", "className");
        yhm.j.b(new ob1.e(9));
        f224254b = new AtomicReference(b.UNDEFINED);
        f224255c = new AtomicReference(hx7.b.a());
        d = new AtomicReference(l.UNDEFINED);
        e = new AtomicReference(g.UNDEFINED);
        f = new AtomicReference(d.UNDEFINED);
    }

    private a() {
    }

    public static void a() {
        if (b() == b.UNDEFINED) {
            IllegalStateException illegalStateException = new IllegalStateException("AppEnvironment not initialised");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        }
    }

    public static b b() {
        Object obj2 = f224254b.get();
        Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
        return (b) obj2;
    }

    public static l c() {
        Object obj2 = d.get();
        Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
        return (l) obj2;
    }

    public static boolean d() {
        b bVarB = b();
        b bVar = b.BETA;
        a();
        return bVarB == bVar;
    }

    public static boolean e() {
        b bVarB = b();
        b bVar = b.DEVELOPMENT;
        a();
        return bVarB == bVar;
    }

    public static boolean f() {
        b bVarB = b();
        b bVar = b.PRODUCTION;
        a();
        return bVarB != bVar;
    }

    public static boolean g() {
        b bVarB = b();
        b bVar = b.PRODUCTION;
        a();
        return bVarB == bVar;
    }

    public static boolean h() {
        Object obj2 = f.get();
        Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
        return ((d) obj2) == d.SAMPLE_APP;
    }

    public static boolean i() {
        return c() != l.UNDEFINED;
    }
}
