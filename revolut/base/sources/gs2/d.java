package gs2;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.payments_list.page.BlockedPaymentsListScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ BlockedPaymentsListScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(BlockedPaymentsListScreen blockedPaymentsListScreen, Continuation continuation) {
        super(2, continuation);
        this.v = blockedPaymentsListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        o oVarG3 = this.v.T2();
        Intrinsics.h(model);
        r rVar = (r) oVarG3;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        if (obj3 instanceof kr2.e) {
            rVar.v2(new l(rVar.f146293p.f64257a, (kr2.e) obj3));
        } else if (obj3 instanceof qua.p) {
            rVar.v2(new m((qua.p) obj3));
        }
        return Unit.f186387a;
    }
}
