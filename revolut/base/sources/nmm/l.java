package nmm;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import mmm.h0;

/* JADX INFO: loaded from: classes14.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f217412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f217413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f217414c;
    public final long d;
    public final long e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f217415g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f217416h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f217417j;
    public final Long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Long f217418l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Long f217419m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Integer f217420n;
    public final Integer o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Integer f217421p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f217422q;

    public l(h0 canonicalPath, boolean z, String comment, long j2, long j3, long j5, int i, long j16, int i2, int i3, Long l2, Long l3, Long l4, Integer num, Integer num2, Integer num3) {
        Intrinsics.checkNotNullParameter(canonicalPath, "canonicalPath");
        Intrinsics.checkNotNullParameter(comment, "comment");
        this.f217412a = canonicalPath;
        this.f217413b = z;
        this.f217414c = comment;
        this.d = j2;
        this.e = j3;
        this.f = j5;
        this.f217415g = i;
        this.f217416h = j16;
        this.i = i2;
        this.f217417j = i3;
        this.k = l2;
        this.f217418l = l3;
        this.f217419m = l4;
        this.f217420n = num;
        this.o = num2;
        this.f217421p = num3;
        this.f217422q = new ArrayList();
    }

    public /* synthetic */ l(h0 h0Var, boolean z, String str, long j2, long j3, long j5, int i, long j16, int i2, int i3, Long l2, Long l3, Long l4, int i5) {
        this(h0Var, z, (i5 & 4) != 0 ? "" : str, (i5 & 8) != 0 ? -1L : j2, (i5 & 16) != 0 ? -1L : j3, (i5 & 32) != 0 ? -1L : j5, (i5 & 64) != 0 ? -1 : i, (i5 & 128) != 0 ? -1L : j16, (i5 & 256) != 0 ? -1 : i2, (i5 & 512) != 0 ? -1 : i3, (i5 & 1024) != 0 ? null : l2, (i5 & 2048) != 0 ? null : l3, (i5 & 4096) != 0 ? null : l4, null, null, null);
    }
}
