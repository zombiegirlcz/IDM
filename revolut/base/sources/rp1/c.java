package rp1;

import com.revolut.business.feature.referrals.model.RewardTargetAccount;
import com.revolut.chat.domain.model.draft.DraftRoutingKey;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPaymentMethod;
import com.revolut.feature.trading_asset_quotes.api.domain.models.FiatExchangeOrderQuoteParams;
import com.revolut.oauth.api.consent.OAuthAuthorizeParams;
import com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentNotAvailableError;
import java.util.UUID;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import nii.l1;
import wf0.d0;
import wf0.e0;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c() {
        super(2, null);
        this.u = 16;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(2, 0, continuation);
            case 1:
                return new c(2, 1, continuation);
            case 2:
                return new c(2, 2, continuation);
            case 3:
                return new c(2, 3, continuation);
            case 4:
                return new c(2, 4, continuation);
            case 5:
                return new c(2, 5, continuation);
            case 6:
                return new c(2, 6, continuation);
            case 7:
                return new c(2, 7, continuation);
            case 8:
                return new c(2, 8, continuation);
            case 9:
                return new c(2, 9, continuation);
            case 10:
                return new c(2, 10, continuation);
            case 11:
                return new c(2, 11, continuation);
            case 12:
                return new c(2, 12, continuation);
            case 13:
                return new c(2, 13, continuation);
            case 14:
                return new c(2, 14, continuation);
            case 15:
                return new c(2, 15, continuation);
            case 16:
                return new c(2, 16, continuation);
            case 17:
                return new c(2, 17, continuation);
            case 18:
                return new c(2, 18, continuation);
            case 19:
                return new c(2, 19, continuation);
            case 20:
                return new c(2, 20, continuation);
            case 21:
                return new c(2, 21, continuation);
            case 22:
                return new c(2, 22, continuation);
            case 23:
                return new c(2, 23, continuation);
            case 24:
                return new c(2, 24, continuation);
            case 25:
                return new c(2, 25, continuation);
            case 26:
                return new c(2, 26, continuation);
            case 27:
                return new c(2, 27, continuation);
            case 28:
                return new c(2, 28, continuation);
            default:
                return new c(2, 29, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) throws PendingPaymentNotAvailableError {
        switch (this.u) {
            case 0:
                ((c) create((xo1.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                return null;
            case 1:
                ((c) create((RewardTargetAccount) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                return null;
            case 2:
                ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                return null;
            case 3:
                ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                return null;
            case 4:
                ((c) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                throw null;
            case 5:
                ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                return sy.f.f266543a;
            case 6:
                ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                return null;
            case 7:
                ((c) create((th6.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                return null;
            case 8:
                ((c) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                throw null;
            case 9:
                ((c) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                throw null;
            case 10:
                ((c) create((trb.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                return null;
            case 11:
                ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                return null;
            case 12:
                ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                return null;
            case 13:
                return ((c) create((l1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                ((c) create((uyd.e) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                return null;
            case 15:
                ((c) create((uyd.e) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                return null;
            case 16:
                ((c) create((UUID) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                return null;
            case 17:
                ((c) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                throw null;
            case 18:
                ((c) create((OAuthAuthorizeParams) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                return null;
            case 19:
                ((c) create((ApmPaymentAuthorisationPaymentMethod) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                return null;
            case 20:
                ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                return null;
            case 21:
                ((c) create((ApmPaymentAuthorisationPaymentMethod) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                return null;
            case 22:
                ((c) create((DraftRoutingKey) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                return null;
            case 23:
                ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                return null;
            case 24:
                ((c) create((FiatExchangeOrderQuoteParams) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                return null;
            case 25:
                ((c) create((wf0.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                return null;
            case 26:
                ((c) create((wf0.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                return null;
            case 27:
                ((c) create((d0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                return null;
            case 28:
                ((c) create((e0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                return null;
            default:
                ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                return null;
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws PendingPaymentNotAvailableError {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return null;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return null;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return null;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return null;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                throw PendingPaymentNotAvailableError.f102408a;
            case 5:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return sy.f.f266543a;
            case 6:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return null;
            case 7:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return null;
            case 8:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                throw PendingPaymentNotAvailableError.f102408a;
            case 9:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                throw PendingPaymentNotAvailableError.f102408a;
            case 10:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return null;
            case 11:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return null;
            case 12:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return null;
            case 13:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return Unit.f186387a;
            case 14:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return null;
            case 15:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return null;
            case 16:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return null;
            case 17:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                throw PendingPaymentNotAvailableError.f102408a;
            case 18:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return null;
            case 19:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return null;
            case 20:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return null;
            case 21:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return null;
            case 22:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return null;
            case 23:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return null;
            case 24:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return null;
            case 25:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return null;
            case 26:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return null;
            case 27:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return null;
            case 28:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return null;
            default:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.u = i2;
    }
}
