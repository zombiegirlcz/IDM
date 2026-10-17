package bek;

import com.revolut.feature.external_accounts.api.model.Mandate;
import com.revolut.feature.external_accounts.impl.domain.india.netbanking.model.IndiaNetBankingInstitutions;
import com.revolut.feature.external_accounts.impl.domain.india.upi.model.IndiaUpiApplications;
import com.revolut.feature.external_accounts.impl.domain.pse.model.PseInstitutions;
import com.revolut.feature.push_to_card.api.data.CardOwner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class d implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f14864b;

    public /* synthetic */ d(j jVar, int i) {
        this.f14863a = i;
        this.f14864b = jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f14863a) {
            case 0:
                List domain = (List) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(domain, "domain");
                this.f14864b.f("CardOwnersListKey", domain);
                break;
            case 1:
                String institutionId = (String) obj2;
                List branches = (List) obj3;
                Intrinsics.checkNotNullParameter(institutionId, "institutionId");
                Intrinsics.checkNotNullParameter(branches, "branches");
                this.f14864b.f("BRANCHES_MEMORY_CACHE_KEY_" + institutionId, branches);
                break;
            case 2:
                se6.e institutions = (se6.e) obj3;
                Intrinsics.checkNotNullParameter((se6.g) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(institutions, "institutions");
                this.f14864b.f("INSTITUTIONS_MEMORY_CACHE_KEY", institutions);
                break;
            case 3:
                String globalInstitutionId = (String) obj2;
                List departments = (List) obj3;
                Intrinsics.checkNotNullParameter(globalInstitutionId, "globalInstitutionId");
                Intrinsics.checkNotNullParameter(departments, "departments");
                this.f14864b.f("COUNTRY_DEPARTMENTS_MEMORY_CACHE_KEY_" + globalInstitutionId, departments);
                break;
            case 4:
                String methodType = (String) obj2;
                IndiaUpiApplications model = (IndiaUpiApplications) obj3;
                Intrinsics.checkNotNullParameter(methodType, "methodType");
                Intrinsics.checkNotNullParameter(model, "model");
                this.f14864b.f("INDIA_UPI_MEMORY_KEY_" + methodType, model);
                break;
            case 5:
                Mandate domain2 = (Mandate) obj3;
                Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(domain2, "domain");
                j jVar = this.f14864b;
                List list = (List) jVar.get("MANDATE_LIST_KEY");
                if (list == null) {
                    list = f0.f322471a;
                }
                int size = list.size();
                ArrayList arrayListF1 = d0.f1(list);
                Iterator it8 = arrayListF1.iterator();
                int i = 0;
                while (true) {
                    if (!it8.hasNext()) {
                        i = -1;
                    } else if (!Intrinsics.f(((Mandate) it8.next()).f72224a, domain2.f72224a)) {
                        i++;
                    }
                }
                if (i >= 0) {
                    arrayListF1.set(i, domain2);
                } else {
                    arrayListF1.add(size, domain2);
                }
                jVar.f("MANDATE_LIST_KEY", arrayListF1);
                break;
            case 6:
                List domain3 = (List) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(domain3, "domain");
                this.f14864b.f("MANDATE_LIST_KEY", domain3);
                break;
            case 7:
                PseInstitutions model2 = (PseInstitutions) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(model2, "model");
                this.f14864b.f("PSE_MEMORY_KEY", model2);
                break;
            case 8:
                List domain4 = (List) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(domain4, "domain");
                this.f14864b.f("CardOwnersListKey", domain4);
                break;
            case 9:
                CardOwner domain5 = (CardOwner) obj3;
                Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(domain5, "domain");
                j jVar2 = this.f14864b;
                Iterable iterable = (List) jVar2.get("CardOwnersListKey");
                if (iterable == null) {
                    iterable = f0.f322471a;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : iterable) {
                    if (!Intrinsics.f(((CardOwner) obj4).f81490a, domain5.f81490a)) {
                        arrayList.add(obj4);
                    }
                }
                jVar2.f("CardOwnersListKey", d0.F0(domain5, arrayList));
                break;
            default:
                IndiaNetBankingInstitutions model3 = (IndiaNetBankingInstitutions) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(model3, "model");
                this.f14864b.f("NET_BANKING_MEMORY_KEY", model3);
                break;
        }
        return Unit.f186387a;
    }
}
