package b4c;

import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.feature.revolut_shop.ui.screen.dashboard.IppShopDashboardScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ IppShopDashboardScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(IppShopDashboardScreen ippShopDashboardScreen, Continuation continuation) {
        super(2, continuation);
        this.v = ippShopDashboardScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((VoucherSmallTileDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        VoucherSmallTileDelegate.Model model = (VoucherSmallTileDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        n nVarE3 = this.v.R2();
        u uVar = (u) nVarE3;
        uVar.I2(model.f53623w, model.f53609a);
        return Unit.f186387a;
    }
}
