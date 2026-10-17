package ai4;

import a2g.p;
import cli.y;
import com.revolut.feature.credit.application.plugins.impl.ui.singleselectordetails.SingleSelectorInputDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ SingleSelectorInputDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(SingleSelectorInputDetailsScreen singleSelectorInputDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = singleSelectorInputDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        SingleSelectorInputDetailsScreen singleSelectorInputDetailsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                l lVar = (l) singleSelectorInputDetailsScreen.e3();
                y yVar = lVar.o;
                if (((e) ((j2) yVar.f22677a).getValue()).f5183b) {
                    lVar.H2(yVar, new agh.h(20));
                    lVar.H2(yVar, new p(false, 9));
                } else {
                    lVar.C2(f.f5185a);
                }
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                l lVar2 = (l) singleSelectorInputDetailsScreen.e3();
                lVar2.H2(lVar2.o, new p(true, 9));
                break;
        }
        return Unit.f186387a;
    }
}
