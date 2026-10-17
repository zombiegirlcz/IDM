package by9;

import com.revolut.feature.payments.recipients.settings.models.RecipientPaymentsSettings;
import com.revolut.feature.payments.recipients.settings.models.RecipientsPaymentsSettingsRequest$Recipient;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import skm.e0;
import skm.p0;
import yhm.o;
import zhm.y0;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ j v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.payments.recipients.settings.models.a f19785w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, com.revolut.feature.payments.recipients.settings.models.a aVar, Continuation continuation) {
        super(2, continuation);
        this.v = jVar;
        this.f19785w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.v, this.f19785w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object obj3 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            com.revolut.feature.payments.recipients.settings.models.a aVar = this.f19785w;
            Set setB = y0.b(new RecipientsPaymentsSettingsRequest$Recipient(aVar.f79682b, aVar.f79681a));
            RecipientPaymentsSettings.Setting setting = new RecipientPaymentsSettings.Setting(aVar.f79683c, aVar.d);
            this.u = 1;
            i iVar = new i(this.v, setB, setting, null);
            p0 p0Var = p0.f264001a;
            Object objJ = e0.J(elm.f.f127540b, iVar, this);
            if (objJ != obj3) {
                objJ = Unit.f186387a;
            }
            if (objJ == obj3) {
                return obj3;
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
