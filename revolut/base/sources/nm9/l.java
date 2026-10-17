package nm9;

import com.revolut.feature.payees.impl.ui.PayeesFlowType;
import com.revolut.feature.payments.recipients.settings.models.RecipientPaymentsSettings;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class l extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ m v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, Continuation continuation) {
        super(1, continuation);
        this.v = mVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new l(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((l) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        iy9.c cVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            m mVar = this.v;
            ay9.a aVar2 = mVar.f217229q;
            Set setA = ((f) zi0.c.I(((g) ((j2) mVar.f217230r.f22677a).getValue()).f217222b)).a();
            PayeesFlowType payeesFlowType = mVar.o.f79002a;
            if (payeesFlowType instanceof PayeesFlowType.Blocked) {
                cVar = iy9.c.BLOCK_USER;
            } else {
                if (!(payeesFlowType instanceof PayeesFlowType.RequireAuthentication)) {
                    throw new NoWhenBranchMatchedException();
                }
                cVar = iy9.c.TWO_FA_REQUIRED;
            }
            com.revolut.feature.payments.recipients.settings.models.b bVar = new com.revolut.feature.payments.recipients.settings.models.b(setA, cVar, new RecipientPaymentsSettings.Setting.Value.Binary(true));
            this.u = 1;
            Object objC = ((by9.j) ((hy9.c) aVar2).f156768a).c(bVar, this);
            if (objC != aVar) {
                objC = Unit.f186387a;
            }
            if (objC == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
