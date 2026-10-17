package nwf;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.transport.impl.ui.location.TransportLocationChooserScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nuc.n;
import vkm.z1;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ TransportLocationChooserScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(TransportLocationChooserScreen transportLocationChooserScreen, Continuation continuation) {
        super(2, continuation);
        this.u = transportLocationChooserScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        l lVar = (l) ((h) this.u.Y.getValue());
        lVar.x2(new n(21));
        z1 z1Var = lVar.f219873s;
        Unit unit = Unit.f186387a;
        z1Var.k(unit);
        return unit;
    }
}
