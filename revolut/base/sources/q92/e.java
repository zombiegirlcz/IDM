package q92;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.apm.multibanco.impl.via_verde.ui.list.EnrollmentListScreen;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import q75.n;
import vkm.z1;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class e extends i implements Function2 {
    public final /* synthetic */ EnrollmentListScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(EnrollmentListScreen enrollmentListScreen, Continuation continuation) {
        super(2, continuation);
        this.u = enrollmentListScreen;
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
        com.revolut.feature.apm.multibanco.impl.via_verde.ui.list.a aVar2 = (com.revolut.feature.apm.multibanco.impl.via_verde.ui.list.a) ((c) this.u.R.getValue());
        aVar2.H2(aVar2.f62671q, new n(28));
        z1 z1Var = aVar2.f62672r;
        Unit unit = Unit.f186387a;
        z1Var.k(unit);
        return unit;
    }
}
