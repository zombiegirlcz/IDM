package mrl;

import k4l.q0;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import zhm.r0;

/* JADX INFO: loaded from: classes12.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f208162a = r0.k(new Pair("DAY", q0.DAY), new Pair("MARKET_ON_OPEN", q0.MARKET_ON_OPEN), new Pair("GOOD_TIL_CANCELLED", q0.GTC), new Pair("GOOD_TIL_EXT_MARKET", q0.GOOD_TIL_EXT_MARKET));

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public static final String a(q0 q0Var) {
        Intrinsics.checkNotNullParameter(q0Var, "<this>");
        return u1.g(q0Var, f208162a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public static final q0 b(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return (q0) u1.u(str, f208162a);
    }
}
