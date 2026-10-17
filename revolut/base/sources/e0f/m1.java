package e0f;

import com.revolut.feature.topup_screen.api.model.CheckoutContext;
import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes8.dex */
public final class m1 extends gim.i implements Function3 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f121643w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f121644x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f121645y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m1(int i, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f121645y = obj2;
        this.z = obj3;
        this.A = obj4;
        this.B = obj5;
        this.C = obj6;
        this.D = obj7;
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [gim.i, oim.n] */
    /* JADX WARN: Type inference failed for: r5v7, types: [gim.i, kotlin.jvm.functions.Function2] */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                int i = 0;
                m1 m1Var = new m1(i, (r1) this.f121645y, (yte.n) this.z, (w4l.k) this.A, (CheckoutContext) this.B, (String) this.C, (List) this.D, (Continuation) obj4);
                m1Var.f121643w = (FlowCollector) obj2;
                m1Var.f121644x = obj3;
                return m1Var.invokeSuspend(Unit.f186387a);
            case 1:
                int i2 = 1;
                m1 m1Var2 = new m1(i2, (knd.l) this.f121645y, (knd.v) this.z, (knd.m) this.A, (AnalyticsSpendingPeriod$Interval) this.B, (knd.i) this.C, (he3.b) this.D, (Continuation) obj4);
                m1Var2.f121643w = (FlowCollector) obj2;
                m1Var2.f121644x = obj3;
                return m1Var2.invokeSuspend(Unit.f186387a);
            case 2:
                int i3 = 2;
                m1 m1Var3 = new m1(i3, (CoroutineScope) this.f121645y, (knd.v) this.z, (knd.m) this.A, (knd.p) this.B, (knd.i) this.C, (Map) this.D, (Continuation) obj4);
                m1Var3.f121643w = (FlowCollector) obj2;
                m1Var3.f121644x = obj3;
                return m1Var3.invokeSuspend(Unit.f186387a);
            default:
                m1 m1Var4 = new m1((wvg.y0) this.f121645y, (gim.i) this.z, (Function2) this.A, (Function1) this.B, (gim.i) this.D, (Continuation) obj4);
                m1Var4.f121644x = (wvg.a1) obj3;
                return m1Var4.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:171:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x021a  */
    /* JADX WARN: Type inference failed for: r6v13, types: [gim.i, oim.n] */
    /* JADX WARN: Type inference failed for: r9v32, types: [gim.i, kotlin.jvm.functions.Function2] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r42) {
        /*
            Method dump skipped, instruction units count: 1152
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e0f.m1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m1(wvg.y0 y0Var, oim.n nVar, Function2 function2, Function1 function1, Function2 function22, Continuation continuation) {
        super(3, continuation);
        this.u = 3;
        this.f121645y = y0Var;
        this.z = (gim.i) nVar;
        this.A = function2;
        this.B = function1;
        this.D = (gim.i) function22;
    }
}
