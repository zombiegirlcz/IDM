package e94;

import android.os.Parcelable;
import au0.j0;
import au6.k1;
import au6.x0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.data.model.Data;
import com.revolut.data.network.models.security.SecuritySettings;
import com.revolut.feature.card_order_new.impl.kompot.screen.delivery_methods.DeliveryMethodsScreenContract$InputData;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceTaxRateUpdate;
import com.revolut.feature.freelancer.impl.network.services.FreelancerInvoiceService;
import com.revolut.feature.insurance.api.models.CFACClaimingFor;
import com.revolut.feature.insurance.impl.ui.cfac.claim.review_claim.CFACInsuranceReviewClaimScreenContract$InputData;
import com.revolut.feature.payment.counterparty.models.PaymentCounterpartyInfo;
import com.revolut.feature.pix.api.model.PortabilityRequestArgsModel;
import com.revolut.feature.pix.impl.flow.migrate_alias.screens.review.ReviewMigrateAliasScreenContract$InputData;
import com.revolut.feature.salary_switch.impl.ui.flow.SalarySwitchFlowContract$Step;
import com.revolut.feature_workflow_reminder_impl.R$string;
import com.revolut.feature_workflow_reminder_impl.ui.timer.WorkflowTimerControllerContract$InputData;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import dmj.r0;
import efm.d0;
import elf.r1;
import elf.s1;
import et6.p1;
import flf.t;
import ft3.h1;
import ft4.i0;
import hha.u;
import java.time.Clock;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import kotlinx.coroutines.flow.SharedFlow;
import kp0.w0;
import nii.h0;
import nii.u1;
import nii.y0;
import om4.c0;
import pfm.z;
import skm.e0;
import skm.p0;
import te0.w;
import tof.a3;
import vkm.j2;
import zh9.u0;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public final class g extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f123904w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj2, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f123904w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g((h) this.f123904w, continuation, 0);
            case 1:
                return new g((com.revolut.feature.pockets.impl.details_v2.mcy.b) this.f123904w, continuation, 1);
            case 2:
                return new g((com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender.g) this.f123904w, continuation, 2);
            case 3:
                return new g((ek7.p) this.f123904w, continuation, 3);
            case 4:
                return new g((s1) this.f123904w, continuation, 4);
            case 5:
                return new g((eq1.f) this.f123904w, continuation, 5);
            case 6:
                return new g((com.revolut.feature.salary_switch.impl.ui.flow.a) this.f123904w, continuation, 6);
            case 7:
                return new g((com.revolut.biometric_verification.impl.ui.flow.launcher.d) this.f123904w, continuation, 7);
            case 8:
                return new g((ew1.m) this.f123904w, continuation, 8);
            case 9:
                return new g((ew6.g) this.f123904w, continuation, 9);
            case 10:
                return new g((com.revolut.feature.select.payment.impl.ui.flow.a) this.f123904w, continuation, 10);
            case 11:
                return new g((exe.l) this.f123904w, continuation, 11);
            case 12:
                return new g((f0a.c) this.f123904w, continuation, 12);
            case 13:
                return new g((com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_banner_grid_spare_change.a) this.f123904w, continuation, 13);
            case 14:
                return new g((f33.h) this.f123904w, continuation, 14);
            case 15:
                return new g((com.revolut.feature.credit.application.plugins.impl.ui.consents.v1.a) this.f123904w, continuation, 15);
            case 16:
                return new g((fb.f) this.f123904w, continuation, 16);
            case 17:
                return new g((com.revolut.feature.credit.application.plugins.impl.ui.failure.flow.a) this.f123904w, continuation, 17);
            case 18:
                return new g((fhi.m) this.f123904w, continuation, 18);
            case 19:
                return new g((com.revolut.feature.apm.wero.impl.ui.p2m.registration.a) this.f123904w, continuation, 19);
            case 20:
                return new g((fkb.f) this.f123904w, continuation, 20);
            case 21:
                return new g((t) this.f123904w, continuation, 21);
            case 22:
                return new g((com.revolut.feature.payment.counterparty.impl.screen.profile.a) this.f123904w, continuation, 22);
            case 23:
                return new g((fol.d) this.f123904w, continuation, 23);
            case 24:
                return new g((i0) this.f123904w, continuation, 24);
            case 25:
                return new g((com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_schedule.c) this.f123904w, continuation, 25);
            case 26:
                return new g((com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.e) this.f123904w, continuation, 26);
            case 27:
                return new g((g82.g) this.f123904w, continuation, 27);
            case 28:
                return new g((gaa.j) this.f123904w, continuation, 28);
            default:
                return new g((gaf.k) this.f123904w, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((g) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objJ;
        Object objB;
        Double dK;
        Object objA;
        Object objB2;
        TextLocalisedClause textLocalisedClause;
        Object objX;
        Object objJ2;
        Object objV;
        int i = this.u;
        int i2 = 16;
        int i3 = 14;
        int i5 = 0;
        int i6 = 2;
        Continuation continuation = null;
        Object obj3 = this.f123904w;
        switch (i) {
            case 0:
                h hVar = (h) obj3;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    xw3.a aVar2 = hVar.f123905p;
                    String str = hVar.o.f67499a.f66892b;
                    this.v = 1;
                    d34.e eVar = aVar2.f309327a;
                    eVar.getClass();
                    d34.c cVar = new d34.c(eVar, str, continuation, i5);
                    p0 p0Var = p0.f264001a;
                    objJ = e0.J(elm.f.f127540b, cVar, this);
                    if (objJ == aVar) {
                        return aVar;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objJ = obj2;
                }
                hVar.C2(new j((it3.d) objJ));
                return Unit.f186387a;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (com.revolut.feature.pockets.impl.details_v2.mcy.b.I2((com.revolut.feature.pockets.impl.details_v2.mcy.b) obj3, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender.g.I2((com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender.g) obj3, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                ek7.p pVar = (ek7.p) obj3;
                mj7.b bVar = pVar.f126974r;
                CFACInsuranceReviewClaimScreenContract$InputData cFACInsuranceReviewClaimScreenContract$InputData = pVar.f126972p;
                Object obj4 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    yhm.o.b(obj2);
                    fj7.a aVar5 = pVar.f126973q;
                    String str2 = cFACInsuranceReviewClaimScreenContract$InputData.f75102a.f74988a;
                    String str3 = ((ek7.i) pVar.t2()).i;
                    String str4 = cFACInsuranceReviewClaimScreenContract$InputData.e;
                    String str5 = cFACInsuranceReviewClaimScreenContract$InputData.f;
                    CFACClaimingFor cFACClaimingFor = cFACInsuranceReviewClaimScreenContract$InputData.f75105g;
                    List listB = bVar.b();
                    List listA = bVar.a();
                    UUID uuid = cFACInsuranceReviewClaimScreenContract$InputData.i;
                    this.v = 1;
                    kj7.f fVar = aVar5.f135545a;
                    fVar.getClass();
                    jc6.r rVar = new jc6.r(fVar, str2, str3, str4, str5, cFACClaimingFor, listB, uuid, listA, null, 1);
                    p0 p0Var2 = p0.f264001a;
                    Object objJ3 = e0.J(elm.f.f127540b, rVar, this);
                    if (objJ3 != obj4) {
                        objJ3 = Unit.f186387a;
                    }
                    if (objJ3 != obj4) {
                        objJ3 = Unit.f186387a;
                    }
                    if (objJ3 == obj4) {
                        return obj4;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                s1 s1Var = (s1) obj3;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    vkm.d dVarB = rd0.e.b(((e60.s) s1Var.f127409n).f122868g);
                    r1 r1Var = new r1(s1Var, i5);
                    this.v = 1;
                    if (dVarB.collect(r1Var, this) == aVar6) {
                        return aVar6;
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
                zjh.j jVar = ((eq1.f) obj3).o;
                this.v = 1;
                Object objN = jVar.n(this);
                return objN == aVar7 ? aVar7 : objN;
            case 6:
                com.revolut.feature.salary_switch.impl.ui.flow.a aVar8 = (com.revolut.feature.salary_switch.impl.ui.flow.a) obj3;
                erc.c cVar2 = aVar8.o;
                vpc.a aVar9 = aVar8.f85315q;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    yhm.o.b(obj2);
                    if (!((aqc.h) aVar9).e.d("TOP_UP.salary_topup", null).a()) {
                        throw new IllegalStateException("Salary switch should be available");
                    }
                    this.v = 1;
                    objB = ((aqc.h) aVar9).b(this);
                    if (objB == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i66 != 1) {
                        if (i66 != 2 && i66 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                    objB = obj2;
                }
                String str6 = (String) objB;
                wi0.b.Companion.getClass();
                if (Intrinsics.f(str6, "MX")) {
                    this.v = 2;
                    if (com.revolut.feature.salary_switch.impl.ui.flow.a.I2(aVar8, cVar2, this) == aVar10) {
                        return aVar10;
                    }
                } else if (Intrinsics.f(str6, "BR")) {
                    oki.h.t2(aVar8, aVar8.f85318t, new SalarySwitchFlowContract$Step.SalarySwitchBr(cVar2.f128634b), false, null, false, 12);
                } else {
                    this.v = 3;
                    if (com.revolut.feature.salary_switch.impl.ui.flow.a.J2(aVar8, this) == aVar10) {
                        return aVar10;
                    }
                }
                return Unit.f186387a;
            case 7:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 != 0) {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                hs.a aVar12 = ((com.revolut.biometric_verification.impl.ui.flow.launcher.d) obj3).B;
                this.v = 1;
                Object objA2 = aVar12.a(this);
                return objA2 == aVar11 ? aVar11 : objA2;
            case 8:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    yhm.o.b(obj2);
                    ew1.m mVar = (ew1.m) obj3;
                    eg4.b bVar2 = new eg4.b(mVar, continuation, 13);
                    this.v = 1;
                    if (do3.q.t(mVar, bVar2, this) == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 9:
                ew6.g gVar = (ew6.g) obj3;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 != 0) {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                p1 p1Var = gVar.f130102p;
                String str7 = ((ew6.d) gVar.t2()).f130096a;
                String str8 = str7 != null ? str7 : "";
                String str9 = ((ew6.d) gVar.t2()).f130097b;
                if (str9 == null || (dK = y.k(str9)) == null) {
                    throw new IllegalArgumentException("Tax rate percentage can not be null ");
                }
                double dDoubleValue = dK.doubleValue();
                FreelancerInvoiceTaxRateUpdate payload = new FreelancerInvoiceTaxRateUpdate(str8, dDoubleValue);
                p1Var.getClass();
                Intrinsics.checkNotNullParameter(payload, "payload");
                k1 k1Var = (k1) p1Var.f129298b;
                k1Var.getClass();
                Intrinsics.checkNotNullParameter(payload, "payload");
                FreelancerInvoiceService freelancerInvoiceService = k1Var.f9546a;
                Intrinsics.checkNotNullParameter(payload, "<this>");
                d0<qt6.l> d0VarCreateTaxRate = freelancerInvoiceService.createTaxRate(new qt6.m(str8, dDoubleValue));
                atg.n nVar = new atg.n(15, new j0(7));
                d0VarCreateTaxRate.getClass();
                ufm.i iVar = new ufm.i(new ufm.i(d0VarCreateTaxRate, nVar, 1), new atg.n(i2, new x0(k1Var, i5)), 0);
                Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                ufm.n nVarI0 = w.i0(iVar);
                this.v = 1;
                Object objB3 = nim.a.b(nVarI0, this);
                return objB3 == aVar14 ? aVar14 : objB3;
            case 10:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (com.revolut.feature.select.payment.impl.ui.flow.a.I2((com.revolut.feature.select.payment.impl.ui.flow.a) obj3, this) == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 11:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    objA = exe.l.a((exe.l) obj3, this);
                    if (objA == aVar16) {
                        return aVar16;
                    }
                } else {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objA = obj2;
                }
                return Optional.ofNullable(objA);
            case 12:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    yhm.o.b(obj2);
                    y21.c cVar3 = ((f0a.c) obj3).f131070n;
                    cVar3.getClass();
                    pfm.t tVarC = cVar3.c(SecuritySettings.MESSAGING_WITH_FRIENDS_SETTING, true);
                    this.v = 1;
                    if (nim.a.a(tVarC, this) == aVar17) {
                        return aVar17;
                    }
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 13:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_banner_grid_spare_change.a aVar19 = (com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_banner_grid_spare_change.a) obj3;
                    f2c.q qVar = new f2c.q(aVar19, null);
                    this.v = 1;
                    if (u0.b0(aVar19.X(), "SPARE_CHANGE_FBGB_DEACTIVATE_BUTTON_TAG", qVar, this) == aVar18) {
                        return aVar18;
                    }
                } else {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 14:
                f33.h hVar2 = (f33.h) obj3;
                DeliveryMethodsScreenContract$InputData deliveryMethodsScreenContract$InputData = hVar2.o;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 == 0) {
                    yhm.o.b(obj2);
                    ffk.t tVar = hVar2.f131884p;
                    u.Companion.getClass();
                    u pricingPlanFeature = u.f152351j;
                    tVar.getClass();
                    Intrinsics.checkNotNullParameter(pricingPlanFeature, "pricingPlanFeature");
                    pfk.p0 p0Var3 = (pfk.p0) tVar.f134850a;
                    p0Var3.getClass();
                    Intrinsics.checkNotNullParameter(pricingPlanFeature, "pricingPlanFeature");
                    d0 d0VarFirstOrError = m70.a.g(p0Var3.b(), null, new pch.f(i3), 1).firstOrError();
                    pfa.c cVar4 = new pfa.c(new ffk.m(pricingPlanFeature, 1), 11);
                    d0VarFirstOrError.getClass();
                    ufm.i iVar2 = new ufm.i(d0VarFirstOrError, cVar4, 1);
                    Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                    z zVarF = ue0.e.F(iVar2, new Data(null, null, false, 7, null));
                    this.v = 1;
                    objB2 = nim.a.b(zVarF, this);
                    if (objB2 == aVar20) {
                        return aVar20;
                    }
                } else {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objB2 = obj2;
                }
                hVar2.H2(hVar2.f131888t, new r0(2, (Data) objB2, ((db9.d) hVar2.f131886r).c()));
                d93.b bVar3 = (d93.b) zhm.d0.d0(deliveryMethodsScreenContract$InputData.f65186b.f112340a);
                if (bVar3 == null) {
                    bVar3 = (d93.b) zhm.d0.d0(deliveryMethodsScreenContract$InputData.f65186b.f112341b);
                }
                if (bVar3 != null) {
                    hVar2.l2(new esa.i(hVar2, bVar3, continuation, 17), new yi5.b(26));
                }
                return Unit.f186387a;
            case 15:
                com.revolut.feature.credit.application.plugins.impl.ui.consents.v1.a aVar21 = (com.revolut.feature.credit.application.plugins.impl.ui.consents.v1.a) obj3;
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 == 0) {
                    yhm.o.b(obj2);
                    hw3.c cVar5 = aVar21.f67290p;
                    h1 productPayload = w0.F(aVar21.f67291q.d);
                    cVar5.getClass();
                    Intrinsics.checkNotNullParameter(productPayload, "productPayload");
                    p24.p pVar2 = cVar5.f156055a;
                    pVar2.getClass();
                    Intrinsics.checkNotNullParameter(productPayload, "productPayload");
                    pfm.r rVarG0 = w.g0(pVar2.f232057c.acceptTerms(productPayload.f137835a));
                    this.v = 1;
                    if (nim.a.a(rVarG0, this) == aVar22) {
                        return aVar22;
                    }
                } else {
                    if (i104 != 1) {
                        if (i104 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                this.v = 2;
                if (c84.t.N2(aVar21, null, this, 3) == aVar22) {
                    return aVar22;
                }
                return Unit.f186387a;
            case 16:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 == 0) {
                    yhm.o.b(obj2);
                    kgm.c cVar6 = ((fb.f) obj3).f133420q;
                    jdb.a aVar24 = jdb.a.PERSONAL_DETAILS;
                    this.v = 1;
                    if (cVar6.c(aVar24, this) == aVar23) {
                        return aVar23;
                    }
                } else {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 17:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.credit.application.plugins.impl.ui.failure.flow.a aVar26 = (com.revolut.feature.credit.application.plugins.impl.ui.failure.flow.a) obj3;
                    eg4.b bVar4 = new eg4.b(aVar26, continuation, 23);
                    this.v = 1;
                    if (aVar26.p2(this, bVar4) == aVar25) {
                        return aVar25;
                    }
                } else {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 18:
                fhi.m mVar2 = (fhi.m) obj3;
                cli.y yVar = mVar2.f135251r;
                WorkflowTimerControllerContract$InputData workflowTimerControllerContract$InputData = mVar2.f135249p;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    Clock clock = mVar2.f135250q;
                    LocalDate localDateNow = LocalDate.now(clock);
                    int i108 = fhi.k.f135247a[workflowTimerControllerContract$InputData.f98189a.ordinal()];
                    if (i108 != 1) {
                        if (i108 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        localDateNow = localDateNow.plusDays(1L);
                    }
                    Object objB4 = mVar2.o.b(zhm.r0.k(new Pair(ib.b.Flow, "SET_CHECKLIST_REMINDER"), new Pair("datetime", String.valueOf(((fhi.d) ((j2) yVar.f22677a).getValue()).f135241b.atDate(localDateNow).atZone(clock.getZone()).toInstant().toEpochMilli()))), this);
                    if (objB4 != aVar27) {
                        objB4 = Unit.f186387a;
                    }
                    if (objB4 == aVar27) {
                        return aVar27;
                    }
                } else {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                String str10 = ((fhi.d) ((j2) yVar.f22677a).getValue()).f135241b.format(DateTimeFormatter.ofPattern("HH:mm"));
                int i109 = fhi.l.f135248a[workflowTimerControllerContract$InputData.f98189a.ordinal()];
                if (i109 == 1) {
                    textLocalisedClause = new TextLocalisedClause(R$string.fincrime_reminder_we_will_remind, v.k(str10, new TextLocalisedClause(R$string.fincrime_common_today_in_sentence, null, null, 14)), null, 12);
                } else {
                    if (i109 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    textLocalisedClause = new TextLocalisedClause(R$string.fincrime_reminder_we_will_remind, v.k(str10, new TextLocalisedClause(R$string.fincrime_common_tomorrow_in_sentence, null, null, 14)), null, 12);
                }
                mVar2.C2(new fhi.f(textLocalisedClause));
                return Unit.f186387a;
            case 19:
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
                qh2.a aVar29 = ((com.revolut.feature.apm.wero.impl.ui.p2m.registration.a) obj3).f63081p;
                this.v = 1;
                Object objF = ((qh2.h) aVar29).f(this);
                return objF == aVar28 ? aVar28 : objF;
            case 20:
                fkb.f fVar2 = (fkb.f) obj3;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 == 0) {
                    yhm.o.b(obj2);
                    ugc.a aVar31 = fVar2.f135743p;
                    String str11 = fVar2.o.f83201a;
                    qib.a aVar32 = qib.a.INACTIVE;
                    this.v = 1;
                    if (aVar31.r(str11, aVar32, this) == aVar30) {
                        return aVar30;
                    }
                } else {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                fVar2.C2(fkb.c.f135741a);
                return Unit.f186387a;
            case 21:
                t tVar2 = (t) obj3;
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 == 0) {
                    yhm.o.b(obj2);
                    SharedFlow sharedFlowD = tVar2.f135978l.d();
                    this.v = 1;
                    objX = vkm.q.x(sharedFlowD, this);
                    if (objX == aVar33) {
                        return aVar33;
                    }
                } else {
                    if (i112 != 1) {
                        if (i112 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                    objX = obj2;
                }
                this.v = 2;
                Object objB32 = tVar2.b3(new flf.r(tVar2, (a3) objX, continuation, i6), this);
                if (objB32 != aVar33) {
                    objB32 = Unit.f186387a;
                }
                if (objB32 == aVar33) {
                    return aVar33;
                }
                return Unit.f186387a;
            case 22:
                com.revolut.feature.payment.counterparty.impl.screen.profile.a aVar34 = (com.revolut.feature.payment.counterparty.impl.screen.profile.a) obj3;
                Object obj5 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                if (i113 == 0) {
                    yhm.o.b(obj2);
                    co9.b bVar5 = aVar34.f79054r;
                    String str12 = aVar34.o.f79049a;
                    this.v = 1;
                    if (bVar5.f25499b.a()) {
                        yn9.c cVar7 = bVar5.f25498a;
                        cVar7.getClass();
                        yg6.v vVar = new yg6.v(cVar7, str12, continuation, 9);
                        p0 p0Var4 = p0.f264001a;
                        objJ2 = e0.J(elm.f.f127540b, vVar, this);
                        if (objJ2 != obj5) {
                            objJ2 = Unit.f186387a;
                        }
                        if (objJ2 != obj5) {
                            objJ2 = Unit.f186387a;
                        }
                    } else {
                        objJ2 = Unit.f186387a;
                    }
                    if (objJ2 == obj5) {
                        return obj5;
                    }
                } else {
                    if (i113 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                int i114 = com.revolut.feature.payment.counterparty.api.R$string.biller_delete_success_message;
                PaymentCounterpartyInfo paymentCounterpartyInfo = (PaymentCounterpartyInfo) ((fo9.h) ((j2) aVar34.v.f22677a).getValue()).f136843a.getContent();
                String str13 = paymentCounterpartyInfo != null ? paymentCounterpartyInfo.e : null;
                return yji.l.a1(aVar34, aVar34.X1(new y0(null, new nii.j0((Clause) new TextLocalisedClause(i114, zhm.u.c(str13 != null ? str13 : ""), null, 12), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094), false, 5)), null, null, new ff4.z(aVar34, continuation, 22), 3);
            case 23:
                fol.d dVar = (fol.d) obj3;
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                int i115 = this.v;
                if (i115 == 0) {
                    yhm.o.b(obj2);
                    fol.c cVar8 = new fol.c(dVar, null);
                    this.v = 1;
                    if (u0.b0(dVar.X(), "TAG_DELETE_CONFIRM", cVar8, this) == aVar35) {
                        return aVar35;
                    }
                } else {
                    if (i115 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                dVar.X1(new mii.k("LIST_ID_SHOT_PASSKEY_DELETED", new TextLocalisedClause(com.revolut.sso.api.R$string.revolut_sso_passkeys_management_delete_bubble_title, null, null, 14), null, null, null, 28));
                dVar.B2();
                return Unit.f186387a;
            case 24:
                i0 i0Var = (i0) obj3;
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                int i116 = this.v;
                if (i116 == 0) {
                    yhm.o.b(obj2);
                    al4.m mVar3 = i0Var.f137911q;
                    String str14 = i0Var.o.f69528a;
                    this.v = 1;
                    if (((om4.r1) mVar3).n(str14, this) == aVar36) {
                        return aVar36;
                    }
                } else {
                    if (i116 != 1) {
                        if (i116 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                al4.e eVar2 = i0Var.f137912r;
                this.v = 2;
                Object objA3 = ((c0) eVar2).d.a(this);
                if (objA3 != aVar36) {
                    objA3 = Unit.f186387a;
                }
                if (objA3 == aVar36) {
                    return aVar36;
                }
                return Unit.f186387a;
            case 25:
                fim.a aVar37 = fim.a.COROUTINE_SUSPENDED;
                int i117 = this.v;
                if (i117 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_schedule.c cVar9 = (com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_schedule.c) obj3;
                    com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_schedule.b bVar6 = new com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_schedule.b(cVar9, null);
                    this.v = 1;
                    if (u0.b0(cVar9.X(), "RECURRING_INVOICE_BUTTON_TAG", bVar6, this) == aVar37) {
                        return aVar37;
                    }
                } else {
                    if (i117 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 26:
                com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.e eVar3 = (com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.e) obj3;
                Object obj6 = fim.a.COROUTINE_SUSPENDED;
                int i118 = this.v;
                if (i118 == 0) {
                    yhm.o.b(obj2);
                    c6b.b bVar7 = eVar3.f82585p;
                    this.v = 1;
                    y5b.p pVar3 = bVar7.f21753a;
                    pVar3.getClass();
                    y5b.n nVar2 = new y5b.n(pVar3, null, 0);
                    p0 p0Var5 = p0.f264001a;
                    Object objJ4 = e0.J(elm.f.f127540b, nVar2, this);
                    if (objJ4 != obj6) {
                        objJ4 = Unit.f186387a;
                    }
                    if (objJ4 != obj6) {
                        objJ4 = Unit.f186387a;
                    }
                    if (objJ4 == obj6) {
                        return obj6;
                    }
                } else {
                    if (i118 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                eVar3.v.a();
                return Unit.f186387a;
            case 27:
                fim.a aVar38 = fim.a.COROUTINE_SUSPENDED;
                int i119 = this.v;
                if (i119 != 0) {
                    if (i119 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                this.v = 1;
                Object objI2 = g82.g.I2((g82.g) obj3, this);
                return objI2 == aVar38 ? aVar38 : objI2;
            case 28:
                fim.a aVar39 = fim.a.COROUTINE_SUSPENDED;
                int i120 = this.v;
                if (i120 != 0) {
                    if (i120 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                gaa.j jVar2 = (gaa.j) obj3;
                s8a.c cVar10 = jVar2.f142127r;
                ReviewMigrateAliasScreenContract$InputData reviewMigrateAliasScreenContract$InputData = jVar2.o;
                AccountId accountId = reviewMigrateAliasScreenContract$InputData.f80640a;
                PortabilityRequestArgsModel portabilityRequestArgsModel = reviewMigrateAliasScreenContract$InputData.f80641b;
                this.v = 1;
                Object objI = cVar10.f260942a.i(accountId, portabilityRequestArgsModel, this);
                return objI == aVar39 ? aVar39 : objI;
            default:
                gaf.k kVar = (gaf.k) obj3;
                fim.a aVar40 = fim.a.COROUTINE_SUSPENDED;
                int i121 = this.v;
                if (i121 == 0) {
                    yhm.o.b(obj2);
                    al6.c cVar11 = new al6.c(12);
                    ack.n nVar3 = new ack.n(i2);
                    gaf.j jVar3 = new gaf.j(kVar, null);
                    this.v = 1;
                    objV = n14.k.V(kVar, null, cVar11, nVar3, jVar3, this, 1);
                    if (objV == aVar40) {
                        return aVar40;
                    }
                } else {
                    if (i121 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objV = obj2;
                }
                if (((nii.h) objV) instanceof nii.g) {
                    kVar.C2(gaf.f.f142162a);
                }
                return Unit.f186387a;
        }
    }
}
