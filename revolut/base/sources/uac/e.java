package uac;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.revolutpay.order_tracking.impl.ui.order_details.OrderDetailsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;
import u45.w0;
import vc.s;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OrderDetailsScreenContract$InputData f278568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f278569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f278570c;
    public final e4m.e d;
    public final e4m.e e;

    public e(f fVar, i iVar, ViewController viewController, OrderDetailsScreenContract$InputData orderDetailsScreenContract$InputData) {
        this.f278569b = fVar;
        this.f278568a = orderDetailsScreenContract$InputData;
        this.f278570c = e4m.b.b(e4m.c.a(viewController));
        int i = 9;
        this.d = e4m.b.b(new w0(fVar, this, 1, i));
        this.e = e4m.b.b(new w0(fVar, this, 0, i));
    }

    public final nbc.b b() {
        f fVar = this.f278569b;
        qd0.b bVarN = fVar.f278574g.n();
        s.j(bVarN);
        zdc.a aVar = new zdc.a();
        thf.g gVarE = fVar.d.e();
        s.j(gVarE);
        fub.k kVarD = fVar.f278575h.d();
        s.j(kVarD);
        return new nbc.b(bVarN, aVar, gVarE, kVarD, new kbc.b());
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
