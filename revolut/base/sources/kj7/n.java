package kj7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jj7.q0;
import jj7.u0;
import jj7.v0;
import jj7.w0;
import jj7.x0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import le.u1;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n extends q implements Function1 {
    public static final n f = new n();

    public n() {
        super(1, gj7.b.class, "toDomain", "toDomain(Lcom/revolut/feature/insurance/impl/network/models/PlanInsuranceReviewDetailsDto;)Lcom/revolut/feature/insurance/api/models/PlanInsuranceReviewDetails;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ArrayList arrayList;
        x0 p0 = (x0) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p0, "<this>");
        List data = p0.getData();
        if (data != null) {
            Intrinsics.checkNotNullParameter(data, "<this>");
            List<v0> list = data;
            ArrayList arrayList2 = new ArrayList(w.t(list, 10));
            for (v0 v0Var : list) {
                Intrinsics.checkNotNullParameter(v0Var, "<this>");
                ti7.i iVar = (ti7.i) u1.v(v0Var.getType(), gj7.b.n());
                if (iVar == null) {
                    iVar = ti7.i.UNKNOWN;
                }
                ti7.i iVar2 = iVar;
                String title = v0Var.getTitle();
                List documentsInfo = v0Var.getDocumentsInfo();
                if (documentsInfo == null) {
                    documentsInfo = f0.f322471a;
                }
                List list2 = documentsInfo;
                ArrayList arrayList3 = new ArrayList(w.t(list2, 10));
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    arrayList3.add(gj7.b.R((w0) it8.next()));
                }
                List conditions = v0Var.getConditions();
                Intrinsics.checkNotNullParameter(conditions, "<this>");
                List<u0> list3 = conditions;
                ArrayList arrayList4 = new ArrayList(w.t(list3, 10));
                for (u0 u0Var : list3) {
                    Intrinsics.checkNotNullParameter(u0Var, "<this>");
                    arrayList4.add(new ti7.g(u0Var.getName(), u0Var.getValue()));
                }
                arrayList2.add(new ti7.h(iVar2, title, arrayList3, arrayList4, v0Var.getOtherProvidersUrl()));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        List suitabilityStatement = p0.getSuitabilityStatement();
        if (suitabilityStatement == null) {
            suitabilityStatement = f0.f322471a;
        }
        String generalInfoUrl = p0.getGeneralInfoUrl();
        w0 claimsEligibilityStatement = p0.getClaimsEligibilityStatement();
        ti7.j jVarR = claimsEligibilityStatement != null ? gj7.b.R(claimsEligibilityStatement) : null;
        q0 documentsBanner = p0.getDocumentsBanner();
        return new ti7.f(arrayList, suitabilityStatement, generalInfoUrl, jVarR, documentsBanner != null ? new ti7.a(documentsBanner.getTitle(), documentsBanner.getSubtitle()) : null, p0.getFooter());
    }
}
