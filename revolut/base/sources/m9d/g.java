package m9d;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.feature.shared.help_centre.impl.main.screen.SharedHelpRev10Screen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SharedHelpRev10Screen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(SharedHelpRev10Screen sharedHelpRev10Screen, Continuation continuation) {
        super(2, continuation);
        this.v = sharedHelpRev10Screen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CellDetailsChevronDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsChevronDelegate.Model model = (CellDetailsChevronDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        d0 d0VarH3 = this.v.T2();
        g1 g1Var = (g1) d0VarH3;
        g1Var.C2(model.e, model.f51822a);
        return Unit.f186387a;
    }
}
