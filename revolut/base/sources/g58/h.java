package g58;

import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.widgets.TileGridWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.home_feed.api.R$string;
import com.revolut.feature.revolutpay.shared.ui.add_payment_method.AddPaymentMethodScreen;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import hi9.o;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.lds.LDSFile;
import zhm.a1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f140693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f140694b;

    public /* synthetic */ h(String str, int i) {
        this.f140693a = i;
        this.f140694b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteStatement sQLiteStatementPrepare;
        int i = this.f140693a;
        String email = this.f140694b;
        switch (i) {
            case 0:
                b updateState = (b) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                d58.f invitation = updateState.f140686a;
                Intrinsics.checkNotNullParameter(invitation, "invitation");
                return new b(invitation, email);
            case 1:
                g6a.f update = (g6a.f) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return g6a.f.a(update, null, this.f140694b, null, false, null, false, 61);
            case 2:
                g8c.e update2 = (g8c.e) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                update2.getClass();
                Intrinsics.checkNotNullParameter(email, "email");
                return new g8c.e(email);
            case 3:
                List items = (List) obj2;
                Intrinsics.checkNotNullParameter(items, "items");
                return TileGridWidgetDelegate.Model.Companion.b(TileGridWidgetDelegate.Model.INSTANCE, email, new TextLocalisedClause(R$string.home_feed_widget_title_top_offers, null, null, 14), items, 24);
            case 4:
                gca.f update3 = (gca.f) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return gca.f.a(update3, null, null, email, 95);
            case 5:
                InputTextDelegate.TextData it8 = (InputTextDelegate.TextData) obj2;
                AddPaymentMethodScreen.a aVar = AddPaymentMethodScreen.Companion;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.valueOf(Intrinsics.f(it8.f52597a, email));
            case 6:
                gdc.k update4 = (gdc.k) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return gdc.k.a(update4, null, null, null, null, this.f140694b, false, LDSFile.EF_DG15_TAG);
            case 7:
                gdc.k update5 = (gdc.k) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return gdc.k.a(update5, null, null, this.f140694b, null, null, false, 123);
            case 8:
                gdc.k update6 = (gdc.k) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                return gdc.k.a(update6, this.f140694b, null, null, null, null, false, 62);
            case 9:
                gdc.k update7 = (gdc.k) obj2;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                return gdc.k.a(update7, null, this.f140694b, null, null, null, false, ISO781611.SMT_TAG);
            case 10:
                xi0.b baseCurrency = (xi0.b) obj2;
                Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
                return Boolean.valueOf(Intrinsics.f(baseCurrency.f306286a, email));
            case 11:
                od0.i accountOptional = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(accountOptional, "accountOptional");
                TradingAccount tradingAccount = (TradingAccount) accountOptional.g();
                if (tradingAccount != null && !com.revolut.shared.feature.wealth.models.trading_accounts.d.e(tradingAccount)) {
                    throw new IllegalStateException(a10.b.s("Trading account with portfolio id ", email, " is not onboarded"));
                }
                TradingAccount.TaxAdvantage taxAdvantage = tradingAccount instanceof TradingAccount.TaxAdvantage ? (TradingAccount.TaxAdvantage) tradingAccount : null;
                if (taxAdvantage != null) {
                    return taxAdvantage;
                }
                throw new IllegalStateException(a10.b.s("Trading account with portfolio id ", email, " is not TaxAdvantage type"));
            case 12:
                gi1.k update8 = (gi1.k) obj2;
                Intrinsics.checkNotNullParameter(update8, "$this$update");
                return gi1.k.a(update8, sh1.h.a(update8.f144028a, null, null, null, new sh1.g(email, null, 6), null, null, null, null, null, null, null, null, 8175), null, null, null, false, null, null, null, null, null, null, 65534);
            case 13:
                gi1.k update9 = (gi1.k) obj2;
                Intrinsics.checkNotNullParameter(update9, "$this$update");
                return gi1.k.a(update9, sh1.h.a(update9.f144028a, null, null, null, null, null, new sh1.g(email, null, 6), null, null, null, null, null, null, 8127), null, null, null, false, null, null, null, null, null, null, 65534);
            case 14:
                gi1.k update10 = (gi1.k) obj2;
                Intrinsics.checkNotNullParameter(update10, "$this$update");
                return gi1.k.a(update10, sh1.h.a(update10.f144028a, null, null, null, null, null, null, null, null, new sh1.g(email, null, 6), null, null, null, 7679), null, null, null, false, null, null, null, null, null, null, 65534);
            case 15:
                gi1.k update11 = (gi1.k) obj2;
                Intrinsics.checkNotNullParameter(update11, "$this$update");
                return gi1.k.a(update11, sh1.h.a(update11.f144028a, null, new sh1.g(email, null, 6), null, null, null, null, null, null, null, null, null, null, 8187), null, null, null, false, null, null, null, null, null, null, 65534);
            case 16:
                gi1.k update12 = (gi1.k) obj2;
                Intrinsics.checkNotNullParameter(update12, "$this$update");
                return gi1.k.a(update12, sh1.h.a(update12.f144028a, new sh1.g(email, null, 6), null, null, null, null, null, null, null, null, null, null, null, 8189), null, null, null, false, null, null, null, null, null, null, 65534);
            case 17:
                gi1.k update13 = (gi1.k) obj2;
                Intrinsics.checkNotNullParameter(update13, "$this$update");
                return gi1.k.a(update13, sh1.h.a(update13.f144028a, null, null, null, null, null, null, null, null, null, null, new sh1.g(email, null, 6), null, 6143), null, null, null, false, null, null, null, null, null, null, 65534);
            case 18:
                gi1.k update14 = (gi1.k) obj2;
                Intrinsics.checkNotNullParameter(update14, "$this$update");
                return gi1.k.a(update14, sh1.h.a(update14.f144028a, null, null, null, null, null, null, null, null, null, new sh1.g(email, null, 6), null, null, 7167), null, null, null, false, null, null, null, null, null, null, 65534);
            case 19:
                gi1.k update15 = (gi1.k) obj2;
                Intrinsics.checkNotNullParameter(update15, "$this$update");
                return gi1.k.a(update15, sh1.h.a(update15.f144028a, null, null, new sh1.g(email, null, 6), null, null, null, null, null, null, null, null, null, 8183), null, null, null, false, null, null, null, null, null, null, 65534);
            case 20:
                gi1.k update16 = (gi1.k) obj2;
                Intrinsics.checkNotNullParameter(update16, "$this$update");
                return gi1.k.a(update16, sh1.h.a(update16.f144028a, null, null, null, null, null, null, new sh1.g(email, null, 6), null, null, null, null, null, 8063), null, null, null, false, null, null, null, null, null, null, 65534);
            case 21:
                gi1.k update17 = (gi1.k) obj2;
                Intrinsics.checkNotNullParameter(update17, "$this$update");
                return gi1.k.a(update17, sh1.h.a(update17.f144028a, null, null, null, null, null, null, null, new sh1.g(email, null, 6), null, null, null, null, 7935), null, null, null, false, null, null, null, null, null, null, 65534);
            case 22:
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM repayment_parts WHERE repayment_parts.transactionId = ?");
                try {
                    if (email == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, email);
                    }
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "transactionId");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "planId");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "instalmentIndex");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "amount");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fee");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "lateInterest");
                    ArrayList arrayList = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        arrayList.add(new o((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3), sQLiteStatementPrepare.getLong(columnIndexOrThrow4), sQLiteStatementPrepare.getLong(columnIndexOrThrow5), sQLiteStatementPrepare.getLong(columnIndexOrThrow6), sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2)));
                        break;
                    }
                    sQLiteStatementPrepare.close();
                    return arrayList;
                } finally {
                    sQLiteStatementPrepare.close();
                }
            case 23:
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("UPDATE plan_preferences SET seenRescheduleVersion=(SELECT rescheduleCount FROM plans WHERE id = ?) WHERE planId = ?");
                try {
                    if (email == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, email);
                    }
                    if (email == null) {
                        sQLiteStatementPrepare.bindNull(2);
                    } else {
                        sQLiteStatementPrepare.bindText(2, email);
                    }
                    sQLiteStatementPrepare.step();
                    sQLiteStatementPrepare.close();
                    return null;
                } finally {
                }
            case 24:
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM plan_details WHERE plan_details.id = ? LIMIT 1");
                try {
                    if (email == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, email);
                    }
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "cancellable");
                    ArrayList arrayList2 = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        arrayList2.add(new hi9.b(sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7), ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8)) != 0));
                        break;
                    }
                    sQLiteStatementPrepare.close();
                    return arrayList2;
                } finally {
                }
            case 25:
                gk7.f updateState2 = (gk7.f) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                return gk7.f.a(updateState2, null, null, this.f140694b, null, 11);
            case 26:
                gll.d updateState3 = (gll.d) obj2;
                Intrinsics.checkNotNullParameter(updateState3, "$this$updateState");
                updateState3.getClass();
                return new gll.d(email);
            case 27:
                gmj.e update18 = (gmj.e) obj2;
                Intrinsics.checkNotNullParameter(update18, "$this$update");
                update18.getClass();
                return new gmj.e(email);
            case 28:
                god.a update19 = (god.a) obj2;
                Intrinsics.checkNotNullParameter(update19, "$this$update");
                Set set = update19.f145132b;
                return god.a.a(update19, null, set.contains(email) ? a1.j(set, email) : a1.m(set, email), null, null, 13);
            default:
                god.a update20 = (god.a) obj2;
                Intrinsics.checkNotNullParameter(update20, "$this$update");
                return god.a.a(update20, null, null, this.f140694b, null, 11);
        }
    }
}
