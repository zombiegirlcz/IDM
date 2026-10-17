package mu5;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p f208983w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ st5.b f208984x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(p pVar, st5.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f208983w = pVar;
        this.f208984x = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new n(this.f208983w, this.f208984x, continuation, 0);
            case 1:
                return new n(this.f208983w, this.f208984x, continuation, 1);
            case 2:
                return new n(this.f208983w, this.f208984x, continuation, 2);
            default:
                return new n(this.f208983w, this.f208984x, continuation, 3);
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
        int i = this.u;
        st5.b bVar = this.f208984x;
        p pVar = this.f208983w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    mk0.a aVar2 = pVar.f208986a;
                    g gVar = p.Companion;
                    tk0.c cVar = new tk0.c("CRYPTO_EARNING_WIDGET_SHOW_UP_TO");
                    Double d = new Double(bVar.b());
                    this.v = 1;
                    if (aVar2.e(cVar, d, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    mk0.a aVar4 = pVar.f208986a;
                    g gVar2 = p.Companion;
                    tk0.c cVar2 = new tk0.c("CRYPTO_INVESTMENTS_WIDGET_SHOW_UP_TO");
                    Double d5 = new Double(bVar.b());
                    this.v = 1;
                    if (aVar4.e(cVar2, d5, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    mk0.a aVar6 = pVar.f208986a;
                    g gVar3 = p.Companion;
                    tk0.c cVar3 = new tk0.c("CRYPTO_PERPETUALS_WIDGET_SHOW_UP_TO");
                    Double d6 = new Double(bVar.b());
                    this.v = 1;
                    if (aVar6.e(cVar3, d6, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    mk0.a aVar8 = pVar.f208986a;
                    g gVar4 = p.Companion;
                    tk0.c cVar4 = new tk0.c("CRYPTO_SPOT_MARGIN_TRADING_WIDGET_SHOW_UP_TO");
                    Double d10 = new Double(bVar.b());
                    this.v = 1;
                    if (aVar8.e(cVar4, d10, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
