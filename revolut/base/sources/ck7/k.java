package ck7;

import com.revolut.data.model.Data;
import com.revolut.feature.insurance.api.models.details.CFACProductDetails;
import com.revolut.feature.insurance.api.models.details.CFACReimbursementType;
import com.revolut.feature.insurance.impl.ui.cfac.claim.reason_group.CFACInsuranceReasonGroupScreenContract$InputData;
import ffk.t;
import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends jki.g implements jki.h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CFACInsuranceReasonGroupScreenContract$InputData f24794p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final t f24795q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f24796r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(p stateMapper, CFACInsuranceReasonGroupScreenContract$InputData inputData, t pricingPlanInteractor) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        this.f24794p = inputData;
        this.f24795q = pricingPlanInteractor;
        this.f24796r = new e(inputData.f75094a, inputData.f75095b, new Data(null, null, true, 3, null), inputData.e);
    }

    @Override // yji.l
    public final void I1() {
        CFACInsuranceReasonGroupScreenContract$InputData cFACInsuranceReasonGroupScreenContract$InputData = this.f24794p;
        CFACReimbursementType selectedReimbursementType = cFACInsuranceReasonGroupScreenContract$InputData.f75095b;
        CFACProductDetails productDetails = cFACInsuranceReasonGroupScreenContract$InputData.d;
        t tVar = this.f24795q;
        Intrinsics.checkNotNullParameter(tVar, "<this>");
        Intrinsics.checkNotNullParameter(selectedReimbursementType, "selectedReimbursementType");
        Intrinsics.checkNotNullParameter(productDetails, "productDetails");
        yji.l.a1(this, rd0.e.b(nim.a.w(tVar.q(), new ijg.c(selectedReimbursementType, productDetails, 1))), null, null, new j(this, null, 0), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f24796r;
    }
}
