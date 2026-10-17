package z55;

import a9g.r1;
import a9g.x1;
import ahe.z0;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import com.revolut.feature.defi.asset_details.api.model.DefiCurrency;
import com.revolut.feature.defi.trade.impl.ui.trade.DefiTradeScreen;
import com.revolut.feature.retail.crypto.advanced_charts.impl.ui.currencies_selector.CryptoCurrenciesSelectorScreen;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jmrtd.PassportService;
import org.jmrtd.cbeff.ISO781611;
import z66.t;
import zhm.f0;
import zhm.q0;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class w implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f319516a;

    public /* synthetic */ w(int i) {
        this.f319516a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteStatement sQLiteStatementPrepare;
        String text;
        String str;
        String str2 = null;
        switch (this.f319516a) {
            case 0:
                LoanDetails it8 = (LoanDetails) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.valueOf(it8.f70144a.getO() == b95.a.REFINANCING_LOAN);
            case 1:
                q35.z it9 = (q35.z) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                int size = it9.d.size();
                Intrinsics.checkNotNullParameter(it9, "<this>");
                return new p(size, it9.f241847b == q35.y.InProgress);
            case 2:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 3:
                k3l.j it10 = (k3l.j) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return Boolean.valueOf(Intrinsics.f(it10.a().getF104385a(), "tap_and_pay_negative_balance_warning"));
            case 4:
                DefiTradeScreen.a aVar = DefiTradeScreen.Companion;
                Intrinsics.checkNotNullParameter((List) obj2, "it");
                return Unit.f186387a;
            case 5:
                RowDelegate.Model model = (RowDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(model, "model");
                Object obj3 = model.u;
                if (obj3 instanceof DefiCurrency) {
                    return (DefiCurrency) obj3;
                }
                return null;
            case 6:
                z66.b update = (z66.b) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return z66.b.a(update, null, null, null, null, null, false, null, f0.f322471a, ISO781611.SMT_TAG);
            case 7:
                z66.b update2 = (z66.b) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return z66.b.a(update2, null, null, null, null, null, false, "", null, 159);
            case 8:
                z66.b update3 = (z66.b) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return z66.b.a(update3, null, null, null, null, null, true, null, null, PassportService.DEFAULT_MAX_BLOCKSIZE);
            case 9:
                t.a aVar2 = z66.t.Companion;
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                ArrayList arrayListA = z66.t.a(10);
                yp0.b.k(arrayListA, 0, 0, 0, 0, 31);
                return arrayListA;
            case 10:
                f5j.a beneficiary = (f5j.a) obj2;
                Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
                return new xv9.b(beneficiary);
            case 11:
                Function0 getDefaultLoadingItems2 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems2, "getDefaultLoadingItems");
                return new z6k.h((List) getDefaultLoadingItems2.invoke(), z6k.e.f319788a);
            case 12:
                Data it11 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                List list = (List) it11.getContent();
                return list == null ? f0.f322471a : list;
            case 13:
                List it12 = (List) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return zhm.d0.V0(it12, 4);
            case 14:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                fel.c cVar = (fel.c) pair.f186385a;
                zhm.q qVarK1 = zhm.d0.k1((List) pair.f186386b);
                int iB = q0.b(zhm.w.t(qVarK1, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                Iterator it13 = qVarK1.iterator();
                while (true) {
                    kotlin.jvm.internal.d dVar = (kotlin.jvm.internal.d) it13;
                    if (!((Iterator) dVar.f186416c).hasNext()) {
                        return fel.c.a(cVar, zhm.d0.P0(cVar.f134653b, new z0(linkedHashMap, 11)));
                    }
                    IndexedValue indexedValue = (IndexedValue) dVar.next();
                    linkedHashMap.put((String) indexedValue.f186392b, Integer.valueOf(indexedValue.f186391a));
                }
                break;
            case 15:
                LoanDetails loanDetails = (LoanDetails) obj2;
                Intrinsics.checkNotNullParameter(loanDetails, "loanDetails");
                return Boolean.valueOf(loanDetails.f70144a.o == b95.a.MORTGAGE_LOAN);
            case 16:
                RowDelegate.Model it14 = (RowDelegate.Model) obj2;
                KProperty[] kPropertyArr = CryptoCurrenciesSelectorScreen.T;
                Intrinsics.checkNotNullParameter(it14, "it");
                Object obj4 = it14.u;
                if (obj4 instanceof xi0.b) {
                    return (xi0.b) obj4;
                }
                return null;
            case 17:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return iii.c.c(5);
            case 18:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 19:
                try {
                    ((SQLiteConnection) obj2).prepare("DELETE FROM hotels_booking_details").step();
                    return null;
                } finally {
                }
            case 20:
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM hotels_campaign");
                try {
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "image");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "startDate");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "endDate");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "discount");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "rank");
                    ArrayList arrayList = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? str2 : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                        String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? str2 : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                        String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? str2 : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                        String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? str2 : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                        String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? str2 : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                        if (sQLiteStatementPrepare.isNull(columnIndexOrThrow6)) {
                            text = str2;
                            str = text;
                        } else {
                            text = sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                            str = str2;
                        }
                        arrayList.add(new a9g.o(text2, (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7), text3, text4, text5, text6, text));
                        str2 = str;
                        break;
                    }
                    return arrayList;
                } finally {
                }
            case 21:
                try {
                    ((SQLiteConnection) obj2).prepare("DELETE FROM hotels_campaign").step();
                    return null;
                } finally {
                }
            case 22:
                try {
                    ((SQLiteConnection) obj2).prepare("DELETE FROM hotels_dropoff").step();
                    return null;
                } finally {
                }
            case 23:
                try {
                    ((SQLiteConnection) obj2).prepare("DELETE FROM hotels_inventory_provider").step();
                    return null;
                } finally {
                }
            case 24:
                try {
                    ((SQLiteConnection) obj2).prepare("DELETE FROM hotels_location WHERE isPopular = 1").step();
                    return null;
                } finally {
                }
            case 25:
                try {
                    ((SQLiteConnection) obj2).prepare("DELETE FROM hotels_promotions").step();
                    return null;
                } finally {
                }
            case 26:
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM hotels_property_type_category");
                try {
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
                    int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "description");
                    int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "image");
                    int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "displayOrderRank");
                    ArrayList arrayList2 = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        arrayList2.add(new r1(sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8), sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9), sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10), sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow12)));
                        break;
                    }
                    return arrayList2;
                } finally {
                }
            case 27:
                try {
                    ((SQLiteConnection) obj2).prepare("DELETE FROM hotels_property_type_category").step();
                    return null;
                } finally {
                }
            case 28:
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM hotels_recent_smart_searches ORDER BY searchTimestamp DESC");
                try {
                    int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "prompt");
                    int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "searchTimestamp");
                    ArrayList arrayList3 = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        arrayList3.add(new x1(sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13), sQLiteStatementPrepare.getLong(columnIndexOrThrow14)));
                        break;
                    }
                    return arrayList3;
                } finally {
                }
            default:
                try {
                    ((SQLiteConnection) obj2).prepare("\n        DELETE FROM hotels_recent_smart_searches\n        WHERE prompt NOT IN (\n            SELECT prompt FROM hotels_recent_smart_searches\n            ORDER BY searchTimestamp DESC\n            LIMIT 3\n        )\n        ").step();
                    return null;
                } finally {
                }
        }
    }
}
