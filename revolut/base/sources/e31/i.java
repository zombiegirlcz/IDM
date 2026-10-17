package e31;

import com.revolut.data.model.Data;
import com.revolut.data.network.models.topup.MultiCurrencyTransferReviewRequest;
import com.revolut.feature.retail.cfd.api.domain.models.MarginQuoteParams;
import com.revolut.retail.feature.api.userauth.models.UserAuthElement;
import com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentNotAvailableError;
import dj9.d0;
import g2e.f0;
import g2e.g0;
import g2e.l;
import g2e.u;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import nii.n1;
import qei.n;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i) {
        super(2, null);
        this.u = i;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i(2, 0, continuation);
            case 1:
                return new i(2, 1, continuation);
            case 2:
                return new i(2, 2, continuation);
            case 3:
                return new i(2, 3, continuation);
            case 4:
                return new i(2, 4, continuation);
            case 5:
                return new i(2, 5, continuation);
            case 6:
                return new i(2, 6, continuation);
            case 7:
                return new i(2, 7, continuation);
            case 8:
                return new i(2, 8, continuation);
            case 9:
                return new i(2, 9, continuation);
            case 10:
                return new i(2, 10, continuation);
            case 11:
                return new i(2, 11, continuation);
            case 12:
                return new i(2, 12, continuation);
            case 13:
                return new i(2, 13, continuation);
            case 14:
                return new i(2, 14, continuation);
            case 15:
                return new i(2, 15, continuation);
            case 16:
                return new i(2, 16, continuation);
            case 17:
                return new i(2, 17, continuation);
            case 18:
                return new i(2, 18, continuation);
            case 19:
                return new i(2, 19, continuation);
            case 20:
                return new i(2, 20, continuation);
            case 21:
                return new i(2, 21, continuation);
            case 22:
                return new i(2, 22, continuation);
            case 23:
                return new i(2, 23, continuation);
            case 24:
                return new i(2, 24, continuation);
            case 25:
                return new i(2, 25, continuation);
            case 26:
                return new i(2, 26, continuation);
            case 27:
                return new i(2, 27, continuation);
            case 28:
                return new i(2, 28, continuation);
            default:
                return new i(2, 29, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) throws PendingPaymentNotAvailableError {
        switch (this.u) {
            case 0:
                ((i) create((MultiCurrencyTransferReviewRequest) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                return null;
            case 1:
                ((i) create((e44.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                return null;
            case 2:
                ((i) create((d56.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                return null;
            case 3:
                ((i) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                return null;
            case 4:
                ((i) create((d0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                return null;
            case 5:
                ((i) create((f44.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                return null;
            case 6:
                ((i) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                throw null;
            case 7:
                ((i) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                return null;
            case 8:
                ((i) create((qei.g) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                return null;
            case 9:
                ((i) create((n) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                return null;
            case 10:
                ((i) create((cm1.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                return null;
            case 11:
                return ((i) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                ((i) create((kv1.g) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                return null;
            case 13:
                ((i) create((l) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                return null;
            case 14:
                ((i) create((u) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                return null;
            case 15:
                ((i) create((f0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                return null;
            case 16:
                ((i) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                return null;
            case 17:
                ((i) create((g0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                return null;
            case 18:
                ((i) create((MarginQuoteParams) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                return null;
            case 19:
                ((i) create((UserAuthElement) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                return Boolean.FALSE;
            case 20:
                return ((i) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                ((i) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                return null;
            case 22:
                Boolean bool = (Boolean) obj2;
                bool.booleanValue();
                ((i) create(bool, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                return null;
            case 23:
                ((i) create((ucc.g) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                return null;
            case 24:
                ((i) create((hng.n) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                return null;
            case 25:
                ((i) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                return null;
            case 26:
                ((i) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                return null;
            case 27:
                ((i) create((Throwable) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                return Boolean.TRUE;
            case 28:
                ((i) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                return null;
            default:
                return ((i) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
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
                return null;
            case 5:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return null;
            case 6:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                throw PendingPaymentNotAvailableError.f102408a;
            case 7:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return null;
            case 8:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return null;
            case 9:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return null;
            case 10:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return null;
            case 11:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return Unit.f186387a;
            case 12:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return null;
            case 13:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return null;
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
                return null;
            case 18:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return null;
            case 19:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return Boolean.FALSE;
            case 20:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                new Data(null, null, true, 3, null);
                return Unit.f186387a;
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
                return Boolean.TRUE;
            case 28:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return null;
            default:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.u = i2;
    }
}
