package cn7;

import bmm.t;
import bwc.i;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.appupdate.navigation.AppUpdateDestination;
import com.revolut.appupdate.ui.AppUpdateContract$InputData;
import com.revolut.chat.domain.model.ChatListFilter;
import com.revolut.chat.domain.model.ChatTarget;
import com.revolut.chat.domain.model.TicketCreationContext;
import com.revolut.chat.navigation.ChatFlowDestination;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.loan.api.navigation.LoanKompotFeatureConfig;
import com.revolut.feature.credit.loan.impl.ui.rev10.payment_settings.flow.LoanPaymentSettingsFlowContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.payment_settings.flow.LoanPaymentSettingsFlowContract$Step;
import com.revolut.feature.customer_present.tips.impl.flow.tips.CustomerPresentTipsFlowContract$Step;
import com.revolut.feature.full_screen_prompt.FullScreenPromptScreen;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.data.model.TodoItem;
import com.revolut.feature.insurance_car.impl.ui.flow.cancellation.a;
import com.revolut.feature.insurance_car.impl.ui.flow.policy.CarPolicyFlowContract$Step;
import com.revolut.feature.insurance_car.impl.ui.flow.policy.d;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.cancellation_details.CancellationDetailsScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.cancellation_details.CancellationDetailsScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.overdue_payment.OverduePaymentScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.overdue_payment.OverduePaymentScreenContract$InputData;
import com.revolut.feature.kyc.impl.KycScreenContract$Step;
import com.revolut.feature.kyc.impl.f;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.flow.FlowStateWrapper;
import com.revolut.retail.core.navigation.CollapseApplicationCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.youTransactor.uCube.rpc.Constants;
import cu8.g1;
import cu8.i1;
import cu8.w0;
import cul.n0;
import d27.f0;
import dki.h;
import dq7.e;
import efm.d0;
import g06.f;
import hq7.g;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import k3l.j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import my8.s;
import my8.u;
import pfm.m;
import rp0.a0;
import rp0.z;
import rq7.k;
import rq7.l;
import rq7.n;
import rq7.o;
import yz5.a;
import zhm.h0;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c extends q implements Function1 {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i, Object obj2, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj2, str, str2);
        this.f = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f;
        CarPolicyFlowContract$Step.DocumentsList documentsList = CarPolicyFlowContract$Step.DocumentsList.f75474a;
        int i2 = 23;
        int i3 = 28;
        m mVar = m.f235744a;
        int i5 = 1;
        int i6 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        switch (i) {
            case 0:
                e p0 = (e) obj2;
                Intrinsics.checkNotNullParameter(p0, "p0");
                d dVar = (d) this.receiver;
                dVar.getClass();
                if (p0 instanceof e.a) {
                    dVar.C1(sl7.c.a("topic.car-insurance"));
                }
                return Unit.f186387a;
            case 1:
                com.revolut.feature.insurance_car.impl.ui.flow.cancellation.a p03 = (com.revolut.feature.insurance_car.impl.ui.flow.cancellation.a) obj2;
                Intrinsics.checkNotNullParameter(p03, "p0");
                d dVar2 = (d) this.receiver;
                dVar2.getClass();
                if (!(p03 instanceof a.C0501a)) {
                    throw new NoWhenBranchMatchedException();
                }
                dVar2.K2(new h((Function1) new cmc.c(12), false));
                dVar2.B2(false);
                return Unit.f186387a;
            case 2:
                g p010 = (g) obj2;
                Intrinsics.checkNotNullParameter(p010, "p0");
                d dVar3 = (d) this.receiver;
                dVar3.getClass();
                if (Intrinsics.f(p010, g.b.f154613a)) {
                    dVar3.C1(new ChatFlowDestination(new ChatTarget.ChatList((ChatListFilter) null, (TicketCreationContext) null, (String) null, 15), true));
                } else {
                    if (!Intrinsics.f(p010, g.a.f154612a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dVar3.O2(documentsList);
                }
                return Unit.f186387a;
            case 3:
                k p011 = (k) obj2;
                Intrinsics.checkNotNullParameter(p011, "p0");
                d dVar4 = (d) this.receiver;
                dVar4.getClass();
                if (p011 instanceof k.e) {
                    dVar4.O2(CarPolicyFlowContract$Step.PolicyDetails.f75481a);
                } else if (p011 instanceof k.b) {
                    dVar4.O2(documentsList);
                } else if (p011 instanceof k.a) {
                    dVar4.O2(CarPolicyFlowContract$Step.Claims.f75472a);
                } else {
                    boolean z = p011 instanceof o;
                    ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
                    if (z) {
                        TodoItem todoItem = ((o) p011).f256494a;
                        if (todoItem.f75335g) {
                            dVar4.C1(new AppUpdateDestination(new AppUpdateContract$InputData(false)));
                        } else {
                            switch (b.f25371a[todoItem.f75332a.ordinal()]) {
                                case 1:
                                    dVar4.O2(CarPolicyFlowContract$Step.UploadDocuments.f75487a);
                                    break;
                                case 2:
                                    d67.e eVar = d67.g.Companion;
                                    TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.car_insurance_documents_in_review_title, null, null, 14);
                                    TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.car_insurance_documents_in_review_caption, null, null, 14);
                                    Integer numValueOf = Integer.valueOf(Constants.TAG_SUPPORTED_LOCALE_LIST);
                                    dVar4.f2(new FullScreenPromptScreen(d67.e.a(eVar, textLocalisedClause, textLocalisedClause2, null, com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D028", new ImageTransformations(null, null, null, null, null, numValueOf, numValueOf, 31), null, null, 28), new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, null, new TextLocalisedClause(R$string.car_insurance_documents_in_review_footer_primary_button_title, null, null, 14), new TextLocalisedClause(R$string.car_insurance_documents_in_review_footer_secondary_button_title, null, null, 14), false, null, new AnalyticsProduct.Retail(zl7.a.f323191b), null, false, 16511948)), popup, new i(1, dVar4, d.class, "handleDocumentsInReviewResult", "handleDocumentsInReviewResult(Lcom/revolut/feature/full_screen_prompt/FullScreenPromptScreenContract$OutputData;)V", 0, 28));
                                    break;
                                case 3:
                                    dVar4.O2(new CarPolicyFlowContract$Step.Delivery(kl7.g.TEMPORARY_CERTIFICATE));
                                    break;
                                case 4:
                                    dVar4.O2(new CarPolicyFlowContract$Step.Delivery(kl7.g.ANNUAL_CERTIFICATE));
                                    break;
                                case 5:
                                    dVar4.O2(CarPolicyFlowContract$Step.TelematicsDeviceDelivery.f75485a);
                                    break;
                                case 6:
                                    dVar4.O2(new CarPolicyFlowContract$Step.TelematicsDeviceUnplugged(todoItem));
                                    break;
                                case 7:
                                    dVar4.C1(new AppUpdateDestination(new AppUpdateContract$InputData(false)));
                                    break;
                                default:
                                    throw new NoWhenBranchMatchedException();
                            }
                        }
                    } else if (p011 instanceof n) {
                        n nVar = (n) p011;
                        dVar4.Y1(new CancellationDetailsScreen(new CancellationDetailsScreenContract$InputData(nVar.f256492a, nVar.f256493b)), popup, new c(1, dVar4, d.class, "handlePolicyCancellationDetailsResult", "handlePolicyCancellationDetailsResult(Lcom/revolut/feature/insurance_car/impl/ui/screen/policy/cancellation_details/CancellationDetailsScreenContract$OutputData;)V", 0, 0));
                    } else if (p011 instanceof rq7.m) {
                        dVar4.Y1(new OverduePaymentScreen(new OverduePaymentScreenContract$InputData(((rq7.m) p011).f256491a)), popup, new ce9.a(dVar4, i2));
                    } else if (p011 instanceof k.d) {
                        dVar4.O2(CarPolicyFlowContract$Step.SmartDriving.f75484a);
                    } else if (p011 instanceof k.c) {
                        dVar4.O2(CarPolicyFlowContract$Step.ManagePolicy.f75475a);
                    } else {
                        if (!(p011 instanceof l)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        dVar4.l2(new com.revolut.feature.insurance_car.impl.ui.flow.policy.a(dVar4, ((l) p011).f256490a, null), new i(1, dVar4, vl7.a.class, "genericErrorHandler", "genericErrorHandler(Lcom/revolut/kompot/navigable/ControllerModel;Ljava/lang/Throwable;)Z", 1, 24));
                    }
                }
                return Unit.f186387a;
            case 4:
                Throwable p012 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p012, "p0");
                cpb.k kVar = (cpb.k) this.receiver;
                yji.l.a1(kVar, kVar.f107921p.Z2(p012), null, null, null, 7);
                return Boolean.TRUE;
            case 5:
                KycScreenContract$Step p013 = (KycScreenContract$Step) obj2;
                Intrinsics.checkNotNullParameter(p013, "p0");
                return ((com.revolut.feature.kyc.impl.b) this.receiver).B3(p013);
            case 6:
                List p014 = (List) obj2;
                Intrinsics.checkNotNullParameter(p014, "p0");
                com.revolut.feature.kyc.impl.b bVar = (com.revolut.feature.kyc.impl.b) this.receiver;
                pfm.a aVar = new pfm.a(bVar.m3(p014), new csl.b(13, new cma.b(bVar, p014, 22)), 4);
                Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
                return aVar;
            case 7:
                s p015 = (s) obj2;
                Intrinsics.checkNotNullParameter(p015, "p0");
                return ((f) ((i1) this.receiver)).n3(p015);
            case 8:
                s p016 = (s) obj2;
                Intrinsics.checkNotNullParameter(p016, "p0");
                return ((f) ((i1) this.receiver)).n3(p016);
            case 9:
                a0 visibilityData = (a0) obj2;
                Intrinsics.checkNotNullParameter(visibilityData, "p0");
                f fVar = (f) ((i1) this.receiver);
                fVar.getClass();
                Intrinsics.checkNotNullParameter(visibilityData, "visibilityData");
                Object obj3 = visibilityData.f256041b;
                w0 w0Var = obj3 instanceof w0 ? (w0) obj3 : null;
                if (w0Var == null) {
                    Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                    return mVar;
                }
                g1 g1Var = fVar.f77669c;
                my8.k kycConsent = w0Var.f108905a;
                com.revolut.feature.kyc.impl.b bVar2 = (com.revolut.feature.kyc.impl.b) g1Var;
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(kycConsent, "kycConsent");
                d0 d0VarFirstOrError = bVar2.s3().firstOrError();
                csl.b bVar3 = new csl.b(i2, new cma.b(bVar2, kycConsent, 24));
                d0VarFirstOrError.getClass();
                ufm.i iVar = new ufm.i(d0VarFirstOrError, bVar3, 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                return new pfm.h(iVar, 4);
            case 10:
                z clickData = (z) obj2;
                Intrinsics.checkNotNullParameter(clickData, "p0");
                f fVar2 = (f) ((i1) this.receiver);
                fVar2.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                Object obj4 = clickData.f256228b;
                String str = clickData.f256227a;
                if (obj4 instanceof w0) {
                    d0 d0VarFirstOrError2 = ((com.revolut.feature.kyc.impl.b) fVar2.f77669c).s3().firstOrError();
                    cu8.n nVar2 = new cu8.n(21, new cma.b(clickData, fVar2, i3));
                    d0VarFirstOrError2.getClass();
                    pfm.a aVar2 = new pfm.a(d0VarFirstOrError2, nVar2, 4);
                    Intrinsics.checkNotNullExpressionValue(aVar2, "flatMapCompletable(...)");
                    return ue0.e.v(aVar2);
                }
                if (kotlin.text.a0.H(str, "clickIdHints_", false)) {
                    Object obj5 = clickData.f256228b;
                    if (obj5 instanceof u) {
                        u uVar = (u) obj5;
                        String str2 = uVar.f210400a;
                        if (!kotlin.text.d0.W(str2)) {
                            d0 d0VarS1 = lg0.b.s1(fVar2.f77672j, str2, null, null, 6);
                            d0VarS1.getClass();
                            return new pfm.h(d0VarS1, 4);
                        }
                        IllegalStateException illegalStateException = new IllegalStateException(a0.d.s("Hint link with highlightText=", uVar.f210401b, " has no deeplink for id: ", str));
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                        return mVar;
                    }
                }
                IllegalStateException illegalStateException2 = new IllegalStateException("Clause link click not handled for id: ".concat(str));
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
                return mVar;
            case 11:
                Throwable e = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(e, "p0");
                f fVar3 = (f) ((i1) this.receiver);
                fVar3.getClass();
                Intrinsics.checkNotNullParameter(e, "e");
                return fVar3.i.c0(new StatusViewConfiguration.Error("doc_selection_error_dialog_id", new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.common_error_something_went_wrong, null, null, 14), null, new TextLocalisedClause(R.string.common_action_try_again, null, null, 14), null, null, null, 8180));
            case 12:
                j result = (j) obj2;
                Intrinsics.checkNotNullParameter(result, "p0");
                f fVar4 = (f) ((i1) this.receiver);
                fVar4.getClass();
                Intrinsics.checkNotNullParameter(result, "result");
                if (Intrinsics.f(result.a().getF104385a(), "doc_selection_error_dialog_id")) {
                    if (result instanceof k3l.h) {
                        ((com.revolut.feature.kyc.impl.b) fVar4.f77669c).f77571j.onNext(Unit.f186387a);
                    } else if (result instanceof k3l.g) {
                        fVar4.k.onNext(CollapseApplicationCommand.f98628a);
                    }
                }
                Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                return mVar;
            case 13:
                NaviCommand p017 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(p017, "p0");
                ((sri.m) this.receiver).c(p017);
                return Unit.f186387a;
            case 14:
                NaviCommand p018 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(p018, "p0");
                ((ihm.k) this.receiver).onNext(p018);
                return Unit.f186387a;
            case 15:
                g06.f p019 = (g06.f) obj2;
                Intrinsics.checkNotNullParameter(p019, "p0");
                com.revolut.feature.customer_present.tips.impl.flow.tips.a aVar3 = (com.revolut.feature.customer_present.tips.impl.flow.tips.a) this.receiver;
                aVar3.getClass();
                if (Intrinsics.f(p019, f.c.f139356a)) {
                    aVar3.C2(a.b.f318038a);
                } else if (p019 instanceof g06.g) {
                    aVar3.C2(new yz5.b(((g06.g) p019).f139357a));
                } else if (p019 instanceof f.b) {
                    oki.h.t2(aVar3, aVar3.f71619p, CustomerPresentTipsFlowContract$Step.CustomTip.f71617a, true, null, false, 12);
                } else {
                    if (!Intrinsics.f(p019, f.a.f139354a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar3.C2(a.C1768a.f318037a);
                }
                return Unit.f186387a;
            case 16:
                e06.e p020 = (e06.e) obj2;
                Intrinsics.checkNotNullParameter(p020, "p0");
                com.revolut.feature.customer_present.tips.impl.flow.tips.a aVar4 = (com.revolut.feature.customer_present.tips.impl.flow.tips.a) this.receiver;
                aVar4.getClass();
                aVar4.C2(new yz5.b(p020.f121428a));
                return Unit.f186387a;
            case 17:
                fd1.b p021 = (fd1.b) obj2;
                Intrinsics.checkNotNullParameter(p021, "p0");
                com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.a aVar5 = (com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.a) this.receiver;
                if (p021 instanceof fd1.a) {
                    aVar5.H2(aVar5.E, new n0(p021, 27));
                    return Unit.f186387a;
                }
                aVar5.getClass();
                throw new NoWhenBranchMatchedException();
            case 18:
                kw6.b p022 = (kw6.b) obj2;
                Intrinsics.checkNotNullParameter(p022, "p0");
                com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.a aVar6 = (com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.a) this.receiver;
                if (p022 != null) {
                    aVar6.H2(aVar6.E, new f0(p022, 0));
                    return Unit.f186387a;
                }
                aVar6.getClass();
                throw new NoWhenBranchMatchedException();
            case 19:
                List p023 = (List) obj2;
                Intrinsics.checkNotNullParameter(p023, "p0");
                d6l.h.a((d6l.h) this.receiver, p023);
                return Unit.f186387a;
            case 20:
                e75.l p024 = (e75.l) obj2;
                Intrinsics.checkNotNullParameter(p024, "p0");
                com.revolut.feature.credit.loan.impl.ui.rev10.payment_settings.flow.a aVar7 = (com.revolut.feature.credit.loan.impl.ui.rev10.payment_settings.flow.a) this.receiver;
                LoanPaymentSettingsFlowContract$InputData loanPaymentSettingsFlowContract$InputData = aVar7.o;
                if (p024 instanceof e75.h) {
                    aVar7.I2(((e75.h) p024).f123070a, null);
                } else if (p024 instanceof e75.g) {
                    e75.g gVar = (e75.g) p024;
                    aVar7.I2(gVar.f123068a, gVar.f123069b);
                } else if (p024 instanceof e75.i) {
                    aVar7.C1(new LoanKompotFeatureConfig.SelectBackupCardFlowNavigationDestination(loanPaymentSettingsFlowContract$InputData.f70447a, ((e75.i) p024).f123071a, false));
                } else if (p024 instanceof e75.k) {
                    aVar7.C1(new LoanKompotFeatureConfig.ChangeRepaymentDayFlowNavigationDestination(loanPaymentSettingsFlowContract$InputData.f70447a));
                } else {
                    if (!(p024 instanceof e75.j)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oki.h.w2(aVar7.f70452p, LoanPaymentSettingsFlowContract$Step.PayWithInfo.f70451a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                }
                return Unit.f186387a;
            case 21:
                m65.e p025 = (m65.e) obj2;
                Intrinsics.checkNotNullParameter(p025, "p0");
                com.revolut.feature.credit.loan.impl.ui.rev10.payment_settings.flow.a aVar8 = (com.revolut.feature.credit.loan.impl.ui.rev10.payment_settings.flow.a) this.receiver;
                aVar8.getClass();
                if (p025 instanceof m65.c) {
                    yji.l.a1(aVar8, aVar8.X1(new mii.k("payment-method-updated", new TextLocalisedClause(com.revolut.feature.credit.core.R$string.loan_management_payment_settings_toast_repayment_method_updated, null, null, 14), null, null, null, 28)), null, null, null, 7);
                } else if (!(p025 instanceof m65.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            case 22:
                Throwable p026 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p026, "p0");
                q7e.b.d((yji.l) this.receiver, p026);
                return Boolean.TRUE;
            case 23:
                Throwable p027 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p027, "p0");
                daa.m mVar2 = (daa.m) this.receiver;
                mVar2.X1(((uca.f) mVar2.f112504p).b(p027));
                return Boolean.TRUE;
            case 24:
                Throwable p028 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p028, "p0");
                ((com.revolut.feature.revolutpay.management.impl.ui.management.flow.b) this.receiver).getClass();
                h0 h0Var3 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, p028, h0Var3);
                return Boolean.TRUE;
            case 25:
                lk0.g pagedData = (lk0.g) obj2;
                Intrinsics.checkNotNullParameter(pagedData, "p0");
                yb0.h hVar = (yb0.h) this.receiver;
                hVar.getClass();
                Intrinsics.checkNotNullParameter(pagedData, "pagedData");
                yb0.i iVar2 = hVar.f312147a;
                iVar2.H2(iVar2.f312151x, new a3e.s(pagedData, 18));
                return Unit.f186387a;
            case 26:
                NaviCommand p029 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(p029, "p0");
                ((sri.m) this.receiver).c(p029);
                return Unit.f186387a;
            case 27:
                yja.b p030 = (yja.b) obj2;
                Intrinsics.checkNotNullParameter(p030, "p0");
                com.revolut.feature.junior_onboarding.impl.ui.onboarding.b bVar4 = (com.revolut.feature.junior_onboarding.impl.ui.onboarding.b) this.receiver;
                bVar4.getClass();
                int i21 = di8.e.f114948a[p030.ordinal()];
                if (i21 == 1 || i21 == 2) {
                    IllegalStateException illegalStateException3 = new IllegalStateException(a0.d.s("Unexpected result of onboarding product article: ", o0.f186429a.b(yja.b.class).m(), ":", p030.name()));
                    h0 h0Var4 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException3, h0Var4);
                    bVar4.n2(new di8.j(bVar4, objArr == true ? 1 : 0, i5), new di8.d(bVar4, i6));
                } else {
                    if (i21 != 3 && i21 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar4.n2(new di8.j(bVar4, objArr2 == true ? 1 : 0, i5), new di8.d(bVar4, i6));
                }
                return Unit.f186387a;
            case 28:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                dki.g gVar2 = (dki.g) ((BaseFlow) this.receiver).S2();
                ArrayList arrayList = gVar2.f115534m;
                if (zBooleanValue) {
                    r10.f fVar5 = gVar2.f115536p;
                    if (fVar5 != null) {
                        FlowStateWrapper flowStateWrapper = (FlowStateWrapper) fVar5.b;
                        Intrinsics.checkNotNullParameter(flowStateWrapper, "<set-?>");
                        gVar2.f115533l = flowStateWrapper;
                        arrayList.add((FlowStateWrapper) fVar5.c);
                    }
                } else if (gVar2.b()) {
                    FlowStateWrapper flowStateWrapper2 = (FlowStateWrapper) arrayList.remove(v.j(arrayList));
                    Intrinsics.checkNotNullParameter(flowStateWrapper2, "<set-?>");
                    gVar2.f115533l = flowStateWrapper2;
                }
                return Unit.f186387a;
            default:
                ((Function0) this.receiver).invoke();
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(t tVar) {
        super(1, 0, kotlin.jvm.internal.s.class, tVar, "suspendConversion0", "scheduleNavAction$suspendConversion0(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        this.f = 29;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(BaseFlow baseFlow) {
        super(1, 0, BaseFlow.class, baseFlow, "onChildControllerManagerTransitionCanceled", "onChildControllerManagerTransitionCanceled(Z)V");
        this.f = 28;
    }
}
