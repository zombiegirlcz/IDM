package ka2;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.apm.payid.impl.screen.area.AreaScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AreaScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(AreaScreen areaScreen, Continuation continuation) {
        super(2, continuation);
        this.v = areaScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (Intrinsics.f(model.f52708a, "LIST_ID_RECENTS_HEADER")) {
            ((com.revolut.feature.apm.payid.impl.screen.area.c) this.v.d()).I2(o.f182401a);
        }
        return Unit.f186387a;
    }
}
