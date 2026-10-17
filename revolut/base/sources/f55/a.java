package f55;

import k55.m;
import k55.o;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import p35.a0;
import p35.l;
import p35.q;
import p35.s0;
import p35.w;
import p35.w0;
import p35.z0;
import zhm.r0;

/* JADX INFO: loaded from: classes21.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f132265a = r0.k(new Pair("TOTAL_AMOUNT", z0.TOTAL_AMOUNT), new Pair("DEFAULT", z0.DEFAULT));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f132266b = r0.k(new Pair("ACH", q.ACH), new Pair("DIRECT_DEBIT", q.DIRECT_DEBIT));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f132267c = r0.k(new Pair("PAYMENT", l.PAYMENT), new Pair("SETTLEMENT_SCREEN", l.SETTLEMENT_SCREEN));
    public static final Object d = r0.k(new Pair("FIXED_AMOUNT", s0.FIXED_AMOUNT), new Pair("FIXED_TERM", s0.FIXED_TERM));
    public static final Object e = r0.k(new Pair("GENERATED", w0.Generated), new Pair("PERIODIC", w0.Periodic));

    /* JADX WARN: Removed duplicated region for block: B:85:0x019b  */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v21, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v25, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.Map a(java.util.Map r23) {
        /*
            Method dump skipped, instruction units count: 677
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f55.a.a(java.util.Map):java.util.Map");
    }

    public static final w b(m mVar) {
        a0 a0VarC;
        a0 a0VarC2;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        o info = mVar.getInfo();
        if (info != null) {
            a0VarC = c(info);
        } else {
            a0.Companion.getClass();
            a0VarC = a0.f232601c;
        }
        o contactUs = mVar.getContactUs();
        if (contactUs != null) {
            a0VarC2 = c(contactUs);
        } else {
            a0.Companion.getClass();
            a0VarC2 = a0.f232601c;
        }
        return new w(a0VarC, a0VarC2);
    }

    public static final a0 c(o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        String key = oVar.getKey();
        if (key == null) {
            m70.a.c(t0.f186434a);
            key = "";
        }
        return new a0(key, oVar.getParams());
    }
}
