package arb;

import a26.q;
import gim.i;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import skm.e0;
import skm.p0;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f8621w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g f8622x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(g gVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f8622x = gVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f8622x, continuation, 0);
                cVar.f8621w = obj2;
                return cVar;
            case 1:
                c cVar2 = new c(this.f8622x, continuation, 1);
                cVar2.f8621w = obj2;
                return cVar2;
            default:
                c cVar3 = new c(this.f8622x, continuation, 2);
                cVar3.f8621w = obj2;
                return cVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((Set) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        g gVar = this.f8622x;
        Continuation continuation = null;
        switch (i) {
            case 0:
                Set set = (Set) this.f8621w;
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    this.f8621w = null;
                    this.v = 1;
                    Object objG = e0.G(new q(set, gVar, continuation, 15), this);
                    if (objG != obj3) {
                        objG = Unit.f186387a;
                    }
                    if (objG == obj3) {
                        return obj3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                String str = (String) this.f8621w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    brb.e eVar = gVar.f8632c;
                    this.f8621w = null;
                    this.v = 1;
                    if (eVar.d(str, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                FlowCollector flowCollector = (FlowCollector) this.f8621w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    o.b(obj2);
                    brb.e eVar2 = gVar.f8632c;
                    this.f8621w = flowCollector;
                    this.v = 1;
                    bf5.a aVar3 = new bf5.a(eVar2, continuation, 29);
                    p0 p0Var = p0.f264001a;
                    obj2 = e0.J(elm.f.f127540b, aVar3, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        return Unit.f186387a;
                    }
                    o.b(obj2);
                }
                if (((Set) obj2).isEmpty()) {
                    obj2 = null;
                }
                Set set2 = (Set) obj2;
                if (set2 != null) {
                    this.f8621w = null;
                    this.v = 2;
                    if (flowCollector.emit(set2, this) == aVar2) {
                        return aVar2;
                    }
                }
                return Unit.f186387a;
        }
    }
}
