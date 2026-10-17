package ou6;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends gim.i implements Function3 {
    public final /* synthetic */ Object A;
    public Object B;
    public Object C;
    public Object D;
    public final /* synthetic */ int u = 0;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f229840w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f229841x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f229842y;
    public FlowCollector z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.revolut.feature.freelancer.impl.ui.acquiring_order.list.a aVar, Continuation continuation) {
        super(3, continuation);
        this.A = aVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        switch (this.u) {
            case 0:
                q qVar = new q((com.revolut.feature.freelancer.impl.ui.acquiring_order.list.a) this.A, (Continuation) obj4);
                qVar.f229840w = flowCollector;
                qVar.f229841x = obj3;
                return qVar.invokeSuspend(Unit.f186387a);
            default:
                q qVar2 = new q((Continuation) obj4, (s9h.h) this.A, (String) this.B, (String) this.C, (dsh.e) this.D, this.f229842y);
                qVar2.f229840w = flowCollector;
                qVar2.f229841x = obj3;
                return qVar2.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:4|(1:55)|(1:(1:(3:8|27|28)(2:9|10))(2:11|12))(2:14|(2:16|(1:57))(5:23|24|(1:58)|27|28))|13|53|19|20|24|(0)|27|28) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007c, code lost:
    
        r1 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007d, code lost:
    
        r14 = org.bouncycastle.jcajce.provider.digest.a.s(2, "Error happened fetching most traded widget config");
        r1 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ou6.q.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Continuation continuation, s9h.h hVar, String str, String str2, dsh.e eVar, int i) {
        super(3, continuation);
        this.A = hVar;
        this.B = str;
        this.C = str2;
        this.D = eVar;
        this.f229842y = i;
    }
}
