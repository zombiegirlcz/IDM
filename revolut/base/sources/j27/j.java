package j27;

import cli.y;
import com.revolut.feature.freelancer.impl.ui.sales.order_init_page.orders.OrderInitPageHistoryScreenContract$InputData;
import j27.f;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends oki.h implements g {
    public final b9k.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final hr6.l f170716p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final OrderInitPageHistoryScreenContract$InputData f170717q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vii.b f170718r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f170719s;

    public j(b9k.f acquiringOrderInteractor, hr6.l freelancerCommandFactory, OrderInitPageHistoryScreenContract$InputData inputData, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(acquiringOrderInteractor, "acquiringOrderInteractor");
        Intrinsics.checkNotNullParameter(freelancerCommandFactory, "freelancerCommandFactory");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = acquiringOrderInteractor;
        this.f170716p = freelancerCommandFactory;
        this.f170717q = inputData;
        this.f170718r = new vii.b();
        this.f170719s = mra.d.b(this, f.b.f170714a, stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        yji.l.b1(this, q.Q(this.f170718r, new iw6.l((Continuation) null, this, 3)), null, new i(this, null), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f170719s;
    }
}
