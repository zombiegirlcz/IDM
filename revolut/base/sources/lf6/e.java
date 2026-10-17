package lf6;

import com.revolut.feature.external_accounts.impl.data.open_banking_brazil.OpenBankingBrazilService;
import com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.OpenBankingBrazilLinkedAccountsGroup;
import com.revolut.feature.external_accounts.models.open_banking_brazil.ThirdPartyBrazil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import mf6.e;
import yhm.o;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f194643w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(j jVar, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f194643w = jVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                return new e(this.f194643w, continuation, 0).invokeSuspend(Unit.f186387a);
            default:
                return new e(this.f194643w, continuation, 1).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ArrayList arrayList;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    OpenBankingBrazilService openBankingBrazilService = this.f194643w.f194653b;
                    this.v = 1;
                    obj2 = openBankingBrazilService.getConsentsGroups(this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                mf6.d dVar = (mf6.d) obj2;
                Intrinsics.checkNotNullParameter(dVar, "<this>");
                List groupedConsents = dVar.getGroupedConsents();
                ArrayList arrayList2 = new ArrayList(w.t(groupedConsents, 10));
                Iterator it8 = groupedConsents.iterator();
                while (it8.hasNext()) {
                    arrayList2.add(qf6.a.a((mf6.c) it8.next()));
                }
                List inboundGroupedConsents = dVar.getInboundGroupedConsents();
                if (inboundGroupedConsents != null) {
                    List list = inboundGroupedConsents;
                    arrayList = new ArrayList(w.t(list, 10));
                    Iterator it9 = list.iterator();
                    while (it9.hasNext()) {
                        arrayList.add(qf6.a.a((mf6.c) it9.next()));
                    }
                } else {
                    arrayList = null;
                }
                return new og6.a(arrayList2, arrayList, dVar.getUserHasPixAutomatico());
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    OpenBankingBrazilService openBankingBrazilService2 = this.f194643w.f194653b;
                    this.v = 1;
                    obj2 = openBankingBrazilService2.getOutboundLinkedAccounts(this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                mf6.a aVar3 = (mf6.a) obj2;
                Intrinsics.checkNotNullParameter(aVar3, "<this>");
                List<mf6.e> groupedLinkedAccounts = aVar3.getGroupedLinkedAccounts();
                ArrayList arrayList3 = new ArrayList(w.t(groupedLinkedAccounts, 10));
                for (mf6.e eVar : groupedLinkedAccounts) {
                    Intrinsics.checkNotNullParameter(eVar, "<this>");
                    ThirdPartyBrazil thirdPartyBrazilX = foh.i.x(eVar.getThirdParty());
                    List<e.a> linkedAccountConsents = eVar.getLinkedAccountConsents();
                    ArrayList arrayList4 = new ArrayList(w.t(linkedAccountConsents, 10));
                    for (e.a aVar4 : linkedAccountConsents) {
                        Intrinsics.checkNotNullParameter(aVar4, "<this>");
                        arrayList4.add(new OpenBankingBrazilLinkedAccountsGroup.LinkedAccount(aVar4.getConsentId(), aVar4.getDescription()));
                    }
                    arrayList3.add(new OpenBankingBrazilLinkedAccountsGroup(thirdPartyBrazilX, arrayList4));
                }
                return new og6.g(arrayList3);
        }
    }
}
