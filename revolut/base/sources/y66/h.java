package y66;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.defi.trade.impl.ui.asset_picker.DeFiAssetPickerScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ DeFiAssetPickerScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(DeFiAssetPickerScreen deFiAssetPickerScreen, Continuation continuation) {
        super(2, continuation);
        this.v = deFiAssetPickerScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        boolean zF = Intrinsics.f(model.f52373a, "SEARCH_CLEAR_LIST_ITEM_ID");
        DeFiAssetPickerScreen deFiAssetPickerScreen = this.v;
        if (zF) {
            DeFiAssetPickerScreen.Companion aVar2 = DeFiAssetPickerScreen.INSTANCE;
            deFiAssetPickerScreen.d3().f174539b.i0();
        } else {
            o oVar = (o) deFiAssetPickerScreen.h3();
            oVar.H2(oVar.v, new y4b.b(26));
            oVar.u.a();
        }
        return Unit.f186387a;
    }
}
