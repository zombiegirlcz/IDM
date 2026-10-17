package tjc;

import cli.k;
import cli.y;
import com.revolut.feature.rewards.impl.ui.subscription.activation.ActivationNoticeContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends oki.h implements dli.b {
    public final ActivationNoticeContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final bgc.e f271630p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f271631q;

    public f(ActivationNoticeContract$InputData inputData, bgc.e rewardsInteractor, h stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(rewardsInteractor, "rewardsInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f271630p = rewardsInteractor;
        this.f271631q = mra.d.b(this, k.f25028a, stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f271631q;
    }
}
