package wk2;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.mobile_services.impl.map.GmsLatLngBounds;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardDirectDebitMandate;
import com.revolut.feature.insurance_car.impl.data.model.Answer;
import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.licence.LicenceFlowContract$Step;
import com.revolut.feature.payments.bills_chooser.api.splits.SplitMembersType;
import com.revolut.feature.payments.recipients.settings.models.RecipientPaymentsSettings;
import com.revolut.feature.robo.impl.ui.screen.templates.TemplatesScreenContract$Input;
import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import com.revolut.feature.tax_residency.api.BackNavigationType;
import com.revolut.feature.tax_residency.impl.v2.models.DeclaredTaxResidency;
import com.revolut.feature.tax_residency.impl.v2.ui.declaration_flow.TaxResidencyDeclarationFlowContract$UseCase;
import com.revolut.feature.tax_residency.impl.v2.ui.multi_residency_flow.MultiResidencyFlowContract$Step;
import com.revolut.feature.us_direct_deposit.impl.R$string;
import com.revolut.feature.wealth.models.robo.Template;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.api.AnalyticsAccountsSelection;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits.PlanBenefitsScreenContract$PlanReference;
import com.revolut.retail.feature.pricing_plans.waitlist.api.model.PricingPlanWaitlistEntry;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.wealth.models.screener.ScreenerCollection;
import com.youTransactor.uCube.rpc.Constants;
import d9.t0;
import ip0.pb0;
import ip0.w60;
import ip0.x60;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import nii.u1;
import nii.y0;
import vge.f1;
import vkm.v1;
import wm.b;
import xzg.q0;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class x implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f298226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f298227b;

    public /* synthetic */ x(Object obj2, int i) {
        this.f298226a = i;
        this.f298227b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v15 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        List list;
        nel.u uVar;
        Instant instant;
        Flow flowV;
        Object next2;
        int i = 20;
        int i2 = 24;
        int i3 = 23;
        int i5 = 3;
        boolean z = true;
        boolean z3 = true;
        final int i6 = 0;
        ?? r72 = 0;
        Object obj3 = null;
        Object obj4 = null;
        r72 = 0;
        switch (this.f298226a) {
            case 0:
                com.revolut.feature.atm.impl.ui.redesign.v2.map.a aVar = (com.revolut.feature.atm.impl.ui.redesign.v2.map.a) this.f298227b;
                hk2.c output = (hk2.c) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (Intrinsics.f(output, hk2.b.f152846a)) {
                    aVar.I2();
                } else {
                    if (!Intrinsics.f(output, hk2.a.f152845a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar.B2();
                }
                return Unit.f186387a;
            case 1:
                k kVar = (k) obj2;
                return k.a(kVar, false, null, false, false, false, 0, kVar.f298195g + 1, 0, false, null, (GmsLatLngBounds) this.f298227b, null, null, null, 15271);
            case 2:
                wkg.f fVar = (wkg.f) this.f298227b;
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                yji.l.a1(fVar, fVar.X1(new y0("loading_error_dialog", new nii.z(new TextLocalisedClause(R$string.direct_deposit_problem_paycheck_error_title, null, null, 14), new TextLocalisedClause(R$string.direct_deposit_problem_paycheck_error_description, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 4)), null, null, new wkg.e(fVar, r72, i6), 3);
                return Boolean.TRUE;
            case 3:
                PlanBenefitsScreenContract$PlanReference planBenefitsScreenContract$PlanReference = (PlanBenefitsScreenContract$PlanReference) this.f298227b;
                wkk.e update = (wkk.e) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return wkk.e.a(update, null, ((PlanBenefitsScreenContract$PlanReference.Tier) planBenefitsScreenContract$PlanReference).f103462a, 1);
            case 4:
                wl3.h hVar = (wl3.h) this.f298227b;
                Map map = (Map) obj2;
                Intrinsics.h(map);
                hVar.e = map;
                return Unit.f186387a;
            case 5:
                zm3.l lVar = (zm3.l) this.f298227b;
                List recipientSettings = (List) obj2;
                Intrinsics.checkNotNullParameter(recipientSettings, "recipientSettings");
                od0.h hVar2 = od0.i.Companion;
                Iterator it8 = recipientSettings.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (Intrinsics.f(((RecipientPaymentsSettings) next).f79672a, lVar.getCode())) {
                        }
                    } else {
                        next = null;
                    }
                }
                RecipientPaymentsSettings recipientPaymentsSettings = (RecipientPaymentsSettings) next;
                if (recipientPaymentsSettings != null && (list = recipientPaymentsSettings.f79674c) != null) {
                    Iterator it9 = list.iterator();
                    while (true) {
                        if (it9.hasNext()) {
                            Object next3 = it9.next();
                            if (((RecipientPaymentsSettings.Setting) next3).f79675a == iy9.c.HIDE_P2P_CHAT_HISTORY) {
                                obj4 = next3;
                            }
                        }
                    }
                    r72 = (RecipientPaymentsSettings.Setting) obj4;
                }
                hVar2.getClass();
                return od0.h.a(r72);
            case 6:
                yl5.a aVar2 = (yl5.a) this.f298227b;
                wl5.g updateState = (wl5.g) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return wl5.g.a(updateState, null, null, null, null, null, false, aVar2, 63);
            case 7:
                com.revolut.feature.junior_remote_login.impl.ui.screen.contact_picker.a aVar3 = (com.revolut.feature.junior_remote_login.impl.ui.screen.contact_picker.a) this.f298227b;
                el3.c result = (el3.c) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result == null) {
                    throw new NoWhenBranchMatchedException();
                }
                zm3.f fVarR = t0.r(result.f127236a);
                if (fVarR != null) {
                    aVar3.H2(aVar3.f77220r, new x(fVarR, 8));
                    aVar3.X1(new y0("ADD_CONTACT_PUBLIC_CONTRACT_OUTPUT_DATA_SUCCESS", new nii.j0((Clause) new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_done, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4094), false, 4));
                    return Unit.f186387a;
                }
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "JUNIOR_CONTACT_PICKER_SCREEN_MODEL_TAG", "Unsupported contact type was output.", null, h0Var);
                return Unit.f186387a;
            case 8:
                zm3.f fVar2 = (zm3.f) this.f298227b;
                wl8.g update2 = (wl8.g) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return wl8.g.a(update2, null, null, null, fVar2, fVar2, 7);
            case 9:
                q0 q0Var = (q0) this.f298227b;
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                List listK = zhm.v.k(new pb0(j6.a.q("stocks-buy-block-loading-list-id-", q0Var.name())), new pb0(j6.a.q("stocks-lending-loading-list-id-", q0Var.name())));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                return listK;
            case 10:
                final wm.l lVar2 = (wm.l) this.f298227b;
                opi.d dVar = lVar2.f298581j;
                final wm.b action = (wm.b) obj2;
                Intrinsics.checkNotNullParameter(action, "action");
                if (action instanceof wm.c) {
                    return new pfm.h(new kfm.a() { // from class: wm.j
                        @Override // kfm.a
                        public final void run() {
                            switch (i6) {
                                case 0:
                                    ((opi.b) lVar2.f298581j).Z(((c) action).f298572a);
                                    break;
                                default:
                                    opi.d dVar2 = lVar2.f298581j;
                                    ((b.a) action).getClass();
                                    ((opi.b) dVar2).N().b(false);
                                    break;
                            }
                        }
                    }, 2);
                }
                if (action instanceof wm.d) {
                    return ((opi.b) dVar).a0(((wm.d) action).f298573a);
                }
                if (action instanceof b.a) {
                    final boolean z4 = z3 ? 1 : 0;
                    return new pfm.h(new kfm.a() { // from class: wm.j
                        @Override // kfm.a
                        public final void run() {
                            switch (z4) {
                                case 0:
                                    ((opi.b) lVar2.f298581j).Z(((c) action).f298572a);
                                    break;
                                default:
                                    opi.d dVar2 = lVar2.f298581j;
                                    ((b.a) action).getClass();
                                    ((opi.b) dVar2).N().b(false);
                                    break;
                            }
                        }
                    }, 2);
                }
                if (Intrinsics.f(action, b.c.f298571a)) {
                    return ((opi.b) dVar).O();
                }
                if (Intrinsics.f(action, b.C1647b.f298570a)) {
                    return new pfm.h(new ty7.b(lVar2, i), 2);
                }
                throw new NoWhenBranchMatchedException();
            case 11:
                wm1.h hVar3 = (wm1.h) this.f298227b;
                Throwable it10 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                yji.l.a1(hVar3, hVar3.X1(hVar3.f298595q.b(it10)), null, null, null, 7);
                return Boolean.TRUE;
            case 12:
                wm3.l lVar3 = (wm3.l) this.f298227b;
                Throwable it11 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                if (it11 instanceof CancellationException) {
                    z = false;
                } else {
                    zhm.h0 h0Var2 = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, it11, h0Var2);
                    lVar3.X().d(new y0("ERROR_DIALOG_ID", new nii.z(new TextLocalisedClause(R.string.error_generic, null, null, 14), null, new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32758), false, 4));
                }
                return Boolean.valueOf(z);
            case 13:
                com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.licence.a aVar4 = (com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.licence.a) this.f298227b;
                Answer.LicenceType licenceType = (Answer.LicenceType) obj2;
                Intrinsics.checkNotNullParameter(licenceType, "licenceType");
                aVar4.E2(new LicenceFlowContract$Step.LicenceDuration(licenceType), true, null, false);
                return Unit.f186387a;
            case 14:
                wmd.c cVar = (wmd.c) this.f298227b;
                od0.i optionalJointAccount = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(optionalJointAccount, "optionalJointAccount");
                n38.a aVar5 = (n38.a) optionalJointAccount.c();
                AccountId.Joint jointC = l38.a.c(aVar5);
                String id10 = aVar5.f211924b;
                Intrinsics.checkNotNullParameter(id10, "id");
                return nim.a.v(cVar.f298639c.a(com.revolut.retail.feature.api.a.b(jointC)), new wg2.g(21, id10, jointC));
            case 15:
                AnalyticsAccountsSelection analyticsAccountsSelection = (AnalyticsAccountsSelection) this.f298227b;
                do3.n user = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(user, "user");
                return knd.f.b(analyticsAccountsSelection.getF99208a(), user.f116408a);
            case 16:
                wmh.i iVar = (wmh.i) this.f298227b;
                List instruments = (List) obj2;
                Intrinsics.checkNotNullParameter(instruments, "instruments");
                Instant instantA = iVar.d.a();
                ArrayList arrayList = new ArrayList();
                for (Object obj5 : instruments) {
                    nel.n nVar = (nel.n) obj5;
                    if (nVar.b() && (uVar = nVar.f214607s) != null && (instant = uVar.f214625b) != null && instant.isAfter(instantA)) {
                        arrayList.add(obj5);
                    }
                }
                if (arrayList.isEmpty()) {
                    return new go.g(zi0.c.P(new wmh.d(zhm.f0.f322471a), false, null, 3), 2);
                }
                zjh.f fVar3 = iVar.f298674b;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it12 = arrayList.iterator();
                while (it12.hasNext()) {
                    linkedHashSet.add(((nel.n) it12.next()).f214596b);
                }
                return nim.a.v(fVar3.z(linkedHashSet, w4l.i.f294643c), new wg2.g(iVar, arrayList, i3));
            case 17:
                wnb.c cVar2 = (wnb.c) this.f298227b;
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                SavingsAccountDetails savingsAccountDetails = (SavingsAccountDetails) pair.f186385a;
                od0.i iVar2 = (od0.i) pair.f186386b;
                pcd.s sVar = savingsAccountDetails.f86460a;
                if (sVar.f234889n != pcd.b.YOUTH) {
                    od0.i.Companion.getClass();
                    flowV = zi0.c.i(od0.i.f224256b);
                } else {
                    flowV = nim.a.v(cVar2.f298774b.w(sVar.f, zhm.u.c(sVar.f234881a)), new wl3.d(29));
                }
                return nim.a.v(flowV, new wg2.g(savingsAccountDetails, iVar2, i2));
            case 18:
                com.revolut.feature.robo.impl.ui.screen.templates.a aVar6 = (com.revolut.feature.robo.impl.ui.screen.templates.a) this.f298227b;
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                alc.n nVar2 = (alc.n) pair2.f186385a;
                List list2 = (List) pair2.f186386b;
                String str = nVar2.f;
                String str2 = nVar2.f6207a;
                if (str == null) {
                    throw new IllegalStateException(p.a.p("Portfolio ", str2, "  recommended template").toString());
                }
                Iterator it13 = list2.iterator();
                while (true) {
                    if (it13.hasNext()) {
                        next2 = it13.next();
                        if (Intrinsics.f(((Template) next2).f95706a, str)) {
                        }
                    } else {
                        next2 = null;
                    }
                }
                if (next2 == null) {
                    throw new IllegalStateException(p.a.p("Template with id ", str, " not found").toString());
                }
                Template template = (Template) next2;
                TemplatesScreenContract$Input templatesScreenContract$Input = aVar6.f85217a;
                if (!(templatesScreenContract$Input instanceof TemplatesScreenContract$Input.ChangeCurrentTemplate)) {
                    if (templatesScreenContract$Input instanceof TemplatesScreenContract$Input.ChangeInitialTemplate) {
                        return new wnc.j(list2, template, ((TemplatesScreenContract$Input.ChangeInitialTemplate) templatesScreenContract$Input).f85213b);
                    }
                    if (templatesScreenContract$Input instanceof TemplatesScreenContract$Input.SelectInitialTemplate) {
                        return new wnc.k(list2, template);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                String str3 = nVar2.e;
                if (str3 == null) {
                    throw new IllegalStateException(p.a.p("Portfolio ", str2, " has no current template").toString());
                }
                ListIterator listIterator = list2.listIterator(list2.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        Object objPrevious = listIterator.previous();
                        if (Intrinsics.f(((Template) objPrevious).f95706a, str3)) {
                            obj3 = objPrevious;
                        }
                    }
                }
                if (obj3 != null) {
                    return new wnc.i(list2, (Template) obj3, template);
                }
                throw new IllegalStateException(p.a.p("Template with id ", str3, " not found").toString());
            case 19:
                wo2.m mVar = (wo2.m) this.f298227b;
                oo2.l result2 = (oo2.l) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (Intrinsics.f(result2, oo2.j.f226999a)) {
                    mVar.H2(mVar.f298875r, new wnc.x(i5));
                    mVar.l2(new w76.a(mVar, r72, i2), new yi5.b(26));
                } else if (!Intrinsics.f(result2, oo2.k.f227000a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            case 20:
                NaviCommand naviCommand = (NaviCommand) obj2;
                sri.m mVar2 = ((wo5.h) this.f298227b).f298889b;
                Intrinsics.h(naviCommand);
                mVar2.c(naviCommand);
                return Unit.f186387a;
            case 21:
                com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.screen.invitation.a aVar7 = (com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.screen.invitation.a) this.f298227b;
                List entriesList = (List) obj2;
                Intrinsics.checkNotNullParameter(entriesList, "entriesList");
                PricingPlanWaitlistEntry pricingPlanWaitlistEntry = (PricingPlanWaitlistEntry) zhm.d0.d0(entriesList);
                return pricingPlanWaitlistEntry != null ? nim.a.v(aVar7.o.i(pricingPlanWaitlistEntry, w4l.i.f294643c), new wok.l(pricingPlanWaitlistEntry, 0)) : vkm.i.f290039a;
            case 22:
                wok.o oVar = (wok.o) this.f298227b;
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                oVar.getClass();
                return new wok.k(null, zhm.u.c(new x60("WaitlistInvitationStateMapper_loading", w60.BACKGROUND_ASSET, null)));
            case 23:
                wp4.i0 i0Var = (wp4.i0) this.f298227b;
                CreditCardDirectDebitMandate mandate = (CreditCardDirectDebitMandate) obj2;
                Intrinsics.checkNotNullParameter(mandate, "mandate");
                return new v0b.b(wp4.a0.f299030b[mandate.f70740b.ordinal()] == 1 ? new vkm.y(new wgb.v(i0Var, (Continuation) r72, i), new v0b.b(rd0.e.e(new v1(new wih.c(i0Var, mandate.f70741c, (Continuation) r72, 6)), zhm.h0.f322473a, new f1(i5, i3, r72)), i0Var, i2)) : new go.g(i0Var.F, 2), mandate, i3);
            case 24:
                ((ypi.i) this.f298227b).setLoading(((Boolean) obj2).booleanValue());
                return Unit.f186387a;
            case 25:
                com.revolut.feature.payments.bills_chooser.impl.ui.bills_split_summary.c cVar3 = (com.revolut.feature.payments.bills_chooser.impl.ui.bills_split_summary.c) this.f298227b;
                eii.k output2 = (eii.k) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                if (output2 instanceof eii.g) {
                    cVar3.A1(new wkg.e(cVar3, r72, 11), new yi5.b(25));
                }
                return Unit.f186387a;
            case 26:
                SplitMembersType splitMembersType = (SplitMembersType) this.f298227b;
                wp9.v update3 = (wp9.v) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return wp9.v.a(update3, null, null, null, splitMembersType, null, null, null, Constants.TAG_BLE_FIRMWARE_VERSION);
            case 27:
                wp9.v vVar = (wp9.v) this.f298227b;
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return new wp9.e0(iii.c.c(5), vVar.f);
            case 28:
                com.revolut.feature.tax_residency.impl.v2.ui.multi_residency_flow.c cVar4 = (com.revolut.feature.tax_residency.impl.v2.ui.multi_residency_flow.c) this.f298227b;
                upe.l output3 = (upe.l) obj2;
                Intrinsics.checkNotNullParameter(output3, "output");
                if (output3 instanceof upe.h) {
                    oki.h.w2(cVar4.f90288q, new MultiResidencyFlowContract$Step.AddTaxResidencyDeclaration(false, null, ((upe.h) output3).f281992a, BackNavigationType.BACK), ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a);
                } else if (output3 instanceof upe.i) {
                    upe.i iVar3 = (upe.i) output3;
                    cVar4.I2(iVar3.f281993a.f90159a, TaxResidencyDeclarationFlowContract$UseCase.Remove.f90229a, iVar3.f281994b);
                } else if (Intrinsics.f(output3, upe.j.f281995a)) {
                    cVar4.C2(wpe.c.f299227a);
                } else {
                    if (!(output3 instanceof upe.k)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    upe.k kVar2 = (upe.k) output3;
                    DeclaredTaxResidency declaredTaxResidency = kVar2.f281996a;
                    wi0.b bVar = declaredTaxResidency.f90159a;
                    String str4 = declaredTaxResidency.f90163h;
                    if (str4 == null) {
                        str4 = "";
                    }
                    cVar4.I2(bVar, new TaxResidencyDeclarationFlowContract$UseCase.Edit(str4, declaredTaxResidency.f90162g), kVar2.f281997b);
                }
                return Unit.f186387a;
            default:
                return wph.n.a((wph.n) obj2, null, null, ((ScreenerCollection) this.f298227b).f105155b, null, 23);
        }
    }
}
