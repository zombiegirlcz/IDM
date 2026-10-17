package q56;

import android.os.SystemClock;
import aw0.o9;
import c2d.m0;
import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit_core.displayers.image.models.UserAvatarImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UserNamePlaceholder;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.partner.give_consent.GiveConsentScreen;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.transactions.CobrandedCardsPlanHubTransactionsScreen;
import com.revolut.feature.revolutpay.impl.R$string;
import com.revolut.feature.revolutpay.impl.domain.models.payment_schedule.PaymentScheduleSelection;
import com.revolut.feature.revolutpay.impl.ui.summary_screen.extension.SummaryAccountPickerExtension$AccountPickerConfiguration;
import com.revolut.feature.revolutpay.shared.ui.account_picker.AccountPickerItem;
import com.revolut.feature.travel.flights.models.domain.booking.BookingPreviewParams;
import com.revolut.feature.travel.flights.models.domain.booking.PrimaryContact;
import com.revolut.feature.travel.flights.models.domain.common.PhoneNumber;
import com.revolut.feature.travel.flights.models.domain.payment.PointsRedeemOption;
import com.revolut.feature.wealth.gia.margin_trading.impl.ui.margin_minimum_requirement.WealthMarginMinimumRequirementScreen;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.shared.feature.offboarding.api.domain.model.OffboardingScreen;
import djc.z;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import le.u1;
import lk0.h;
import org.jmrtd.lds.LDSFile;
import q97.e1;
import q97.g0;
import q97.h2;
import q97.l1;
import q97.o3;
import q97.q2;
import q97.v2;
import q97.w0;
import q97.x;
import q97.x2;
import vkm.j2;
import vkm.z1;
import xzg.d0;
import zh9.u0;
import zhm.f0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f242310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f242311b;

    public /* synthetic */ o(Object obj2, int i) {
        this.f242310a = i;
        this.f242311b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        r5b.n nVar;
        ibd.h hVar;
        ibd.f fVar;
        Data data;
        PaymentScheduleSelection paymentScheduleSelectionB;
        Object next;
        t6c.f fVar2;
        PaymentScheduleSelection paymentScheduleSelectionB2;
        d0 d0Var;
        int i = this.f242310a;
        h.b paginationEvent = h.b.f196176a;
        int i2 = 5;
        PaymentScheduleSelection.PayNow payNow = PaymentScheduleSelection.PayNow.f84446a;
        int i3 = 14;
        int i5 = 3;
        int i6 = 2;
        int i21 = 1;
        Object obj3 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object obj4 = this.f242311b;
        switch (i) {
            case 0:
                com.revolut.feature.defi.remittances.impl.ui.send.add_beneficiary.a aVar = (com.revolut.feature.defi.remittances.impl.ui.send.add_beneficiary.a) obj4;
                zi5.d output = (zi5.d) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (output instanceof zi5.e) {
                    aVar.H2(aVar.f71820t, new p(output, i));
                }
                return Unit.f186387a;
            case 1:
                return k.a((k) obj2, null, null, (j) obj4, false, 11);
            case 2:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return (List) ((q59.c) obj4).f242333b.get("DEPRECATED_APPS");
            case 3:
                y4g.h hVar2 = (y4g.h) obj4;
                q5g.s update = (q5g.s) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                BookingPreviewParams bookingPreviewParams = update.f242386a;
                PrimaryContact primaryContact = bookingPreviewParams.f93450b;
                String email = hVar2.f310923a;
                PhoneNumber phoneNumber = hVar2.f310924b;
                String travellerReference = primaryContact.f93465a;
                Intrinsics.checkNotNullParameter(travellerReference, "travellerReference");
                Intrinsics.checkNotNullParameter(email, "email");
                Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
                PrimaryContact primaryContact2 = new PrimaryContact(travellerReference, email, phoneNumber);
                String itineraryOfferId = bookingPreviewParams.f93449a;
                List travellers = bookingPreviewParams.f93451c;
                Set selectedExtraProductTokens = bookingPreviewParams.d;
                Intrinsics.checkNotNullParameter(itineraryOfferId, "itineraryOfferId");
                Intrinsics.checkNotNullParameter(primaryContact2, "primaryContact");
                Intrinsics.checkNotNullParameter(travellers, "travellers");
                Intrinsics.checkNotNullParameter(selectedExtraProductTokens, "selectedExtraProductTokens");
                return q5g.s.a(update, new BookingPreviewParams(itineraryOfferId, primaryContact2, travellers, selectedExtraProductTokens), null, null, null, null, null, false, null, 510);
            case 4:
                q5g.s update2 = (q5g.s) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return q5g.s.a(update2, null, null, (PointsRedeemOption) obj4, null, null, null, false, null, 503);
            case 5:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                KProperty[] kPropertyArr = GiveConsentScreen.X;
                TwinVerticalButton twinVerticalButton = ((GiveConsentScreen) obj4).d3().d;
                Intrinsics.h(twinVerticalButton);
                twinVerticalButton.setCollapsed(!zBooleanValue, (twinVerticalButton.getVisibility() == 8 ? 1 : 0) ^ 1);
                twinVerticalButton.setSecondaryButtonVisible(zBooleanValue);
                w01.k.d(twinVerticalButton);
                return Unit.f186387a;
            case 6:
                com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.partner.give_consent.b bVar = (com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.partner.give_consent.b) obj4;
                dii.g outputData = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if (outputData instanceof dii.e) {
                    bVar.n2(new q03.m(bVar, new com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.partner.give_consent.a(bVar, objArr == true ? 1 : 0, i), (Continuation) null), new whi.b(6));
                } else {
                    if (!(outputData instanceof dii.f) && !(outputData instanceof dii.b) && !(outputData instanceof dii.c) && !(outputData instanceof dii.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i22 = jli.h.f175850a;
                }
                return Unit.f186387a;
            case 7:
                WealthMarginMinimumRequirementScreen.Companion aVar2 = WealthMarginMinimumRequirementScreen.INSTANCE;
                com.revolut.feature.wealth.gia.margin_trading.impl.ui.margin_minimum_requirement.a aVar3 = (com.revolut.feature.wealth.gia.margin_trading.impl.ui.margin_minimum_requirement.a) ((WealthMarginMinimumRequirementScreen) obj4).d();
                aVar3.getClass();
                Intrinsics.checkNotNullParameter(paginationEvent, "paginationEvent");
                aVar3.l2(new pwb.p(aVar3, objArr2 == true ? 1 : 0, 16), new yi5.b(26));
                return Unit.f186387a;
            case 8:
                lk0.g pagedData = (lk0.g) obj2;
                Intrinsics.checkNotNullParameter(pagedData, "pagedData");
                pfm.h hVar3 = new pfm.h(new phc.d((com.revolut.feature.wealth.gia.margin_trading.impl.ui.margin_minimum_requirement.a) obj4, pagedData, 10), 2);
                Intrinsics.checkNotNullExpressionValue(hVar3, "fromAction(...)");
                return hVar3;
            case 9:
                com.revolut.feature.credit.loan.impl.ui.rev10.repayamount.a aVar4 = (com.revolut.feature.credit.loan.impl.ui.rev10.repayamount.a) obj4;
                g1j.b result = (g1j.b) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result == null) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar4.f70502x.d3(result.f139686a);
                return Unit.f186387a;
            case 10:
                xi0.b juniorBaseCurrency = (xi0.b) obj2;
                Intrinsics.checkNotNullParameter(juniorBaseCurrency, "juniorBaseCurrency");
                efm.d0 d0VarJ = osg.b.j(((q78.g) obj4).f242779a, io3.l.CURRENT, io3.k.ACTIVE, io3.i.INTERNAL, null, null, null, 56);
                q3d.c cVar = new q3d.c(18, new ou5.a(9, juniorBaseCurrency));
                d0VarJ.getClass();
                ufm.i iVar = new ufm.i(d0VarJ, cVar, 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                return iVar;
            case 11:
                Unit it9 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return (OffboardingScreen) ((q79.d) obj4).f242785c.get("SCREEN_CACHE_KEY");
            case 12:
                KProperty[] kPropertyArr2 = CobrandedCardsPlanHubTransactionsScreen.S;
                com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.transactions.a aVar5 = (com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.transactions.a) ((CobrandedCardsPlanHubTransactionsScreen) obj4).d();
                j2 j2Var = aVar5.f82608s;
                Intrinsics.checkNotNullParameter(paginationEvent, "event");
                List list = (List) ((q7b.f) ((j2) aVar5.f82609t.f22677a).getValue()).f242797b.getContent();
                String str = (list == null || (nVar = (r5b.n) zhm.d0.o0(list)) == null) ? null : nVar.f251577b;
                if (!Intrinsics.f(str, ((q7b.l) j2Var.getValue()).f242804a)) {
                    j2Var.g(null, new q7b.l(str));
                }
                return Unit.f186387a;
            case 13:
                q7c.d dVar = (q7c.d) obj4;
                List deferredPayments = (List) obj2;
                Intrinsics.checkNotNullParameter(deferredPayments, "deferredPayments");
                LocalDate localDateMinusDays = ((l80.f) dVar.f242809c).e().minusDays(1L);
                ArrayList arrayList = new ArrayList();
                for (Object obj5 : deferredPayments) {
                    if (((r7c.a) obj5).f252082c == r7c.b.ACTIVE) {
                        arrayList.add(obj5);
                    }
                }
                ArrayList<r7c.a> arrayList2 = new ArrayList();
                for (Object obj6 : arrayList) {
                    if (((r7c.a) obj6).f.isAfter(localDateMinusDays)) {
                        arrayList2.add(obj6);
                    }
                }
                ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                for (r7c.a deferredPayment : arrayList2) {
                    c7b.a aVar6 = dVar.f242808b;
                    Intrinsics.checkNotNullParameter(deferredPayment, "deferredPayment");
                    String str2 = deferredPayment.f252080a;
                    d6c.c cVar2 = deferredPayment.f252084h;
                    int i32 = q7c.n.f242825a[deferredPayment.f252081b.ordinal()];
                    if (i32 == 1) {
                        hVar = ibd.h.ACQUIRING_ONE_OFF;
                    } else if (i32 == i6) {
                        hVar = ibd.h.ACQUIRING_SUBSCRIPTION;
                    } else {
                        if (i32 != i5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        hVar = ibd.h.UNKNOWN;
                    }
                    ibd.e eVar = new ibd.e(str2, null, hVar, null, null, jli.b.i(deferredPayment.f), null, null, null, null, null, YearClass.CLASS_2010);
                    switch (q7c.n.f242826b[deferredPayment.f252082c.ordinal()]) {
                        case 1:
                            fVar = ibd.f.ACTIVE;
                            break;
                        case 2:
                            fVar = ibd.f.INACTIVE;
                            break;
                        case 3:
                            fVar = ibd.f.UNKNOWN;
                            break;
                        case 4:
                            fVar = ibd.f.BLOCKED;
                            break;
                        case 5:
                            fVar = ibd.f.PENDING;
                            break;
                        case 6:
                            fVar = ibd.f.CONFIRMED;
                            break;
                        case 7:
                            fVar = ibd.f.DISCONFIRMED;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    ibd.f fVar3 = fVar;
                    dj0.d dVar2 = deferredPayment.e;
                    arrayList3.add(new qua.p(eVar, fVar3, null, null, null, null, null, null, dVar2.f115083b.f306286a, Long.valueOf(dVar2.f115082a), cVar2.f111482a, null, aVar6.f21890b.b(new TextLocalisedClause(R$string.revolut_pay_deferred_payment_second_description, null, null, 14)).toString(), null, null, null, null, null, null, null, null, null, new qua.g(cVar2.f111482a, u1.h(cVar2.f111483b, d7c.c.c()), cVar2.f111484c, 497), null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4200196, 33554431));
                    i5 = 3;
                    i6 = 2;
                }
                return arrayList3;
            case 14:
                com.revolut.feature.global_markets.impl.ui.redesign.screen.market.a aVar7 = (com.revolut.feature.global_markets.impl.ui.redesign.screen.market.a) obj4;
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list2 = (List) pair.f186385a;
                eel.c cVar3 = (eel.c) pair.f186386b;
                List list3 = list2;
                ArrayList arrayList4 = new ArrayList(w.t(list3, 10));
                int i33 = 0;
                for (Object obj7 : list3) {
                    int i43 = i33 + 1;
                    if (i33 < 0) {
                        zhm.v.s();
                        throw null;
                    }
                    String str3 = ((lel.b) obj7).f194590b;
                    arrayList4.add(rd0.e.e(new m0(new q87.q(nim.a.v(prk.o.w("MarketDetailsRedesignScreenModel", "observeHistoricalChart", aVar7.v.e(new go.g(cVar3, 2), new go.g(eel.i.PRICE, 2), str3, vgl.b.NONE)), new q2g.h(aVar7, str3, 7)), i), str3, cVar3, i33), h0.f322473a, new q7b.j(str3, cVar3, i33, null)));
                    i33 = i43;
                }
                return arrayList4;
            case 15:
                com.revolut.feature.apm.multibanco.impl.via_verde.ui.list.a aVar8 = (com.revolut.feature.apm.multibanco.impl.via_verde.ui.list.a) obj4;
                Intrinsics.checkNotNullParameter((s92.h) obj2, "outputData");
                aVar8.H2(aVar8.f62671q, new q75.n(28));
                z1 z1Var = aVar8.f62672r;
                Unit unit = Unit.f186387a;
                z1Var.k(unit);
                return unit;
            case 16:
                x xVar = (x) obj4;
                Boolean tradingEnabled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(tradingEnabled, "tradingEnabled");
                return tradingEnabled.booleanValue() ? rd0.e.c(new pkg.e(mo3.a.g(u0.m(ybl.l.d(xVar.f243817b), nim.a.v(tzg.m.c(xVar.f243818c, null, null, 3), new q97.h(i2))), null, new q92.f(4), 1), xVar, i3), kotlin.coroutines.g.f186406a) : te0.w.h(f0.f322471a);
            case 17:
                w0 w0Var = (w0) obj4;
                Boolean tradingEnabled2 = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(tradingEnabled2, "tradingEnabled");
                return tradingEnabled2.booleanValue() ? rd0.e.c(new pkg.e(mo3.a.g(u0.m(ybl.l.d(w0Var.d), nim.a.v(tzg.m.c(w0Var.f243813c, null, cfl.l.f23745a, 1), new q97.h(24))), null, new q92.f(12), 1), w0Var, 16), kotlin.coroutines.g.f186406a) : te0.w.h(f0.f322471a);
            case 18:
                List lifestyleProductsEligibility = (List) obj2;
                Intrinsics.checkNotNullParameter(lifestyleProductsEligibility, "lifestyleProductsEligibility");
                Set setI1 = zhm.d0.i1(lifestyleProductsEligibility);
                List list4 = ((e1) obj4).f243680g;
                ArrayList arrayList5 = new ArrayList();
                for (Object obj8 : list4) {
                    if (setI1.contains((b39.d) ((Pair) obj8).f186385a)) {
                        arrayList5.add(obj8);
                    }
                }
                ArrayList arrayList6 = new ArrayList(w.t(arrayList5, 10));
                Iterator it10 = arrayList5.iterator();
                while (it10.hasNext()) {
                    arrayList6.add(t97.c.a((t97.d) ((Pair) it10.next()).f186386b));
                }
                return arrayList6;
            case 19:
                g0 g0Var = (g0) obj4;
                Data data2 = (Data) obj2;
                Intrinsics.checkNotNullParameter(data2, "data");
                try {
                    Object content = data2.getContent();
                    data = new Data(content != null ? zhm.u.c(p97.a.a(t97.c.a(t97.d.PRICING_PLAN), 0, null, null, fgk.b.a((yik.h) g0Var.d, ((PricingPlanSubscription) content).f81129a), null, null, LDSFile.EF_DG15_TAG)) : null, data2.getError(), data2.getLoading());
                } catch (Throwable th10) {
                    data = new Data(null, th10, data2.getLoading());
                }
                Throwable error = data.getError();
                if (data.getContent() != null || error == null) {
                    return data;
                }
                try {
                    return new Data(f0.f322471a, null, data.getLoading());
                } catch (Throwable th11) {
                    return new Data(null, th11, data.getLoading());
                }
                break;
            case 20:
                x2 x2Var = (x2) obj4;
                Boolean tradingEnabled3 = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(tradingEnabled3, "tradingEnabled");
                return tradingEnabled3.booleanValue() ? rd0.e.c(new v2(mo3.a.g(u0.m(ybl.l.d(x2Var.d), nim.a.v(tzg.m.c(x2Var.f243822b, null, null, 3), new l1(12))), null, new q2(i5), 1), x2Var, i21), kotlin.coroutines.g.f186406a) : te0.w.h(f0.f322471a);
            case 21:
                o3 o3Var = (o3) obj4;
                od0.i addOn = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(addOn, "addOn");
                j23.b bVarD = o3Var.f243760b.d();
                kotlin.coroutines.g gVar = kotlin.coroutines.g.f186406a;
                return te0.w.l(rd0.e.c(bVarD, gVar), m70.a.g(rd0.e.c(ybl.l.d(o3Var.f243761c), gVar), null, new q2(12), 1)).map(new h2(i3, new z(19, addOn)));
            case 22:
                do3.n it11 = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                AccountPickerItem accountPickerItem = new AccountPickerItem("USER_PROFILE_ID", new TextClause(te0.w.I(it11), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.revolut_pay_order_summary_account_picker_personal_title, null, null, 14), new UserAvatarImage(new UserNamePlaceholder.Default(te0.w.I(it11), 0), null, null, 6), false, null);
                return new SummaryAccountPickerExtension$AccountPickerConfiguration(zhm.v.k(accountPickerItem, new AccountPickerItem("REDIRECT_TO_BUSINESS_ID", new TextLocalisedClause(R$string.revolut_pay_order_summary_account_picker_business_app_title, null, null, 14), new TextLocalisedClause(R$string.revolut_pay_order_summary_account_picker_business_app_subtitle, null, null, 14), c7c.b.f21927a, true, (ExternalDestination.ByIntent) obj4)), accountPickerItem);
            case 23:
                ((q9c.k) obj2).getClass();
                return new q9c.k((q9c.e) obj4);
            case 24:
                t6c.f fVar4 = (t6c.f) obj4;
                q9c.s update3 = (q9c.s) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                PaymentScheduleSelection paymentScheduleSelectionB3 = com.revolut.feature.revolutpay.impl.domain.models.payment_schedule.a.b(fVar4, update3.f243878b);
                return q9c.s.a(update3, fVar4, paymentScheduleSelectionB3 == null ? payNow : paymentScheduleSelectionB3, false, null, 12);
            case 25:
                i9c.b bVar2 = (i9c.b) obj4;
                q9c.s update4 = (q9c.s) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                t6c.f fVar5 = update4.f243877a;
                return q9c.s.a(update4, null, (fVar5 == null || (paymentScheduleSelectionB = com.revolut.feature.revolutpay.impl.domain.models.payment_schedule.a.b(fVar5, bVar2.f159622a)) == null) ? payNow : paymentScheduleSelectionB, false, null, 13);
            case 26:
                q9c.s update5 = (q9c.s) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                List list5 = ((t6c.o) obj4).f268306a;
                t6c.f fVar6 = update5.f243877a;
                Intrinsics.checkNotNullParameter(list5, "<this>");
                if (fVar6 == null) {
                    fVar2 = (t6c.f) zhm.d0.d0(list5);
                } else {
                    List list6 = list5;
                    Iterator it12 = list6.iterator();
                    while (true) {
                        if (it12.hasNext()) {
                            next = it12.next();
                            if (Intrinsics.f((t6c.f) next, fVar6)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    t6c.f fVar7 = (t6c.f) next;
                    if (fVar7 == null) {
                        Iterator it13 = list6.iterator();
                        while (true) {
                            if (it13.hasNext()) {
                                Object next2 = it13.next();
                                if (Intrinsics.f(((t6c.f) next2).f268292b, fVar6.f268292b)) {
                                    obj3 = next2;
                                }
                            }
                        }
                        t6c.f fVar8 = (t6c.f) obj3;
                        fVar2 = fVar8 == null ? (t6c.f) zhm.d0.d0(list5) : fVar8;
                    } else {
                        fVar2 = fVar7;
                    }
                }
                return q9c.s.a(update5, fVar2, (fVar2 == null || (paymentScheduleSelectionB2 = com.revolut.feature.revolutpay.impl.domain.models.payment_schedule.a.b(fVar2, update5.f243878b)) == null) ? payNow : paymentScheduleSelectionB2, false, null, 12);
            case 27:
                NaviCommand naviCommand = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(naviCommand, "naviCommand");
                ((q9f.d) obj4).f243890a.c(naviCommand);
                return Boolean.TRUE;
            case 28:
                Map it14 = (Map) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                int i59 = q9h.d.f243901c[((q0h.i) obj4).b().ordinal()];
                if (i59 == 1) {
                    d0Var = d0.MOST_TRADED;
                } else if (i59 == 2) {
                    d0Var = d0.MOST_BOUGHT;
                } else {
                    if (i59 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    d0Var = d0.MOST_SOLD;
                }
                return (List) it14.get(d0Var);
            default:
                qa4.e update6 = (qa4.e) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                ((qa4.k) obj4).f243956p.getClass();
                return qa4.e.a(update6, 0, SystemClock.elapsedRealtime(), 5);
        }
    }
}
