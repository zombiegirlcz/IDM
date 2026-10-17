package g4c;

import cli.y;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class u extends oki.h implements l {
    public final k3c.r o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final kpj.e f140491p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f3c.a f140492q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vii.c f140493r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f140494s;

    public u(k3c.r orderListPagingSource, kpj.e merchantRevolutShopInteractor, f3c.a revolutShopCapabilityExtension, w stateMapper) {
        Intrinsics.checkNotNullParameter(orderListPagingSource, "orderListPagingSource");
        Intrinsics.checkNotNullParameter(merchantRevolutShopInteractor, "merchantRevolutShopInteractor");
        Intrinsics.checkNotNullParameter(revolutShopCapabilityExtension, "revolutShopCapabilityExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = orderListPagingSource;
        this.f140491p = merchantRevolutShopInteractor;
        this.f140492q = revolutShopCapabilityExtension;
        this.f140493r = new vii.c();
        this.f140494s = mra.d.b(this, new h(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        I2();
    }

    public final void I2() {
        yji.l.a1(this, vkm.q.q(new exe.j(this.o.j(250L), 5)), null, null, new o(this, null, 1), 3);
        yji.l.a1(this, vkm.q.Q(this.f140493r.a(Unit.f186387a, w4l.i.f294643c), new f5h.b((Continuation) null, this, 25)), null, null, new o(this, null, 0), 3);
    }

    @Override // yji.l
    public final void T1(long j2) {
        n2(new p(this, null, 1), new whi.b(6));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f140494s;
    }
}
