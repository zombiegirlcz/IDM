package iv4;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.card.impl.ui.statement.details.accrued_interest.dialog.CreditCardAccruedInterestsBottomSheetControllerContract$InputData;
import iug.j;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import yji.l;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class g extends oki.h implements dli.b {
    public final CreditCardAccruedInterestsBottomSheetControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final lal.a f168717p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f168718q;

    public g(CreditCardAccruedInterestsBottomSheetControllerContract$InputData inputData, lal.a creditCardStatementsInteractor, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditCardStatementsInteractor, "creditCardStatementsInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f168717p = creditCardStatementsInteractor;
        this.f168718q = mra.d.b(this, new d(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        CreditCardAccruedInterestsBottomSheetControllerContract$InputData creditCardAccruedInterestsBottomSheetControllerContract$InputData = this.o;
        l.a1(this, rd0.e.n(this.f168717p.F(creditCardAccruedInterestsBottomSheetControllerContract$InputData.f69672a, creditCardAccruedInterestsBottomSheetControllerContract$InputData.f69673b.d, null, null), h0.f322473a), null, null, new j(this, (Continuation) null, 3), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f168718q;
    }
}
