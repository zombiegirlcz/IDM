package f55;

import java.util.Map;
import kotlin.Pair;
import p35.m0;
import p35.n0;
import p35.p0;
import p35.u0;
import zhm.q0;
import zhm.r0;

/* JADX INFO: loaded from: classes21.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map f132272a = q0.c(new Pair("PENDING", m0.PENDING));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f132273b = q0.c(new Pair("DIRECT_DEBIT", n0.DIRECT_DEBIT));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f132274c = r0.k(new Pair("CARD", u0.CARD), new Pair("DIRECT_DEBIT", u0.DIRECT_DEBIT), new Pair("WALLET", u0.WALLET));
    public static final Object d = r0.k(new Pair("ACTIVE", p0.ACTIVE), new Pair("PENDING", p0.PENDING), new Pair("FAILED", p0.FAILED), new Pair("CANCELLED", p0.CANCELLED), new Pair("DISABLED", p0.DISABLED));

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public static final Map a() {
        return f132274c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public static final Map b() {
        return d;
    }
}
