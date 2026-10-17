package zi7;

import aj7.b0;
import aj7.c0;
import aj7.l;
import aj7.s;
import aj7.t;
import com.revolut.feature.insurance.api.models.details.CFACCancellationReason;
import com.revolut.feature.insurance.api.models.details.CFACClaimFlowMode;
import com.revolut.feature.insurance.api.models.details.CFACDocument;
import com.revolut.feature.insurance.api.models.details.CFACExcess;
import com.revolut.feature.insurance.api.models.details.CFACReimbursement;
import com.revolut.feature.insurance.api.models.details.CFACReimbursementLimits;
import dj0.d;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {
    public static final CFACReimbursement a(b0 b0Var) {
        Intrinsics.checkNotNullParameter(b0Var, "<this>");
        long reimbursementPercentage = b0Var.getReimbursementPercentage();
        c0 limits = b0Var.getLimits();
        Intrinsics.checkNotNullParameter(limits, "<this>");
        CFACReimbursementLimits cFACReimbursementLimits = new CFACReimbursementLimits(hx7.a.v(limits.getAnnual()), hx7.a.v(limits.getPerClaim()));
        t excessPayable = b0Var.getExcessPayable();
        Intrinsics.checkNotNullParameter(excessPayable, "<this>");
        jo3.b money = excessPayable.getMoney();
        CFACExcess cFACExcess = new CFACExcess(money != null ? hx7.a.v(money) : null, excessPayable.getPercentage());
        ArrayList arrayListB = b(b0Var.getEligibleCancellationReasons());
        List documents = b0Var.getDocuments();
        Intrinsics.checkNotNullParameter(documents, "<this>");
        List<s> list = documents;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (s sVar : list) {
            arrayList.add(new CFACDocument(sVar.getName(), sVar.getType(), sVar.getUrl(), sVar.getText()));
        }
        List remarks = b0Var.getRemarks();
        l claimFlow = b0Var.getClaimFlow();
        Intrinsics.checkNotNullParameter(claimFlow, "<this>");
        return new CFACReimbursement(reimbursementPercentage, cFACReimbursementLimits, cFACExcess, arrayListB, arrayList, remarks, (!a0.z(claimFlow.getMode(), "EVERYDAY_PROTECTION", true) || claimFlow.getPolicyId() == null || claimFlow.getPolicySubtype() == null) ? CFACClaimFlowMode.Native.f74972a : new CFACClaimFlowMode.EverydayProtection(claimFlow.getPolicyId(), ebm.a.H(claimFlow.getPolicySubtype())));
    }

    public static final ArrayList b(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<aj7.a> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (aj7.a aVar : list2) {
            String type = aVar.getType();
            String code = aVar.getCode();
            String name = aVar.getName();
            String applicableDocuments = aVar.getApplicableDocuments();
            List reasons = aVar.getReasons();
            arrayList.add(new CFACCancellationReason(type, code, name, applicableDocuments, reasons != null ? b(reasons) : null));
        }
        return arrayList;
    }

    public static final b0 c(CFACReimbursement cFACReimbursement) {
        l lVar;
        Intrinsics.checkNotNullParameter(cFACReimbursement, "<this>");
        long j2 = cFACReimbursement.f75007a;
        CFACReimbursementLimits cFACReimbursementLimits = cFACReimbursement.f75008b;
        Intrinsics.checkNotNullParameter(cFACReimbursementLimits, "<this>");
        c0 c0Var = new c0(hx7.a.A(cFACReimbursementLimits.f75011a), hx7.a.A(cFACReimbursementLimits.f75012b));
        CFACExcess cFACExcess = cFACReimbursement.f75009c;
        Intrinsics.checkNotNullParameter(cFACExcess, "<this>");
        d dVar = cFACExcess.f74986a;
        t tVar = new t(dVar != null ? hx7.a.A(dVar) : null, cFACExcess.f74987b);
        ArrayList arrayListD = d(cFACReimbursement.d);
        ArrayList<CFACDocument> arrayList = cFACReimbursement.e;
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (CFACDocument cFACDocument : arrayList) {
            arrayList2.add(new s(cFACDocument.f74983a, cFACDocument.f74984b, cFACDocument.f74985c, cFACDocument.d));
        }
        List list = cFACReimbursement.f;
        CFACClaimFlowMode cFACClaimFlowMode = cFACReimbursement.f75010g;
        Intrinsics.checkNotNullParameter(cFACClaimFlowMode, "<this>");
        if (cFACClaimFlowMode instanceof CFACClaimFlowMode.EverydayProtection) {
            CFACClaimFlowMode.EverydayProtection everydayProtection = (CFACClaimFlowMode.EverydayProtection) cFACClaimFlowMode;
            lVar = new l(ebm.a.K(everydayProtection.f74971b), "EVERYDAY_PROTECTION", everydayProtection.f74970a);
        } else {
            if (!Intrinsics.f(cFACClaimFlowMode, CFACClaimFlowMode.Native.f74972a)) {
                throw new NoWhenBranchMatchedException();
            }
            lVar = new l(null, "NATIVE", null);
        }
        return new b0(j2, c0Var, tVar, arrayListD, arrayList2, list, lVar);
    }

    public static final ArrayList d(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<CFACCancellationReason> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (CFACCancellationReason cFACCancellationReason : list2) {
            String str = cFACCancellationReason.f74967a;
            String str2 = cFACCancellationReason.f74968b;
            String str3 = cFACCancellationReason.f74969c;
            String str4 = cFACCancellationReason.e;
            List list3 = cFACCancellationReason.d;
            arrayList.add(new aj7.a(str, str2, str3, str4, list3 != null ? d(list3) : null));
        }
        return arrayList;
    }
}
