package et6;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class x extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f129364w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ r10.r f129365x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ pr6.e f129366y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(r10.r rVar, pr6.e eVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f129365x = rVar;
        this.f129366y = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                x xVar = new x(this.f129365x, this.f129366y, continuation, 0);
                xVar.f129364w = obj2;
                return xVar;
            default:
                x xVar2 = new x(this.f129365x, this.f129366y, continuation, 1);
                xVar2.f129364w = obj2;
                return xVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((x) create((od0.i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((x) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                od0.i iVar = (od0.i) this.f129364w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                pr6.e eVar = this.f129366y;
                if (i == 0) {
                    yhm.o.b(obj2);
                    f1 f1Var = (f1) this.f129365x.f250853c;
                    dj0.d dVar = eVar.f;
                    this.f129364w = iVar;
                    this.v = 1;
                    obj2 = f1Var.a(dVar, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return new pr6.g(eVar, (nr6.b) iVar.f224257a, (dj0.d) obj2);
            default:
                FlowCollector flowCollector = (FlowCollector) this.f129364w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                pr6.e eVar2 = this.f129366y;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    f1 f1Var2 = (f1) this.f129365x.f250853c;
                    dj0.d dVar2 = eVar2.f;
                    this.f129364w = flowCollector;
                    this.v = 1;
                    obj2 = f1Var2.a(dVar2, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                Data dataP = zi0.c.P(new pr6.g(eVar2, null, (dj0.d) obj2), false, null, 3);
                this.f129364w = null;
                this.v = 2;
                if (flowCollector.emit(dataP, this) == aVar2) {
                    return aVar2;
                }
                return Unit.f186387a;
        }
    }
}
