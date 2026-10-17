package ka2;

import com.revolut.feature.apm.payid.impl.screen.area.AreaScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AreaScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AreaScreen areaScreen, Continuation continuation) {
        super(2, continuation);
        this.v = areaScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((com.revolut.core.ui_kit.delegates.t) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        com.revolut.core.ui_kit.delegates.t tVar = (com.revolut.core.ui_kit.delegates.t) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        String str = tVar.f54722b.f51590a;
        boolean zF = Intrinsics.f(str, "LIST_ID_CREATE_PAYID");
        AreaScreen areaScreen = this.v;
        if (zF) {
            ((com.revolut.feature.apm.payid.impl.screen.area.c) areaScreen.d()).I2(k.f182397a);
        } else if (Intrinsics.f(str, "LIST_ID_CONTACTS_PERMISSION")) {
            ((com.revolut.feature.apm.payid.impl.screen.area.c) areaScreen.d()).I2(l.f182398a);
        }
        return Unit.f186387a;
    }
}
