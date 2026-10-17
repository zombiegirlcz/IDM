package lf6;

import com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.OpenBankingBrazilLinkedAccountsGroup;
import com.revolut.feature.external_accounts.models.open_banking_brazil.ThirdPartyBrazil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nf6.c;
import yhm.o;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ j v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(j jVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = jVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.v, continuation, 0);
            default:
                return new f(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((f) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ArrayList arrayList = null;
        j jVar = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                nf6.b bVar = (nf6.b) j6.a.k(nf6.b.class, jVar.f194654c, "CONSENTS_STORAGE_KEY");
                if (bVar == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(bVar, "<this>");
                List listA = bVar.getGroupedConsents();
                ArrayList arrayList2 = new ArrayList(w.t(listA, 10));
                Iterator it8 = listA.iterator();
                while (it8.hasNext()) {
                    arrayList2.add(qf6.a.b((nf6.a) it8.next()));
                }
                List listB = bVar.getInboundGroupedConsents();
                if (listB != null) {
                    List list = listB;
                    arrayList = new ArrayList(w.t(list, 10));
                    Iterator it9 = list.iterator();
                    while (it9.hasNext()) {
                        arrayList.add(qf6.a.b((nf6.a) it9.next()));
                    }
                }
                return new og6.a(arrayList2, arrayList, bVar.getUserHasPixAutomatico());
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                nf6.d dVar = (nf6.d) j6.a.k(nf6.d.class, jVar.f194654c, "LINKED_ACCOUNTS_STORAGE_KEY");
                if (dVar == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(dVar, "<this>");
                List<nf6.c> listA2 = dVar.getGroupedLinkedAccounts();
                ArrayList arrayList3 = new ArrayList(w.t(listA2, 10));
                for (nf6.c cVar : listA2) {
                    Intrinsics.checkNotNullParameter(cVar, "<this>");
                    ThirdPartyBrazil thirdPartyBrazilY = foh.i.y(cVar.getThirdParty());
                    List<c.C1202c> listA3 = cVar.getLinkedAccounts();
                    ArrayList arrayList4 = new ArrayList(w.t(listA3, 10));
                    for (c.C1202c c1202c : listA3) {
                        Intrinsics.checkNotNullParameter(c1202c, "<this>");
                        arrayList4.add(new OpenBankingBrazilLinkedAccountsGroup.LinkedAccount(c1202c.getId(), c1202c.getAccountDescription()));
                    }
                    arrayList3.add(new OpenBankingBrazilLinkedAccountsGroup(thirdPartyBrazilY, arrayList4));
                }
                return new og6.g(arrayList3);
        }
    }
}
