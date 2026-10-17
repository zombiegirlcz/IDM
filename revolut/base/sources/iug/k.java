package iug;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.consent.AccountClosureConsentScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class k extends oki.h implements h {
    public final ybl.l o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f168600p;

    public k(n stateMapper, AccountClosureConsentScreenContract$InputData inputData, ybl.l tradingConfigInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        this.o = tradingConfigInteractor;
        this.f168600p = mra.d.b(this, new e(new Data(null, null, true, 3, null), inputData.f94926a, false), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        yji.l.b1(this, ybl.l.d(this.o), null, new j(this, (Continuation) null, 0), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f168600p;
    }
}
