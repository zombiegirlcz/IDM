package u8j;

import efm.d0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import pfm.r;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.asset_details.a f278242w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.asset_details.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f278242w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.f278242w, continuation, 0);
            case 1:
                return new g(this.f278242w, continuation, 1);
            default:
                return new g(this.f278242w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                j61.b bVar = this.f278242w.G;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    pfm.a aVarE = j61.b.c(bVar).e(j61.b.b(bVar));
                    Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                    this.v = 1;
                    if (nim.a.a(aVarE, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.asset_details.a aVar3 = this.f278242w;
                    r rVarC = ((xv5.h) aVar3.H).c(aVar3.f99968r.f99962a);
                    this.v = 1;
                    if (nim.a.a(rVarC, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.asset_details.a aVar5 = this.f278242w;
                if (i3 == 0) {
                    o.b(obj2);
                    d0 d0VarC = ((gi5.d) aVar5.f99970t).c(aVar5.f99968r.f99962a);
                    this.v = 1;
                    obj2 = nim.a.b(d0VarC, this);
                    if (obj2 == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                sh5.c cVar = (sh5.c) obj2;
                if (cVar.f263437c) {
                    aVar5.H2(aVar5.M, new bke.o(cVar, 14));
                }
                return Unit.f186387a;
        }
    }
}
