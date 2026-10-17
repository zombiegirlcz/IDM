package iv5;

import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.feature.crypto_investments.api.widget.investments.sorting.CryptoInvestmentsSortingType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends gim.i implements Function2 {
    public CryptoInvestmentsSortingType u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SingleChoiceDelegate.Model f168743w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ o f168744x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(SingleChoiceDelegate.Model model, o oVar, Continuation continuation) {
        super(2, continuation);
        this.f168743w = model;
        this.f168744x = oVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new n(this.f168743w, this.f168744x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r5.v
            r2 = 1
            iv5.o r3 = r5.f168744x
            if (r1 == 0) goto L19
            if (r1 != r2) goto L11
            com.revolut.feature.crypto_investments.api.widget.investments.sorting.CryptoInvestmentsSortingType r0 = r5.u
            yhm.o.b(r6)
            goto L48
        L11:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L19:
            yhm.o.b(r6)
            com.revolut.core.ui_kit.delegates.SingleChoiceDelegate$Model r6 = r5.f168743w
            java.lang.String r1 = r6.f53324a
            java.lang.String r4 = "SORTING_BOTTOM_DIALOG_ITEM_ID"
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r4)
            if (r1 == 0) goto L6c
            java.lang.Object r6 = r6.f
            java.lang.String r1 = "null cannot be cast to non-null type com.revolut.feature.crypto_investments.api.widget.investments.sorting.CryptoInvestmentsSortingType"
            kotlin.jvm.internal.Intrinsics.i(r6, r1)
            com.revolut.feature.crypto_investments.api.widget.investments.sorting.CryptoInvestmentsSortingType r6 = (com.revolut.feature.crypto_investments.api.widget.investments.sorting.CryptoInvestmentsSortingType) r6
            com.revolut.feature.crypto_investments.api.widget.investments.sorting.CryptoInvestmentsSortingType r1 = r3.f168750r
            if (r1 != 0) goto L4c
            mu5.p r1 = r3.o
            kotlinx.coroutines.flow.Flow r1 = r1.c()
            r5.u = r6
            r5.v = r2
            java.lang.Object r1 = vkm.q.x(r1, r5)
            if (r1 != r0) goto L46
            return r0
        L46:
            r0 = r6
            r6 = r1
        L48:
            r1 = r6
            com.revolut.feature.crypto_investments.api.widget.investments.sorting.CryptoInvestmentsSortingType r1 = (com.revolut.feature.crypto_investments.api.widget.investments.sorting.CryptoInvestmentsSortingType) r1
            r6 = r0
        L4c:
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r6, r1)
            if (r0 == 0) goto L56
            com.revolut.feature.crypto_investments.api.widget.investments.sorting.CryptoInvestmentsSortingType r6 = r6.c()
        L56:
            r3.f168750r = r6
            j60.a r0 = r3.f168746m
            boolean r1 = r0.j()
            if (r1 == 0) goto L6c
            gv5.e r1 = r3.f168747n
            r1.getClass()
            rp0.y r6 = gv5.e.a(r6)
            r0.A(r6)
        L6c:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: iv5.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
