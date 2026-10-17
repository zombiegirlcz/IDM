package gs2;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.payments_list.page.BlockedPaymentsListScreen;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.payments_list.page.BlockedPaymentsListScreenContract$Input;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ BlockedPaymentsListScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(BlockedPaymentsListScreen blockedPaymentsListScreen, Continuation continuation) {
        super(2, continuation);
        this.v = blockedPaymentsListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        o oVarG3 = this.v.T2();
        Intrinsics.h(model);
        r rVar = (r) oVarG3;
        BlockedPaymentsListScreenContract$Input blockedPaymentsListScreenContract$Input = rVar.f146293p;
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f52708a;
        if (Intrinsics.f(str, "ID_MERCHANT_SUBHEADER_ITEM")) {
            rVar.v2(new j(blockedPaymentsListScreenContract$Input.f64257a));
        } else if (Intrinsics.f(str, "ID_SUBSCRIPTION_SUBHEADER_ITEM")) {
            rVar.v2(new k(blockedPaymentsListScreenContract$Input.f64257a));
        }
        return Unit.f186387a;
    }
}
