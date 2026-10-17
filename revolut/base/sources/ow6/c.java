package ow6;

import com.revolut.feature.freelancer.impl.ui.ecommerce.auth.screen.FreelancerPluginAuthScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import ow6.e;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ FreelancerPluginAuthScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(FreelancerPluginAuthScreen freelancerPluginAuthScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = freelancerPluginAuthScreen;
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

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        FreelancerPluginAuthScreen freelancerPluginAuthScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((j) ((f) freelancerPluginAuthScreen.P.getValue())).C2(e.a.f230312a);
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                j jVar = (j) ((f) freelancerPluginAuthScreen.P.getValue());
                jVar.getClass();
                jVar.n2(new omg.e(jVar, null, 16), new whi.b(6));
                break;
        }
        return Unit.f186387a;
    }
}
