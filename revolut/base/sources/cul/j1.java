package cul;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class j1 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.trading.orders.ui.invest.placement.screens.edit.e f109122w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j1(com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f109122w = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j1(this.f109122w, continuation, 0);
            case 1:
                return new j1(this.f109122w, continuation, 1);
            case 2:
                return new j1(this.f109122w, continuation, 2);
            case 3:
                return new j1(this.f109122w, continuation, 3);
            case 4:
                return new j1(this.f109122w, continuation, 4);
            case 5:
                return new j1(this.f109122w, continuation, 5);
            case 6:
                return new j1(this.f109122w, continuation, 6);
            case 7:
                return new j1(this.f109122w, continuation, 7);
            case 8:
                return new j1(this.f109122w, continuation, 8);
            case 9:
                return new j1(this.f109122w, continuation, 9);
            case 10:
                return new j1(this.f109122w, continuation, 10);
            case 11:
                return new j1(this.f109122w, continuation, 11);
            case 12:
                return new j1(this.f109122w, continuation, 12);
            case 13:
                return new j1(this.f109122w, continuation, 13);
            case 14:
                return new j1(this.f109122w, continuation, 14);
            case 15:
                return new j1(this.f109122w, continuation, 15);
            case 16:
                return new j1(this.f109122w, continuation, 16);
            default:
                return new j1(this.f109122w, continuation, 17);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((j1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (this.f109122w.c3(this) == aVar) {
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
                com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar = this.f109122w;
                com.revolut.trading.orders.ui.invest.placement.screens.edit.b bVar = new com.revolut.trading.orders.ui.invest.placement.screens.edit.b(eVar, null);
                this.v = 1;
                Object objB = pu7.a.B(eVar.k, "on_currency_switcher_click", bVar, this);
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
                com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar2 = this.f109122w;
                k1 k1Var = new k1(eVar2, null, 0);
                this.v = 1;
                Object objB2 = pu7.a.B(eVar2.k, "on_dialog_proceed_without_selling_all_button_click", k1Var, this);
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
                com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar3 = this.f109122w;
                k1 k1Var2 = new k1(eVar3, null, 1);
                this.v = 1;
                Object objB3 = pu7.a.B(eVar3.k, "on_dialog_sell_all_button_click", k1Var2, this);
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
                com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar4 = this.f109122w;
                k1 k1Var3 = new k1(eVar4, null, 3);
                this.v = 1;
                Object objB4 = pu7.a.B(eVar4.k, "on_extended_hours_info_click", k1Var3, this);
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
                com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar5 = this.f109122w;
                c64.d dVar = new c64.d(eVar5, null, 20);
                this.v = 1;
                Object objB5 = pu7.a.B(eVar5.k, "on_fiat_exchange_click", dVar, this);
                return objB5 == aVar6 ? aVar6 : objB5;
            case 6:
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
                com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar6 = this.f109122w;
                k1 k1Var4 = new k1(eVar6, null, 5);
                this.v = 1;
                Object objB6 = pu7.a.B(eVar6.k, "on_instrument_rate_click", k1Var4, this);
                return objB6 == aVar7 ? aVar7 : objB6;
            case 7:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 != 0) {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar7 = this.f109122w;
                n1 n1Var = new n1(eVar7, null);
                this.v = 1;
                Object objB7 = pu7.a.B(eVar7.k, "on_masking_delegate_binder_triggered", n1Var, this);
                return objB7 == aVar8 ? aVar8 : objB7;
            case 8:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 != 0) {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar8 = this.f109122w;
                k1 k1Var5 = new k1(eVar8, null, 8);
                this.v = 1;
                Object objB8 = pu7.a.B(eVar8.k, "on_minimum_lots_click", k1Var5, this);
                return objB8 == aVar9 ? aVar9 : objB8;
            case 9:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 != 0) {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar9 = this.f109122w;
                k1 k1Var6 = new k1(eVar9, null, 9);
                this.v = 1;
                Object objB9 = pu7.a.B(eVar9.k, "on_next_button_click", k1Var6, this);
                return objB9 == aVar10 ? aVar10 : objB9;
            case 10:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 != 0) {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar10 = this.f109122w;
                k1 k1Var7 = new k1(eVar10, null, 11);
                this.v = 1;
                Object objB10 = pu7.a.B(eVar10.k, "on_output_text_click", k1Var7, this);
                return objB10 == aVar11 ? aVar11 : objB10;
            case 11:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 != 0) {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar11 = this.f109122w;
                k1 k1Var8 = new k1(eVar11, null, 12);
                this.v = 1;
                Object objB11 = pu7.a.B(eVar11.k, "onSecurityBalanceClick", k1Var8, this);
                return objB11 == aVar12 ? aVar12 : objB11;
            case 12:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 != 0) {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar12 = this.f109122w;
                com.revolut.trading.orders.ui.invest.placement.screens.edit.c cVar = new com.revolut.trading.orders.ui.invest.placement.screens.edit.c(eVar12, null);
                this.v = 1;
                Object objB12 = pu7.a.B(eVar12.k, "on_select_order_type_button_click", cVar, this);
                return objB12 == aVar13 ? aVar13 : objB12;
            case 13:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 != 0) {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar13 = this.f109122w;
                k1 k1Var9 = new k1(eVar13, null, 13);
                this.v = 1;
                Object objB13 = pu7.a.B(eVar13.k, "on_set_expiry_date_click", k1Var9, this);
                return objB13 == aVar14 ? aVar14 : objB13;
            case 14:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 != 0) {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar14 = this.f109122w;
                k1 k1Var10 = new k1(eVar14, null, 14);
                this.v = 1;
                Object objB14 = pu7.a.B(eVar14.k, "on_set_frequency_settings_click", k1Var10, this);
                return objB14 == aVar15 ? aVar15 : objB14;
            case 15:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 != 0) {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar15 = this.f109122w;
                k1 k1Var11 = new k1(eVar15, null, 15);
                this.v = 1;
                Object objB15 = pu7.a.B(eVar15.k, "on_switch_input_click", k1Var11, this);
                return objB15 == aVar16 ? aVar16 : objB15;
            case 16:
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar16 = this.f109122w;
                if (i100 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (eVar16.S2(this) == obj3) {
                        return obj3;
                    }
                } else {
                    if (i100 != 1) {
                        if (i100 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                this.v = 2;
                Object objO = skm.e0.o(new c5a.m0(eVar16, null, 18), this);
                if (objO != obj3) {
                    objO = Unit.f186387a;
                }
                if (objO == obj3) {
                    return obj3;
                }
                return Unit.f186387a;
            default:
                com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar17 = this.f109122w;
                cli.y yVar = eVar17.m0;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 != 0) {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                jhi.b bVarH = mo3.a.h(com.revolut.data.database.models.openbanking.d.x("InvestOrderEditScreenModel", "showPdtWarningDialog", zh9.u0.i(yVar.B(new p0(27)), yVar.B(new p0(28)), vkm.q.Q(yVar.B(new cui.s(10)), new u0(null, eVar17, 4)))), new m0(eVar17, 5), null, 6);
                this.v = 1;
                Object objX = vkm.q.x(bVarH, this);
                return objX == aVar17 ? aVar17 : objX;
        }
    }
}
