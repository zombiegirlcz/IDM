package bek;

import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import aw0.m6;
import aw0.n6;
import bg4.j;
import bg4.v;
import bh8.g;
import bij.l;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.ProfileCardModel;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.Quote;
import com.revolut.feature.tab.accounts.api.total_wealth.TotalWealthCategoryKey;
import com.revolut.feature.trusted_merchants.api.model.TrustedMerchant;
import ip0.s7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.t0;
import od0.h;
import od0.i;
import zg3.s;
import zhm.d0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14858a;

    public /* synthetic */ a(int i) {
        this.f14858a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f14858a) {
            case 0:
                cek.b it8 = (cek.b) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return zi0.c.P(eek.a.a(it8), false, null, 3);
            case 1:
                bfh.c it9 = (bfh.c) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return it9.d;
            case 2:
                bfh.c it10 = (bfh.c) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return it10.f14983c;
            case 3:
                bg2.g it11 = (bg2.g) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return new Pair(it11.e, it11.f15055g);
            case 4:
                bg2.g it12 = (bg2.g) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return new Pair(it12.f15052a, it12.e.f163145a);
            case 5:
                ag3.a it13 = (ag3.a) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return it13.getTransactionId();
            case 6:
                j it14 = (j) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return it14.f15104a;
            case 7:
                Quote quote = (Quote) obj2;
                Intrinsics.checkNotNullParameter(quote, "quote");
                i.Companion.getClass();
                return h.a(quote);
            case 8:
                i optionalPaymentMethod = (i) obj2;
                Intrinsics.checkNotNullParameter(optionalPaymentMethod, "optionalPaymentMethod");
                PaymentMethod paymentMethod = (PaymentMethod) optionalPaymentMethod.f224257a;
                if (paymentMethod != null) {
                    PaymentMethod.Pocket pocket = (PaymentMethod.Pocket) (!(paymentMethod instanceof PaymentMethod.Pocket) ? null : paymentMethod);
                    if (pocket != null) {
                        return pocket;
                    }
                }
                throw new IllegalStateException(j6.a.q("Unable to get default pocket. Default payment method type is: ", paymentMethod != null ? paymentMethod.getClass().getName() : null).toString());
            case 9:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                int i = R$string.credit_application_payment_checkout_title;
                m70.a.c(t0.f186434a);
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, u.c(""), null, 12);
                List list = (List) getDefaultLoadingItems.invoke();
                n6.Companion.getClass();
                return new v(new aw0.e(false, null, null, m6.a(), null, null, 55), textLocalisedClause, null, list);
            case 10:
                bg9.a it15 = (bg9.a) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return (wi0.b) it15.f15139a.getContent();
            case 11:
                return s.INSTANCE.serializer();
            case 12:
                rlm.f Json = (rlm.f) obj2;
                Intrinsics.checkNotNullParameter(Json, "$this$Json");
                tlm.e eVar = Json.f255103h;
                tlm.f fVar = new tlm.f();
                fVar.b(o0.f186429a.b(zg3.b.class), new a(11));
                Unit unit = Unit.f186387a;
                tlm.d dVarA = tlm.h.a(eVar, fVar.a());
                Intrinsics.checkNotNullParameter(dVarA, "<set-?>");
                Json.f255103h = dVarA;
                return Unit.f186387a;
            case 13:
                List list2 = (List) obj2;
                Intrinsics.h(list2);
                return (n71.b) d0.d0(list2);
            case 14:
                n71.b account = (n71.b) obj2;
                Intrinsics.checkNotNullParameter(account, "account");
                String str = account.d;
                if (str == null) {
                    str = "";
                }
                String str2 = account.f212976c;
                return new bh6.e(account.f212975b, str, str2 != null ? str2 : "");
            case 15:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                aim.e eVarB = u.b();
                s7 s7Var = new s7("DISCLAIMER_LOADING_LIST_ITEM_ID", 0, 0, 0, 0, false, null, 126);
                yp0.b.l(s7Var, 0, 0, 0, 0, null, false, 63);
                eVarB.add(s7Var);
                List listK = zhm.v.k(new s7("ACCOUNT_BALANCE_LOADING_LIST_ITEM_ID", 0, 0, 0, 0, false, null, 126), new s7("SAVINGS_BALANCE_LOADING_LIST_ITEM_ID", 0, 0, 0, 0, false, null, 126));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                eVarB.addAll(listK);
                s7 s7Var2 = new s7("REPORT_AN_ISSUE_LOADING_LIST_ITEM_ID", 0, 0, 0, 0, false, null, 126);
                yp0.b.l(s7Var2, 0, 0, 0, 0, null, false, 63);
                eVarB.add(s7Var2);
                return new Pair(u.a(eVarB), g.b.f15244a);
            case 16:
                bh9.a update = (bh9.a) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return bh9.a.a(update, bh9.i.ERROR, null, null, null, 61);
            case 17:
                bh9.a update2 = (bh9.a) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return bh9.a.a(update2, bh9.i.LOADING, null, null, null, 61);
            case 18:
                return bh9.a.a((bh9.a) obj2, null, null, null, null, 55);
            case 19:
                List items = (List) obj2;
                Intrinsics.checkNotNullParameter(items, "items");
                return u.c(new ohe.b(TotalWealthCategoryKey.Linked.INSTANCE, items, (Clause) null, 12));
            case 20:
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("DELETE FROM `upcoming_events`");
                try {
                    sQLiteStatementPrepare.step();
                    return null;
                } finally {
                    sQLiteStatementPrepare.close();
                }
            case 21:
                bi2.a update3 = (bi2.a) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                Data data = Data.copy$default(update3.f15374a, null, null, true, 3, null);
                Intrinsics.checkNotNullParameter(data, "data");
                return new bi2.a(data);
            case 22:
                Function0 getDefaultLoadingItems2 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems2, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems2.invoke();
            case 23:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Boolean.FALSE;
            case 24:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return l.b();
            case 25:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return l.b();
            case 26:
                Data cardProfile = new Data(null, null, true, 3, null);
                ((bj8.b) obj2).getClass();
                Intrinsics.checkNotNullParameter(cardProfile, "cardProfile");
                return new bj8.b(cardProfile);
            case 27:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return new fpa.g(new ProfileCardModel.Loading(0), null, null, 6);
            case 28:
                rlm.f Json2 = (rlm.f) obj2;
                Lazy lazy = bj9.a.f15588a;
                Intrinsics.checkNotNullParameter(Json2, "$this$Json");
                Json2.f255101c = true;
                return Unit.f186387a;
            default:
                List it16 = (List) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                List list3 = it16;
                ArrayList arrayList = new ArrayList(w.t(list3, 10));
                Iterator it17 = list3.iterator();
                while (it17.hasNext()) {
                    arrayList.add(ajg.a.a((zig.a) it17.next()));
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : arrayList) {
                    if (obj3 instanceof TrustedMerchant.ToReview) {
                        arrayList2.add(obj3);
                    }
                }
                return arrayList2;
        }
    }

    public /* synthetic */ a(Object obj2, int i) {
        this.f14858a = i;
    }
}
