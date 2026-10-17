package yfd;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.shared_separate_favourites.common.screen.add_asset.SharedFavouritesAddAssetScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ SharedFavouritesAddAssetScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(SharedFavouritesAddAssetScreen sharedFavouritesAddAssetScreen, Continuation continuation) {
        super(2, continuation);
        this.u = sharedFavouritesAddAssetScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new i(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        SharedFavouritesAddAssetScreen sharedFavouritesAddAssetScreen = this.u;
        ((w) sharedFavouritesAddAssetScreen.T2()).x2(new ye1.m(15));
        sharedFavouritesAddAssetScreen.h3().f183954c.i0();
        return Unit.f186387a;
    }
}
