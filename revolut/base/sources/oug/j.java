package oug;

import cli.y;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.feature_rating_feedback.AccountClosureFeatureRatingFeedbackScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class j extends oki.h implements h {
    public final AccountClosureFeatureRatingFeedbackScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f229878p;

    public j(k stateMapper, AccountClosureFeatureRatingFeedbackScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        this.f229878p = mra.d.b(this, new e(inputData.f94951a, inputData.f94952b), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f229878p;
    }
}
