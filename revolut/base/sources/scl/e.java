package scl;

import ael.k;
import cfl.f0;
import ch.qos.logback.core.net.SyslogConstants;
import ckd.o;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.feature.acquiring.lite_pos.api.model.TaxRate;
import com.revolut.feature.revolutpay.api.shared.domain.models.PaymentInitiationParams;
import com.revolut.feature.revolutpay.shipping.api.domain.models.deliverymethod.DeliveryMethods;
import com.revolut.feature.slot_manager.api.model.prompt.SlotPrompt;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.guests_reviews.TravelHotelsPropertyGuestsReviewsScreen;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentContract$OutputData;
import com.revolut.shared.feature.wealth.domain.api.interactors.InstrumentTickerInteractor$Companion;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import com.revolut.shared.feature.wealth.models.options.Option;
import com.revolut.shared.feature.wealth.models.options.OptionWithTicker;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccounts;
import efm.d0;
import ekd.n0;
import ekd.z;
import fkd.w0;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import lk0.h;
import ml3.p;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.lds.LDSFile;
import pfm.m;
import sek.n;
import sek.u;
import skm.e0;
import til.r;
import tkd.l;
import yy3.y;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f261765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f261766b;

    public /* synthetic */ e(Object obj2, int i) {
        this.f261765a = i;
        this.f261766b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object it8) {
        OptionWithTicker optionWithTicker;
        efm.b hVar;
        int i = this.f261765a;
        ?? r112 = 0;
        ?? r113 = 0;
        Object obj2 = this.f261766b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter((Unit) it8, "it");
                return (TradingAccounts) ((g) obj2).f261767a.get("TradingAccounts-availableTradingAccounts");
            case 1:
                UUID id10 = (UUID) it8;
                Intrinsics.checkNotNullParameter(id10, "id");
                return (f0) ((j) obj2).f261772a.get(i.a(j.Companion, id10));
            case 2:
                sd3.f updateState = (sd3.f) it8;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                Object obj3 = ((SingleChoiceDelegate.Model) obj2).f;
                Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.cashback.impl.ui.yourcashback.cashback_transactions.CashbackTransactionsScreenContract.SelectedSourceTypeFilter");
                return sd3.f.a(updateState, null, (sd3.h) obj3, 3);
            case 3:
                sd5.b bVar = (sd5.b) obj2;
                od0.i optionalUrl = (od0.i) it8;
                Intrinsics.checkNotNullParameter(optionalUrl, "optionalUrl");
                String str = (String) optionalUrl.f224257a;
                String strB = str != null ? bVar.b(str) : null;
                od0.i.Companion.getClass();
                return od0.h.a(strB);
            case 4:
                sdc.e update = (sdc.e) it8;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                sdc.c idempotencyKey = ((sdc.f) obj2).Z2();
                PaymentInitiationParams paymentInitiationParams = update.f261850b;
                Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
                return new sdc.e(idempotencyKey, paymentInitiationParams);
            case 5:
                lk0.g pagedData = (lk0.g) it8;
                Intrinsics.checkNotNullParameter(pagedData, "pagedData");
                pfm.h hVar2 = new pfm.h(new rzc.b((sdg.a) obj2, pagedData, 9), 2);
                Intrinsics.checkNotNullExpressionValue(hVar2, "fromAction(...)");
                return hVar2;
            case 6:
                KProperty[] kPropertyArr = TravelHotelsPropertyGuestsReviewsScreen.R;
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.guests_reviews.a aVar = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.guests_reviews.a) ((TravelHotelsPropertyGuestsReviewsScreen) obj2).e3();
                aVar.getClass();
                h.b event = h.b.f196176a;
                Intrinsics.checkNotNullParameter(event, "event");
                aVar.f93994s.onNext(event);
                return Unit.f186387a;
            case 7:
                s1c.d dVar = (s1c.d) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return dVar;
            case 8:
                se1.d updateState2 = (se1.d) it8;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                return se1.d.a(updateState2, null, null, false, null, (TaxRate) obj2, 15);
            case 9:
                Intrinsics.checkNotNullParameter((Unit) it8, "it");
                return (we3.d) ((se3.c) obj2).f262096b.get("category_boosts_overview");
            case 10:
                return se4.e.a((se4.e) it8, null, null, null, null, ((y) obj2).f317806a, null, 47);
            case 11:
                sec.b update2 = (sec.b) it8;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return sec.b.a(update2, null, (DeliveryMethods.DeliveryMethod) obj2, 5);
            case 12:
                rul.e eVar = (rul.e) obj2;
                teh.a chainPage = (teh.a) it8;
                Intrinsics.checkNotNullParameter(chainPage, "chainPage");
                ArrayList arrayList = chainPage.d;
                ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                Iterator it9 = arrayList.iterator();
                while (it9.hasNext()) {
                    arrayList2.add(((Option) it9.next()).f105138a);
                }
                ybl.b bVar2 = (ybl.b) eVar.f257630b;
                ybl.b.Companion.getClass();
                return nim.a.v(rd0.e.b(((k) bVar2).i(arrayList2, InstrumentTickerInteractor$Companion.f105074b)), new e(chainPage, 13));
            case 13:
                teh.a aVar2 = (teh.a) obj2;
                List tickers = (List) it8;
                Intrinsics.checkNotNullParameter(tickers, "tickers");
                List list = tickers;
                int iB = q0.b(w.t(list, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap tickerByRef = new LinkedHashMap(iB);
                for (Object obj4 : list) {
                    tickerByRef.put(((InstrumentTicker) obj4).f105112b, obj4);
                }
                Intrinsics.checkNotNullParameter(aVar2, "<this>");
                Intrinsics.checkNotNullParameter(tickerByRef, "tickerByRef");
                String str2 = aVar2.f270097a;
                LocalDate localDate = aVar2.f270098b;
                xi0.b bVar3 = aVar2.f270099c;
                ArrayList<Option> arrayList3 = aVar2.d;
                ArrayList arrayList4 = new ArrayList();
                for (Option option : arrayList3) {
                    InstrumentTicker instrumentTicker = (InstrumentTicker) tickerByRef.get(option.f105138a);
                    if (instrumentTicker != null) {
                        optionWithTicker = new OptionWithTicker(option, instrumentTicker);
                    } else {
                        r6.b.D("Item in options chain is missing its ticker");
                        optionWithTicker = null;
                    }
                    if (optionWithTicker != null) {
                        arrayList4.add(optionWithTicker);
                    }
                }
                return new teh.d(str2, localDate, bVar3, arrayList4, aVar2.e, aVar2.f);
            case 14:
                Intrinsics.checkNotNullParameter((Function0) it8, "it");
                return new n(iii.c.c(5), u.b(), ((u) obj2).a());
            case 15:
                com.revolut.feature.apm.upi.impl.flow.intent_payment.a aVar3 = (com.revolut.feature.apm.upi.impl.flow.intent_payment.a) obj2;
                tf2.f result = (tf2.f) it8;
                Intrinsics.checkNotNullParameter(result, "result");
                aVar3.C1(new BridgeDestination(com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), ((v3a.b) aVar3.f62982p).e(result.f270214a, null))));
                return Unit.f186387a;
            case 16:
                Function0 getDefaultLoadingItems = (Function0) it8;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return new pf4.u((List) getDefaultLoadingItems.invoke(), ((qf4.g) obj2).f245241b.b(), true, null, false, SyslogConstants.LOG_CLOCK);
            case 17:
                Throwable error = (Throwable) it8;
                Intrinsics.checkNotNullParameter(error, "error");
                ((sgg.j) obj2).C2(new sgg.c(error));
                return Boolean.TRUE;
            case 18:
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.cancel_student_benefits.a aVar4 = (com.revolut.retail.feature.pricing_plans.ui.impl.flows.cancel_student_benefits.a) obj2;
                dii.g outputData = (dii.g) it8;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if (Intrinsics.f(outputData, dii.e.f115068a)) {
                    aVar4.C2(sgk.c.f262665a);
                } else if (Intrinsics.f(outputData, dii.f.f115069a)) {
                    aVar4.l2(new s64.a(aVar4, r112 == true ? 1 : 0, 20), new yi5.b(26));
                } else if (!(outputData instanceof dii.b) && !(outputData instanceof dii.c) && !(outputData instanceof dii.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            case 19:
                com.revolut.feature.junior_profile.impl.ui.flow.details.a aVar5 = (com.revolut.feature.junior_profile.impl.ui.flow.details.a) obj2;
                Intrinsics.checkNotNullParameter((r) it8, "it");
                kge.d dVar2 = aVar5.f77139q;
                String juniorId = aVar5.o.f263687a;
                dVar2.getClass();
                Intrinsics.checkNotNullParameter(juniorId, "juniorId");
                e0.C((CoroutineScope) dVar2.f183975c, null, null, new n3j.w(dVar2, juniorId, (Continuation) (r113 == true ? 1 : 0), 29), 3);
                return Unit.f186387a;
            case 20:
                od0.i iVar = (od0.i) it8;
                return iVar.d() ? d0.m(iVar.c()) : ((z39.b) ((sk2.i) obj2).f263765b).f319221b.e().t(5000L, TimeUnit.MILLISECONDS);
            case 21:
                Intrinsics.checkNotNullParameter((PendingPaymentContract$OutputData) it8, "it");
                oki.h.D2(((com.revolut.feature.external_accounts.impl.ui.colombia.pse.a) obj2).f72721p);
                return Unit.f186387a;
            case 22:
                o it10 = (o) obj2;
                l oldData = (l) it8;
                Intrinsics.checkNotNullParameter(oldData, "oldData");
                List list2 = oldData.f271948g;
                ArrayList arrayList5 = new ArrayList();
                for (Object obj5 : list2) {
                    o it11 = (o) obj5;
                    Intrinsics.checkNotNullParameter(it11, "it");
                    ?? r3 = it11.f24815a.f24812a;
                    Intrinsics.checkNotNullParameter(it10, "it");
                    String str3 = it10.f24815a.f24812a;
                    if (!((r3.length() > 0 && str3.length() > 0) != false ? r3.equals(str3) : Intrinsics.f(it11, it10))) {
                        arrayList5.add(obj5);
                    }
                }
                return l.a(oldData, null, null, null, null, null, arrayList5, 63);
            case 23:
                SlotPrompt it12 = (SlotPrompt) obj2;
                l oldData2 = (l) it8;
                Intrinsics.checkNotNullParameter(oldData2, "oldData");
                List list3 = oldData2.f271945a;
                ArrayList arrayList6 = new ArrayList();
                for (Object obj6 : list3) {
                    SlotPrompt it13 = (SlotPrompt) obj6;
                    Intrinsics.checkNotNullParameter(it13, "it");
                    ?? r4 = it13.getF87317a().f87339a;
                    Intrinsics.checkNotNullParameter(it12, "it");
                    String str4 = it12.getF87317a().f87339a;
                    if (!((r4.length() > 0 && str4.length() > 0) != false ? r4.equals(str4) : Intrinsics.f(it13, it12))) {
                        arrayList6.add(obj6);
                    }
                }
                return l.a(oldData2, arrayList6, null, null, null, null, null, 126);
            case 24:
                akd.r it14 = (akd.r) obj2;
                l oldData3 = (l) it8;
                Intrinsics.checkNotNullParameter(oldData3, "oldData");
                List list4 = oldData3.e;
                ArrayList arrayList7 = new ArrayList();
                for (Object obj7 : list4) {
                    akd.r it15 = (akd.r) obj7;
                    Intrinsics.checkNotNullParameter(it15, "it");
                    ?? r310 = it15.f5800a.f5794a;
                    Intrinsics.checkNotNullParameter(it14, "it");
                    String str5 = it14.f5800a.f5794a;
                    if (!((r310.length() > 0 && str5.length() > 0) != false ? r310.equals(str5) : Intrinsics.f(it15, it14))) {
                        arrayList7.add(obj7);
                    }
                }
                return l.a(oldData3, null, null, null, arrayList7, null, null, LDSFile.EF_DG15_TAG);
            case 25:
                n0 it16 = (n0) obj2;
                l oldData4 = (l) it8;
                Intrinsics.checkNotNullParameter(oldData4, "oldData");
                List list5 = oldData4.f271947c;
                ArrayList arrayList8 = new ArrayList();
                for (Object obj8 : list5) {
                    ekd.q0 it17 = (ekd.q0) obj8;
                    Intrinsics.checkNotNullParameter(it17, "it");
                    String strA = it17.H().a();
                    Intrinsics.checkNotNullParameter(it16, "it");
                    String strA2 = it16.H().a();
                    if (!((strA.length() > 0 && strA2.length() > 0) != false ? strA.equals(strA2) : Intrinsics.f(it17, it16))) {
                        arrayList8.add(obj8);
                    }
                }
                return l.a(oldData4, null, null, arrayList8, null, null, null, 123);
            case 26:
                w0 it18 = (w0) obj2;
                l oldData5 = (l) it8;
                Intrinsics.checkNotNullParameter(oldData5, "oldData");
                List list6 = oldData5.f271946b;
                ArrayList arrayList9 = new ArrayList();
                for (Object obj9 : list6) {
                    w0 it19 = (w0) obj9;
                    Intrinsics.checkNotNullParameter(it19, "it");
                    ?? r42 = it19.H().f135797a;
                    Intrinsics.checkNotNullParameter(it18, "it");
                    String str6 = it18.H().f135797a;
                    if (!((r42.length() > 0 && str6.length() > 0) != false ? r42.equals(str6) : Intrinsics.f(it19, it18))) {
                        arrayList9.add(obj9);
                    }
                }
                return l.a(oldData5, null, arrayList9, null, null, null, null, ISO781611.SMT_TAG);
            case 27:
                z it20 = (z) obj2;
                l oldData6 = (l) it8;
                Intrinsics.checkNotNullParameter(oldData6, "oldData");
                List list7 = oldData6.f271947c;
                ArrayList arrayList10 = new ArrayList();
                for (Object obj10 : list7) {
                    ekd.q0 it21 = (ekd.q0) obj10;
                    Intrinsics.checkNotNullParameter(it21, "it");
                    String strA3 = it21.H().a();
                    Intrinsics.checkNotNullParameter(it20, "it");
                    String strA4 = it20.H().a();
                    if (!((strA3.length() > 0 && strA4.length() > 0) != false ? strA3.equals(strA4) : Intrinsics.f(it21, it20))) {
                        arrayList10.add(obj10);
                    }
                }
                return l.a(oldData6, null, null, arrayList10, null, null, null, 123);
            case 28:
                sl3.b bVar4 = (sl3.b) obj2;
                bl3.b permissionState = (bl3.b) it8;
                Intrinsics.checkNotNullParameter(permissionState, "permissionState");
                if (permissionState == bl3.b.GRANTED) {
                    hVar = new pfm.h(new oma.r(bVar4, 25), 2);
                    Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                } else {
                    hVar = m.f235744a;
                }
                return hVar.f(d0.m(permissionState));
            default:
                ml3.o oVar = (ml3.o) obj2;
                p extra = (p) it8;
                Intrinsics.checkNotNullParameter(extra, "extra");
                Intrinsics.h(oVar);
                return pyd.c.e0(oVar, extra);
        }
    }

    public /* synthetic */ e(skd.i iVar, Object obj2, int i) {
        this.f261765a = i;
        this.f261766b = obj2;
    }
}
