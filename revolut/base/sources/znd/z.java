package znd;

import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.AnalyticsDetailsController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class z extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AnalyticsDetailsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(AnalyticsDetailsController analyticsDetailsController, Continuation continuation) {
        super(2, continuation);
        this.v = analyticsDetailsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        z zVar = new z(this.v, continuation);
        zVar.u = obj2;
        return zVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((z) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.u
            java.lang.String r0 = (java.lang.String) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r6)
            if (r0 == 0) goto L8a
            int r6 = r0.hashCode()
            r1 = -218004006(0xfffffffff30185da, float:-1.0261858E31)
            if (r6 == r1) goto L37
            r1 = 1525896546(0x5af35562, float:3.424615E16)
            if (r6 == r1) goto L2b
            r1 = 1578325883(0x5e13577b, float:2.6542725E18)
            if (r6 == r1) goto L1f
            goto L8a
        L1f:
            java.lang.String r6 = "BAR_CHART_SELECTION_ID"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L28
            goto L8a
        L28:
            yld.c r6 = yld.c.BAR_CHART
            goto L41
        L2b:
            java.lang.String r6 = "PIE_CHART_SELECTION_ID"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L34
            goto L8a
        L34:
            yld.c r6 = yld.c.PIE_CHART
            goto L41
        L37:
            java.lang.String r6 = "LINE_CHART_SELECTION_ID"
            boolean r6 = r0.equals(r6)
            if (r6 == 0) goto L8a
            yld.c r6 = yld.c.LINE_CHART
        L41:
            com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.AnalyticsDetailsController$a r0 = com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.AnalyticsDetailsController.INSTANCE
            com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.AnalyticsDetailsController r0 = r5.v
            jii.m r1 = r0.d3()
            com.revolut.recyclerkit.ScreenContentRecyclerView r1 = r1.f174540c
            androidx.recyclerview.widget.RecyclerView$ItemAnimator r1 = r1.getItemAnimator()
            if (r1 == 0) goto L56
            r2 = 0
            r1.setMoveDuration(r2)
        L56:
            znd.b r1 = r0.R2()
            com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.b r1 = (com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.b) r1
            r1.getClass()
            java.lang.String r2 = "style"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r2)
            zah.f r2 = new zah.f
            r3 = 21
            r4 = 0
            r2.<init>(r1, r6, r4, r3)
            whi.b r6 = new whi.b
            r3 = 6
            r6.<init>(r3)
            r1.n2(r2, r6)
            jii.m r6 = r0.d3()
            com.revolut.recyclerkit.ScreenContentRecyclerView r6 = r6.f174540c
            x.b r1 = new x.b
            r2 = 16
            r1.<init>(r0, r2)
            r2 = 100
            r6.postDelayed(r1, r2)
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L8a:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: znd.z.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
