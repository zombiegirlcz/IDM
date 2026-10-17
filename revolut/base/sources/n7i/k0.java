package n7i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hpg.b f213124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0 f213125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f213126c;

    public k0(v60.e serverErrorsProvider, hpg.b savingsAddMoneyLimitsMapper, l0 successMessageMapper, d cfdMoveMoneyStatusDialogMapper) {
        Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
        Intrinsics.checkNotNullParameter(savingsAddMoneyLimitsMapper, "savingsAddMoneyLimitsMapper");
        Intrinsics.checkNotNullParameter(successMessageMapper, "successMessageMapper");
        Intrinsics.checkNotNullParameter(cfdMoveMoneyStatusDialogMapper, "cfdMoveMoneyStatusDialogMapper");
        this.f213124a = savingsAddMoneyLimitsMapper;
        this.f213125b = successMessageMapper;
        this.f213126c = cfdMoveMoneyStatusDialogMapper;
    }

    public final nii.z a() {
        return new nii.z(ofm.q.O(new v60.b()), null, null, null, null, null, false, null, null, null, null, null, null, 32766);
    }
}
