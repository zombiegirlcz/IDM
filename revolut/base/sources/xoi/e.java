package xoi;

import android.content.Context;
import android.content.res.Resources;
import bp0.y;
import h30.q;
import ho.e0;
import ho.t;
import ijj.r;
import kotlin.jvm.internal.Intrinsics;
import lo0.o;
import no.t1;
import okhttp3.OkHttpClient;
import uo.d1;
import uo.q0;
import uo.u;

/* JADX INFO: loaded from: classes13.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final poi.b f307859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final im0.b f307860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l70.e f307861c;
    public final r d;

    public e(poi.b analyticsApi, im0.b applicationStateApi, l70.e coreAndroidApi, r coreActivityComponentProvider) {
        Intrinsics.checkNotNullParameter(analyticsApi, "analyticsApi");
        Intrinsics.checkNotNullParameter(applicationStateApi, "applicationStateApi");
        Intrinsics.checkNotNullParameter(coreAndroidApi, "coreAndroidApi");
        Intrinsics.checkNotNullParameter(coreActivityComponentProvider, "coreActivityComponentProvider");
        this.f307859a = analyticsApi;
        this.f307860b = applicationStateApi;
        this.f307861c = coreAndroidApi;
        this.d = coreActivityComponentProvider;
    }

    public static a3l.a b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        bk0.e eVarH = ((nj0.d) d(context)).h();
        phm.a aVar = (phm.a) j6.a.i(context, h51.a.class);
        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
        if (aVar2 != null) {
            return new a3l.a(context, eVarH, ((h51.a) aVar2.b()).c(), eVarH);
        }
        throw new IllegalStateException(a0.d.q("Api ", h51.a.class, " is not found"));
    }

    public static ww0.b c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ww0.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return (ww0.b) ww0.b.i.e(new a01.c(context.getApplicationContext(), 18));
    }

    public static nj0.a d(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.i(applicationContext, "null cannot be cast to non-null type com.revolut.retail.arch.container.RetailContainerApplication<*>");
        phm.a aVar = (phm.a) j6.a.j(hf0.b.d, nj0.a.class);
        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
        if (aVar2 != null) {
            return (nj0.a) aVar2.b();
        }
        throw new IllegalStateException(a0.d.q("Api ", nj0.a.class, " is not found"));
    }

    public final y a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        l70.e eVar = this.f307861c;
        t70.g gVarO = eVar.o();
        f90.b bVarT = eVar.t();
        qd0.b bVarN = eVar.n();
        phm.a aVar = (phm.a) j6.a.i(context, idb.a.class);
        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
        if (aVar2 == null) {
            throw new IllegalStateException(a0.d.q("Api ", idb.a.class, " is not found"));
        }
        idb.d dVarA = ((idb.a) aVar2.b()).a();
        ww0.b bVarC = c(context);
        phm.a aVar3 = (phm.a) j6.a.i(context, yn0.a.class);
        b60.a aVar4 = aVar3 != null ? (b60.a) aVar3.get() : null;
        if (aVar4 != null) {
            return new y(bVarT, gVarO, dVarA, bVarN, bVarC, ((yn0.a) aVar4.b()).a(), eVar.g());
        }
        throw new IllegalStateException(a0.d.q("Api ", yn0.a.class, " is not found"));
    }

    public final i01.b e(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        OkHttpClient okHttpClientE = ((nj0.d) d(context)).e();
        l70.e eVar = this.f307861c;
        zk0.b bVarL = eVar.l();
        g80.c cVarY = eVar.y();
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        return new i01.b(new q(okHttpClientE, bVarL, cVarY, resources));
    }

    public final lo0.k f(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        lo0.a aVar = new lo0.a(context);
        poi.b bVar = this.f307859a;
        q0 q0VarJ = bVar.j();
        uo.b bVarB = bVar.b();
        gpk.c cVarA = bVar.a();
        bVar.getClass();
        o oVar = new o(bVarB, cVarA, new e0(), (mo.c) bVar.f238018d0.get(), (uo.l) bVar.T.get(), aVar, (t1) bVar.m0.get(), bVar.j(), bVar.c());
        uo.b bVarB2 = bVar.b();
        bVar.getClass();
        uo.j jVar = new uo.j();
        gpk.c cVarA2 = bVar.a();
        bVar.getClass();
        e0 e0Var = new e0();
        mo.c cVar = (mo.c) bVar.f238018d0.get();
        uo.l lVar = (uo.l) bVar.T.get();
        lo0.f fVar = (lo0.f) bVar.p0.get();
        bVar.getClass();
        uo.q qVar = new uo.q(new d1());
        t tVarC = bVar.c();
        bVar.getClass();
        return new lo0.k(bVarB2, jVar, cVarA2, e0Var, cVar, lVar, aVar, q0VarJ, fVar, qVar, tVarC, new d1(), new u(new lo0.a(bVar.f238017c), new d1()), oVar);
    }
}
