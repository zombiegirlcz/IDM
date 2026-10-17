package j54;

import com.revolut.feature.credit.application.plugins.api.models.cancel.DropOutConfig;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes22.dex */
public final class l extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ DropOutConfig.ConfirmationContent f171523w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.c cVar, DropOutConfig.ConfirmationContent confirmationContent, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
        this.f171523w = confirmationContent;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new l(this.v, this.f171523w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            DropOutConfig.ConfirmationContent confirmationContent = this.f171523w;
            com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.c cVar = this.v;
            k kVar = new k(cVar, confirmationContent, null);
            this.u = 1;
            if (cVar.Y2(this, kVar) == aVar) {
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
