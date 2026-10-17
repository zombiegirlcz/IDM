package mll;

import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.revolut.data.model.Data;
import com.revolut.feature.acquiring.card_reader.order.api.model.VatSelection;
import com.revolut.feature.address.common.impl.error.InvalidPostCodeError;
import com.revolut.feature.credit.card.models.CreditCard;
import com.revolut.feature.terms.api.model.Terms;
import com.revolut.feature.travel.hotels.api.navigation.TravelHotelsFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.sso.impl.ui.combined_authentication.flow.CombinedAuthenticationFlowContract$State;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import o45.b2;
import o45.c2;
import o45.d2;
import o45.e2;
import o45.x1;
import o45.y1;
import zhm.a1;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f207062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f207063b;

    public /* synthetic */ h(String str, int i) {
        this.f207062a = i;
        this.f207063b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        int i;
        int i2;
        String text;
        int i3;
        String text2;
        int i5;
        int i6;
        b2 b2Var;
        int i21 = this.f207062a;
        String text3 = null;
        String text4 = null;
        e2 e2Var = null;
        text3 = null;
        String postalCode = this.f207063b;
        switch (i21) {
            case 0:
                CombinedAuthenticationFlowContract$State update = (CombinedAuthenticationFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return CombinedAuthenticationFlowContract$State.a(update, this.f207063b, null, null, null, 14);
            case 1:
                lk0.e previousPage = (lk0.e) obj2;
                Intrinsics.checkNotNullParameter(previousPage, "previousPage");
                boolean zIsEmpty = previousPage.f196171a.isEmpty();
                List list = previousPage.f196171a;
                boolean z = list.size() < 100;
                if (previousPage.e != null || zIsEmpty || z) {
                    return null;
                }
                return new mm1.d(list.size() + ((mm1.d) previousPage.f196172b).f207127a, postalCode);
            case 2:
                mth.i update2 = (mth.i) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                wi0.b.Companion.getClass();
                return mth.i.a(update2, wi0.a.a(postalCode), null, null, 6);
            case 3:
                bti.b airportList = (bti.b) obj2;
                Intrinsics.checkNotNullParameter(airportList, "airportList");
                Iterator it8 = airportList.f18585a.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (Intrinsics.f(((bti.a) next).f18583c, postalCode)) {
                        }
                    } else {
                        next = null;
                    }
                }
                bti.a aVar = (bti.a) next;
                if (aVar == null) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "AsftAirportsInteractorImpl", j6.a.q("Unable to find airport with iata code ", postalCode), null, h0Var);
                }
                return aVar;
            case 4:
                mv2.c update3 = (mv2.c) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return mv2.c.a(update3, postalCode, null, 2);
            case 5:
                mv7.e update4 = (mv7.e) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                Set set = update4.f209159b;
                return mv7.e.a(update4, null, set.contains(postalCode) ? a1.j(set, postalCode) : a1.m(set, postalCode), 1);
            case 6:
                List breeds = (List) obj2;
                Intrinsics.checkNotNullParameter(breeds, "breeds");
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : breeds) {
                    if (kotlin.text.d0.J(((zw7.e) obj3).f325774b, postalCode, true)) {
                        arrayList.add(obj3);
                    }
                }
                return arrayList;
            case 7:
                Data data = (Data) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                return (!data.getLoading() && data.getContent() == null && data.getError() == null) ? new Data(null, new IllegalStateException(p.a.p("limit ", postalCode, " has not found")), false, 5, null) : data;
            case 8:
                return n09.l.a((n09.l) obj2, null, false, this.f207063b, false, 11);
            case 9:
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("DELETE FROM trade_rev_points_accounts WHERE product = ?");
                try {
                    if (postalCode == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, postalCode);
                    }
                    sQLiteStatementPrepare.step();
                    sQLiteStatementPrepare.close();
                    return null;
                } finally {
                    sQLiteStatementPrepare.close();
                }
            case 10:
                SQLiteStatement sQLiteStatementPrepare2 = ((SQLiteConnection) obj2).prepare("DELETE FROM trade_rev_points_agents WHERE product = ?");
                try {
                    if (postalCode == null) {
                        sQLiteStatementPrepare2.bindNull(1);
                    } else {
                        sQLiteStatementPrepare2.bindText(1, postalCode);
                    }
                    sQLiteStatementPrepare2.step();
                    sQLiteStatementPrepare2.close();
                    return null;
                } finally {
                    sQLiteStatementPrepare2.close();
                }
            case 11:
                SQLiteStatement sQLiteStatementPrepare3 = ((SQLiteConnection) obj2).prepare("SELECT * FROM loan_preferences WHERE loanId = ?");
                try {
                    if (postalCode == null) {
                        sQLiteStatementPrepare3.bindNull(1);
                    } else {
                        sQLiteStatementPrepare3.bindText(1, postalCode);
                    }
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "loanId");
                    x1 x1Var = sQLiteStatementPrepare3.step() ? new x1(sQLiteStatementPrepare3.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare3.getText(columnIndexOrThrow), ((int) sQLiteStatementPrepare3.getLong(SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "isHidden"))) != 0) : null;
                    sQLiteStatementPrepare3.close();
                    return x1Var;
                } finally {
                    sQLiteStatementPrepare3.close();
                }
            case 12:
                SQLiteStatement sQLiteStatementPrepare4 = ((SQLiteConnection) obj2).prepare("SELECT * FROM loan_refinanced_credits_v2 WHERE loanId = ?");
                try {
                    if (postalCode == null) {
                        sQLiteStatementPrepare4.bindNull(1);
                    } else {
                        sQLiteStatementPrepare4.bindText(1, postalCode);
                    }
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare4, "refinancingIdentifier");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare4, "refinancingState");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare4, "loanId");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare4, "id");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare4, "mode");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare4, "amount");
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare4, "currency");
                    int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare4, "type");
                    int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare4, "state");
                    int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare4, "receiptAvailable");
                    int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare4, "bankName");
                    int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare4, "fallbackDateTime");
                    int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare4, "fallbackTransactionId");
                    ArrayList arrayList2 = new ArrayList();
                    while (sQLiteStatementPrepare4.step()) {
                        int i22 = columnIndexOrThrow13;
                        arrayList2.add(new y1(sQLiteStatementPrepare4.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare4.getText(columnIndexOrThrow2), sQLiteStatementPrepare4.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare4.getText(columnIndexOrThrow3), sQLiteStatementPrepare4.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare4.getText(columnIndexOrThrow4), sQLiteStatementPrepare4.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare4.getText(columnIndexOrThrow5), sQLiteStatementPrepare4.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare4.getText(columnIndexOrThrow6), sQLiteStatementPrepare4.getLong(columnIndexOrThrow7), sQLiteStatementPrepare4.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare4.getText(columnIndexOrThrow8), sQLiteStatementPrepare4.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare4.getText(columnIndexOrThrow9), sQLiteStatementPrepare4.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare4.getText(columnIndexOrThrow10), ((int) sQLiteStatementPrepare4.getLong(columnIndexOrThrow11)) != 0, sQLiteStatementPrepare4.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare4.getText(columnIndexOrThrow12), sQLiteStatementPrepare4.isNull(i22) ? null : sQLiteStatementPrepare4.getText(i22), sQLiteStatementPrepare4.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare4.getText(columnIndexOrThrow14)));
                        columnIndexOrThrow13 = i22;
                        break;
                    }
                    sQLiteStatementPrepare4.close();
                    return arrayList2;
                } finally {
                    sQLiteStatementPrepare4.close();
                }
            case 13:
                SQLiteStatement sQLiteStatementPrepare5 = ((SQLiteConnection) obj2).prepare("SELECT * FROM loan_repayments WHERE loanId = ? ORDER BY datetime(repaymentDateTime) DESC");
                try {
                    if (postalCode == null) {
                        sQLiteStatementPrepare5.bindNull(1);
                    } else {
                        sQLiteStatementPrepare5.bindText(1, postalCode);
                    }
                    int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare5, "loanId");
                    int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare5, "id");
                    int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare5, "transactionId");
                    int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare5, "repaymentDateTime");
                    int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare5, "currency");
                    int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare5, "amount");
                    int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare5, "type");
                    int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare5, "clientId");
                    int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare5, "firstName");
                    int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare5, "lastName");
                    int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare5, "principal");
                    int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare5, "accruedInterest");
                    int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare5, "lateRepaymentInterest");
                    int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare5, "transferType");
                    int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare5, "accountDetails");
                    int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare5, "insuranceType");
                    ArrayList arrayList3 = new ArrayList();
                    while (sQLiteStatementPrepare5.step()) {
                        String text5 = sQLiteStatementPrepare5.isNull(columnIndexOrThrow15) ? null : sQLiteStatementPrepare5.getText(columnIndexOrThrow15);
                        String text6 = sQLiteStatementPrepare5.isNull(columnIndexOrThrow16) ? null : sQLiteStatementPrepare5.getText(columnIndexOrThrow16);
                        String text7 = sQLiteStatementPrepare5.isNull(columnIndexOrThrow17) ? null : sQLiteStatementPrepare5.getText(columnIndexOrThrow17);
                        String text8 = sQLiteStatementPrepare5.isNull(columnIndexOrThrow18) ? null : sQLiteStatementPrepare5.getText(columnIndexOrThrow18);
                        String text9 = sQLiteStatementPrepare5.isNull(columnIndexOrThrow19) ? null : sQLiteStatementPrepare5.getText(columnIndexOrThrow19);
                        long j2 = sQLiteStatementPrepare5.getLong(columnIndexOrThrow20);
                        String text10 = sQLiteStatementPrepare5.isNull(columnIndexOrThrow21) ? null : sQLiteStatementPrepare5.getText(columnIndexOrThrow21);
                        String text11 = sQLiteStatementPrepare5.isNull(columnIndexOrThrow22) ? null : sQLiteStatementPrepare5.getText(columnIndexOrThrow22);
                        String text12 = sQLiteStatementPrepare5.isNull(columnIndexOrThrow23) ? null : sQLiteStatementPrepare5.getText(columnIndexOrThrow23);
                        String text13 = sQLiteStatementPrepare5.isNull(columnIndexOrThrow24) ? null : sQLiteStatementPrepare5.getText(columnIndexOrThrow24);
                        Long lValueOf = sQLiteStatementPrepare5.isNull(columnIndexOrThrow25) ? null : Long.valueOf(sQLiteStatementPrepare5.getLong(columnIndexOrThrow25));
                        Long lValueOf2 = sQLiteStatementPrepare5.isNull(columnIndexOrThrow26) ? null : Long.valueOf(sQLiteStatementPrepare5.getLong(columnIndexOrThrow26));
                        Long lValueOf3 = sQLiteStatementPrepare5.isNull(columnIndexOrThrow27) ? null : Long.valueOf(sQLiteStatementPrepare5.getLong(columnIndexOrThrow27));
                        if (sQLiteStatementPrepare5.isNull(columnIndexOrThrow28)) {
                            int i32 = columnIndexOrThrow15;
                            i = columnIndexOrThrow29;
                            i2 = i32;
                            text = null;
                        } else {
                            int i33 = columnIndexOrThrow15;
                            i = columnIndexOrThrow29;
                            i2 = i33;
                            text = sQLiteStatementPrepare5.getText(columnIndexOrThrow28);
                        }
                        if (sQLiteStatementPrepare5.isNull(i)) {
                            i3 = i;
                            text2 = null;
                        } else {
                            i3 = i;
                            text2 = sQLiteStatementPrepare5.getText(i);
                        }
                        if (text2 != null) {
                            i5 = columnIndexOrThrow20;
                            Json jsonA = h55.b.a();
                            jsonA.getClass();
                            i6 = columnIndexOrThrow19;
                            b2Var = (b2) jsonA.b(nlm.a.c(b2.Companion.serializer()), text2);
                        } else {
                            i5 = columnIndexOrThrow20;
                            i6 = columnIndexOrThrow19;
                            b2Var = null;
                        }
                        int i43 = columnIndexOrThrow30;
                        arrayList3.add(new c2(text5, text6, text7, text8, text9, j2, text10, text11, text12, text13, lValueOf, lValueOf2, lValueOf3, text, b2Var, sQLiteStatementPrepare5.isNull(i43) ? null : sQLiteStatementPrepare5.getText(i43)));
                        columnIndexOrThrow30 = i43;
                        columnIndexOrThrow20 = i5;
                        columnIndexOrThrow19 = i6;
                        columnIndexOrThrow15 = i2;
                        columnIndexOrThrow29 = i3;
                        break;
                    }
                    sQLiteStatementPrepare5.close();
                    return arrayList3;
                } finally {
                    sQLiteStatementPrepare5.close();
                }
            case 14:
                SQLiteStatement sQLiteStatementPrepare6 = ((SQLiteConnection) obj2).prepare("SELECT repaymentDateTime FROM loan_repayments WHERE loanId = ? ORDER BY datetime(repaymentDateTime) DESC limit 1");
                try {
                    if (postalCode == null) {
                        sQLiteStatementPrepare6.bindNull(1);
                    } else {
                        sQLiteStatementPrepare6.bindText(1, postalCode);
                    }
                    if (sQLiteStatementPrepare6.step() && !sQLiteStatementPrepare6.isNull(0)) {
                        text3 = sQLiteStatementPrepare6.getText(0);
                        break;
                    }
                    sQLiteStatementPrepare6.close();
                    return text3;
                } finally {
                    sQLiteStatementPrepare6.close();
                }
            case 15:
                SQLiteStatement sQLiteStatementPrepare7 = ((SQLiteConnection) obj2).prepare("SELECT * FROM statement_documents WHERE loanId = ? ");
                try {
                    if (postalCode == null) {
                        sQLiteStatementPrepare7.bindNull(1);
                    } else {
                        sQLiteStatementPrepare7.bindText(1, postalCode);
                    }
                    int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare7, "loanId");
                    int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare7, "statementId");
                    int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare7, "issueDate");
                    int columnIndexOrThrow34 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare7, "statementPeriodFrom");
                    int columnIndexOrThrow35 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare7, "statementPeriodTo");
                    int columnIndexOrThrow36 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare7, "type");
                    ArrayList arrayList4 = new ArrayList();
                    while (sQLiteStatementPrepare7.step()) {
                        arrayList4.add(new d2(sQLiteStatementPrepare7.isNull(columnIndexOrThrow31) ? null : sQLiteStatementPrepare7.getText(columnIndexOrThrow31), sQLiteStatementPrepare7.isNull(columnIndexOrThrow32) ? null : sQLiteStatementPrepare7.getText(columnIndexOrThrow32), sQLiteStatementPrepare7.isNull(columnIndexOrThrow33) ? null : sQLiteStatementPrepare7.getText(columnIndexOrThrow33), sQLiteStatementPrepare7.isNull(columnIndexOrThrow34) ? null : sQLiteStatementPrepare7.getText(columnIndexOrThrow34), sQLiteStatementPrepare7.isNull(columnIndexOrThrow35) ? null : sQLiteStatementPrepare7.getText(columnIndexOrThrow35), sQLiteStatementPrepare7.isNull(columnIndexOrThrow36) ? null : sQLiteStatementPrepare7.getText(columnIndexOrThrow36)));
                        break;
                    }
                    sQLiteStatementPrepare7.close();
                    return arrayList4;
                } finally {
                    sQLiteStatementPrepare7.close();
                }
            case 16:
                SQLiteStatement sQLiteStatementPrepare8 = ((SQLiteConnection) obj2).prepare("SELECT * FROM update_dates WHERE key = ?");
                try {
                    if (postalCode == null) {
                        sQLiteStatementPrepare8.bindNull(1);
                    } else {
                        sQLiteStatementPrepare8.bindText(1, postalCode);
                    }
                    int columnIndexOrThrow37 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare8, "key");
                    int columnIndexOrThrow38 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare8, "updateDate");
                    if (sQLiteStatementPrepare8.step()) {
                        if (!sQLiteStatementPrepare8.isNull(columnIndexOrThrow37)) {
                            text4 = sQLiteStatementPrepare8.getText(columnIndexOrThrow37);
                        }
                        e2Var = new e2(text4, sQLiteStatementPrepare8.getLong(columnIndexOrThrow38));
                    }
                    sQLiteStatementPrepare8.close();
                    return e2Var;
                } finally {
                }
            case 17:
                s4d.m it9 = (s4d.m) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return pyd.c.b0(it9, postalCode);
            case 18:
                List<CreditCard> it10 = (List) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                for (CreditCard creditCard : it10) {
                    if (Intrinsics.f(creditCard.f69793b, postalCode)) {
                        return creditCard;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 19:
                SQLiteStatement sQLiteStatementPrepare9 = ((SQLiteConnection) obj2).prepare("SELECT * FROM index_details where ref = ?");
                try {
                    if (postalCode == null) {
                        sQLiteStatementPrepare9.bindNull(1);
                    } else {
                        sQLiteStatementPrepare9.bindText(1, postalCode);
                    }
                    int columnIndexOrThrow39 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare9, "ref");
                    int columnIndexOrThrow40 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare9, "symbol");
                    int columnIndexOrThrow41 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare9, "baseCurrency");
                    int columnIndexOrThrow42 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare9, "shortDescription");
                    int columnIndexOrThrow43 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare9, "description");
                    n77.f fVar = sQLiteStatementPrepare9.step() ? new n77.f(sQLiteStatementPrepare9.isNull(columnIndexOrThrow39) ? null : sQLiteStatementPrepare9.getText(columnIndexOrThrow39), sQLiteStatementPrepare9.isNull(columnIndexOrThrow40) ? null : sQLiteStatementPrepare9.getText(columnIndexOrThrow40), sQLiteStatementPrepare9.isNull(columnIndexOrThrow41) ? null : sQLiteStatementPrepare9.getText(columnIndexOrThrow41), sQLiteStatementPrepare9.isNull(columnIndexOrThrow42) ? null : sQLiteStatementPrepare9.getText(columnIndexOrThrow42), sQLiteStatementPrepare9.isNull(columnIndexOrThrow43) ? null : sQLiteStatementPrepare9.getText(columnIndexOrThrow43)) : null;
                    sQLiteStatementPrepare9.close();
                    return fVar;
                } finally {
                }
            case 20:
                n87.k update5 = (n87.k) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return n87.k.a(update5, null, false, this.f207063b, null, 23);
            case 21:
                Data data2 = (Data) obj2;
                Intrinsics.checkNotNullParameter(data2, "data");
                return new Pair(postalCode, data2);
            case 22:
                nb6.d update6 = (nb6.d) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                return nb6.d.a(update6, postalCode, null, 5);
            case 23:
                od0.i optionalTerms = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(optionalTerms, "optionalTerms");
                Terms terms = (Terms) optionalTerms.g();
                return terms != null ? new Data(terms, null, false, 6, null) : new Data(null, new IllegalStateException(j6.a.q("Unable to load terms with documentId = ", postalCode)), false, 5, null);
            case 24:
                afi.a draft = (afi.a) obj2;
                Intrinsics.checkNotNullParameter(draft, "draft");
                rfm.u uVarG = efm.k.g(new FeatureCommand(new TravelHotelsFeatureConfig.Checkout(draft.f4100a, postalCode)));
                Intrinsics.checkNotNullExpressionValue(uVarG, "just(...)");
                return uVarG;
            case 25:
                nfc.e updateState = (nfc.e) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return nfc.e.a(updateState, new VatSelection.Registered(postalCode));
            case 26:
                ngg.d update7 = (ngg.d) obj2;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                return ngg.d.a(update7, postalCode, null, 5);
            case 27:
                ni1.f update8 = (ni1.f) obj2;
                Intrinsics.checkNotNullParameter(update8, "$this$update");
                Data dataO = zi0.c.O(InvalidPostCodeError.f60963a);
                update8.getClass();
                Intrinsics.checkNotNullParameter(postalCode, "postalCode");
                return new ni1.f(dataO, postalCode);
            case 28:
                ni1.f update9 = (ni1.f) obj2;
                Intrinsics.checkNotNullParameter(update9, "$this$update");
                Data data3 = new Data(null, null, true, 3, null);
                update9.getClass();
                Intrinsics.checkNotNullParameter(postalCode, "postalCode");
                return new ni1.f(data3, postalCode);
            default:
                return nig.a.a((nig.a) obj2, null, postalCode, true, 1);
        }
    }

    public /* synthetic */ h(n45.d dVar, String str) {
        this.f207062a = 13;
        this.f207063b = str;
    }
}
