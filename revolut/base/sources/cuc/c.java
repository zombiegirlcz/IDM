package cuc;

import au6.i2;
import au6.k2;
import auc.b1;
import auc.p0;
import ble.e1;
import com.revolut.data.model.Data;
import com.revolut.feature.acquiring.lite_pos.api.model.CatalogueLineItem;
import com.revolut.feature.backend_flow.domain.models.BackendFlow;
import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import com.revolut.feature.location.api.domain.models.location.LocationDomain;
import com.revolut.feature.pix.api.model.PixQrCode;
import com.revolut.feature.security_hub.api.models.SecurityDelayInfo;
import com.revolut.feature.security_hub.api.models.WealthProtectionFeatureState;
import com.revolut.feature.security_hub.api.models.WealthProtectionFeaturesState;
import com.revolut.feature.security_hub.impl.network.SecurityDelayService;
import com.revolut.feature.security_hub.impl.network.StreetModeService;
import com.revolut.feature.shared.order_initiation.api.domain.CustomFieldDefinition;
import com.revolut.feature.terms.api.model.Terms;
import com.revolut.feature.topup_screen.api.descriptor.CardDetailsScreenDescriptor$OutputData$CardData;
import com.revolut.feature.topup_screen.common.CardDetails;
import com.revolut.feature.trading_orders.api.ui.pocket_picker.SourcePocketPickerContract$OutputData;
import com.revolut.feature_move_money.impl.flow.MoveMoneyFlowContract$MoveMoneyProcessState;
import com.revolut.retail.core.navigation.NaviCommand;
import ft3.h1;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k4l.r0;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.o0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.json.JSONObject;
import retrofit2.HttpException;
import retrofit2.Response;
import skm.g0;
import skm.k0;
import vrl.u0;
import zc1.c;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f108941w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f108942x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f108943y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i, Object obj2, Object obj3, String str, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f108942x = obj2;
        this.f108941w = str;
        this.f108943y = obj3;
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.q] */
    /* JADX WARN: Type inference failed for: r13v24, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c((d) this.f108943y, (String) this.f108941w, continuation, 0);
            case 1:
                return new c((r) this.f108943y, (String) this.f108941w, continuation, 1);
            case 2:
                return new c((r) this.f108943y, (String) this.f108941w, continuation, 2);
            case 3:
                return new c((z) this.f108943y, (String) this.f108941w, continuation, 3);
            case 4:
                return new c(4, (e0) this.f108942x, (LocationDomain) this.f108943y, (String) this.f108941w, continuation);
            case 5:
                return new c((SourcePocketPickerContract$OutputData) this.f108943y, (com.revolut.trading.orders.ui.invest.placement.screens.edit.e) this.f108941w, continuation, 5);
            case 6:
                return new c((com.revolut.trading.orders.ui.invest.placement.screens.edit.e) this.f108942x, (r0) this.f108943y, (Function0) this.f108941w, continuation, 6);
            case 7:
                return new c((com.revolut.trading.orders.ui.screens.pocket_picker.b) this.f108942x, (xi0.b) this.f108943y, (xi0.b) this.f108941w, continuation, 7);
            case 8:
                return new c((com.revolut.feature.topup_screen.impl.flow.add_card.b) this.f108942x, (Set) this.f108943y, (String) this.f108941w, continuation, 8);
            case 9:
                return new c((com.revolut.feature.topup_screen.impl.flow.add_card.b) this.f108942x, (CardDetails) this.f108943y, (CardDetailsScreenDescriptor$OutputData$CardData) this.f108941w, continuation, 9);
            case 10:
                return new c((com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.c) this.f108942x, (pi3.r) this.f108943y, (cxe.b) this.f108941w, continuation, 10);
            case 11:
                c cVar = new c((com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.a) this.f108941w, continuation, 11);
                cVar.f108943y = obj2;
                return cVar;
            case 12:
                return new c(12, (d34.e) this.f108942x, (String) this.f108943y, (String) this.f108941w, continuation);
            case 13:
                return new c((d44.a) this.f108942x, (h1) this.f108943y, (BackendFlow) this.f108941w, continuation, 13);
            case 14:
                return new c((d44.a) this.f108942x, (h1) this.f108943y, (String) this.f108941w, continuation, 14);
            case 15:
                c cVar2 = new c((d44.a) this.f108943y, (h1) this.f108941w, continuation, 15);
                cVar2.f108942x = obj2;
                return cVar2;
            case 16:
                c cVar3 = new c((d4f.p) this.f108941w, continuation, 16);
                cVar3.f108943y = obj2;
                return cVar3;
            case 17:
                return new c((Ref$ObjectRef) this.f108942x, (Function1) this.f108943y, (Function0) this.f108941w, continuation, 17);
            case 18:
                c cVar4 = new c((Function0) this.f108943y, (Flow) this.f108941w, continuation);
                cVar4.f108942x = obj2;
                return cVar4;
            case 19:
                return new c((com.revolut.feature.paynow.impl.screens.qr.a) this.f108942x, (Long) this.f108943y, (xi0.b) this.f108941w, continuation, 19);
            case 20:
                return new c((com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g) this.f108942x, (f7j.l) this.f108943y, (String) this.f108941w, continuation, 20);
            case 21:
                c cVar5 = new c((zq.a) this.f108943y, (MoveMoneyFlowContract$MoveMoneyProcessState) this.f108941w, continuation, 21);
                cVar5.f108942x = obj2;
                return cVar5;
            case 22:
                c cVar6 = new c((d9j.j) this.f108943y, (xi0.b) this.f108941w, continuation, 22);
                cVar6.f108942x = obj2;
                return cVar6;
            case 23:
                return new c(23, (y9m.g) this.f108942x, (JSONObject) this.f108943y, (String) this.f108941w, continuation);
            case 24:
                c cVar7 = new c((List) this.f108943y, (db9.d) this.f108941w, continuation, 24);
                cVar7.f108942x = obj2;
                return cVar7;
            case 25:
                return new c((vad.d) this.f108943y, (dbd.g) this.f108941w, continuation, 25);
            case 26:
                return new c((Function1) this.f108942x, (String) this.f108941w, (String) this.f108943y, continuation);
            case 27:
                return new c((com.revolut.feature.credit.application.plugins.impl.ui.home_insurance.e) this.f108942x, (ny3.k) this.f108943y, (Map) this.f108941w, continuation, 27);
            case 28:
                c cVar8 = new c((dca.r) this.f108943y, (PixQrCode) this.f108941w, continuation, 28);
                cVar8.f108942x = obj2;
                return cVar8;
            default:
                return new c((com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c) this.f108943y, (qua.p) this.f108941w, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r2v119, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r3v85, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.q] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object linkedWallet;
        a aVar;
        Object objCancelSecurityDelay;
        r rVar;
        Object wealthProtectionSecurityDelay;
        Object securityLimits;
        z zVar;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object next;
        xi0.b bVar;
        xi0.b bVar2;
        Throwable th10;
        Object objJ;
        Object objPostQuestionnaire;
        Object objF;
        Object objI;
        Object obj9;
        Object objA;
        zt6.g gVar;
        Object obj10;
        ArrayList arrayList;
        ArrayList arrayList2;
        Object objCreateOrderInitiationPage;
        c.C1776c c1776c;
        ArrayList arrayList3;
        Object objInvoke;
        Object objB;
        com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar;
        int i = this.u;
        int i2 = 7;
        int i3 = 3;
        int i5 = 0;
        Object obj11 = this.f108941w;
        int i6 = 1;
        switch (i) {
            case 0:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    d dVar = (d) this.f108943y;
                    a aVar3 = dVar.d;
                    this.f108942x = aVar3;
                    this.v = 1;
                    linkedWallet = dVar.f108947a.getLinkedWallet((String) obj11, this);
                    if (linkedWallet == aVar2) {
                        return aVar2;
                    }
                    aVar = aVar3;
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (a) this.f108942x;
                    yhm.o.b(obj2);
                    linkedWallet = obj2;
                }
                aVar.getClass();
                return a.a((auc.g) linkedWallet);
            case 1:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    r rVar2 = (r) this.f108943y;
                    this.f108942x = rVar2;
                    this.v = 1;
                    objCancelSecurityDelay = rVar2.f108970c.cancelSecurityDelay((String) obj11, this);
                    if (objCancelSecurityDelay == aVar4) {
                        return aVar4;
                    }
                    rVar = rVar2;
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    rVar = (r) this.f108942x;
                    yhm.o.b(obj2);
                    objCancelSecurityDelay = obj2;
                }
                Response response = (Response) objCancelSecurityDelay;
                rVar.getClass();
                if (response.isSuccessful()) {
                    return Unit.f186387a;
                }
                throw new HttpException(response);
            case 2:
                String str = (String) obj11;
                r rVar3 = (r) this.f108943y;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    yhm.o.b(obj2);
                    SecurityDelayService securityDelayService = rVar3.f108970c;
                    this.v = 1;
                    wealthProtectionSecurityDelay = securityDelayService.getWealthProtectionSecurityDelay(str, this);
                    if (wealthProtectionSecurityDelay == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i32 != 1) {
                        if (i32 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        SecurityDelayInfo securityDelayInfo = (SecurityDelayInfo) this.f108942x;
                        yhm.o.b(obj2);
                        return securityDelayInfo;
                    }
                    yhm.o.b(obj2);
                    wealthProtectionSecurityDelay = obj2;
                }
                SecurityDelayInfo securityDelayInfoA = i.a((auc.s) wealthProtectionSecurityDelay);
                x4l.c cVar2 = rVar3.f;
                n nVar = new n(str);
                this.f108942x = securityDelayInfoA;
                this.v = 2;
                return cVar2.f(nVar, securityDelayInfoA, this) == aVar5 ? aVar5 : securityDelayInfoA;
            case 3:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    yhm.o.b(obj2);
                    z zVar2 = (z) this.f108943y;
                    this.f108942x = zVar2;
                    this.v = 1;
                    securityLimits = zVar2.f108984c.getSecurityLimits((String) obj11, this);
                    if (securityLimits == aVar6) {
                        return aVar6;
                    }
                    zVar = zVar2;
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zVar = (z) this.f108942x;
                    yhm.o.b(obj2);
                    securityLimits = obj2;
                }
                List limits = ((auc.u) securityLimits).getLimits();
                zVar.getClass();
                List list = limits;
                Iterator it8 = list.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        Object next2 = it8.next();
                        if (Intrinsics.f(((b1) next2).getName(), "SAVINGS_WITHDRAWAL")) {
                            obj3 = next2;
                        }
                    } else {
                        obj3 = null;
                    }
                }
                WealthProtectionFeatureState wealthProtectionFeatureStateC = z.c((b1) obj3);
                Iterator it9 = list.iterator();
                while (true) {
                    if (it9.hasNext()) {
                        Object next3 = it9.next();
                        if (Intrinsics.f(((b1) next3).getName(), "POCKETS_WITHDRAWAL")) {
                            obj4 = next3;
                        }
                    } else {
                        obj4 = null;
                    }
                }
                WealthProtectionFeatureState wealthProtectionFeatureStateC2 = z.c((b1) obj4);
                Iterator it10 = list.iterator();
                while (true) {
                    if (it10.hasNext()) {
                        Object next4 = it10.next();
                        if (Intrinsics.f(((b1) next4).getName(), "STOCKS_WITHDRAWAL")) {
                            obj5 = next4;
                        }
                    } else {
                        obj5 = null;
                    }
                }
                WealthProtectionFeatureState wealthProtectionFeatureStateC3 = z.c((b1) obj5);
                Iterator it11 = list.iterator();
                while (true) {
                    if (it11.hasNext()) {
                        Object next5 = it11.next();
                        if (Intrinsics.f(((b1) next5).getName(), "COMMODITIES_WITHDRAWAL")) {
                            obj6 = next5;
                        }
                    } else {
                        obj6 = null;
                    }
                }
                WealthProtectionFeatureState wealthProtectionFeatureStateC4 = z.c((b1) obj6);
                Iterator it12 = list.iterator();
                while (true) {
                    if (it12.hasNext()) {
                        Object next6 = it12.next();
                        if (Intrinsics.f(((b1) next6).getName(), "CRYPTO_WITHDRAWAL")) {
                            obj7 = next6;
                        }
                    } else {
                        obj7 = null;
                    }
                }
                WealthProtectionFeatureState wealthProtectionFeatureStateC5 = z.c((b1) obj7);
                Iterator it13 = list.iterator();
                while (true) {
                    if (it13.hasNext()) {
                        Object next7 = it13.next();
                        if (Intrinsics.f(((b1) next7).getName(), "TRANSFERS")) {
                            obj8 = next7;
                        }
                    } else {
                        obj8 = null;
                    }
                }
                WealthProtectionFeatureState wealthProtectionFeatureStateC6 = z.c((b1) obj8);
                Iterator it14 = list.iterator();
                while (true) {
                    if (it14.hasNext()) {
                        next = it14.next();
                        if (Intrinsics.f(((b1) next).getName(), "CARD_PAYMENTS")) {
                        }
                    } else {
                        next = null;
                    }
                }
                return new WealthProtectionFeaturesState(wealthProtectionFeatureStateC, wealthProtectionFeatureStateC2, wealthProtectionFeatureStateC3, wealthProtectionFeatureStateC4, wealthProtectionFeatureStateC5, wealthProtectionFeatureStateC6, z.c((b1) next));
            case 4:
                e0 e0Var = (e0) this.f108942x;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    StreetModeService streetModeService = e0Var.f108955c;
                    LocationDomain locationDomain = (LocationDomain) this.f108943y;
                    p0 p0Var = new p0((String) obj11, locationDomain.f78066a, locationDomain.f78067b);
                    this.v = 1;
                    if (streetModeService.createTrustedWifi(p0Var, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i43 != 1) {
                        if (i43 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                x4l.c cVar3 = e0Var.d;
                Unit unit = Unit.f186387a;
                this.v = 2;
                if (cVar3.d(unit, false, this) == aVar7) {
                    return aVar7;
                }
                return Unit.f186387a;
            case 5:
                SourcePocketPickerContract$OutputData sourcePocketPickerContract$OutputData = (SourcePocketPickerContract$OutputData) this.f108943y;
                com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar = (com.revolut.trading.orders.ui.invest.placement.screens.edit.e) obj11;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    yhm.o.b(obj2);
                    bVar = sourcePocketPickerContract$OutputData.f91764a;
                    if (bVar != null) {
                        u0 u0Var = eVar.f106930t;
                        this.f108942x = bVar;
                        this.v = 1;
                        prl.r rVar4 = u0Var.f291681a;
                        rVar4.getClass();
                        pqc.k kVar = new pqc.k(rVar4, bVar, null, i2);
                        skm.p0 p0Var2 = skm.p0.f264001a;
                        Object objJ2 = skm.e0.J(elm.f.f127540b, kVar, this);
                        Object obj12 = objJ2;
                        if (objJ2 != aVar8) {
                            obj12 = Unit.f186387a;
                        }
                        if (obj12 != aVar8) {
                            obj12 = Unit.f186387a;
                        }
                        if (obj12 == aVar8) {
                            return aVar8;
                        }
                        bVar2 = bVar;
                    }
                    eVar.H2(eVar.m0, new cui.v(bVar, sourcePocketPickerContract$OutputData, 5));
                    Continuation continuation = null;
                    eVar.n2(new cn0.d(eVar, continuation, continuation, 17), new whi.b(6));
                    return Unit.f186387a;
                }
                if (i59 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar2 = (xi0.b) this.f108942x;
                yhm.o.b(obj2);
                bVar = bVar2;
                eVar.H2(eVar.m0, new cui.v(bVar, sourcePocketPickerContract$OutputData, 5));
                Continuation continuation2 = null;
                eVar.n2(new cn0.d(eVar, continuation2, continuation2, 17), new whi.b(6));
                return Unit.f186387a;
            case 6:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar2 = (com.revolut.trading.orders.ui.invest.placement.screens.edit.e) this.f108942x;
                    r0 r0Var = (r0) this.f108943y;
                    this.v = 1;
                    if (eVar2.d3(r0Var, this) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                ((Function0) obj11).invoke();
                return Unit.f186387a;
            case 7:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 != 0) {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.trading.orders.ui.screens.pocket_picker.b bVar3 = (com.revolut.trading.orders.ui.screens.pocket_picker.b) this.f108942x;
                a3i.t tVar = new a3i.t(3, (xi0.b) obj11, bVar3, (xi0.b) this.f108943y, (Continuation) null);
                this.v = 1;
                Object objB2 = pu7.a.B(bVar3.k, "onCurrencyChange", tVar, this);
                return objB2 == aVar10 ? aVar10 : objB2;
            case 8:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.topup_screen.impl.flow.add_card.b bVar4 = (com.revolut.feature.topup_screen.impl.flow.add_card.b) this.f108942x;
                    cwe.d dVar2 = new cwe.d(bVar4, (Set) this.f108943y, (String) obj11, null);
                    this.v = 1;
                    if (bVar4.p2(this, dVar2) == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 9:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.topup_screen.impl.flow.add_card.b bVar5 = (com.revolut.feature.topup_screen.impl.flow.add_card.b) this.f108942x;
                    com.revolut.feature.topup_screen.impl.flow.add_card.a aVar13 = new com.revolut.feature.topup_screen.impl.flow.add_card.a(bVar5, (CardDetails) this.f108943y, (CardDetailsScreenDescriptor$OutputData$CardData) obj11, null);
                    this.v = 1;
                    if (bVar5.p2(this, aVar13) == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 10:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 != 0) {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.c cVar4 = (com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.c) this.f108942x;
                cxe.z zVar3 = new cxe.z(cVar4, (pi3.r) this.f108943y, (cxe.b) obj11, null, 1);
                this.v = 1;
                Object objB3 = pu7.a.B(cVar4.k, "payButtonClick", zVar3, this);
                return objB3 == aVar14 ? aVar14 : objB3;
            case 11:
                FlowCollector flowCollector = (FlowCollector) this.f108943y;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 == 0) {
                    yhm.o.b(obj2);
                    et6.h1 h1Var = ((com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.a) obj11).f74182s;
                    th10 = null;
                    this.f108943y = null;
                    this.f108942x = flowCollector;
                    this.v = 1;
                    k2 k2Var = (k2) h1Var.f129237b;
                    k2Var.getClass();
                    i2 i2Var = new i2(k2Var, false ? 1 : 0, i5);
                    skm.p0 p0Var3 = skm.p0.f264001a;
                    objJ = skm.e0.J(elm.f.f127540b, i2Var, this);
                    if (objJ == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i100 != 1) {
                        if (i100 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    flowCollector = (FlowCollector) this.f108942x;
                    yhm.o.b(obj2);
                    objJ = obj2;
                    th10 = null;
                }
                Data dataP = zi0.c.P(objJ, false, th10, 3);
                this.f108943y = th10;
                this.f108942x = th10;
                this.v = 2;
                if (flowCollector.emit(dataP, this) == aVar15) {
                    return aVar15;
                }
                return Unit.f186387a;
            case 12:
                String str2 = (String) obj11;
                d34.e eVar3 = (d34.e) this.f108942x;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    yhm.o.b(obj2);
                    CreditPluginsService creditPluginsService = eVar3.f110914a;
                    String str3 = (String) this.f108943y;
                    this.v = 1;
                    if (creditPluginsService.deleteDebt(str2, str3, this) == aVar16) {
                        return aVar16;
                    }
                } else {
                    if (i101 != 1) {
                        if (i101 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                x4l.c cVar5 = eVar3.f;
                d34.a aVar17 = new d34.a(str2);
                this.v = 2;
                if (cVar5.d(aVar17, false, this) == aVar16) {
                    return aVar16;
                }
                return Unit.f186387a;
            case 13:
                d44.a aVar18 = (d44.a) this.f108942x;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 == 0) {
                    yhm.o.b(obj2);
                    CreditPluginsService creditPluginsService2 = aVar18.f111225a;
                    String str4 = ((h1) this.f108943y).f137835a;
                    q90.i iVarB = aVar18.f111226b.b((BackendFlow) obj11);
                    this.v = 1;
                    objPostQuestionnaire = creditPluginsService2.postQuestionnaire(str4, iVarB, this);
                    if (objPostQuestionnaire == aVar19) {
                        return aVar19;
                    }
                } else {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objPostQuestionnaire = obj2;
                }
                return aVar18.f111226b.a((q90.i) objPostQuestionnaire);
            case 14:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (((d44.a) this.f108942x).f111225a.deleteQuestionnaireFile(((h1) this.f108943y).f137835a, (String) obj11, this) == aVar20) {
                        return aVar20;
                    }
                } else {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 15:
                okhttp3.c cVar6 = (okhttp3.c) this.f108942x;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 != 0) {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                CreditPluginsService creditPluginsService3 = ((d44.a) this.f108943y).f111225a;
                String str5 = ((h1) obj11).f137835a;
                this.f108942x = null;
                this.v = 1;
                Object objUploadQuestionnaireFile = creditPluginsService3.uploadQuestionnaireFile(str5, cVar6, this);
                return objUploadQuestionnaireFile == aVar21 ? aVar21 : objUploadQuestionnaireFile;
            case 16:
                dfl.r0 r0Var2 = (dfl.r0) this.f108943y;
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 == 0) {
                    yhm.o.b(obj2);
                    zjh.f fVar = ((d4f.p) obj11).f111301b;
                    List list2 = r0Var2.f114450a;
                    this.f108943y = null;
                    this.f108942x = r0Var2;
                    this.v = 1;
                    objF = fVar.F(list2, this);
                    if (objF == aVar22) {
                        return aVar22;
                    }
                } else {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r0Var2 = (dfl.r0) this.f108942x;
                    yhm.o.b(obj2);
                    objF = obj2;
                }
                List transactions = (List) objF;
                int i106 = r0Var2.f114451b;
                Boolean bool = r0Var2.f114452c;
                Instant instant = r0Var2.d;
                Intrinsics.checkNotNullParameter(transactions, "transactions");
                return new dfl.r0(transactions, i106, bool, instant);
            case 17:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (k0.b(50L, this) == aVar23) {
                        return aVar23;
                    }
                } else {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                aii.r rVar5 = (aii.r) ((Ref$ObjectRef) this.f108942x).f186409a;
                if (rVar5 != null) {
                    ((Function1) this.f108943y).invoke(rVar5);
                } else {
                    ((Function0) obj11).invoke();
                }
                return Unit.f186387a;
            case 18:
                FlowCollector flowCollector2 = (FlowCollector) this.f108942x;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 == 0) {
                    yhm.o.b(obj2);
                    if (((Boolean) ((kotlin.jvm.internal.q) this.f108943y).invoke()).booleanValue()) {
                        this.f108942x = null;
                        this.v = 1;
                        if (((Flow) obj11).collect(flowCollector2, this) == aVar24) {
                            return aVar24;
                        }
                    } else {
                        Data dataP2 = zi0.c.P(zhm.f0.f322471a, false, null, 3);
                        this.f108942x = null;
                        this.v = 2;
                        if (flowCollector2.emit(dataP2, this) == aVar24) {
                            return aVar24;
                        }
                    }
                } else {
                    if (i108 != 1 && i108 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 19:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.paynow.impl.screens.qr.a aVar26 = (com.revolut.feature.paynow.impl.screens.qr.a) this.f108942x;
                    com.revolut.feature.credit.application.plugins.impl.ui.form.a aVar27 = new com.revolut.feature.credit.application.plugins.impl.ui.form.a(aVar26, (Long) this.f108943y, (xi0.b) obj11, null, 4);
                    this.v = 1;
                    if (aVar26.p2(this, aVar27) == aVar25) {
                        return aVar25;
                    }
                } else {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 20:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 != 0) {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g gVar2 = (com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g) this.f108942x;
                com.revolut.feature.credit.application.plugins.impl.ui.form.a aVar29 = new com.revolut.feature.credit.application.plugins.impl.ui.form.a(gVar2, (f7j.l) this.f108943y, (String) obj11, null, 5);
                this.v = 1;
                Object objB4 = pu7.a.B(gVar2.k, "on_keyboard_suggestion_click", aVar29, this);
                return objB4 == aVar28 ? aVar28 : objB4;
            case 21:
                MoveMoneyFlowContract$MoveMoneyProcessState moveMoneyFlowContract$MoveMoneyProcessState = (MoveMoneyFlowContract$MoveMoneyProcessState) obj11;
                zq.a aVar30 = (zq.a) this.f108943y;
                CoroutineScope coroutineScope = (CoroutineScope) this.f108942x;
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 == 0) {
                    yhm.o.b(obj2);
                    Continuation continuation3 = null;
                    g0[] g0VarArr = {skm.e0.g(coroutineScope, null, null, new d8i.b(aVar30, moveMoneyFlowContract$MoveMoneyProcessState, continuation3, i5), 3), skm.e0.g(coroutineScope, null, null, new d8i.b(aVar30, moveMoneyFlowContract$MoveMoneyProcessState, continuation3, i6), 3)};
                    this.f108942x = null;
                    this.v = 1;
                    objI = skm.e0.i(g0VarArr, this);
                    if (objI == aVar31) {
                        return aVar31;
                    }
                } else {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objI = obj2;
                }
                Iterator it15 = ((Iterable) objI).iterator();
                while (true) {
                    if (it15.hasNext()) {
                        Object next8 = it15.next();
                        if (((vrc.g) next8) instanceof vrc.f) {
                            obj9 = next8;
                        }
                    } else {
                        obj9 = null;
                    }
                }
                vrc.g gVar3 = (vrc.g) obj9;
                return gVar3 == null ? vrc.e.f291574a : gVar3;
            case 22:
                d9j.j jVar = (d9j.j) this.f108943y;
                FlowCollector flowCollector3 = (FlowCollector) this.f108942x;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 == 0) {
                    yhm.o.b(obj2);
                    ow5.b bVar6 = jVar.f112401n;
                    this.f108942x = flowCollector3;
                    this.v = 1;
                    objA = bVar6.a(this);
                    if (objA == aVar32) {
                        return aVar32;
                    }
                } else {
                    if (i112 != 1) {
                        if (i112 != 2 && i112 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                    objA = obj2;
                }
                if (((Boolean) objA).booleanValue()) {
                    zhm.f0 f0Var = zhm.f0.f322471a;
                    this.f108942x = null;
                    this.v = 2;
                    if (flowCollector3.emit(f0Var, this) == aVar32) {
                        return aVar32;
                    }
                } else {
                    x8h.g gVar4 = jVar.f112400m;
                    tzg.a collectionsScreen = tzg.a.MAIN_PAGE;
                    List currencies = zhm.u.c((xi0.b) obj11);
                    xzg.o collectionsAssetType = xzg.o.CRYPTO;
                    gVar4.getClass();
                    Intrinsics.checkNotNullParameter(collectionsScreen, "collectionsScreen");
                    Intrinsics.checkNotNullParameter(currencies, "currencies");
                    Intrinsics.checkNotNullParameter(collectionsAssetType, "collectionsAssetType");
                    Flow flowH = xam.a.h(new d8j.c(jVar, (Continuation) null, i3), rd0.e.b(pd.b.r(gVar4.c(collectionsScreen, collectionsAssetType), new x52.a(gVar4, currencies, i2))));
                    d9j.d dVar3 = jVar.f112399l;
                    this.f108942x = null;
                    this.v = 3;
                    vkm.q.w(flowCollector3);
                    Object objCollect = flowH.collect(new e1(flowCollector3, dVar3, 29), this);
                    if (objCollect != aVar32) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect != aVar32) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect == aVar32) {
                        return aVar32;
                    }
                }
                return Unit.f186387a;
            case 23:
                String value = (String) obj11;
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                try {
                    if (i113 == 0) {
                        yhm.o.b(obj2);
                        dam.s sVar = ((y9m.g) this.f108942x).f311881a;
                        dam.m.Companion.getClass();
                        Intrinsics.checkNotNullParameter(value, "value");
                        dam.m[] mVarArrValues = dam.m.values();
                        int length = mVarArrValues.length;
                        while (i5 < length) {
                            dam.m mVar = mVarArrValues[i5];
                            if (Intrinsics.f(mVar.f112581a, value)) {
                                JSONObject jSONObject = (JSONObject) this.f108943y;
                                this.v = 1;
                                if (sVar.i(mVar, jSONObject, this) == aVar33) {
                                    return aVar33;
                                }
                            } else {
                                i5++;
                            }
                        }
                        throw new IllegalArgumentException();
                    }
                    if (i113 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                } catch (IllegalArgumentException e) {
                    String str6 = "Invalid Event Type: " + value;
                }
                return Unit.f186387a;
            case 24:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.f108942x;
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                int i114 = this.v;
                if (i114 != 0) {
                    if (i114 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                List list3 = (List) this.f108943y;
                Intrinsics.h(list3);
                List list4 = list3;
                db9.d dVar4 = (db9.d) obj11;
                ArrayList arrayList4 = new ArrayList(zhm.w.t(list4, 10));
                Iterator it16 = list4.iterator();
                while (it16.hasNext()) {
                    arrayList4.add(skm.e0.g(coroutineScope2, null, null, new d3i.g(dVar4, (Terms) it16.next(), null, 11), 3));
                }
                this.f108942x = null;
                this.v = 1;
                Object objH = skm.e0.h(arrayList4, this);
                return objH == aVar34 ? aVar34 : objH;
            case 25:
                vad.d dVar5 = (vad.d) this.f108943y;
                xi0.b bVar7 = dVar5.f287269c;
                dj0.d dVar6 = dVar5.f287268b;
                Integer num = dVar5.e;
                dbd.g gVar5 = (dbd.g) obj11;
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                int i115 = this.v;
                if (i115 == 0) {
                    yhm.o.b(obj2);
                    if (dVar6 != null) {
                        z9h.n.l(String.class, gVar5.e, "LAST_USED_CURRENCY_KEY", dVar6.f115083b.f306286a);
                    } else if (bVar7 != null) {
                        z9h.n.l(String.class, gVar5.e, "LAST_USED_CURRENCY_KEY", bVar7.f306286a);
                    }
                    gVar5.e.G(new Integer(num.intValue()), "LAST_USED_PAYMENT_LIMIT", wim.z.d(o0.b(Integer.TYPE)));
                    gVar = gVar5.f112730a;
                    this.f108942x = gVar;
                    this.v = 1;
                    zt6.g.a();
                    obj10 = "";
                    if ("" == aVar35) {
                        return aVar35;
                    }
                } else {
                    if (i115 != 1) {
                        if (i115 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        objCreateOrderInitiationPage = obj2;
                        return cbd.a.a((uad.d) objCreateOrderInitiationPage);
                    }
                    gVar = (zt6.g) this.f108942x;
                    yhm.o.b(obj2);
                    obj10 = obj2;
                }
                List list5 = dVar5.f287270g;
                if (list5 != null) {
                    List<CatalogueLineItem> list6 = list5;
                    bd1.a aVar36 = gVar5.f112731b;
                    ArrayList arrayList5 = new ArrayList(zhm.w.t(list6, 10));
                    for (CatalogueLineItem domain : list6) {
                        pd1.d dVar7 = (pd1.d) aVar36;
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        String str7 = domain.f60672a;
                        long j2 = domain.f60674c;
                        bd1.a aVar37 = aVar36;
                        c.C1776c c1776c2 = new c.C1776c(r6.f60678a, domain.d.f60679b.b());
                        List list7 = domain.e;
                        if (list7 != null) {
                            List list8 = list7;
                            c1776c = c1776c2;
                            ArrayList arrayList6 = new ArrayList(zhm.w.t(list8, 10));
                            Iterator it17 = list8.iterator();
                            while (it17.hasNext()) {
                                CatalogueLineItem.Tax tax = (CatalogueLineItem.Tax) it17.next();
                                arrayList6.add(new c.d(tax.f60680a, tax.f60681b, tax.f60682c, tax.d));
                                it17 = it17;
                                str7 = str7;
                                num = num;
                            }
                            arrayList3 = arrayList6;
                        } else {
                            c1776c = c1776c2;
                            arrayList3 = null;
                        }
                        Integer num2 = num;
                        arrayList5.add(new zc1.c(str7, j2, c1776c, arrayList3, domain.f, domain.f60675g, domain.f60676h, domain.i, domain.f60677j, zhm.r0.k(new Pair("color", ((pd1.c) dVar7.f235040b).d(domain.k)), new Pair("item_type", domain.f60673b.b()))));
                        aVar36 = aVar37;
                        num = num2;
                    }
                    arrayList = arrayList5;
                } else {
                    arrayList = null;
                }
                Integer num3 = num;
                Intrinsics.checkNotNullParameter(dVar5, "<this>");
                String str8 = dVar5.f287267a;
                mf0.a aVar38 = dVar6 != null ? new mf0.a(dVar6.f115082a, dVar6.f115083b.f306286a) : null;
                String str9 = bVar7 != null ? bVar7.f306286a : null;
                String strName = dVar5.d.name();
                LocalDateTime localDateTime = dVar5.f;
                Long lValueOf = localDateTime != null ? Long.valueOf(oi0.d.R(localDateTime)) : null;
                List list9 = dVar5.f287271h;
                if (list9 != null) {
                    List<CustomFieldDefinition> list10 = list9;
                    ArrayList arrayList7 = new ArrayList(zhm.w.t(list10, 10));
                    for (CustomFieldDefinition customFieldDefinition : list10) {
                        Intrinsics.checkNotNullParameter(customFieldDefinition, "<this>");
                        arrayList7.add(new uad.b(customFieldDefinition.f86425a, customFieldDefinition.f86426b));
                    }
                    arrayList2 = arrayList7;
                } else {
                    arrayList2 = null;
                }
                uad.a aVar39 = new uad.a(str8, aVar38, strName, num3, str9, lValueOf, arrayList, num3, arrayList2);
                this.f108942x = null;
                this.v = 2;
                objCreateOrderInitiationPage = gVar.f325088a.createOrderInitiationPage(aVar39, this);
                if (objCreateOrderInitiationPage == aVar35) {
                    return aVar35;
                }
                return cbd.a.a((uad.d) objCreateOrderInitiationPage);
            case 26:
                fim.a aVar40 = fim.a.COROUTINE_SUSPENDED;
                int i116 = this.v;
                if (i116 == 0) {
                    yhm.o.b(obj2);
                    ?? r2 = (gim.i) this.f108942x;
                    this.v = 1;
                    objInvoke = r2.invoke(this);
                    if (objInvoke == aVar40) {
                        return aVar40;
                    }
                } else {
                    if (i116 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objInvoke = obj2;
                }
                if (((Response) objInvoke).code() == 204) {
                    return Unit.f186387a;
                }
                throw new IllegalStateException(("Error while " + ((String) obj11) + " " + ((String) this.f108943y)).toString());
            case 27:
                fim.a aVar41 = fim.a.COROUTINE_SUSPENDED;
                int i117 = this.v;
                if (i117 != 0) {
                    if (i117 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.home_insurance.e eVar4 = (com.revolut.feature.credit.application.plugins.impl.ui.home_insurance.e) this.f108942x;
                com.revolut.feature.credit.application.plugins.impl.ui.form.a aVar42 = new com.revolut.feature.credit.application.plugins.impl.ui.form.a(eVar4, (ny3.k) this.f108943y, (Map) obj11, null, 6);
                this.v = 1;
                Object objB5 = pu7.a.B(eVar4.k, "submitDocumentsUpload", aVar42, this);
                return objB5 == aVar41 ? aVar41 : objB5;
            case 28:
                CoroutineScope coroutineScope3 = (CoroutineScope) this.f108942x;
                fim.a aVar43 = fim.a.COROUTINE_SUSPENDED;
                int i118 = this.v;
                if (i118 != 0) {
                    if (i118 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                dca.r rVar6 = (dca.r) this.f108943y;
                dca.q qVar = new dca.q((PixQrCode) obj11, coroutineScope3, rVar6, null);
                this.f108942x = null;
                this.v = 1;
                Object objP2 = rVar6.p2(this, qVar);
                return objP2 == aVar43 ? aVar43 : objP2;
            default:
                fim.a aVar44 = fim.a.COROUTINE_SUSPENDED;
                int i119 = this.v;
                if (i119 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar7 = (com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c) this.f108943y;
                    ufm.i iVarM = ((rae.d) cVar7.u).m((qua.p) obj11);
                    this.f108942x = cVar7;
                    this.v = 1;
                    objB = nim.a.b(iVarM, this);
                    if (objB == aVar44) {
                        return aVar44;
                    }
                    cVar = cVar7;
                } else {
                    if (i119 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cVar = (com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c) this.f108942x;
                    yhm.o.b(obj2);
                    objB = obj2;
                }
                Intrinsics.checkNotNullExpressionValue(objB, "await(...)");
                return cVar.C1(zh9.u0.b((NaviCommand) objB));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f108942x = obj2;
        this.f108943y = obj3;
        this.f108941w = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f108943y = obj2;
        this.f108941w = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f108941w = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(Function0 function0, Flow flow, Continuation continuation) {
        super(2, continuation);
        this.u = 18;
        this.f108943y = (kotlin.jvm.internal.q) function0;
        this.f108941w = flow;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(Function1 function1, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.u = 26;
        this.f108942x = (gim.i) function1;
        this.f108941w = str;
        this.f108943y = str2;
    }
}
