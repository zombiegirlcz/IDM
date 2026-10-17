package nwf;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.transport.impl.ui.location.TransportLocationChooserScreen;
import com.revolut.feature.transport.models.TransportLocation;
import ivf.r;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TransportLocationChooserScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(TransportLocationChooserScreen transportLocationChooserScreen, Continuation continuation) {
        super(2, continuation);
        this.v = transportLocationChooserScreen;
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

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVar = (h) this.v.Y.getValue();
        Intrinsics.h(model);
        l lVar = (l) hVar;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        lVar.f219872r.Q();
        if (Intrinsics.f(model.f53228a, "WIDGET_CURRENT_ID")) {
            ((lvf.c) lVar.f219871q).b3(new nrd.g(lVar, 22));
        } else {
            Object obj3 = model.u;
            if (obj3 instanceof TransportLocation) {
                TransportLocation transportLocation = (TransportLocation) obj3;
                ((r) lVar.f219870p).g(transportLocation);
                lVar.v2(new g(transportLocation));
            }
        }
        return Unit.f186387a;
    }
}
