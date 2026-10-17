package g9d;

import bbg.c0;
import com.revolut.data.model.Data;
import exe.j;
import f2i.x;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import lde.m;
import oid.t;
import r10.q;
import w4l.h;
import w4l.k;
import wkm.l;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends i implements Function3 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int u = 2;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f141538w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f141539x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ boolean f141540y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Continuation continuation, k23.b bVar, k23.a aVar, String str, boolean z) {
        super(3, continuation);
        this.A = bVar;
        this.B = aVar;
        this.z = str;
        this.f141540y = z;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                f fVar = new f(continuation, (q) this.A, this.z, this.f141540y, (Function0) this.B);
                fVar.f141538w = flowCollector;
                fVar.f141539x = obj3;
                return fVar.invokeSuspend(Unit.f186387a);
            case 1:
                f fVar2 = new f(continuation, (r10.f) this.A, this.f141540y, this.z, (co3.a) this.B);
                fVar2.f141538w = flowCollector;
                fVar2.f141539x = obj3;
                return fVar2.invokeSuspend(Unit.f186387a);
            default:
                f fVar3 = new f(continuation, (k23.b) this.A, (k23.a) this.B, this.z, this.f141540y);
                fVar3.f141538w = flowCollector;
                fVar3.f141539x = obj3;
                return fVar3.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Flow gVar;
        switch (this.u) {
            case 0:
                q qVar = (q) this.A;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector = this.f141538w;
                    Continuation continuation = null;
                    l lVarQ = vkm.q.Q(new j(new fo6.d(((m) qVar.f250849b).a(this.z, this.f141540y), 28), 7), new c0(continuation, qVar, ((Boolean) this.f141539x).booleanValue(), 3));
                    g1k.i iVar = new g1k.i(new x(1, (Function0) this.B, s.class, "suspendConversion0", "observeRecurrentPaymentTroubleshooterData$lambda$0$suspendConversion0(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 28), continuation, 21);
                    this.f141538w = null;
                    this.f141539x = null;
                    this.v = 1;
                    vkm.q.w(flowCollector);
                    Object objCollect = lVarQ.collect(new akg.m(new g27.d(new g27.d(flowCollector, 28), 27), iVar, 5), this);
                    if (objCollect != aVar) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect != aVar) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect != aVar) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect != aVar) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector2 = this.f141538w;
                    boolean zBooleanValue = ((Boolean) this.f141539x).booleanValue();
                    try {
                        oid.e eVar = (oid.e) ((r10.f) this.A).b;
                        boolean z = this.f141540y || zBooleanValue;
                        String category = this.z;
                        co3.a aVar3 = (co3.a) this.B;
                        Intrinsics.checkNotNullParameter(category, "category");
                        k kVar = w4l.i.f294643c;
                        if (!z) {
                            kVar = null;
                        }
                        if (kVar == null) {
                            kVar = h.f294642c;
                        }
                        gVar = rd0.e.b(eVar.d.e(new t(category, aVar3 != null ? Double.valueOf(aVar3.f25486a) : null, aVar3 != null ? Double.valueOf(aVar3.f25487b) : null), kVar));
                    } catch (Exception e) {
                        gVar = new go.g(new Data(null, e, false, 5, null), 2);
                    }
                    this.f141538w = null;
                    this.f141539x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, gVar, this) == aVar2) {
                        return aVar2;
                    }
                    break;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector3 = this.f141538w;
                    hha.d dVar = (hha.d) this.f141539x;
                    k23.b bVar = (k23.b) this.A;
                    k23.a aVar5 = (k23.a) this.B;
                    t38.e eVarA = k23.b.a(bVar, aVar5.f180307a, aVar5.f180308b, aVar5.f180309c, dVar.f152287a, this.z, this.f141540y);
                    this.f141538w = null;
                    this.f141539x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, eVarA, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Continuation continuation, r10.f fVar, boolean z, String str, co3.a aVar) {
        super(3, continuation);
        this.A = fVar;
        this.f141540y = z;
        this.z = str;
        this.B = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Continuation continuation, q qVar, String str, boolean z, Function0 function0) {
        super(3, continuation);
        this.A = qVar;
        this.z = str;
        this.f141540y = z;
        this.B = function0;
    }
}
