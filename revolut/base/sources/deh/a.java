package deh;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.wealth.mutual_funds.api.ui.details.MutualFundDetailsContract$InputData;
import dtl.d;
import e3h.i;
import e4m.e;
import fsl.o;
import i4h.p0;
import ieh.f;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import n2h.g;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements f {
    public final e A;
    public final e B;
    public final e C;
    public final e D;
    public final e E;
    public final e F;
    public final e G;
    public final e H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f3h.b f113439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MutualFundDetailsContract$InputData f113440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f113441c;
    public final g d;
    public final d e;
    public final v2h.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o f113442g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h1h.f f113443h;
    public final f3h.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b f113444j;
    public final e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e f113445l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e f113446m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e f113447n;
    public final e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f113448p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f113449q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f113450r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f113451s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e f113452t;
    public final e u;
    public final e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e f113453w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e f113454x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e f113455y;
    public final e z;

    public a(b bVar, f3h.b bVar2, f3h.a aVar, MutualFundDetailsContract$InputData mutualFundDetailsContract$InputData, i iVar, g gVar, v2h.c cVar, o oVar, d dVar, h1h.f fVar) {
        this.f113444j = bVar;
        this.f113439a = bVar2;
        this.f113440b = mutualFundDetailsContract$InputData;
        this.f113441c = iVar;
        this.d = gVar;
        this.e = dVar;
        this.f = cVar;
        this.f113442g = oVar;
        this.f113443h = fVar;
        this.i = aVar;
        this.k = com.revolut.data.database.models.openbanking.d.j(bVar, this, 1);
        this.f113445l = com.revolut.data.database.models.openbanking.d.j(bVar, this, 0);
        this.f113446m = com.revolut.data.database.models.openbanking.d.j(bVar, this, 4);
        this.f113447n = com.revolut.data.database.models.openbanking.d.j(bVar, this, 3);
        this.o = com.revolut.data.database.models.openbanking.d.j(bVar, this, 2);
        this.f113448p = com.revolut.data.database.models.openbanking.d.j(bVar, this, 7);
        this.f113449q = com.revolut.data.database.models.openbanking.d.j(bVar, this, 6);
        this.f113450r = com.revolut.data.database.models.openbanking.d.j(bVar, this, 5);
        this.f113451s = com.revolut.data.database.models.openbanking.d.j(bVar, this, 9);
        this.f113452t = com.revolut.data.database.models.openbanking.d.j(bVar, this, 8);
        this.u = com.revolut.data.database.models.openbanking.d.j(bVar, this, 12);
        this.v = com.revolut.data.database.models.openbanking.d.j(bVar, this, 11);
        this.f113453w = com.revolut.data.database.models.openbanking.d.j(bVar, this, 10);
        this.f113454x = e4m.b.b(e4m.c.a(oVar));
        this.f113455y = com.revolut.data.database.models.openbanking.d.j(bVar, this, 14);
        this.z = com.revolut.data.database.models.openbanking.d.j(bVar, this, 13);
        this.A = com.revolut.data.database.models.openbanking.d.j(bVar, this, 16);
        this.B = com.revolut.data.database.models.openbanking.d.j(bVar, this, 15);
        this.C = e4m.b.b(e4m.c.a(fVar));
        this.D = com.revolut.data.database.models.openbanking.d.j(bVar, this, 18);
        this.E = com.revolut.data.database.models.openbanking.d.j(bVar, this, 17);
        this.F = com.revolut.data.database.models.openbanking.d.j(bVar, this, 19);
        this.G = com.revolut.data.database.models.openbanking.d.j(bVar, this, 21);
        this.H = e4m.b.b(new db1.f(bVar, this, 20, 3));
    }

    @Override // xki.e
    public final Set f() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(10);
        e3h.a extensions = (e3h.a) this.f113445l.get();
        Intrinsics.checkNotNullParameter(extensions, "extensions");
        p0 controllerModelExtension = extensions.f122271b;
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        builderBuilderWithExpectedSize.add(controllerModelExtension);
        gdh.a aVar = (gdh.a) this.f113446m.get();
        f9f.b.f(aVar);
        builderBuilderWithExpectedSize.add(aVar);
        builderBuilderWithExpectedSize.addAll((Iterable) f9f.b.k((gdh.a) this.f113446m.get()));
        builderBuilderWithExpectedSize.add(this.F.get());
        builderBuilderWithExpectedSize.add(this.f113451s.get());
        builderBuilderWithExpectedSize.add(this.f113447n.get());
        builderBuilderWithExpectedSize.add(this.v.get());
        builderBuilderWithExpectedSize.add(this.f113455y.get());
        builderBuilderWithExpectedSize.add(this.A.get());
        return j6.a.g(this.D, builderBuilderWithExpectedSize);
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of(f0k.d.A(this.f113439a, (e3h.a) this.f113445l.get()), (yji.d) this.o.get(), (yji.d) this.f113450r.get(), (yji.d) this.f113452t.get(), (yji.d) this.f113453w.get(), (yji.d) this.z.get(), (yji.d) this.B.get(), (yji.d) this.E.get());
    }
}
