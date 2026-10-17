package yfd;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.shared_separate_favourites.common.screen.add_asset.SharedFavouritesAddAssetScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SharedFavouritesAddAssetScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(SharedFavouritesAddAssetScreen sharedFavouritesAddAssetScreen, Continuation continuation) {
        super(2, continuation);
        this.v = sharedFavouritesAddAssetScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((SelectableDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SelectableDelegate.Model model = (SelectableDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        q qVarT2 = this.v.T2();
        Intrinsics.h(model);
        w wVar = (w) qVarT2;
        wVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        wVar.x2(new xwd.o(((RowDelegate.Model) model.f53305b).u, 13, model, wVar));
        return Unit.f186387a;
    }
}
