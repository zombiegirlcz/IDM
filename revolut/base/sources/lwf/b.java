package lwf;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.transport.impl.ui.hub.transit_section.TransitSectionScreen;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.z1;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ TransitSectionScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(TransitSectionScreen transitSectionScreen, Continuation continuation) {
        super(2, continuation);
        this.u = transitSectionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        g gVar = (g) ((d) this.u.Y.getValue());
        gVar.x2(new lv9.c(9));
        z1 z1Var = gVar.f200455r;
        Unit unit = Unit.f186387a;
        z1Var.k(unit);
        return unit;
    }
}
