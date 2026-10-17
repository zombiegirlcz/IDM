package fjd;

import com.revolut.core.ui_kit.delegates.VoucherExtraSmallTileDelegate;
import com.revolut.feature.shops.impl.ui.home.ShopsCombinedHomeScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class l extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ShopsCombinedHomeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ShopsCombinedHomeScreen shopsCombinedHomeScreen, Continuation continuation) {
        super(2, continuation);
        this.v = shopsCombinedHomeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        l lVar = new l(this.v, continuation);
        lVar.u = obj2;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((VoucherExtraSmallTileDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        VoucherExtraSmallTileDelegate.Model model = (VoucherExtraSmallTileDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((com.revolut.feature.shops.impl.ui.home.a) this.v.R2()).J2(model.f53602m);
        return Unit.f186387a;
    }
}
