package qa9;

import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.backend_flow.domain.models.TutorialScreen;
import com.revolut.feature.credit_card.autopay.api.CreditCardAutoPayApi$Toggles$CreditCardAutoPaymentMethodsIe;
import com.revolut.feature.donations.impl.ui.kompot.screen.transactions.CharityTransactionsScreen;
import com.revolut.feature.junior_allowance.impl.R$string;
import com.revolut.feature.revolutpay.promoted_merchants.impl.ui.promotedmerchants.list.RevolutPayPromotedMerchantsController;
import com.revolut.feature.shared_separate_favourites.alerts.ui.flow.add_alert.SharedAddAlertFlowContract$State;
import com.revolut.feature_retail_user_declarations.transaction_countries.models.TransactionDestination;
import com.youTransactor.uCube.rpc.Constants;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import lk0.h;
import qc0.l0;
import qce.t0;
import s7a.a0;
import s7a.c0;
import tof.a3;
import zhm.a1;
import zhm.d0;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class r implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f244000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f244001b;

    public /* synthetic */ r(Object obj2, int i) {
        this.f244000a = i;
        this.f244001b = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v47, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v69, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ShotDialogDisplayer$Configuration shotDialogDisplayer$ConfigurationF;
        int i = 27;
        int i2 = 2;
        int i3 = 1;
        int i5 = 26;
        Continuation continuation = null;
        switch (this.f244000a) {
            case 0:
                com.revolut.feature.onboarding.impl.onboarding.country.screen.a aVar = (com.revolut.feature.onboarding.impl.onboarding.country.screen.a) this.f244001b;
                a0 output = (a0) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                c0 c0Var = output.f260599a;
                s7a.q qVar = c0Var instanceof s7a.q ? (s7a.q) c0Var : null;
                String str = qVar != null ? qVar.f260624a : null;
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                wi0.b.Companion.getClass();
                aVar.l2(new q03.m(aVar, wi0.a.a(str), continuation, i5), new yi5.b(i5));
                return Unit.f186387a;
            case 1:
                return d0.F0((pac.f) this.f244001b, (List) obj2);
            case 2:
                kgm.i iVar = (kgm.i) this.f244001b;
                List transactionsList = (List) obj2;
                Intrinsics.checkNotNullParameter(transactionsList, "transactionsList");
                String str2 = (String) ((pae.h) ((pae.b) iVar.f184023b)).w0().get();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : transactionsList) {
                    if (kotlin.text.d0.J(((bnf.r) ((thf.m) iVar.f184024c)).g((a3) obj3), str2, true)) {
                        arrayList.add(obj3);
                    }
                }
                return arrayList;
            case 3:
                qb3.h hVar = (qb3.h) this.f244001b;
                com.revolut.feature.cash_topup.impl.ui.amount.a updateState = (com.revolut.feature.cash_topup.impl.ui.amount.a) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return hVar;
            case 4:
                qb5.b bVar = (qb5.b) this.f244001b;
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                mb5.b bVar2 = (mb5.b) pair.f186385a;
                wi0.b bVar3 = (wi0.b) pair.f186386b;
                List list = bVar2.d;
                ArrayList payments = new ArrayList();
                for (Object obj4 : list) {
                    mb5.s sVar = (mb5.s) obj4;
                    wi0.b.Companion.getClass();
                    if (Intrinsics.f(bVar3, wi0.b.L0) && sVar.f204155a != mb5.u.SCHEDULED) {
                        if (((jte.d) bVar.f244120c).c(CreditCardAutoPayApi$Toggles$CreditCardAutoPaymentMethodsIe.f70676c)) {
                        }
                    }
                    payments.add(obj4);
                }
                long j2 = bVar2.f204130a;
                long j3 = bVar2.f204131b;
                xi0.b currency = bVar2.f204132c;
                Intrinsics.checkNotNullParameter(currency, "currency");
                Intrinsics.checkNotNullParameter(payments, "payments");
                return new mb5.b(j2, j3, currency, payments);
            case 5:
                qb8.b bVar4 = (qb8.b) this.f244001b;
                yb8.a aVar2 = bVar4.f244135j;
                nb8.h event = (nb8.h) obj2;
                Intrinsics.checkNotNullParameter(event, "event");
                int i6 = qb8.a.f244133a[event.ordinal()];
                if (i6 == 1) {
                    int i21 = R$string.allowance_create_amount_screen_toast_success;
                    aVar2.getClass();
                    shotDialogDisplayer$ConfigurationF = ShotDialogDisplayer$Configuration.Companion.f(ShotDialogDisplayer$Configuration.INSTANCE, "ALLOWANCE_SUCCESS_CONFIRMATION_ID", new TextLocalisedClause(i21, null, null, 14), null, null, null, 60);
                } else {
                    if (i6 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i22 = R$string.junior_allowance_update_success;
                    aVar2.getClass();
                    shotDialogDisplayer$ConfigurationF = ShotDialogDisplayer$Configuration.Companion.f(ShotDialogDisplayer$Configuration.INSTANCE, "ALLOWANCE_SUCCESS_CONFIRMATION_ID", new TextLocalisedClause(i22, null, null, 14), null, null, null, 60);
                }
                ((r3l.c) bVar4.f244134h).N(shotDialogDisplayer$ConfigurationF);
                return Unit.f186387a;
            case 6:
                qb9.b bVar5 = (qb9.b) this.f244001b;
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return (pd9.a) bVar5.f244137b.get("onboarding_countries_memory_key");
            case 7:
                qb9.g gVar = (qb9.g) this.f244001b;
                Unit it9 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return gVar.f244143b;
            case 8:
                qba.n nVar = (qba.n) this.f244001b;
                dpf.c output2 = (dpf.c) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                if (!(output2 instanceof dpf.a)) {
                    if (!(output2 instanceof dpf.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    nVar.H2(nVar.f244170r, new bg2.p(output2, 9));
                }
                return Unit.f186387a;
            case 9:
                qbb.a aVar3 = (qbb.a) this.f244001b;
                e7l.f config = (e7l.f) obj2;
                Intrinsics.checkNotNullParameter(config, "config");
                ui0.d dVar = aVar3.f244172b;
                ui0.c cVar = ui0.d.Companion;
                String str3 = config.f123368e0;
                if (str3 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                cVar.getClass();
                ui0.d dVarA = ui0.c.a(str3);
                Instant instant = config.f0;
                if (instant == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                LocalDate localDate = instant.atZone(ZoneId.systemDefault()).toLocalDate();
                Intrinsics.checkNotNullExpressionValue(localDate, "toLocalDate(...)");
                return new zp.b(dVar, dVarA, localDate);
            case 10:
                qc0.l lVar = (qc0.l) this.f244001b;
                List items = (List) obj2;
                Intrinsics.checkNotNullParameter(items, "it");
                if (items.isEmpty()) {
                    Object value = ((qc0.b) lVar).f244396v0.getValue();
                    Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                    ((RecyclerView) value).setVisibility(8);
                } else {
                    qc0.b bVar6 = (qc0.b) lVar;
                    Object value2 = bVar6.f244396v0.getValue();
                    Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                    ((RecyclerView) value2).setVisibility(0);
                    Intrinsics.checkNotNullParameter(items, "items");
                    ((z4l.j) bVar6.A0.getValue()).c(items);
                }
                return Unit.f186387a;
            case 11:
                TutorialScreen tutorialScreen = (TutorialScreen) this.f244001b;
                if (!((Boolean) obj2).booleanValue()) {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(j6.a.q("Deeplink was not handled: ", tutorialScreen.f63716j));
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
                }
                return Unit.f186387a;
            case 12:
                qb5.a aVar4 = (qb5.a) this.f244001b;
                Map snapshot = (Map) obj2;
                Intrinsics.checkNotNullParameter(snapshot, "snapshot");
                return (Map) aVar4.invoke(snapshot);
            case 13:
                qc2.n nVar2 = (qc2.n) this.f244001b;
                nVar2.l2(new jkh.g(i, continuation, nVar2, ((Boolean) obj2).booleanValue()), new yi5.b(i5));
                return Unit.f186387a;
            case 14:
                qc3.k kVar = (qc3.k) this.f244001b;
                co3.a location = (co3.a) obj2;
                Intrinsics.checkNotNullParameter(location, "location");
                return kVar.o.c(location, location, cb3.a.EU_FLOW);
            case 15:
                CharityTransactionsScreen charityTransactionsScreen = (CharityTransactionsScreen) this.f244001b;
                KProperty[] kPropertyArr = CharityTransactionsScreen.S;
                qc6.b bVar7 = (qc6.b) charityTransactionsScreen.M.getValue();
                h.b paginationEvent = h.b.f196176a;
                qc6.j jVar = (qc6.j) bVar7;
                jVar.getClass();
                Intrinsics.checkNotNullParameter(paginationEvent, "paginationEvent");
                jVar.f244576q.k(paginationEvent);
                return Unit.f186387a;
            case 16:
                qc7.e eVar = (qc7.e) this.f244001b;
                Boolean juniorFeatureEnabled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(juniorFeatureEnabled, "juniorFeatureEnabled");
                return juniorFeatureEnabled.booleanValue() ? rd0.e.c(eVar.f244591h.c(null, w4l.h.f294642c), kotlin.coroutines.g.f186406a).filter(new l0(i5, new qc7.c(i3))).map(new l0(i, new qc7.c(i2))) : te0.w.h(f0.f322471a);
            case 17:
                RevolutPayPromotedMerchantsController revolutPayPromotedMerchantsController = (RevolutPayPromotedMerchantsController) this.f244001b;
                KProperty[] kPropertyArr2 = RevolutPayPromotedMerchantsController.T;
                qcc.f fVarE3 = revolutPayPromotedMerchantsController.d();
                h.b paginationEvent2 = h.b.f196176a;
                qcc.m mVar = (qcc.m) fVarE3;
                mVar.getClass();
                Intrinsics.checkNotNullParameter(paginationEvent2, "paginationEvent");
                mVar.l2(new qc8.b(mVar, continuation, i3), new yi5.b(i5));
                return Unit.f186387a;
            case 18:
                qcc.m mVar2 = (qcc.m) this.f244001b;
                List categories = (List) obj2;
                Intrinsics.checkNotNullParameter(categories, "categories");
                return ue0.e.J(mVar2.v, categories);
            case 19:
                qce.d dVar2 = (qce.d) this.f244001b;
                psg.a it10 = (psg.a) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return hj8.a.a(dVar2.f, it10.f239485b, w4l.h.f294642c);
            case 20:
                t0 t0Var = (t0) this.f244001b;
                psg.a it11 = (psg.a) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return hj8.a.a(t0Var.f, it11.f239485b, w4l.h.f294642c);
            case 21:
                TransactionDestination transactionDestination = (TransactionDestination) this.f244001b;
                qci.c update = (qci.c) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return qci.c.a(update, a1.m(update.f244791a, transactionDestination), null, 2);
            case 22:
                qd8.f fVar = (qd8.f) this.f244001b;
                Throwable it12 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                fVar.s1();
                fVar.B2();
                return Boolean.FALSE;
            case 23:
                qe0.d dVar3 = (qe0.d) this.f244001b;
                qe0.e data = (qe0.e) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data.f245020a.contains(dVar3));
            case 24:
                com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_tax_rate.a aVar5 = (com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_tax_rate.a) this.f244001b;
                dii.g output3 = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(output3, "output");
                if (output3 instanceof dii.f) {
                    aVar5.l2(new qe1.j(aVar5, null), new yi5.b(i5));
                }
                return Unit.f186387a;
            case 25:
                bgd.e eVar2 = (bgd.e) this.f244001b;
                SharedAddAlertFlowContract$State update2 = (SharedAddAlertFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return SharedAddAlertFlowContract$State.a(update2, ((bgd.d) eVar2).f15176a, null, null, 14);
            case 26:
                com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.kompot.a aVar6 = (com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.kompot.a) this.f244001b;
                see.d result = (see.d) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (Intrinsics.f(result, see.c.f262182a)) {
                    aVar6.A1(new qee.o(aVar6, continuation, 4), new yi5.b(25));
                } else if (!Intrinsics.f(result, see.b.f262181a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            case 27:
                qeg.j jVar2 = (qeg.j) this.f244001b;
                zfi.c filtersLists = (zfi.c) obj2;
                Intrinsics.checkNotNullParameter(filtersLists, "filtersLists");
                for (zfi.b bVar8 : filtersLists.f321957b) {
                    if (Intrinsics.f(bVar8.c(), jVar2.o.f94041a)) {
                        return bVar8;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 28:
                qf4.g gVar2 = (qf4.g) this.f244001b;
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return new pf4.u((List) getDefaultLoadingItems.invoke(), gVar2.f245241b.a(), true, null, false, SyslogConstants.LOG_CLOCK);
            default:
                rgf.g gVar3 = (rgf.g) this.f244001b;
                qgf.h update3 = (qgf.h) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return qgf.h.a(update3, null, null, false, gVar3.f254155a, !gVar3.f254156b, null, null, null, Constants.TAG_E7_NFC_CARD_DETECT_CONFIGURATION);
        }
    }
}
