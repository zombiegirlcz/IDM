package mrl;

import dfl.m0;
import dfl.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k4l.n0;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import le.u1;
import zhm.f0;
import zhm.r0;

/* JADX INFO: loaded from: classes12.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f208158a = r0.k(new Pair("SEC", m0.SEC), new Pair("TAF", m0.TAF));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f208159b = r0.k(new Pair("AMOUNT", r.MONEY_AMOUNT), new Pair("QUANTITY", r.STOCK_QUANTITY));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f208160c = r0.k(new Pair("DAILY", sel.a.DAILY), new Pair("WEEKLY", sel.a.WEEKLY), new Pair("MONTHLY", sel.a.MONTHLY));

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    public static final ArrayList a(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            r rVar = (r) u1.v((String) it8.next(), f208159b);
            if (rVar != null) {
                arrayList.add(rVar);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0176  */
    /* JADX WARN: Type inference failed for: r5v31, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final k4l.e0 b(orl.j0 r30) {
        /*
            Method dump skipped, instruction units count: 931
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mrl.f.b(orl.j0):k4l.e0");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final m4l.k c(orl.f0 r15) {
        /*
            Method dump skipped, instruction units count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mrl.f.c(orl.f0):m4l.k");
    }

    public static final List d(List list) {
        n0 n0Var;
        ArrayList arrayList = null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                String str = (String) it8.next();
                n0[] n0VarArrValues = n0.values();
                int length = n0VarArrValues.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        n0Var = null;
                        break;
                    }
                    n0Var = n0VarArrValues[i];
                    if (a0.z(n0Var.name(), str, true)) {
                        break;
                    }
                    i++;
                }
                if (n0Var != null) {
                    arrayList2.add(n0Var);
                }
            }
            arrayList = arrayList2;
        }
        return arrayList == null ? f0.f322471a : arrayList;
    }
}
