package yk6;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPaymentMethod;
import com.revolut.feature.external_accounts.impl.ui.colombia.pse.screen.verification_code.PseVerificationCodeScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends oki.h implements j {
    public final c70.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final a f314592p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f314593q;

    public n(o stateMapper, PseVerificationCodeScreenContract$InputData inputData, c70.a clipboard, a pseVerificationCodeDataFlow) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(pseVerificationCodeDataFlow, "pseVerificationCodeDataFlow");
        this.o = clipboard;
        this.f314592p = pseVerificationCodeDataFlow;
        this.f314593q = mra.d.b(this, new e(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        a aVar = this.f314592p;
        yji.l.a1(this, nim.a.v(rd0.e.d(aVar.f314576a.c(aVar.f314577b.f72730a, j02.n.MANDATE, ApmPaymentAuthorisationPaymentMethod.PSE), h0.f322473a), new yea.l(1, aVar, a.class, "buildVerificationCodeData", "buildVerificationCodeData(Lcom/revolut/feature/apm/core/models/payments_authorisations/ApmPaymentAuthorisationPendingAction;)Lcom/revolut/feature/external_accounts/impl/ui/colombia/pse/screen/verification_code/PseVerificationCodeScreenContract$VerificationCodeData;", 0, 3)), null, null, new m(this, (Continuation) null, 0), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f314593q;
    }
}
