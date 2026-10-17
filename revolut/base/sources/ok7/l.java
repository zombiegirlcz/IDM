package ok7;

import com.revolut.feature.insurance.api.models.details.CFACProductDetails;
import com.revolut.feature.insurance.api.models.details.CFACReimbursementType;
import com.revolut.feature.insurance.impl.ui.cfac.documents.CFACInsuranceDocumentsScreenContract$InputData;
import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends jki.g implements jki.h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CFACInsuranceDocumentsScreenContract$InputData f225927p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ij0.a f225928q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final h f225929r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p stateMapper, CFACInsuranceDocumentsScreenContract$InputData inputData, ij0.a configuration) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f225927p = inputData;
        this.f225928q = configuration;
        CFACProductDetails cFACProductDetails = inputData.f75124b;
        CFACReimbursementType cFACReimbursementType = inputData.f75125c;
        this.f225929r = new h(cFACProductDetails, cFACReimbursementType == CFACReimbursementType.NO_PROOF_REIMBURSEMENT ? "ID_NO_PROOF_TAB" : "ID_DOC_PROOF_TAB", cFACReimbursementType == null);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f225929r;
    }
}
