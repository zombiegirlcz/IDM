package x1;

import android.content.ContentValues;
import android.database.Cursor;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.sqlite.db.SupportSQLiteDatabase;
import aw0.o9;
import com.revolut.core.error.data.model.ServerErrorException;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.data.model.Data;
import com.revolut.feature.defi.accounts.api.model.DeFiBalance;
import com.revolut.feature.defi.accounts.impl.ui.extension.DeFiAccountsExtensionState;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceStatusDetails;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.feature.shared.order_initiation.api.domain.OrderInitiationPage;
import ip0.gu;
import ip0.sy;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.joda.time.DateTime;
import prk.o;
import retrofit2.HttpException;
import x15.a0;
import x15.z;
import x18.x;
import x1g.p;
import yhm.r;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f301776a;

    public /* synthetic */ n(int i) {
        this.f301776a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws IOException {
        Data data;
        ArrayList arrayList = null;
        switch (this.f301776a) {
            case 0:
                return TextKt.Text_Z58ophY$lambda$4$lambda$3((TextLayoutResult) obj2);
            case 1:
                SupportSQLiteDatabase execFunctionInTransactionSafe = (SupportSQLiteDatabase) obj2;
                Intrinsics.checkNotNullParameter(execFunctionInTransactionSafe, "$this$execFunctionInTransactionSafe");
                Cursor cursorQuery = execFunctionInTransactionSafe.query("SELECT * from \"trading_price_alerts\"");
                try {
                    ge0.b bVarD = a.a.d(cursorQuery);
                    Cursor cursor = (Cursor) bVarD.f143205b;
                    ArrayList arrayList2 = new ArrayList(w.t(bVarD, 10));
                    while (true) {
                        if (!((cursor.isClosed() || cursor.isAfterLast() || !cursor.moveToNext()) ? false : true)) {
                            cursorQuery.close();
                            return arrayList2;
                        }
                        ContentValues contentValues = new ContentValues();
                        String[] columnNames = cursor.getColumnNames();
                        Intrinsics.checkNotNullExpressionValue(columnNames, "getColumnNames(...)");
                        for (String str : columnNames) {
                            contentValues.put(str, cursor.getString(cursor.getColumnIndex(str)));
                        }
                        arrayList2.add(contentValues);
                    }
                } catch (Throwable th10) {
                    try {
                        throw th10;
                    } catch (Throwable th11) {
                        com.bumptech.glide.d.e(cursorQuery, th10);
                        throw th11;
                    }
                }
                break;
            case 2:
                SupportSQLiteDatabase supportSQLiteDatabase = (SupportSQLiteDatabase) obj2;
                o.B(supportSQLiteDatabase, "$this$execActionInTransactionSafe", "CREATE TABLE IF NOT EXISTS `candle_sticks_copy` (\n    `symbol` TEXT NOT NULL,\n    `period` TEXT NOT NULL,\n    `open` TEXT NOT NULL,\n    `close` TEXT NOT NULL,\n    `high` TEXT NOT NULL,\n    `low` TEXT NOT NULL,\n    `volume` TEXT NOT NULL,\n    `from` INTEGER NOT NULL,\n    `to` INTEGER NOT NULL,\n    `startClose` TEXT NOT NULL,\n    `endClose` TEXT NOT NULL,\n    `baseline` TEXT,\n    PRIMARY KEY(`symbol`, `period`, `from`)\n)", "INSERT INTO candle_sticks_copy SELECT * FROM candle_sticks", "DROP TABLE candle_sticks");
                supportSQLiteDatabase.execSQL("ALTER TABLE candle_sticks_copy RENAME TO candle_sticks");
                return Unit.f186387a;
            case 3:
                DeFiAccountsExtensionState it8 = (DeFiAccountsExtensionState) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8;
            case 4:
                DeFiAccountsExtensionState it9 = (DeFiAccountsExtensionState) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return it9.d;
            case 5:
                DeFiAccountsExtensionState it10 = (DeFiAccountsExtensionState) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                Object content = it10.f71651a.getContent();
                xi0.b bVar = it10.d;
                Object content2 = it10.f71652b.getContent();
                if (content == null || bVar == null || content2 == null) {
                    return null;
                }
                return new r((e16.b) content, bVar, (List) content2);
            case 6:
                DeFiAccountsExtensionState it11 = (DeFiAccountsExtensionState) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                Object content3 = it11.f71651a.getContent();
                xi0.b bVar2 = it11.d;
                if (content3 != null && bVar2 != null) {
                    ArrayList arrayList3 = ((e16.b) content3).f121888c;
                    arrayList = new ArrayList(w.t(arrayList3, 10));
                    Iterator it12 = arrayList3.iterator();
                    while (it12.hasNext()) {
                        v1.c.A(arrayList, ((DeFiBalance) it12.next()).getCurrency(), bVar2);
                    }
                }
                return arrayList;
            case 7:
                return (e16.b) ((DeFiAccountsExtensionState) obj2).f71651a.getContent();
            case 8:
                FreelancerInvoice it13 = (FreelancerInvoice) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return it13.f73379j;
            case 9:
                OrderInitiationPage it14 = (OrderInitiationPage) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                dj0.d dVar = it14.f;
                if (dVar != null) {
                    return dVar;
                }
                dj0.d.Companion.getClass();
                return dj0.d.d;
            case 10:
                OrderInitiationPage it15 = (OrderInitiationPage) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return new DateTime(oi0.d.R(it15.f86428b));
            case 11:
                FreelancerInvoice it16 = (FreelancerInvoice) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                DateTime dateTime = it16.f;
                if (dateTime != null) {
                    return dateTime;
                }
                FreelancerInvoiceStatusDetails freelancerInvoiceStatusDetails = it16.f73385r;
                if (freelancerInvoiceStatusDetails != null) {
                    return freelancerInvoiceStatusDetails.f73412a;
                }
                return null;
            case 12:
                return Boolean.valueOf(((Integer) obj2).intValue() > 0);
            case 13:
                ArrayList arrayList4 = ((wel.e) obj2).e;
                if (arrayList4 == null || !arrayList4.isEmpty()) {
                    Iterator it17 = arrayList4.iterator();
                    while (it17.hasNext()) {
                        if (((kel.g) it17.next()) instanceof kel.n) {
                        }
                    }
                    z = false;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 14:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                List listC = u.c(new gu("global-news-header-list-id", 0, 0, 30));
                ArrayList arrayList5 = new ArrayList(4);
                for (int i = 0; i < 4; i++) {
                    arrayList5.add(new sy(a0.d.n("global-news-item-loading-", i), null, 62));
                }
                yp0.b.k(arrayList5, 0, 0, 0, 0, 31);
                return w.u(v.k(listC, arrayList5));
            case 15:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return Boolean.FALSE;
            case 16:
                x1g.i it18 = (x1g.i) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return p.a(it18);
            case 17:
                x1g.i domainState = (x1g.i) obj2;
                Intrinsics.checkNotNullParameter(domainState, "domainState");
                dj0.d dVarA = p.a(domainState);
                Data data2 = domainState.f302424l;
                try {
                    Object content4 = data2.getContent();
                    data = new Data(content4 != null ? ((PaymentMethod.Pocket) content4).i : null, data2.getError(), data2.getLoading());
                    break;
                } catch (Throwable th12) {
                    data = new Data(null, th12, data2.getLoading());
                }
                return new Pair(dVarA, data);
            case 18:
                x1g.i update = (x1g.i) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return x1g.i.a(update, null, null, null, null, false, null, new Data(null, null, false, 7, null), null, null, 28671);
            case 19:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 20:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                m70.a.c(t0.f186434a);
                return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            case 21:
                x23.j update2 = (x23.j) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return x23.j.a(update2, null, null, null, false, false, false, false, null, null, 4079);
            case 22:
                x23.j update3 = (x23.j) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return x23.j.a(update3, null, null, null, false, true, false, false, null, null, 4031);
            case 23:
                x23.j update4 = (x23.j) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return x23.j.a(update4, null, null, null, true, false, false, false, null, null, 4079);
            case 24:
                x23.j update5 = (x23.j) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return x23.j.a(update5, null, null, null, false, false, true, false, null, null, 3967);
            case 25:
                x23.j update6 = (x23.j) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                return x23.j.a(update6, null, null, null, false, false, false, false, null, null, 4031);
            case 26:
                x23.j update7 = (x23.j) obj2;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                return x23.j.a(update7, null, null, null, false, true, false, false, null, null, 4031);
            case 27:
                return x23.j.a((x23.j) obj2, null, null, null, false, false, false, false, null, null, 2047);
            case 28:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return (!((Boolean) pair.f186385a).booleanValue() || ((Boolean) pair.f186386b).booleanValue()) ? a0.f302245a : z.f302307a;
            default:
                Throwable contained = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(contained, "contained");
                if (contained instanceof ServerErrorException) {
                    return (ServerErrorException) contained;
                }
                if (contained instanceof HttpException) {
                    return com.revolut.core.error.data.model.a.a((HttpException) contained);
                }
                return null;
        }
    }

    public /* synthetic */ n(x xVar) {
        this.f301776a = 14;
    }
}
