package bv4;

import a3i.q;
import android.os.Parcelable;
import android.webkit.CookieManager;
import b94.s;
import bvb.r;
import c42.l;
import c64.b0;
import c7i.l0;
import cbh.m;
import ccf.t;
import cg9.n;
import cli.y;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.swish.impl.data.network.SwishService;
import com.revolut.feature.retail.salary_account.impl.switch_assistant.data.SalarySwitchAssistantService;
import com.revolut.feature.wealth.impl.ui.invest.transactions.list.screen.InvestTransactionsListScreen;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import cpb.k;
import cv3.u;
import efm.d0;
import ffk.a0;
import ffk.c0;
import ft3.h1;
import java.io.Serializable;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.y0;
import r10.w;
import retrofit2.HttpException;
import skm.e0;
import skm.k0;
import skm.p0;
import vkm.j2;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes22.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f18964w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f18964w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h((i) this.f18964w, continuation, 0);
            case 1:
                return new h((r) this.f18964w, continuation, 1);
            case 2:
                return new h((com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_details.b) this.f18964w, continuation, 2);
            case 3:
                return new h((bz9.e) this.f18964w, continuation, 3);
            case 4:
                return new h((c07.e) this.f18964w, continuation, 4);
            case 5:
                return new h((com.revolut.retail.feature.trading_onboarding.impl.ui.national_identifiers.kompot.flow.b) this.f18964w, continuation, 5);
            case 6:
                return new h((com.revolut.retail.feature.travel_status.impl.ui.flow.b) this.f18964w, continuation, 6);
            case 7:
                return new h((l) this.f18964w, continuation, 7);
            case 8:
                return new h((com.revolut.feature.defi.exchange.impl.ui.exchange_summary.a) this.f18964w, continuation, 8);
            case 9:
                return new h((b0) this.f18964w, continuation, 9);
            case 10:
                return new h((com.revolut.feature_move_money.impl.automation.screen.c) this.f18964w, continuation, 10);
            case 11:
                return new h((c7k.j) this.f18964w, continuation, 11);
            case 12:
                return new h((cam.b) this.f18964w, continuation, 12);
            case 13:
                return new h((InvestTransactionsListScreen) this.f18964w, continuation, 13);
            case 14:
                return new h((cc3.j) this.f18964w, continuation, 14);
            case 15:
                return new h((cc7.h) this.f18964w, continuation, 15);
            case 16:
                return new h((t) this.f18964w, continuation, 16);
            case 17:
                return new h((ce2.a) this.f18964w, continuation, 17);
            case 18:
                return new h((cfc.b) this.f18964w, continuation, 18);
            case 19:
                return new h((n) this.f18964w, continuation, 19);
            case 20:
                return new h((com.revolut.feature.add_card_to_google_pay_shared.impl.verification.otp.location_mismatch.b) this.f18964w, continuation, 20);
            case 21:
                return new h((w) this.f18964w, continuation, 21);
            case 22:
                return new h((com.revolut.retail.feature.pricing_plans.ui.impl.flows.hide_student.a) this.f18964w, continuation, 22);
            case 23:
                return new h((clk.c) this.f18964w, continuation, 23);
            case 24:
                return new h((cm6.i) this.f18964w, continuation, 24);
            case 25:
                return new h((com.revolut.feature.pay_with_smile.impl.ui.settings.a) this.f18964w, continuation, 25);
            case 26:
                return new h((com.revolut.feature.profile.impl.ui.details.name.flow.b) this.f18964w, continuation, 26);
            case 27:
                return new h((cng.b) this.f18964w, continuation, 27);
            case 28:
                return new h((x64.c) this.f18964w, continuation, 28);
            default:
                return new h((k) this.f18964w, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((h) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objB;
        String str;
        Object limits;
        Object objA;
        ghb.h hVar;
        Object currentRequestStatus;
        Object objZ;
        od0.i iVar;
        Object objJ;
        int i = this.u;
        int i2 = 25;
        int i3 = 0;
        Continuation continuation = null;
        Object obj3 = this.f18964w;
        int i5 = 1;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                i iVar2 = (i) obj3;
                q qVar = new q(iVar2, continuation, 23);
                this.v = 1;
                Object objB2 = pu7.a.B(iVar2.k, "Reload settings", qVar, this);
                return objB2 == aVar ? aVar : objB2;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                r rVar = (r) obj3;
                s sVar = new s(i2, continuation, rVar);
                this.v = 1;
                Object objB3 = pu7.a.B(rVar.k, "TERMS_LOADING_TASK", sVar, this);
                return objB3 == aVar2 ? aVar2 : objB3;
            case 2:
                com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_details.b bVar = (com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_details.b) obj3;
                vii.b bVar2 = bVar.f99129s;
                y yVar = bVar.f99130t;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    o.b(obj2);
                    if (((byi.d) ((j2) yVar.f22677a).getValue()).f19826b) {
                        bVar.H2(yVar, new bxg.t(8));
                        this.v = 1;
                        if (k0.b(DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT, this) == aVar3) {
                            return aVar3;
                        }
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                yji.l.b1(bVar, vkm.q.Q(bVar2, new byi.h(i3, bVar, continuation)), null, new byi.j(i3, bVar, continuation), 3);
                yji.l.b1(bVar, vkm.q.Q(bVar2, new byi.h(i5, bVar, continuation)), null, new byi.j(i5, bVar, continuation), 3);
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    o.b(obj2);
                    bz9.e eVar = (bz9.e) obj3;
                    q qVar2 = new q(eVar, continuation, 24);
                    this.v = 1;
                    if (eVar.Y2(this, qVar2) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 != 0) {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                c07.e eVar2 = (c07.e) obj3;
                q qVar3 = new q(eVar2, continuation, i2);
                this.v = 1;
                Object objB4 = pu7.a.B(eVar2.k, "close_freelancer_account", qVar3, this);
                return objB4 == aVar5 ? aVar5 : objB4;
            case 5:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    o.b(obj2);
                    com.revolut.retail.feature.trading_onboarding.impl.ui.national_identifiers.kompot.flow.b bVar3 = (com.revolut.retail.feature.trading_onboarding.impl.ui.national_identifiers.kompot.flow.b) obj3;
                    com.revolut.retail.feature.trading_onboarding.impl.ui.national_identifiers.kompot.flow.a aVar7 = new com.revolut.retail.feature.trading_onboarding.impl.ui.national_identifiers.kompot.flow.a(bVar3, null);
                    this.v = 1;
                    if (bVar3.p2(this, aVar7) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 6:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    o.b(obj2);
                    com.revolut.retail.feature.travel_status.impl.ui.flow.b bVar4 = (com.revolut.retail.feature.travel_status.impl.ui.flow.b) obj3;
                    com.revolut.retail.feature.travel_status.impl.ui.flow.a aVar9 = new com.revolut.retail.feature.travel_status.impl.ui.flow.a(bVar4, null);
                    this.v = 1;
                    if (bVar4.p2(this, aVar9) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 7:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    o.b(obj2);
                    l lVar = (l) obj3;
                    pfm.r rVarB = lVar.f20990r.b(lVar.f20988p.l1());
                    this.v = 1;
                    if (nim.a.a(rVarB, this) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 8:
                com.revolut.feature.defi.exchange.impl.ui.exchange_summary.a aVar11 = (com.revolut.feature.defi.exchange.impl.ui.exchange_summary.a) obj3;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    o.b(obj2);
                    d0 d0VarC = ((gi5.d) aVar11.f71779s).c(aVar11.o.f71772b.f71763a.f71768a);
                    this.v = 1;
                    objB = nim.a.b(d0VarC, this);
                    if (objB == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objB = obj2;
                }
                aVar11.H2(aVar11.A, new bke.o((sh5.c) objB, i5));
                return Unit.f186387a;
            case 9:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    o.b(obj2);
                    j2 j2Var = ((b0) obj3).f21615y;
                    u.Companion.getClass();
                    u uVarA = cv3.t.a();
                    this.v = 1;
                    j2Var.getClass();
                    j2Var.g(null, uVarA);
                    if (Unit.f186387a == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 10:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 == 0) {
                    o.b(obj2);
                    com.revolut.feature_move_money.impl.automation.screen.c cVar = (com.revolut.feature_move_money.impl.automation.screen.c) obj3;
                    l0 l0Var = new l0(cVar, null);
                    this.v = 1;
                    if (cVar.p2(this, l0Var) == aVar14) {
                        return aVar14;
                    }
                } else {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 11:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 != 0) {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                c7k.j jVar = (c7k.j) obj3;
                c7k.i iVar3 = new c7k.i(jVar, continuation, i5);
                this.v = 1;
                Object objB5 = pu7.a.B(jVar.k, "Rejecting_money_request", iVar3, this);
                return objB5 == aVar15 ? aVar15 : objB5;
            case 12:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 != 0) {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                ((cam.b) obj3).getClass();
                CookieManager cookieManager = CookieManager.getInstance();
                Intrinsics.checkNotNullExpressionValue(cookieManager, "getInstance()");
                this.v = 1;
                eim.c cVar2 = new eim.c(fim.h.b(this));
                cookieManager.removeAllCookies(new cam.a(cVar2));
                Object objB6 = cVar2.b();
                if (objB6 == aVar16) {
                    Intrinsics.checkNotNullParameter(this, "frame");
                }
                return objB6 == aVar16 ? aVar16 : objB6;
            case 13:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    o.b(obj2);
                    m mVarE3 = ((InvestTransactionsListScreen) obj3).e3();
                    this.v = 1;
                    cbh.y yVar2 = (cbh.y) mVarE3;
                    yVar2.getClass();
                    if (pu7.a.B(yVar2.k, "post_back", new a54.g(yVar2, continuation, 9), this) == aVar17) {
                        return aVar17;
                    }
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 14:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 != 0) {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                cc3.j jVar2 = (cc3.j) obj3;
                cc3.i iVar4 = new cc3.i(jVar2, null);
                this.v = 1;
                Object objB0 = u0.b0(jVar2.X(), "DELETE_BUTTON_TAG", iVar4, this);
                return objB0 == aVar18 ? aVar18 : objB0;
            case 15:
                cc7.h hVar2 = (cc7.h) obj3;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 == 0) {
                    o.b(obj2);
                    zb7.g gVar = (zb7.g) ((cc7.e) hVar2.f22950m.f22963b.get()).f22947a.getContent();
                    if (gVar == null || (str = gVar.f320838a) == null) {
                        return Unit.f186387a;
                    }
                    c64.d dVar = new c64.d(hVar2, str, continuation, 5);
                    this.v = 1;
                    if (pu7.a.B(hVar2.e, "close survey", dVar, this) == aVar19) {
                        return aVar19;
                    }
                } else {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 16:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 == 0) {
                    o.b(obj2);
                    t tVar = (t) obj3;
                    brc.t tVar2 = new brc.t(tVar, null);
                    this.v = 1;
                    if (tVar.p2(this, tVar2) == aVar20) {
                        return aVar20;
                    }
                } else {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 17:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 == 0) {
                    o.b(obj2);
                    SwishService swishService = ((ce2.a) obj3).f23342a;
                    this.v = 1;
                    limits = swishService.getLimits(this);
                    if (limits == aVar21) {
                        return aVar21;
                    }
                } else {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    limits = obj2;
                }
                return de2.a.a((ee2.a) limits);
            case 18:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 != 0) {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                ad1.a aVar23 = ((cfc.b) obj3).f23675c;
                this.v = 1;
                Serializable serializableA = ((sfc.e) aVar23).a(this);
                return serializableA == aVar22 ? aVar22 : serializableA;
            case 19:
                n nVar = (n) obj3;
                y yVar3 = nVar.f23883q;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 == 0) {
                    o.b(obj2);
                    wo1.b bVar5 = nVar.o;
                    String str2 = ((cg9.f) ((j2) yVar3.f22677a).getValue()).f23870a;
                    this.v = 1;
                    objA = ((vp1.c) bVar5).a(str2, this);
                    if (objA == aVar24) {
                        return aVar24;
                    }
                } else {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objA = obj2;
                }
                nVar.H2(yVar3, new cbf.i(zi0.c.P(objA, false, null, 3), 17));
                return Unit.f186387a;
            case 20:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 == 0) {
                    o.b(obj2);
                    com.revolut.feature.add_card_to_google_pay_shared.impl.verification.otp.location_mismatch.b bVar6 = (com.revolut.feature.add_card_to_google_pay_shared.impl.verification.otp.location_mismatch.b) obj3;
                    com.revolut.feature.add_card_to_google_pay_shared.impl.verification.otp.location_mismatch.a aVar26 = new com.revolut.feature.add_card_to_google_pay_shared.impl.verification.otp.location_mismatch.a(bVar6, null);
                    this.v = 1;
                    if (bVar6.p2(this, aVar26) == aVar25) {
                        return aVar25;
                    }
                } else {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 21:
                w wVar = (w) obj3;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                try {
                    if (i109 == 0) {
                        o.b(obj2);
                        SalarySwitchAssistantService salarySwitchAssistantService = (SalarySwitchAssistantService) wVar.f250865a;
                        this.v = 1;
                        currentRequestStatus = salarySwitchAssistantService.getCurrentRequestStatus(this);
                        if (currentRequestStatus == aVar27) {
                            return aVar27;
                        }
                    } else {
                        if (i109 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        currentRequestStatus = obj2;
                    }
                    return ((zjh.j) wVar.f250866b).w((fhb.c) currentRequestStatus);
                } catch (CancellationException e) {
                    throw e;
                } catch (HttpException e2) {
                    if (e2.code() == 404) {
                        return ghb.i.f143900a;
                    }
                    hVar = new ghb.h(e2);
                    return hVar;
                } catch (Exception e4) {
                    hVar = new ghb.h(e4);
                    return hVar;
                }
            case 22:
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.hide_student.a aVar28 = (com.revolut.retail.feature.pricing_plans.ui.impl.flows.hide_student.a) obj3;
                Object obj4 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 == 0) {
                    o.b(obj2);
                    cha.c cVar3 = aVar28.o;
                    this.v = 1;
                    c0 c0Var = (c0) cVar3;
                    c0Var.getClass();
                    a0 a0Var = new a0(c0Var, continuation, i3);
                    p0 p0Var = p0.f264001a;
                    Object objJ2 = e0.J(elm.f.f127540b, a0Var, this);
                    if (objJ2 != obj4) {
                        objJ2 = Unit.f186387a;
                    }
                    if (objJ2 == obj4) {
                        return obj4;
                    }
                } else {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                yji.l.a1(aVar28, aVar28.X1(new y0("hide_student_success_dialog", new j0((Clause) new TextLocalisedClause(R$string.student_plans_hide_student_success_title, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094), false, 4)), null, null, new chk.f(aVar28, null), 3);
                return Unit.f186387a;
            case 23:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 == 0) {
                    o.b(obj2);
                    fn2.c cVar4 = ((clk.c) obj3).f25047c;
                    this.v = 1;
                    if (cVar4.l(true, this) == aVar29) {
                        return aVar29;
                    }
                } else {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 24:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 == 0) {
                    o.b(obj2);
                    cm6.i iVar5 = (cm6.i) obj3;
                    cm6.h hVar3 = new cm6.h(iVar5, null);
                    this.v = 1;
                    if (u0.b0(iVar5.X(), "CONTINUE_LOADING_TAG", hVar3, this) == aVar30) {
                        return aVar30;
                    }
                } else {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 25:
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                if (i113 != 0) {
                    if (i113 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.pay_with_smile.impl.ui.settings.a aVar32 = (com.revolut.feature.pay_with_smile.impl.ui.settings.a) obj3;
                cm9.l lVar2 = new cm9.l(aVar32, continuation, i5);
                this.v = 1;
                Object objB7 = pu7.a.B(aVar32.k, "opt_out", lVar2, this);
                return objB7 == aVar31 ? aVar31 : objB7;
            case 26:
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                int i114 = this.v;
                if (i114 == 0) {
                    o.b(obj2);
                    com.revolut.feature.profile.impl.ui.details.name.flow.b bVar7 = (com.revolut.feature.profile.impl.ui.details.name.flow.b) obj3;
                    com.revolut.feature.profile.impl.ui.details.name.flow.a aVar34 = new com.revolut.feature.profile.impl.ui.details.name.flow.a(bVar7, null);
                    this.v = 1;
                    if (bVar7.p2(this, aVar34) == aVar33) {
                        return aVar33;
                    }
                } else {
                    if (i114 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 27:
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                int i115 = this.v;
                if (i115 == 0) {
                    o.b(obj2);
                    zfd.e eVarW = zi0.c.w(((cng.b) obj3).f25419a.a());
                    this.v = 1;
                    objZ = vkm.q.z(eVarW, this);
                    if (objZ == aVar35) {
                        return aVar35;
                    }
                } else {
                    if (i115 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objZ = obj2;
                }
                Data data = (Data) objZ;
                if (data == null || (iVar = (od0.i) data.getContent()) == null) {
                    return null;
                }
                return (String) iVar.f224257a;
            case 28:
                x64.c cVar5 = (x64.c) obj3;
                y yVar4 = cVar5.f303035r;
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                int i116 = this.v;
                if (i116 == 0) {
                    o.b(obj2);
                    cVar5.H2(yVar4, new x29.a(29));
                    qw3.a aVar37 = cVar5.f303034q;
                    h1 h1VarA9 = cVar5.o.a9();
                    this.v = 1;
                    v24.a aVar38 = aVar37.f249761a;
                    aVar38.getClass();
                    uvf.b bVar8 = new uvf.b(aVar38, h1VarA9, continuation, 12);
                    p0 p0Var2 = p0.f264001a;
                    objJ = e0.J(elm.f.f127540b, bVar8, this);
                    if (objJ == aVar36) {
                        return aVar36;
                    }
                } else {
                    if (i116 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objJ = obj2;
                }
                cVar5.H2(yVar4, new x16.h(new Data((ku3.a) objJ, null, false, 6, null), 11));
                cVar5.U1(new x64.a(i3));
                return Unit.f186387a;
            default:
                fim.a aVar39 = fim.a.COROUTINE_SUSPENDED;
                int i117 = this.v;
                if (i117 == 0) {
                    o.b(obj2);
                    k kVar = (k) obj3;
                    cpb.j jVar3 = new cpb.j(kVar, continuation, i3);
                    this.v = 1;
                    if (u0.b0(kVar.X(), "SUBMIT_BUTTON_LOADING_TAG", jVar3, this) == aVar39) {
                        return aVar39;
                    }
                } else {
                    if (i117 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
