package iz1;

import com.revolut.feature.apm.core.impl.data.network.settings.ApmRecipientSettingsService;
import com.revolut.feature.apm.core.models.recipients.ApmRecipient;
import com.revolut.feature.apm.core.models.recipients.ApmRecipientSettingsValue;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes20.dex */
public final class k extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ ApmRecipientSettingsValue v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f169836w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ApmRecipient f169837x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ApmRecipientSettingsValue apmRecipientSettingsValue, l lVar, ApmRecipient apmRecipient, Continuation continuation) {
        super(2, continuation);
        this.v = apmRecipientSettingsValue;
        this.f169836w = lVar;
        this.f169837x = apmRecipient;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new k(this.v, this.f169836w, this.f169837x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            ApmRecipientSettingsValue apmRecipientSettingsValue = this.v;
            ApmRecipientSettingsValue.BlockIncomingMoneyRequests blockIncomingMoneyRequests = apmRecipientSettingsValue instanceof ApmRecipientSettingsValue.BlockIncomingMoneyRequests ? (ApmRecipientSettingsValue.BlockIncomingMoneyRequests) apmRecipientSettingsValue : null;
            fz1.a aVar2 = new fz1.a(blockIncomingMoneyRequests != null ? Boolean.valueOf(blockIncomingMoneyRequests.f62115a) : null);
            ApmRecipientSettingsService apmRecipientSettingsService = this.f169836w.f169838a;
            String f62112a = this.f169837x.getF62147a().getF62112a();
            this.u = 1;
            if (apmRecipientSettingsService.patchSettings(f62112a, aVar2, this) == aVar) {
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
