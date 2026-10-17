package mrl;

import k4l.o0;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import zhm.r0;

/* JADX INFO: loaded from: classes12.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f208161a = r0.k(new Pair("RECEIVED", o0.RECEIVED), new Pair("PENDING", o0.PENDING), new Pair("CANCELLED", o0.CANCELLED), new Pair("DECLINED", o0.DECLINED), new Pair("FILLED", o0.FILLED), new Pair("PARTIALLY_FILLED", o0.PARTIALLY_FILLED));

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public static final o0 a(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return (o0) u1.u(str, f208161a);
    }
}
