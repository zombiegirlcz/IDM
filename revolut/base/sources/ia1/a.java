package ia1;

import fa1.k;
import fa1.x;
import ga1.i;
import ga1.n;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import qa1.j;
import zhm.r0;

/* JADX INFO: loaded from: classes20.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f159925a = r0.k(new Pair("info", k.INFO), new Pair("warning", k.WARNING), new Pair("error", k.ERROR), new Pair("off", k.OFF));

    public static final j a(n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        return new j(nVar.getHash(), nVar.getData());
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    public static final i b(x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        String string = xVar.c().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return new i(string, xVar.b(), u1.g(xVar.a(), f159925a));
    }
}
