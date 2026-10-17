package iuh;

import com.revolut.feature.workflow.engine.rfi.api.models.Answer;
import com.revolut.feature.workflow.engine.rfi.impl.ui.base.BaseQuestionScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ BaseQuestionScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(BaseQuestionScreen baseQuestionScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = baseQuestionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            default:
                return new d(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        BaseQuestionScreen baseQuestionScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                baseQuestionScreen.m2().onBackPressed();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                k kVar = (k) baseQuestionScreen.e3();
                Answer answer = ((e) ((j2) kVar.getState().f22677a).getValue()).f168607b;
                if (answer != null) {
                    kVar.C2(new g(answer));
                }
                break;
        }
        return Unit.f186387a;
    }
}
