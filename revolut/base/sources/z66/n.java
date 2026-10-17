package z66;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.defi.trade.impl.ui.trade.a f319697w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i, com.revolut.feature.defi.trade.impl.ui.trade.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f319697w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new n(0, this.f319697w, continuation);
            default:
                return new n(1, this.f319697w, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((n) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                com.revolut.feature.defi.trade.impl.ui.trade.a aVar2 = this.f319697w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    o16.e eVar = aVar2.f71888r;
                    this.v = 1;
                    obj2 = eVar.b(false, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                aVar2.H2(aVar2.f71892x, new ag1.l((Clause) obj2, 10));
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                com.revolut.feature.defi.trade.impl.ui.trade.a aVar4 = this.f319697w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    efm.r rVarB = xv5.c.b(aVar4.f71887q);
                    this.v = 1;
                    obj2 = nim.a.c(rVarB, this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                Intrinsics.checkNotNullExpressionValue(obj2, "awaitFirst(...)");
                aVar4.H2(aVar4.f71892x, new vgc.b(20, (xi0.b) obj2));
                return Unit.f186387a;
        }
    }
}
