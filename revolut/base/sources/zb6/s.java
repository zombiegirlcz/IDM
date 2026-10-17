package zb6;

import com.youTransactor.uCube.rpc.Constants;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import sa6.x;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.donations.impl.ui.kompot.screen.one_time_donation.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.revolut.feature.donations.impl.ui.kompot.screen.one_time_donation.a aVar, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        s sVar = new s(this.v, continuation);
        sVar.u = obj2;
        return sVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((s) create((od0.i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        od0.i iVar = (od0.i) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        sa6.v pocketIdentifier = (sa6.v) iVar.f224257a;
        if (pocketIdentifier == null) {
            od0.i.Companion.getClass();
            return zi0.c.i(od0.i.f224256b);
        }
        x xVar = (x) this.v.f72092t;
        xVar.getClass();
        Intrinsics.checkNotNullParameter(pocketIdentifier, "pocketIdentifier");
        return nim.a.v(xVar.f261352a.c(new u6c.p(pocketIdentifier.f261349a, (String) null, (u6c.u) null, u6c.t.DONATIONS, (Long) null, pocketIdentifier.f261351c, false, Constants.TAG_POWER_OFF_TIMEOUT), pocketIdentifier.f261350b, w4l.h.f294642c), new s8h.h(29));
    }
}
