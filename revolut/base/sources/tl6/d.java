package tl6;

import com.revolut.domain.models.openbanking.OpenBankingConsent;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.inactive_consents_list.InactiveConsentsListScreen;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.inactive_consents_list.InactiveConsentsListScreenContract$OutputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ InactiveConsentsListScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(InactiveConsentsListScreen inactiveConsentsListScreen, Continuation continuation) {
        super(2, continuation);
        this.v = inactiveConsentsListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((OpenBankingConsent.Australia) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        OpenBankingConsent.Australia consent = (OpenBankingConsent.Australia) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        com.revolut.feature.external_accounts.impl.ui.consents_kompot.inactive_consents_list.a aVar2 = (com.revolut.feature.external_accounts.impl.ui.consents_kompot.inactive_consents_list.a) ((f) this.v.P.getValue());
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(consent, "consent");
        aVar2.C2(new InactiveConsentsListScreenContract$OutputData.ConsentClicked(consent));
        return Unit.f186387a;
    }
}
