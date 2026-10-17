package pb2;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPaymentMethod;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction;
import com.revolut.feature.apm.payto.api.R$string;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import vkm.j2;

/* JADX INFO: loaded from: classes20.dex */
public final class t extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.apm.payto.impl.screen.pay_to_confirmation_screen.b f234619w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(com.revolut.feature.apm.payto.impl.screen.pay_to_confirmation_screen.b bVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f234619w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new t(this.f234619w, continuation, 0);
            default:
                return new t(this.f234619w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((t) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Continuation continuation = null;
        int i = 1;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                com.revolut.feature.apm.payto.impl.screen.pay_to_confirmation_screen.b bVar = this.f234619w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    Object content = ((h) ((j2) bVar.u.f22677a).getValue()).f234606a.getContent();
                    if (content == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    oz1.j jVar = bVar.f62754p;
                    ApmPaymentAuthorisationPaymentMethod apmPaymentAuthorisationPaymentMethod = ApmPaymentAuthorisationPaymentMethod.PAY_TO;
                    this.v = 1;
                    if (jVar.a(apmPaymentAuthorisationPaymentMethod, (ApmPaymentAuthorisationPendingAction) content, j02.c.f169914a, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                Set set = com.revolut.feature.apm.payto.impl.screen.pay_to_confirmation_screen.b.f62753w;
                yji.l.a1(bVar, bVar.X1(new mii.k("SHOT_DIALOG_ID", new TextLocalisedClause(R$string.mandate_details_authorisation_success_payment_authorised, null, null, 14), null, null, null, 28)), null, null, new x(bVar, null), 3);
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                com.revolut.feature.apm.payto.impl.screen.pay_to_confirmation_screen.b bVar2 = this.f234619w;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    Object content2 = ((h) ((j2) bVar2.u.f22677a).getValue()).f234606a.getContent();
                    if (content2 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    oz1.j jVar2 = bVar2.f62754p;
                    ApmPaymentAuthorisationPaymentMethod apmPaymentAuthorisationPaymentMethod2 = ApmPaymentAuthorisationPaymentMethod.PAY_TO;
                    this.v = 1;
                    if (jVar2.d(apmPaymentAuthorisationPaymentMethod2, (ApmPaymentAuthorisationPendingAction) content2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return yji.l.a1(bVar2, bVar2.X1(new mii.k("SHOT_DIALOG_ID", new TextLocalisedClause(R$string.mandate_details_authorisation_success_payment_declined, null, null, 14), null, null, null, 28)), null, null, new w(bVar2, continuation, i), 3);
        }
    }
}
