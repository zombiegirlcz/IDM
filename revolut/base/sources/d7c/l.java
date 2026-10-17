package d7c;

import e7c.n0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import u6c.d0;
import u6c.e0;
import u6c.f0;
import u6c.z;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public abstract class l {
    public static final f0 a(n0 n0Var) {
        z zVar;
        d0 d0Var;
        z zVar2;
        Intrinsics.checkNotNullParameter(n0Var, "<this>");
        String upperCase = n0Var.getOutcome().toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        if (Intrinsics.f(upperCase, "ALLOWED")) {
            String checkedAt = n0Var.getCheckedAt();
            List additionalConditions = n0Var.getAdditionalConditions();
            if (additionalConditions == null) {
                additionalConditions = zhm.f0.f322471a;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it8 = additionalConditions.iterator();
            while (it8.hasNext()) {
                String type = ((n0.a) it8.next()).getType();
                z[] zVarArrValues = z.values();
                int length = zVarArrValues.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        zVar2 = null;
                        break;
                    }
                    zVar2 = zVarArrValues[i];
                    if (a0.z(zVar2.name(), type, true)) {
                        break;
                    }
                    i++;
                }
                if (zVar2 != null) {
                    arrayList.add(zVar2);
                }
            }
            return new u6c.a0(checkedAt, arrayList);
        }
        if (Intrinsics.f(upperCase, "NOT_ALLOWED")) {
            String checkedAt2 = n0Var.getCheckedAt();
            List notAllowedReasons = n0Var.getNotAllowedReasons();
            if (notAllowedReasons == null) {
                notAllowedReasons = zhm.f0.f322471a;
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it9 = notAllowedReasons.iterator();
            while (it9.hasNext()) {
                String type2 = ((n0.b) it9.next()).getType();
                d0[] d0VarArrValues = d0.values();
                int length2 = d0VarArrValues.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length2) {
                        d0Var = null;
                        break;
                    }
                    d0Var = d0VarArrValues[i2];
                    if (a0.z(d0Var.name(), type2, true)) {
                        break;
                    }
                    i2++;
                }
                if (d0Var != null) {
                    arrayList2.add(d0Var);
                }
            }
            return new e0(checkedAt2, arrayList2);
        }
        IllegalStateException illegalStateException = new IllegalStateException(p.a.p("Unknown value ", n0Var.getOutcome(), " for Usage Check outcome enum mapping."));
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        String checkedAt3 = n0Var.getCheckedAt();
        List additionalConditions2 = n0Var.getAdditionalConditions();
        if (additionalConditions2 == null) {
            additionalConditions2 = zhm.f0.f322471a;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it10 = additionalConditions2.iterator();
        while (it10.hasNext()) {
            String type3 = ((n0.a) it10.next()).getType();
            z[] zVarArrValues2 = z.values();
            int length3 = zVarArrValues2.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length3) {
                    zVar = null;
                    break;
                }
                zVar = zVarArrValues2[i3];
                if (a0.z(zVar.name(), type3, true)) {
                    break;
                }
                i3++;
            }
            if (zVar != null) {
                arrayList3.add(zVar);
            }
        }
        return new u6c.a0(checkedAt3, arrayList3);
    }
}
