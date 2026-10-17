package hq3;

import com.revolut.feature.credit.application.close.provider.CancellationDialogProvider$CancellationConfirmationOption;
import com.revolut.feature.credit.application.plugins.api.models.cancel.DropOutConfig;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes21.dex */
public final class l extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ o v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CancellationDialogProvider$CancellationConfirmationOption f154598w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(o oVar, CancellationDialogProvider$CancellationConfirmationOption cancellationDialogProvider$CancellationConfirmationOption, Continuation continuation) {
        super(1, continuation);
        this.v = oVar;
        this.f154598w = cancellationDialogProvider$CancellationConfirmationOption;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new l(this.v, this.f154598w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((l) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        o oVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            DropOutConfig.Action action = ((CancellationDialogProvider$CancellationConfirmationOption.BackendAction) this.f154598w).f66211a;
            this.u = 1;
            if (oVar.A2(action, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        pw5.a.x(oVar.f154605w);
        return Unit.f186387a;
    }
}
