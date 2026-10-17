package gqh;

import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.domain.models.transactions.ThreeDSTransaction;
import com.revolut.feature.acquiring.card_reader.data.impl.domain.exception.PaymentAuthorizationInProgressException;
import com.revolut.feature.apm.blik.impl.ui.confirmation.InvalidPendingTransactionState;
import com.revolut.feature.credit.card.api.navigation.CreditCardKompotFeatureConfig;
import com.revolut.feature.credit.card.api.navigation.CreditCardSetupAutoPayDestination;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayPayments;
import com.revolut.feature.direct_deposit.impl.model.DepositAmount;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.traveller_details.AsftTravellerDetailsScreenContract$DomainState$TravellerDetails;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import fa1.y;
import ha1.u;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import zh9.u0;
import zhm.a1;
import zhm.d0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f145721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f145722b;

    public /* synthetic */ a(hma.o oVar, String str, int i) {
        this.f145721a = i;
        this.f145722b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws InvalidPendingTransactionState, PaymentAuthorizationInProgressException {
        c02.j jVar;
        int i = this.f145721a;
        Object obj3 = null;
        Object obj4 = null;
        String paymentId = this.f145722b;
        switch (i) {
            case 0:
                f update = (f) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return f.a(update, null, null, paymentId, 3);
            case 1:
                grd.a update2 = (grd.a) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return grd.a.a(update2, null, null, null, null, null, a1.m(update2.f145987j, paymentId), false, null, null, null, 32127);
            case 2:
                grd.a update3 = (grd.a) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return grd.a.a(update3, null, r0.l(paymentId, update3.d), null, null, null, null, false, null, null, null, 32759);
            case 3:
                grd.a update4 = (grd.a) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return grd.a.a(update4, null, null, r0.l(paymentId, update4.e), null, null, null, false, null, null, null, 32751);
            case 4:
                grd.a aVar = (grd.a) obj2;
                return grd.a.a(aVar, null, r0.q(aVar.d, new Pair("country", paymentId)), null, null, null, null, false, null, null, null, 32759);
            case 5:
                List budgets = (List) obj2;
                Intrinsics.checkNotNullParameter(budgets, "budgets");
                od0.h hVar = od0.i.Companion;
                Iterator it8 = budgets.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        Object next = it8.next();
                        if (Intrinsics.f(((qzi.a) next).d, paymentId)) {
                            obj3 = next;
                        }
                    }
                }
                hVar.getClass();
                return od0.h.a(obj3);
            case 6:
                gs.k update5 = (gs.k) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return gs.k.a(update5, new gs.f(paymentId), null, 0, false, 30);
            case 7:
                gs.k update6 = (gs.k) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                return gs.k.a(update6, new gs.i(paymentId), null, 0, false, 30);
            case 8:
                gs.k update7 = (gs.k) obj2;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                return gs.k.a(update7, new gs.h(paymentId), null, 0, false, 30);
            case 9:
                List transactionsData = (List) obj2;
                Intrinsics.checkNotNullParameter(transactionsData, "transactionsData");
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.c cVar = rd0.c.INFO;
                List list = transactionsData;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                Iterator it9 = list.iterator();
                while (it9.hasNext()) {
                    arrayList.add(((c02.j) it9.next()).f20114a);
                }
                rd0.d.b(cVar, "APM-BLIK", "Blik Confirmation Screen: tx: " + arrayList, null, null, 16);
                if (paymentId != null) {
                    Iterator it10 = list.iterator();
                    while (true) {
                        if (it10.hasNext()) {
                            Object next2 = it10.next();
                            if (Intrinsics.f(((c02.j) next2).f20114a, paymentId)) {
                                obj4 = next2;
                            }
                        }
                    }
                    jVar = (c02.j) obj4;
                    if (jVar == null) {
                        throw InvalidPendingTransactionState.f61671a;
                    }
                } else {
                    jVar = (c02.j) d0.d0(transactionsData);
                    if (jVar == null) {
                        throw InvalidPendingTransactionState.f61671a;
                    }
                }
                return jVar;
            case 10:
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("DELETE FROM payments_social_reactions WHERE id = ?");
                try {
                    if (paymentId == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, paymentId);
                    }
                    sQLiteStatementPrepare.step();
                    sQLiteStatementPrepare.close();
                    return null;
                } catch (Throwable th10) {
                    sQLiteStatementPrepare.close();
                    throw th10;
                }
            case 11:
                AsftTravellerDetailsScreenContract$DomainState$TravellerDetails getStateWithUpdatedAdditionalTraveller = (AsftTravellerDetailsScreenContract$DomainState$TravellerDetails) obj2;
                Intrinsics.checkNotNullParameter(getStateWithUpdatedAdditionalTraveller, "$this$getStateWithUpdatedAdditionalTraveller");
                return AsftTravellerDetailsScreenContract$DomainState$TravellerDetails.a(getStateWithUpdatedAdditionalTraveller, paymentId, null, 2);
            case 12:
                AsftTravellerDetailsScreenContract$DomainState$TravellerDetails getStateWithUpdatedAdditionalTraveller2 = (AsftTravellerDetailsScreenContract$DomainState$TravellerDetails) obj2;
                Intrinsics.checkNotNullParameter(getStateWithUpdatedAdditionalTraveller2, "$this$getStateWithUpdatedAdditionalTraveller");
                return AsftTravellerDetailsScreenContract$DomainState$TravellerDetails.a(getStateWithUpdatedAdditionalTraveller2, null, paymentId, 1);
            case 13:
                gyi.a update8 = (gyi.a) obj2;
                Intrinsics.checkNotNullParameter(update8, "$this$update");
                return gyi.a.a(update8, null, null, this.f145722b, null, null, null, 59);
            case 14:
                gzg.n update9 = (gzg.n) obj2;
                Intrinsics.checkNotNullParameter(update9, "$this$update");
                return gzg.n.a(update9, vyg.c.valueOf(paymentId), null, null, null, false, null, null, null, 8189);
            case 15:
                gzg.n update10 = (gzg.n) obj2;
                Intrinsics.checkNotNullParameter(update10, "$this$update");
                return gzg.n.a(update10, null, null, null, null, false, null, null, vyg.a.valueOf(paymentId), 6143);
            case 16:
                List pendingTransactions = (List) obj2;
                Intrinsics.checkNotNullParameter(pendingTransactions, "pendingTransactions");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj5 : pendingTransactions) {
                    ThreeDSTransaction threeDSTransaction = (ThreeDSTransaction) obj5;
                    if (paymentId == null || Intrinsics.f(threeDSTransaction.f60534a, paymentId)) {
                        arrayList2.add(obj5);
                    }
                }
                return arrayList2.isEmpty() ? new h61.a(null, pendingTransactions.size() > 1) : new h61.a((ThreeDSTransaction) d0.b0(arrayList2), pendingTransactions.size() > 1);
            case 17:
                h96.a aVar2 = (h96.a) obj2;
                String companyName = aVar2.f150176b;
                DepositAmount depositAmount = aVar2.f150177c;
                Intrinsics.checkNotNullParameter(companyName, "companyName");
                Intrinsics.checkNotNullParameter(depositAmount, "depositAmount");
                return new h96.a(depositAmount, paymentId, companyName);
            case 18:
                ea1.b.a("Payment " + ((y) obj2).f133223a + " for order " + paymentId + " completed", fa1.k.INFO);
                return Unit.f186387a;
            case 19:
                y paymentAuthorization = (y) obj2;
                Intrinsics.checkNotNullParameter(paymentAuthorization, "paymentAuthorization");
                if (!u.f.contains(paymentAuthorization.f133224b)) {
                    return paymentAuthorization;
                }
                Intrinsics.checkNotNullParameter(paymentId, "paymentId");
                throw new PaymentAuthorizationInProgressException(j6.a.q("Authorization is in progress for payment: ", paymentId));
            case 20:
                TradingAccount it11 = (TradingAccount) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                if (Intrinsics.f(it11.getF105262a().toString(), paymentId) && com.revolut.shared.feature.wealth.models.trading_accounts.d.i(it11)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 21:
                File file = (File) obj2;
                Intrinsics.checkNotNullParameter(file, "file");
                return new File(file, paymentId);
            case 22:
                CreditCardAutopayPayments payments = (CreditCardAutopayPayments) obj2;
                Intrinsics.checkNotNullParameter(payments, "payments");
                return u0.f(!payments.d.isEmpty() ? new CreditCardKompotFeatureConfig.AutoPaySettings.AutoPaySettingsDestination(paymentId) : new CreditCardSetupAutoPayDestination(paymentId));
            case 23:
                hee.j update11 = (hee.j) obj2;
                Intrinsics.checkNotNullParameter(update11, "$this$update");
                return hee.j.a(update11, null, this.f145722b, null, null, false, false, 61);
            case 24:
                hhd.h update12 = (hhd.h) obj2;
                Intrinsics.checkNotNullParameter(update12, "$this$update");
                return hhd.h.a(update12, null, this.f145722b, null, null, null, 29);
            case 25:
                hhd.h update13 = (hhd.h) obj2;
                Intrinsics.checkNotNullParameter(update13, "$this$update");
                if (paymentId == null) {
                    paymentId = "";
                }
                return hhd.h.a(update13, null, null, null, null, paymentId, 15);
            case 26:
                hhj.c updateState = (hhj.c) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                String searchQuery = kotlin.text.d0.F0(paymentId).toString();
                updateState.getClass();
                Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
                return new hhj.c(searchQuery);
            case 27:
                RowDelegate.Model it12 = (RowDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                Clause clause = it12.f53230c;
                Intrinsics.i(clause, "null cannot be cast to non-null type com.revolut.core.ui_kit.models.TextClause");
                return Boolean.valueOf(!(a0.H(((TextClause) clause).f57936a, paymentId, true) || a0.H(it12.f53228a, paymentId, true)));
            case 28:
                RowDelegate.Model it13 = (RowDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                Clause clause2 = it13.f53230c;
                Intrinsics.i(clause2, "null cannot be cast to non-null type com.revolut.core.ui_kit.models.TextClause");
                int iT = kotlin.text.d0.T(((TextClause) clause2).f57936a, paymentId, 0, true, 2);
                Integer numValueOf = iT >= 0 ? Integer.valueOf(iT) : null;
                return Integer.valueOf(numValueOf != null ? numValueOf.intValue() : Integer.MAX_VALUE);
            default:
                ho2.e update14 = (ho2.e) obj2;
                Intrinsics.checkNotNullParameter(update14, "$this$update");
                return ho2.e.a(update14, null, null, paymentId, 3);
        }
    }

    public /* synthetic */ a(String str, int i) {
        this.f145721a = i;
        this.f145722b = str;
    }
}
