package aw0;

import com.revolut.core.ui_kit.models.MoneyClause;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class w1 {
    private w1() {
    }

    public static y1 a(w1 w1Var, List currentLine, ArrayList arrayList, ArrayList arrayList2, MoneyClause moneyClause, MoneyClause moneyClause2, boolean z, p2 p2Var, int i) {
        List list = arrayList;
        if ((i & 2) != 0) {
            list = zhm.f0.f322471a;
        }
        List previousLine = list;
        List list2 = arrayList2;
        if ((i & 4) != 0) {
            list2 = zhm.f0.f322471a;
        }
        List xLabels = list2;
        MoneyClause moneyClause3 = (i & 8) != 0 ? null : moneyClause;
        MoneyClause moneyClause4 = (i & 16) != 0 ? null : moneyClause2;
        boolean z3 = (i & 32) != 0 ? false : z;
        p2 p2Var2 = (i & 128) != 0 ? null : p2Var;
        w1Var.getClass();
        Intrinsics.checkNotNullParameter(currentLine, "currentLine");
        Intrinsics.checkNotNullParameter(previousLine, "previousLine");
        Intrinsics.checkNotNullParameter(xLabels, "xLabels");
        return new y1(xLabels, currentLine, previousLine, moneyClause3, moneyClause4, z3, p2Var2);
    }

    public static y1 b(w1 w1Var, List list, List currentLineValues, List previousLineValues, MoneyClause moneyClause, int i) {
        if ((i & 1) != 0) {
            list = zhm.f0.f322471a;
        }
        List xLabels = list;
        if ((i & 4) != 0) {
            previousLineValues = zhm.f0.f322471a;
        }
        MoneyClause moneyClause2 = (i & 8) != 0 ? null : moneyClause;
        boolean z = (i & 32) == 0;
        w1Var.getClass();
        Intrinsics.checkNotNullParameter(xLabels, "xLabels");
        Intrinsics.checkNotNullParameter(currentLineValues, "currentLineValues");
        Intrinsics.checkNotNullParameter(previousLineValues, "previousLineValues");
        List list2 = currentLineValues;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            float fFloatValue = ((Number) it8.next()).floatValue();
            a2.Companion.getClass();
            arrayList.add(new a2(fFloatValue, null));
        }
        List list3 = previousLineValues;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
        Iterator it9 = list3.iterator();
        while (it9.hasNext()) {
            float fFloatValue2 = ((Number) it9.next()).floatValue();
            a2.Companion.getClass();
            arrayList2.add(new a2(fFloatValue2, null));
        }
        return new y1(xLabels, arrayList, arrayList2, moneyClause2, null, z, null);
    }
}
