package wm9;

import com.revolut.core.ui_kit.delegates.vh;
import com.revolut.feature.payees.impl.ui.payees_overview.personal.PayeesOverviewScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import wgb.v;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PayeesOverviewScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(PayeesOverviewScreen payeesOverviewScreen, Continuation continuation) {
        super(2, continuation);
        this.v = payeesOverviewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((vh) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        vh vhVar = (vh) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        i iVarD3 = this.v.d();
        Object obj3 = vhVar.f54883a.f;
        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.payees.impl.ui.PaymentRecipientMapper.PayeesSwipeParcel");
        km9.f parcel = (km9.f) obj3;
        com.revolut.feature.payees.impl.ui.payees_overview.personal.a aVar2 = (com.revolut.feature.payees.impl.ui.payees_overview.personal.a) iVarD3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        aVar2.l2(new v(aVar2, parcel, null, 14), new yi5.b(26));
        return Unit.f186387a;
    }
}
