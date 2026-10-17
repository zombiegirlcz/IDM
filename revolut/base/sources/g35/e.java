package g35;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.credit.impl.ui.entry_points.CreditEntryPointsController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ CreditEntryPointsController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(CreditEntryPointsController creditEntryPointsController, Continuation continuation) {
        super(2, continuation);
        this.u = creditEntryPointsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((com.revolut.feature.credit.impl.ui.entry_points.a) ((f) this.u.N.getValue())).J2(h.f140195a);
        return Unit.f186387a;
    }
}
