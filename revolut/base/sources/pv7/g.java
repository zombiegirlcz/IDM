package pv7;

import com.revolut.feature.insurance_embedded.impl.data.model.l0;
import com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.details.InsuranceDetailsLayoutScreen;
import gu7.p2;
import gu7.s2;
import gu7.v2;
import gu7.w2;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ InsuranceDetailsLayoutScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(InsuranceDetailsLayoutScreen insuranceDetailsLayoutScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = insuranceDetailsLayoutScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.v, continuation, 0);
            default:
                return new g(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((g) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        InsuranceDetailsLayoutScreen insuranceDetailsLayoutScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                insuranceDetailsLayoutScreen.m2().onBackPressed();
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.details.b bVar = (com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.details.b) insuranceDetailsLayoutScreen.d();
                l0 l0Var = (l0) ((m) ((j2) bVar.v.f22677a).getValue()).f239986a.getContent();
                w2 w2Var = l0Var != null ? l0Var.f76013m : null;
                p2 p2Var = w2Var != null ? w2Var.f146855b : null;
                if (p2Var instanceof v2) {
                    v2 v2Var = (v2) p2Var;
                    ou7.a.c(bVar, v2Var.f146847b, v2Var.f146848c);
                } else if (p2Var instanceof s2) {
                    bVar.I2(((s2) p2Var).f146829b);
                } else {
                    if (p2Var != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    IllegalStateException illegalStateException = new IllegalStateException(p.a.p("Action cannot be null for primaryButtonText=", w2Var != null ? w2Var.f146854a : null, ", primaryButtonAction=null"));
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                }
                return Unit.f186387a;
        }
    }
}
