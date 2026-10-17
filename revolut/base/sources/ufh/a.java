package ufh;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.wealth.private_equity.api.ui.details.FundDetailsContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import fsl.o;
import i4h.p0;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import ufg.k0;
import vc.s;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements zfh.f {
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
    public final e4m.e L;
    public final e4m.e M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dtl.d f279811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f3h.b f279812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FundDetailsContract$InputData f279813c;
    public final e3h.i d;
    public final n2h.g e;
    public final ViewController f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o f279814g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v2h.c f279815h;
    public final h1h.f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f3h.a f279816j;
    public final i k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f279817l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f279818m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f279819n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f279820p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f279821q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f279822r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f279823s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f279824t;
    public final e4m.e u;
    public final e4m.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f279825w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e4m.e f279826x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e4m.e f279827y;
    public final e4m.e z;

    public a(i iVar, f3h.b bVar, f3h.a aVar, ViewController viewController, FundDetailsContract$InputData fundDetailsContract$InputData, o oVar, e3h.i iVar2, h1h.f fVar, dtl.d dVar, v2h.c cVar, n2h.g gVar) {
        this.k = iVar;
        this.f279811a = dVar;
        this.f279812b = bVar;
        this.f279813c = fundDetailsContract$InputData;
        this.d = iVar2;
        this.e = gVar;
        this.f = viewController;
        this.f279814g = oVar;
        this.f279815h = cVar;
        this.i = fVar;
        this.f279816j = aVar;
        this.f279817l = t61.a.m(iVar, this, 2);
        this.f279818m = t61.a.m(iVar, this, 1);
        this.f279819n = t61.a.m(iVar, this, 0);
        this.o = t61.a.m(iVar, this, 4);
        this.f279820p = t61.a.m(iVar, this, 3);
        this.f279821q = t61.a.m(iVar, this, 7);
        this.f279822r = t61.a.m(iVar, this, 6);
        this.f279823s = t61.a.m(iVar, this, 5);
        this.f279824t = t61.a.m(iVar, this, 8);
        this.u = t61.a.m(iVar, this, 9);
        this.v = t61.a.m(iVar, this, 12);
        this.f279825w = t61.a.m(iVar, this, 11);
        this.f279826x = t61.a.m(iVar, this, 10);
        this.f279827y = e4m.b.b(e4m.c.a(oVar));
        this.z = t61.a.m(iVar, this, 14);
        this.A = t61.a.m(iVar, this, 13);
        this.B = t61.a.m(iVar, this, 16);
        this.C = t61.a.m(iVar, this, 15);
        this.D = t61.a.m(iVar, this, 18);
        this.E = t61.a.m(iVar, this, 17);
        this.F = e4m.b.b(e4m.c.a(fVar));
        this.G = t61.a.m(iVar, this, 20);
        this.H = t61.a.m(iVar, this, 19);
        this.I = t61.a.m(iVar, this, 21);
        this.J = t61.a.m(iVar, this, 23);
        this.K = t61.a.m(iVar, this, 24);
        this.L = t61.a.m(iVar, this, 25);
        this.M = e4m.b.b(new k0(iVar, this, 22, 2));
    }

    @Override // xki.e
    public final Set f() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(11);
        builderBuilderWithExpectedSize.add(this.I.get());
        e3h.a extensions = (e3h.a) this.f279820p.get();
        Intrinsics.checkNotNullParameter(extensions, "extensions");
        p0 controllerModelExtension = extensions.f122271b;
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        builderBuilderWithExpectedSize.add(controllerModelExtension);
        gdh.a aVar = (gdh.a) this.f279821q.get();
        f9f.b.f(aVar);
        builderBuilderWithExpectedSize.add(aVar);
        builderBuilderWithExpectedSize.addAll((Iterable) f9f.b.k((gdh.a) this.f279821q.get()));
        builderBuilderWithExpectedSize.add(dw3.l.m((d1h.e) this.u.get()));
        builderBuilderWithExpectedSize.add(this.f279825w.get());
        builderBuilderWithExpectedSize.add(this.z.get());
        builderBuilderWithExpectedSize.add(this.f279822r.get());
        builderBuilderWithExpectedSize.add(this.B.get());
        builderBuilderWithExpectedSize.add(this.D.get());
        return j6.a.g(this.G, builderBuilderWithExpectedSize);
    }

    @Override // xki.e
    public final Set g() {
        yji.d dVar = (yji.d) this.f279819n.get();
        yji.d dVarA = f0k.d.A(this.f279812b, (e3h.a) this.f279820p.get());
        yji.d dVar2 = (yji.d) this.f279823s.get();
        gah.f fVarA = ((u8h.b) this.k.i).a();
        s.j(fVarA);
        return ImmutableSet.of(dVar, dVarA, dVar2, dw3.l.l(fVarA, (d1h.j) this.f279824t.get(), (d1h.e) this.u.get()), (yji.d) this.f279826x.get(), (yji.d) this.A.get(), (yji.d) this.C.get(), (yji.d) this.E.get(), (yji.d) this.H.get());
    }
}
