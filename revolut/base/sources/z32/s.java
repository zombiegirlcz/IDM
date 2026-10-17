package z32;

import com.revolut.feature.apm.core.models.recipients.ApmRecipient;
import com.revolut.feature.payments.recipients.settings.models.RecipientPaymentsSettings;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public final class s extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.apm.core.ui.impl.ui.recipients.details.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ RecipientPaymentsSettings.Setting f319138w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.revolut.feature.apm.core.ui.impl.ui.recipients.details.a aVar, RecipientPaymentsSettings.Setting setting, Continuation continuation) {
        super(1, continuation);
        this.v = aVar;
        this.f319138w = setting;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new s(this.v, this.f319138w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((s) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object obj3 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            com.revolut.feature.apm.core.ui.impl.ui.recipients.details.a aVar = this.v;
            h hVar = aVar.o;
            ApmRecipient apmRecipientI2 = aVar.I2();
            this.u = 1;
            oz1.l lVar = (oz1.l) hVar.f319131c;
            String f62112a = apmRecipientI2.getF62134a().getF62112a();
            RecipientPaymentsSettings.Setting setting = this.f319138w;
            iy9.c cVar = setting.f79675a;
            if (cVar != iy9.c.TWO_FA_REQUIRED) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            Object objA = nim.a.a(((by9.j) lVar.f231115a).b(new com.revolut.feature.payments.recipients.settings.models.a(f62112a, iy9.d.BENEFICIARY, cVar, setting.f79676b)), this);
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
        return Unit.f186387a;
    }
}
