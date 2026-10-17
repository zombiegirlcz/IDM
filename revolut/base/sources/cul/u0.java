package cul;

import com.revolut.feature.trading_orders.common.models.FrequencySettings;
import com.revolut.retail.trading.core.domain.orders.OrderExpiry;
import com.revolut.trading.orders.ui.invest.placement.models.InvestInputValue;
import java.util.Optional;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes12.dex */
public final class u0 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f109171w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f109172x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.trading.orders.ui.invest.placement.screens.edit.e f109173y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(Continuation continuation, com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar, int i) {
        super(3, continuation);
        this.u = i;
        this.f109173y = eVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                u0 u0Var = new u0(continuation, this.f109173y, 0);
                u0Var.f109171w = flowCollector;
                u0Var.f109172x = obj3;
                return u0Var.invokeSuspend(Unit.f186387a);
            case 1:
                u0 u0Var2 = new u0(continuation, this.f109173y, 1);
                u0Var2.f109171w = flowCollector;
                u0Var2.f109172x = obj3;
                return u0Var2.invokeSuspend(Unit.f186387a);
            case 2:
                u0 u0Var3 = new u0(continuation, this.f109173y, 2);
                u0Var3.f109171w = flowCollector;
                u0Var3.f109172x = obj3;
                return u0Var3.invokeSuspend(Unit.f186387a);
            case 3:
                u0 u0Var4 = new u0(continuation, this.f109173y, 3);
                u0Var4.f109171w = flowCollector;
                u0Var4.f109172x = obj3;
                return u0Var4.invokeSuspend(Unit.f186387a);
            case 4:
                u0 u0Var5 = new u0(continuation, this.f109173y, 4);
                u0Var5.f109171w = flowCollector;
                u0Var5.f109172x = obj3;
                return u0Var5.invokeSuspend(Unit.f186387a);
            case 5:
                u0 u0Var6 = new u0(continuation, this.f109173y, 5);
                u0Var6.f109171w = flowCollector;
                u0Var6.f109172x = obj3;
                return u0Var6.invokeSuspend(Unit.f186387a);
            default:
                u0 u0Var7 = new u0(continuation, this.f109173y, 6);
                u0Var7.f109171w = flowCollector;
                u0Var7.f109172x = obj3;
                return u0Var7.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Flow flowV;
        Flow flowX2;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f109171w;
                    Flow flowG3 = ((kvl.a0) this.f109173y.W).g3((k4l.r0) this.f109172x);
                    this.f109171w = null;
                    this.f109172x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, flowG3, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar = this.f109173y;
                cli.y yVar = eVar.m0;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f109171w;
                    akg.n nVarI = zh9.u0.i(yVar.B(v0.f109192a), vkm.q.q(xam.a.h(new y0(eVar, (Continuation) null, 10), zh9.u0.i(yVar.B(new l0(17)), eVar.O2(), eVar.T2()))), eVar.O2());
                    this.f109171w = null;
                    this.f109172x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, nVarI, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector3 = this.f109171w;
                    FrequencySettings frequencySettings = (FrequencySettings) this.f109172x;
                    Flow flowI = frequencySettings != null ? zi0.c.i(frequencySettings) : com.revolut.trading.orders.ui.invest.placement.screens.edit.e.I2(this.f109173y);
                    this.f109171w = null;
                    this.f109172x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, flowI, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector4 = this.f109171w;
                    OrderExpiry orderExpiry = (OrderExpiry) this.f109172x;
                    Flow flowI2 = orderExpiry != null ? zi0.c.i(orderExpiry) : this.f109173y.P2();
                    this.f109171w = null;
                    this.f109172x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector4, flowI2, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector5 = this.f109171w;
                    int i21 = q0.f109158a[((k4l.r0) this.f109172x).ordinal()];
                    if (i21 == 1) {
                        flowV = nim.a.v(com.revolut.trading.orders.ui.invest.placement.screens.edit.e.Z2(this.f109173y), z0.f109209a);
                    } else {
                        if (i21 != 2 && i21 != 3 && i21 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        flowV = zi0.c.i(Optional.empty());
                    }
                    this.f109171w = null;
                    this.f109172x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector5, flowV, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 5:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector6 = this.f109171w;
                    Flow flowV2 = d9.e1.G(((InvestInputValue) this.f109172x).f106844a) ? nim.a.v(this.f109173y.l3(), h1.f109114a) : zi0.c.i(Boolean.FALSE);
                    this.f109171w = null;
                    this.f109172x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector6, flowV2, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar2 = this.f109173y;
                gul.h0 h0Var = eVar2.U;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector7 = this.f109171w;
                    int i33 = q0.f109158a[((k4l.r0) this.f109172x).ordinal()];
                    if (i33 == 1) {
                        flowX2 = eVar2.X2();
                    } else if (i33 == 2) {
                        flowX2 = vkm.q.q(nim.a.v(eVar2.Q2(), new k0(eVar2, 13)));
                    } else if (i33 == 3) {
                        h0Var.getClass();
                        flowX2 = zi0.c.i(k4l.q0.GTC);
                    } else {
                        if (i33 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        h0Var.getClass();
                        flowX2 = zi0.c.i(k4l.q0.DAY);
                    }
                    this.f109171w = null;
                    this.f109172x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector7, flowX2, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
