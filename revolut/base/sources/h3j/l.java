package h3j;

import com.revolut.feature.payments.recipients.settings.models.RecipientPaymentsSettings;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public final class l extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.retail.feature.beneficiary.impl.ui.bank_beneficiary_details.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ RecipientPaymentsSettings.Setting f149164w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.revolut.retail.feature.beneficiary.impl.ui.bank_beneficiary_details.b bVar, RecipientPaymentsSettings.Setting setting, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
        this.f149164w = setting;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new l(this.v, this.f149164w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((l) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object obj3 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        RecipientPaymentsSettings.Setting setting = this.f149164w;
        com.revolut.retail.feature.beneficiary.impl.ui.bank_beneficiary_details.b bVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            f0 f0Var = bVar.o;
            f5j.a aVarI2 = bVar.I2();
            this.u = 1;
            d3j.d dVar = f0Var.f149152b;
            String str = aVarI2.f132329a;
            iy9.c cVar = setting.f79675a;
            if (cVar != iy9.c.TWO_FA_REQUIRED) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            Object objA = nim.a.a(((by9.j) dVar.f111214a).b(new com.revolut.feature.payments.recipients.settings.models.a(str, iy9.d.BENEFICIARY, cVar, setting.f79676b)), this);
            if (objA != obj3) {
                objA = Unit.f186387a;
            }
            if (objA != obj3) {
                objA = Unit.f186387a;
            }
            if (objA != obj3) {
                objA = Unit.f186387a;
            }
            if (objA == obj3) {
                return obj3;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        bVar.H2(bVar.f99672t, new k(setting, 0));
        return Unit.f186387a;
    }
}
