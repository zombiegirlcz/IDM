package h3d;

import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.feature_market_data.impl.R$string;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import dj0.d;
import do3.q;
import h3j.e;
import h43.n;
import ip0.on0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import od0.h;
import od0.i;
import rlm.f;
import v30.y;
import xi0.b;
import z0h.t1;
import z3d.c;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.q0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f149112a;

    public /* synthetic */ a(int i) {
        this.f149112a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteStatement sQLiteStatementPrepare;
        switch (this.f149112a) {
            case 0:
                Map mapOfData = (Map) obj2;
                Intrinsics.checkNotNullParameter(mapOfData, "mapOfData");
                LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(mapOfData.size()));
                for (Map.Entry entry : mapOfData.entrySet()) {
                    Object key = entry.getKey();
                    Data dataCopy$default = (Data) entry.getValue();
                    if (dataCopy$default.getContent() != null && (dataCopy$default.getLoading() || dataCopy$default.getError() != null)) {
                        dataCopy$default = Data.copy$default(dataCopy$default, null, null, false, 1, null);
                    }
                    linkedHashMap.put(key, dataCopy$default);
                }
                return linkedHashMap;
            case 1:
                e it8 = (e) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return (f5j.a) it8.f149143a.getContent();
            case 2:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 3:
                List payments = (List) obj2;
                Intrinsics.checkNotNullParameter(payments, "payments");
                return Boolean.valueOf(!payments.isEmpty());
            case 4:
                List feeds = (List) obj2;
                Intrinsics.checkNotNullParameter(feeds, "feeds");
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : feeds) {
                    if (((y) obj3).f285837h) {
                        arrayList.add(obj3);
                    }
                }
                return arrayList;
            case 5:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 6:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 7:
                n update = (n) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return n.a(update, new Data(null, new IllegalStateException("Card id should be provided!"), false, 5, null), null, false, 6);
            case 8:
                Function0 getDefaultLoadingItems2 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems2, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems2.invoke();
            case 9:
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM converter_items ORDER BY weight LIMIT 1");
                try {
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "asset_type_key");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "asset_code");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "amount");
                    return sQLiteStatementPrepare.step() ? new i4d.a((int) sQLiteStatementPrepare.getLong(SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "weight")), sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.getLong(columnIndexOrThrow3)) : null;
                } finally {
                }
            case 10:
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM converter_items ORDER BY weight");
                try {
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "asset_type_key");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "asset_code");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "amount");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "weight");
                    ArrayList arrayList2 = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        arrayList2.add(new i4d.a((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5), sQLiteStatementPrepare.getLong(columnIndexOrThrow6)));
                        break;
                    }
                    return arrayList2;
                } finally {
                }
            case 11:
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM converter_items ORDER BY weight");
                try {
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "asset_type_key");
                    int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "asset_code");
                    int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "amount");
                    int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "weight");
                    ArrayList arrayList3 = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        arrayList3.add(new i4d.a((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11), sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8), sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9), sQLiteStatementPrepare.getLong(columnIndexOrThrow10)));
                        break;
                    }
                    return arrayList3;
                } finally {
                }
            case 12:
                List entities = (List) obj2;
                Intrinsics.checkNotNullParameter(entities, "entities");
                List<i4d.a> list = entities;
                ArrayList arrayList4 = new ArrayList(w.t(list, 10));
                for (i4d.a aVar : list) {
                    Intrinsics.checkNotNullParameter(aVar, "<this>");
                    FavouritesAssetTypeKey favouritesAssetTypeKey = new FavouritesAssetTypeKey(aVar.f158414a);
                    xi0.a aVar2 = b.Companion;
                    String str = aVar.f158415b;
                    aVar2.getClass();
                    arrayList4.add(new c(favouritesAssetTypeKey, new d(aVar.f158416c, xi0.a.a(str))));
                }
                return arrayList4;
            case 13:
                do3.n it9 = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                wi0.b.Companion.getClass();
                return Boolean.valueOf(te0.w.S(it9, wi0.b.A));
            case 14:
                do3.n it10 = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return q.y(it10);
            case 15:
                f Json = (f) obj2;
                Lazy lazy = h55.b.f149505a;
                Intrinsics.checkNotNullParameter(Json, "$this$Json");
                Json.f255101c = true;
                return Unit.f186387a;
            case 16:
                Boolean bool = (Boolean) obj2;
                Intrinsics.h(bool);
                return bool;
            case 17:
                do3.n user = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(user, "user");
                String str2 = user.f;
                String str3 = user.f116414l;
                if (str2 != null && str3 != null) {
                    h hVar = i.Companion;
                    e3a.a aVar3 = new e3a.a(user.f116408a, str2, str3, te0.w.I(user));
                    hVar.getClass();
                    return h.a(aVar3);
                }
                IllegalStateException illegalStateException = new IllegalStateException("User has null username");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                i.Companion.getClass();
                return i.f224256b;
            case 18:
                y49.f unrealisedPerformance = (y49.f) obj2;
                Intrinsics.checkNotNullParameter(unrealisedPerformance, "unrealisedPerformance");
                return new h5b.e(unrealisedPerformance.f310846c, ((y49.c) d0.b0(unrealisedPerformance.d)).e, !unrealisedPerformance.e.isEmpty());
            case 19:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return u.c(new on0("maintenance-margin-widget-loading"));
            case 20:
                t1 it11 = (t1) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return new h5f.a(it11);
            case 21:
                OrderQuote amount = (OrderQuote) obj2;
                Intrinsics.checkNotNullParameter(amount, "$this$amount");
                return new TextLocalisedClause(R$string.credit_card_topup_confirmation_item_amount, null, null, 14);
            case 22:
                OrderQuote exchanged = (OrderQuote) obj2;
                Intrinsics.checkNotNullParameter(exchanged, "$this$exchanged");
                return new TextLocalisedClause(R$string.market_data_transaction_breakdown_exchanged, null, null, 14);
            case 23:
                OrderQuote fees = (OrderQuote) obj2;
                Intrinsics.checkNotNullParameter(fees, "$this$fees");
                return new d4i.b(fees.f104755g.f104731a);
            case 24:
                OrderQuote taxes = (OrderQuote) obj2;
                Intrinsics.checkNotNullParameter(taxes, "$this$taxes");
                return new d4i.b(taxes.f104755g.f104732b);
            case 25:
                OrderQuote estimatedTotal = (OrderQuote) obj2;
                Intrinsics.checkNotNullParameter(estimatedTotal, "$this$estimatedTotal");
                return ((Amount) r10.w.k(estimatedTotal).f186385a).f104718b.f104719a == f8l.c.CRYPTO ? new TextLocalisedClause(R$string.market_data_exchange_breakdown_estimated_total_cost, null, null, 14) : new TextLocalisedClause(R$string.credit_card_topup_confirmation_item_total_to_pay, null, null, 14);
            case 26:
                OrderQuote price = (OrderQuote) obj2;
                Intrinsics.checkNotNullParameter(price, "$this$price");
                Pair pairK = r10.w.k(price);
                return new d4i.d(((Amount) pairK.f186385a).f104718b, ((Amount) pairK.f186386b).f104718b);
            case 27:
                OrderQuote amount2 = (OrderQuote) obj2;
                Intrinsics.checkNotNullParameter(amount2, "$this$amount");
                return new TextLocalisedClause(R$string.market_data_transaction_breakdown_received, null, null, 14);
            case 28:
                OrderQuote amount3 = (OrderQuote) obj2;
                Intrinsics.checkNotNullParameter(amount3, "$this$amount");
                return new TextLocalisedClause(R$string.market_data_transaction_breakdown_received, null, null, 14);
            default:
                OrderQuote fees2 = (OrderQuote) obj2;
                Intrinsics.checkNotNullParameter(fees2, "$this$fees");
                return new d4i.b(fees2.f104755g.f104731a);
        }
    }

    public /* synthetic */ a(r10.w wVar, int i) {
        this.f149112a = i;
    }
}
