package rj7;

import com.revolut.data.model.Data;
import com.revolut.feature.insurance.api.models.details.CFACClaimFlowMode;
import com.revolut.feature.insurance.api.models.details.CFACProductDetails;
import com.revolut.feature.insurance.impl.ui.cfac.claim.coverage_info.CFACInsuranceCoverageInfoScreenContract$InputData;
import jki.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends jki.g implements k {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c70.a f254627p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final mu7.a f254628q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j f254629r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p stateMapper, CFACInsuranceCoverageInfoScreenContract$InputData inputData, c70.a clipboard, mu7.a embeddedInsuranceDetailInteractor) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(embeddedInsuranceDetailInteractor, "embeddedInsuranceDetailInteractor");
        this.f254627p = clipboard;
        this.f254628q = embeddedInsuranceDetailInteractor;
        this.f254629r = new j(inputData.f75066a, inputData.f75067b, inputData.f75068c, inputData.d, inputData.e, new Data(null, null, true, 3, null));
    }

    @Override // yji.l
    public final void I1() {
        CFACClaimFlowMode cFACClaimFlowMode;
        j jVar = (j) t2();
        CFACProductDetails cFACProductDetails = jVar.d;
        int i = i.f254622a[jVar.f254624b.ordinal()];
        if (i == 1) {
            cFACClaimFlowMode = cFACProductDetails.e.f75010g;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            cFACClaimFlowMode = cFACProductDetails.f.f75010g;
        }
        if (!(cFACClaimFlowMode instanceof CFACClaimFlowMode.EverydayProtection)) {
            if (!Intrinsics.f(cFACClaimFlowMode, CFACClaimFlowMode.Native.f74972a)) {
                throw new NoWhenBranchMatchedException();
            }
            x2(new b(2));
            return;
        }
        CFACClaimFlowMode.EverydayProtection everydayProtection = (CFACClaimFlowMode.EverydayProtection) cFACClaimFlowMode;
        String insuranceId = everydayProtection.f74970a;
        dl7.a subtype = everydayProtection.f74971b;
        mu7.a aVar = this.f254628q;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(insuranceId, "insuranceId");
        Intrinsics.checkNotNullParameter(subtype, "subtype");
        yji.l.a1(this, nim.a.v(aVar.f208991a.b(insuranceId, subtype), new b(1)), null, null, new r5e.e(this, null, 28), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f254629r;
    }
}
