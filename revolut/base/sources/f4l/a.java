package f4l;

import bfl.g;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import zhm.r0;

/* JADX INFO: loaded from: classes12.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f132249a = r0.k(new Pair("BUY", g.BUY), new Pair("SELL", g.SELL));

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public static final String a(g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return u1.g(gVar, f132249a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public static final String b(g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return u1.g(gVar, f132249a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public static final g c(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return (g) u1.u(str, f132249a);
    }
}
