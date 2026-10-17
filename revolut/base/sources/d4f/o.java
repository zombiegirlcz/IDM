package d4f;

import dfl.i0;
import java.io.Serializable;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class o extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f111298w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ p f111299x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(p pVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f111299x = pVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                o oVar = new o(this.f111299x, continuation, 0);
                oVar.f111298w = obj2;
                return oVar;
            case 1:
                o oVar2 = new o(this.f111299x, continuation, 1);
                oVar2.f111298w = obj2;
                return oVar2;
            case 2:
                o oVar3 = new o(this.f111299x, continuation, 2);
                oVar3.f111298w = obj2;
                return oVar3;
            default:
                o oVar4 = new o(this.f111299x, continuation, 3);
                oVar4.f111298w = obj2;
                return oVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((o) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((o) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((o) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((o) create((i0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                List list = (List) this.f111298w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                zjh.f fVar = this.f111299x.f111301b;
                this.f111298w = null;
                this.v = 1;
                Serializable serializableF = fVar.F(list, this);
                return serializableF == aVar ? aVar : serializableF;
            case 1:
                List list2 = (List) this.f111298w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                zjh.f fVar2 = this.f111299x.f111301b;
                this.f111298w = null;
                this.v = 1;
                Serializable serializableF2 = fVar2.F(list2, this);
                return serializableF2 == aVar2 ? aVar2 : serializableF2;
            case 2:
                List list3 = (List) this.f111298w;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                zjh.f fVar3 = this.f111299x.f111301b;
                this.f111298w = null;
                this.v = 1;
                Serializable serializableF3 = fVar3.F(list3, this);
                return serializableF3 == aVar3 ? aVar3 : serializableF3;
            default:
                i0 i0Var = (i0) this.f111298w;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                zjh.f fVar4 = this.f111299x.f111301b;
                this.f111298w = null;
                this.v = 1;
                Object objG = fVar4.G(i0Var, this);
                return objG == aVar4 ? aVar4 : objG;
        }
    }
}
