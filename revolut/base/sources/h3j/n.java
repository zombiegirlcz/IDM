package h3j;

import com.revolut.feature.payments.recipients.settings.models.RecipientPaymentsSettings;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public final class n extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.retail.feature.beneficiary.impl.ui.bank_beneficiary_details.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ RecipientPaymentsSettings.Setting f149166w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.revolut.retail.feature.beneficiary.impl.ui.bank_beneficiary_details.b bVar, RecipientPaymentsSettings.Setting setting, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
        this.f149166w = setting;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new n(this.v, this.f149166w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((n) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            RecipientPaymentsSettings.Setting setting = this.f149166w;
            com.revolut.retail.feature.beneficiary.impl.ui.bank_beneficiary_details.b bVar = this.v;
            m mVar = new m(bVar, setting, null);
            this.u = 1;
            if (do3.q.t(bVar, mVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
