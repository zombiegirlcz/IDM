package d7j;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
public final class j1 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g f112013w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j1(int i, com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g gVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f112013w = gVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j1(0, this.f112013w, continuation);
            case 1:
                return new j1(1, this.f112013w, continuation);
            case 2:
                return new j1(2, this.f112013w, continuation);
            case 3:
                return new j1(3, this.f112013w, continuation);
            case 4:
                return new j1(4, this.f112013w, continuation);
            case 5:
                return new j1(5, this.f112013w, continuation);
            default:
                return new j1(6, this.f112013w, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((j1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g gVar = this.f112013w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    gVar.H2(gVar.T, i1.f112009a);
                    this.v = 1;
                    if (com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g.J2(gVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                this.v = 2;
                if (com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g.K2(gVar, this) == aVar) {
                    return aVar;
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g gVar2 = this.f112013w;
                t1 t1Var = new t1(0, gVar2, null);
                this.v = 1;
                Object objB = pu7.a.B(gVar2.k, "on_nav_bar_description_click", t1Var, this);
                return objB == aVar2 ? aVar2 : objB;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g gVar3 = this.f112013w;
                t1 t1Var2 = new t1(1, gVar3, null);
                this.v = 1;
                Object objB2 = pu7.a.B(gVar3.k, "on_review_button_click", t1Var2, this);
                return objB2 == aVar3 ? aVar3 : objB2;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g gVar4 = this.f112013w;
                t1 t1Var3 = new t1(2, gVar4, null);
                this.v = 1;
                Object objB3 = pu7.a.B(gVar4.k, "onScheduleSettingsClick", t1Var3, this);
                return objB3 == aVar4 ? aVar4 : objB3;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g gVar5 = this.f112013w;
                com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.e eVar = new com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.e(gVar5, null);
                this.v = 1;
                Object objB4 = pu7.a.B(gVar5.k, "on_select_order_type_button_click", eVar, this);
                return objB4 == aVar5 ? aVar5 : objB4;
            case 5:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g gVar6 = this.f112013w;
                t1 t1Var4 = new t1(3, gVar6, null);
                this.v = 1;
                Object objB5 = pu7.a.B(gVar6.k, "on_switch_input_click", t1Var4, this);
                return objB5 == aVar6 ? aVar6 : objB5;
            default:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 != 0) {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g gVar7 = this.f112013w;
                t1 t1Var5 = new t1(4, gVar7, null);
                this.v = 1;
                Object objB6 = pu7.a.B(gVar7.k, "on_target_price_settings_click", t1Var5, this);
                return objB6 == aVar7 ? aVar7 : objB6;
        }
    }
}
