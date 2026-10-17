package iyg;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes9.dex */
public final class u extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f169747w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f169748x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.a f169749y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(int i, com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.a aVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f169749y = aVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                u uVar = new u(0, this.f169749y, continuation);
                uVar.f169747w = flowCollector;
                uVar.f169748x = obj3;
                return uVar.invokeSuspend(Unit.f186387a);
            case 1:
                u uVar2 = new u(1, this.f169749y, continuation);
                uVar2.f169747w = flowCollector;
                uVar2.f169748x = obj3;
                return uVar2.invokeSuspend(Unit.f186387a);
            default:
                u uVar3 = new u(2, this.f169749y, continuation);
                uVar3.f169747w = flowCollector;
                uVar3.f169748x = obj3;
                return uVar3.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x0120  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: iyg.u.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
