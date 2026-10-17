package bzg;

import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.feature.wealth.analytics.ui.widgetised.pnl.WidgetisedAnalyticsPnLScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ WidgetisedAnalyticsPnLScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(WidgetisedAnalyticsPnLScreen widgetisedAnalyticsPnLScreen, Continuation continuation) {
        super(2, continuation);
        this.v = widgetisedAnalyticsPnLScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((TrendViewDelegate.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.u
            com.revolut.core.ui_kit.delegates.TrendViewDelegate$a r0 = (com.revolut.core.ui_kit.delegates.TrendViewDelegate.a) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r7)
            com.revolut.feature.wealth.analytics.ui.widgetised.pnl.WidgetisedAnalyticsPnLScreen r7 = r6.v
            bzg.m r7 = r7.d()
            kotlin.jvm.internal.Intrinsics.h(r0)
            com.revolut.feature.wealth.analytics.ui.widgetised.pnl.a r7 = (com.revolut.feature.wealth.analytics.ui.widgetised.pnl.a) r7
            r7.getClass()
            java.lang.String r1 = "trendViewState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            boolean r1 = r0 instanceof com.revolut.core.ui_kit.delegates.mi
            r2 = 0
            if (r1 == 0) goto L25
            r1 = r0
            com.revolut.core.ui_kit.delegates.mi r1 = (com.revolut.core.ui_kit.delegates.mi) r1
            goto L26
        L25:
            r1 = r2
        L26:
            if (r1 == 0) goto L46
            r3 = r0
            com.revolut.core.ui_kit.delegates.mi r3 = (com.revolut.core.ui_kit.delegates.mi) r3
            ip0.jm0 r3 = r3.f54484a
            java.util.List r3 = r3.f164881c
            if (r3 == 0) goto L3e
            int r1 = r1.f54485b
            java.lang.Object r1 = r3.get(r1)
            hw0.k r1 = (hw0.k) r1
            if (r1 == 0) goto L3e
            java.lang.Object r1 = r1.e
            goto L3f
        L3e:
            r1 = r2
        L3f:
            boolean r3 = r1 instanceof fzg.e
            if (r3 == 0) goto L46
            fzg.e r1 = (fzg.e) r1
            goto L47
        L46:
            r1 = r2
        L47:
            boolean r3 = r0 instanceof com.revolut.core.ui_kit.delegates.hi
            if (r3 == 0) goto L4f
            r3 = r0
            com.revolut.core.ui_kit.delegates.hi r3 = (com.revolut.core.ui_kit.delegates.hi) r3
            goto L50
        L4f:
            r3 = r2
        L50:
            if (r3 == 0) goto L91
            com.revolut.core.ui_kit.delegates.hi r0 = (com.revolut.core.ui_kit.delegates.hi) r0
            ip0.jm0 r0 = r0.f54261a
            java.util.List r0 = r0.f164881c
            if (r0 == 0) goto L67
            int r4 = r3.f54262b
            java.lang.Object r4 = r0.get(r4)
            hw0.k r4 = (hw0.k) r4
            if (r4 == 0) goto L67
            java.lang.Object r4 = r4.e
            goto L68
        L67:
            r4 = r2
        L68:
            boolean r5 = r4 instanceof fzg.e
            if (r5 == 0) goto L6f
            fzg.e r4 = (fzg.e) r4
            goto L70
        L6f:
            r4 = r2
        L70:
            if (r0 == 0) goto L7f
            int r3 = r3.d
            java.lang.Object r0 = r0.get(r3)
            hw0.k r0 = (hw0.k) r0
            if (r0 == 0) goto L7f
            java.lang.Object r0 = r0.e
            goto L80
        L7f:
            r0 = r2
        L80:
            boolean r3 = r0 instanceof fzg.e
            if (r3 == 0) goto L87
            fzg.e r0 = (fzg.e) r0
            goto L88
        L87:
            r0 = r2
        L88:
            if (r4 == 0) goto L91
            if (r0 == 0) goto L91
            kotlin.Pair r2 = new kotlin.Pair
            r2.<init>(r4, r0)
        L91:
            cli.y r0 = r7.f95123w
            byc.a r3 = new byc.a
            r4 = 4
            r3.<init>(r1, r2, r4)
            r7.H2(r0, r3)
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: bzg.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
