package xsi;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.retail.feature.adjust_analytics.impl.ui.AdjustAnalyticsController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class m extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AdjustAnalyticsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(AdjustAnalyticsController adjustAnalyticsController, Continuation continuation) {
        super(2, continuation);
        this.v = adjustAnalyticsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        m mVar = new m(this.v, continuation);
        mVar.u = obj2;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        String str = model.f52613a;
        boolean zF = Intrinsics.f(str, "ALL_TRANSACTIONS_ID");
        AdjustAnalyticsController adjustAnalyticsController = this.v;
        if (zF) {
            ((p) adjustAnalyticsController.d()).I2(true);
        } else {
            if (!Intrinsics.f(str, "SINGLE_TRANSACTION_ID")) {
                throw new IllegalArgumentException(p.a.p("Unknown ", model.f52613a, " for button click handling"));
            }
            ((p) adjustAnalyticsController.d()).I2(false);
        }
        return Unit.f186387a;
    }
}
