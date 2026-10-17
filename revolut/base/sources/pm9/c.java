package pm9;

import com.revolut.core.ui_kit.delegates.vh;
import com.revolut.feature.payees.impl.ui.payees_list.PayeesListScreen;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import pdi.j;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PayeesListScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(PayeesListScreen payeesListScreen, Continuation continuation) {
        super(2, continuation);
        this.v = payeesListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((vh) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        vh vhVar = (vh) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        f fVar = (f) this.v.P.getValue();
        Object obj3 = vhVar.f54883a.f;
        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.payees.impl.ui.PaymentRecipientMapper.PayeesSwipeParcel");
        km9.f parcel = (km9.f) obj3;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        fVar.l2(new j(fVar, parcel, null, 24), new yi5.b(26));
        return Unit.f186387a;
    }
}
