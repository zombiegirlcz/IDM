package y66;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.defi.trade.impl.ui.asset_picker.DeFiAssetPickerScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ DeFiAssetPickerScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(DeFiAssetPickerScreen deFiAssetPickerScreen, Continuation continuation) {
        super(2, continuation);
        this.v = deFiAssetPickerScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        b bVarE3 = this.v.h3();
        Intrinsics.h(model);
        o oVar = (o) bVarE3;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        oVar.C2(new r66.a(model.f53228a));
        return Unit.f186387a;
    }
}
