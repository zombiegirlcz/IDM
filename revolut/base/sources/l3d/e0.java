package l3d;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes7.dex */
public final class e0 extends gim.i implements Function3 {
    public final /* synthetic */ ogd.a A;
    public final /* synthetic */ Integer B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ boolean E;
    public int u;
    public /* synthetic */ FlowCollector v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f191897w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ List f191898x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ List f191899y;
    public final /* synthetic */ h0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(Continuation continuation, List list, List list2, h0 h0Var, ogd.a aVar, Integer num, boolean z, boolean z3, boolean z4) {
        super(3, continuation);
        this.f191898x = list;
        this.f191899y = list2;
        this.z = h0Var;
        this.A = aVar;
        this.B = num;
        this.C = z;
        this.D = z3;
        this.E = z4;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        e0 e0Var = new e0((Continuation) obj4, this.f191898x, this.f191899y, this.z, this.A, this.B, this.C, this.D, this.E);
        e0Var.v = (FlowCollector) obj2;
        e0Var.f191897w = obj3;
        return e0Var.invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0157  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l3d.e0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
