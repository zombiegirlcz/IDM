package s74;

import com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.constructor.ConstructorCreditPromptController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ConstructorCreditPromptController f260509w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(ConstructorCreditPromptController constructorCreditPromptController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f260509w = constructorCreditPromptController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f260509w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            case 1:
                e eVar2 = new e(this.f260509w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
            default:
                e eVar3 = new e(this.f260509w, continuation, 2);
                eVar3.v = obj2;
                return eVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((e) create((ht3.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ConstructorCreditPromptController constructorCreditPromptController = this.f260509w;
        switch (i) {
            case 0:
                ty0.a aVar = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                l lVarE3 = constructorCreditPromptController.e3();
                Intrinsics.h(aVar);
                ((com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.constructor.b) lVarE3).J2(new j(aVar));
                break;
            case 1:
                ht3.a aVar3 = (ht3.a) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.constructor.b) constructorCreditPromptController.e3()).J2(new f(aVar3));
                break;
            default:
                ht3.a aVar5 = (ht3.a) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.constructor.b) constructorCreditPromptController.e3()).J2(new g(aVar5));
                break;
        }
        return Unit.f186387a;
    }
}
