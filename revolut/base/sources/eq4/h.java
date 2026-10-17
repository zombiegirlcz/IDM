package eq4;

import aii.u;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.models.CreditAccountType;
import com.revolut.feature.tab.accounts.api.model.TabAccountsInitialPayload;
import com.revolut.feature.tab.accounts.api.model.TabAccountsShotDialogAction;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class h extends i implements Function2 {
    public com.revolut.feature.credit.card.impl.ui.cancellation.flow.withdrawal.d u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.card.impl.ui.cancellation.flow.withdrawal.d f128246w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.revolut.feature.credit.card.impl.ui.cancellation.flow.withdrawal.d dVar, Continuation continuation) {
        super(2, continuation);
        this.f128246w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new h(this.f128246w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        com.revolut.feature.credit.card.impl.ui.cancellation.flow.withdrawal.d dVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        com.revolut.feature.credit.card.impl.ui.cancellation.flow.withdrawal.d dVar2 = this.f128246w;
        if (i == 0) {
            o.b(obj2);
            wie.a aVar2 = dVar2.u;
            CreditAccountType.CreditCard creditCard = new CreditAccountType.CreditCard(dVar2.f69158s.f69149a);
            TabAccountsInitialPayload.Action action = new TabAccountsInitialPayload.Action(new TabAccountsShotDialogAction.Success(new TextLocalisedClause(R$string.credit_card_cancellation_success_withdrawn, null, null, 14), null));
            this.u = dVar2;
            this.v = 1;
            obj2 = aVar2.c(creditCard, action, this);
            if (obj2 == aVar) {
                return aVar;
            }
            dVar = dVar2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dVar = this.u;
            o.b(obj2);
        }
        dVar.C1((u) obj2);
        oki.h.D2(dVar2.f69160w);
        return Unit.f186387a;
    }
}
