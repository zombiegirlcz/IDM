package j54;

import com.revolut.feature.credit.application.plugins.api.models.cancel.DropOutConfig;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public final class m extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ DropOutConfig.ConfirmationContent f171527w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.c cVar, DropOutConfig.ConfirmationContent confirmationContent, Continuation continuation) {
        super(1, continuation);
        this.v = cVar;
        this.f171527w = confirmationContent;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new m(this.v, this.f171527w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((m) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            DropOutConfig.Action action = this.f171527w.d.f66312b;
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
