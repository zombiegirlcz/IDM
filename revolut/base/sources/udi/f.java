package udi;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature_rev_points_pocket_impl.ui.screen.details.RevPointsPocketDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ RevPointsPocketDetailsScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(RevPointsPocketDetailsScreen revPointsPocketDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.u = revPointsPocketDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        j60.a.v(((com.revolut.feature_rev_points_pocket_impl.ui.screen.details.b) this.u.R2()).f97816r, false, null, 3);
        return Unit.f186387a;
    }
}
