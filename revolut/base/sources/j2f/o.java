package j2f;

import cli.y;
import com.revolut.feature.trade_rev_points.impl.ui.screen.agent_details.voucher.TradeRevPointsAgentAllVouchersScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class o extends oki.h implements k {
    public final TradeRevPointsAgentAllVouchersScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final qr0.i f170859p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final jwb.e f170860q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vii.b f170861r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f170862s;

    public o(cli.n stateMapper, TradeRevPointsAgentAllVouchersScreenContract$InputData inputData, qr0.i agentsInteractor, jwb.e revPointsGiftcardsInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(agentsInteractor, "agentsInteractor");
        Intrinsics.checkNotNullParameter(revPointsGiftcardsInteractor, "revPointsGiftcardsInteractor");
        this.o = inputData;
        this.f170859p = agentsInteractor;
        this.f170860q = revPointsGiftcardsInteractor;
        this.f170861r = new vii.b();
        this.f170862s = mra.d.b(this, new e(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, vkm.q.Q(vkm.q.Q(this.f170861r, new m(continuation, this, 0)), new m(continuation, this, 1)), null, null, new iug.j(this, continuation, 14), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f170862s;
    }
}
