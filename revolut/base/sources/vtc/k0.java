package vtc;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ee0.a f291999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final an0.c f292000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nj0.a f292001c;
    public final ila.b d;
    public final l70.e e;
    public final Context f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ite.a f292002g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f49.a f292003h;
    public final k0 i = this;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f292004j = e4m.b.b(new j0(this, 0));
    public final e4m.e k = e4m.b.b(new j0(this, 2));

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f292005l = e4m.b.b(new j0(this, 3));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f292006m = e4m.b.b(new j0(this, 4));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f292007n = e4m.b.b(new j0(this, 1));
    public final e4m.e o = e4m.b.b(new j0(this, 6));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f292008p = e4m.b.b(new j0(this, 5));

    public k0(nj0.a aVar, ee0.a aVar2, an0.c cVar, f49.a aVar3, l70.e eVar, ila.b bVar, ite.a aVar4, Context context) {
        this.f291999a = aVar2;
        this.f292000b = cVar;
        this.f292001c = aVar;
        this.d = bVar;
        this.e = eVar;
        this.f = context;
        this.f292002g = aVar4;
        this.f292003h = aVar3;
    }

    public final ufm.d a() {
        return c();
    }

    public final wtc.g0 b() {
        return d();
    }

    public final ufm.d c() {
        cuc.r rVar = (cuc.r) this.f292008p.get();
        w39.b bVarA = this.f292003h.a();
        vc.s.j(bVarA);
        return new ufm.d(rVar, bVarA, d());
    }

    public final wtc.g0 d() {
        cuc.e0 e0Var = (cuc.e0) this.f292007n.get();
        jla.h hVarA = this.d.a();
        l70.e eVar = this.e;
        y80.a aVarR = eVar.r();
        vc.s.j(aVarR);
        ConnectivityManager connectivityManager = (ConnectivityManager) eVar.f192451y.get();
        vc.s.j(connectivityManager);
        n80.b bVar = new n80.b();
        s0 s0Var = t0.Companion;
        s0Var.getClass();
        Context context = this.f;
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("wifi");
        Intrinsics.i(systemService, "null cannot be cast to non-null type android.net.wifi.WifiManager");
        wtc.e eVar2 = new wtc.e(connectivityManager, bVar, (WifiManager) systemService);
        wtc.f fVar = new wtc.f();
        n80.b bVar2 = new n80.b();
        s0Var.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService2 = context.getSystemService("wifi");
        Intrinsics.i(systemService2, "null cannot be cast to non-null type android.net.wifi.WifiManager");
        tb4.t tVar = new tb4.t(eVar2, fVar, new tul.b(bVar2, (WifiManager) systemService2));
        gte.a aVarB = this.f292002g.b();
        vc.s.j(aVarB);
        return new wtc.g0(e0Var, hVarA, aVarR, tVar, aVarB);
    }
}
