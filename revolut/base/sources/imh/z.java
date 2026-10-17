package imh;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes10.dex */
public final class z extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f162489w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f162490x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.wealth.ui.impl.trade_redesign.screen.a f162491y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(int i, com.revolut.feature.wealth.ui.impl.trade_redesign.screen.a aVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f162491y = aVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                z zVar = new z(0, this.f162491y, continuation);
                zVar.f162489w = flowCollector;
                zVar.f162490x = obj3;
                return zVar.invokeSuspend(Unit.f186387a);
            case 1:
                z zVar2 = new z(1, this.f162491y, continuation);
                zVar2.f162489w = flowCollector;
                zVar2.f162490x = obj3;
                return zVar2.invokeSuspend(Unit.f186387a);
            case 2:
                z zVar3 = new z(2, this.f162491y, continuation);
                zVar3.f162489w = flowCollector;
                zVar3.f162490x = obj3;
                return zVar3.invokeSuspend(Unit.f186387a);
            case 3:
                z zVar4 = new z(3, this.f162491y, continuation);
                zVar4.f162489w = flowCollector;
                zVar4.f162490x = obj3;
                return zVar4.invokeSuspend(Unit.f186387a);
            case 4:
                z zVar5 = new z(4, this.f162491y, continuation);
                zVar5.f162489w = flowCollector;
                zVar5.f162490x = obj3;
                return zVar5.invokeSuspend(Unit.f186387a);
            case 5:
                z zVar6 = new z(5, this.f162491y, continuation);
                zVar6.f162489w = flowCollector;
                zVar6.f162490x = obj3;
                return zVar6.invokeSuspend(Unit.f186387a);
            case 6:
                z zVar7 = new z(6, this.f162491y, continuation);
                zVar7.f162489w = flowCollector;
                zVar7.f162490x = obj3;
                return zVar7.invokeSuspend(Unit.f186387a);
            case 7:
                z zVar8 = new z(7, this.f162491y, continuation);
                zVar8.f162489w = flowCollector;
                zVar8.f162490x = obj3;
                return zVar8.invokeSuspend(Unit.f186387a);
            case 8:
                z zVar9 = new z(8, this.f162491y, continuation);
                zVar9.f162489w = flowCollector;
                zVar9.f162490x = obj3;
                return zVar9.invokeSuspend(Unit.f186387a);
            case 9:
                z zVar10 = new z(9, this.f162491y, continuation);
                zVar10.f162489w = flowCollector;
                zVar10.f162490x = obj3;
                return zVar10.invokeSuspend(Unit.f186387a);
            default:
                z zVar11 = new z(10, this.f162491y, continuation);
                zVar11.f162489w = flowCollector;
                zVar11.f162490x = obj3;
                return zVar11.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:231:? A[RETURN, SYNTHETIC] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 1474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: imh.z.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
