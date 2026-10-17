package zhl;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.q;

/* JADX INFO: loaded from: classes12.dex */
public final class g extends gim.i implements Function3 {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ Function1 C;
    public final /* synthetic */ vgl.a D;
    public int u;
    public /* synthetic */ FlowCollector v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f322442w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ k f322443x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ nel.n f322444y;
    public final /* synthetic */ vgl.b z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Continuation continuation, k kVar, nel.n nVar, vgl.b bVar, boolean z, boolean z3, Function1 function1, vgl.a aVar) {
        super(3, continuation);
        this.f322443x = kVar;
        this.f322444y = nVar;
        this.z = bVar;
        this.A = z;
        this.B = z3;
        this.C = function1;
        this.D = aVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        g gVar = new g((Continuation) obj4, this.f322443x, this.f322444y, this.z, this.A, this.B, this.C, this.D);
        gVar.v = (FlowCollector) obj2;
        gVar.f322442w = obj3;
        return gVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            FlowCollector flowCollector = this.v;
            Pair pair = (Pair) this.f322442w;
            eel.c cVar = (eel.c) pair.f186385a;
            eel.i iVar = (eel.i) pair.f186386b;
            go.g gVar = new go.g(cVar, 2);
            go.g gVar2 = new go.g(iVar, 2);
            String str = this.f322444y.f214596b;
            vgl.b bVar = this.z;
            k kVar = this.f322443x;
            Flow flowI = c6d.b.i(kVar.e(gVar, gVar2, str, bVar), new i(this.A, kVar, this.f322444y, this.B, this.C, this.D, cVar));
            this.v = null;
            this.f322442w = null;
            this.u = 1;
            if (q.u(flowCollector, flowI, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
