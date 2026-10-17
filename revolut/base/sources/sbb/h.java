package sbb;

import com.revolut.feature.apm.core.models.recipients.ApmContact;
import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import com.revolut.feature.retail.main_screen.container.models.action_payload.ApmDeeplinkPayload;
import com.revolut.retail.core.navigation.FeatureCommand;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ k v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ApmDeeplinkPayload.Chat f261547w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, ApmDeeplinkPayload.Chat chat, Continuation continuation) {
        super(1, continuation);
        this.v = kVar;
        this.f261547w = chat;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new h(this.v, this.f261547w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((h) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        ApmDeeplinkPayload.Chat chat = this.f261547w;
        k kVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            lx1.d dVar = kVar.f261551m;
            String str = chat.f82744a;
            this.u = 1;
            obj2 = ((fy1.o) dVar).e(str, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        ApmContact apmContact = (ApmContact) obj2;
        if (apmContact != null) {
            return kVar.A2(u0.b(new FeatureCommand(((uz9.a) kVar.o).a(new ChatTransferRecipient.ApmTransferRecipient(apmContact), null))));
        }
        IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("Couldn't fetch APM contact with id: ", chat.f82744a));
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        return Unit.f186387a;
    }
}
