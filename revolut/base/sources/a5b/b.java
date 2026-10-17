package a5b;

import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.ManagedPortfolioSelectTemplateScreenContract$Page;
import com.revolut.feature.wealth.models.robo.Template;
import d8f.h;
import d8f.i;
import d8f.o;
import d8f.w;
import dcl.v;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1338c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ b(int i, String str, Object obj2, Object obj3, Object obj4) {
        this.f1336a = i;
        this.f1338c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f1337b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.util.ArrayList] */
    private final Object a(Object obj2) {
        ?? A;
        Template template;
        com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.b bVar = (com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.b) this.f1338c;
        o tabsMode = (o) this.f1337b;
        h selectionMode = (h) this.d;
        ilc.a aVar = (ilc.a) this.e;
        i iVar = (i) obj2;
        com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.a aVar2 = bVar.f91452s;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(tabsMode, "tabsMode");
        Intrinsics.checkNotNullParameter(selectionMode, "selectionMode");
        int i = w.f112263b[tabsMode.ordinal()];
        if (i == 1) {
            A = selectionMode.a();
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            List listA = selectionMode.a();
            A = new ArrayList();
            for (Object obj3 : listA) {
                if (Intrinsics.f((Template) obj3, selectionMode.b())) {
                    A.add(obj3);
                }
            }
        }
        d8f.e eVar = selectionMode instanceof d8f.e ? (d8f.e) selectionMode : null;
        String str = eVar != null ? eVar.f112238b.f95706a : null;
        String str2 = selectionMode.b().f95706a;
        Iterable iterable = (Iterable) A;
        ArrayList pagerItems = new ArrayList(zhm.w.t(iterable, 10));
        Iterator it8 = iterable.iterator();
        while (it8.hasNext()) {
            pagerItems.add(new ManagedPortfolioSelectTemplateScreenContract$Page((Template) it8.next(), str, str2, tabsMode == o.MULTIPLE_TABS));
        }
        String str3 = ((i) ((j2) bVar.v.f22677a).getValue()).f112246b;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(selectionMode, "selectionMode");
        if (selectionMode instanceof d8f.e) {
            template = ((d8f.e) selectionMode).f112238b;
        } else if (selectionMode instanceof d8f.g) {
            template = ((d8f.g) selectionMode).f112244b;
        } else {
            if (!(selectionMode instanceof d8f.f)) {
                throw new NoWhenBranchMatchedException();
            }
            template = ((d8f.f) selectionMode).f112242c;
        }
        if (str3 == null) {
            str3 = template.f95706a;
        }
        iVar.getClass();
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        return new i(pagerItems, str3, tabsMode, selectionMode, aVar);
    }

    private final Object b(Object obj2) {
        v vVar = (v) this.f1338c;
        String str = (String) this.f1337b;
        String str2 = (String) this.d;
        eel.i iVar = (eel.i) this.e;
        qcl.d dVar = vVar.f113061c;
        SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM stocks_historical_rates WHERE ref = ? AND period = ? AND valueType = ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.bindNull(1);
            } else {
                sQLiteStatementPrepare.bindText(1, str);
            }
            if (str2 == null) {
                sQLiteStatementPrepare.bindNull(2);
            } else {
                sQLiteStatementPrepare.bindText(2, str2);
            }
            sQLiteStatementPrepare.bindText(3, v.f(iVar));
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ref");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "period");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timestamp");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "valueType");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "price");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "percentageYtm");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                BigDecimal bigDecimal = null;
                String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                long j2 = sQLiteStatementPrepare.getLong(columnIndexOrThrow3);
                String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                eel.i iVarValueOf = text3 != null ? eel.i.valueOf(text3) : null;
                ko3.b bVarC = qcl.d.c(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                if (text4 != null) {
                    bigDecimal = new BigDecimal(text4);
                }
                arrayList.add(new icl.c(text, text2, j2, iVarValueOf, bVarC, bigDecimal));
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th10) {
            sQLiteStatementPrepare.close();
            throw th10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0530  */
    /* JADX WARN: Type inference failed for: r14v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r14v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r15v20, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.util.LinkedHashMap, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v52, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v56, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v22 */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r51) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3052
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a5b.b.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ b(apd.f fVar, List list, List list2, xi0.b bVar, amd.a aVar) {
        this.f1336a = 4;
        this.f1338c = list;
        this.f1337b = list2;
        this.d = bVar;
        this.e = aVar;
    }

    public /* synthetic */ b(hha.d dVar, SavingsProductData savingsProductData, ArrayList arrayList, xi0.b bVar) {
        this.f1336a = 29;
        this.f1338c = dVar;
        this.f1337b = savingsProductData;
        this.e = arrayList;
        this.d = bVar;
    }

    public /* synthetic */ b(Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f1336a = i;
        this.f1338c = obj2;
        this.f1337b = obj3;
        this.d = obj4;
        this.e = obj5;
    }

    public /* synthetic */ b(Object obj2, Object obj3, String str, Enum r4, int i) {
        this.f1336a = i;
        this.f1338c = obj2;
        this.d = obj3;
        this.f1337b = str;
        this.e = r4;
    }
}
