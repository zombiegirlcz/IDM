package sug;

import cli.n;
import cli.y;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.feedback_competitor.AccountClosureFeedbackCompetitorScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class k extends oki.h implements i {
    public final AccountClosureFeedbackCompetitorScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f265765p;

    public k(n stateMapper, AccountClosureFeedbackCompetitorScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        this.f265765p = mra.d.b(this, new f(inputData.f94956a, null), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f265765p;
    }
}
