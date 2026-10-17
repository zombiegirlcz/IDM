package xg7;

import cli.y;
import com.revolut.feature.incentive_reward.impl.ui.lottery.enrollment.screen.LotteryEnrollmentControllerContract$InputData;
import kf7.r;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r10.q;
import rp0.g1;
import t9f.n;
import vkm.j2;
import yji.l;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class i extends oki.h implements e {

    @NotNull
    private static final g Companion = new g();
    public final q o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final LotteryEnrollmentControllerContract$InputData f305619p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final g1 f305620q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vii.b f305621r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f305622s;

    public i(k stateMapper, q incentiveRewardInteractor, LotteryEnrollmentControllerContract$InputData inputData, g1 shotDialogDisplayer) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(incentiveRewardInteractor, "incentiveRewardInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        this.o = incentiveRewardInteractor;
        this.f305619p = inputData;
        this.f305620q = shotDialogDisplayer;
        this.f305621r = new vii.b();
        this.f305622s = mra.d.b(this, new d(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, rd0.e.n(vkm.q.Q(this.f305621r, new x18.e((Continuation) null, this, 9)), h0.f322473a), null, null, new h(this, null, 0), 3);
    }

    public final void I2() {
        r rVar = (r) ((d) ((j2) this.f305622s.f22677a).getValue()).f305616a.getContent();
        if (rVar == null) {
            r6.b.D("Enrollment details not loaded");
            return;
        }
        boolean z = rVar.f183308a;
        l2(new mt8.b(this, z, null, 14), new n(this, z, 18));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f305622s;
    }
}
