package uj7;

import com.revolut.data.model.Data;
import com.revolut.feature.insurance.api.models.details.CFACProductDetails;
import com.revolut.feature.insurance.api.models.details.CFACReimbursementType;
import com.revolut.feature.insurance.impl.ui.cfac.claim.exact_reason.CFACInsuranceExactReasonScreenContract$InputData;
import ffk.t;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import yji.l;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends jki.g implements jki.h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CFACInsuranceExactReasonScreenContract$InputData f280529p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final t f280530q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f280531r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p stateMapper, CFACInsuranceExactReasonScreenContract$InputData inputData, t pricingPlanInteractor) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        this.f280529p = inputData;
        this.f280530q = pricingPlanInteractor;
        this.f280531r = new e(new Data(null, null, true, 3, null), inputData.f75072b, inputData.f);
    }

    @Override // yji.l
    public final void I1() {
        CFACInsuranceExactReasonScreenContract$InputData cFACInsuranceExactReasonScreenContract$InputData = this.f280529p;
        CFACReimbursementType selectedReimbursementType = cFACInsuranceExactReasonScreenContract$InputData.f75073c;
        CFACProductDetails productDetails = cFACInsuranceExactReasonScreenContract$InputData.e;
        t tVar = this.f280530q;
        Intrinsics.checkNotNullParameter(tVar, "<this>");
        Intrinsics.checkNotNullParameter(selectedReimbursementType, "selectedReimbursementType");
        Intrinsics.checkNotNullParameter(productDetails, "productDetails");
        l.a1(this, rd0.e.b(nim.a.w(tVar.q(), new ijg.c(selectedReimbursementType, productDetails, 1))), null, null, new uf0.d(this, null, 8), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f280531r;
    }
}
