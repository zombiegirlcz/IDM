package jhe;

import com.revolut.feature.tab.accounts.api.total_wealth.TotalWealthCategoryKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tw0.g1;
import yfe.q0;
import zhm.d0;

/* JADX INFO: loaded from: classes8.dex */
public final class g {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f174220b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mhe.e f174221a;

    static {
        ahe.t.Companion.getClass();
        f174220b = ahe.s.f5028b;
    }

    public g(mhe.e gridColumns) {
        Intrinsics.checkNotNullParameter(gridColumns, "gridColumns");
        this.f174221a = gridColumns;
    }

    public static final int a(g gVar, TotalWealthCategoryKey totalWealthCategoryKey) {
        yfe.a aVarA = com.revolut.feature.tab.accounts.api.total_wealth.a.a(totalWealthCategoryKey);
        List list = f174220b;
        int iIndexOf = list.indexOf(aVarA);
        return iIndexOf != -1 ? iIndexOf : list.size();
    }

    public final List b(ArrayList items, List savedOrder) {
        List listE0;
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(savedOrder, "savedOrder");
        if (items.isEmpty()) {
            return items;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : items) {
            if (((ohe.f) obj2).f225362b instanceof q0) {
                arrayList.add(obj2);
            } else {
                arrayList2.add(obj2);
            }
        }
        if (savedOrder.isEmpty()) {
            listE0 = d0.P0(arrayList, new f(this, 0));
        } else {
            int iB = zhm.q0.b(zhm.w.t(arrayList, 10));
            if (iB < 16) {
                iB = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
            for (Object obj3 : arrayList) {
                linkedHashMap.put(((ohe.f) obj3).f225361a, obj3);
            }
            List list = savedOrder;
            Set setI1 = d0.i1(list);
            List listU = d0.U(list);
            ArrayList arrayList3 = new ArrayList();
            Iterator it8 = listU.iterator();
            while (it8.hasNext()) {
                ohe.f fVar = (ohe.f) linkedHashMap.get((TotalWealthCategoryKey) it8.next());
                if (fVar != null) {
                    arrayList3.add(fVar);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj4 : arrayList) {
                if (!setI1.contains(((ohe.f) obj4).f225361a)) {
                    arrayList4.add(obj4);
                }
            }
            listE0 = d0.E0(d0.P0(arrayList4, new f(this, 1)), arrayList3);
        }
        if (arrayList2.isEmpty()) {
            return listE0;
        }
        int size = listE0.size();
        int size2 = arrayList2.size();
        int columnCount = ((g1) this.f174221a.f205551a.getValue()).getColumnCount();
        int iMax = Math.max(6, size + 2);
        int i = iMax % columnCount;
        if (i != 0) {
            iMax = (iMax + columnCount) - i;
        }
        int i2 = iMax - size;
        if (i2 <= size2) {
            size2 = i2;
        }
        return d0.E0(d0.V0(d0.P0(arrayList2, new f(this, 2)), size2), listE0);
    }
}
