package ood;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.list.TripsListController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class b0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TripsListController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(TripsListController tripsListController, Continuation continuation) {
        super(2, continuation);
        this.v = tripsListController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b0 b0Var = new b0(this.v, continuation);
        b0Var.u = obj2;
        return b0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b0) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0130  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 778
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ood.b0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
