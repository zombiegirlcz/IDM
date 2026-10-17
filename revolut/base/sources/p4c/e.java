package p4c;

import com.revolut.core.ui_kit.delegates.IconSelectorDelegate;
import com.revolut.feature.revolut_shop.ui.screen.product.IppShopProductScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ IppShopProductScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(IppShopProductScreen ippShopProductScreen, Continuation continuation) {
        super(2, continuation);
        this.v = ippShopProductScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((IconSelectorDelegate.SelectableIconModel) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        IconSelectorDelegate.SelectableIconModel selectableIconModel = (IconSelectorDelegate.SelectableIconModel) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        r rVarE3 = this.v.R2();
        x xVar = (x) rVarE3;
        xVar.I2(selectableIconModel.f52505l, selectableIconModel.f52499a);
        return Unit.f186387a;
    }
}
