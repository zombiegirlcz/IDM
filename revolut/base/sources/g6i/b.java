package g6i;

import com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rp0.z;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ c v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((z) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        z zVar = (z) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        if (Intrinsics.f(zVar.f256227a, "ITEM_ID_SUBTITLE_LEARN_MORE")) {
            SharedFaqDestination sharedFaqDestination = new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.FaqExplicit("df1c63f2-24a6-45b0-8cf9-f31284c9c852", 14), (SharedFaqDestination.PassthroughData) null, false, 14);
            c cVar = this.v;
            cVar.A2(sharedFaqDestination);
            j60.a.v(cVar.f140948n, false, null, 3);
        }
        return Unit.f186387a;
    }
}
