package or4;

import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.card.models.CreditCard;
import com.revolut.feature.payments.groups.impl.ui_chat.members.GroupChatMembersScreen;
import com.revolut.feature.retail.cfd.api.domain.models.MarginQuote;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import d9.e1;
import ip0.pb0;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;
import jel.h1;
import jel.n;
import k4l.e0;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import oq9.o;
import os9.q;
import yhm.r;
import zhm.a0;
import zhm.f0;
import zhm.q0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f228061a;

    public /* synthetic */ h(int i) {
        this.f228061a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        boolean z = true;
        switch (this.f228061a) {
            case 0:
                r rVar = (r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                return new d((ux4.b) rVar.f314201a, (ll4.r) rVar.f314202b, ((CreditCard) rVar.f314203c).i);
            case 1:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 2:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return f0.f322471a;
            case 3:
                Throwable it9 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return f0.f322471a;
            case 4:
                Object[] groupsDataRaw = (Object[]) obj2;
                Intrinsics.checkNotNullParameter(groupsDataRaw, "groupsDataRaw");
                List listV0 = kotlin.collections.d.v0(groupsDataRaw);
                Intrinsics.i(listV0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Pair<kotlin.collections.List<com.revolut.feature.payments.groups.api.providers.united_wallet.PaymentGroupTransactionData.Bill>, kotlin.collections.List<com.revolut.feature.payments.groups.api.providers.united_wallet.PaymentGroupTransactionData.Settlement>>>");
                return listV0;
            case 5:
                List groupData = (List) obj2;
                Intrinsics.checkNotNullParameter(groupData, "groupData");
                ArrayList arrayList = new ArrayList();
                Iterator it10 = groupData.iterator();
                while (it10.hasNext()) {
                    a0.x((List) ((Pair) it10.next()).f186385a, arrayList);
                }
                int iB = q0.b(w.t(arrayList, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB >= 16 ? iB : 16);
                for (Object obj3 : arrayList) {
                    linkedHashMap.put(((sq9.a) obj3).f265029a, obj3);
                }
                return linkedHashMap;
            case 6:
                Throwable it11 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return f0.f322471a;
            case 7:
                OrderQuote it12 = (OrderQuote) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return Optional.of(it12);
            case 8:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                OrderQuote orderQuote = (OrderQuote) pair.f186385a;
                Object obj4 = pair.f186386b;
                Intrinsics.checkNotNullExpressionValue(obj4, "component2(...)");
                return new qrb.d(orderQuote, (OrderQuote) gj7.b.m((Optional) obj4));
            case 9:
                OrderQuote orderQuote2 = (OrderQuote) obj2;
                Intrinsics.checkNotNullParameter(orderQuote2, "orderQuote");
                return new qrb.a(l4i.a.b(e1.v(orderQuote2)), e1.l(orderQuote2));
            case 10:
                MarginQuote it13 = (MarginQuote) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return new qrb.c(it13);
            case 11:
                jel.c it14 = (jel.c) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                if (it14 instanceof n) {
                    return (n) it14;
                }
                return null;
            case 12:
                MarginQuote it15 = (MarginQuote) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return Boolean.valueOf(e1.D(it15.f82111b.f104717a));
            case 13:
                MarginQuote it16 = (MarginQuote) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return it16.f82116l.f82103a.f104717a.divide(it16.f82111b.f104717a.abs(), MathContext.DECIMAL128);
            case 14:
                Optional it17 = (Optional) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return it17.map(new bpd.a(new h(i), 13));
            case 15:
                e0 it18 = (e0) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return Optional.of(it18);
            case 16:
                kel.g gVar = (kel.g) obj2;
                Intrinsics.i(gVar, "null cannot be cast to non-null type com.revolut.shared.feature.wealth.models.holding.StockHolding");
                return (kel.n) gVar;
            case 17:
                jel.c it19 = (jel.c) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                if (it19 instanceof h1) {
                    return (h1) it19;
                }
                return null;
            case 18:
                Data it20 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                if (it20.getLoading() && it20.getContent() == null) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 19:
                Function0 it21 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                throw new IllegalStateException("Loading state has to be provided in #createLoadingModel");
            case 20:
                Data it22 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                if (it22.getLoading() && it22.getContent() == null) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 21:
                Function0 it23 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it23, "it");
                throw new IllegalStateException("Loading state has to be provided in #createLoadingModel");
            case 22:
                try {
                    ((SQLiteConnection) obj2).prepare("DELETE FROM tax_hub_calendar_event").step();
                    return null;
                } finally {
                }
            case 23:
                try {
                    ((SQLiteConnection) obj2).prepare("DELETE FROM tax_hub_tax_profile").step();
                    return null;
                } finally {
                }
            case 24:
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM vat_reminder");
                try {
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "enabled");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "assessment_period");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "closing_month");
                    ArrayList arrayList2 = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        arrayList2.add(new ps6.j(sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4)), sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2)) != 0));
                        break;
                    }
                    return arrayList2;
                } finally {
                }
            case 25:
                zm3.a it24 = (zm3.a) obj2;
                Intrinsics.checkNotNullParameter(it24, "it");
                return new os9.b(it24);
            case 26:
                Object[] resultArray = (Object[]) obj2;
                Intrinsics.checkNotNullParameter(resultArray, "resultArray");
                ArrayList arrayList3 = new ArrayList();
                for (Object obj5 : resultArray) {
                    zm3.a aVar = obj5 instanceof os9.b ? ((os9.b) obj5).f229261a : null;
                    if (aVar != null) {
                        arrayList3.add(aVar);
                    }
                }
                return arrayList3;
            case 27:
                Function0 it25 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it25, "it");
                List listK = v.k(new pb0("1"), new pb0("2"), new pb0("3"));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                return new q(listK, f0.f322471a);
            case 28:
                RowDelegate.Model it26 = (RowDelegate.Model) obj2;
                KProperty[] kPropertyArr = GroupChatMembersScreen.f79369e0;
                Intrinsics.checkNotNullParameter(it26, "it");
                Object obj6 = it26.u;
                if (obj6 instanceof o) {
                    return (o) obj6;
                }
                return null;
            default:
                RowDelegate.Model it27 = (RowDelegate.Model) obj2;
                KProperty[] kPropertyArr2 = GroupChatMembersScreen.f79369e0;
                Intrinsics.checkNotNullParameter(it27, "it");
                Object obj7 = it27.u;
                if (obj7 instanceof o) {
                    return (o) obj7;
                }
                return null;
        }
    }

    public /* synthetic */ h(Object obj2, int i) {
        this.f228061a = i;
    }
}
