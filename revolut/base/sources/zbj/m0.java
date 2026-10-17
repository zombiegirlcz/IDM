package zbj;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes11.dex */
public final class m0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.crypto_deposits.impl.ui.overview.c f320919w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(com.revolut.retail.feature.crypto_deposits.impl.ui.overview.c cVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f320919w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new m0(this.f320919w, continuation, 0);
            default:
                return new m0(this.f320919w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((m0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    vbj.c cVar = this.f320919w.u;
                    cVar.getClass();
                    pfm.h hVar = new pfm.h(new ty7.b(cVar, 11), 2);
                    Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                    pfm.r rVarG0 = te0.w.g0(hVar);
                    this.v = 1;
                    if (nim.a.a(rVarG0, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                com.revolut.retail.feature.crypto_deposits.impl.ui.overview.c cVar2 = this.f320919w;
                cli.y yVar = cVar2.F;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    aa7.c cVar3 = new aa7.c(new vkm.t0(yVar.B(new j0(9)), 1), 7);
                    this.v = 1;
                    obj2 = vkm.q.x(cVar3, this);
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
                f0 f0Var = cVar2.A;
                Flow flowF = yVar.F();
                this.v = 2;
                if (f0Var.Z2((o) obj2, flowF, this) == aVar2) {
                    return aVar2;
                }
                return Unit.f186387a;
        }
    }
}
