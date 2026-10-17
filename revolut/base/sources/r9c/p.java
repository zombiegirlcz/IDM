package r9c;

import com.revolut.data.model.Data;
import com.revolut.feature.revolutpay.impl.ui.summary_screen.RevolutPaySummaryScreenContract$InputData;
import com.revolut.tracking.v3.RevolutPayBasicContext;
import grl.aa;
import grl.ca;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o9c.s;
import q9c.r;
import u6c.d0;
import u6c.e0;
import u6c.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevolutPaySummaryScreenContract$InputData f252569a;

    public p(RevolutPaySummaryScreenContract$InputData inputData, gec.h sharedMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(sharedMapper, "sharedMapper");
        this.f252569a = inputData;
    }

    public final RevolutPayBasicContext a(s domainState) {
        String strA;
        String strB;
        aa aaVar;
        ca caVar;
        p6c.b bVar;
        f6c.a aVar;
        s6c.p pVarA;
        dj0.d dVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.i;
        Data data2 = domainState.f223236r;
        f0 f0Var = (f0) data.getContent();
        r rVar = (r) domainState.f223229h.getContent();
        if (f0Var == null || rVar == null) {
            f0Var = null;
        }
        boolean zJ = pd.b.j((rVar == null || (pVarA = rVar.a()) == null || (dVar = pVarA.f260233b) == null) ? null : Boolean.valueOf(dVar.f(dj0.d.e)));
        boolean z = false;
        boolean z3 = (rVar != null ? rVar.a() : null) != null;
        RevolutPaySummaryScreenContract$InputData revolutPaySummaryScreenContract$InputData = this.f252569a;
        q9c.c cVarZ = revolutPaySummaryScreenContract$InputData.z();
        if (cVarZ instanceof q9c.a) {
            strA = ((q9c.a) cVarZ).f243852a;
        } else {
            if (!(cVarZ instanceof q9c.b)) {
                throw new NoWhenBranchMatchedException();
            }
            q9c.f fVar = (q9c.f) data2.getContent();
            strA = fVar != null ? fVar.a() : null;
        }
        q9c.c cVarZ2 = revolutPaySummaryScreenContract$InputData.z();
        if (cVarZ2 instanceof q9c.a) {
            strB = ((q9c.a) cVarZ2).f243853b;
        } else {
            if (!(cVarZ2 instanceof q9c.b)) {
                throw new NoWhenBranchMatchedException();
            }
            q9c.f fVar2 = (q9c.f) data2.getContent();
            strB = fVar2 != null ? fVar2.b() : null;
        }
        boolean z4 = revolutPaySummaryScreenContract$InputData instanceof RevolutPaySummaryScreenContract$InputData.Standard;
        RevolutPaySummaryScreenContract$InputData.Standard standard = z4 ? (RevolutPaySummaryScreenContract$InputData.Standard) revolutPaySummaryScreenContract$InputData : null;
        if (standard == null || (aVar = standard.k) == null) {
            aaVar = null;
        } else {
            int i = o.f252568a[aVar.ordinal()];
            if (i == 1) {
                aaVar = aa.regular;
            } else if (i == 2) {
                aaVar = aa.sdk_exported;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                aaVar = aa.web_payment;
            }
        }
        RevolutPaySummaryScreenContract$InputData.Standard standard2 = z4 ? (RevolutPaySummaryScreenContract$InputData.Standard) revolutPaySummaryScreenContract$InputData : null;
        if (standard2 == null || (bVar = standard2.f84529l) == null) {
            caVar = null;
        } else {
            Intrinsics.checkNotNullParameter(bVar, "<this>");
            int i2 = gec.b.f143277a[bVar.ordinal()];
            if (i2 == 1) {
                caVar = ca.retail;
            } else if (i2 == 2) {
                caVar = ca.retail_only;
            } else if (i2 == 3) {
                caVar = ca.business;
            } else {
                if (i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                caVar = ca.business_only;
            }
        }
        if (strA == null || strB == null) {
            return null;
        }
        RevolutPayBasicContext.a aVarNewBuilder = RevolutPayBasicContext.newBuilder();
        aVarNewBuilder.c();
        ((RevolutPayBasicContext) aVarNewBuilder.f49761b).setOrderToken(strA);
        aVarNewBuilder.c();
        ((RevolutPayBasicContext) aVarNewBuilder.f49761b).setMerchantPublicKey(strB);
        if (f0Var != null) {
            if ((f0Var instanceof e0) && ((e0) f0Var).f277552b.contains(d0.INSUFFICIENT_BALANCE)) {
                z = true;
            }
            aVarNewBuilder.c();
            ((RevolutPayBasicContext) aVarNewBuilder.f49761b).setEarnsPoints(zJ);
            aVarNewBuilder.c();
            ((RevolutPayBasicContext) aVarNewBuilder.f49761b).setInsufficientFunds(z);
            aVarNewBuilder.c();
            ((RevolutPayBasicContext) aVarNewBuilder.f49761b).setPointsRedemptionShown(z3);
        }
        if (aaVar != null) {
            aVarNewBuilder.c();
            ((RevolutPayBasicContext) aVarNewBuilder.f49761b).setFlowSource(aaVar);
        }
        if (caVar != null) {
            aVarNewBuilder.c();
            ((RevolutPayBasicContext) aVarNewBuilder.f49761b).setPreferredMode(caVar);
        }
        return (RevolutPayBasicContext) aVarNewBuilder.a();
    }
}
