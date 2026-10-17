package gs2;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.payments_list.page.BlockedPaymentsListScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ BlockedPaymentsListScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(BlockedPaymentsListScreen blockedPaymentsListScreen, Continuation continuation) {
        super(2, continuation);
        this.v = blockedPaymentsListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        o oVarG3 = this.v.T2();
        Intrinsics.h(model);
        r rVar = (r) oVarG3;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f52708a, "ID_BLOCKED_CATEGORIES_ITEM")) {
            rVar.z2(model.f52715m);
        }
        return Unit.f186387a;
    }
}
