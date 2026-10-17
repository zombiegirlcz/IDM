package znd;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.AnalyticsDetailsController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class s extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AnalyticsDetailsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(AnalyticsDetailsController analyticsDetailsController, Continuation continuation) {
        super(2, continuation);
        this.v = analyticsDetailsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        s sVar = new s(this.v, continuation);
        sVar.u = obj2;
        return sVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((s) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x060d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0205 A[PHI: r3
      0x0205: PHI (r3v47 java.lang.Object) = (r3v46 java.lang.Object), (r3v0 java.lang.Object), (r3v0 java.lang.Object) binds: [B:121:0x02c4, B:82:0x01ba, B:91:0x01df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 1848
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: znd.s.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
