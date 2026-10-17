package fj4;

import com.revolut.feature.credit.application.plugins.impl.ui.valuators.details.ValuatorDetailsScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.valuators.details.ValuatorDetailsScreenContract$Action;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class f extends i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ValuatorDetailsScreen f135530w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(ValuatorDetailsScreen valuatorDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f135530w = valuatorDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f fVar = new f(this.f135530w, continuation, 0);
                fVar.v = obj2;
                return fVar;
            default:
                f fVar2 = new f(this.f135530w, continuation, 1);
                fVar2.v = obj2;
                return fVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        ValuatorDetailsScreenContract$Action valuatorDetailsScreenContract$Action = (ValuatorDetailsScreenContract$Action) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((f) create(valuatorDetailsScreenContract$Action, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ValuatorDetailsScreen valuatorDetailsScreen = this.f135530w;
        switch (i) {
            case 0:
                ValuatorDetailsScreenContract$Action valuatorDetailsScreenContract$Action = (ValuatorDetailsScreenContract$Action) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.credit.application.plugins.impl.ui.valuators.details.a) ((g) valuatorDetailsScreen.O.getValue())).I2(valuatorDetailsScreenContract$Action);
                break;
            default:
                ValuatorDetailsScreenContract$Action valuatorDetailsScreenContract$Action2 = (ValuatorDetailsScreenContract$Action) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.credit.application.plugins.impl.ui.valuators.details.a) ((g) valuatorDetailsScreen.O.getValue())).I2(valuatorDetailsScreenContract$Action2);
                break;
        }
        return Unit.f186387a;
    }
}
