package gsh;

import aw0.o9;
import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.bizum.impl.data.network.BizumService;
import com.revolut.feature.apm.blik.api.R$string;
import com.revolut.feature.apm.core.api.product.ApmBlik;
import com.revolut.feature.backend_flow.domain.models.BackendFlow;
import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import com.revolut.feature.junior_coparent.api.models.InvitationAcceptanceResponse;
import com.revolut.feature.market_alert_settings.impl.data.network.MarketAlertSettingsService;
import com.revolut.feature.payments.messaging.data.api.model.MessageItem;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferBroker;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferCreateRequest;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferInSelectedAsset;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferOutSelectedAsset;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferSelectedAsset;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferUserAccountInformation;
import com.revolut.feature.trading.transfer.investments.impl.data.network.TransferService;
import com.revolut.feature.travel.hotels.impl.declaration.kompot.TravelHotelsRoomDetailsParams;
import com.revolut.feature.user.impl.network.service.UserService;
import com.revolut.feature.wealth.account_closure.api.domain.model.AccountClosureFeedback;
import com.revolut.feature.wealth.models.robo.Template;
import com.revolut.feature_travel_hotels_models.amenity.HotelsAmenity;
import com.revolut.feature_travel_hotels_models.amenity.HotelsCategorisedAmenities;
import com.revolut.feature_travel_hotels_models.property.HotelsPropertyBrief;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.airportlounges.api.model.AirportLoungesDisclaimer;
import com.revolut.retail.feature.pending_payments.api.models.PendingPaymentInfo$TimerInfo;
import com.revolut.retail.feature.trading_onboarding.impl.ui.onboarding_backend_flow.TradingOnboardingBackendFlowContract$Configuration;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode;
import e93.g0;
import e93.i0;
import ft3.a1;
import ft3.d1;
import ft3.h1;
import g9f.n0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import nii.j1;
import nii.k1;
import nii.l1;
import nii.m1;
import nii.n1;
import okhttp3.ResponseBody;
import retrofit2.HttpException;
import retrofit2.Response;
import skm.e0;
import vkm.j2;
import vkm.z1;
import vrl.u0;
import y04.c;
import zhm.h0;
import zhm.q0;

/* JADX INFO: loaded from: classes10.dex */
public final class w extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f146522w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f146523x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f146524y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f146523x = obj2;
        this.f146522w = obj3;
        this.f146524y = obj4;
    }

    private final Object b(Object obj2) {
        ServerError serverErrorC;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        try {
            if (i == 0) {
                yhm.o.b(obj2);
                UserService userService = ((hng.q) this.f146523x).f154114a;
                String str = (String) this.f146522w;
                zlg.a aVar2 = (zlg.a) this.f146524y;
                eng.d dVar = new eng.d(str, aVar2 != null ? aVar2.a() : null);
                this.v = 1;
                obj2 = userService.requestEmailOtp(dVar, this);
                if (obj2 == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
            }
            ((hng.q) this.f146523x).f.d = true;
            return new zlg.e(((eng.e) obj2).getCode());
        } catch (HttpException e) {
            if (e.code() != 422 || (serverErrorC = ((hng.q) this.f146523x).d.c(e)) == null || serverErrorC.f51362a != 1033) {
                throw e;
            }
            ((hng.q) this.f146523x).f.d = true;
            return zlg.d.f323253a;
        }
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new w((a0) this.f146524y, continuation, 0);
            case 1:
                w wVar = new w((a0) this.f146522w, (String) this.f146524y, continuation, 1);
                wVar.f146523x = obj2;
                return wVar;
            case 2:
                w wVar2 = new w((gu1.o) this.f146522w, (String) this.f146524y, continuation, 2);
                wVar2.f146523x = obj2;
                return wVar2;
            case 3:
                return new w((com.revolut.feature.wealth.account_closure.impl.ui.flows.account_closure.b) this.f146523x, (AccountClosureFeedback) this.f146522w, (String) this.f146524y, continuation, 3);
            case 4:
                return new w((com.revolut.feature.wealth.account_closure.impl.ui.flows.account_closure.b) this.f146523x, (String) this.f146522w, (TradingProductCode) this.f146524y, continuation, 4);
            case 5:
                w wVar3 = new w((gui.j) this.f146522w, (dj0.d) this.f146524y, continuation, 5);
                wVar3.f146523x = obj2;
                return wVar3;
            case 6:
                w wVar4 = new w((gul.g) this.f146524y, continuation, 6);
                wVar4.f146522w = obj2;
                return wVar4;
            case 7:
                w wVar5 = new w((gyi.d0) this.f146524y, continuation, 7);
                wVar5.f146522w = obj2;
                return wVar5;
            case 8:
                return new w((gzj.d) this.f146523x, (czj.d) this.f146522w, (AccountId) this.f146524y, continuation, 8);
            case 9:
                return new w((h0a.e) this.f146523x, (String) this.f146522w, (MessageItem) this.f146524y, continuation, 9);
            case 10:
                return new w((com.revolut.retail.feature.trading_onboarding.impl.ui.onboarding_backend_flow.a) this.f146523x, (TradingOnboardingBackendFlowContract$Configuration) this.f146522w, (BackendFlow) this.f146524y, continuation, 10);
            case 11:
                return new w((com.revolut.feature.rev_points.impl.ui.wrapped.flow.a) this.f146523x, (f1c.n) this.f146522w, (yki.l) this.f146524y, continuation, 11);
            case 12:
                return new w((h25.e) this.f146523x, (d1) this.f146522w, (a1) this.f146524y, continuation, 12);
            case 13:
                return new w((r10.a) this.f146523x, (oy3.g) this.f146522w, (h1) this.f146524y, continuation, 13);
            case 14:
                return new w((com.revolut.retail.feature.beneficiary.impl.ui.bank_beneficiary_details.b) this.f146523x, (f5j.a) this.f146522w, (gpf.a) this.f146524y, continuation, 14);
            case 15:
                return new w((h53.c) this.f146522w, (String) this.f146524y, continuation, 15);
            case 16:
                return new w((h53.c) this.f146523x, (String) this.f146522w, (String) this.f146524y, continuation, 16);
            case 17:
                return new w((a59.b) this.f146523x, (a59.a) this.f146522w, (h59.c) this.f146524y, continuation, 17);
            case 18:
                return new w((h9f.e) this.f146523x, (TransferCreateRequest) this.f146522w, (String) this.f146524y, continuation, 18);
            case 19:
                return new w((ha3.x) this.f146523x, (String) this.f146522w, (String) this.f146524y, continuation, 19);
            case 20:
                return new w((ha3.x) this.f146523x, (b93.d) this.f146522w, (b93.k) this.f146524y, continuation, 20);
            case 21:
                return new w((com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.b) this.f146523x, (rei.g) this.f146522w, (rei.k) this.f146524y, continuation, 21);
            case 22:
                w wVar6 = new w((com.revolut.feature.junior_coparent.impl.ui.confirmation.flow.a) this.f146522w, (InvitationAcceptanceResponse) this.f146524y, continuation, 22);
                wVar6.f146523x = obj2;
                return wVar6;
            case 23:
                w wVar7 = new w((hec.a) this.f146522w, (nt.e) this.f146524y, continuation, 23);
                wVar7.f146523x = obj2;
                return wVar7;
            case 24:
                return new w((hmc.e) this.f146522w, (String) this.f146524y, continuation, 24);
            case 25:
                return new w((hmc.e) this.f146523x, (String) this.f146522w, (Template) this.f146524y, continuation, 25);
            case 26:
                return new w((com.revolut.sso.impl.ui.consent.qr.b) this.f146523x, (String) this.f146522w, (String) this.f146524y, continuation, 26);
            case 27:
                return new w((hng.q) this.f146523x, (String) this.f146522w, (zlg.a) this.f146524y, continuation, 27);
            case 28:
                return new w((hrj.d) this.f146522w, (jf0.c) this.f146524y, continuation, 28);
            default:
                return new w((hs1.c) this.f146522w, (b02.f) this.f146524y, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((w) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Exception {
        a0 a0Var;
        hlm.c cVar;
        ArrayList arrayList;
        Object objZ2;
        TextLocalisedClause textLocalisedClause;
        Throwable th10;
        Object objJ;
        AirportLoungesDisclaimer airportLoungesDisclaimer;
        Object objI2;
        Object objSubmitDownPaymentSource;
        Object generateImagesResult;
        h53.c cVar2;
        Object obj3;
        String upperCase;
        Object generatedImage;
        int i;
        c59.i iVar;
        g9f.t tVar;
        Object objCreateTransferRequest;
        Object objB;
        char c2;
        Object next;
        Object objE;
        hmc.e eVar;
        Object objB2;
        sri.m mVar;
        Object objPatchBizumSettings;
        hs1.c cVar3;
        int i2 = this.u;
        int i3 = 2;
        char c3 = 0;
        Continuation continuation = null;
        Object obj4 = this.f146524y;
        switch (i2) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                try {
                    if (i5 == 0) {
                        yhm.o.b(obj2);
                        a0 a0Var2 = (a0) obj4;
                        hlm.c cVar4 = a0Var2.d;
                        this.f146523x = cVar4;
                        this.f146522w = a0Var2;
                        this.v = 1;
                        if (cVar4.lock(null, this) == aVar) {
                            return aVar;
                        }
                        a0Var = a0Var2;
                        cVar = cVar4;
                    } else {
                        if (i5 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        a0Var = (a0) this.f146522w;
                        cVar = (hlm.c) this.f146523x;
                        yhm.o.b(obj2);
                    }
                    try {
                        ConcurrentHashMap concurrentHashMap = a0Var.f;
                        LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(concurrentHashMap.size()));
                        for (Object obj5 : concurrentHashMap.entrySet()) {
                            Object key = ((Map.Entry) obj5).getKey();
                            List list = (List) ((p) ((Map.Entry) obj5).getValue()).f146506a.getValue();
                            if (list != null) {
                                List<dsh.p> list2 = list;
                                arrayList = new ArrayList(zhm.w.t(list2, 10));
                                for (dsh.p pVar : list2) {
                                    String str = pVar.f117337b;
                                    dsh.t tVar2 = pVar.d;
                                    LinkedHashMap linkedHashMap2 = pVar.f117338c.f117319a;
                                    if (linkedHashMap2.isEmpty()) {
                                        linkedHashMap2 = null;
                                    }
                                    arrayList.add(new a(str, tVar2, linkedHashMap2));
                                }
                            } else {
                                arrayList = null;
                            }
                            linkedHashMap.put(key, arrayList);
                        }
                        ue0.c cVar5 = a0Var.f146461a;
                        KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
                        KType kTypeB = o0.b(String.class);
                        companion.getClass();
                        KTypeProjection kTypeProjectionA = KTypeProjection.Companion.a(kTypeB);
                        KTypeProjection kTypeProjectionA2 = KTypeProjection.Companion.a(o0.b(a.class));
                        p0 p0Var = o0.f186429a;
                        cVar5.G(linkedHashMap, "widget_values", wim.z.d(o0.d(kTypeProjectionA, KTypeProjection.Companion.a(p0Var.o(p0Var.b(List.class), Collections.singletonList(kTypeProjectionA2), true)))));
                        Unit unit = Unit.f186387a;
                        cVar.unlock(null);
                    } catch (Throwable th11) {
                        cVar.unlock(null);
                        throw th11;
                    }
                } catch (Exception e) {
                    if (e instanceof CancellationException) {
                        throw e;
                    }
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                }
                return Unit.f186387a;
            case 1:
                a0 a0Var3 = (a0) this.f146522w;
                FlowCollector flowCollector = (FlowCollector) this.f146523x;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    this.f146523x = flowCollector;
                    this.v = 1;
                    if (a0Var3.b(this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                j2 j2Var = a0Var3.c((String) obj4).f146506a;
                this.f146523x = null;
                this.v = 2;
                if (vkm.q.u(flowCollector, j2Var, this) == aVar2) {
                    return aVar2;
                }
                return Unit.f186387a;
            case 2:
                FlowCollector flowCollector2 = (FlowCollector) this.f146523x;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    this.f146523x = flowCollector2;
                    this.v = 1;
                    objZ2 = gu1.o.Z2((gu1.o) this.f146522w, (String) obj4, this);
                    if (objZ2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i21 != 1) {
                        if (i21 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                    objZ2 = obj2;
                }
                c02.j jVar = (c02.j) objZ2;
                c02.e eVar2 = jVar.f20115b;
                c02.b bVar = jVar.e;
                int i22 = gu1.g.f146663a[eVar2.ordinal()];
                if (i22 == 1) {
                    textLocalisedClause = new TextLocalisedClause(R$string.blik_transaction_confirmation_pos_payment_title, null, null, 14);
                } else if (i22 == 2) {
                    textLocalisedClause = new TextLocalisedClause(R$string.blik_transaction_confirmation_atm_withdraw_title, null, null, 14);
                } else if (i22 == 3) {
                    textLocalisedClause = new TextLocalisedClause(R$string.blik_transaction_confirmation_online_payment_title, null, null, 14);
                } else if (i22 == 4) {
                    textLocalisedClause = new TextLocalisedClause(R$string.blik_transaction_confirmation_online_refund_title, null, null, 14);
                } else {
                    if (i22 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    textLocalisedClause = new TextLocalisedClause(R$string.blik_transaction_confirmation_pos_refund_title, null, null, 14);
                }
                TextLocalisedClause textLocalisedClause2 = textLocalisedClause;
                long j2 = jVar.f20118h;
                PendingPaymentInfo$TimerInfo pendingPaymentInfo$TimerInfo = new PendingPaymentInfo$TimerInfo(j2 - jVar.f20117g, j2);
                Image imageF = ApmBlik.f61809c.F();
                dj0.d dVar = jVar.f20116c;
                LayeredImage layeredImage = sak.h.f261451a;
                TextClause textClause = new TextClause(bVar.f20098a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                String str2 = bVar.f20099b;
                Data dataP = zi0.c.P(new sak.g(textLocalisedClause2, imageF, dVar, layeredImage, textClause, str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, pendingPaymentInfo$TimerInfo, jVar, sak.e.f261444a), false, null, 3);
                this.f146523x = null;
                this.v = 2;
                if (flowCollector2.emit(dataP, this) == aVar3) {
                    return aVar3;
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 != 0) {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.wealth.account_closure.impl.ui.flows.account_closure.b bVar2 = (com.revolut.feature.wealth.account_closure.impl.ui.flows.account_closure.b) this.f146523x;
                gug.f fVar = new gug.f(bVar2, (AccountClosureFeedback) this.f146522w, (String) obj4, null, 2);
                this.v = 1;
                Object objB3 = pu7.a.B(bVar2.k, "close_wealth_account", fVar, this);
                return objB3 == aVar4 ? aVar4 : objB3;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 != 0) {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.wealth.account_closure.impl.ui.flows.account_closure.b bVar3 = (com.revolut.feature.wealth.account_closure.impl.ui.flows.account_closure.b) this.f146523x;
                gug.g gVar = new gug.g(bVar3, (String) this.f146522w, (TradingProductCode) obj4, null, 2);
                this.v = 1;
                Object objB4 = pu7.a.B(bVar3.k, "close_wealth_account_product_code", gVar, this);
                return objB4 == aVar5 ? aVar5 : objB4;
            case 5:
                n1 n1Var = (n1) this.f146523x;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    z1 z1Var = ((gui.j) this.f146522w).f146958p;
                    gui.b bVar4 = new gui.b((dj0.d) obj4, n1Var);
                    this.f146523x = null;
                    this.v = 1;
                    if (z1Var.emit(bVar4, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 6:
                FlowCollector flowCollector3 = (FlowCollector) this.f146522w;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    yhm.o.b(obj2);
                    u0 u0Var = ((gul.g) obj4).f146986a;
                    th10 = null;
                    this.f146522w = null;
                    this.f146523x = flowCollector3;
                    this.v = 1;
                    prl.r rVar = u0Var.f291681a;
                    rVar.getClass();
                    pnb.b bVar5 = new pnb.b(rVar, 0 == true ? 1 : 0, 7);
                    skm.p0 p0Var2 = skm.p0.f264001a;
                    objJ = e0.J(elm.f.f127540b, bVar5, this);
                    if (objJ == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i59 != 1) {
                        if (i59 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    flowCollector3 = (FlowCollector) this.f146523x;
                    yhm.o.b(obj2);
                    objJ = obj2;
                    th10 = null;
                }
                Data dataP2 = zi0.c.P(Optional.ofNullable(objJ), false, th10, 3);
                this.f146522w = th10;
                this.f146523x = th10;
                this.v = 2;
                if (flowCollector3.emit(dataP2, this) == aVar7) {
                    return aVar7;
                }
                return Unit.f186387a;
            case 7:
                gyi.d0 d0Var = (gyi.d0) obj4;
                Pair pair = (Pair) this.f146522w;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    yhm.o.b(obj2);
                    svi.r rVar2 = (svi.r) pair.f186385a;
                    airportLoungesDisclaimer = (AirportLoungesDisclaimer) pair.f186386b;
                    this.f146522w = null;
                    this.f146523x = airportLoungesDisclaimer;
                    this.v = 1;
                    objI2 = gyi.d0.I2(d0Var, rVar2, airportLoungesDisclaimer, this);
                    if (objI2 == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    airportLoungesDisclaimer = (AirportLoungesDisclaimer) this.f146523x;
                    yhm.o.b(obj2);
                    objI2 = obj2;
                }
                if (((Boolean) objI2).booleanValue()) {
                    d0Var.C2(new gyi.e(airportLoungesDisclaimer));
                }
                return Unit.f186387a;
            case 8:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 != 0) {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                gzj.d dVar2 = (gzj.d) this.f146523x;
                gzj.c cVar6 = new gzj.c(dVar2, (czj.d) this.f146522w, (AccountId) obj4, null, 1);
                this.v = 1;
                Object objB5 = pu7.a.B(dVar2.e, "show_prompt", cVar6, this);
                return objB5 == aVar9 ? aVar9 : objB5;
            case 9:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    yhm.o.b(obj2);
                    h0a.e eVar3 = (h0a.e) this.f146523x;
                    g84.u uVar = new g84.u(eVar3, (String) this.f146522w, (MessageItem) obj4, null, 10);
                    this.v = 1;
                    if (eVar3.Y2(this, uVar) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 10:
                TradingOnboardingBackendFlowContract$Configuration tradingOnboardingBackendFlowContract$Configuration = (TradingOnboardingBackendFlowContract$Configuration) this.f146522w;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 != 0) {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                kl.b0 b0Var = ((com.revolut.retail.feature.trading_onboarding.impl.ui.onboarding_backend_flow.a) this.f146523x).f104230a;
                this.v = 1;
                hyk.a aVar12 = (hyk.a) b0Var.f185144b;
                aVar12.getClass();
                g0a.e eVar4 = new g0a.e(26, aVar12, tradingOnboardingBackendFlowContract$Configuration.getF104227a(), tradingOnboardingBackendFlowContract$Configuration.getF104225b(), (BackendFlow) obj4, null);
                skm.p0 p0Var3 = skm.p0.f264001a;
                Object objJ2 = e0.J(elm.f.f127540b, eVar4, this);
                return objJ2 == aVar11 ? aVar11 : objJ2;
            case 11:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.rev_points.impl.ui.wrapped.flow.a aVar14 = (com.revolut.feature.rev_points.impl.ui.wrapped.flow.a) this.f146523x;
                    g84.u uVar2 = new g84.u(aVar14, (f1c.n) this.f146522w, (yki.l) obj4, null, 11);
                    this.v = 1;
                    if (aVar14.p2(this, uVar2) == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 12:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 != 0) {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                h25.e eVar5 = (h25.e) this.f146523x;
                g84.u uVar3 = new g84.u(eVar5, (d1) this.f146522w, (a1) obj4, null, 12);
                this.v = 1;
                Object objB6 = pu7.a.B(eVar5.e, "cancel-application", uVar3, this);
                return objB6 == aVar15 ? aVar15 : objB6;
            case 13:
                r10.a aVar16 = (r10.a) this.f146523x;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    yhm.o.b(obj2);
                    oy3.g domain = (oy3.g) this.f146522w;
                    Intrinsics.checkNotNullParameter(domain, "domain");
                    ArrayList<oy3.f> arrayList2 = domain.f230887a;
                    ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
                    for (oy3.f fVar2 : arrayList2) {
                        String str3 = fVar2.f230885a;
                        dj0.d dVar3 = fVar2.f230886b;
                        arrayList3.add(new c.a(dVar3 != null ? mo3.a.p(dVar3) : null, str3));
                    }
                    y04.c cVar7 = new y04.c(arrayList3);
                    CreditPluginsService creditPluginsService = (CreditPluginsService) aVar16.f250811a;
                    String str4 = ((h1) obj4).f137835a;
                    this.v = 1;
                    objSubmitDownPaymentSource = creditPluginsService.submitDownPaymentSource(str4, cVar7, this);
                    if (objSubmitDownPaymentSource == aVar17) {
                        return aVar17;
                    }
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objSubmitDownPaymentSource = obj2;
                }
                return ((mp.p) aVar16.f250812b).p((tt3.a) objSubmitDownPaymentSource);
            case 14:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.retail.feature.beneficiary.impl.ui.bank_beneficiary_details.b bVar6 = (com.revolut.retail.feature.beneficiary.impl.ui.bank_beneficiary_details.b) this.f146523x;
                    g84.u uVar4 = new g84.u(bVar6, (f5j.a) this.f146522w, (gpf.a) obj4, null, 14);
                    this.v = 1;
                    if (bVar6.p2(this, uVar4) == aVar18) {
                        return aVar18;
                    }
                } else {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 15:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 == 0) {
                    yhm.o.b(obj2);
                    h53.c cVar8 = (h53.c) this.f146522w;
                    this.f146523x = cVar8;
                    this.v = 1;
                    generateImagesResult = cVar8.f149446a.getGenerateImagesResult((String) obj4, this);
                    if (generateImagesResult == aVar19) {
                        return aVar19;
                    }
                    cVar2 = cVar8;
                } else {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cVar2 = (h53.c) this.f146523x;
                    yhm.o.b(obj2);
                    generateImagesResult = obj2;
                }
                g53.a aVar20 = (g53.a) generateImagesResult;
                cVar2.getClass();
                Intrinsics.checkNotNullParameter(aVar20, "<this>");
                String strA = aVar20.getId();
                e93.h0 h0Var2 = i0.Companion;
                String strC = aVar20.getState();
                h0Var2.getClass();
                Iterator<E> it8 = i0.a().iterator();
                while (true) {
                    if (it8.hasNext()) {
                        Object next2 = it8.next();
                        String strName = ((i0) next2).name();
                        if (strC != null) {
                            upperCase = strC.toUpperCase(Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                        } else {
                            upperCase = null;
                        }
                        if (Intrinsics.f(strName, upperCase)) {
                            obj3 = next2;
                        }
                    } else {
                        obj3 = null;
                    }
                }
                i0 i0Var = (i0) obj3;
                if (i0Var == null) {
                    i0Var = i0.FAILED;
                }
                List listB = aVar20.getImages();
                ArrayList arrayList4 = new ArrayList(zhm.w.t(listB, 10));
                Iterator it9 = listB.iterator();
                while (it9.hasNext()) {
                    arrayList4.add(((g53.b) it9.next()).getId());
                }
                return new g0(strA, i0Var, arrayList4);
            case 16:
                String str5 = (String) this.f146522w;
                h53.c cVar9 = (h53.c) this.f146523x;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 == 0) {
                    yhm.o.b(obj2);
                    String str6 = (String) cVar9.e.T2(str5, String.class);
                    if (str6 != null) {
                        return cVar9.f149447b.a(str6);
                    }
                    this.v = 1;
                    generatedImage = cVar9.f149446a.getGeneratedImage((String) obj4, str5, this);
                    if (generatedImage == aVar21) {
                        return aVar21;
                    }
                } else {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    generatedImage = obj2;
                }
                Response response = (Response) generatedImage;
                ResponseBody responseBody = (ResponseBody) response.body();
                if (!response.isSuccessful() || responseBody == null) {
                    throw new HttpException(response);
                }
                byte[] bArrBytes = responseBody.bytes();
                z9h.n.l(String.class, cVar9.e, str5, cVar9.f149447b.d(bArrBytes));
                return bArrBytes;
            case 17:
                h59.c cVar10 = (h59.c) obj4;
                a59.a aVar22 = (a59.a) this.f146522w;
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 == 0) {
                    yhm.o.b(obj2);
                    int i106 = h59.b.f149513a[((a59.b) this.f146523x).ordinal()];
                    if (i106 != 1) {
                        i = 2;
                        if (i106 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        iVar = new c59.i((a59.a) null, aVar22, 1);
                    } else {
                        i = 2;
                        iVar = new c59.i(aVar22, (a59.a) null, 2);
                    }
                    MarketAlertSettingsService marketAlertSettingsService = cVar10.f149514a;
                    this.v = 1;
                    if (marketAlertSettingsService.updateMarketAlertSettings(iVar, this) == aVar23) {
                        return aVar23;
                    }
                } else {
                    if (i105 != 1) {
                        if (i105 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                    i = 2;
                }
                x4l.c cVar11 = cVar10.d;
                Unit unit2 = Unit.f186387a;
                this.v = i;
                if (cVar11.d(unit2, false, this) == aVar23) {
                    return aVar23;
                }
                return Unit.f186387a;
            case 18:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 == 0) {
                    yhm.o.b(obj2);
                    TransferService transferService = ((h9f.e) this.f146523x).f150246c;
                    TransferCreateRequest transferCreateRequest = (TransferCreateRequest) this.f146522w;
                    Intrinsics.checkNotNullParameter(transferCreateRequest, "<this>");
                    g9f.g gVarE = i2b.a.E(transferCreateRequest.f91503a);
                    TransferBroker transferBroker = transferCreateRequest.f91504b;
                    u8f.h hVar = transferBroker.f91502c;
                    String str7 = transferBroker.f91500a;
                    n0 n0VarJ = io3.h.J(hVar);
                    Intrinsics.checkNotNullParameter(transferCreateRequest, "<this>");
                    TransferUserAccountInformation transferUserAccountInformation = transferCreateRequest.f91505c;
                    if (transferUserAccountInformation instanceof TransferUserAccountInformation.AcatTransferUserAccountInformation) {
                        TransferUserAccountInformation.AcatTransferUserAccountInformation acatTransferUserAccountInformation = (TransferUserAccountInformation.AcatTransferUserAccountInformation) transferUserAccountInformation;
                        tVar = new g9f.t(str7, acatTransferUserAccountInformation.f91531a, acatTransferUserAccountInformation.f91532b.f297794a, null);
                    } else if (transferUserAccountInformation instanceof TransferUserAccountInformation.DtcTransferUserAccountInformation) {
                        TransferUserAccountInformation.DtcTransferUserAccountInformation dtcTransferUserAccountInformation = (TransferUserAccountInformation.DtcTransferUserAccountInformation) transferUserAccountInformation;
                        tVar = new g9f.t(str7, dtcTransferUserAccountInformation.f91533a, dtcTransferUserAccountInformation.f91535c.f297794a, dtcTransferUserAccountInformation.f91534b);
                    } else {
                        if (!(transferUserAccountInformation instanceof TransferUserAccountInformation.TaaTransferUserAccountInformation)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        tVar = new g9f.t(str7, ((TransferUserAccountInformation.TaaTransferUserAccountInformation) transferUserAccountInformation).f91536a, null, null);
                    }
                    List<TransferSelectedAsset> list3 = transferCreateRequest.d;
                    ArrayList arrayList5 = new ArrayList(zhm.w.t(list3, 10));
                    for (TransferSelectedAsset transferSelectedAsset : list3) {
                        Intrinsics.checkNotNullParameter(transferSelectedAsset, "<this>");
                        String f91514a = transferSelectedAsset.n().getF91514a();
                        int f91518b = transferSelectedAsset.getF91518b();
                        if (transferSelectedAsset instanceof TransferInSelectedAsset) {
                            ej0.b bVar7 = ((TransferInSelectedAsset) transferSelectedAsset).f91512c;
                            g9f.m mVar2 = bVar7 != null ? new g9f.m(bVar7.f126704b.f306286a, bVar7.f126703a) : null;
                            arrayList5.add(new g9f.e0(f91514a, f91518b, mVar2));
                        } else if (!(transferSelectedAsset instanceof TransferOutSelectedAsset)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        arrayList5.add(new g9f.e0(f91514a, f91518b, mVar2));
                    }
                    this.v = 1;
                    objCreateTransferRequest = transferService.createTransferRequest(new g9f.f(gVarE, n0VarJ, tVar, arrayList5), (String) obj4, this);
                    if (objCreateTransferRequest == aVar24) {
                        return aVar24;
                    }
                } else {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objCreateTransferRequest = obj2;
                }
                Response response2 = (Response) objCreateTransferRequest;
                if (response2.isSuccessful()) {
                    return Unit.f186387a;
                }
                throw new HttpException(response2);
            case 19:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 != 0) {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                this.v = 1;
                Object objB7 = ((ha3.x) this.f146523x).f.b((String) this.f146522w, (String) obj4, this);
                return objB7 == aVar25 ? aVar25 : objB7;
            case 20:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 != 0) {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                this.v = 1;
                Object objG = ((ha3.x) this.f146523x).f.g((b93.d) this.f146522w, (b93.k) obj4, this);
                return objG == aVar26 ? aVar26 : objG;
            case 21:
                rei.k kVar = (rei.k) obj4;
                HotelsPropertyBrief hotelsPropertyBrief = ((rei.g) this.f146522w).f;
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.b bVar8 = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.b) this.f146523x;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 == 0) {
                    yhm.o.b(obj2);
                    efm.d0 d0VarFirstOrError = m70.a.g(bVar8.C.c(hotelsPropertyBrief.f98005a), null, null, 3).firstOrError();
                    Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
                    this.v = 1;
                    objB = nim.a.b(d0VarFirstOrError, this);
                    if (objB == aVar27) {
                        return aVar27;
                    }
                } else {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objB = obj2;
                }
                List<HotelsCategorisedAmenities> list4 = (List) objB;
                rei.l lVar = kVar.f253623m;
                String str8 = lVar.f253626b;
                ArrayList arrayList6 = lVar.f253627c;
                Intrinsics.h(list4);
                List list5 = kVar.f253624n;
                ArrayList arrayListY = com.google.android.gms.internal.mlkit_vision_face.a.y("<this>", list4);
                if (list5 != null) {
                    for (HotelsCategorisedAmenities hotelsCategorisedAmenities : list4) {
                        Iterator it10 = list5.iterator();
                        while (true) {
                            if (it10.hasNext()) {
                                next = it10.next();
                                c2 = c3;
                                if (((HotelsCategorisedAmenities) next).f97840a != hotelsCategorisedAmenities.f97840a) {
                                    c3 = c2;
                                }
                            } else {
                                c2 = c3;
                                next = null;
                            }
                        }
                        HotelsCategorisedAmenities hotelsCategorisedAmenities2 = (HotelsCategorisedAmenities) next;
                        if (hotelsCategorisedAmenities2 != null) {
                            List list6 = hotelsCategorisedAmenities2.f97841b;
                            List list7 = hotelsCategorisedAmenities.f97841b;
                            List[] listArr = new List[i3];
                            listArr[c2] = list6;
                            listArr[1] = list7;
                            ArrayList arrayListU = zhm.w.u(zhm.v.k(listArr));
                            HashSet hashSet = new HashSet();
                            ArrayList amenities = new ArrayList();
                            for (Object obj6 : arrayListU) {
                                if (hashSet.add(((HotelsAmenity) obj6).f97839c)) {
                                    amenities.add(obj6);
                                }
                            }
                            oei.b category = hotelsCategorisedAmenities2.f97840a;
                            Intrinsics.checkNotNullParameter(category, "category");
                            Intrinsics.checkNotNullParameter(amenities, "amenities");
                            hotelsCategorisedAmenities = new HotelsCategorisedAmenities(category, amenities);
                        }
                        arrayListY.add(hotelsCategorisedAmenities);
                        c3 = c2;
                        i3 = 2;
                    }
                } else {
                    zhm.a0.x(list4, arrayListY);
                }
                bVar8.C2(new hbg.r(new TravelHotelsRoomDetailsParams(str8, null, arrayList6, arrayListY, null, hotelsPropertyBrief.f98005a)));
                return Unit.f186387a;
            case 22:
                n1 n1Var2 = (n1) this.f146523x;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 == 0) {
                    yhm.o.b(obj2);
                    if ((n1Var2 instanceof j1) || (n1Var2 instanceof l1) || (n1Var2 instanceof m1)) {
                        IllegalStateException illegalStateException = new IllegalStateException("Unexpected type of result: ".concat(n1Var2.getClass().getSimpleName()));
                        h0 h0Var3 = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, "handlePrimaryButtonClickResult", null, illegalStateException, h0Var3);
                    } else {
                        if (!(n1Var2 instanceof k1)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        com.revolut.feature.junior_coparent.impl.ui.confirmation.flow.a aVar29 = (com.revolut.feature.junior_coparent.impl.ui.confirmation.flow.a) this.f146522w;
                        String juniorId = ((InvitationAcceptanceResponse) obj4).getJuniorId();
                        this.f146523x = null;
                        this.v = 1;
                        if (com.revolut.feature.junior_coparent.impl.ui.confirmation.flow.a.I2(aVar29, juniorId, this) == aVar28) {
                            return aVar28;
                        }
                    }
                } else {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 23:
                Throwable th12 = (Throwable) this.f146523x;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 != 0) {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                ((hec.a) this.f146522w).t2();
                this.f146523x = null;
                this.v = 1;
                ((nt.e) obj4).invoke(th12, this);
                Boolean bool = Boolean.FALSE;
                return bool == aVar30 ? aVar30 : bool;
            case 24:
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                if (i113 == 0) {
                    yhm.o.b(obj2);
                    hmc.e eVar6 = (hmc.e) this.f146522w;
                    clc.b bVar9 = eVar6.f153638p;
                    this.f146523x = eVar6;
                    this.v = 1;
                    objE = ((com.revolut.feature.robo.impl.navigation.c) bVar9).e(this, (String) obj4, false);
                    if (objE == aVar31) {
                        return aVar31;
                    }
                    eVar = eVar6;
                } else {
                    if (i113 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    eVar = (hmc.e) this.f146523x;
                    yhm.o.b(obj2);
                    objE = obj2;
                }
                return eVar.A2(zh9.u0.b((NaviCommand) objE));
            case 25:
                hmc.e eVar7 = (hmc.e) this.f146523x;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                int i114 = this.v;
                if (i114 != 0) {
                    if (i114 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                nii.c0 c0Var = new nii.c0(null, null, null, true, null, false, false, null, 1903);
                ack.n nVar = new ack.n(23);
                g84.u uVar5 = new g84.u(eVar7, (String) this.f146522w, (Template) obj4, null, 20);
                this.v = 1;
                Object objW = n14.k.W(eVar7, c0Var, null, nVar, uVar5, this, 2);
                return objW == aVar32 ? aVar32 : objW;
            case 26:
                com.revolut.sso.impl.ui.consent.qr.b bVar10 = (com.revolut.sso.impl.ui.consent.qr.b) this.f146523x;
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                int i115 = this.v;
                if (i115 == 0) {
                    yhm.o.b(obj2);
                    String str9 = (String) this.f146522w;
                    hib.n nVar2 = new hib.n((yji.l) bVar10, obj4, continuation, 6);
                    this.v = 1;
                    if (zh9.u0.c0(bVar10, str9, nVar2, this) == aVar33) {
                        return aVar33;
                    }
                } else {
                    if (i115 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                oki.h.D2(bVar10.v);
                return Unit.f186387a;
            case 27:
                return b(obj2);
            case 28:
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                int i116 = this.v;
                if (i116 == 0) {
                    yhm.o.b(obj2);
                    hrj.d dVar4 = (hrj.d) this.f146522w;
                    sri.m mVar3 = dVar4.f154829a;
                    this.f146523x = mVar3;
                    this.v = 1;
                    objB2 = dVar4.b((jf0.c) obj4, this);
                    if (objB2 == aVar34) {
                        return aVar34;
                    }
                    mVar = mVar3;
                } else {
                    if (i116 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mVar = (sri.m) this.f146523x;
                    yhm.o.b(obj2);
                    objB2 = obj2;
                }
                mVar.c((NaviCommand) objB2);
                return Boolean.TRUE;
            default:
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                int i117 = this.v;
                if (i117 == 0) {
                    yhm.o.b(obj2);
                    hs1.c cVar12 = (hs1.c) this.f146522w;
                    BizumService bizumService = cVar12.f154859a;
                    b02.f fVar3 = (b02.f) obj4;
                    Intrinsics.checkNotNullParameter(fVar3, "<this>");
                    js1.h hVar2 = new js1.h(fVar3.f11546a);
                    this.f146523x = cVar12;
                    this.v = 1;
                    objPatchBizumSettings = bizumService.patchBizumSettings(hVar2, this);
                    if (objPatchBizumSettings == aVar35) {
                        return aVar35;
                    }
                    cVar3 = cVar12;
                } else {
                    if (i117 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cVar3 = (hs1.c) this.f146523x;
                    yhm.o.b(obj2);
                    objPatchBizumSettings = obj2;
                }
                Response response3 = (Response) objPatchBizumSettings;
                cVar3.getClass();
                if (response3.isSuccessful()) {
                    return Unit.f186387a;
                }
                throw new HttpException(response3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f146522w = obj2;
        this.f146524y = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f146524y = obj2;
    }
}
