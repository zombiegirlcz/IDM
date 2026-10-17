package b4c;

import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.feature.revolut_shop.ui.screen.dashboard.IppShopDashboardScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ IppShopDashboardScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(IppShopDashboardScreen ippShopDashboardScreen, Continuation continuation) {
        super(2, continuation);
        this.v = ippShopDashboardScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((ActionsView.Item) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ActionsView.Item item = (ActionsView.Item) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((u) this.v.R2()).J2(item.f58316a);
        return Unit.f186387a;
    }
}
