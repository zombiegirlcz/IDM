package mk0;

import ahe.m0;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.card.api.navigation.descriptor.CreditCardDisplayBalanceSettings$InputData;
import com.revolut.feature.retail.savings.impl.ui.automations.SavingsAutomationsScreenContract$InputData;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.feature_move_money.api.model.OrderMode;
import com.revolut.retail.feature.api.AnalyticsAccount;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import efm.d0;
import et6.i2;
import hmc.w;
import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import k4l.e0;
import klf.l1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import mkf.i0;
import mle.x;
import mle.z;
import n30.b0;
import n68.u;
import n8f.s;
import n8i.b1;
import om4.k3;
import tof.a3;
import tof.cc;
import tof.gb;
import tof.q7;
import tof.t3;
import tof.y6;
import v30.e1;
import vkm.j2;
import vkm.q0;
import vkm.v1;
import vkm.y;
import zh9.u0;
import zhm.f0;
import zhm.h0;
import zhm.r0;
import zhm.v;

/* JADX INFO: loaded from: classes19.dex */
public final class f extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f206142w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f206143x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f206144y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f206144y = obj2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                f fVar = new f((Continuation) obj4, (o) this.f206144y, 0);
                fVar.f206142w = (FlowCollector) obj2;
                fVar.f206143x = obj3;
                return fVar.invokeSuspend(Unit.f186387a);
            case 1:
                f fVar2 = new f((mkf.c) this.f206144y, (Continuation) obj4, 1);
                fVar2.f206142w = (a3) obj2;
                fVar2.f206143x = (t3) obj3;
                return fVar2.invokeSuspend(Unit.f186387a);
            case 2:
                f fVar3 = new f((Continuation) obj4, (i0) this.f206144y, 2);
                fVar3.f206142w = (FlowCollector) obj2;
                fVar3.f206143x = obj3;
                return fVar3.invokeSuspend(Unit.f186387a);
            case 3:
                f fVar4 = new f((Continuation) obj4, (z) this.f206144y, 3);
                fVar4.f206142w = (FlowCollector) obj2;
                fVar4.f206143x = obj3;
                return fVar4.invokeSuspend(Unit.f186387a);
            case 4:
                f fVar5 = new f((Continuation) obj4, (mo8.h) this.f206144y, 4);
                fVar5.f206142w = (FlowCollector) obj2;
                fVar5.f206143x = obj3;
                return fVar5.invokeSuspend(Unit.f186387a);
            case 5:
                f fVar6 = new f((Continuation) obj4, (mr4.g) this.f206144y, 5);
                fVar6.f206142w = (FlowCollector) obj2;
                fVar6.f206143x = obj3;
                return fVar6.invokeSuspend(Unit.f186387a);
            case 6:
                f fVar7 = new f((Continuation) obj4, (a5h.g) this.f206144y, 6);
                fVar7.f206142w = (FlowCollector) obj2;
                fVar7.f206143x = obj3;
                return fVar7.invokeSuspend(Unit.f186387a);
            case 7:
                f fVar8 = new f((Continuation) obj4, (mtl.p) this.f206144y, 7);
                fVar8.f206142w = (FlowCollector) obj2;
                fVar8.f206143x = obj3;
                return fVar8.invokeSuspend(Unit.f186387a);
            case 8:
                f fVar9 = new f((Continuation) obj4, (muj.c) this.f206144y, 8);
                fVar9.f206142w = (FlowCollector) obj2;
                fVar9.f206143x = obj3;
                return fVar9.invokeSuspend(Unit.f186387a);
            case 9:
                f fVar10 = new f((Continuation) obj4, (com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.screens.technicals.a) this.f206144y, 9);
                fVar10.f206142w = (FlowCollector) obj2;
                fVar10.f206143x = obj3;
                return fVar10.invokeSuspend(Unit.f186387a);
            case 10:
                f fVar11 = new f((Continuation) obj4, (mul.j) this.f206144y, 10);
                fVar11.f206142w = (FlowCollector) obj2;
                fVar11.f206143x = obj3;
                return fVar11.invokeSuspend(Unit.f186387a);
            case 11:
                f fVar12 = new f((Continuation) obj4, (mzb.k) this.f206144y, 11);
                fVar12.f206142w = (FlowCollector) obj2;
                fVar12.f206143x = obj3;
                return fVar12.invokeSuspend(Unit.f186387a);
            case 12:
                f fVar13 = new f((Continuation) obj4, (com.revolut.retail.feature.balance.picker.impl.balance_picker_v2.c) this.f206144y, 12);
                fVar13.f206142w = (FlowCollector) obj2;
                fVar13.f206143x = obj3;
                return fVar13.invokeSuspend(Unit.f186387a);
            case 13:
                f fVar14 = new f((Continuation) obj4, (b0) this.f206144y, 13);
                fVar14.f206142w = (FlowCollector) obj2;
                fVar14.f206143x = obj3;
                return fVar14.invokeSuspend(Unit.f186387a);
            case 14:
                f fVar15 = new f((Continuation) obj4, (n32.g) this.f206144y, 14);
                fVar15.f206142w = (FlowCollector) obj2;
                fVar15.f206143x = obj3;
                return fVar15.invokeSuspend(Unit.f186387a);
            case 15:
                f fVar16 = new f((Continuation) obj4, (com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.f) this.f206144y, 15);
                fVar16.f206142w = (FlowCollector) obj2;
                fVar16.f206143x = obj3;
                return fVar16.invokeSuspend(Unit.f186387a);
            case 16:
                f fVar17 = new f((n4d.m) this.f206144y, (Continuation) obj4, 16);
                fVar17.f206143x = (Pair) obj3;
                return fVar17.invokeSuspend(Unit.f186387a);
            case 17:
                f fVar18 = new f((Continuation) obj4, (com.revolut.feature.junior.account_activation.impl.ui.screen.request.c) this.f206144y, 17);
                fVar18.f206142w = (FlowCollector) obj2;
                fVar18.f206143x = obj3;
                return fVar18.invokeSuspend(Unit.f186387a);
            case 18:
                f fVar19 = new f((Continuation) obj4, (s) this.f206144y, 18);
                fVar19.f206142w = (FlowCollector) obj2;
                fVar19.f206143x = obj3;
                return fVar19.invokeSuspend(Unit.f186387a);
            case 19:
                f fVar20 = new f((Continuation) obj4, (com.revolut.feature_move_money.impl.topup.a) this.f206144y, 19);
                fVar20.f206142w = (FlowCollector) obj2;
                fVar20.f206143x = obj3;
                return fVar20.invokeSuspend(Unit.f186387a);
            case 20:
                f fVar21 = new f((Continuation) obj4, (com.revolut.feature.junior.isa.impl.ui.jisa_child_trading_creation.a) this.f206144y, 20);
                fVar21.f206142w = (FlowCollector) obj2;
                fVar21.f206143x = obj3;
                return fVar21.invokeSuspend(Unit.f186387a);
            case 21:
                f fVar22 = new f((Continuation) obj4, (nci.r) this.f206144y, 21);
                fVar22.f206142w = (FlowCollector) obj2;
                fVar22.f206143x = obj3;
                return fVar22.invokeSuspend(Unit.f186387a);
            case 22:
                f fVar23 = new f((Continuation) obj4, (nd8.q) this.f206144y, 22);
                fVar23.f206142w = (FlowCollector) obj2;
                fVar23.f206143x = obj3;
                return fVar23.invokeSuspend(Unit.f186387a);
            case 23:
                f fVar24 = new f((Continuation) obj4, (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.listing.c) this.f206144y, 23);
                fVar24.f206142w = (FlowCollector) obj2;
                fVar24.f206143x = obj3;
                return fVar24.invokeSuspend(Unit.f186387a);
            case 24:
                f fVar25 = new f((Continuation) obj4, (k18.c) this.f206144y, 24);
                fVar25.f206142w = (FlowCollector) obj2;
                fVar25.f206143x = obj3;
                return fVar25.invokeSuspend(Unit.f186387a);
            case 25:
                f fVar26 = new f((Continuation) obj4, (nnb.o) this.f206144y, 25);
                fVar26.f206142w = (FlowCollector) obj2;
                fVar26.f206143x = obj3;
                return fVar26.invokeSuspend(Unit.f186387a);
            case 26:
                f fVar27 = new f((Continuation) obj4, (nob.i) this.f206144y, 26);
                fVar27.f206142w = (FlowCollector) obj2;
                fVar27.f206143x = obj3;
                return fVar27.invokeSuspend(Unit.f186387a);
            case 27:
                f fVar28 = new f((Continuation) obj4, (nqd.o) this.f206144y, 27);
                fVar28.f206142w = (FlowCollector) obj2;
                fVar28.f206143x = obj3;
                return fVar28.invokeSuspend(Unit.f186387a);
            case 28:
                f fVar29 = new f((Ref$BooleanRef) this.f206144y, (Continuation) obj4, 28);
                fVar29.f206142w = (FlowCollector) obj2;
                fVar29.f206143x = (Data) obj3;
                return fVar29.invokeSuspend(Unit.f186387a);
            default:
                f fVar30 = new f((Continuation) obj4, (nrd.h) this.f206144y, 29);
                fVar30.f206142w = (FlowCollector) obj2;
                fVar30.f206143x = obj3;
                return fVar30.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Flow gVar;
        ibd.h type;
        Flow pVar;
        UUID uuid;
        Object xVar;
        Flow gVar2;
        akg.n nVarV;
        String str;
        Object objB;
        Flow flowI;
        int i = 29;
        int i2 = 28;
        int i3 = 23;
        int i5 = 14;
        int i6 = 3;
        boolean z = false;
        Continuation continuation = null;
        int i21 = 1;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = (FlowCollector) this.f206142w;
                    Flow flowE = t1.E(rd0.e.d(new v1(new mci.e((o) this.f206144y, continuation, 7)), h0.f322473a));
                    this.f206142w = null;
                    this.f206143x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, flowE, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                a3 a3Var = (a3) this.f206142w;
                t3 t3Var = (t3) this.f206143x;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 != 0) {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                mkf.c cVar = (mkf.c) this.f206144y;
                this.f206142w = null;
                this.f206143x = null;
                this.v = 1;
                Serializable serializableA = mkf.c.a(cVar, a3Var, t3Var, this);
                return serializableA == aVar2 ? aVar2 : serializableA;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = (FlowCollector) this.f206142w;
                    a3 a3Var2 = (a3) this.f206143x;
                    ibd.i iVar = a3Var2.C;
                    if (iVar == null || (type = iVar.getType()) == null || !type.e()) {
                        gVar = new go.g(f0.f322471a, 2);
                    } else {
                        i0 i0Var = (i0) this.f206144y;
                        i0Var.getClass();
                        gVar = new t38.e(new m0(rd0.e.e(mo3.a.g(rd0.e.b(com.revolut.domain.interactors.transactions.a.d(i0Var.f206248m, new q7(v.k(new cc(v.k(y6.REFUND, y6.TRANSFER_CHARGEBACK)), new gb(a3Var2.f272581b))), null, 1, null, null, 26)), null, new mh1.e(12), 1), h0.f322473a, new l1(i6, 25, continuation)), i5), 24, rd0.e.b(((njf.j) i0Var.f206249n).f()), new amf.k(i0Var, a3Var2, continuation, 5));
                    }
                    this.f206142w = null;
                    this.f206143x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, gVar, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                z zVar = (z) this.f206144y;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector3 = (FlowCollector) this.f206142w;
                    List<WealthAccount> list = (List) ((Data) this.f206143x).getContent();
                    if (list != null) {
                        ArrayList arrayList = new ArrayList();
                        for (WealthAccount wealthAccount : list) {
                            if (wealthAccount instanceof WealthAccount.Commodities) {
                                xVar = null;
                            } else if (wealthAccount instanceof WealthAccount.TaxAdvantageWealthAccount) {
                                WealthAccount.TaxAdvantageWealthAccount taxAdvantageWealthAccount = (WealthAccount.TaxAdvantageWealthAccount) wealthAccount;
                                xVar = new hy1.b0(zVar.v.Z2(taxAdvantageWealthAccount), zVar, taxAdvantageWealthAccount, i2);
                            } else if (wealthAccount instanceof WealthAccount.Margin) {
                                xVar = new hy1.b0(zVar.z.Z2(), zVar, (WealthAccount.Margin) wealthAccount, i);
                            } else if (wealthAccount instanceof WealthAccount.Robo) {
                                xVar = new x(((w) zVar.f206707y).a(), zVar, (WealthAccount.Robo) wealthAccount, false ? 1 : 0);
                            } else {
                                if (!(wealthAccount instanceof WealthAccount.Securities)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                WealthAccount.Securities securities = (WealthAccount.Securities) wealthAccount;
                                TradingAccount.Portfolio portfolio = securities.f95240c;
                                String string = (portfolio == null || (uuid = portfolio.f105210a) == null) ? null : uuid.toString();
                                if (string == null) {
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                                xVar = new x(zVar.u.e3(string, securities.f95239b), zVar, securities, i21);
                            }
                            if (xVar != null) {
                                arrayList.add(xVar);
                            }
                            i = 29;
                        }
                        pVar = new huh.j(new t38.e(r0.g(), i3, vkm.q.I(arrayList), new l05.b(i6, 15, continuation)), i21);
                    } else {
                        pVar = new v0f.p(new List[0], 8);
                    }
                    this.f206142w = null;
                    this.f206143x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, pVar, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                mo8.h hVar = (mo8.h) this.f206144y;
                mo8.e eVar = hVar.o;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector4 = (FlowCollector) this.f206142w;
                    akg.n nVarA = hj8.a.a(hVar.f207564p, eVar.f207562a, w4l.h.f294642c);
                    h0 h0Var = h0.f322473a;
                    q0 q0VarN = rd0.e.n(nVarA, h0Var);
                    kl.t1 t1Var = hVar.f207565q;
                    String juniorId = eVar.f207562a;
                    t1Var.getClass();
                    Intrinsics.checkNotNullParameter(juniorId, "juniorId");
                    un8.h hVar2 = (un8.h) ((un8.c) t1Var.f185240b);
                    hVar2.getClass();
                    Intrinsics.checkNotNullParameter(juniorId, "juniorId");
                    j23.b bVarD = yh5.b.d(q0VarN, rd0.e.n(rd0.e.b(hVar2.d.f(juniorId, false)), h0Var));
                    this.f206142w = null;
                    this.f206143x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector4, bVarD, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 5:
                mr4.g gVar3 = (mr4.g) this.f206144y;
                CreditCardDisplayBalanceSettings$InputData creditCardDisplayBalanceSettings$InputData = gVar3.o;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector5 = (FlowCollector) this.f206142w;
                    kgm.c cVar2 = gVar3.f208054p;
                    String facilityId = creditCardDisplayBalanceSettings$InputData.f68993a;
                    cVar2.getClass();
                    Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                    k3 k3Var = (k3) cVar2.f184018b;
                    w4l.j jVar = w4l.j.f294644c;
                    akg.n nVarV2 = nim.a.v(u0.m(nim.a.v(k3Var.a(facilityId, jVar), new lk4.g(cVar2, 19)), gVar3.f208055q.b(creditCardDisplayBalanceSettings$InputData.f68993a, jVar)), mr4.f.f208053a);
                    this.f206142w = null;
                    this.f206143x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector5, nVarV2, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 6:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector6 = (FlowCollector) this.f206142w;
                    Flow rVar = ((Boolean) this.f206143x).booleanValue() ? new g48.r(mo3.a.g(((et6.g) ((gr6.a) ((a5h.g) this.f206144y).f1407c)).d(w4l.h.f294642c), null, null, 3), i) : new go.g(Boolean.FALSE, 2);
                    this.f206142w = null;
                    this.f206143x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector6, rVar, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 7:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector7 = (FlowCollector) this.f206142w;
                    wkm.l lVarZ2 = ((gah.e) ((mtl.p) this.f206144y).f208933w).Z2((List) this.f206143x);
                    this.f206142w = null;
                    this.f206143x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector7, lVarZ2, this) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 8:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector8 = (FlowCollector) this.f206142w;
                    if (((Boolean) this.f206143x).booleanValue()) {
                        ouj.a aVar10 = ((muj.c) this.f206144y).f209035a;
                        w4l.i loadingStrategy = w4l.i.f294643c;
                        ouj.d dVar = (ouj.d) aVar10;
                        dVar.getClass();
                        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                        gVar2 = dVar.d.b(Unit.f186387a, loadingStrategy);
                    } else {
                        od0.i.Companion.getClass();
                        gVar2 = new go.g(new Data(od0.i.f224256b, null, false, 6, null), 2);
                    }
                    this.f206142w = null;
                    this.f206143x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector8, gVar2, this) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 9:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector9 = (FlowCollector) this.f206142w;
                    w4l.k kVar = (w4l.k) this.f206143x;
                    com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.screens.technicals.a aVar12 = (com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.screens.technicals.a) this.f206144y;
                    vkm.d dVarC = aVar12.f103870p.c(aVar12.o.f103867a, kVar);
                    this.f206142w = null;
                    this.f206143x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector9, dVarC, this) == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 10:
                mul.j jVar2 = (mul.j) this.f206144y;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector10 = (FlowCollector) this.f206142w;
                    w4l.k loadingStrategy2 = (w4l.k) this.f206143x;
                    jid.z zVar2 = jVar2.f209058p;
                    nel.n instrument = ((mul.h) ((j2) jVar2.f209061s.f22677a).getValue()).f209055a;
                    UUID tradingAccountId = jVar2.f209060r;
                    e0 e0Var = jVar2.o.f91732c;
                    vrl.c cVar3 = (vrl.c) zVar2.f174462c;
                    Intrinsics.checkNotNullParameter(instrument, "instrument");
                    Intrinsics.checkNotNullParameter(tradingAccountId, "tradingAccountId");
                    Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
                    nel.z zVar3 = instrument.f214597c;
                    String str2 = instrument.f214596b;
                    switch (mul.a.f209050a[zVar3.ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                            usc.a aVar14 = (usc.a) zVar2.f174461b;
                            w4l.i loadingStrategy3 = w4l.i.f294643c;
                            Intrinsics.checkNotNullParameter(loadingStrategy3, "loadingStrategy");
                            e8h.j jVar3 = (e8h.j) aVar14.f282889b;
                            jVar3.getClass();
                            Intrinsics.checkNotNullParameter(loadingStrategy3, "loadingStrategy");
                            nVarV = nim.a.v(u0.m(jVar3.d.b(Unit.f186387a, loadingStrategy3), ((vrl.e) cVar3).d(tradingAccountId, str2, loadingStrategy2)), new msb.c(i2));
                            break;
                        case 15:
                            nVarV = nim.a.v(((vrl.e) cVar3).d(tradingAccountId, str2, loadingStrategy2), new mqi.a(e0Var, 11));
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    this.f206142w = null;
                    this.f206143x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector10, nVarV, this) == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 11:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector11 = (FlowCollector) this.f206142w;
                    mzb.k kVar2 = (mzb.k) this.f206144y;
                    nyb.k kVar3 = kVar2.f210754p;
                    m1c.p learnType = kVar2.o.f83807a;
                    w4l.h loadingStrategy4 = w4l.h.f294642c;
                    kVar3.getClass();
                    Intrinsics.checkNotNullParameter(learnType, "learnType");
                    Intrinsics.checkNotNullParameter(loadingStrategy4, "loadingStrategy");
                    jxb.l lVar = (jxb.l) kVar3.f220804a;
                    lVar.getClass();
                    Intrinsics.checkNotNullParameter(learnType, "learnType");
                    Intrinsics.checkNotNullParameter(loadingStrategy4, "loadingStrategy");
                    vkm.d dVarB = rd0.e.b(lVar.i.e(learnType, loadingStrategy4));
                    this.f206142w = null;
                    this.f206143x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector11, dVarB, this) == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 12:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector12 = (FlowCollector) this.f206142w;
                    y yVarS = ((com.revolut.retail.feature.balance.picker.impl.balance_picker_v2.c) this.f206144y).f99514y.s((List) this.f206143x);
                    this.f206142w = null;
                    this.f206143x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector12, yVarS, this) == aVar16) {
                        return aVar16;
                    }
                } else {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 13:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector13 = (FlowCollector) this.f206142w;
                    e1 wsConfig = (e1) this.f206143x;
                    e30.b bVar = ((b0) this.f206144y).f211610a;
                    Intrinsics.checkNotNullParameter(wsConfig, "wsConfig");
                    z10.e eVar2 = (z10.e) bVar.f122164a;
                    eVar2.getClass();
                    Intrinsics.checkNotNullParameter(wsConfig, "wsConfig");
                    synchronized (eVar2) {
                        try {
                            eVar2.e = wsConfig;
                            if (eVar2.f.compareTo(Instant.now()) <= 0) {
                                eVar2.f318713g.set(0);
                            }
                            Unit unit = Unit.f186387a;
                        } catch (Throwable th10) {
                            throw th10;
                        }
                    }
                    vkm.t1 t1Var2 = eVar2.k;
                    this.f206142w = null;
                    this.f206143x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector13, t1Var2, this) == aVar17) {
                        return aVar17;
                    }
                } else {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 14:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector14 = (FlowCollector) this.f206142w;
                    e60.l lVar2 = (e60.l) this.f206143x;
                    n32.g gVar4 = (n32.g) this.f206144y;
                    Intrinsics.h(lVar2);
                    gVar4.getClass();
                    v1 v1Var = new v1(new com.revolut.feature.apm.core.ui.impl.ui.qr.common.a(lVar2, gVar4, null));
                    this.f206142w = null;
                    this.f206143x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector14, v1Var, this) == aVar18) {
                        return aVar18;
                    }
                } else {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 15:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector15 = (FlowCollector) this.f206142w;
                    com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.f fVar = (com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.f) this.f206144y;
                    Flow flowE2 = boh.f.e(((i2) fVar.f74419q).c(w4l.h.f294642c), new n47.q(fVar, i21));
                    this.f206142w = null;
                    this.f206143x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector15, flowE2, this) == aVar19) {
                        return aVar19;
                    }
                } else {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 16:
                Pair pair = (Pair) this.f206143x;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 == 0) {
                    yhm.o.b(obj2);
                    str = (String) pair.f186385a;
                    d0<s4d.m> sortedWatchlistItems = ((n4d.m) this.f206144y).d.getSortedWatchlistItems(str, (String) pair.f186386b);
                    this.f206143x = null;
                    this.f206142w = str;
                    this.v = 1;
                    objB = nim.a.b(sortedWatchlistItems, this);
                    if (objB == aVar20) {
                        return aVar20;
                    }
                } else {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    String str3 = (String) this.f206142w;
                    yhm.o.b(obj2);
                    str = str3;
                    objB = obj2;
                }
                Intrinsics.checkNotNullExpressionValue(objB, "await(...)");
                return pyd.c.b0((s4d.m) objB, str);
            case 17:
                com.revolut.feature.junior.account_activation.impl.ui.screen.request.c cVar4 = (com.revolut.feature.junior.account_activation.impl.ui.screen.request.c) this.f206144y;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector16 = (FlowCollector) this.f206142w;
                    j23.b bVarE = yh5.b.e(rd0.e.n(rd0.e.b(cVar4.f76692r.d()), h0.f322473a), nim.a.v(cVar4.f76694t.j(w4l.j.f294644c), u.f212739a), cVar4.v.B(n68.v.f212740a));
                    this.f206142w = null;
                    this.f206143x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector16, bVarE, this) == aVar21) {
                        return aVar21;
                    }
                } else {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 18:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector17 = (FlowCollector) this.f206142w;
                    s sVar = (s) this.f206144y;
                    vkm.d dVarA = sVar.f213390q.a(sVar.o.f91490a);
                    this.f206142w = null;
                    this.f206143x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector17, dVarA, this) == aVar22) {
                        return aVar22;
                    }
                } else {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 19:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector18 = (FlowCollector) this.f206142w;
                    n8i.k kVar4 = (n8i.k) this.f206143x;
                    y yVarD = rd0.e.d(((com.revolut.feature_move_money.impl.topup.a) this.f206144y).v.d(c8g.a.m(kVar4).f115082a, c8g.a.r(kVar4), c8g.a.t(kVar4), b6i.j.BOTTOM, b6i.l.TOP_TO_BOTTOM, new OrderMode.Market(null)), h0.f322473a);
                    this.f206142w = null;
                    this.f206143x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector18, yVarD, this) == aVar23) {
                        return aVar23;
                    }
                } else {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 20:
                com.revolut.feature.junior.isa.impl.ui.jisa_child_trading_creation.a aVar24 = (com.revolut.feature.junior.isa.impl.ui.jisa_child_trading_creation.a) this.f206144y;
                kbb.c cVar5 = aVar24.f76783r;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector19 = (FlowCollector) this.f206142w;
                    w4l.k kVar5 = (w4l.k) this.f206143x;
                    uf0.b bVarG = yh5.b.g(aVar24.o.j(kVar5), hj8.a.e(aVar24.f76782q, kVar5), rd0.e.b(cVar5.K(kVar5)), rd0.e.b(cVar5.O(kVar5.equals(w4l.i.f294643c))));
                    this.f206142w = null;
                    this.f206143x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector19, bVarG, this) == aVar25) {
                        return aVar25;
                    }
                } else {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 21:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector20 = (FlowCollector) this.f206142w;
                    nci.r rVar2 = (nci.r) this.f206144y;
                    String str4 = rVar2.o.f97748a;
                    d0 d0VarI = rVar2.f214214p.i(str4, null);
                    nae.a aVar27 = new nae.a(new mll.h(str4, i3), 27);
                    d0VarI.getClass();
                    efm.r rVarStartWith = new ufm.i(d0VarI, aVar27, 1).x().startWith(new Data(null, null, true, 3, null));
                    Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
                    Flow flowE3 = boh.f.e(rd0.e.b(rVarStartWith), new n7h.c(rVar2, 18));
                    this.f206142w = null;
                    this.f206143x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector20, flowE3, this) == aVar26) {
                        return aVar26;
                    }
                } else {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 22:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector21 = (FlowCollector) this.f206142w;
                    w4l.k kVar6 = (w4l.k) this.f206143x;
                    nd8.q qVar = (nd8.q) this.f206144y;
                    akg.n nVarA2 = hj8.a.a(qVar.f214345p, qVar.o.f214337a, kVar6);
                    this.f206142w = null;
                    this.f206143x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector21, nVarA2, this) == aVar28) {
                        return aVar28;
                    }
                } else {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 23:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                if (i113 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector22 = (FlowCollector) this.f206142w;
                    vkm.d dVarB2 = rd0.e.b(((com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.listing.c) this.f206144y).o.a());
                    this.f206142w = null;
                    this.f206143x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector22, dVarB2, this) == aVar29) {
                        return aVar29;
                    }
                } else {
                    if (i113 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 24:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                int i114 = this.v;
                if (i114 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector23 = (FlowCollector) this.f206142w;
                    if (((bla.c) this.f206143x) == bla.c.ENABLED) {
                        k18.c cVar6 = (k18.c) this.f206144y;
                        hj8.a aVar31 = (hj8.a) cVar6.f180140b;
                        w4l.h hVar3 = w4l.h.f294642c;
                        flowI = nim.a.v(u0.m(((nj8.n) aVar31).k(null, hVar3), rd0.e.b(((wsg.n) cVar6.d).d0(null, hVar3))), new nhg.f0(i5));
                    } else {
                        flowI = zi0.c.i(r0.g());
                    }
                    this.f206142w = null;
                    this.f206143x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector23, flowI, this) == aVar30) {
                        return aVar30;
                    }
                } else {
                    if (i114 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 25:
                nnb.o oVar = (nnb.o) this.f206144y;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                int i115 = this.v;
                if (i115 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector24 = (FlowCollector) this.f206142w;
                    w4l.k loadingStrategy5 = (w4l.k) this.f206143x;
                    gnb.b bVar2 = oVar.f217507q;
                    List accountTypes = oVar.o.f83141b;
                    bVar2.getClass();
                    Intrinsics.checkNotNullParameter(accountTypes, "accountTypes");
                    Intrinsics.checkNotNullParameter(loadingStrategy5, "loadingStrategy");
                    enb.g gVar5 = bVar2.f144952a;
                    gVar5.getClass();
                    Intrinsics.checkNotNullParameter(accountTypes, "accountTypes");
                    Intrinsics.checkNotNullParameter(loadingStrategy5, "loadingStrategy");
                    Flow flowE4 = boh.f.e(gVar5.f127801h.b(accountTypes, loadingStrategy5), new b1(oVar, i6));
                    this.f206142w = null;
                    this.f206143x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector24, flowE4, this) == aVar32) {
                        return aVar32;
                    }
                } else {
                    if (i115 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 26:
                nob.i iVar2 = (nob.i) this.f206144y;
                SavingsAutomationsScreenContract$InputData savingsAutomationsScreenContract$InputData = iVar2.o;
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                int i116 = this.v;
                if (i116 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector25 = (FlowCollector) this.f206142w;
                    t38.e eVarM = u0.m(iVar2.f217969p.c(savingsAutomationsScreenContract$InputData.f83360a, w4l.h.f294642c), iVar2.f217970q.a(savingsAutomationsScreenContract$InputData.f83360a));
                    this.f206142w = null;
                    this.f206143x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector25, eVarM, this) == aVar33) {
                        return aVar33;
                    }
                } else {
                    if (i116 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 27:
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                int i117 = this.v;
                if (i117 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector26 = (FlowCollector) this.f206142w;
                    nqd.o oVar2 = (nqd.o) this.f206144y;
                    List accounts = zhm.u.c(AnalyticsAccount.Personal.All.f99192a);
                    prl.e eVar3 = oVar2.f218424r;
                    eVar3.getClass();
                    Intrinsics.checkNotNullParameter(accounts, "accounts");
                    Flow flowH = xam.a.h(new nqd.n(oVar2, accounts, null), u0.m(nim.a.u(new rqd.l(eVar3, accounts, null), ((le3.f) ((ge3.a) eVar3.e)).e(zhm.d0.i1(accounts))), rd0.e.b(oVar2.f218422p.X(AccountId.Personal.f51414a, w4l.j.f294644c))));
                    this.f206142w = null;
                    this.f206143x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector26, flowH, this) == aVar34) {
                        return aVar34;
                    }
                } else {
                    if (i117 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 28:
                FlowCollector flowCollector27 = (FlowCollector) this.f206142w;
                Data data = (Data) this.f206143x;
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                int i118 = this.v;
                if (i118 == 0) {
                    yhm.o.b(obj2);
                    if (data.getContent() == null && data.getError() != null) {
                        ((Ref$BooleanRef) this.f206144y).f186407a = true;
                        return Boolean.valueOf(z);
                    }
                    this.f206142w = null;
                    this.f206143x = null;
                    this.v = 1;
                    if (flowCollector27.emit(data, this) == aVar35) {
                        return aVar35;
                    }
                } else {
                    if (i118 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                z = true;
                return Boolean.valueOf(z);
            default:
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                int i119 = this.v;
                if (i119 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector28 = (FlowCollector) this.f206142w;
                    vkm.d dVarG = ((nrd.h) this.f206144y).o.g((w4l.k) this.f206143x);
                    this.f206142w = null;
                    this.f206143x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector28, dVarG, this) == aVar36) {
                        return aVar36;
                    }
                } else {
                    if (i119 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Continuation continuation, Object obj2, int i) {
        super(3, continuation);
        this.u = i;
        this.f206144y = obj2;
    }
}
