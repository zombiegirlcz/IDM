package znd;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes7.dex */
public final class p0 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f323787w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f323788x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.b f323789y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(int i, com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.b bVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f323789y = bVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                p0 p0Var = new p0(0, this.f323789y, continuation);
                p0Var.f323787w = flowCollector;
                p0Var.f323788x = obj3;
                return p0Var.invokeSuspend(Unit.f186387a);
            default:
                p0 p0Var2 = new p0(1, this.f323789y, continuation);
                p0Var2.f323787w = flowCollector;
                p0Var2.f323788x = obj3;
                return p0Var2.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x033e  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 990
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: znd.p0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
