package ka2;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.apm.payid.impl.screen.area.AreaScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import tof.a3;

/* JADX INFO: loaded from: classes20.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AreaScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(AreaScreen areaScreen, Continuation continuation) {
        super(2, continuation);
        this.v = areaScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = model.u;
        a3 a3Var = obj3 instanceof a3 ? (a3) obj3 : null;
        if (a3Var != null) {
            ((com.revolut.feature.apm.payid.impl.screen.area.c) this.v.d()).I2(new r(a3Var));
        }
        return Unit.f186387a;
    }
}
