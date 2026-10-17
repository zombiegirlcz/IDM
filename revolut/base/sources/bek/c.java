package bek;

import com.revolut.feature.external_accounts.api.model.Mandate;
import com.revolut.feature.external_accounts.impl.domain.india.netbanking.model.IndiaNetBankingInstitutions;
import com.revolut.feature.external_accounts.impl.domain.india.upi.model.IndiaUpiApplications;
import com.revolut.feature.external_accounts.impl.domain.pse.model.PseInstitutions;
import com.revolut.feature.push_to_card.api.data.CardOwner;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f14862b;

    public /* synthetic */ c(j jVar, int i) {
        this.f14861a = i;
        this.f14862b = jVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f14861a) {
            case 0:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return (List) this.f14862b.get("CardOwnersListKey");
            case 1:
                String institutionId = (String) obj2;
                Intrinsics.checkNotNullParameter(institutionId, "institutionId");
                return (List) this.f14862b.get("BRANCHES_MEMORY_CACHE_KEY_" + institutionId);
            case 2:
                se6.g it9 = (se6.g) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return (se6.e) this.f14862b.get("INSTITUTIONS_MEMORY_CACHE_KEY");
            case 3:
                String globalInstitutionId = (String) obj2;
                Intrinsics.checkNotNullParameter(globalInstitutionId, "globalInstitutionId");
                return (List) this.f14862b.get("COUNTRY_DEPARTMENTS_MEMORY_CACHE_KEY_" + globalInstitutionId);
            case 4:
                String methodType = (String) obj2;
                Intrinsics.checkNotNullParameter(methodType, "methodType");
                return (IndiaUpiApplications) this.f14862b.get("INDIA_UPI_MEMORY_KEY_" + methodType);
            case 5:
                String id10 = (String) obj2;
                Intrinsics.checkNotNullParameter(id10, "id");
                List list = (List) this.f14862b.get("MANDATE_LIST_KEY");
                Object obj3 = null;
                if (list == null) {
                    return null;
                }
                Iterator it10 = list.iterator();
                while (true) {
                    if (it10.hasNext()) {
                        Object next = it10.next();
                        if (Intrinsics.f(((Mandate) next).f72224a, id10)) {
                            obj3 = next;
                        }
                    }
                }
                return (Mandate) obj3;
            case 6:
                Unit it11 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return (List) this.f14862b.get("MANDATE_LIST_KEY");
            case 7:
                Unit it12 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return (PseInstitutions) this.f14862b.get("PSE_MEMORY_KEY");
            case 8:
                Unit it13 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return (List) this.f14862b.get("CardOwnersListKey");
            case 9:
                String id11 = (String) obj2;
                Intrinsics.checkNotNullParameter(id11, "id");
                List list2 = (List) this.f14862b.get("CardOwnersListKey");
                Object obj4 = null;
                if (list2 == null) {
                    return null;
                }
                Iterator it14 = list2.iterator();
                while (true) {
                    if (it14.hasNext()) {
                        Object next2 = it14.next();
                        if (Intrinsics.f(((CardOwner) next2).getF81490a(), id11)) {
                            obj4 = next2;
                        }
                    }
                }
                return (CardOwner) obj4;
            default:
                Unit it15 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return (IndiaNetBankingInstitutions) this.f14862b.get("NET_BANKING_MEMORY_KEY");
        }
    }
}
