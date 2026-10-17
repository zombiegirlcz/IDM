package yfd;

import com.revolut.feature.shared_separate_favourites.common.screen.add_asset.SharedFavouritesAddAssetScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes7.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SharedFavouritesAddAssetScreen f313217w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(SharedFavouritesAddAssetScreen sharedFavouritesAddAssetScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f313217w = sharedFavouritesAddAssetScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                k kVar = new k(this.f313217w, continuation, 0);
                kVar.v = obj2;
                return kVar;
            default:
                k kVar2 = new k(this.f313217w, continuation, 1);
                kVar2.v = obj2;
                return kVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        String str = (String) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((k) create(str, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        SharedFavouritesAddAssetScreen sharedFavouritesAddAssetScreen = this.f313217w;
        switch (i) {
            case 0:
                String str = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (Intrinsics.f(str, "CLEAR_TOOLBAR_MENU_ITEM_ID")) {
                    ((w) sharedFavouritesAddAssetScreen.i3()).x2(new ye1.m(14));
                }
                break;
            default:
                String str2 = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                KProperty[] kPropertyArr = SharedFavouritesAddAssetScreen.f86802h0;
                sharedFavouritesAddAssetScreen.h3().d.scrollToPosition(0);
                w wVar = (w) sharedFavouritesAddAssetScreen.i3();
                wVar.getClass();
                wVar.x2(new y9d.c(str2, 9));
                break;
        }
        return Unit.f186387a;
    }
}
