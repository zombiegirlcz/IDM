package ij7;

import com.revolut.feature.insurance.api.models.details.CFACCancellationReason;
import com.revolut.feature.insurance.api.models.details.CFACClaimFlowMode;
import com.revolut.feature.insurance.api.models.details.CFACCoverageType;
import com.revolut.feature.insurance.api.models.details.CFACDocument;
import com.revolut.feature.insurance.api.models.details.CFACExcess;
import com.revolut.feature.insurance.api.models.details.CFACReimbursement;
import com.revolut.feature.insurance.api.models.details.CFACReimbursementLimits;
import java.util.ArrayList;
import java.util.List;
import jj7.g0;
import jj7.h0;
import jj7.q;
import jj7.x;
import jj7.y;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import le.u1;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f161720a = r0.k(new Pair("TRANSPORTATION", CFACCoverageType.TRANSPORTATION), new Pair("ACCOMMODATION", CFACCoverageType.ACCOMMODATION), new Pair("TRANSPORTATION_BOOKINGS", CFACCoverageType.TRANSPORTATION_BOOKINGS), new Pair("SPORT_RENTALS", CFACCoverageType.SPORT_RENTALS), new Pair("EVENTS", CFACCoverageType.EVENTS), new Pair("SPORT_RENTALS_AND_EVENTS", CFACCoverageType.SPORT_RENTALS_AND_EVENTS), new Pair("ATTRACTIONS", CFACCoverageType.ATTRACTIONS));

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, java.util.Map] */
    public static final CFACReimbursement a(g0 g0Var) {
        CFACClaimFlowMode everydayProtection;
        Intrinsics.checkNotNullParameter(g0Var, "<this>");
        long reimbursementPercentage = g0Var.getReimbursementPercentage();
        h0 limits = g0Var.getLimits();
        Intrinsics.checkNotNullParameter(limits, "<this>");
        CFACReimbursementLimits cFACReimbursementLimits = new CFACReimbursementLimits(mo3.a.o(limits.getAnnual()), mo3.a.o(limits.getPerClaim()));
        y excessPayable = g0Var.getExcessPayable();
        Intrinsics.checkNotNullParameter(excessPayable, "<this>");
        jo3.a money = excessPayable.getMoney();
        CFACExcess cFACExcess = new CFACExcess(money != null ? mo3.a.o(money) : null, excessPayable.getPercentage());
        ArrayList arrayListB = b(g0Var.getEligibleCancellationReasons());
        List documents = g0Var.getDocuments();
        Intrinsics.checkNotNullParameter(documents, "<this>");
        List<x> list = documents;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (x xVar : list) {
            arrayList.add(new CFACDocument(xVar.getName(), xVar.getType(), xVar.getUrl(), xVar.getText()));
        }
        List remarks = g0Var.getRemarks();
        q claimFlow = g0Var.getClaimFlow();
        Intrinsics.checkNotNullParameter(claimFlow, "<this>");
        if (!a0.z(claimFlow.getMode(), "EVERYDAY_PROTECTION", true) || claimFlow.getPolicyId() == null || claimFlow.getPolicySubtype() == null) {
            everydayProtection = CFACClaimFlowMode.Native.f74972a;
        } else {
            String policyId = claimFlow.getPolicyId();
            dl7.a aVar = (dl7.a) u1.v(claimFlow.getPolicySubtype(), gj7.a.f144239b);
            if (aVar == null) {
                aVar = dl7.a.UNKNOWN;
            }
            everydayProtection = new CFACClaimFlowMode.EverydayProtection(policyId, aVar);
        }
        return new CFACReimbursement(reimbursementPercentage, cFACReimbursementLimits, cFACExcess, arrayListB, arrayList, remarks, everydayProtection);
    }

    public static final ArrayList b(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<jj7.a> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (jj7.a aVar : list2) {
            String type = aVar.getType();
            String code = aVar.getCode();
            String name = aVar.getName();
            String applicableDocuments = aVar.getApplicableDocuments();
            List reasons = aVar.getReasons();
            arrayList.add(new CFACCancellationReason(type, code, name, applicableDocuments, reasons != null ? b(reasons) : null));
        }
        return arrayList;
    }
}
