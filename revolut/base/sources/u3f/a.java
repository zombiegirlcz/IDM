package u3f;

import dfl.l0;
import dfl.m0;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import n3f.d0;
import w3f.i0;
import zhm.r0;

/* JADX INFO: loaded from: classes8.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f276927a = r0.k(new Pair("SEC", m0.SEC), new Pair("TAF", m0.TAF));

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    public static final l0 a(d0 d0Var) {
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        return new l0((m0) u1.u(d0Var.getType(), f276927a), hx7.a.v(d0Var.getAmount()));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    public static final l0 b(i0 i0Var) {
        Intrinsics.checkNotNullParameter(i0Var, "<this>");
        m0 m0Var = (m0) u1.v(i0Var.getType(), f276927a);
        if (m0Var != null) {
            return new l0(m0Var, mo3.a.o(i0Var.getAmount()));
        }
        return null;
    }
}
