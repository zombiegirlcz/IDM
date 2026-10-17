package cu8;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class l0 extends gim.i implements Function2 {
    public final /* synthetic */ int u = 0;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ks8.c f108853w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ r0 f108854x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(r0 r0Var, ks8.c cVar, Continuation continuation) {
        super(2, continuation);
        this.f108854x = r0Var;
        this.f108853w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new l0(this.f108854x, this.f108853w, continuation);
            default:
                return new l0(this.f108853w, this.f108854x, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((l0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
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
                this.v = 1;
                Object objF = this.f108854x.f(this.f108853w, this);
                return objF == aVar ? aVar : objF;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                long jLongValue = Long.MAX_VALUE;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    if (this.f108853w.f189305a) {
                        efm.d0 d0VarP = osg.b.p(this.f108854x.f108889a, null, 2);
                        this.v = 1;
                        obj2 = nim.a.b(d0VarP, this);
                        if (obj2 == aVar2) {
                            return aVar2;
                        }
                    }
                    return new Long(jLongValue);
                }
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                Long l2 = ((fo3.c) obj2).f;
                if (l2 != null) {
                    jLongValue = l2.longValue();
                }
                return new Long(jLongValue);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(ks8.c cVar, r0 r0Var, Continuation continuation) {
        super(2, continuation);
        this.f108853w = cVar;
        this.f108854x = r0Var;
    }
}
