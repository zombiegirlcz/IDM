package mu5;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f208977w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ p f208978x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(p pVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f208978x = pVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                i iVar = new i(this.f208978x, continuation, 0);
                iVar.f208977w = obj2;
                return iVar;
            case 1:
                i iVar2 = new i(this.f208978x, continuation, 1);
                iVar2.f208977w = obj2;
                return iVar2;
            case 2:
                i iVar3 = new i(this.f208978x, continuation, 2);
                iVar3.f208977w = obj2;
                return iVar3;
            default:
                i iVar4 = new i(this.f208978x, continuation, 3);
                iVar4.f208977w = obj2;
                return iVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((i) create(flowCollector, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        p pVar = this.f208978x;
        switch (i) {
            case 0:
                FlowCollector flowCollector = (FlowCollector) this.f208977w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    mk0.a aVar2 = pVar.f208986a;
                    g gVar = p.Companion;
                    if (aVar2.a(new tk0.c("CRYPTO_EARNING_WIDGET_SHOW_UP_TO")) == null) {
                        Double d = new Double(st5.b.FIVE.b());
                        this.f208977w = null;
                        this.v = 1;
                        if (flowCollector.emit(d, this) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                FlowCollector flowCollector2 = (FlowCollector) this.f208977w;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    mk0.a aVar4 = pVar.f208986a;
                    g gVar2 = p.Companion;
                    if (aVar4.a(new tk0.c("CRYPTO_INVESTMENTS_WIDGET_SHOW_UP_TO")) == null) {
                        Double d5 = new Double(st5.b.FIVE.b());
                        this.f208977w = null;
                        this.v = 1;
                        if (flowCollector2.emit(d5, this) == aVar3) {
                            return aVar3;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                FlowCollector flowCollector3 = (FlowCollector) this.f208977w;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    mk0.a aVar6 = pVar.f208986a;
                    g gVar3 = p.Companion;
                    if (aVar6.a(new tk0.c("CRYPTO_PERPETUALS_WIDGET_SHOW_UP_TO")) == null) {
                        Double d6 = new Double(st5.b.FIVE.b());
                        this.f208977w = null;
                        this.v = 1;
                        if (flowCollector3.emit(d6, this) == aVar5) {
                            return aVar5;
                        }
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                FlowCollector flowCollector4 = (FlowCollector) this.f208977w;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    mk0.a aVar8 = pVar.f208986a;
                    g gVar4 = p.Companion;
                    if (aVar8.a(new tk0.c("CRYPTO_SPOT_MARGIN_TRADING_WIDGET_SHOW_UP_TO")) == null) {
                        Double d10 = new Double(st5.b.FIVE.b());
                        this.f208977w = null;
                        this.v = 1;
                        if (flowCollector4.emit(d10, this) == aVar7) {
                            return aVar7;
                        }
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
