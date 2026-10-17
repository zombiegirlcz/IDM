package kk9;

import com.revolut.data.model.Data;
import kjk.x;
import kotlin.jvm.internal.Intrinsics;
import vi9.c0;
import vkm.j2;
import wp5.y;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class n extends jki.g implements j, yx4.k {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final xh9.a f184545p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c0 f184546q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final h f184547r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final a f184548s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final j2 f184549t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(xh9.a payLaterInteractor, c0 payLaterRepayItemFactory, i90.b uuidGenerator, jki.p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(payLaterInteractor, "payLaterInteractor");
        Intrinsics.checkNotNullParameter(payLaterRepayItemFactory, "payLaterRepayItemFactory");
        Intrinsics.checkNotNullParameter(uuidGenerator, "uuidGenerator");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f184545p = payLaterInteractor;
        this.f184546q = payLaterRepayItemFactory;
        this.f184547r = new h(new Data(null, null, true, 3, null), null, y.u(uuidGenerator, "toString(...)"));
        this.f184548s = new a();
        this.f184549t = vkm.q.c(Boolean.FALSE);
    }

    @Override // yji.l
    public final void I1() {
        ti9.g gVar = (ti9.g) this.f184545p;
        akg.n nVarV = nim.a.v(u0.i(nim.a.v(gVar.k(w4l.i.f294643c), new x(3)), rd0.e.b(nim.a.w(gVar.i(), new x(4))), rd0.e.b(gVar.j(w4l.h.f294642c))), new x(5));
        Intrinsics.checkNotNullParameter(nVarV, "<this>");
        yji.l.a1(this, rd0.e.n(vkm.q.q(new v0f.p(new ax9.o(yh5.b.d(nVarV, L0()), 23), 28)), h0.f322473a), null, null, new kae.d(this, null, 16), 3);
    }

    @Override // yx4.k
    public final j2 L0() {
        return this.f184549t;
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f184547r;
    }

    @Override // jki.g
    public final kki.a s2() {
        return this.f184548s;
    }
}
