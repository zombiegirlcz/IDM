package h3j;

import com.revolut.feature.payments.recipients.settings.models.RecipientPaymentsSettings;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
public final class o extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.retail.feature.beneficiary.impl.ui.bank_beneficiary_details.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ RecipientPaymentsSettings.Setting f149167w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.revolut.retail.feature.beneficiary.impl.ui.bank_beneficiary_details.b bVar, RecipientPaymentsSettings.Setting setting, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
        this.f149167w = setting;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new o(this.v, this.f149167w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        RecipientPaymentsSettings.Setting setting = this.f149167w;
        com.revolut.retail.feature.beneficiary.impl.ui.bank_beneficiary_details.b bVar = this.v;
        n nVar = new n(bVar, setting, null);
        this.u = 1;
        Object objB = pu7.a.B(bVar.k, "changeSettings2FA", nVar, this);
        return objB == aVar ? aVar : objB;
    }
}
