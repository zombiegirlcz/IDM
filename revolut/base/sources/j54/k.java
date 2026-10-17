package j54;

import com.revolut.feature.credit.application.plugins.api.models.cancel.DropOutConfig;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public final class k extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ DropOutConfig.ConfirmationContent f171520w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.c cVar, DropOutConfig.ConfirmationContent confirmationContent, Continuation continuation) {
        super(1, continuation);
        this.v = cVar;
        this.f171520w = confirmationContent;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new k(this.v, this.f171520w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((k) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            DropOutConfig.Action action = this.f171520w.f66315c.f66312b;
            this.u = 1;
            if (this.v.Z2(action, this) == aVar) {
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
