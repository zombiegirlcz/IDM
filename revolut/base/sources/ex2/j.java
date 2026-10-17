package ex2;

import com.revolut.feature.card_contactless_limit.impl.ui.kompot.ResetCardScaController;
import com.revolut.feature.support.api.navigation.SupportFeatureConfig;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes21.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ ResetCardScaController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(ResetCardScaController resetCardScaController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = resetCardScaController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j(this.v, continuation, 0);
            case 1:
                return new j(this.v, continuation, 1);
            default:
                return new j(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((j) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ResetCardScaController resetCardScaController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((l) resetCardScaController.d3()).B2();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((l) resetCardScaController.d3()).I2();
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                l lVar = (l) resetCardScaController.d3();
                lVar.getClass();
                lVar.C1(u0.c(SupportFeatureConfig.f89363a));
                break;
        }
        return Unit.f186387a;
    }
}
