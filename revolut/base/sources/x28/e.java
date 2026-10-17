package x28;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import v2e.h0;
import vkm.q;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends gim.i implements Function3 {
    public final /* synthetic */ dsh.e A;
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f302518w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f302519x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ j f302520y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Continuation continuation, j jVar, String str, dsh.e eVar, int i) {
        super(3, continuation);
        this.u = i;
        this.f302520y = jVar;
        this.z = str;
        this.A = eVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                e eVar = new e(continuation, this.f302520y, this.z, this.A, 0);
                eVar.f302518w = flowCollector;
                eVar.f302519x = obj3;
                return eVar.invokeSuspend(Unit.f186387a);
            default:
                e eVar2 = new e(continuation, this.f302520y, this.z, this.A, 1);
                eVar2.f302518w = flowCollector;
                eVar2.f302519x = obj3;
                return eVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Flow flowS;
        Flow flowF;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector = this.f302518w;
                    Continuation continuation = null;
                    if (((Boolean) this.f302519x).booleanValue()) {
                        j jVar = this.f302520y;
                        flowS = q.Q(jVar.f302528c.a(), new e(continuation, jVar, this.z, this.A, 1));
                    } else {
                        flowS = org.bouncycastle.jcajce.provider.digest.a.s(2, "Popular first buys are not available");
                    }
                    this.f302518w = null;
                    this.f302519x = null;
                    this.v = 1;
                    if (q.u(flowCollector, flowS, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector2 = this.f302518w;
                    Continuation continuation2 = null;
                    if (((Boolean) this.f302519x).booleanValue()) {
                        flowF = org.bouncycastle.jcajce.provider.digest.a.s(3, null);
                    } else {
                        j jVar2 = this.f302520y;
                        v9h.f fVar = jVar2.f302528c;
                        zfd.e eVarW = zi0.c.w(nim.a.v(nim.a.v(u0.m(q.Q(fVar.a(), new uec.d(continuation2, fVar, 19)), new h0(rd0.e.b(fVar.b()), 6)), new v80.a(9)), f.f302521a));
                        dsh.e eVar = this.A;
                        String str = this.z;
                        flowF = mo3.a.f(eVarW, new h(jVar2, str), new g(jVar2, str, eVar), i.f302526a);
                    }
                    this.f302518w = null;
                    this.f302519x = null;
                    this.v = 1;
                    if (q.u(flowCollector2, flowF, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
