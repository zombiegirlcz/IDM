package nya;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.domain.models.transfers.PeerToPeerTransferDescriptor;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.card_order_new.impl.kompot.screen.address_form.AddressFormScreenContract$InputData;
import com.revolut.feature.cards_core.R$string;
import com.revolut.feature.defi.exchange.impl.data.network.DeFiSwapSubmitService;
import com.revolut.feature.onboarding.api.esignature.models.ESignatureDetails;
import com.revolut.feature.pix.api.model.PixQrCodeDecodeData;
import com.revolut.feature.retail.reauth.impl.network.service.ReauthService;
import com.revolut.feature.revolutpay.api.shared.domain.models.ramp.RampOrderDetails;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.terms.api.model.TermsScope;
import com.revolut.feature_travel_hotels_models.property.HotelsProperty;
import com.revolut.retail.trading.core.domain.orders.TradingOrderExitStrategies;
import hs3.i1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import nii.y0;
import od3.s0;
import skm.p0;
import vkm.j2;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class i0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f220736w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f220737x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f220736w = obj2;
        this.f220737x = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i0((com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home.d) this.f220736w, (ty0.a) this.f220737x, continuation, 0);
            case 1:
                i0 i0Var = new i0((nzd.c) this.f220737x, continuation, 1);
                i0Var.f220736w = obj2;
                return i0Var;
            case 2:
                return new i0((o03.m) this.f220737x, continuation, 2);
            case 3:
                return new i0((com.revolut.feature.card_order_new.impl.kompot.screen.address_form.b) this.f220736w, (String) this.f220737x, continuation, 3);
            case 4:
                return new i0((Address) this.f220736w, (com.revolut.feature.card_order_new.impl.kompot.screen.address_form.b) this.f220737x, continuation, 4);
            case 5:
                return new i0((o36.g) this.f220736w, (String) this.f220737x, continuation, 5);
            case 6:
                return new i0((o3b.n0) this.f220736w, (TradingOrderExitStrategies) this.f220737x, continuation, 6);
            case 7:
                return new i0((o55.b) this.f220736w, (String) this.f220737x, continuation, 7);
            case 8:
                return new i0((o7b.h) this.f220736w, (String) this.f220737x, continuation, 8);
            case 9:
                return new i0((o7c.g) this.f220736w, (u9c.a) this.f220737x, continuation, 9);
            case 10:
                return new i0((String) this.f220736w, (o7c.g) this.f220737x, continuation, 10);
            case 11:
                return new i0((jf0.c) this.f220736w, (o7c.k) this.f220737x, continuation, 11);
            case 12:
                return new i0((o7c.m) this.f220736w, (dj0.d) this.f220737x, continuation, 12);
            case 13:
                return new i0((o7e.k) this.f220736w, this.f220737x, continuation, 13);
            case 14:
                return new i0((com.revolut.feature.pix.impl.flow.authorisation_request.screens.request.a) this.f220736w, (PixQrCodeDecodeData) this.f220737x, continuation, 14);
            case 15:
                return new i0((com.revolut.feature.pix.impl.flow.authorisation_request.screens.request.a) this.f220736w, (g8a.a) this.f220737x, continuation, 15);
            case 16:
                return new i0((com.revolut.feature.revolutpay.impl.ui.summary_screen.f) this.f220736w, (RampOrderDetails) this.f220737x, continuation, 16);
            case 17:
                return new i0((o9k.y) this.f220736w, (PeerToPeerTransferDescriptor) this.f220737x, continuation, 17);
            case 18:
                return new i0((ob3.f) this.f220736w, (String) this.f220737x, continuation, 18);
            case 19:
                return new i0((com.revolut.feature.onboarding.impl.onboarding.plan_selection.a) this.f220737x, continuation, 19);
            case 20:
                return new i0((com.revolut.feature.onboarding.impl.qes_terms.h) this.f220736w, (ArrayList) this.f220737x, continuation, 20);
            case 21:
                return new i0((com.revolut.feature.onboarding.impl.qes_terms.h) this.f220736w, (kc9.g) this.f220737x, continuation, 21);
            case 22:
                return new i0((ty0.a) this.f220737x, (oc9.b0) this.f220736w, continuation);
            case 23:
                return new i0((oc9.b0) this.f220736w, (TermsScope) this.f220737x, continuation, 23);
            case 24:
                return new i0((ocg.r) this.f220736w, (HotelsProperty) this.f220737x, continuation, 24);
            case 25:
                return new i0((s0) this.f220736w, (String) this.f220737x, continuation, 25);
            case 26:
                return new i0((kye.e) this.f220736w, (jdb.a) this.f220737x, continuation, 26);
            case 27:
                return new i0((of6.e) this.f220736w, (String) this.f220737x, continuation, 27);
            case 28:
                i0 i0Var2 = new i0((oge.f) this.f220737x, continuation, 28);
                i0Var2.f220736w = obj2;
                return i0Var2;
            default:
                return new i0((oh4.l) this.f220736w, (i1) this.f220737x, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((i0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((i0) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((i0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((i0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((i0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((i0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((i0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((i0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((i0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((i0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((i0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((i0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((i0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((i0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((i0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((i0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((i0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((i0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((i0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((i0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((i0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((i0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((i0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((i0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((i0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((i0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((i0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((i0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((i0) create((ProductAccountDescriptor$Value) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((i0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objX;
        Object objI2;
        h93.f0 f0Var;
        List list;
        Map map;
        Object objP;
        Object objP2;
        Object objB;
        Object objI22;
        Object objK2;
        Object objFetchInstitutionInfo;
        int i = this.u;
        int i2 = 11;
        int i3 = 14;
        int i5 = 2;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        Object[] objArr9 = 0;
        Object obj3 = this.f220737x;
        int i6 = 1;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home.d dVar = (com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home.d) this.f220736w;
                nk9.l lVar = new nk9.l((ty0.a) obj3, dVar, null, i3);
                this.v = 1;
                Object objB2 = pu7.a.B(dVar.k, "onClauseClick", lVar, this);
                return objB2 == aVar ? aVar : objB2;
            case 1:
                FlowCollector flowCollector = (FlowCollector) this.f220736w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    Data dataP = zi0.c.P(zhm.d0.P0(zhm.v.k(new Locale("bg"), new Locale("cs"), new Locale("da"), new Locale("de"), new Locale("el"), new Locale("en"), new Locale("es"), new Locale("fi"), new Locale("fr"), new Locale("hr"), new Locale("hu"), new Locale("it"), new Locale("ja"), new Locale("lt"), new Locale("lv"), new Locale("nb"), new Locale("nl"), new Locale("pl"), new Locale("pt"), new Locale("en", "US"), new Locale("ro"), new Locale("ru"), new Locale("sk"), new Locale("sv"), new Locale("uk"), new Locale("pt", "BR")), new nzd.b()), false, null, 3);
                    this.f220736w = null;
                    this.v = 1;
                    if (flowCollector.emit(dataP, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                o03.m mVar = (o03.m) obj3;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    objX = vkm.q.x(new njj.n(mVar.f221114p.u(mVar.o.f64899a), 26), this);
                    if (objX == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i32 != 1) {
                        if (i32 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        f0Var = (h93.f0) this.f220736w;
                        yhm.o.b(obj2);
                        objI2 = obj2;
                        mVar.H2(mVar.f221116r, new nvg.b0(f0Var, (d71.a) objI2, 15));
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                    objX = obj2;
                }
                h93.f0 f0Var2 = (h93.f0) objX;
                this.f220736w = f0Var2;
                this.v = 2;
                objI2 = o03.m.I2(mVar, this);
                if (objI2 == aVar3) {
                    return aVar3;
                }
                f0Var = f0Var2;
                mVar.H2(mVar.f221116r, new nvg.b0(f0Var, (d71.a) objI2, 15));
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.card_order_new.impl.kompot.screen.address_form.b bVar = (com.revolut.feature.card_order_new.impl.kompot.screen.address_form.b) this.f220736w;
                    wi0.b.Companion.getClass();
                    wi0.b bVarA = wi0.a.a((String) obj3);
                    this.v = 1;
                    if (com.revolut.feature.card_order_new.impl.kompot.screen.address_form.b.J2(bVar, bVarA, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                com.revolut.feature.card_order_new.impl.kompot.screen.address_form.b bVar2 = (com.revolut.feature.card_order_new.impl.kompot.screen.address_form.b) obj3;
                cli.y yVar = bVar2.D;
                Address address = (Address) this.f220736w;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    wi0.b bVarG = nz8.d.g(address);
                    o23.v vVar = ((o23.w) ((j2) yVar.f22677a).getValue()).i;
                    do3.n nVar = (do3.n) ((o23.w) ((j2) yVar.f22677a).getValue()).o.getContent();
                    if (vVar == null || (map = vVar.e) == null || (list = (List) map.get(bVarG)) == null) {
                        list = zhm.f0.f322471a;
                    }
                    List list2 = list;
                    String postcode = address.getPostcode();
                    String upperCase = kotlin.text.d0.F0(postcode != null ? postcode : "").toString().toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                    List list3 = list2;
                    ArrayList arrayList = new ArrayList(zhm.w.t(list3, 10));
                    Iterator it8 = list3.iterator();
                    while (it8.hasNext()) {
                        String upperCase2 = kotlin.text.d0.F0((String) it8.next()).toString().toUpperCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
                        arrayList.add(upperCase2);
                    }
                    if (!kotlin.text.d0.W(upperCase) && arrayList.contains(upperCase)) {
                        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.cards_verify_delivery_address_outside_range_popup_title, null, null, 14);
                        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.cards_verify_delivery_address_outside_range_warning_description, null, null, 14);
                        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.cards_verify_delivery_address_outside_range_cta_change_address, null, null, 14);
                        AddressFormScreenContract$InputData addressFormScreenContract$InputData = bVar2.o;
                        yji.l.a1(bVar2, bVar2.X1(new y0(null, new nii.z(textLocalisedClause, textLocalisedClause2, !addressFormScreenContract$InputData.o ? textLocalisedClause3 : null, (!addressFormScreenContract$InputData.f65125n || addressFormScreenContract$InputData.o) ? new TextLocalisedClause(R$string.cards_verify_delivery_address_outside_range_cta_virtual_card, null, null, 14) : null, null, null, false, null, null, null, null, null, null, 32724), false, 5)), null, null, new o23.r(bVar2, address, null), 3);
                        return Unit.f186387a;
                    }
                    com.revolut.feature.card_order_new.impl.kompot.screen.address_form.a aVar6 = new com.revolut.feature.card_order_new.impl.kompot.screen.address_form.a(bVar2, (Address) this.f220736w, vVar, bVarG, list2, nVar, null);
                    this.v = 1;
                    if (u0.b0(bVar2.X(), "ADD_ADDRESS_SUBMIT_BUTTON_TAG", aVar6, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 5:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 != 0) {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                DeFiSwapSubmitService deFiSwapSubmitService = ((o36.g) this.f220736w).f221706b;
                n36.d0 d0Var = new n36.d0((String) obj3);
                wj0.b bVar3 = new wj0.b("IDEMPOTENCY_TAG_DEFI_SWAP_SUBMIT");
                this.v = 1;
                Object objSubmitSwap = deFiSwapSubmitService.submitSwap(d0Var, bVar3, this);
                return objSubmitSwap == aVar7 ? aVar7 : objSubmitSwap;
            case 6:
                TradingOrderExitStrategies tradingOrderExitStrategies = (TradingOrderExitStrategies) obj3;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    yhm.o.b(obj2);
                    o3b.n0 n0Var = (o3b.n0) this.f220736w;
                    if (n0Var.v.f instanceof r2b.a) {
                        nk9.l lVar2 = new nk9.l(n0Var, tradingOrderExitStrategies, objArr == true ? 1 : 0, 18);
                        this.v = 1;
                        if (u0.b0(n0Var.X(), "cfd-exit-strategies-set-up-done-button-loading-tag", lVar2, this) == aVar8) {
                            return aVar8;
                        }
                    } else {
                        n0Var.C2(new o3b.b0(tradingOrderExitStrategies.f104659a, tradingOrderExitStrategies.f104660b, null));
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 7:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (((o55.b) this.f220736w).f222317a.withdrawLoan((String) obj3, this) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 8:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    yhm.o.b(obj2);
                    o7b.h hVar = (o7b.h) this.f220736w;
                    nk9.l lVar3 = new nk9.l(hVar, (String) obj3, objArr2 == true ? 1 : 0, 20);
                    this.v = 1;
                    if (u0.b0(hVar.X(), "REWARD_SELECTION_CONFIRM_BUTTON", lVar3, this) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 9:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 == 0) {
                    yhm.o.b(obj2);
                    k7c.m0 m0Var = ((o7c.g) this.f220736w).f222757a;
                    this.v = 1;
                    m0Var.f181980a.G(ksj.b.M((u9c.a) obj3), "CASHBACK_ENROLLMENT_CAMPAIGN_IDENTIFIER_KEY", wim.z.d(kotlin.jvm.internal.o0.b(l7c.a.class)));
                    if (Unit.f186387a == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 10:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 == 0) {
                    yhm.o.b(obj2);
                    u9c.b bVar4 = new u9c.b((String) this.f220736w);
                    k7c.m0 m0Var2 = ((o7c.g) obj3).f222757a;
                    this.v = 1;
                    m0Var2.f181980a.G(ksj.b.M(bVar4), "CASHBACK_ENROLLMENT_CAMPAIGN_IDENTIFIER_KEY", wim.z.d(kotlin.jvm.internal.o0.b(l7c.a.class)));
                    if (Unit.f186387a == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 11:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 != 0) {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                String str = (String) ((jf0.c) this.f220736w).d.get("payment_token");
                String str2 = str != null ? str : "";
                k7c.g0 g0Var = ((o7c.k) obj3).f222763a;
                this.v = 1;
                g0Var.getClass();
                k7c.f0 f0Var3 = new k7c.f0(g0Var, str2, objArr3 == true ? 1 : 0, i6);
                p0 p0Var = p0.f264001a;
                Object objJ = skm.e0.J(elm.f.f127540b, f0Var3, this);
                return objJ == aVar13 ? aVar13 : objJ;
            case 12:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 != 0) {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                this.v = 1;
                Object objA = ((o7c.m) this.f220736w).f222768b.a((dj0.d) obj3, this);
                return objA == aVar14 ? aVar14 : objA;
            case 13:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 == 0) {
                    yhm.o.b(obj2);
                    k6e.e eVar = ((o7e.k) this.f220736w).u;
                    k6e.a aVar16 = new k6e.a((k6e.f) obj3);
                    this.v = 1;
                    if (eVar.Z2(aVar16, this) == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 14:
                com.revolut.feature.pix.impl.flow.authorisation_request.screens.request.a aVar17 = (com.revolut.feature.pix.impl.flow.authorisation_request.screens.request.a) this.f220736w;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 == 0) {
                    yhm.o.b(obj2);
                    iuf.y yVar2 = new iuf.y((PixQrCodeDecodeData) obj3, i3);
                    al6.c cVar = new al6.c(29);
                    o9a.u uVar = new o9a.u(aVar17, objArr4 == true ? 1 : 0, i5);
                    this.v = 1;
                    objP = n14.k.P(aVar17.X(), null, cVar, yVar2, uVar, this);
                    if (objP == aVar18) {
                        return aVar18;
                    }
                } else {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objP = obj2;
                }
                nii.e eVar2 = (nii.e) objP;
                if (eVar2 instanceof nii.d) {
                    aVar17.C2(o9a.l.f223159a);
                } else {
                    if (!(eVar2 instanceof nii.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i104 = jli.h.f175850a;
                }
                return Unit.f186387a;
            case 15:
                com.revolut.feature.pix.impl.flow.authorisation_request.screens.request.a aVar19 = (com.revolut.feature.pix.impl.flow.authorisation_request.screens.request.a) this.f220736w;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 == 0) {
                    yhm.o.b(obj2);
                    ku1.v vVar2 = new ku1.v(i2);
                    o9a.v vVar3 = new o9a.v(i5);
                    o9a.b0 b0Var = new o9a.b0(aVar19, (g8a.a) obj3, objArr5 == true ? 1 : 0, i5);
                    this.v = 1;
                    objP2 = n14.k.P(aVar19.X(), null, vVar3, vVar2, b0Var, this);
                    if (objP2 == aVar20) {
                        return aVar20;
                    }
                } else {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objP2 = obj2;
                }
                nii.e eVar3 = (nii.e) objP2;
                if (eVar3 instanceof nii.d) {
                    aVar19.C2(o9a.m.f223160a);
                } else {
                    if (!(eVar3 instanceof nii.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i106 = jli.h.f175850a;
                }
                return Unit.f186387a;
            case 16:
                com.revolut.feature.revolutpay.impl.ui.summary_screen.f fVar = (com.revolut.feature.revolutpay.impl.ui.summary_screen.f) this.f220736w;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 == 0) {
                    yhm.o.b(obj2);
                    efm.d0 d0VarC = ((gi5.d) fVar.K).c(((RampOrderDetails) obj3).f84410a.f115083b);
                    this.v = 1;
                    objB = nim.a.b(d0VarC, this);
                    if (objB == aVar21) {
                        return aVar21;
                    }
                } else {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objB = obj2;
                }
                fVar.H2(fVar.M, new bke.o((sh5.c) objB, i2));
                return Unit.f186387a;
            case 17:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 != 0) {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                agf.b bVar5 = ((o9k.y) this.f220736w).f223378a;
                String strA = com.revolut.domain.models.transfers.a.a((PeerToPeerTransferDescriptor) obj3);
                this.v = 1;
                Object objC = ((cgf.b) bVar5).c(strA, this);
                return objC == aVar22 ? aVar22 : objC;
            case 18:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 == 0) {
                    yhm.o.b(obj2);
                    ob3.f fVar2 = (ob3.f) this.f220736w;
                    this.v = 1;
                    Object objEmit = fVar2.f223871a.emit(new db3.a((String) obj3), this);
                    if (objEmit != aVar23) {
                        objEmit = Unit.f186387a;
                    }
                    if (objEmit == aVar23) {
                        return aVar23;
                    }
                } else {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 19:
                com.revolut.feature.onboarding.impl.onboarding.plan_selection.a aVar24 = (com.revolut.feature.onboarding.impl.onboarding.plan_selection.a) obj3;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    objI22 = com.revolut.feature.onboarding.impl.onboarding.plan_selection.a.I2(aVar24, this);
                    if (objI22 == aVar25) {
                        return aVar25;
                    }
                } else {
                    if (i110 != 1) {
                        if (i110 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar24 = (com.revolut.feature.onboarding.impl.onboarding.plan_selection.a) this.f220736w;
                        yhm.o.b(obj2);
                        objK2 = obj2;
                        return aVar24.C1((aii.u) objK2);
                    }
                    yhm.o.b(obj2);
                    objI22 = obj2;
                }
                hha.d dVar2 = (hha.d) objI22;
                if (dVar2 == null) {
                    throw new IllegalStateException("Unable to find default plan");
                }
                this.f220736w = aVar24;
                this.v = 2;
                objK2 = com.revolut.feature.onboarding.impl.onboarding.plan_selection.a.K2(aVar24, dVar2, null, null, false, this);
                if (objK2 == aVar25) {
                    return aVar25;
                }
                return aVar24.C1((aii.u) objK2);
            case 20:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.onboarding.impl.qes_terms.h hVar2 = (com.revolut.feature.onboarding.impl.qes_terms.h) this.f220736w;
                    com.revolut.feature.onboarding.impl.qes_terms.g gVar = new com.revolut.feature.onboarding.impl.qes_terms.g(hVar2, (ArrayList) obj3, null);
                    this.v = 1;
                    if (hVar2.p2(this, gVar) == aVar26) {
                        return aVar26;
                    }
                } else {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 21:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.onboarding.impl.qes_terms.h hVar3 = (com.revolut.feature.onboarding.impl.qes_terms.h) this.f220736w;
                    ESignatureDetails eSignatureDetails = ((kc9.f) ((kc9.g) obj3)).f182673a;
                    this.v = 1;
                    if (hVar3.O2(eSignatureDetails, this) == aVar27) {
                        return aVar27;
                    }
                } else {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 22:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                if (i113 == 0) {
                    yhm.o.b(obj2);
                    Object obj4 = ((ty0.a) obj3).d;
                    if (!(obj4 instanceof k89.a)) {
                        return Unit.f186387a;
                    }
                    oc9.b0 b0Var2 = (oc9.b0) this.f220736w;
                    this.v = 1;
                    Object objP22 = b0Var2.p2(this, new nk9.l(b0Var2, (k89.a) obj4, objArr6 == true ? 1 : 0, 22));
                    if (objP22 != aVar28) {
                        objP22 = Unit.f186387a;
                    }
                    if (objP22 == aVar28) {
                        return aVar28;
                    }
                } else {
                    if (i113 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 23:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                int i114 = this.v;
                if (i114 != 0) {
                    if (i114 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                oc9.b0 b0Var3 = (oc9.b0) this.f220736w;
                nk9.l lVar4 = new nk9.l(b0Var3, (TermsScope) obj3, objArr7 == true ? 1 : 0, 23);
                this.v = 1;
                Object objP23 = b0Var3.p2(this, lVar4);
                return objP23 == aVar29 ? aVar29 : objP23;
            case 24:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                int i115 = this.v;
                if (i115 == 0) {
                    yhm.o.b(obj2);
                    ocg.r rVar = (ocg.r) this.f220736w;
                    String str3 = ((HotelsProperty) obj3).f97981a;
                    this.v = 1;
                    if (pu7.a.B(rVar.k, str3, new com.revolut.feature.travel.hotels.impl.ui_kompot.screen.favoritesV2.c(rVar, str3, null), this) == aVar30) {
                        return aVar30;
                    }
                } else {
                    if (i115 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 25:
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                int i116 = this.v;
                if (i116 != 0) {
                    if (i116 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                s0 s0Var = (s0) this.f220736w;
                od3.k0 k0Var = new od3.k0(s0Var, (String) obj3, objArr8 == true ? 1 : 0, i6);
                this.v = 1;
                Object objP24 = s0Var.p2(this, k0Var);
                return objP24 == aVar31 ? aVar31 : objP24;
            case 26:
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                int i117 = this.v;
                if (i117 == 0) {
                    yhm.o.b(obj2);
                    ReauthService reauthService = (ReauthService) ((kye.e) this.f220736w).f190729b;
                    ndb.c cVar2 = new ndb.c(((jdb.a) obj3).a());
                    this.v = 1;
                    if (reauthService.reAuth(cVar2, this) == aVar32) {
                        return aVar32;
                    }
                } else {
                    if (i117 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 27:
                Object dVar3 = fim.a.COROUTINE_SUSPENDED;
                int i118 = this.v;
                if (i118 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    objFetchInstitutionInfo = ((of6.e) this.f220736w).f224745a.fetchInstitutionInfo((String) obj3, this);
                    if (objFetchInstitutionInfo != dVar3) {
                    }
                    return dVar3;
                }
                if (i118 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                objFetchInstitutionInfo = obj2;
                pf6.i iVar = (pf6.i) objFetchInstitutionInfo;
                Intrinsics.checkNotNullParameter(iVar, "<this>");
                String str4 = iVar.f235481a;
                String str5 = iVar.f235482b;
                pf6.h hVar4 = iVar.f235483c;
                dVar3 = new qg6.d(str4, str5, hVar4 != null ? new qg6.c(hVar4.f235479a, hVar4.f235480b) : null, iVar.d);
                return dVar3;
            case 28:
                ProductAccountDescriptor$Value productAccountDescriptor$Value = (ProductAccountDescriptor$Value) this.f220736w;
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                int i119 = this.v;
                if (i119 == 0) {
                    yhm.o.b(obj2);
                    zge.a aVar34 = ((oge.f) obj3).f225133m;
                    oge.a aVarK = oi0.d.K(productAccountDescriptor$Value);
                    this.f220736w = null;
                    this.v = 1;
                    if (aVar34.d(aVarK, this) == aVar33) {
                        return aVar33;
                    }
                } else {
                    if (i119 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                int i120 = this.v;
                if (i120 != 0) {
                    if (i120 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                oh4.l lVar5 = (oh4.l) this.f220736w;
                nk9.l lVar6 = new nk9.l(lVar5, (i1) obj3, objArr9 == true ? 1 : 0, 25);
                this.v = 1;
                Object objP25 = lVar5.p2(this, lVar6);
                return objP25 == aVar35 ? aVar35 : objP25;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f220737x = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(ty0.a aVar, oc9.b0 b0Var, Continuation continuation) {
        super(2, continuation);
        this.u = 22;
        this.f220737x = aVar;
        this.f220736w = b0Var;
    }
}
