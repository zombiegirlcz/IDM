package u55;

import com.revolut.feature.credit.autopay.models.repayment.AutoPayRepaymentDataRequest;
import com.revolut.feature.credit.loan.impl.ui.autopay.model.LoanAutoPayDataRequest;
import efm.r;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import tx0.p4;
import u3a.q;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements ck4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l35.b f277381a;

    public a(l35.b loanInteractor) {
        Intrinsics.checkNotNullParameter(loanInteractor, "loanInteractor");
        this.f277381a = loanInteractor;
    }

    @Override // ck4.a
    public final r a(AutoPayRepaymentDataRequest autoPayRepaymentDataRequest) {
        r rVarFlatMap = w.i(autoPayRepaymentDataRequest).cast(LoanAutoPayDataRequest.class).flatMap(new q(new p4(this, 25), 4));
        Intrinsics.checkNotNullExpressionValue(rVarFlatMap, "flatMap(...)");
        return rVarFlatMap;
    }
}
