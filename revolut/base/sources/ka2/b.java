package ka2;

import com.revolut.feature.apm.payid.impl.screen.area.AreaScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AreaScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(AreaScreen areaScreen, Continuation continuation) {
        super(2, continuation);
        this.v = areaScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((ip0.y) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ip0.y yVar = (ip0.y) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        String str = yVar.f167226b.f58316a;
        boolean zF = Intrinsics.f(str, "LIST_ID_SEND_TRANSFER");
        AreaScreen areaScreen = this.v;
        if (zF) {
            ((com.revolut.feature.apm.payid.impl.screen.area.c) areaScreen.d()).I2(p.f182402a);
        } else if (Intrinsics.f(str, "LIST_ID_ADD_CONTACT")) {
            ((com.revolut.feature.apm.payid.impl.screen.area.c) areaScreen.d()).I2(j.f182396a);
        }
        return Unit.f186387a;
    }
}
