package vgk;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import androidx.core.graphics.drawable.DrawableKt;
import ckj.d;
import cli.y;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.BitmapImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.data.model.Data;
import com.revolut.domain.models.moneyrequest.MoneyRequest;
import com.revolut.feature.add.new_product.api.declaration.AddNewProductDestination;
import com.revolut.feature.apm.bills.boleto.impl.finder.flow.BoletoFinderFlowContract$Step;
import com.revolut.feature.blue_prompt.BluePromptContent;
import com.revolut.feature.credit.card.impl.ui.instalment.create.InstalmentFlowContract$IneligibilityDialogType;
import com.revolut.feature.credit.card.impl.ui.instalment.create.InstalmentFlowContract$State;
import com.revolut.feature.credit.card.impl.ui.instalment.create.InstalmentFlowContract$Step;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.linked_accounts.LinkedAccountsConsentFlowContract$Step;
import com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.JuniorSecurityAndPrivacyControllerContract$ModalStep;
import com.revolut.feature.product.onboarding.domain.models.DateOfBirthValue;
import com.revolut.feature.rev_points.api.navigation.RevPointsFeatureConfig;
import com.revolut.feature.rev_points.buying.api.navigation.RevPointsBuyingDestination;
import com.revolut.feature.rfi_tool.impl.navigation.RfiToolFlowContract$Step;
import com.revolut.feature.shops.impl.R$string;
import com.revolut.feature.shops.impl.ui.bid_flow.ShopsBidFlowContract$Step;
import com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.destinations.ui.IncomeSorterDestinationsContract$ModalStep;
import com.revolut.feature.tab.accounts.api.exceptions.ProductAccountNotFoundException;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tax_residency.api.exemption.model.TaxExemptionAggregate;
import com.revolut.feature.vaults.api.navigation.VaultsKompotFeatureConfig$InvitationConfirmation$Destination;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.feature.wealth.models.robo.RoboPortfolioInfo;
import com.revolut.feature.wealth.ui.api.WealthUiApi$Toggles;
import com.revolut.feature.web_sign_in.ui.flow.web_sign_in.WebSignInFlowContract$State;
import com.revolut.feature.web_sign_in.ui.flow.web_sign_in.WebSignInFlowContract$Step;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.feature.esim.api.model.EsimProfile;
import com.revolut.retail.trading.core.domain.orders.PortfolioRecurringOrder;
import com.revolut.shared.feature.user_declarations.api.navigation.DateOfBirthControllerDescriptor$OutputData;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import dfl.i0;
import et6.h1;
import et6.i2;
import ggk.k1;
import ggk.o1;
import grl.k9;
import hha.w0;
import ip0.nb0;
import ip0.pb0;
import ip0.v7;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import k4l.r0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import nii.h0;
import nii.j0;
import nii.l0;
import nii.u1;
import nii.w1;
import nii.y0;
import nii.z;
import tol.d;
import vge.z1;
import vha.t0;
import vkm.j2;
import vo8.v;
import vpd.e0;
import vpd.g0;
import vpd.z0;
import xid.d;
import zfk.c;
import zh9.u0;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f289195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f289196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f289197c;

    public /* synthetic */ f(Object obj2, Object obj3, int i) {
        this.f289195a = i;
        this.f289196b = obj2;
        this.f289197c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v4 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String str;
        TaxExemptionAggregate taxExemptionAggregate;
        TaxExemptionAggregate taxExemptionAggregate2;
        String strK;
        Object next;
        int i;
        Object next2;
        int i2 = this.f289195a;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        int i3 = 14;
        int i5 = 3;
        final int i6 = 1;
        final int iG = 0;
        ?? r72 = 0;
        strK = null;
        String strK2 = null;
        Object obj3 = this.f289197c;
        Object obj4 = this.f289196b;
        switch (i2) {
            case 0:
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.d dVar = (com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.d) obj4;
                zm3.l lVar = (zm3.l) obj3;
                c.b it8 = (c.b) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                if (it8 instanceof zfk.i) {
                    dVar.l2(new vge.r(dVar, lVar, r72, 5), new yi5.b(26));
                } else {
                    if (!(it8 instanceof zfk.g)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dVar.C1(u0.b(dVar.f103015t.d()));
                }
                return Unit.f186387a;
            case 1:
                ProductAccountId productAccountId = (ProductAccountId) obj4;
                t0 t0Var = ((vha.i) obj3).f289374c;
                vf0.k kVar = (vf0.k) obj2;
                Intrinsics.checkNotNullParameter(kVar, "<destruct>");
                bia.b bVar = (bia.b) kVar.f288454a;
                List list = (List) kVar.f288455b;
                dj0.d dVar2 = (dj0.d) kVar.f288456c;
                List list2 = (List) kVar.d;
                Set set = (Set) kVar.e;
                Iterator it9 = list2.iterator();
                while (true) {
                    if (it9.hasNext()) {
                        Object next3 = it9.next();
                        if (Intrinsics.f(((io3.d) next3).f163145a, productAccountId.f89729a)) {
                            r72 = next3;
                        }
                    }
                }
                io3.d dVar3 = (io3.d) r72;
                String str2 = productAccountId.f89729a;
                sha.b.Companion.getClass();
                if (Intrinsics.f(str2, sha.a.f263448b) && list2.size() > 1) {
                    return t0Var.c(bVar, list, dVar2);
                }
                if (dVar3 != null) {
                    return t0Var.e(dVar3, bVar, list, dVar2, set.contains(dVar3.f163145a));
                }
                throw new ProductAccountNotFoundException(p.a.p("ProductAccount with id:", productAccountId.f89729a, " cannot be found in the Pro product!"));
            case 2:
                vha.s sVar = (vha.s) obj4;
                xi0.b baseCurrency = (xi0.b) obj2;
                Intrinsics.checkNotNullParameter(baseCurrency, "currency");
                h1 h1Var = sVar.f289429c;
                w4l.k loadingStrategy = c8g.c.C((sfe.a) obj3);
                Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                akg.n nVarD = ((i2) h1Var.e).d(baseCurrency, loadingStrategy);
                kotlin.coroutines.g gVar = kotlin.coroutines.g.f186406a;
                return nim.a.w(kli.a.h(rd0.e.c(nVarD, gVar), rd0.e.c(new ahe.l(sVar.f289433l.k(), 24), gVar)), new f(sVar, baseCurrency, i5));
            case 3:
                xi0.b bVar2 = (xi0.b) obj3;
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list3 = (List) pair.f186385a;
                Set set2 = (Set) pair.f186386b;
                if (((vha.s) obj4).f289433l.c()) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj5 : list3) {
                        if (!set2.contains(((io3.d) ((m71.a) obj5).f203279b).f163145a)) {
                            arrayList.add(obj5);
                        }
                    }
                    list3 = arrayList;
                }
                return do3.q.z(list3, bVar2);
            case 4:
                com.revolut.feature.shops.impl.ui.bid_flow.c cVar = (com.revolut.feature.shops.impl.ui.bid_flow.c) obj4;
                qki.d dVar4 = cVar.f87143r;
                String str3 = (String) obj3;
                xid.d result = (xid.d) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof xid.e) {
                    cVar.H2(dVar4, new g(19));
                    yji.l.a1(cVar, cVar.X1(new y0(null, new j0((Clause) new TextLocalisedClause(R$string.shops_screens_auction_details_success_sheet_title, u.c(nub.a.p(((xid.e) result).f306328a, null, null, 7)), null, 12), (Clause) new TextLocalisedClause(R$string.shops_screens_auction_details_success_sheet_subtitle, null, null, 14), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) new w1(6, new TextLocalisedClause(R$string.shops_screens_auction_details_success_sheet_action, null, null, 14), null), false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4076), false, 5)), null, null, new vid.f(cVar, r72, iG), 3);
                } else if (result instanceof d.a) {
                    cVar.H2(dVar4, new g(i3));
                    yji.l.a1(cVar, cVar.X1(new y0(null, new l0(new TextLocalisedClause(R$string.shops_screens_auction_details_bid_unavailable_title, null, null, 14), new TextLocalisedClause(R$string.shops_screens_auction_details_bid_unavailable_subtitle, null, null, 14), null, new TextLocalisedClause(R$string.shops_screens_auction_details_bid_unavailable_action, null, null, 14), null, null, false, null, 1012), false, 5)), null, null, new com.revolut.feature.shops.impl.ui.bid_flow.b(cVar, str3, null), 3);
                } else if (result instanceof xid.g) {
                    xid.g gVar2 = (xid.g) result;
                    oki.h.w2(cVar.f87144s, new ShopsBidFlowContract$Step.CustomBidInput(gVar2.f306330a, gVar2.f306332c, gVar2.d, str3, gVar2.f306331b), bottom_dialog);
                } else if (result instanceof d.b) {
                    cVar.H2(dVar4, new g(15));
                    yji.l.a1(cVar, cVar.X1(new y0(null, new j0((Clause) new TextLocalisedClause(R$string.shops_screens_auction_details_user_won_sheet_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.shops_screens_auction_details_user_won_sheet_subtitle, null, null, 14), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) new w1(6, new TextLocalisedClause(R$string.shops_screens_auction_details_success_sheet_action, null, null, 14), null), false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, h0.CONFETTI, (ResourceImage) null, 3052), false, 5)), null, null, new vid.f(cVar, r72, i6), 3);
                } else if (result instanceof xid.f) {
                    cVar.H2(dVar4, new vh2.j(result, 7));
                    cVar.C1(new RevPointsBuyingDestination(cVar.f87142q));
                } else {
                    if (!(result instanceof d.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cVar.C1(new BridgeDestination(gc0.c.f(new RevPointsFeatureConfig.RevPointsEarnConfig(iG))));
                }
                return Unit.f186387a;
            case 5:
                DateOfBirthControllerDescriptor$OutputData result2 = (DateOfBirthControllerDescriptor$OutputData) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                String str4 = result2.f105052a.format((DateTimeFormatter) obj4);
                Intrinsics.h(str4);
                ((com.revolut.feature.product.onboarding.flow.a) obj3).J2("DATE_OF_BIRTH", new DateOfBirthValue(str4));
                return Unit.f186387a;
            case 6:
                vjh.e eVar = (vjh.e) obj4;
                WealthAccount wealthAccount = (WealthAccount) obj3;
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                if (!(wealthAccount instanceof WealthAccount.Robo)) {
                    eVar.getClass();
                } else if (((jte.d) eVar.f).c(WealthUiApi$Toggles.RoboStrategies.f95863c)) {
                    return f0.f322471a;
                }
                IntRange intRangeO = kotlin.ranges.f.o(0, 3);
                ArrayList arrayList2 = new ArrayList(w.t(intRangeO, 10));
                vim.f it10 = intRangeO.iterator();
                while (it10.f289625c) {
                    int iNextInt = it10.nextInt();
                    arrayList2.add(new pb0("PRODUCT_WIDGET_LOADING_" + jjh.b.c(wealthAccount) + iNextInt));
                }
                yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
                return arrayList2;
            case 7:
                com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.c cVar2 = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.c) obj4;
                EsimProfile esimProfile = (EsimProfile) obj3;
                ckj.d result3 = (ckj.d) obj2;
                Intrinsics.checkNotNullParameter(result3, "result");
                if (!Intrinsics.f(result3, d.a.f24855a)) {
                    throw new NoWhenBranchMatchedException();
                }
                cVar2.B.b3(esimProfile);
                return Unit.f186387a;
            case 8:
                com.revolut.feature.rfi_tool.impl.navigation.b bVar3 = (com.revolut.feature.rfi_tool.impl.navigation.b) obj4;
                RfiToolFlowContract$Step.Form form = (RfiToolFlowContract$Step.Form) obj3;
                m90.b result4 = (m90.b) obj2;
                Intrinsics.checkNotNullParameter(result4, "result");
                if (!(result4 instanceof m90.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar3.l2(new com.revolut.feature.rfi_tool.impl.navigation.a(form, bVar3, null), new vkc.f(bVar3, 1));
                return Unit.f186387a;
            case 9:
                com.revolut.feature.external_accounts.impl.ui.consents_kompot.linked_accounts.a aVar = (com.revolut.feature.external_accounts.impl.ui.consents_kompot.linked_accounts.a) obj4;
                LinkedAccountsConsentFlowContract$Step linkedAccountsConsentFlowContract$Step = (LinkedAccountsConsentFlowContract$Step) obj3;
                dii.g result5 = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(result5, "result");
                if (!Intrinsics.f(result5, dii.f.f115069a) && (result5 instanceof dii.e)) {
                    aVar.l2(new vge.r(aVar, ((LinkedAccountsConsentFlowContract$Step.RevokeDialog) linkedAccountsConsentFlowContract$Step).f72797a, r72, 24), new yi5.b(26));
                }
                return Unit.f186387a;
            case 10:
                ao3.a aVar2 = (ao3.a) obj4;
                vlg.e update = (vlg.e) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                ilg.b bVar4 = ((vlg.e) ((j2) ((vlg.s) obj3).f290446q.f22677a).getValue()).f290434c;
                String str5 = aVar2.f7897c;
                if (str5.length() == 0 && (str = aVar2.f7895a) != null) {
                    str5 = str;
                }
                return vlg.e.a(update, null, aVar2, ilg.b.a(bVar4, null, null, null, null, null, null, new ilg.a(str5), null, 191), 1);
            case 11:
                zm3.l revolutContact = (zm3.l) obj2;
                Intrinsics.checkNotNullParameter(revolutContact, "revolutContact");
                return (efm.f) ((Function2) obj4).invoke((MoneyRequest) obj3, revolutContact);
            case 12:
                ((vli.k) obj4).h((zm3.l) obj3, new TextLocalisedClause(com.revolut.retail.feature.payments.money_request.core.R$string.send_request_quick_action_failed_operation_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.feature.payments.money_request.core.R$string.send_request_quick_action_failed_reject_subtitle, null, null, 14), jz9.b.ERROR);
                return Unit.f186387a;
            case 13:
                Data layout = (Data) obj4;
                vlk.s sVar2 = (vlk.s) obj3;
                vlk.m mVar = (vlk.m) obj2;
                o1 o1Var = (o1) layout.getContent();
                if (o1Var != null) {
                    ArrayList arrayList3 = o1Var.f143767b;
                    if (mVar.f290488a.getContent() == null) {
                        Iterator it11 = arrayList3.iterator();
                        int i21 = 0;
                        while (true) {
                            if (it11.hasNext()) {
                                w0 w0Var = ((k1) it11.next()).f143741a;
                                if (w0Var != sVar2.o.f103519c || w0Var == null) {
                                    i21++;
                                }
                            } else {
                                i21 = -1;
                            }
                        }
                        Integer numValueOf = i21 >= 0 ? Integer.valueOf(i21) : null;
                        if (numValueOf != null) {
                            iG = numValueOf.intValue();
                        }
                    } else {
                        int i22 = mVar.f290489b;
                        int size = arrayList3.size() - 1;
                        if (size < 0) {
                            size = 0;
                        }
                        iG = kotlin.ranges.f.g(i22, 0, size);
                    }
                } else {
                    iG = mVar.f290489b;
                }
                mVar.getClass();
                Intrinsics.checkNotNullParameter(layout, "layout");
                return new vlk.m(layout, iG);
            case 14:
                com.revolut.feature.apm.bills.boleto.impl.finder.flow.a aVar3 = (com.revolut.feature.apm.bills.boleto.impl.finder.flow.a) obj4;
                yki.b bVar5 = (yki.b) obj3;
                ym1.f result6 = (ym1.f) obj2;
                Intrinsics.checkNotNullParameter(result6, "result");
                if (Intrinsics.f(result6, ym1.e.f314832a)) {
                    oki.h.t2(aVar3, bVar5, BoletoFinderFlowContract$Step.HiddenBoletos.f61170a, true, null, false, 12);
                } else {
                    if (!Intrinsics.f(result6, ym1.d.f314831a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oki.h.w2(bVar5, BoletoFinderFlowContract$Step.DeactivateBoletoFinder.f61169a, bottom_dialog);
                }
                return Unit.f186387a;
            case 15:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                RoboPortfolioInfo roboPortfolioInfo = (RoboPortfolioInfo) pair2.f186385a;
                od0.i iVar = (od0.i) pair2.f186386b;
                nmc.k kVar2 = ((vmc.a) obj4).f290556c;
                return new glc.i(roboPortfolioInfo, nmc.k.a((i0) obj3), (PortfolioRecurringOrder) iVar.f224257a);
            case 16:
                vmh.k kVar3 = (vmh.k) obj4;
                vmh.f fVar = (vmh.f) obj3;
                a2b.f output = (a2b.f) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (!Intrinsics.f(output, a2b.f.f724a)) {
                    throw new NoWhenBranchMatchedException();
                }
                kVar3.X2(kVar3.f290594p, new vh2.j(fVar, 17));
                return Unit.f186387a;
            case 17:
                Data exemptions = (Data) obj4;
                y yVar = ((vne.i) obj3).f290805s;
                vne.c cVar3 = (vne.c) obj2;
                if (exemptions.getContent() != null) {
                    List list4 = (List) exemptions.getContent();
                    if (list4 != null) {
                        Iterator it12 = list4.iterator();
                        while (true) {
                            if (it12.hasNext()) {
                                next = it12.next();
                                if (Intrinsics.f(kotlin.jvm.internal.s.k((TaxExemptionAggregate) next), ((vne.c) ((j2) yVar.f22677a).getValue()).f290798b)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        taxExemptionAggregate = (TaxExemptionAggregate) next;
                    } else {
                        taxExemptionAggregate = null;
                    }
                    if (taxExemptionAggregate == null || (strK = kotlin.jvm.internal.s.k(taxExemptionAggregate)) == null) {
                        List list5 = (List) exemptions.getContent();
                        if (list5 != null && (taxExemptionAggregate2 = (TaxExemptionAggregate) d0.d0(list5)) != null) {
                            strK2 = kotlin.jvm.internal.s.k(taxExemptionAggregate2);
                        }
                    } else {
                        strK2 = strK;
                    }
                } else {
                    strK2 = ((vne.c) ((j2) yVar.f22677a).getValue()).f290798b;
                }
                cVar3.getClass();
                Intrinsics.checkNotNullParameter(exemptions, "exemptions");
                return new vne.c(exemptions, strK2);
            case 18:
                okl.d dVar5 = (okl.d) obj4;
                vnl.p pVar = (vnl.p) obj3;
                uni.g result7 = (uni.g) obj2;
                Intrinsics.checkNotNullParameter(result7, "result");
                if (result7 instanceof uni.e) {
                    dVar5.invoke(new vnl.i(((uni.e) result7).f281439a));
                } else {
                    if (!(result7 instanceof uni.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    pVar.getClass();
                    yji.n.l2(pVar, pVar.L2(new y0("DIALOG_ID_OTP_PUSH_TIMED_OUT", new z(new TextLocalisedClause(com.revolut.otp.input.R$string.revolut_sso_confirm_push_screen_dialog_timed_out_title, null, null, 14), new TextLocalisedClause(com.revolut.otp.input.R$string.revolut_sso_confirm_push_screen_dialog_timed_out_description, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 4)), null, new z1(dVar5, r72, 10), 3);
                }
                return Unit.f186387a;
            case 19:
                com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b bVar6 = (com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b) obj4;
                JuniorSecurityAndPrivacyControllerContract$ModalStep juniorSecurityAndPrivacyControllerContract$ModalStep = (JuniorSecurityAndPrivacyControllerContract$ModalStep) obj3;
                po8.e it13 = (po8.e) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                if (Intrinsics.f(it13, po8.c.f237901a)) {
                    int i32 = v.f290918a[((JuniorSecurityAndPrivacyControllerContract$ModalStep.PaymentsSettingsExplanatory) juniorSecurityAndPrivacyControllerContract$ModalStep).f77329a.ordinal()];
                    if (i32 == 1) {
                        i = com.revolut.feature.junior_settings.impl.R$string.youth_settings_disable_contact_discoverability_sheet_toast_disabled;
                    } else {
                        if (i32 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i = com.revolut.feature.junior_settings.impl.R$string.youth_settings_disable_revtag_discoverability_sheet_toast_disabled;
                    }
                    bVar6.X1(new mii.k("DIALOG_ID_SETTING_CHANGED", new TextLocalisedClause(i, null, null, 14), null, null, null, 28));
                } else if (!Intrinsics.f(it13, po8.d.f237902a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            case 20:
                com.revolut.sso.impl.ui.protection_check.flow.a aVar4 = (com.revolut.sso.impl.ui.protection_check.flow.a) obj4;
                yki.l lVar2 = (yki.l) obj3;
                tol.d outputData = (tol.d) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if (outputData instanceof d.a) {
                    aVar4.C1(new ExternalDestination.ByIntent(new Intent("android.settings.SECURITY_SETTINGS"), 12321));
                } else {
                    if (!(outputData instanceof d.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oki.h.D2(lVar2);
                }
                return Unit.f186387a;
            case 21:
                com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.destinations.ui.a aVar5 = (com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.destinations.ui.a) obj4;
                final IncomeSorterDestinationsContract$ModalStep.WealthAssetSelection wealthAssetSelection = (IncomeSorterDestinationsContract$ModalStep.WealthAssetSelection) obj3;
                y1h.d it14 = (y1h.d) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                y yVar2 = aVar5.v;
                vpd.c cVar4 = (vpd.c) ((vpd.d) ((j2) yVar2.f22677a).getValue()).f291156a.getContent();
                if (cVar4 != null) {
                    ArrayList arrayList4 = cVar4.f291153b;
                    final Set setL = nkm.y.L(nkm.y.x(nkm.y.n(d0.Q(it14.f310381a), vpd.d0.f291159a), new vn8.a(17)));
                    Set setL2 = nkm.y.L(nkm.y.n(nkm.y.n(d0.Q(arrayList4), e0.f291163a), new Function1() { // from class: vpd.z
                        /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
                        /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
                        @Override // kotlin.jvm.functions.Function1
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object invoke(java.lang.Object r4) {
                            /*
                                r3 = this;
                                int r0 = r3
                                switch(r0) {
                                    case 0: goto L39;
                                    default: goto L5;
                                }
                            L5:
                                com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo$Investment$CashHolding r4 = (com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo.Investment.CashHolding) r4
                                java.lang.String r0 = "it"
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                                java.lang.String r0 = r4.e
                                com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.destinations.ui.IncomeSorterDestinationsContract$ModalStep$WealthAssetSelection r1 = r1
                                java.lang.String r2 = r1.f87728c
                                boolean r0 = kotlin.jvm.internal.Intrinsics.f(r0, r2)
                                if (r0 == 0) goto L33
                                com.revolut.feature.spending_analytics.api.models.income_sorter.a r0 = r4.f
                                com.revolut.feature.spending_analytics.api.models.income_sorter.a r1 = r1.f87726a
                                if (r0 != r1) goto L33
                                xi0.b r0 = r4.f87465a
                                java.lang.String r0 = r0.f306286a
                                java.lang.String r4 = r4.e
                                kotlin.Pair r1 = new kotlin.Pair
                                r1.<init>(r0, r4)
                                java.util.Set r4 = r2
                                boolean r4 = r4.contains(r1)
                                if (r4 == 0) goto L33
                                r4 = 1
                                goto L34
                            L33:
                                r4 = 0
                            L34:
                                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
                                return r4
                            L39:
                                com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo$Investment$Instrument r4 = (com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo.Investment.Instrument) r4
                                java.lang.String r0 = "it"
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                                java.lang.String r0 = r4.f87475j
                                com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.destinations.ui.IncomeSorterDestinationsContract$ModalStep$WealthAssetSelection r1 = r1
                                java.lang.String r2 = r1.f87728c
                                boolean r0 = kotlin.jvm.internal.Intrinsics.f(r0, r2)
                                if (r0 == 0) goto L5e
                                com.revolut.feature.spending_analytics.api.models.income_sorter.a r0 = r4.k
                                com.revolut.feature.spending_analytics.api.models.income_sorter.a r1 = r1.f87726a
                                if (r0 != r1) goto L5e
                                java.lang.String r4 = r4.f87470a
                                java.util.Set r0 = r2
                                boolean r4 = r0.contains(r4)
                                if (r4 == 0) goto L5e
                                r4 = 1
                                goto L5f
                            L5e:
                                r4 = 0
                            L5f:
                                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
                                return r4
                            */
                            throw new UnsupportedOperationException("Method not decompiled: vpd.z.invoke(java.lang.Object):java.lang.Object");
                        }
                    }));
                    final Set setL3 = nkm.y.L(nkm.y.x(nkm.y.n(d0.Q(it14.f310381a), vpd.f0.f291164a), new vn8.a(16)));
                    Set setL4 = nkm.y.L(nkm.y.n(nkm.y.n(d0.Q(arrayList4), g0.f291166a), new Function1() { // from class: vpd.z
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object v) {
                            /*
                                this = this;
                                int r0 = r3
                                switch(r0) {
                                    case 0: goto L39;
                                    default: goto L5;
                                }
                            L5:
                                com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo$Investment$CashHolding r4 = (com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo.Investment.CashHolding) r4
                                java.lang.String r0 = "it"
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                                java.lang.String r0 = r4.e
                                com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.destinations.ui.IncomeSorterDestinationsContract$ModalStep$WealthAssetSelection r1 = r1
                                java.lang.String r2 = r1.f87728c
                                boolean r0 = kotlin.jvm.internal.Intrinsics.f(r0, r2)
                                if (r0 == 0) goto L33
                                com.revolut.feature.spending_analytics.api.models.income_sorter.a r0 = r4.f
                                com.revolut.feature.spending_analytics.api.models.income_sorter.a r1 = r1.f87726a
                                if (r0 != r1) goto L33
                                xi0.b r0 = r4.f87465a
                                java.lang.String r0 = r0.f306286a
                                java.lang.String r4 = r4.e
                                kotlin.Pair r1 = new kotlin.Pair
                                r1.<init>(r0, r4)
                                java.util.Set r4 = r2
                                boolean r4 = r4.contains(r1)
                                if (r4 == 0) goto L33
                                r4 = 1
                                goto L34
                            L33:
                                r4 = 0
                            L34:
                                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
                                return r4
                            L39:
                                com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo$Investment$Instrument r4 = (com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo.Investment.Instrument) r4
                                java.lang.String r0 = "it"
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                                java.lang.String r0 = r4.f87475j
                                com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.destinations.ui.IncomeSorterDestinationsContract$ModalStep$WealthAssetSelection r1 = r1
                                java.lang.String r2 = r1.f87728c
                                boolean r0 = kotlin.jvm.internal.Intrinsics.f(r0, r2)
                                if (r0 == 0) goto L5e
                                com.revolut.feature.spending_analytics.api.models.income_sorter.a r0 = r4.k
                                com.revolut.feature.spending_analytics.api.models.income_sorter.a r1 = r1.f87726a
                                if (r0 != r1) goto L5e
                                java.lang.String r4 = r4.f87470a
                                java.util.Set r0 = r2
                                boolean r4 = r0.contains(r4)
                                if (r4 == 0) goto L5e
                                r4 = 1
                                goto L5f
                            L5e:
                                r4 = 0
                            L5f:
                                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
                                return r4
                            */
                            throw new UnsupportedOperationException("Method not decompiled: vpd.z.invoke(java.lang.Object):java.lang.Object");
                        }
                    }));
                    vpd.l lVar3 = ((vpd.d) ((j2) yVar2.f22677a).getValue()).f291157b;
                    vpd.j jVar = lVar3 instanceof vpd.j ? (vpd.j) lVar3 : null;
                    if (jVar != null) {
                        Set set3 = jVar.f291169a;
                        ArrayList arrayList5 = new ArrayList();
                        ArrayList arrayList6 = new ArrayList();
                        for (Object obj6 : set3) {
                            IncomeSorterDestinationInfo incomeSorterDestinationInfo = (IncomeSorterDestinationInfo) obj6;
                            if ((incomeSorterDestinationInfo instanceof IncomeSorterDestinationInfo.Investment) && Intrinsics.f(((IncomeSorterDestinationInfo.Investment) incomeSorterDestinationInfo).getF87475j(), wealthAssetSelection.f87728c)) {
                                arrayList5.add(obj6);
                            } else {
                                arrayList6.add(obj6);
                            }
                        }
                        aVar5.H2(yVar2, new sc7.b(cVar4, setL2, setL4, jVar, arrayList6));
                    }
                }
                return Unit.f186387a;
            case 22:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                aim.e eVarB = u.b();
                v7.C("PERSONAL_SECTION_HEADER_ID", 0, 0, 30, eVarB);
                nb0 nb0Var = pb0.Companion;
                List listK = zhm.v.k(nb0.b(nb0Var, "ROW_LOADING_ID1", false, 0, false, 30), nb0.b(nb0Var, "ROW_LOADING_ID2", false, 0, false, 30), nb0.b(nb0Var, "ROW_LOADING_ID3", false, 0, false, 30));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                eVarB.addAll(listK);
                return new vpd.p(u.a(eVarB), (TextLocalisedClause) obj4, (TextLocalisedClause) obj3, vpd.m.f291174a);
            case 23:
                vpg.e eVar2 = (vpg.e) obj4;
                String str6 = (String) obj3;
                Pair pair3 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                od0.i iVar2 = (od0.i) pair3.f186385a;
                List list6 = (List) pair3.f186386b;
                Intrinsics.h(list6);
                Iterator it15 = list6.iterator();
                while (true) {
                    if (it15.hasNext()) {
                        next2 = it15.next();
                        if (Intrinsics.f(((pcd.s) next2).f234881a, str6)) {
                        }
                    } else {
                        next2 = null;
                    }
                }
                pcd.s sVar3 = (pcd.s) next2;
                if (sVar3 != null) {
                    rfm.u uVarG = efm.k.g(((aqg.b) eVar2.d).a(sVar3));
                    Intrinsics.checkNotNullExpressionValue(uVarG, "just(...)");
                    return uVarG;
                }
                if (iVar2.d()) {
                    rfm.u uVarG2 = efm.k.g(u0.f(new VaultsKompotFeatureConfig$InvitationConfirmation$Destination((pcd.v) iVar2.c())));
                    Intrinsics.checkNotNullExpressionValue(uVarG2, "just(...)");
                    return uVarG2;
                }
                FeatureCommand featureCommandB = vpg.e.b();
                com.revolut.feature.blue_prompt.fullscreen.a aVar6 = ms2.g.Companion;
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.vaults.R$string.accounts_prompt_removed_title, null, null, 14);
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.vaults.R$string.accounts_prompt_removed_description, null, null, 14);
                BluePromptContent.MediaContent mediaContent = new BluePromptContent.MediaContent(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3d151", null, null, null, 30));
                TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.vaults.R$string.accounts_prompt_removed_action_primary_title, null, null, 14);
                FinishCommand finishCommand = new FinishCommand(null, null, null, 7);
                TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(com.revolut.feature.vaults.R$string.accounts_prompt_removed_action_secondary_title, null, null, 14);
                CompositeCommand compositeCommandC = com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), u0.f(new AddNewProductDestination((qf1.c) null, 3)));
                k9 k9Var = k9.Savings;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                rfm.u uVarG3 = efm.k.g(com.revolut.retail.core.navigation.a.c(featureCommandB, com.revolut.feature.blue_prompt.fullscreen.a.a(aVar6, textLocalisedClause, textLocalisedClause2, mediaContent, null, textLocalisedClause3, textLocalisedClause4, finishCommand, compositeCommandC, null, null, null, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), 33291313)));
                Intrinsics.checkNotNullExpressionValue(uVarG3, "just(...)");
                return uVarG3;
            case 24:
                vq0.h hVar = (vq0.h) obj3;
                Boolean bool = (Boolean) obj2;
                nu0.d progressAnimatedView = ((nu0.m) obj4).getProgressAnimatedView();
                if (bool.booleanValue() && !hVar.f291294g) {
                    nu0.d.d(progressAnimatedView, true, new vq0.f(hVar, 2), null, 4);
                }
                if (!bool.booleanValue() && hVar.f291294g) {
                    nu0.d.d(progressAnimatedView, false, null, new vq0.f(hVar, 3), 2);
                }
                return Unit.f186387a;
            case 25:
                vr0.d dVar6 = (vr0.d) obj4;
                Image image = (Image) obj3;
                Drawable drawable = (Drawable) obj2;
                if (drawable == null) {
                    dVar6.f291458l.add(image);
                }
                dVar6.k.remove(image);
                if (drawable != null) {
                    if (((BitmapImage) dVar6.f291457j.put(image, new BitmapImage(DrawableKt.toBitmap$default(drawable, 0, 0, null, 7, null), false, new ImageTransformations((CircleTransformation) null, false, false, (Integer) null, (Integer) null, (Integer) null, 503), 8))) != null) {
                        dVar6.f291454c.p(image);
                    }
                }
                return Unit.f186387a;
            case 26:
                InstalmentFlowContract$State update2 = (InstalmentFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return InstalmentFlowContract$State.a(update2, ((ft4.p) obj4).v0(), null, (io3.l) obj3, 21);
            case 27:
                InstalmentFlowContract$Step instalmentFlowContract$Step = (InstalmentFlowContract$Step) obj4;
                com.revolut.feature.credit.card.impl.ui.instalment.create.b bVar7 = (com.revolut.feature.credit.card.impl.ui.instalment.create.b) obj3;
                zx4.d result8 = (zx4.d) obj2;
                Intrinsics.checkNotNullParameter(result8, "result");
                if (result8 instanceof zx4.b) {
                    InstalmentFlowContract$IneligibilityDialogType instalmentFlowContract$IneligibilityDialogType = ((InstalmentFlowContract$Step.IneligibilityExplainer) instalmentFlowContract$Step).f69335a;
                    if ((instalmentFlowContract$IneligibilityDialogType instanceof InstalmentFlowContract$IneligibilityDialogType.OverduePlans) || (instalmentFlowContract$IneligibilityDialogType instanceof InstalmentFlowContract$IneligibilityDialogType.RestrictedInstalmentPlans)) {
                        oki.h.t2(bVar7, bVar7.f69348x, new InstalmentFlowContract$Step.Repay(null), false, null, false, 14);
                    } else if (instalmentFlowContract$IneligibilityDialogType instanceof InstalmentFlowContract$IneligibilityDialogType.UtilizationLimit) {
                        oki.h.t2(bVar7, bVar7.f69348x, new InstalmentFlowContract$Step.Repay(((InstalmentFlowContract$IneligibilityDialogType.UtilizationLimit) instalmentFlowContract$IneligibilityDialogType).f69319b), false, null, false, 14);
                    } else {
                        if (!(instalmentFlowContract$IneligibilityDialogType instanceof InstalmentFlowContract$IneligibilityDialogType.ActiveForbearance)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        int i33 = jli.h.f175850a;
                    }
                }
                return Unit.f186387a;
            case 28:
                InstrumentTicker it16 = (InstrumentTicker) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                p2b.c cVar5 = ((vrb.l) obj4).u;
                r0 r0Var = r0.MARKET;
                cVar5.getClass();
                return mif.a.P(p2b.c.a(it16, (bfl.g) obj3, r0Var), 0, 3);
            default:
                com.revolut.feature.web_sign_in.ui.flow.web_sign_in.a aVar7 = (com.revolut.feature.web_sign_in.ui.flow.web_sign_in.a) obj4;
                String str7 = (String) obj3;
                trh.c result9 = (trh.c) obj2;
                Intrinsics.checkNotNullParameter(result9, "result");
                ((WebSignInFlowContract$State) aVar7.A2().f98429a).getClass();
                aVar7.L2(new WebSignInFlowContract$State(str7));
                if (result9 instanceof trh.a) {
                    trh.a aVar8 = (trh.a) result9;
                    aVar7.E2(new WebSignInFlowContract$Step.Confirmation(aVar8.f273793a, null, aVar8.d, aVar8.f273794b, aVar8.f273795c), false, null, false);
                } else {
                    if (!(result9 instanceof trh.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar7.E2(new WebSignInFlowContract$Step.Loading(str7, false), false, null, false);
                }
                return pfm.m.f235744a;
        }
    }

    public /* synthetic */ f(z0 z0Var, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2) {
        this.f289195a = 22;
        this.f289196b = textLocalisedClause;
        this.f289197c = textLocalisedClause2;
    }
}
