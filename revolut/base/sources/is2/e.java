package is2;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.SelectPaymentToBlockScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SelectPaymentToBlockScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(SelectPaymentToBlockScreen selectPaymentToBlockScreen, Continuation continuation) {
        super(2, continuation);
        this.v = selectPaymentToBlockScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.u
            com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate$Model r0 = (com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate.Model) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r4)
            com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.SelectPaymentToBlockScreen r4 = r3.v
            is2.i r4 = r4.T2()
            kotlin.jvm.internal.Intrinsics.h(r0)
            com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.b r4 = (com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.b) r4
            r4.getClass()
            java.lang.String r1 = "model"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r0 = r0.f52613a
            int r1 = r0.hashCode()
            r2 = 0
            switch(r1) {
                case -955342372: goto L61;
                case 295732982: goto L49;
                case 987672753: goto L40;
                case 1902409931: goto L27;
                default: goto L26;
            }
        L26:
            goto L71
        L27:
            java.lang.String r1 = "CONFIRM_BLOCK_SUBSCRIPTION_LIST_ID"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L30
            goto L71
        L30:
            is2.p r0 = new is2.p
            r0.<init>(r4, r2)
            yi5.b r1 = new yi5.b
            r2 = 26
            r1.<init>(r2)
            r4.l2(r0, r1)
            goto L71
        L40:
            java.lang.String r1 = "CANCEL_BLOCK_SUBSCRIPTION_LIST_ID"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L6a
            goto L71
        L49:
            java.lang.String r1 = "CONFIRM_BLOCK_MERCHANT_LIST_ID"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L52
            goto L71
        L52:
            is2.m r0 = new is2.m
            r0.<init>(r4, r2)
            whi.b r1 = new whi.b
            r2 = 6
            r1.<init>(r2)
            r4.n2(r0, r1)
            goto L71
        L61:
            java.lang.String r1 = "CANCEL_BLOCK_MERCHANT_LIST_ID"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L6a
            goto L71
        L6a:
            j60.a r4 = r4.f64271t
            r0 = 0
            r1 = 3
            j60.a.v(r4, r0, r2, r1)
        L71:
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: is2.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
