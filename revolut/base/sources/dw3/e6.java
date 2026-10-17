package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.sso.flow.SelfieIntroFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e6 implements xki.c, iq3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f118649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1 f118650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e6 f118651c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f118652g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f118653h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f118654j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f118655l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f118656m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f118657n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f118658p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f118659q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f118660r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f118661s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f118662t;
    public final e4m.e u;
    public final e4m.e v;

    public e6(c1 c1Var, iq3.a aVar, ViewController viewController, SelfieIntroFlowContract$InputData selfieIntroFlowContract$InputData) {
        this.f118650b = c1Var;
        this.f118649a = aVar;
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i = 11;
        this.e = e4m.b.b(new g5(c1Var, this, 2, i));
        this.f = e4m.b.b(new g5(c1Var, this, 1, i));
        this.f118652g = e4m.b.b(new g5(c1Var, this, 0, i));
        this.f118653h = e4m.b.b(e4m.c.a(selfieIntroFlowContract$InputData));
        int i2 = 11;
        this.i = e4m.b.b(new g5(c1Var, this, 7, i2));
        this.f118654j = e4m.b.b(new g5(c1Var, this, 6, i2));
        this.k = e4m.b.b(new g5(c1Var, this, 10, i2));
        this.f118655l = e4m.b.b(new g5(c1Var, this, 11, i2));
        this.f118656m = e4m.b.b(new g5(c1Var, this, 9, i2));
        this.f118657n = e4m.b.b(new g5(c1Var, this, 8, i2));
        this.o = e4m.b.b(new g5(c1Var, this, 5, i2));
        this.f118658p = e4m.b.b(new g5(c1Var, this, 4, i2));
        this.f118659q = e4m.b.b(new g5(c1Var, this, 3, i2));
        this.f118660r = e4m.b.b(new g5(c1Var, this, 13, i2));
        this.f118661s = e4m.b.b(new g5(c1Var, this, 12, i2));
        this.f118662t = e4m.b.b(new g5(c1Var, this, 14, i2));
        this.u = e4m.b.b(new g5(c1Var, this, 15, i2));
        this.v = e4m.b.b(new g5(c1Var, this, 16, i2));
    }

    @Override // xki.e
    public final Set f() {
        Object extension = (j54.f) this.f118661s.get();
        wi4.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(extension, "extension");
        yji.n nVar = (yji.n) extension;
        vc.s.k(nVar);
        Object extension2 = (j54.v) this.f118660r.get();
        Intrinsics.checkNotNullParameter(extension2, "extension");
        yji.n nVar2 = (yji.n) extension2;
        vc.s.k(nVar2);
        return ImmutableSet.of(nVar, nVar2, (yji.n) this.f118662t.get(), (yji.n) this.u.get(), (yji.n) this.o.get(), (yji.n) this.f118654j.get(), new yji.n[0]);
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f118652g.get(), (yji.d) this.f118659q.get());
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new n7(this.f118650b, this.f118651c, 17);
    }
}
