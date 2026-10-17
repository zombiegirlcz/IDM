package g6j;

import aw0.bb;
import aw0.cb;
import aw0.o9;
import com.revolut.core.model.money.ScaleMode;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.jm0;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import tof.a3;
import zhm.d0;
import zhm.q0;
import zhm.r0;

/* JADX INFO: loaded from: classes10.dex */
public final class v {

    @NotNull
    public static final u Companion = new u();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f140977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f140978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l80.e f140979c;

    public v(g pnlMapper, m timeMapper, l80.e dateProvider, t70.b currenciesLocalization) {
        Intrinsics.checkNotNullParameter(pnlMapper, "pnlMapper");
        Intrinsics.checkNotNullParameter(timeMapper, "timeMapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(currenciesLocalization, "currenciesLocalization");
        this.f140977a = pnlMapper;
        this.f140978b = timeMapper;
        this.f140979c = dateProvider;
    }

    public static MoneyClause b(float f, xi0.b bVar) {
        return new MoneyClause(mif.a.Q(new ej0.b(new BigDecimal(String.valueOf(f)), bVar)), new MoneyClause.Format.Defaults(null, ScaleMode.PrettyFormat.f51440a, true, false, 9), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), o9.NON_SENSITIVE);
    }

    public static jm0 c() {
        cb.Companion.getClass();
        cb cbVarB = bb.b();
        int i = R$attr.uikit_dp16;
        jm0 jm0Var = new jm0("CHART_TYPE_LINE_LIST_ID", cbVarB, null, false, null, null, 0, true, 230, null, false, false, null, null, null, null, null, null, null, null, i, i, 0, 0, -402653640);
        int i2 = R$attr.uikit_dp0;
        int i3 = R$attr.uikit_dp16;
        yp0.b.p(jm0Var, i2, i2, i3, i3);
        return jm0Var;
    }

    public static Map d(List list, List list2) {
        if (list.isEmpty() || list2.isEmpty()) {
            return r0.g();
        }
        HashMap map = new HashMap();
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            a3 a3Var = (a3) it8.next();
            DateTime dateTime = a3Var.f272596j;
            if (dateTime != null) {
                int iG = zhm.v.g(list, new t(dateTime, 0));
                if (iG < 0) {
                    iG = Math.min(-(iG + 1), list.size() - 1);
                }
                Integer numValueOf = Integer.valueOf(iG);
                Object obj2 = map.get(numValueOf);
                if (obj2 == null) {
                    obj2 = (Map.Entry) d0.a0(q0.c(new Pair(list.get(iG), new ArrayList())).entrySet());
                    map.put(numValueOf, obj2);
                }
                ((Collection) ((Map.Entry) obj2).getValue()).add(a3Var);
            }
        }
        if (map.size() <= 20) {
            ArrayList<Map.Entry> arrayList = new ArrayList(map.size());
            Iterator it9 = map.entrySet().iterator();
            while (it9.hasNext()) {
                arrayList.add((Map.Entry) ((Map.Entry) it9.next()).getValue());
            }
            int iB = q0.b(zhm.w.t(arrayList, 10));
            if (iB < 16) {
                iB = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
            for (Map.Entry entry : arrayList) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            return linkedHashMap;
        }
        Set setEntrySet = q0.e(map).entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "<get-entries>(...)");
        List listD1 = d0.d1(setEntrySet);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        int i = 0;
        while (i < listD1.size()) {
            Object obj3 = listD1.get(i);
            Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
            Map.Entry entry2 = (Map.Entry) obj3;
            Integer num = (Integer) entry2.getKey();
            Map.Entry entry3 = (Map.Entry) entry2.getValue();
            int i2 = i + 2;
            if (i2 < listD1.size()) {
                Object obj4 = listD1.get(i + 1);
                Intrinsics.checkNotNullExpressionValue(obj4, "get(...)");
                Map.Entry entry4 = (Map.Entry) obj4;
                Integer num2 = (Integer) entry4.getKey();
                Map.Entry entry5 = (Map.Entry) entry4.getValue();
                Object obj5 = listD1.get(i2);
                Intrinsics.checkNotNullExpressionValue(obj5, "get(...)");
                Map.Entry entry6 = (Map.Entry) obj5;
                Integer num3 = (Integer) entry6.getKey();
                Map.Entry entry7 = (Map.Entry) entry6.getValue();
                int iIntValue = num.intValue() + 1;
                if (num2 != null && iIntValue == num2.intValue()) {
                    int iIntValue2 = num2.intValue() + 1;
                    if (num3 != null && iIntValue2 == num3.intValue()) {
                        linkedHashMap2.put(entry5.getKey(), d0.E0((Iterable) entry7.getValue(), d0.E0((Iterable) entry5.getValue(), (Collection) entry3.getValue())));
                        i += 3;
                    }
                }
            }
            linkedHashMap2.put(entry3.getKey(), entry3.getValue());
            i++;
        }
        return linkedHashMap2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0347  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ip0.jm0 a(qta.f r58, com.revolut.data.model.Data r59, com.revolut.data.model.Data r60, int r61) {
        /*
            Method dump skipped, instruction units count: 1323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g6j.v.a(qta.f, com.revolut.data.model.Data, com.revolut.data.model.Data, int):ip0.jm0");
    }
}
