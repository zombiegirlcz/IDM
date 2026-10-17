package gn;

import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.bills.core.api.model.Bill;
import com.revolut.feature.apm.bills.f24.impl.ui.forms_list.FormsListScreen;
import com.revolut.feature.credit.card.api.models.creditcard.CreditCardPaymentDetails;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.shared.savings.models.product.SavingsDocument;
import com.revolut.feature.terms.api.model.Terms;
import gnh.u;
import gnl.h;
import go7.f;
import gpb.k;
import gpb.m;
import gq4.l;
import iel.i;
import ip0.cs;
import ip0.ek;
import ip0.ep;
import ip0.gu;
import ip0.p10;
import ip0.pb0;
import ip0.t10;
import ip0.xk;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import kotlin.text.a0;
import pd5.g;
import tof.i3;
import tof.j3;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f144888a;

    public /* synthetic */ a(int i) {
        this.f144888a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        gp3.c cVar;
        kp3.b bVar;
        switch (this.f144888a) {
            case 0:
                sm.d result = (sm.d) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                throw null;
            case 1:
                Throwable e = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(e, "e");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                return Boolean.TRUE;
            case 2:
                List terms = (List) obj2;
                Intrinsics.checkNotNullParameter(terms, "terms");
                List<Terms> list = terms;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                for (Terms terms2 : list) {
                    arrayList.add(new bjb.a(terms2.f90359h, new SavingsDocument.Scope(terms2.f.f90390a, null)));
                }
                return arrayList;
            case 3:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 4:
                ListSubheaderDelegate.Model it8 = (ListSubheaderDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                Object obj3 = it8.f52715m;
                if (obj3 instanceof u) {
                    return (u) obj3;
                }
                return null;
            case 5:
                h updateState = (h) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return h.a(updateState, null, null, 11);
            case 6:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                cs csVar = new cs("OPTION_LOADING");
                yp0.b.r(csVar, 0, 0, 0, 0, 15);
                return zhm.u.c(csVar);
            case 7:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 8:
                Intrinsics.checkNotNullParameter((g) obj2, "it");
                return Boolean.TRUE;
            case 9:
                f updateState2 = (f) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                return f.a(updateState2, null, !updateState2.f145094g, 63);
            case 10:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                int i = R$attr.uikit_dp72;
                int i2 = R$attr.uikit_dp24;
                int i3 = R$attr.uikit_dp16;
                ek ekVar = new ek("FULL_SCREEN_LOADING", i, i2, i3, i3, false, 4, false);
                yp0.b.l(ekVar, 0, 0, 0, 0, null, false, 63);
                return zhm.u.c(ekVar);
            case 11:
                i it9 = (i) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return zhm.u.c(it9);
            case 12:
                List it10 = (List) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return (kp3.b) d0.d0(it10);
            case 13:
                gp3.b it11 = (gp3.b) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                Data data = it11.f145226a;
                i iVarA = (data == null || (cVar = (gp3.c) data.getContent()) == null || (bVar = cVar.f145229a) == null) ? null : bVar.a();
                iel.a aVar = iVarA instanceof iel.a ? (iel.a) iVarA : null;
                if (aVar != null) {
                    return aVar.i();
                }
                return null;
            case 14:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return f0.f322471a;
            case 15:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return null;
            case 16:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return gp3.f.f145233a;
            case 17:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                aim.e eVarB = zhm.u.b();
                eVarB.add(new gu("SUBHEADER_LOADING_LIST_ID_1", 0, 0, 30));
                p10 p10Var = p10.f165755a;
                List listK = v.k(new t10("PLAIN_TEXT_LOADING_LIST_ID_1", p10Var), new pb0("ROW_LOADING_LIST_ID_1"), new pb0("ROW_LOADING_LIST_ID_2"), new pb0("ROW_LOADING_LIST_ID_3"));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                eVarB.addAll(listK);
                eVarB.add(new gu("SUBHEADER_LOADING_LIST_ID_2", 0, 0, 30));
                List listK2 = v.k(new t10("PLAIN_TEXT_LOADING_LIST_ID_2", p10Var), new pb0("ROW_LOADING_LIST_ID_4"), new pb0("ROW_LOADING_LIST_ID_5"), new pb0("ROW_LOADING_LIST_ID_6"));
                yp0.b.k(listK2, 0, 0, 0, 0, 31);
                eVarB.addAll(listK2);
                return new m(k.f145419a, zhm.u.a(eVarB));
            case 18:
                List categories = (List) obj2;
                Intrinsics.checkNotNullParameter(categories, "categories");
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : categories) {
                    if (((i3) obj4) instanceof j3) {
                        arrayList2.add(obj4);
                    } else {
                        arrayList3.add(obj4);
                    }
                }
                return new gpd.a(arrayList3, arrayList2);
            case 19:
                IntRange intRangeU = t61.a.u((Function0) obj2, "it", 0, 17, 1);
                ArrayList arrayList4 = new ArrayList(w.t(intRangeU, 10));
                vim.f it12 = intRangeU.iterator();
                while (it12.f289625c) {
                    arrayList4.add(new ep(String.valueOf(it12.nextInt())));
                }
                xk xkVar = new xk("GRID_ID_LOADING", arrayList4, null, null, null, 60);
                yp0.b.l(xkVar, 0, 0, 0, 0, null, false, 63);
                return new gpd.d(zhm.u.c(xkVar));
            case 20:
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * from rates_alerts");
                try {
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "targetRate");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "placementRate");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "currencyFrom");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "currencyTo");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createdDate");
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "executedDate");
                    ArrayList arrayList5 = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        arrayList5.add(new gpk.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5), sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6), sQLiteStatementPrepare.getLong(columnIndexOrThrow7), sQLiteStatementPrepare.getLong(columnIndexOrThrow8)));
                        break;
                    }
                    return arrayList5;
                } finally {
                    sQLiteStatementPrepare.close();
                }
            case 21:
                CharSequence it13 = (CharSequence) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return Boolean.valueOf(it13.length() > 0);
            case 22:
                RowDelegate.Model it14 = (RowDelegate.Model) obj2;
                KProperty[] kPropertyArr = FormsListScreen.R;
                Intrinsics.checkNotNullParameter(it14, "it");
                return Boolean.valueOf(Intrinsics.f(it14.f53228a, "ID_NEW_FORM_ACTION"));
            case 23:
                RowDelegate.Model it15 = (RowDelegate.Model) obj2;
                KProperty[] kPropertyArr2 = FormsListScreen.R;
                Intrinsics.checkNotNullParameter(it15, "it");
                if (a0.H(it15.f53228a, "ID_FORM_ITEM_", false) && (it15.u instanceof Bill)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 24:
                gq2.h update = (gq2.h) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return gq2.h.a(update, update.f145525a + 1, 0, new Data(null, null, true, 3, null), 4);
            case 25:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return new gq4.h((io3.d) pair.f186385a, ((CreditCardPaymentDetails) pair.f186386b).f68742m);
            case 26:
                Function0 getDefaultLoadingItems2 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems2, "getDefaultLoadingItems");
                List list2 = (List) getDefaultLoadingItems2.invoke();
                gq4.f fVar = gq4.f.f145547a;
                return new l(list2, fVar, fVar);
            case 27:
                gq5.e it16 = (gq5.e) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return (CryptoAddress) it16.f145568a.getContent();
            case 28:
                gq5.e it17 = (gq5.e) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return it17.f145569b;
            default:
                Function0 getDefaultLoadingItems3 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems3, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems3.invoke();
        }
    }

    public /* synthetic */ a(Object obj2, int i) {
        this.f144888a = i;
    }
}
