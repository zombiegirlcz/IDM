package fg8;

import com.revolut.data.model.Data;
import kl.t1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class r0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ t0 f134992w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f134993x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(t0 t0Var, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f134992w = t0Var;
        this.f134993x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new r0(this.f134992w, this.f134993x, continuation, 0);
            case 1:
                return new r0(this.f134992w, this.f134993x, continuation, 1);
            default:
                return new r0(this.f134992w, this.f134993x, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((r0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
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
                Object objB = u68.b.b(this.f134992w.f135002g, this.f134993x, null, null, this, 14);
                return objB == aVar ? aVar : objB;
            case 1:
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    t1 t1Var = this.f134992w.f;
                    this.v = 1;
                    Object objA = nim.a.a(((un8.h) ((un8.c) t1Var.f185240b)).e.g(this.f134993x, true), this);
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
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    obj2 = u68.b.b(this.f134992w.f135002g, this.f134993x, null, null, this, 14);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return new Data(obj2, null, false, 6, null);
        }
    }
}
