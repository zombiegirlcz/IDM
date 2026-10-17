package yed;

import android.content.Intent;
import android.net.Uri;
import aw0.o9;
import aw0.y4;
import com.revolut.core.ui_kit.delegates.gg;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.add.new_product.impl.ui.add_new_product.AddNewProductScreen;
import com.revolut.feature.apm.bills.core.api.model.Bill;
import com.revolut.feature.atm.api.model.AtmLocation;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.repayment_day.ChangeRepaymentDayScreenContract$InputData;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.insurance_car.impl.data.model.AdditionalDriver;
import com.revolut.feature.insurance_car.impl.data.model.Answer;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.driver.details.AdditionalDriverDetailsScreen;
import com.revolut.feature.wealth.api.domain.model.statement.StatementProduct;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.IntentCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$BillingOptions;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.c;
import com.revolut.retail.feature.pricing_plans.ui.impl.model.SelectedBillingPlan;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import com.revolut.retail.operation_status.modal_status.SuccessType;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import ggk.g1;
import ip0.gf;
import ip0.gu;
import ip0.nb0;
import ip0.pb0;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import mx0.c7;
import org.jmrtd.cbeff.ISO781611;
import org.joda.time.DateTime;
import tx0.w1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class g0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f312861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f312862b;

    public /* synthetic */ g0(Object obj2, int i) {
        this.f312861a = i;
        this.f312862b = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        NaviCommand naviCommandA;
        int i = this.f312861a;
        int i2 = 2;
        int i3 = 0;
        int i5 = 1;
        Object obj3 = this.f312862b;
        switch (i) {
            case 0:
                return o.a((o) obj2, null, null, null, null, false, false, null, null, null, null, false, null, false, null, null, (n) obj3, 524287);
            case 1:
                AddNewProductScreen addNewProductScreen = (AddNewProductScreen) obj3;
                t60.a state = (t60.a) obj2;
                KProperty[] kPropertyArr = AddNewProductScreen.T;
                Intrinsics.checkNotNullParameter(state, "state");
                return Boolean.valueOf(state.a() && !addNewProductScreen.d3().f253677b.f59421x0);
            case 2:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                List list = (List) getDefaultLoadingItems.invoke();
                int i6 = R$string.credit_application_offer_change_repayment_day_title;
                ChangeRepaymentDayScreenContract$InputData changeRepaymentDayScreenContract$InputData = ((yf4.l) obj3).f313184b;
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i6, zhm.u.c(changeRepaymentDayScreenContract$InputData.f68157a.f155547a), null, 12);
                hu3.a aVar = changeRepaymentDayScreenContract$InputData.f68157a;
                return new yf4.h(textLocalisedClause, new TextClause(aVar.f155548b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.credit_application_offer_change_repayment_day_confirm, zhm.u.c(aVar.f155550g), null, 12), new c7(new TextClause(aVar.f, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, null, 6), true, false, list);
            case 3:
                Function0 it8 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                List list2 = ((com.revolut.feature.shared_separate_favourites.common.screen.add_asset.b) obj3).f86816c;
                yp0.b.k(list2, 0, 0, 0, 0, 31);
                return list2;
            case 4:
                yff.g gVar = (yff.g) obj3;
                Function0 it9 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return yff.m.c(gVar.f313337a, gVar.f313338b, gVar.f);
            case 5:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                Set<xi0.b> currencies = (Set) pair.f186385a;
                List cryptoStats = (List) pair.f186386b;
                vg5.c cVar = ((yg5.u) obj3).f313541q;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(currencies, "currencies");
                Intrinsics.checkNotNullParameter(cryptoStats, "cryptoStats");
                List list3 = cryptoStats;
                int iB = zhm.q0.b(zhm.w.t(list3, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                for (Object obj4 : list3) {
                    linkedHashMap.put(((cw5.b) obj4).f109534a, obj4);
                }
                ArrayList arrayList = new ArrayList();
                for (xi0.b bVar : currencies) {
                    cw5.b bVar2 = (cw5.b) linkedHashMap.get(bVar.f306286a);
                    ug5.b bVar3 = bVar2 == null ? null : new ug5.b(bVar2.f109535b, bVar);
                    if (bVar3 != null) {
                        arrayList.add(bVar3);
                    }
                }
                if (arrayList.isEmpty()) {
                    zhm.f0 f0Var = zhm.f0.f322471a;
                    return new ug5.a(f0Var, f0Var, f0Var);
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj5 : arrayList) {
                    if (!vg5.c.f288755b.contains(((ug5.b) obj5).f279931a)) {
                        arrayList2.add(obj5);
                    }
                }
                List listP0 = zhm.d0.P0(arrayList2, new vg5.b());
                List listV = zhm.d0.V(listP0, 3);
                int iA = cVar.f288756a.a();
                List listQ = zhm.v.q(listV, new tim.d(iA, iA >> 31));
                return new ug5.a(cVar.a(arrayList, listP0, listQ, 0), cVar.a(arrayList, listP0, listQ, 1), cVar.a(arrayList, listP0, listQ, 2));
            case 6:
                yg5.g update = (yg5.g) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return yg5.g.a(update, null, (yg5.f) obj3, false, null, null, 29);
            case 7:
                ng5.a aVar2 = (ng5.a) obj3;
                return yg5.g.a((yg5.g) obj2, null, null, false, aVar2.f215114c, aVar2.d, 7);
            case 8:
                yg8.d dVar = (yg8.d) obj3;
                ig8.l result = (ig8.l) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof ig8.j) {
                    com.revolut.retail.operation_status.modal_screen.a aVar3 = h3l.g.Companion;
                    boolean z = ((ig8.j) result).f161096a;
                    return com.revolut.retail.operation_status.modal_screen.a.a(aVar3, new StatusViewConfiguration.Success("DIALOG_ID_ASSET_MIGRATION_APPROVED", new TextLocalisedClause(z ? com.revolut.feature.junior_graduation.impl.R$string.junior_graduation_migration_asset_details_transfer_approved_success_dialog_title : com.revolut.feature.junior_graduation.impl.R$string.junior_graduation_migration_asset_details_transfer_approved_success_dialog_account_not_closed_title, null, null, 14), z ? new TextLocalisedClause(com.revolut.feature.junior_graduation.impl.R$string.junior_graduation_migration_asset_details_transfer_approved_success_dialog_subtitle, null, null, 14) : null, null, null, 2040), null, null, null, null, 510);
                }
                if (!(result instanceof ig8.k)) {
                    throw new NoWhenBranchMatchedException();
                }
                com.revolut.retail.operation_status.modal_screen.a aVar4 = h3l.g.Companion;
                StatusViewConfiguration.Success success = new StatusViewConfiguration.Success("DIALOG_ID_ASSET_MIGRATION_CONFIRMATION_REQUIRED", new TextLocalisedClause(com.revolut.feature.junior_graduation.impl.R$string.junior_graduation_migration_asset_details_transfer_approved_verification_required_dialog_title, null, null, 14), null, null, new SuccessType.ResultAction(new TextLocalisedClause(com.revolut.feature.junior_graduation.impl.R$string.junior_graduation_migration_asset_details_transfer_approved_verification_required_dialog_actions_open_revolut_u18, null, null, 14), null), 1916);
                FinishCommand finishCommand = new FinishCommand(null, null, null, 7);
                yg8.c cVar2 = dVar.f313576b;
                boolean z3 = ((ig8.k) result).f161097a;
                jg8.a source = jg8.a.MAIN_CONTAINER;
                Intrinsics.checkNotNullParameter(source, "source");
                if (cVar2.f313572a.a("com.revolut.junior")) {
                    Uri uri2 = ((f80.b) cVar2.f313574c).f("revolut-junior://app/graduation/assets-migration/2fa?source=" + source.a() + "&u18AccountWillBeClosed=" + z3);
                    Intrinsics.checkNotNullParameter("android.intent.action.VIEW", "action");
                    Intrinsics.checkNotNullParameter(uri2, "uri");
                    naviCommandA = new IntentCommand(new Intent("android.intent.action.VIEW", uri2), null);
                } else {
                    naviCommandA = cVar2.f313573b.a("com.revolut.junior", gh0.d.GOOGLE);
                }
                return com.revolut.retail.operation_status.modal_screen.a.a(aVar4, success, com.revolut.retail.core.navigation.a.c(finishCommand, naviCommandA), null, null, null, 508);
            case 9:
                yg9.k update2 = (yg9.k) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return yg9.k.a(update2, (Bill) obj3, null, null, null, ISO781611.SMT_TAG);
            case 10:
                Data content = new Data((xfe.d) obj3, null, false, 6, null);
                String confirmationButtonTag = ((yhe.d) obj2).f313915b;
                Intrinsics.checkNotNullParameter(content, "content");
                Intrinsics.checkNotNullParameter(confirmationButtonTag, "confirmationButtonTag");
                return new yhe.d(content, confirmationButtonTag);
            case 11:
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_gift_sending.a aVar5 = (com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_gift_sending.a) obj3;
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.c output = (com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.c) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (output instanceof ghk.m) {
                    ghk.m mVar = (ghk.m) output;
                    String str = mVar.f143968a;
                    g1 g1Var = mVar.f143969b;
                    PlansDashboardLayout$PlanPageLayout$BillingOptions plansDashboardLayout$PlanPageLayout$BillingOptions = g1Var.k;
                    if (plansDashboardLayout$PlanPageLayout$BillingOptions != null) {
                        aVar5.f103181p.Z2(new phk.i(new SelectedBillingPlan.PlanId(str), xfa.b.PLAN_GIFTING, plansDashboardLayout$PlanPageLayout$BillingOptions, null), new xwd.o(aVar5, 15, str, g1Var));
                    }
                } else if (!(output instanceof c.a) && !(output instanceof ghk.n) && !(output instanceof ghk.l) && !(output instanceof c.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            case 12:
                yhl.b bVar4 = (yhl.b) obj3;
                List assetEvents = (List) obj2;
                Intrinsics.checkNotNullParameter(assetEvents, "assetEvents");
                ybl.b bVar5 = bVar4.f314172c;
                ArrayList arrayList3 = new ArrayList();
                Iterator it10 = assetEvents.iterator();
                while (it10.hasNext()) {
                    zhm.a0.x(yhl.b.b((iel.a) it10.next()), arrayList3);
                }
                return nim.a.v(((ael.k) bVar5).l(zhm.d0.i1(arrayList3)), new x5f.m(18, bVar4, assetEvents));
            case 13:
                com.revolut.feature.chooser.external_map.screen.b bVar6 = (com.revolut.feature.chooser.external_map.screen.b) obj3;
                eii.k result2 = (eii.k) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (result2 instanceof eii.i) {
                    Object obj6 = ((eii.i) result2).f126655a;
                    q70.e eVar = obj6 instanceof q70.e ? (q70.e) obj6 : null;
                    if (eVar != null) {
                        zi3.c cVar3 = bVar6.f65923r;
                        q70.d dVar2 = eVar.f242736c;
                        yi3.b bVar7 = bVar6.o;
                        double d = bVar7.f314227a;
                        double d5 = bVar7.f314228b;
                        cVar3.getClass();
                        bVar6.C1(new ExternalDestination.ImplicitActivity("android.intent.action.VIEW", eVar.f242735b, Uri.parse(zi3.c.a(dVar2, d, d5)), 0, null, 490));
                    }
                }
                return Unit.f186387a;
            case 14:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, error, h0Var);
                ((yi4.g) obj3).C2(yi4.d.f314235a);
                return Boolean.TRUE;
            case 15:
                Function0 it11 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                int i21 = yid.r.f314315a[((yid.s) obj3).f314317a.d.ordinal()];
                if (i21 != 1) {
                    if (i21 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aim.e eVarB = zhm.u.b();
                    eVarB.add(new gu("SHOPS_CARROUSEL_DETAILS_LIST_ID_TITLE", 0, 0, 30));
                    IntRange intRange = new IntRange(0, 3, 1);
                    ArrayList arrayList4 = new ArrayList(zhm.w.t(intRange, 10));
                    vim.f it12 = intRange.iterator();
                    while (it12.f289625c) {
                        arrayList4.add(nb0.b(pb0.Companion, a0.d.n("SHOPS_CARROUSEL_DETAILS_LIST_ID_STATE_LOADING", it12.nextInt()), false, 0, false, 30));
                    }
                    yp0.b.k(arrayList4, 0, 0, 0, 0, 31);
                    eVarB.addAll(arrayList4);
                    return zhm.u.a(eVarB);
                }
                ArrayList arrayList5 = new ArrayList(3);
                for (int i22 = 0; i22 < 3; i22++) {
                    ArrayList arrayList6 = new ArrayList(2);
                    int i32 = 0;
                    for (int i33 = 2; i32 < i33; i33 = 2) {
                        arrayList6.add(yid.s.a());
                        i32++;
                    }
                    arrayList5.add(new hg("SHOPS_CARROUSEL_DETAILS_LIST_ID_STATE_LOADING", arrayList6, 2, new y4(hjd.d.f152707c), null, new gg.b(false, 3), false, false, null, null, R$attr.uikit_dp16, R$attr.uikit_dp8, 0, 0, 26576));
                }
                return arrayList5;
            case 16:
                yj2.d dVar3 = (yj2.d) obj3;
                AtomicReference atomicReference = dVar3.e;
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                od0.i iVar = (od0.i) pair2.f186385a;
                x39.b bVar8 = (x39.b) pair2.f186386b;
                AtmLocation atmLocation = (AtmLocation) iVar.f224257a;
                if (atmLocation == null) {
                    atmLocation = yj2.d.f314383g;
                }
                AtmLocation atmLocation2 = (AtmLocation) atomicReference.get();
                boolean z4 = atmLocation2 == null || dVar3.f314386c.a(atmLocation2.f63138a, atmLocation2.f63139b, atmLocation.f63138a, atmLocation.f63139b) > 500.0f;
                atomicReference.set(atmLocation);
                yj2.l lVar = dVar3.f314384a;
                ufm.i iVar2 = new ufm.i(((cpj.b) lVar.d).e(yoj.c.ATMS_SURCHARGE_FREE, yoj.d.DISABLED), new yj2.a(4, new yi5.b(10)), 1);
                Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                ufm.i iVar3 = new ufm.i(ue0.e.F(iVar2, Boolean.FALSE), new yj2.a(2, new yj2.b(lVar, atmLocation)), 0);
                Intrinsics.checkNotNullExpressionValue(iVar3, "flatMap(...)");
                return new sfm.b(new ufm.i(iVar3, new ya6.f(new yi5.b(8), 29), 1), new yj2.a(i3, new w43.b(dVar3, z4, atmLocation, bVar8)), 2).onErrorReturn(new yj2.a(i5, new yi5.b(9)));
            case 17:
                yj7.e updateState = (yj7.e) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return yj7.e.a(updateState, ((yj7.i) obj3).f314431p.b());
            case 18:
                StatementProduct statementProduct = (StatementProduct) obj3;
                wel.e it13 = (wel.e) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                DateTime dateTime = it13.i;
                if (dateTime != null) {
                    return dateTime;
                }
                throw new IllegalStateException(("Trading portfolio with ID " + statementProduct + " has no onboarding date").toString());
            case 19:
                DateTime it14 = (DateTime) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                long millis = it14.getMillis();
                ((ylh.t) obj3).getClass();
                return new Pair(Instant.ofEpochMilli(millis).atZone(TimeZone.getDefault().toZoneId()).withDayOfMonth(1).toLocalDate(), LocalDate.now());
            case 20:
                Function0 it15 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                ((ylh.u) obj3).getClass();
                gf gfVar = new gf(new TextLocalisedClause(com.revolut.feature.statements.R$string.common_word_period, null, null, 14));
                yp0.b.l(gfVar, 0, 0, 0, 0, null, false, 63);
                return zhm.u.c(gfVar);
            case 21:
                Answer.Mileage mileage = (Answer.Mileage) obj2;
                Intrinsics.checkNotNullParameter(mileage, "mileage");
                ((com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.mileage.a) obj3).G2(new ym7.c(mileage));
                return Unit.f186387a;
            case 22:
                ybl.h productGroupAvailability = (ybl.h) obj2;
                Intrinsics.checkNotNullParameter(productGroupAvailability, "productGroupAvailability");
                ybl.a aVar6 = (ybl.a) ((ymh.i) obj3).f315004b.get(cfl.p.PRIVATE_BANK);
                Set setB = aVar6 != null ? aVar6.b() : null;
                if (setB == null) {
                    setB = zhm.h0.f322473a;
                }
                cfl.v[] elements = {cfl.v.AVAILABLE, cfl.v.ONBOARDING};
                Intrinsics.checkNotNullParameter(elements, "elements");
                return new ymh.c(productGroupAvailability.c(setB, TradingAccountType.Gia.f105270a, kotlin.collections.d.y0(elements)));
            case 23:
                Unit it16 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return (List) ((yn9.c) obj3).f315273c.get("KEY_COUNTERPARTY");
            case 24:
                return yna.a.a((yna.a) obj2, null, null, null, null, null, null, null, false, false, (w1) obj3, false, null, null, null, null, 64511);
            case 25:
                List it17 = (List) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                ((ynf.d) obj3).getClass();
                return nkm.y.J(nkm.y.H(nkm.y.n(zhm.d0.Q(it17), new yjj.j(25)), 1));
            case 26:
                zp0.t it18 = (zp0.t) obj2;
                KProperty[] kPropertyArr2 = AdditionalDriverDetailsScreen.f75571d0;
                Intrinsics.checkNotNullParameter(it18, "it");
                yo7.k kVarT2 = ((AdditionalDriverDetailsScreen) obj3).T2();
                Date date = it18.f324143a;
                yo7.s sVar = (yo7.s) kVarT2;
                sVar.x2(new mek.l(i2, date != null ? ebm.a.N(date) : null, ((l80.f) sVar.f315632p).e().minusYears(120L)));
                return Unit.f186387a;
            case 27:
                Answer.ClaimsState claimsState = (Answer.ClaimsState) obj3;
                yo7.h updateState2 = (yo7.h) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                int i43 = xl7.d.i(claimsState);
                ArrayList arrayList7 = new ArrayList(i43);
                for (int i59 = 0; i59 < i43; i59++) {
                    arrayList7.add(new vp7.b(null, null, null, null));
                }
                return yo7.h.a(updateState2, null, null, null, null, null, null, claimsState, arrayList7, null, null, null, null, null, 15999);
            case 28:
                yo7.h updateState3 = (yo7.h) obj2;
                Intrinsics.checkNotNullParameter(updateState3, "$this$updateState");
                return yo7.h.a(updateState3, null, null, null, null, null, (Answer.LicenceDuration) obj3, null, null, null, null, null, null, null, 16319);
            default:
                yo7.h updateState4 = (yo7.h) obj2;
                Intrinsics.checkNotNullParameter(updateState4, "$this$updateState");
                return yo7.h.a(updateState4, null, null, null, (AdditionalDriver.Relationship) obj3, null, null, null, null, null, null, null, null, null, 16367);
        }
    }

    public /* synthetic */ g0(yff.m mVar, yff.g gVar) {
        this.f312861a = 4;
        this.f312862b = gVar;
    }
}
