package hx7;

import ix7.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import zhm.r0;
import zw7.v0;
import zw7.w0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f156406a = r0.k(new Pair("PRICING_HIGH", v0.PRICING_HIGH), new Pair("MISSING_COVERAGE", v0.MISSING_COVERAGE), new Pair("OTHER", v0.OTHER), new Pair("PASS_AWAY", v0.PASS_AWAY), new Pair("POOR_APP_EXP", v0.POOR_APP_EXP), new Pair("POOR_SUPPORT_EXP", v0.POOR_SUPPORT_EXP));

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
    public static final ArrayList a(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            u uVar = (u) it8.next();
            Intrinsics.checkNotNullParameter(uVar, "<this>");
            v0 v0Var = (v0) u1.v(uVar.getCode(), f156406a);
            w0 w0Var = v0Var == null ? null : new w0(v0Var, uVar.getName());
            if (w0Var != null) {
                arrayList.add(w0Var);
            }
        }
        return arrayList;
    }
}
