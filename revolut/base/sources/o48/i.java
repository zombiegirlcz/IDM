package o48;

import com.revolut.feature.joint.impl.ui.close.losebenefits.JointCloseLoseBenefitContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends jki.g implements jki.h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ang.f f222172p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final a f222173q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(JointCloseLoseBenefitContract$InputData inputData, ang.f userInteractor, j stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f222172p = userInteractor;
        this.f222173q = new a(null);
    }

    @Override // yji.l
    public final void I1() {
        l2(new nt4.f(this, null, 11), new yi5.b(26));
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f222173q;
    }
}
