package ix0;

import ip0.v7;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class k {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f169250a;

    public k(u80.d decimalFormat) {
        Intrinsics.checkNotNullParameter(decimalFormat, "decimalFormat");
        char monetaryGroupingSeparator = decimalFormat.f278029a.getDecimalFormatSymbols().getMonetaryGroupingSeparator();
        char cD = decimalFormat.d();
        this.f169250a = String.valueOf(monetaryGroupingSeparator);
        String.valueOf(cD);
    }

    public static LinkedHashMap b(ArrayList arrayList) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList) {
            Integer numValueOf = Integer.valueOf(((mx0.s0) obj2).f);
            Object objU = linkedHashMap.get(numValueOf);
            if (objU == null) {
                objU = v7.u(linkedHashMap, numValueOf);
            }
            ((List) objU).add(obj2);
        }
        Set<Map.Entry> setEntrySet = linkedHashMap.entrySet();
        ArrayList arrayList2 = new ArrayList(zhm.w.t(setEntrySet, 10));
        for (Map.Entry entry : setEntrySet) {
            arrayList2.add(new e(((Number) entry.getKey()).intValue(), (List) entry.getValue()));
        }
        int iB = zhm.q0.b(zhm.w.t(arrayList2, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB);
        for (Object obj3 : arrayList2) {
            linkedHashMap2.put(Integer.valueOf(((e) obj3).f169226a), obj3);
        }
        return linkedHashMap2;
    }

    public static void c(mx0.s0 s0Var, mx0.s0 s0Var2) {
        mx0.k0 k0Var = s0Var2.f209982b;
        mx0.k0 k0Var2 = mx0.k0.ADD;
        if (k0Var != k0Var2 || s0Var2.i >= 1.0f) {
            s0Var.a(mx0.k0.NONE);
        } else {
            s0Var.a(k0Var2);
            s0Var.i = s0Var2.i;
        }
        s0Var.f209983c = s0Var2.f209983c;
        s0Var.f209984g = s0Var2.f209985h;
    }

    public final ArrayList a(List list) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                zhm.v.s();
                throw null;
            }
            if (Intrinsics.f(((mx0.s0) obj2).f209981a, this.f169250a)) {
                arrayList.add(new d(i));
            }
            i = i2;
        }
        return arrayList;
    }
}
