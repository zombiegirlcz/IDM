package sbb;

import com.revolut.feature.retail.main_screen.container.models.action_payload.APMConfirmationPayload;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import zh9.u0;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ APMConfirmationPayload.IdealConfirmation f261533w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, APMConfirmationPayload.IdealConfirmation idealConfirmation, Continuation continuation) {
        super(1, continuation);
        this.v = dVar;
        this.f261533w = idealConfirmation;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.v, this.f261533w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        d dVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            a aVar2 = new a(dVar, this.f261533w, null);
            this.u = 1;
            obj2 = ue8.c.g0(dVar, aVar2, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return dVar.A2(u0.c((FeatureConfig) obj2));
    }
}
