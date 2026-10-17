package o41;

import android.app.Activity;
import bq.i;
import com.google.common.collect.ImmutableSet;
import fsi.g;
import java.util.Set;
import jla.h;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import nii.t0;
import sri.m;
import vc.s;
import xoi.f;
import xoi.j;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements f {
    public final e4m.e A;
    public final e4m.e B;
    public final e4m.e C;
    public final e4m.e D;
    public final e4m.e E;
    public final e4m.e F;
    public final e4m.e G;
    public final e4m.e H;
    public final e4m.e I;
    public final e4m.e J;
    public final e4m.e K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f221927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xoi.a f221928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f221929c;
    public final a d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f221930g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f221931h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f221932j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f221933l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f221934m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f221935n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f221936p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f221937q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f221938r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f221939s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f221940t;
    public final e4m.e u;
    public final e4m.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f221941w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e4m.e f221942x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e4m.e f221943y;
    public final e4m.e z;

    public c(a aVar, xoi.a aVar2, j jVar, g gVar) {
        this.d = aVar;
        this.f221927a = gVar;
        this.f221928b = aVar2;
        this.f221929c = jVar;
        int i = 0;
        this.e = e4m.b.b(new b(aVar, this, 0, i));
        this.f = e4m.b.b(new b(aVar, this, 1, i));
        this.f221930g = e4m.b.b(new b(aVar, this, 3, i));
        this.f221931h = e4m.b.b(new b(aVar, this, 2, i));
        this.i = e4m.b.b(new b(aVar, this, 6, i));
        this.f221932j = e4m.b.b(new b(aVar, this, 5, i));
        this.k = e4m.b.b(new b(aVar, this, 4, i));
        this.f221933l = e4m.b.b(new b(aVar, this, 7, i));
        this.f221934m = e4m.b.b(new b(aVar, this, 8, i));
        this.f221935n = e4m.b.b(new b(aVar, this, 9, i));
        this.o = e4m.b.b(new b(aVar, this, 10, i));
        this.f221936p = e4m.b.b(new b(aVar, this, 11, i));
        this.f221937q = e4m.b.b(new b(aVar, this, 12, i));
        this.f221938r = e4m.b.b(new b(aVar, this, 13, i));
        this.f221939s = e4m.b.b(new b(aVar, this, 14, i));
        this.f221940t = e4m.b.b(new b(aVar, this, 15, i));
        this.u = e4m.b.b(new b(aVar, this, 16, i));
        this.v = e4m.b.b(new b(aVar, this, 17, i));
        this.f221941w = e4m.b.b(new b(aVar, this, 18, i));
        this.f221942x = e4m.b.b(new b(aVar, this, 20, i));
        this.f221943y = e4m.b.b(new b(aVar, this, 19, i));
        this.z = e4m.b.b(new b(aVar, this, 22, i));
        this.A = e4m.b.b(new b(aVar, this, 21, i));
        this.B = e4m.b.b(new b(aVar, this, 24, i));
        this.C = e4m.b.b(new b(aVar, this, 23, i));
        this.D = e4m.b.b(new b(aVar, this, 25, i));
        this.E = e4m.b.b(new b(aVar, this, 26, i));
        this.F = e4m.b.b(new b(aVar, this, 28, i));
        this.G = e4m.b.b(new b(aVar, this, 27, i));
        this.H = e4m.b.b(new b(aVar, this, 31, i));
        this.I = e4m.b.b(new b(aVar, this, 30, i));
        this.J = e4m.b.b(new b(aVar, this, 29, i));
        this.K = e4m.b.b(new b(aVar, this, 32, i));
    }

    public final pri.f a() {
        return (pri.f) this.G.get();
    }

    public final kwl.b b() {
        return (kwl.b) this.J.get();
    }

    public final ImmutableSet c() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(26);
        g gVar = this.f221927a;
        builderBuilderWithExpectedSize.addAll((Iterable) i.k(gVar));
        builderBuilderWithExpectedSize.add(this.e.get());
        builderBuilderWithExpectedSize.add(this.f.get());
        builderBuilderWithExpectedSize.add(this.f221931h.get());
        builderBuilderWithExpectedSize.add(this.k.get());
        builderBuilderWithExpectedSize.add(this.f221933l.get());
        a aVar = this.d;
        qf0.c cVarA = aVar.f221911h.a();
        s.j(cVarA);
        yp.b bVarA = aVar.i.a();
        m mVarL = i.l(gVar);
        v60.e eVarA = aVar.f221912j.a();
        s.j(eVarA);
        builderBuilderWithExpectedSize.add(new bq.f(cVarA, bVarA, mVarL, eVarA, i.A(i.f(gVar))));
        Activity activityB = i.b(gVar);
        nf0.a aVar2 = aVar.f221911h;
        qf0.c cVarA2 = aVar2.a();
        s.j(cVarA2);
        ang.f userInteractor = aVar.k.e();
        ila.b bVar = aVar.f221913l;
        fn2.c productCatalogueLoader = bVar.b();
        h productCatalogueInteractor = bVar.a();
        w99.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(productCatalogueLoader, "productCatalogueLoader");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        builderBuilderWithExpectedSize.add(new v99.c(activityB, cVarA2, new v99.f(new s99.i(userInteractor, productCatalogueLoader, productCatalogueInteractor, new s99.j())), i.l(gVar)));
        builderBuilderWithExpectedSize.add(this.f221934m.get());
        builderBuilderWithExpectedSize.add(this.f221935n.get());
        builderBuilderWithExpectedSize.add(this.o.get());
        builderBuilderWithExpectedSize.add(this.f221936p.get());
        builderBuilderWithExpectedSize.add(this.f221937q.get());
        builderBuilderWithExpectedSize.add(this.f221938r.get());
        builderBuilderWithExpectedSize.add(this.f221939s.get());
        builderBuilderWithExpectedSize.add(this.f221940t.get());
        builderBuilderWithExpectedSize.add(this.f221930g.get());
        builderBuilderWithExpectedSize.add(this.u.get());
        builderBuilderWithExpectedSize.add(this.f221932j.get());
        builderBuilderWithExpectedSize.add(this.v.get());
        CoroutineScope coroutineScopeA = aVar.f221921w.a();
        s.j(coroutineScopeA);
        m mVarL2 = i.l(gVar);
        qf0.c cVarA3 = aVar2.a();
        s.j(cVarA3);
        t0 t0Var = (t0) this.f221941w.get();
        swc.i iVar = new swc.i(fe0.c.a());
        cl3.a aVarD = aVar.f221922x.d();
        s.j(aVarD);
        swc.f fVar = (swc.f) aVar.f221923y.f275009a.get();
        s.j(fVar);
        builderBuilderWithExpectedSize.add(new com.revolut.feature.security_hub.limits.a(coroutineScopeA, mVarL2, cVarA3, t0Var, iVar, aVarD, fVar, new swc.e()));
        builderBuilderWithExpectedSize.add(this.f221943y.get());
        builderBuilderWithExpectedSize.add(this.A.get());
        builderBuilderWithExpectedSize.add(this.C.get());
        builderBuilderWithExpectedSize.add(this.D.get());
        return j6.a.g(this.E, builderBuilderWithExpectedSize);
    }

    public final g9b.a d() {
        return this.d.G;
    }

    public final osb.b e() {
        return this.d.H;
    }

    public final Set f() {
        return (Set) this.K.get();
    }
}
