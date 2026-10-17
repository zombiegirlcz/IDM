package mkk;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes11.dex */
public final class o extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f206493w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f206494x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.management.b f206495y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(Continuation continuation, com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.management.b bVar, int i) {
        super(3, continuation);
        this.u = i;
        this.f206495y = bVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                o oVar = new o(continuation, this.f206495y, 0);
                oVar.f206493w = flowCollector;
                oVar.f206494x = obj3;
                return oVar.invokeSuspend(Unit.f186387a);
            default:
                o oVar2 = new o(continuation, this.f206495y, 1);
                oVar2.f206493w = flowCollector;
                oVar2.f206494x = obj3;
                return oVar2.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0148  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mkk.o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
