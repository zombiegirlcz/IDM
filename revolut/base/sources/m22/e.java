package m22;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.apm.core.ui.impl.ui.list.ApmListScreen;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import m18.n;
import vkm.z1;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class e extends i implements Function2 {
    public final /* synthetic */ ApmListScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ApmListScreen apmListScreen, Continuation continuation) {
        super(2, continuation);
        this.u = apmListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        g gVar = (g) this.u.T.getValue();
        gVar.H2(gVar.f201683p, new n(20));
        z1 z1Var = gVar.f201684q;
        Unit unit = Unit.f186387a;
        z1Var.k(unit);
        return unit;
    }
}
