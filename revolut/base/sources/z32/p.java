package z32;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.apm.core.models.recipients.ApmRecipient;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes20.dex */
public final class p extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.apm.core.ui.impl.ui.recipients.details.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.revolut.feature.apm.core.ui.impl.ui.recipients.details.a aVar, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new p(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((p) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.apm.core.ui.impl.ui.recipients.details.a aVar2 = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            h hVar = aVar2.o;
            ApmRecipient apmRecipientI2 = aVar2.I2();
            this.u = 1;
            obj2 = hVar.a(apmRecipientI2, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        aVar2.H2(aVar2.f62402q, new be3.l(7, (Image) obj2));
        return Unit.f186387a;
    }
}
