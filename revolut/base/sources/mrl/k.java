package mrl;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import zhm.r0;

/* JADX INFO: loaded from: classes12.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f208165a = r0.k(new Pair("DAILY", sel.a.DAILY), new Pair("WEEKLY", sel.a.WEEKLY), new Pair("MONTHLY", sel.a.MONTHLY));

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public static final sel.a a(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return (sel.a) u1.u(str, f208165a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public static final String b(sel.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return u1.g(aVar, f208165a);
    }
}
