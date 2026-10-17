package ye1;

import com.revolut.core.ui_kit.delegates.IconSelectorDelegate;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.product.CatalogueProductDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CatalogueProductDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(CatalogueProductDetailsScreen catalogueProductDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = catalogueProductDetailsScreen;
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
        IconSelectorDelegate.SelectableIconModel data = (IconSelectorDelegate.SelectableIconModel) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        k kVarR2 = this.v.R2();
        Intrinsics.h(data);
        com.revolut.feature.acquiring.lite_pos.impl.ui.screen.product.a aVar2 = (com.revolut.feature.acquiring.lite_pos.impl.ui.screen.product.a) kVarR2;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(data, "data");
        aVar2.H2(aVar2.f60829t, new je1.j(data, 1));
        return Unit.f186387a;
    }
}
