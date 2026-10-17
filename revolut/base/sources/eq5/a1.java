package eq5;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class a1 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.j f128252w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a1(int i, com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.j jVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f128252w = jVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new a1(0, this.f128252w, continuation);
            case 1:
                return new a1(1, this.f128252w, continuation);
            default:
                return new a1(2, this.f128252w, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((a1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.j jVar = this.f128252w;
                cli.y yVar = jVar.F;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    vkm.t0 t0Var = new vkm.t0(yVar.B(new ep2.l(22)), 1);
                    this.v = 1;
                    obj2 = vkm.q.x(t0Var, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                jVar.H2(yVar, new dv5.p(6, (xi0.b) obj2));
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.j jVar2 = this.f128252w;
                    f1 f1Var = new f1(0, jVar2, null);
                    this.v = 1;
                    if (jVar2.p2(this, f1Var) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.j jVar3 = this.f128252w;
                    f1 f1Var2 = new f1(1, jVar3, null);
                    this.v = 1;
                    if (jVar3.p2(this, f1Var2) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
