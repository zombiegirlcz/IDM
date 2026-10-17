package lk4;

import an9.o;
import an9.p;
import an9.q;
import com.revolut.core.ui_kit.delegates.PhoneEditorDelegate;
import com.revolut.core.ui_kit.delegates.gallery_picker.PersonalisationGalleryTileModel;
import com.revolut.core.ui_kit.internal.views.fanchart.CurvedFanChartView;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.bills.billers.impl.ui.search.BillerSearchScreen;
import com.revolut.feature.payments.air.widget.impl.model.PaymentWidget;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_creation.SavingsAccountCreationContract$ModalStep;
import com.revolut.feature.security_hub.api.R$string;
import com.revolut.feature.shared.savings.api.error.SavingsServerErrorContract$IneligibleForSavingsException;
import com.revolut.feature.shared.savings.api.error.SavingsServerErrorContract$JointSavingsPendingAccountAlreadyExists;
import com.revolut.feature.shared.savings.api.error.SavingsServerErrorContract$UnactivatedSavingsAccountAlreadyExist;
import com.revolut.feature.transfer_reasons.models.interactor.TransferReasonsRequest;
import com.revolut.feature.transfer_reasons.models.reason.TransferReasons;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.api.custom_assets.models.CustomAssetCategoryDefinition;
import com.revolut.retail.trading.core.domain.orders.InvestCommodityOrder;
import com.revolut.revolut.feature_fourthline_impl.R;
import d9.e1;
import efm.r;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import jrk.d0;
import jrk.g0;
import jrk.x;
import k4l.r0;
import kl7.w1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import ks8.j;
import l3l.m;
import lhk.a0;
import lk0.h;
import lk6.b0;
import lk6.n;
import lk9.y;
import lmb.l;
import mii.k;
import nii.l0;
import nii.y0;
import org.jmrtd.lds.LDSFile;
import tof.fc;
import tof.i7;
import tof.r9;
import wgb.v;
import zh9.i0;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f196214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f196215b;

    public /* synthetic */ g(Object obj2, int i) {
        this.f196214a = i;
        this.f196215b = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object obj3;
        r rVarR;
        k kVar;
        NaviCommand naviCommandC;
        lr4.a aVar;
        uqk.c cVar;
        uqk.a aVar2;
        uqk.b bVar;
        dj0.d dVarL;
        int i = this.f196214a;
        int i2 = 2;
        int i3 = 4;
        Object obj4 = this.f196215b;
        switch (i) {
            case 0:
                c updateState = (c) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                updateState.getClass();
                return new c((ak4.a) obj4);
            case 1:
                jk5.a output = (jk5.a) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                ((com.revolut.feature.crypto.remittance.impl.ui.commonfields.flow.a) obj4).C1(new ExternalDestination.Browser(output.f175090a, null));
                return Unit.f186387a;
            case 2:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                ((b0) obj4).C2(n.b.f196256a);
                return Unit.f186387a;
            case 3:
                y yVar = (y) obj4;
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                i0 i0Var = (i0) rVar.f314201a;
                zh9.y yVar2 = (zh9.y) rVar.f314202b;
                boolean zBooleanValue = ((Boolean) rVar.f314203c).booleanValue();
                Set set = yVar2.f322366b.f322319g;
                ArrayList arrayList = new ArrayList(w.t(set, 10));
                Iterator it9 = set.iterator();
                while (it9.hasNext()) {
                    arrayList.add(new r9((String) it9.next()));
                }
                Iterator it10 = arrayList.iterator();
                if (it10.hasNext()) {
                    Object next = it10.next();
                    while (it10.hasNext()) {
                        next = fc.c((i7) next, (i7) it10.next());
                    }
                    obj3 = next;
                } else {
                    obj3 = null;
                }
                i7 i7Var = (i7) obj3;
                od0.i iVar = od0.i.f224256b;
                if (i7Var == null) {
                    od0.i.Companion.getClass();
                    rVarR = r.just(new Data(iVar, null, false, 6, null));
                    Intrinsics.h(rVarR);
                } else {
                    whf.b bVar2 = yVar.f196336r;
                    r rVarJust = r.just(i7Var);
                    Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
                    r rVarA = whf.b.a(bVar2, rVarJust, null, null, null, 14);
                    od0.h hVar = od0.i.Companion;
                    r rVarW = nim.a.w(rVarA, new m(1, hVar, od0.h.class, "of", "of(Ljava/lang/Object;)Lcom/revolut/core/common/Optional;", 0, 24));
                    hVar.getClass();
                    rVarR = n14.k.r(rVarW, iVar);
                }
                return nim.a.w(rVarR, new l1.e(i0Var, yVar2, zBooleanValue, i2));
            case 4:
                String it11 = (String) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return (List) ((ll7.k) obj4).f196640b.get("DRIVERS_KEY");
            case 5:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                String str = (String) pair.f186385a;
                w1 w1Var = (w1) pair.f186386b;
                return (List) ((ll7.i0) obj4).f196637b.get("KEY_QUESTIONNAIRE_" + w1Var + "_" + str);
            case 6:
                llh.a aVar3 = (llh.a) obj4;
                Boolean isAvailableToOnboard = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(isAvailableToOnboard, "isAvailableToOnboard");
                if (isAvailableToOnboard.booleanValue()) {
                    return gc0.c.f(((c3b.a) aVar3.f196802b).b(jbb.a.a(ibb.c.f160141b, null, null, null, 14)));
                }
                return jbb.a.a(ibb.c.f160141b, null, null, null, 14);
            case 7:
                NaviCommand targetCommandIfOnboardingComplete = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(targetCommandIfOnboardingComplete, "destinationCommand");
                wj3.a aVar4 = (wj3.a) ((llh.b) obj4).f196804b;
                Intrinsics.checkNotNullParameter(targetCommandIfOnboardingComplete, "targetCommandIfOnboardingComplete");
                return te0.w.o0(kotlin.coroutines.g.f186406a, new v(aVar4, targetCommandIfOnboardingComplete, null, 8));
            case 8:
                KProperty[] kPropertyArr = BillerSearchScreen.S;
                lm1.j jVarE3 = ((BillerSearchScreen) obj4).d();
                jVarE3.getClass();
                h.b event = h.b.f196176a;
                Intrinsics.checkNotNullParameter(event, "paginationEvent");
                mm1.c cVar2 = (mm1.c) jVarE3.o;
                cVar2.getClass();
                Intrinsics.checkNotNullParameter(event, "event");
                cVar2.f207126c.onNext(event);
                return Unit.f186387a;
            case 9:
                lm3.a update = (lm3.a) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return lm3.a.a(update, null, (vm3.c) obj4, null, null, null, false, 123);
            case 10:
                lm3.a update2 = (lm3.a) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return lm3.a.a(update2, null, null, ((PhoneEditorDelegate.PhoneData) obj4).f52896b, null, null, false, LDSFile.EF_SOD_TAG);
            case 11:
                com.revolut.feature.payees.impl.ui.flow.a aVar5 = (com.revolut.feature.payees.impl.ui.flow.a) obj4;
                lm9.a aVar6 = aVar5.o;
                q result = (q) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof o) {
                    aVar6.getClass();
                    kVar = new k("PAYEES_ADD_SUCCESS_DIALOG_ID", new TextLocalisedClause(R$string.security_hub_payees_toast_added_title, null, null, 14), null, null, null, 28);
                } else {
                    if (!(result instanceof p)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar6.getClass();
                    kVar = new k("PAYEES_BLOCK_SUCCESS_DIALOG_ID", new TextLocalisedClause(R$string.security_hub_payees_toast_blocked_title, null, null, 14), null, null, null, 28);
                }
                aVar5.X1(kVar);
                aVar5.B2();
                return Unit.f186387a;
            case 12:
                com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_creation.a aVar7 = (com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_creation.a) obj4;
                Throwable it12 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                l lVar = aVar7.f83314t;
                if (it12 instanceof SavingsServerErrorContract$UnactivatedSavingsAccountAlreadyExist) {
                    lVar.getClass();
                    yji.l.a1(aVar7, aVar7.X1(new y0(null, new l0(new TextLocalisedClause(com.revolut.feature.retail.savings.api.R$string.savings_onboarding_too_many_account_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.retail.savings.api.R$string.savings_onboarding_too_many_account_subtitle, null, null, 14), null, new TextLocalisedClause(com.revolut.feature.retail.savings.api.R$string.savings_onboarding_too_many_account_button_title, null, null, 14), null, null, false, null, 1012), false, 5)), null, null, new a0(aVar7, ((SavingsServerErrorContract$UnactivatedSavingsAccountAlreadyExist) it12).f86456a, null, i3), 3);
                } else if (it12 instanceof SavingsServerErrorContract$IneligibleForSavingsException) {
                    oki.h.w2(aVar7.B, new SavingsAccountCreationContract$ModalStep.IneligibleForSavingsWorkflow(((SavingsServerErrorContract$IneligibleForSavingsException) it12).f86453a), ModalDestination.Style.POPUP.f98311a);
                } else if (it12 instanceof SavingsServerErrorContract$JointSavingsPendingAccountAlreadyExists) {
                    lVar.getClass();
                    yji.l.a1(aVar7, aVar7.X1(new y0(null, new l0(new TextLocalisedClause(com.revolut.feature.retail.savings.api.R$string.savings_account_creation_error_in_progress_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.retail.savings.api.R$string.savings_account_creation_error_in_progress_description, null, null, 14), null, new TextLocalisedClause(com.revolut.feature.retail.savings.api.R$string.savings_account_creation_error_in_progress_open, null, null, 14), new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), null, false, null, 996), false, 5)), null, null, new a0(aVar7, ((SavingsServerErrorContract$JointSavingsPendingAccountAlreadyExists) it12).f86454a, null, i3), 3);
                } else {
                    yji.l.a1(aVar7, aVar7.f83313s.Z2(it12), null, null, new lmb.p(aVar7, null, 0), 3);
                }
                return Boolean.TRUE;
            case 13:
                lzi.h cycle = (lzi.h) obj2;
                Intrinsics.checkNotNullParameter(cycle, "cycle");
                return new xnd.h(cycle, ((gqj.c) ((lmd.d) obj4).f196955c).d(null, cycle));
            case 14:
                zel.h result2 = (zel.h) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                return ((d9h.a) ((k18.c) obj4).f180141c).a(result2.f321803b);
            case 15:
                lnb.b bVar3 = (lnb.b) obj4;
                Throwable it13 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                yji.l.a1(bVar3, bVar3.X1(new y0(null, frg.a.a(), false, 5)), null, null, new la8.h(bVar3, null, 23), 3);
                return Boolean.TRUE;
            case 16:
                String widgetId = (String) obj2;
                Intrinsics.checkNotNullParameter(widgetId, "widgetInstanceId");
                lo9.b bVar4 = ((lo9.e) obj4).f197426b;
                Intrinsics.checkNotNullParameter(widgetId, "widgetId");
                ne0.j jVar = bVar4.f197421a;
                lo9.b.Companion.getClass();
                return (PaymentWidget) jVar.get(lo9.a.a(widgetId));
            case 17:
                PersonalisationGalleryTileModel personalisationGalleryTileModel = (PersonalisationGalleryTileModel) obj4;
                Unit it14 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return personalisationGalleryTileModel;
            case 18:
                lq.c cVar3 = (lq.c) obj4;
                ks8.j kycResult = (ks8.j) obj2;
                Intrinsics.checkNotNullParameter(kycResult, "kycResult");
                if (kycResult instanceof j.a) {
                    lq.a aVar8 = cVar3.f199162n;
                    KompotDestination kompotDestinationZ0 = aVar8.Z0(aVar8.f199156r0);
                    naviCommandC = kompotDestinationZ0 != null ? vhi.c.a(kompotDestinationZ0, 6) : new FinishCommand(-1, q0.c(new Pair("appWidgetId", Integer.valueOf(cVar3.f199161m))), null, 4);
                } else {
                    if (!(kycResult instanceof ks8.i)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    naviCommandC = com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), ((ks8.i) kycResult).f189312a);
                }
                cVar3.f199159j.c(naviCommandC);
                return Unit.f186387a;
            case 19:
                kgm.c cVar4 = (kgm.c) obj4;
                yw4.b config = (yw4.b) obj2;
                Intrinsics.checkNotNullParameter(config, "config");
                List<yw4.a> list = config.f317316b;
                ArrayList arrayList2 = new ArrayList();
                for (yw4.a aVar9 : list) {
                    cVar4.getClass();
                    int i5 = lr4.c.f199394a[aVar9.ordinal()];
                    if (i5 == 1) {
                        aVar = new lr4.a(R$drawable.uikit_icn_24_data_limit_full, new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_settings_display_amount_toggle_option_spent, null, null, 14), aVar9.name());
                    } else if (i5 == 2) {
                        aVar = new lr4.a(R$drawable.uikit_icn_24_data_limit_half, new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_settings_display_amount_toggle_option_available, null, null, 14), aVar9.name());
                    } else {
                        if (i5 != 3 && i5 != 4 && i5 != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        aVar = null;
                    }
                    if (aVar != null) {
                        arrayList2.add(aVar);
                    }
                }
                return new lr4.b(config.f317315a, arrayList2);
            case 20:
                mq9.a aVar10 = (mq9.a) obj4;
                mq9.e update3 = (mq9.e) obj2;
                Intrinsics.checkNotNullParameter(update3, "update");
                return (update3.f207901a.isEmpty() && update3.f207902b.isEmpty() && update3.f207903c.isEmpty() && update3.d.isEmpty() && aVar10 != mq9.a.LOCAL) ? new Data(null, null, true, 3, null) : new Data(update3, null, false, 6, null);
            case 21:
                mq9.b bVar5 = (mq9.b) obj4;
                mq9.c intermediary = (mq9.c) obj2;
                Intrinsics.checkNotNullParameter(intermediary, "intermediary");
                return (intermediary.f207899b.isEmpty() && intermediary.f207900c.isEmpty() && bVar5 != mq9.b.LOCAL) ? new Data(null, null, true, 3, null) : new Data(intermediary, null, false, 6, null);
            case 22:
                List groupMembers = (List) obj2;
                Intrinsics.checkNotNullParameter(groupMembers, "groupMembers");
                return ((lr9.p) obj4).f199469h.j0(zi0.c.S(groupMembers));
            case 23:
                lrd.b bVar6 = (lrd.b) obj2;
                boolean z = bVar6.f199494a;
                bVar6.getClass();
                return new lrd.b(z, (CustomAssetCategoryDefinition) obj4);
            case 24:
                wrk.b bVar7 = (wrk.b) obj4;
                List statements = (List) obj2;
                Intrinsics.checkNotNullParameter(statements, "statements");
                List<d0> list2 = statements;
                ArrayList arrayList3 = new ArrayList(w.t(list2, 10));
                for (d0 d0Var : list2) {
                    String ref2 = bVar7.f299625a;
                    uqk.l type = bVar7.f299626b;
                    Object obj5 = grk.c.f146055a;
                    Intrinsics.checkNotNullParameter(d0Var, "<this>");
                    Intrinsics.checkNotNullParameter(ref2, "ref");
                    Intrinsics.checkNotNullParameter(type, "type");
                    int i6 = d0Var.f178047b;
                    Integer num = d0Var.f178048c;
                    List list3 = d0Var.d;
                    ArrayList arrayList4 = new ArrayList(w.t(list3, 10));
                    Iterator it15 = list3.iterator();
                    while (it15.hasNext()) {
                        arrayList4.add(grk.c.c((g0) it15.next()));
                    }
                    arrayList3.add(new uqk.f(ref2, type, i6, num, arrayList4));
                }
                return arrayList3;
            case 25:
                jrk.a0 it16 = (jrk.a0) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                String ref3 = ((wrk.a) obj4).f299623a;
                Object obj6 = grk.c.f146055a;
                Intrinsics.checkNotNullParameter(it16, "<this>");
                Intrinsics.checkNotNullParameter(ref3, "ref");
                List<x> list4 = it16.f178040a;
                ArrayList arrayList5 = new ArrayList(w.t(list4, 10));
                for (x xVar : list4) {
                    Intrinsics.checkNotNullParameter(xVar, "<this>");
                    Intrinsics.checkNotNullParameter(ref3, "ref");
                    int i21 = xVar.f178081a;
                    Integer num2 = xVar.f178082b;
                    jrk.i iVar2 = xVar.f178083c;
                    if (iVar2 != null) {
                        Intrinsics.checkNotNullParameter(iVar2, "<this>");
                        jo3.a aVar11 = iVar2.f178058a;
                        dj0.d dVarO = aVar11 != null ? mo3.a.o(aVar11) : null;
                        jo3.a aVar12 = iVar2.f178059b;
                        cVar = new uqk.c(dVarO, aVar12 != null ? mo3.a.o(aVar12) : null, iVar2.f178060c);
                    } else {
                        cVar = null;
                    }
                    jrk.c cVar5 = xVar.d;
                    if (cVar5 != null) {
                        Intrinsics.checkNotNullParameter(cVar5, "<this>");
                        jo3.a aVar13 = cVar5.f178042a;
                        dj0.d dVarO2 = aVar13 != null ? mo3.a.o(aVar13) : null;
                        jo3.a aVar14 = cVar5.f178043b;
                        aVar2 = new uqk.a(dVarO2, aVar14 != null ? mo3.a.o(aVar14) : null, cVar5.f178044c);
                    } else {
                        aVar2 = null;
                    }
                    jrk.f fVar = xVar.e;
                    if (fVar != null) {
                        Intrinsics.checkNotNullParameter(fVar, "<this>");
                        jo3.a aVar15 = fVar.f178050a;
                        dj0.d dVarO3 = aVar15 != null ? mo3.a.o(aVar15) : null;
                        jo3.a aVar16 = fVar.f178052c;
                        dj0.d dVarO4 = aVar16 != null ? mo3.a.o(aVar16) : null;
                        jo3.a aVar17 = fVar.f178051b;
                        dj0.d dVarO5 = aVar17 != null ? mo3.a.o(aVar17) : null;
                        jo3.a aVar18 = fVar.d;
                        bVar = new uqk.b(dVarO3, dVarO4, dVarO5, aVar18 != null ? mo3.a.o(aVar18) : null);
                    } else {
                        bVar = null;
                    }
                    String str2 = ref3;
                    arrayList5.add(new uqk.d(str2, i21, num2, cVar, aVar2, bVar));
                    ref3 = str2;
                }
                return arrayList5;
            case 26:
                ls4.f update4 = (ls4.f) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                Data content = Data.copy$default(update4.f199614a, (ls4.e) obj4, null, false, 6, null);
                Intrinsics.checkNotNullParameter(content, "content");
                return new ls4.f(content);
            case 27:
                TransferReasonsRequest request = (TransferReasonsRequest) obj2;
                Intrinsics.checkNotNullParameter(request, "request");
                return (TransferReasons) ((lsf.d) obj4).f199678a.get(lsf.d.a(request));
            case 28:
                tsl.a it17 = (tsl.a) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                lsl.n nVar = ((lsl.f) obj4).o;
                InvestCommodityOrder commodityOrder = it17.f274171a;
                nVar.getClass();
                Intrinsics.checkNotNullParameter(commodityOrder, "commodityOrder");
                r0 r0Var = commodityOrder.f104512j;
                dj0.d dVar = commodityOrder.f104516p;
                int i22 = lsl.m.f199713a[r0Var.ordinal()];
                if (i22 == 1 || i22 == 2 || i22 == 3) {
                    xi0.b bVarA = com.revolut.retail.trading.core.domain.orders.a.a(commodityOrder);
                    if (Intrinsics.f(dVar.f115083b, bVarA)) {
                        dVarL = dVar;
                    } else {
                        BigDecimal bigDecimalY = pyd.c.Y(com.revolut.retail.trading.core.domain.orders.a.m(commodityOrder));
                        if (e1.I(bigDecimalY)) {
                            r6.b.D("The target rate should not be zero");
                            dj0.d.Companion.getClass();
                            dVarL = dj0.d.c(dj0.d.e, 0L, bVarA, 1);
                        } else {
                            BigDecimal bigDecimalDivide = BigDecimal.ONE.divide(bigDecimalY, MathContext.DECIMAL128);
                            Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
                            dVarL = pyd.c.L(dVar, bigDecimalDivide, bVarA);
                        }
                    }
                } else {
                    if (i22 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dVarL = null;
                }
                return new lsl.i(dVarL, com.revolut.retail.trading.core.domain.orders.a.b(commodityOrder));
            default:
                return CurvedFanChartView.a((CurvedFanChartView) obj4, ((Float) obj2).floatValue());
        }
    }
}
