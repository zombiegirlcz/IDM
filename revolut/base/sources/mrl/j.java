package mrl;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import zhm.r0;

/* JADX INFO: loaded from: classes12.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f208164a = r0.k(new Pair("MARKET", k4l.r0.MARKET), new Pair("LIMIT", k4l.r0.LIMIT), new Pair("STOP", k4l.r0.STOP), new Pair("RECURRING", k4l.r0.RECURRING));

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public static final k4l.r0 a(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return (k4l.r0) u1.u(str, f208164a);
    }
}
