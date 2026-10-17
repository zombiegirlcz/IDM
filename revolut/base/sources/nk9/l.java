package nk9;

import aii.u;
import android.util.Patterns;
import android.webkit.URLUtil;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary;
import com.revolut.feature.freelancer.common.models.acquiring_order.AcquiringOrderPayment;
import com.revolut.feature.location.api.domain.models.location.LocationDomain;
import com.revolut.feature.referrals.common.data.api.domain.model.common.ReferralCampaignV4;
import com.revolut.feature.store.core.api.model.StoreProductStatusResponse;
import com.revolut.feature.terms.api.model.TermsScope;
import com.revolut.feature.wealth.api.navigation.models.DepositInfo;
import com.revolut.feature.wealth.models.addmoney.TransferSubjectId;
import com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.retail.core.navigation.BrowserCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.api.AnalyticsAccountsSelection;
import com.revolut.retail.trading.core.domain.orders.TradingOrderExitStrategies;
import com.revolut.sso.api.models.PushEvidence;
import efm.d0;
import hs3.b1;
import hs3.i1;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import jkl.m2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nnd.i0;
import nr6.a0;
import o23.w;
import o3b.n0;
import oc9.b0;
import om4.y3;
import pti.t;
import rnd.y;
import skm.e0;
import skm.p0;
import vkm.j2;
import wli.x;
import y5b.c0;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class l extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f216765w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f216766x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i, Continuation continuation, yji.l lVar) {
        super(1, continuation);
        this.u = i;
        this.f216766x = lVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new l(0, continuation, (o) this.f216766x);
            case 1:
                return new l((nm6.j) this.f216765w, (String) this.f216766x, continuation, 1);
            case 2:
                return new l((com.revolut.feature.tab.lifestyle.impl.ui.screen.f) this.f216765w, (String) this.f216766x, continuation, 2);
            case 3:
                return new l((com.revolut.feature.contacts_chooser.impl.ui.a) this.f216765w, (List) this.f216766x, continuation, 3);
            case 4:
                return new l((com.revolut.feature.contacts_chooser.impl.ui.a) this.f216765w, (ty0.a) this.f216766x, continuation, 4);
            case 5:
                return new l((i0) this.f216765w, (AnalyticsAccountsSelection) this.f216766x, continuation, 5);
            case 6:
                return new l((nnf.l) this.f216765w, (String) this.f216766x, continuation, 6);
            case 7:
                return new l((com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.legacy.b) this.f216765w, (String) this.f216766x, continuation, 7);
            case 8:
                return new l((nv7.l) this.f216765w, (String) this.f216766x, continuation, 8);
            case 9:
                return new l(9, continuation, (com.revolut.feature.rev_points.exclusive_store.impl.ui.flow.root.a) this.f216766x);
            case 10:
                return new l((nw3.d) this.f216765w, (String) this.f216766x, continuation, 10);
            case 11:
                return new l((nwf.e) this.f216765w, (nwf.l) this.f216766x, continuation, 11);
            case 12:
                return new l((ny4.k) this.f216765w, (String) this.f216766x, continuation, 12);
            case 13:
                return new l((com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home.d) this.f216765w, (ReferralCampaignV4) this.f216766x, continuation, 13);
            case 14:
                return new l((ty0.a) this.f216765w, (com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home.d) this.f216766x, continuation, 14);
            case 15:
                return new l((nzh.c) this.f216765w, (CryptoOrderDraft) this.f216766x, continuation, 15);
            case 16:
                return new l(16, continuation, (com.revolut.feature.card_order_new.impl.kompot.screen.address_form.b) this.f216766x);
            case 17:
                return new l((com.revolut.feature.freelancer.impl.ui.sales.refund.screen.b) this.f216765w, (AcquiringOrderPayment) this.f216766x, continuation, 17);
            case 18:
                return new l((n0) this.f216765w, (TradingOrderExitStrategies) this.f216766x, continuation, 18);
            case 19:
                return new l((o65.o) this.f216765w, (String) this.f216766x, continuation, 19);
            case 20:
                return new l((o7b.h) this.f216765w, (String) this.f216766x, continuation, 20);
            case 21:
                return new l((com.revolut.feature.wealth.impl.ui.flows.dual_add_money.a) this.f216765w, (DepositInfo) this.f216766x, continuation, 21);
            case 22:
                return new l((b0) this.f216765w, (k89.a) this.f216766x, continuation, 22);
            case 23:
                return new l((b0) this.f216765w, (TermsScope) this.f216766x, continuation, 23);
            case 24:
                return new l((og2.m) this.f216765w, (ApmPaymentAuthorisationSummary) this.f216766x, continuation, 24);
            case 25:
                return new l((oh4.l) this.f216765w, (i1) this.f216766x, continuation, 25);
            case 26:
                return new l((com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_switch.a) this.f216765w, (String) this.f216766x, continuation, 26);
            case 27:
                return new l((com.revolut.sso.impl.ui.auth.n) this.f216765w, (vnl.d) this.f216766x, continuation, 27);
            case 28:
                return new l((com.revolut.sso.impl.ui.auth.n) this.f216765w, (vnl.k) this.f216766x, continuation, 28);
            default:
                return new l((com.revolut.sso.impl.ui.auth.n) this.f216765w, (String) this.f216766x, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((l) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Enum] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objD;
        o oVar;
        Object objW;
        Object objI2;
        com.revolut.feature.rev_points.exclusive_store.impl.ui.flow.root.a aVar;
        Object obj3;
        Object objA;
        Object objI22;
        Address address;
        Object objB;
        cjl.m mVarA;
        String str;
        Pair pairA;
        int i = this.u;
        serializableA = null;
        serializableA = null;
        Serializable serializableA = null;
        Object obj4 = this.f216766x;
        int i2 = 1;
        switch (i) {
            case 0:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    o oVar2 = (o) obj4;
                    qi9.d dVar = oVar2.f216771s;
                    this.f216765w = oVar2;
                    this.v = 1;
                    objD = dVar.d(this);
                    if (objD == aVar2) {
                        return aVar2;
                    }
                    oVar = oVar2;
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oVar = (o) this.f216765w;
                    yhm.o.b(obj2);
                    objD = obj2;
                }
                return oVar.C1((u) objD);
            case 1:
                nm6.j jVar = (nm6.j) this.f216765w;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    f61.a aVar4 = jVar.f217192q;
                    nm6.f fVar = jVar.o;
                    Boolean bool = fVar.f217186b;
                    this.v = 1;
                    objW = aVar4.w(fVar.f217185a, (String) obj4, bool, null, this);
                    if (objW == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objW = obj2;
                }
                jVar.C2(new nm6.g((String) objW, (String) obj4));
                return Unit.f186387a;
            case 2:
                String deeplink = (String) obj4;
                com.revolut.feature.tab.lifestyle.impl.ui.screen.f fVar2 = (com.revolut.feature.tab.lifestyle.impl.ui.screen.f) this.f216765w;
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
                fVar2.f89953y.getClass();
                Intrinsics.checkNotNullParameter(deeplink, "url");
                if (!URLUtil.isHttpsUrl(deeplink) || !Patterns.WEB_URL.matcher(deeplink).matches()) {
                    d0 d0VarC = ((s06.j) fVar2.f89949s).c(deeplink, false, lg0.a.IGNORE);
                    this.v = 1;
                    Object objB2 = nim.a.b(d0VarC, this);
                    return objB2 == aVar5 ? aVar5 : objB2;
                }
                pme.b bVar = (pme.b) fVar2.K;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                bVar.A2(u0.b(new BrowserCommand(((f80.b) bVar.f237551l).f(deeplink))));
                return Unit.f186387a;
            case 3:
                com.revolut.feature.contacts_chooser.impl.ui.a aVar6 = (com.revolut.feature.contacts_chooser.impl.ui.a) this.f216765w;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    nb6.p pVar = new nb6.p(1, aVar6, com.revolut.feature.contacts_chooser.impl.ui.a.class, "postResult", "postResult(Lcom/revolut/kompot/common/IOData$Output;)V", 0, 13);
                    this.v = 1;
                    if (aVar6.v.Z2((List) obj4, pVar, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 != 0) {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                x xVar = ((com.revolut.feature.contacts_chooser.impl.ui.a) this.f216765w).f66093w;
                String str2 = ((ty0.a) obj4).f275445a;
                this.v = 1;
                Object objX1 = lg0.b.x1(xVar, str2, null, null, this, 6);
                return objX1 == aVar8 ? aVar8 : objX1;
            case 5:
                i0 i0Var = (i0) this.f216765w;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    yhm.o.b(obj2);
                    rnd.j jVar2 = i0Var.f217553p;
                    this.v = 1;
                    if (((y) jVar2).f((AnalyticsAccountsSelection) obj4) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                j2 j2Var = i0Var.f217555r.d;
                od0.i.Companion.getClass();
                j2Var.getClass();
                j2Var.g(null, od0.i.f224256b);
                i0Var.B2();
                return Unit.f186387a;
            case 6:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    yhm.o.b(obj2);
                    pfm.r rVarA = ((nnf.l) this.f216765w).f217625r.a((String) obj4);
                    this.v = 1;
                    if (nim.a.a(rVarA, this) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 7:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    zsi.e eVar = ((com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.legacy.b) this.f216765w).f98860p;
                    this.v = 1;
                    pti.u uVar = ((mti.g) eVar).f208853a;
                    uVar.getClass();
                    t tVar = new t(uVar, (String) obj4, , i2);
                    p0 p0Var = p0.f264001a;
                    Object objJ = e0.J(elm.f.f127540b, tVar, this);
                    Object obj5 = objJ;
                    if (objJ != aVar11) {
                        obj5 = Unit.f186387a;
                    }
                    if (obj5 != aVar11) {
                        obj5 = Unit.f186387a;
                    }
                    if (obj5 == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 8:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 != 0) {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                lg0.a aVar13 = lg0.a.OPEN_BROWSER;
                this.v = 1;
                Object objX12 = lg0.b.x1(((nv7.l) this.f216765w).f219554q, (String) obj4, aVar13, null, this, 4);
                return objX12 == aVar12 ? aVar12 : objX12;
            case 9:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.rev_points.exclusive_store.impl.ui.flow.root.a aVar15 = (com.revolut.feature.rev_points.exclusive_store.impl.ui.flow.root.a) obj4;
                    this.f216765w = aVar15;
                    this.v = 1;
                    objI2 = com.revolut.feature.rev_points.exclusive_store.impl.ui.flow.root.a.I2(aVar15, this);
                    if (objI2 == aVar14) {
                        return aVar14;
                    }
                    aVar = aVar15;
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (com.revolut.feature.rev_points.exclusive_store.impl.ui.flow.root.a) this.f216765w;
                    yhm.o.b(obj2);
                    objI2 = obj2;
                }
                StoreProductStatusResponse storeProductStatusResponse = (StoreProductStatusResponse) objI2;
                aVar.getClass();
                 = storeProductStatusResponse != null ? storeProductStatusResponse.f88642b : 0;
                int i74 =  == 0 ? -1 : nvb.f.f219577a[ordinal()];
                if (i74 == -1) {
                    aVar.L2(false, storeProductStatusResponse);
                } else if (i74 == 1 || i74 == 2) {
                    aVar.M2(nvb.c.SOLD_OUT, storeProductStatusResponse);
                } else if (i74 != 3) {
                    if (i74 != 4 && i74 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar.L2(false, storeProductStatusResponse);
                } else {
                    aVar.L2(true, storeProductStatusResponse);
                }
                return Unit.f186387a;
            case 10:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    yhm.o.b(obj2);
                    al4.q qVar = ((nw3.d) this.f216765w).f219762b;
                    this.v = 1;
                    Object objJ2 = ((y3) qVar).j((String) obj4, this);
                    if (objJ2 == aVar16) {
                        return aVar16;
                    }
                    obj3 = objJ2;
                } else {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    obj3 = ((yhm.m) obj2).f314193a;
                }
                return new yhm.m(obj3);
            case 11:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 == 0) {
                    yhm.o.b(obj2);
                    nwf.e eVar2 = (nwf.e) this.f216765w;
                    LocationDomain locationDomain = eVar2.f219861b;
                    ouf.a aVar18 = ((nwf.l) obj4).f219870p;
                    String str3 = eVar2.f219860a;
                    Double d = locationDomain != null ? new Double(locationDomain.f78066a) : null;
                    Double d5 = locationDomain != null ? new Double(locationDomain.f78067b) : null;
                    this.v = 1;
                    objA = ((ivf.r) aVar18).a(str3, d, d5, this);
                    if (objA == aVar17) {
                        return aVar17;
                    }
                } else {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objA = obj2;
                }
                return new nwf.f((List) objA);
            case 12:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 != 0) {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                d0 d0VarS1 = lg0.b.s1(((ny4.k) this.f216765w).f220664q, (String) obj4, null, null, 6);
                this.v = 1;
                Object objB3 = nim.a.b(d0VarS1, this);
                return objB3 == aVar19 ? aVar19 : objB3;
            case 13:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 != 0) {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                jxa.h hVar = ((com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home.d) this.f216765w).A;
                this.v = 1;
                hVar.getClass();
                zxa.a aVar21 = new zxa.a(((ReferralCampaignV4) obj4).f81763r);
                return aVar21 == aVar20 ? aVar20 : aVar21;
            case 14:
                ty0.a aVar22 = (ty0.a) this.f216765w;
                com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home.d dVar2 = (com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home.d) obj4;
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 != 0) {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                String str4 = aVar22.f275445a;
                if (Intrinsics.f(str4, "TERMS_CLICK_ITEM_ID")) {
                    Object obj6 = aVar22.d;
                    Intrinsics.i(obj6, "null cannot be cast to non-null type kotlin.String");
                    dVar2.C1(new ExternalDestination.Browser((String) obj6, null));
                    return Unit.f186387a;
                }
                if (!dVar2.f81863y.y1(str4)) {
                    dVar2.C1(new ExternalDestination.Browser(str4, null));
                    return Unit.f186387a;
                }
                x xVar2 = dVar2.f81863y;
                this.v = 1;
                Object objX13 = lg0.b.x1(xVar2, str4, null, null, this, 6);
                return objX13 == aVar23 ? aVar23 : objX13;
            case 15:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 != 0) {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                this.v = 1;
                Object objB32 = ((nzh.c) this.f216765w).b3((CryptoOrderDraft) obj4, this);
                return objB32 == aVar24 ? aVar24 : objB32;
            case 16:
                com.revolut.feature.card_order_new.impl.kompot.screen.address_form.b bVar2 = (com.revolut.feature.card_order_new.impl.kompot.screen.address_form.b) obj4;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 == 0) {
                    yhm.o.b(obj2);
                    Address addressK2 = bVar2.K2();
                    this.f216765w = addressK2;
                    this.v = 1;
                    objI22 = com.revolut.feature.card_order_new.impl.kompot.screen.address_form.b.I2(bVar2, addressK2, this);
                    if (objI22 == aVar25) {
                        return aVar25;
                    }
                    address = addressK2;
                } else {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    address = (Address) this.f216765w;
                    yhm.o.b(obj2);
                    objI22 = obj2;
                }
                if (!((Boolean) objI22).booleanValue()) {
                    bVar2.C2(new o23.x(address, ((w) ((j2) bVar2.D.f22677a).getValue()).f221469j, null, 16));
                }
                return Unit.f186387a;
            case 17:
                AcquiringOrderPayment acquiringOrderPayment = (AcquiringOrderPayment) obj4;
                com.revolut.feature.freelancer.impl.ui.sales.refund.screen.b bVar3 = (com.revolut.feature.freelancer.impl.ui.sales.refund.screen.b) this.f216765w;
                wj0.a aVar26 = bVar3.v;
                cli.y yVar = bVar3.z;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 == 0) {
                    yhm.o.b(obj2);
                    dj0.d dVar3 = ((o27.l) ((j2) yVar.f22677a).getValue()).f221516a;
                    String str5 = ((o27.l) ((j2) yVar.f22677a).getValue()).f221519g;
                    a0 a0Var = new a0(dVar3, str5.length() != 0 ? str5 : null, acquiringOrderPayment);
                    if (!a0Var.equals(((o27.l) ((j2) yVar.f22677a).getValue()).i)) {
                        aVar26.a("REFUND_IDEMPOTENCY_KEY_TAG");
                        bVar3.H2(yVar, new nya.b0(a0Var, 22));
                    }
                    b9k.f fVar3 = bVar3.o;
                    String str6 = acquiringOrderPayment.f73357c;
                    String strB = aVar26.b("REFUND_IDEMPOTENCY_KEY_TAG");
                    if (strB == null) {
                        throw new NullPointerException("Idempotency key most not be null.");
                    }
                    this.v = 1;
                    if (fVar3.B(str6, strB, a0Var, this) == aVar27) {
                        return aVar27;
                    }
                } else {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 18:
                TradingOrderExitStrategies tradingOrderExitStrategies = (TradingOrderExitStrategies) obj4;
                n0 n0Var = (n0) this.f216765w;
                o3b.y yVar2 = n0Var.v;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 == 0) {
                    yhm.o.b(obj2);
                    if (Intrinsics.f(yVar2.f221781g, tradingOrderExitStrategies.f104659a) && Intrinsics.f(yVar2.f221782h, tradingOrderExitStrategies.f104660b)) {
                        n0Var.C2(o3b.a0.f221714a);
                    } else {
                        r2b.a aVar29 = (r2b.a) yVar2.f;
                        this.v = 1;
                        if (n0.I2(n0Var, aVar29, tradingOrderExitStrategies, this) == aVar28) {
                            return aVar28;
                        }
                    }
                } else {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 19:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 != 0) {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                this.v = 1;
                Object objZ2 = o65.o.Z2((o65.o) this.f216765w, (String) obj4, this);
                return objZ2 == aVar30 ? aVar30 : objZ2;
            case 20:
                o7b.h hVar2 = (o7b.h) this.f216765w;
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 == 0) {
                    yhm.o.b(obj2);
                    q5b.b bVar4 = hVar2.f222744p;
                    this.v = 1;
                    c0 c0Var = ((c6b.i) bVar4).f21763a;
                    c0Var.getClass();
                    xge.f fVar4 = new xge.f(c0Var, hVar2.o.f82603a, (String) obj4, null, 28);
                    p0 p0Var2 = p0.f264001a;
                    Object objJ3 = e0.J(elm.f.f127540b, fVar4, this);
                    Object obj7 = objJ3;
                    if (objJ3 != aVar31) {
                        obj7 = Unit.f186387a;
                    }
                    if (obj7 != aVar31) {
                        obj7 = Unit.f186387a;
                    }
                    if (obj7 == aVar31) {
                        return aVar31;
                    }
                } else {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                hVar2.C2(o7b.f.f222740a);
                return Unit.f186387a;
            case 21:
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 != 0) {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.wealth.impl.ui.flows.dual_add_money.a aVar33 = (com.revolut.feature.wealth.impl.ui.flows.dual_add_money.a) this.f216765w;
                epc.h hVar3 = aVar33.f95558p;
                TransferSubjectId transferSubjectId = aVar33.o.f223636a;
                dj0.d f95321a = ((DepositInfo) obj4).getF95321a();
                this.v = 1;
                hVar3.getClass();
                Object objB4 = hVar3.b(transferSubjectId, new epc.e(hVar3, transferSubjectId, f95321a, null), this);
                return objB4 == aVar32 ? aVar32 : objB4;
            case 22:
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 == 0) {
                    yhm.o.b(obj2);
                    b0 b0Var = (b0) this.f216765w;
                    f9i.c cVar = new f9i.c(new f9i.e(((k89.a) obj4).f182101b, false));
                    this.v = 1;
                    if (b0Var.G1(cVar, this) == aVar34) {
                        return aVar34;
                    }
                } else {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 23:
                b0 b0Var2 = (b0) this.f216765w;
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 == 0) {
                    yhm.o.b(obj2);
                    ufm.i iVarC = ((rre.d) b0Var2.f224133p).c((TermsScope) obj4, null);
                    this.v = 1;
                    objB = nim.a.b(iVarC, this);
                    if (objB == aVar35) {
                        return aVar35;
                    }
                } else {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objB = obj2;
                }
                NaviCommand naviCommand = (NaviCommand) objB;
                Intrinsics.h(naviCommand);
                return b0Var2.C1(new BridgeDestination(naviCommand));
            case 24:
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 == 0) {
                    yhm.o.b(obj2);
                    kgm.i iVar = ((og2.m) this.f216765w).o;
                    String str7 = ((ApmPaymentAuthorisationSummary) obj4).f61992a;
                    this.v = 1;
                    if (iVar.b(str7, this) == aVar36) {
                        return aVar36;
                    }
                } else {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 25:
                oh4.l lVar = (oh4.l) this.f216765w;
                fim.a aVar37 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    Object objA2 = lVar.o.a(lVar.f225298r.f68301c.f66892b, this);
                    if (objA2 != aVar37) {
                        objA2 = Unit.f186387a;
                    }
                    if (objA2 != aVar37) {
                    }
                    return aVar37;
                }
                if (i112 != 1) {
                    if (i112 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                pw5.a.x(lVar.f225297q);
                x xVar3 = lVar.f225301w;
                String str8 = ((b1) ((i1) obj4)).f154869a;
                this.v = 2;
                Object objX14 = lg0.b.x1(xVar3, str8, null, null, this, 6);
                if (objX14 != aVar37) {
                    return objX14;
                }
                return aVar37;
            case 26:
                fim.a aVar38 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                if (i113 != 0) {
                    if (i113 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                lg0.a aVar39 = lg0.a.OPEN_BROWSER;
                this.v = 1;
                Object objX15 = lg0.b.x1(((com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_switch.a) this.f216765w).f103246r, (String) obj4, aVar39, null, this, 4);
                return objX15 == aVar38 ? aVar38 : objX15;
            case 27:
                fim.a aVar40 = fim.a.COROUTINE_SUSPENDED;
                int i114 = this.v;
                if (i114 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.sso.impl.ui.auth.n nVar = (com.revolut.sso.impl.ui.auth.n) this.f216765w;
                    String secret = ((vnl.a) ((vnl.d) obj4)).f290819a;
                    Intrinsics.checkNotNullParameter(secret, "secret");
                    PushEvidence pushEvidence = new PushEvidence(secret);
                    this.v = 1;
                    if (com.revolut.sso.impl.ui.auth.n.Q2(nVar, null, pushEvidence, null, this, 5) == aVar40) {
                        return aVar40;
                    }
                } else {
                    if (i114 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 28:
                fim.a aVar41 = fim.a.COROUTINE_SUSPENDED;
                int i115 = this.v;
                if (i115 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.sso.impl.ui.auth.n nVar2 = (com.revolut.sso.impl.ui.auth.n) this.f216765w;
                    String secret2 = ((vnl.i) ((vnl.k) obj4)).f290825a;
                    Intrinsics.checkNotNullParameter(secret2, "secret");
                    PushEvidence pushEvidence2 = new PushEvidence(secret2);
                    this.v = 1;
                    if (com.revolut.sso.impl.ui.auth.n.Q2(nVar2, null, pushEvidence2, null, this, 5) == aVar41) {
                        return aVar41;
                    }
                } else {
                    if (i115 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                com.revolut.sso.impl.ui.auth.n nVar3 = (com.revolut.sso.impl.ui.auth.n) this.f216765w;
                fim.a aVar42 = fim.a.COROUTINE_SUSPENDED;
                int i116 = this.v;
                if (i116 != 0) {
                    if (i116 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                lkl.a aVar43 = nVar3.J;
                String jwt = (String) obj4;
                aVar43.getClass();
                Intrinsics.checkNotNullParameter(jwt, "jwt");
                try {
                    pairA = aVar43.a(jwt);
                } catch (Throwable th10) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "OperationStateParserImpl", null, th10, h0Var);
                }
                if (pairA != null) {
                    Object objC = aVar43.f196477a.c((String) pairA.f186386b, m2.class);
                    Intrinsics.checkNotNullExpressionValue(objC, "fromJson(...)");
                    mVarA = c8g.a.A((m2) objC);
                    break;
                } else {
                    mVarA = null;
                }
                bjl.p0 p0Var3 = nVar3.S;
                this.v = 1;
                rqk.k kVar = (rqk.k) p0Var3;
                kVar.getClass();
                Map map = mVarA != null ? mVarA.f24716b : null;
                if (map != null && (str = (String) map.get("context")) != null && str.equals("credit")) {
                    serializableA = kVar.d.a(map, this);
                }
                return serializableA == aVar42 ? aVar42 : serializableA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Object obj2, Object obj3, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f216765w = obj2;
        this.f216766x = obj3;
    }
}
