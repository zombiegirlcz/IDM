package qug;

import cli.y;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.feedback.AccountClosureFeedbackScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class j extends oki.h implements h {
    public final AccountClosureFeedbackScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f249451p;

    public j(k stateMapper, AccountClosureFeedbackScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        this.f249451p = mra.d.b(this, new e(inputData.f94953a, null), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f249451p;
    }
}
