package aem;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes23.dex */
public final class c extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f3698w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f3699x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Function3 f3700y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Function3 function3, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f3700y = function3;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        sem.f fVar = (sem.f) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                c cVar = new c(this.f3700y, continuation, 0);
                cVar.f3698w = fVar;
                cVar.f3699x = obj3;
                return cVar.invokeSuspend(Unit.f186387a);
            default:
                c cVar2 = new c(this.f3700y, continuation, 1);
                cVar2.f3698w = fVar;
                cVar2.f3699x = obj3;
                return cVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                sem.f fVar = (sem.f) this.f3698w;
                Object obj3 = this.f3699x;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    if (!(obj3 instanceof nem.c)) {
                        return Unit.f186387a;
                    }
                    Object obj4 = fVar.f262233a;
                    this.f3698w = fVar;
                    this.f3699x = null;
                    this.v = 1;
                    obj2 = this.f3700y.invoke(obj4, obj3, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                nem.c cVar = (nem.c) obj2;
                if (cVar == null) {
                    return Unit.f186387a;
                }
                this.f3698w = null;
                this.f3699x = null;
                this.v = 2;
                if (fVar.d(cVar, this) == aVar) {
                    return aVar;
                }
                return Unit.f186387a;
            default:
                sem.f fVar2 = (sem.f) this.f3698w;
                Object obj5 = this.f3699x;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    Object obj6 = fVar2.f262233a;
                    this.f3698w = fVar2;
                    this.f3699x = null;
                    this.v = 1;
                    obj2 = this.f3700y.invoke(obj6, obj5, this);
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
                nem.c cVar2 = (nem.c) obj2;
                if (cVar2 != null) {
                    this.f3698w = null;
                    this.f3699x = null;
                    this.v = 2;
                    if (fVar2.d(cVar2, this) == aVar2) {
                        return aVar2;
                    }
                }
                return Unit.f186387a;
        }
    }
}
