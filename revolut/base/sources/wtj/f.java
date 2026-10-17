package wtj;

import ack.n;
import aii.u;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import com.revolut.feature.defi.asset_details.api.model.DeFiAssetDetails;
import com.revolut.feature.terms.api.model.TermsScope;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData;
import dwi.x;
import efm.d0;
import euj.j;
import ft3.h1;
import gim.i;
import h93.f0;
import java.io.Serializable;
import jgk.v;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kp0.w0;
import oxg.l;
import pfm.z;
import qf1.t;
import rd7.h;
import skm.e0;
import skm.p0;
import t27.m;
import vkm.z1;
import wf0.r0;
import wvg.a1;
import wvl.g;
import wyg.s;
import wz1.k;
import x0f.y;
import x1g.c0;
import x84.q;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f300005w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f300006x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f300005w = obj2;
        this.f300006x = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f((com.revolut.retail.feature.impl.rewards_hub.ui.flow.rewards_hub.a) this.f300005w, (j) this.f300006x, continuation, 0);
            case 1:
                f fVar = new f((r0) this.f300006x, continuation, 1);
                fVar.f300005w = obj2;
                return fVar;
            case 2:
                f fVar2 = new f((fti.b) this.f300006x, continuation, 2);
                fVar2.f300005w = obj2;
                return fVar2;
            case 3:
                f fVar3 = new f((g) this.f300006x, continuation, 3);
                fVar3.f300005w = obj2;
                return fVar3;
            case 4:
                return new f((ww2.i) this.f300005w, (f0) this.f300006x, continuation, 4);
            case 5:
                f fVar4 = new f((com.revolut.feature.kyc.impl.screens.addressconfirmation.a) this.f300006x, continuation, 5);
                fVar4.f300005w = obj2;
                return fVar4;
            case 6:
                return new f((com.revolut.feature.referrals.shared.ui.impl.ui.referral_troubleshooter.a) this.f300005w, (String) this.f300006x, continuation, 6);
            case 7:
                return new f((com.revolut.feature.wealth.analytics.ui.widgetised.performance.a) this.f300005w, (l) this.f300006x, continuation, 7);
            case 8:
                return new f((k) this.f300005w, (p02.a) this.f300006x, continuation, 8);
            case 9:
                return new f((y) this.f300006x, continuation, 9);
            case 10:
                f fVar5 = new f((y) this.f300006x, continuation, 10);
                fVar5.f300005w = obj2;
                return fVar5;
            case 11:
                return new f((y) this.f300005w, (String) this.f300006x, continuation, 11);
            case 12:
                return new f((com.revolut.feature.defi.accounts.impl.ui.extension.a) this.f300005w, (ty0.a) this.f300006x, continuation, 12);
            case 13:
                return new f((c0) this.f300006x, continuation, 13);
            case 14:
                return new f((c0) this.f300005w, (TermsScope) this.f300006x, continuation, 14);
            case 15:
                return new f((x24.a) this.f300005w, (h1) this.f300006x, continuation, 15);
            case 16:
                return new f((com.revolut.feature.freelancer.impl.ui.subaccount.update.flow.a) this.f300005w, (m) this.f300006x, continuation, 16);
            case 17:
                return new f((x34.b) this.f300005w, (String) this.f300006x, continuation, 17);
            case 18:
                f fVar6 = new f((x36.y) this.f300006x, continuation, 18);
                fVar6.f300005w = obj2;
                return fVar6;
            case 19:
                return new f((x36.y) this.f300005w, (String) this.f300006x, continuation, 19);
            case 20:
                return new f((x36.y) this.f300005w, (a46.d) this.f300006x, continuation, 20);
            case 21:
                return new f((x36.y) this.f300005w, (r66.a) this.f300006x, continuation, 21);
            case 22:
                return new f((com.revolut.feature.credit.application.plugins.impl.ui.agreements.v1.a) this.f300005w, (v44.j) this.f300006x, continuation, 22);
            case 23:
                return new f((b9k.f) this.f300005w, (BankTransferData) this.f300006x, continuation, 23);
            case 24:
                return new f((b9k.f) this.f300005w, (f5j.a) this.f300006x, continuation, 24);
            case 25:
                return new f((x78.k) this.f300005w, (String) this.f300006x, continuation, 25);
            case 26:
                return new f((q) this.f300005w, (pu3.b) this.f300006x, continuation, 26);
            case 27:
                return new f((x9b.j) this.f300005w, (x9b.c) this.f300006x, continuation, 27);
            case 28:
                return new f((com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.g) this.f300005w, (wp0.b) this.f300006x, continuation, 28);
            default:
                return new f((xd7.i) this.f300005w, (h) this.f300006x, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objB;
        Object objD;
        Object objI2;
        y yVar;
        Object objB2;
        Object objD2;
        Object consentsContent;
        Object overdraftOffer;
        Object objX;
        int i = this.u;
        int i2 = 20;
        int i3 = 19;
        int i5 = 27;
        int i6 = 25;
        int i21 = 29;
        Continuation continuation = null;
        Object obj3 = this.f300006x;
        int i22 = 1;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 != 0) {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.retail.feature.impl.rewards_hub.ui.flow.rewards_hub.a aVar2 = (com.revolut.retail.feature.impl.rewards_hub.ui.flow.rewards_hub.a) this.f300005w;
                w64.d dVar = new w64.d(aVar2, (j) obj3, continuation, 16);
                this.v = 1;
                Object objP2 = aVar2.p2(this, dVar);
                return objP2 == aVar ? aVar : objP2;
            case 1:
                a1 a1Var = (a1) this.f300005w;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    o.b(obj2);
                    this.f300005w = null;
                    this.v = 1;
                    if (((r0) obj3).invoke(a1Var, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                FlowCollector flowCollector = (FlowCollector) this.f300005w;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    o.b(obj2);
                    z zVarA = ((x) ((fti.b) obj3).f138027b).a();
                    this.f300005w = flowCollector;
                    this.v = 1;
                    objB = nim.a.b(zVarA, this);
                    if (objB == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i43 != 1) {
                        if (i43 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        return Unit.f186387a;
                    }
                    o.b(obj2);
                    objB = obj2;
                }
                Boolean bool = (Boolean) objB;
                t tVar = new t(qf1.f.TRAVEL_LOUNGES.getId());
                Intrinsics.h(bool);
                if (!bool.booleanValue()) {
                    tVar = null;
                }
                this.f300005w = null;
                this.v = 2;
                if (flowCollector.emit(tVar, this) == aVar4) {
                    return aVar4;
                }
                return Unit.f186387a;
            case 3:
                CoroutineScope coroutineScope = (CoroutineScope) this.f300005w;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 != 0) {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                g gVar = (g) obj3;
                w64.d dVar2 = new w64.d(gVar, coroutineScope, continuation, 17);
                this.f300005w = null;
                this.v = 1;
                Object objB3 = pu7.a.B(gVar.e, "click-free-trades-incentive-widget", dVar2, this);
                return objB3 == aVar5 ? aVar5 : objB3;
            case 4:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 != 0) {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                ww2.i iVar = (ww2.i) this.f300005w;
                mcg.j jVar = new mcg.j(iVar, (f0) obj3, continuation, i2);
                this.v = 1;
                ww2.d dVar3 = ww2.i.Companion;
                Object objB4 = pu7.a.B(iVar.k, "design_config", jVar, this);
                return objB4 == aVar6 ? aVar6 : objB4;
            case 5:
                Data data = (Data) this.f300005w;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    o.b(obj2);
                    this.f300005w = null;
                    this.v = 1;
                    if (com.revolut.feature.kyc.impl.screens.addressconfirmation.a.I2((com.revolut.feature.kyc.impl.screens.addressconfirmation.a) obj3, data, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 6:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 != 0) {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                this.v = 1;
                Object objX1 = lg0.b.x1(((com.revolut.feature.referrals.shared.ui.impl.ui.referral_troubleshooter.a) this.f300005w).f81915r, (String) obj3, null, null, this, 6);
                return objX1 == aVar8 ? aVar8 : objX1;
            case 7:
                com.revolut.feature.wealth.analytics.ui.widgetised.performance.a aVar9 = (com.revolut.feature.wealth.analytics.ui.widgetised.performance.a) this.f300005w;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 == 0) {
                    o.b(obj2);
                    this.v = 1;
                    objD = aVar9.f95105p.d((l) obj3, this);
                    if (objD == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objD = obj2;
                }
                u uVar = (u) objD;
                if (uVar != null) {
                    return aVar9.C1(uVar);
                }
                return null;
            case 8:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 == 0) {
                    o.b(obj2);
                    wz1.f fVar = ((k) this.f300005w).f301351a;
                    String str = ((p02.a) obj3).f231467a;
                    this.v = 1;
                    fVar.getClass();
                    wz1.e eVar = new wz1.e(fVar, str, continuation, i22);
                    p0 p0Var = p0.f264001a;
                    if (e0.J(elm.f.f127540b, eVar, this) == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 9:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 == 0) {
                    o.b(obj2);
                    y yVar2 = (y) obj3;
                    this.f300005w = yVar2;
                    this.v = 1;
                    objI2 = y.I2(yVar2, this);
                    if (objI2 == aVar12) {
                        return aVar12;
                    }
                    yVar = yVar2;
                } else {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yVar = (y) this.f300005w;
                    o.b(obj2);
                    objI2 = obj2;
                }
                yVar.C2(new x0f.k(((xi0.b) objI2).f306286a));
                return Unit.f186387a;
            case 10:
                ewe.a aVar13 = (ewe.a) this.f300005w;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    o.b(obj2);
                    if (!(aVar13 instanceof ewe.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    z1 z1Var = ((y) obj3).f301612x;
                    Unit unit = Unit.f186387a;
                    this.f300005w = null;
                    this.v = 1;
                    if (z1Var.emit(unit, this) == aVar14) {
                        return aVar14;
                    }
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 11:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 != 0) {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                d0 d0VarC = ((s06.j) ((y) this.f300005w).f301609s).c((String) obj3, false, lg0.a.OPEN_BROWSER);
                this.v = 1;
                Object objB5 = nim.a.b(d0VarC, this);
                return objB5 == aVar15 ? aVar15 : objB5;
            case 12:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 != 0) {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.defi.accounts.impl.ui.extension.a aVar17 = (com.revolut.feature.defi.accounts.impl.ui.extension.a) this.f300005w;
                w64.d dVar4 = new w64.d(aVar17, (ty0.a) obj3, continuation, i3);
                this.v = 1;
                x16.d dVar5 = com.revolut.feature.defi.accounts.impl.ui.extension.a.Companion;
                Object objY2 = aVar17.Y2(this, dVar4);
                return objY2 == aVar16 ? aVar16 : objY2;
            case 13:
                c0 c0Var = (c0) obj3;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 == 0) {
                    o.b(obj2);
                    d0 d0VarE = c0Var.f302410y.e();
                    this.v = 1;
                    objB2 = nim.a.b(d0VarE, this);
                    if (objB2 == aVar18) {
                        return aVar18;
                    }
                } else {
                    if (i104 != 1) {
                        if (i104 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c0Var = (c0) this.f300005w;
                        o.b(obj2);
                        objD2 = obj2;
                        return c0Var.C1(new BridgeDestination((NaviCommand) objD2));
                    }
                    o.b(obj2);
                    objB2 = obj2;
                }
                hha.d dVar6 = (hha.d) objB2;
                v vVar = c0Var.f302409x;
                Intrinsics.h(dVar6);
                this.f300005w = c0Var;
                this.v = 2;
                objD2 = ((jjk.c) vVar).d(dVar6, this);
                if (objD2 == aVar18) {
                    return aVar18;
                }
                return c0Var.C1(new BridgeDestination((NaviCommand) objD2));
            case 14:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 != 0) {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                c0 c0Var2 = (c0) this.f300005w;
                w64.d dVar7 = new w64.d(c0Var2, (TermsScope) obj3, continuation, i2);
                this.v = 1;
                Object objB6 = pu7.a.B(c0Var2.k, "TERMS_LOADING_TASK", dVar7, this);
                return objB6 == aVar19 ? aVar19 : objB6;
            case 15:
                x24.a aVar20 = (x24.a) this.f300005w;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 == 0) {
                    o.b(obj2);
                    CreditPluginsService creditPluginsService = aVar20.f302505b;
                    String str2 = ((h1) obj3).f137835a;
                    this.v = 1;
                    consentsContent = creditPluginsService.getConsentsContent(str2, this);
                    if (consentsContent == aVar21) {
                        return aVar21;
                    }
                } else {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    consentsContent = obj2;
                }
                return mif.a.K((k04.a) consentsContent, aVar20.f302506c);
            case 16:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 != 0) {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.freelancer.impl.ui.subaccount.update.flow.a aVar23 = (com.revolut.feature.freelancer.impl.ui.subaccount.update.flow.a) this.f300005w;
                n nVar = new n(i3);
                w64.d dVar8 = new w64.d(aVar23, (m) obj3, continuation, 22);
                this.v = 1;
                Object objQ = n14.k.Q(aVar23, null, null, nVar, dVar8, this, 3);
                return objQ == aVar22 ? aVar22 : objQ;
            case 17:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 == 0) {
                    o.b(obj2);
                    this.v = 1;
                    overdraftOffer = ((x34.b) this.f300005w).f302647a.getOverdraftOffer((String) obj3, this);
                    if (overdraftOffer == aVar24) {
                        return aVar24;
                    }
                } else {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    overdraftOffer = obj2;
                }
                u14.a aVar25 = (u14.a) overdraftOffer;
                Intrinsics.checkNotNullParameter(aVar25, "<this>");
                return new dv3.a(new cv3.u(aVar25.getOfferParameters()), t14.j.a(aVar25.getOffer()));
            case 18:
                Data data2 = (Data) this.f300005w;
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 == 0) {
                    o.b(obj2);
                    x36.y yVar3 = (x36.y) obj3;
                    wwa.a aVar27 = new wwa.a(yVar3, data2, i6);
                    this.f300005w = null;
                    this.v = 1;
                    if (x36.y.K2(yVar3, aVar27, this) == aVar26) {
                        return aVar26;
                    }
                } else {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 19:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 == 0) {
                    o.b(obj2);
                    x36.y yVar4 = (x36.y) this.f300005w;
                    wwa.a aVar29 = new wwa.a(yVar4, (String) obj3, i5);
                    this.v = 1;
                    if (x36.y.K2(yVar4, aVar29, this) == aVar28) {
                        return aVar28;
                    }
                } else {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 20:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 != 0) {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                x36.y yVar5 = (x36.y) this.f300005w;
                w64.d dVar9 = new w64.d((a46.d) obj3, yVar5, continuation, 23);
                this.v = 1;
                Object objB7 = pu7.a.B(yVar5.k, "on_keyboard_suggestion_click", dVar9, this);
                return objB7 == aVar30 ? aVar30 : objB7;
            case 21:
                x36.y yVar6 = (x36.y) this.f300005w;
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 == 0) {
                    o.b(obj2);
                    jhi.b bVarG = mo3.a.g(yVar6.f302691s.a(((r66.a) obj3).f251645a, w4l.h.f294642c), null, new s(i5), 1);
                    this.v = 1;
                    objX = vkm.q.x(bVarG, this);
                    if (objX == aVar31) {
                        return aVar31;
                    }
                } else {
                    if (i112 != 1) {
                        if (i112 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        return Unit.f186387a;
                    }
                    o.b(obj2);
                    objX = obj2;
                }
                wwa.a aVar32 = new wwa.a(yVar6, (DeFiAssetDetails) objX, i21);
                this.v = 2;
                if (x36.y.K2(yVar6, aVar32, this) == aVar31) {
                    return aVar31;
                }
                return Unit.f186387a;
            case 22:
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                if (i113 != 0) {
                    if (i113 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.agreements.v1.a aVar34 = (com.revolut.feature.credit.application.plugins.impl.ui.agreements.v1.a) this.f300005w;
                w64.d dVar10 = new w64.d(aVar34, (v44.j) obj3, continuation, i6);
                this.v = 1;
                Object objP22 = aVar34.p2(this, dVar10);
                return objP22 == aVar33 ? aVar33 : objP22;
            case 23:
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                int i114 = this.v;
                if (i114 != 0) {
                    if (i114 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                this.v = 1;
                Serializable serializableC = b9k.f.c((b9k.f) this.f300005w, (BankTransferData) obj3, this);
                return serializableC == aVar35 ? aVar35 : serializableC;
            case 24:
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                int i115 = this.v;
                if (i115 != 0) {
                    if (i115 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                this.v = 1;
                Object objE = ((p4k.g) ((b9k.f) this.f300005w).f13816a).e((f5j.a) obj3, this);
                return objE == aVar36 ? aVar36 : objE;
            case 25:
                fim.a aVar37 = fim.a.COROUTINE_SUSPENDED;
                int i116 = this.v;
                if (i116 != 0) {
                    if (i116 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                x78.k kVar = (x78.k) this.f300005w;
                x78.i iVar2 = new x78.i(kVar, (String) obj3, continuation, i22);
                this.v = 1;
                Object objB8 = pu7.a.B(kVar.k, "NAVIGATE_TO_POCKET_CREATION", iVar2, this);
                return objB8 == aVar37 ? aVar37 : objB8;
            case 26:
                fim.a aVar38 = fim.a.COROUTINE_SUSPENDED;
                int i117 = this.v;
                if (i117 == 0) {
                    o.b(obj2);
                    q qVar = (q) this.f300005w;
                    ww3.c cVar = qVar.f303290q;
                    h1 h1VarF = w0.F(qVar.f303289p.f67448c);
                    String id10 = ((pu3.b) obj3).getId();
                    this.v = 1;
                    if (cVar.c(h1VarF, id10, this) == aVar38) {
                        return aVar38;
                    }
                } else {
                    if (i117 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 27:
                fim.a aVar39 = fim.a.COROUTINE_SUSPENDED;
                int i118 = this.v;
                if (i118 != 0) {
                    if (i118 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                x9b.j jVar2 = (x9b.j) this.f300005w;
                w64.d dVar11 = new w64.d(jVar2, (x9b.c) obj3, continuation, i21);
                this.v = 1;
                Object objP23 = jVar2.p2(this, dVar11);
                return objP23 == aVar39 ? aVar39 : objP23;
            case 28:
                com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.g gVar2 = (com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.g) this.f300005w;
                fim.a aVar40 = fim.a.COROUTINE_SUSPENDED;
                int i119 = this.v;
                if (i119 == 0) {
                    o.b(obj2);
                    z1 z1Var2 = gVar2.f60745y;
                    Unit unit2 = Unit.f186387a;
                    z1Var2.k(unit2);
                    nd1.n nVar2 = gVar2.o;
                    this.v = 1;
                    nVar2.f214305a.d.setValue(null);
                    if (unit2 == aVar40) {
                        return aVar40;
                    }
                } else {
                    if (i119 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                ((wp0.b) obj3).invoke();
                return Unit.f186387a;
            default:
                fim.a aVar41 = fim.a.COROUTINE_SUSPENDED;
                int i120 = this.v;
                if (i120 == 0) {
                    o.b(obj2);
                    this.v = 1;
                    if (((xd7.i) this.f300005w).o.a((h) obj3, this) == aVar41) {
                        return aVar41;
                    }
                } else {
                    if (i120 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f300006x = obj2;
    }
}
