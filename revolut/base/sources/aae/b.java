package aae;

import a7b.r;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.subscriptions.impl.edit_subscription_end_date.EditSubscriptionEndDateController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ EditSubscriptionEndDateController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(EditSubscriptionEndDateController editSubscriptionEndDateController, Continuation continuation) {
        super(2, continuation);
        this.u = editSubscriptionEndDateController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVarM3 = this.u.R2();
        hVarM3.H2(hVarM3.f2818r, new r(hVarM3, 12));
        return Unit.f186387a;
    }
}
