package ql6;

import com.revolut.domain.models.openbanking.OpenBankingConsent;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.consents_list.ConsentsListScreen;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.consents_list.ConsentsListScreenContract$OutputData;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ConsentsListScreen f247210w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(ConsentsListScreen consentsListScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f247210w = consentsListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                l lVar = new l(this.f247210w, continuation, 0);
                lVar.v = obj2;
                return lVar;
            default:
                l lVar2 = new l(this.f247210w, continuation, 1);
                lVar2.v = obj2;
                return lVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        OpenBankingConsent openBankingConsent = (OpenBankingConsent) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((l) create(openBankingConsent, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ConsentsListScreen consentsListScreen = this.f247210w;
        switch (i) {
            case 0:
                OpenBankingConsent consent = (OpenBankingConsent) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.external_accounts.impl.ui.consents_kompot.consents_list.a aVar2 = (com.revolut.feature.external_accounts.impl.ui.consents_kompot.consents_list.a) consentsListScreen.d3();
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(consent, "consent");
                List list = (List) ((m) ((j2) aVar2.f72788p.f22677a).getValue()).f247213c.getContent();
                aVar2.C2(new ConsentsListScreenContract$OutputData.ConsentClicked(consent, list != null && list.size() == 1));
                break;
            default:
                OpenBankingConsent consent2 = (OpenBankingConsent) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.external_accounts.impl.ui.consents_kompot.consents_list.a aVar4 = (com.revolut.feature.external_accounts.impl.ui.consents_kompot.consents_list.a) consentsListScreen.d3();
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(consent2, "consent");
                List list2 = (List) ((m) ((j2) aVar4.f72788p.f22677a).getValue()).f247213c.getContent();
                aVar4.C2(new ConsentsListScreenContract$OutputData.RevokeClicked(consent2, list2 != null && list2.size() == 1));
                break;
        }
        return Unit.f186387a;
    }
}
