package mcg;

import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.favorites.TravelHotelsHomeFavoritesScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelHotelsHomeFavoritesScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(TravelHotelsHomeFavoritesScreen travelHotelsHomeFavoritesScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelHotelsHomeFavoritesScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((VoucherSmallTileDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        VoucherSmallTileDelegate.Model model = (VoucherSmallTileDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVar = (h) this.v.Q.getValue();
        com.revolut.feature.travel.hotels.impl.ui_kompot.screen.favorites.d dVar = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.favorites.d) hVar;
        dVar.f93924q.Z2(new j(model.f53623w, dVar, null));
        return Unit.f186387a;
    }
}
