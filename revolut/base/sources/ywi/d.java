package ywi;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.amenities.AirportLoungesAmenitiesScreen;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import y7i.h;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AirportLoungesAmenitiesScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(AirportLoungesAmenitiesScreen airportLoungesAmenitiesScreen, Continuation continuation) {
        super(2, continuation);
        this.v = airportLoungesAmenitiesScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        g gVar = (g) this.v.f99042a0.getValue();
        String id10 = model.f52373a;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        if (Intrinsics.f(id10, "ID_ERROR_ITEM")) {
            gVar.l2(new h(gVar, null, 25), new yi5.b(26));
        }
        return Unit.f186387a;
    }
}
