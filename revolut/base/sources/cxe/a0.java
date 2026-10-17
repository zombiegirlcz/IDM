package cxe;

import com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class a0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f109918w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.c f109919x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.c cVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f109919x = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                a0 a0Var = new a0(this.f109919x, continuation, 0);
                a0Var.f109918w = obj2;
                return a0Var;
            default:
                a0 a0Var2 = new a0(this.f109919x, continuation, 1);
                a0Var2.f109918w = obj2;
                return a0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((a0) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((a0) create((dj0.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objB;
        switch (this.u) {
            case 0:
                Pair pair = (Pair) this.f109918w;
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
                dj0.d dVar = (dj0.d) pair.f186385a;
                jxe.m mVar = (jxe.m) pair.f186386b;
                fxe.d dVar2 = this.f109919x.f90748t;
                this.f109918w = null;
                this.v = 1;
                dVar2.getClass();
                if (dVar.k()) {
                    dj0.d.Companion.getClass();
                    objB = dj0.d.e;
                } else {
                    SelectedMethod selectedMethod = mVar.f179188a;
                    if (selectedMethod instanceof SelectedMethod.StoredMethod.Card) {
                        objB = dVar2.a(dVar, this, ((SelectedMethod.StoredMethod.Card) selectedMethod).f90903a);
                    } else if (selectedMethod instanceof vye.b) {
                        objB = dVar2.b(dVar, ((vye.b) selectedMethod).e, this);
                    } else {
                        dj0.d.Companion.getClass();
                        objB = dj0.d.e;
                    }
                }
                return objB == aVar ? aVar : objB;
            default:
                dj0.d dVar3 = (dj0.d) this.f109918w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    fxe.e eVar = this.f109919x.f90747s;
                    this.f109918w = null;
                    this.v = 1;
                    eVar.f138813a.setValue(dVar3);
                    if (Unit.f186387a == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
