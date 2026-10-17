package n1g;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class m extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f211335w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(r rVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f211335w = rVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new m(this.f211335w, continuation, 0);
            case 1:
                return new m(this.f211335w, continuation, 1);
            default:
                return new m(this.f211335w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((m) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Continuation continuation = null;
        r rVar = this.f211335w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                mtd.e eVar = new mtd.e(rVar, continuation, 3);
                this.v = 1;
                Object objB = pu7.a.B(rVar.k, "BOOKING_STATUS_POLLING_TASK_ID", eVar, this);
                return objB == aVar ? aVar : objB;
            case 1:
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    c1g.h hVar = rVar.f211343r;
                    String str = rVar.f211341p.f93018a;
                    this.v = 1;
                    Object objA = nim.a.a(hVar.f20486a.f170037h.g(str, false), this);
                    if (objA != obj3) {
                        objA = Unit.f186387a;
                    }
                    if (objA != obj3) {
                        objA = Unit.f186387a;
                    }
                    if (objA == obj3) {
                        return obj3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                try {
                    if (i5 == 0) {
                        yhm.o.b(obj2);
                        r10.f fVar = rVar.f211347x;
                        this.v = 1;
                        w4l.f fVar2 = ((l0g.e) fVar.b).f;
                        Object obj4 = Unit.f186387a;
                        Object objA2 = nim.a.a(ue0.e.v(fVar2.g(obj4, false)), this);
                        if (objA2 != aVar2) {
                            objA2 = obj4;
                        }
                        if (objA2 == aVar2) {
                            obj4 = objA2;
                        }
                        if (obj4 == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i5 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                    }
                    return Unit.f186387a;
                } catch (Exception e) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                    return null;
                }
        }
    }
}
