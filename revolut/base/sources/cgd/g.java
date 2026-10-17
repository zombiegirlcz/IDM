package cgd;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.shared_separate_favourites.common.screen.counterpart_chooser.SharedFavouritesCounterpartChooserScreen;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesCounterpartAsset;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SharedFavouritesCounterpartChooserScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(SharedFavouritesCounterpartChooserScreen sharedFavouritesCounterpartChooserScreen, Continuation continuation) {
        super(2, continuation);
        this.v = sharedFavouritesCounterpartChooserScreen;
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

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        n nVar = (n) this.v.f86835e0.getValue();
        Intrinsics.h(model);
        c cVar = (c) nVar;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        FavouritesCounterpartAsset favouritesCounterpartAsset = obj3 instanceof FavouritesCounterpartAsset ? (FavouritesCounterpartAsset) obj3 : null;
        if (favouritesCounterpartAsset == null) {
            throw new IllegalStateException("Parcel should not be null");
        }
        cVar.f23930r.Q();
        cVar.v2(new l(favouritesCounterpartAsset));
        return Unit.f186387a;
    }
}
