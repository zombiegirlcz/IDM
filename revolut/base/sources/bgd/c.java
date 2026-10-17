package bgd;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.shared_separate_favourites.common.screen.asset_type_chooser.SharedFavouritesAssetTypeChooserScreen;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import skm.a2;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SharedFavouritesAssetTypeChooserScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(SharedFavouritesAssetTypeChooserScreen sharedFavouritesAssetTypeChooserScreen, Continuation continuation) {
        super(2, continuation);
        this.v = sharedFavouritesAssetTypeChooserScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        f fVar = (f) this.v.Q.getValue();
        Intrinsics.h(model);
        h hVar = (h) fVar;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        FavouritesAssetTypeKey favouritesAssetTypeKey = obj3 instanceof FavouritesAssetTypeKey ? (FavouritesAssetTypeKey) obj3 : null;
        if (favouritesAssetTypeKey == null) {
            IllegalStateException illegalStateException = new IllegalStateException(a0.d.l(obj3 == null ? null : obj3.getClass(), "provide handling for parcel type = "));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        } else {
            a2 a2Var = hVar.f15181s;
            if (a2Var != null) {
                a2Var.f(null);
            }
            hVar.f15180r.l(false, new bc1.a(hVar, favouritesAssetTypeKey, 6));
        }
        return Unit.f186387a;
    }
}
