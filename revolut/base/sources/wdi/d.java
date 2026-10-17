package wdi;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature_rev_points_pocket_impl.ui.screen.downgrade.RevPointsPocketDowngradeScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ RevPointsPocketDowngradeScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(RevPointsPocketDowngradeScreen revPointsPocketDowngradeScreen, Continuation continuation) {
        super(2, continuation);
        this.u = revPointsPocketDowngradeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVar = (h) this.u.Q.getValue();
        hVar.getClass();
        hVar.C2(f.RATES_CLICK);
        return Unit.f186387a;
    }
}
