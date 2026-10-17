package sbb;

import com.revolut.feature.retail.main_screen.container.models.action_payload.APMConfirmationPayload;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ APMConfirmationPayload.IdealConfirmation f261534w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, APMConfirmationPayload.IdealConfirmation idealConfirmation, Continuation continuation) {
        super(2, continuation);
        this.v = dVar;
        this.f261534w = idealConfirmation;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.v, this.f261534w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        APMConfirmationPayload.IdealConfirmation idealConfirmation = this.f261534w;
        d dVar = this.v;
        b bVar = new b(dVar, idealConfirmation, null);
        this.u = 1;
        Object objY2 = dVar.Y2(this, bVar);
        return objY2 == aVar ? aVar : objY2;
    }
}
