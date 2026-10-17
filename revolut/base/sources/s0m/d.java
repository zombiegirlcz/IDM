package s0m;

import g1m.j;
import java.util.EnumSet;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g1m.d f259016a = g1m.d.POST;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d1m.b f259017b = d1m.b.Single;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f259018c = j.HTTPS;
    public static final EnumSet d;
    public static final int e;
    public static final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f259019g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f259020h;
    public static final long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f259021j;
    public static final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final boolean f259022l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final TimeUnit f259023m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f259024n;
    public static final long o;

    static {
        EnumSet enumSetOf = EnumSet.of(h.TLSv1_2);
        Intrinsics.checkNotNullExpressionValue(enumSetOf, "of(TLSVersion.TLSv1_2)");
        d = enumSetOf;
        e = d1m.b.LargeGroup.a();
        f = 5;
        f259019g = 5;
        f259020h = 40000L;
        i = 40000L;
        f259021j = 30;
        k = 15;
        f259022l = true;
        f259023m = TimeUnit.SECONDS;
        f259024n = kotlin.time.c.g(30, pkm.e.DAYS);
        o = 1000L;
    }
}
