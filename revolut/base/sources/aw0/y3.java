package aw0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class y3 implements s3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w3 f10623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w3 f10624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w3 f10625c;
    public final b4 d;
    public final ArrayList e;
    public final a4 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z3 f10626g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f10627h;

    public y3(w3 high, w3 average, w3 low, b4 fanLegend, ArrayList graph, a4 xAxisLegends) {
        z3 showMode = z3.HIDE_WHEN_CLOSE;
        Intrinsics.checkNotNullParameter(high, "high");
        Intrinsics.checkNotNullParameter(average, "average");
        Intrinsics.checkNotNullParameter(low, "low");
        Intrinsics.checkNotNullParameter(fanLegend, "fanLegend");
        Intrinsics.checkNotNullParameter(graph, "graph");
        Intrinsics.checkNotNullParameter(xAxisLegends, "xAxisLegends");
        Intrinsics.checkNotNullParameter(showMode, "showMode");
        this.f10623a = high;
        this.f10624b = average;
        this.f10625c = low;
        this.d = fanLegend;
        this.e = graph;
        this.f = xAxisLegends;
        this.f10626g = showMode;
        this.f10627h = true;
    }

    @Override // aw0.s3
    public final boolean a() {
        return this.f10627h;
    }

    @Override // aw0.s3
    public final w3 b() {
        return this.f10623a;
    }

    @Override // aw0.s3
    public final b4 c() {
        return this.d;
    }

    @Override // aw0.s3
    public final w3 d() {
        return this.f10625c;
    }

    @Override // aw0.s3
    public final z3 e() {
        return this.f10626g;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y3)) {
            return false;
        }
        y3 y3Var = (y3) obj2;
        return Intrinsics.f(this.f10623a, y3Var.f10623a) && Intrinsics.f(this.f10624b, y3Var.f10624b) && Intrinsics.f(this.f10625c, y3Var.f10625c) && Intrinsics.f(this.d, y3Var.d) && Intrinsics.f(this.e, y3Var.e) && Intrinsics.f(this.f, y3Var.f) && this.f10626g == y3Var.f10626g;
    }

    @Override // aw0.s3
    public final w3 f() {
        return null;
    }

    @Override // aw0.s3
    public final w3 g() {
        return this.f10624b;
    }

    @Override // aw0.s3
    public final w3 getCurrent() {
        p3 p3Var = (p3) zhm.d0.o0(this.e);
        if (p3Var != null) {
            return new w3(p3Var.f10463b, null);
        }
        throw new IllegalStateException("graph must not be empty");
    }

    public final int hashCode() {
        return this.f10626g.hashCode() + ((this.f.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.e, (this.d.hashCode() + ((this.f10625c.hashCode() + ((this.f10624b.hashCode() + (this.f10623a.hashCode() * 31)) * 31)) * 31)) * 31, 31)) * 31);
    }

    @Override // aw0.s3
    public final long max() {
        long jMax = this.f10623a.f10583a;
        long j2 = this.f10624b.f10583a;
        long j3 = this.f10625c.f10583a;
        Iterator it8 = this.e.iterator();
        if (!it8.hasNext()) {
            throw new NoSuchElementException();
        }
        long j5 = ((p3) it8.next()).f10463b;
        while (it8.hasNext()) {
            long j16 = ((p3) it8.next()).f10463b;
            if (j5 < j16) {
                j5 = j16;
            }
        }
        long[] other = {j2, j3, j5};
        Intrinsics.checkNotNullParameter(other, "other");
        for (int i = 0; i < 3; i++) {
            jMax = Math.max(jMax, other[i]);
        }
        return jMax;
    }

    @Override // aw0.s3
    public final long min() {
        long jMin = this.f10623a.f10583a;
        long j2 = this.f10624b.f10583a;
        long j3 = this.f10625c.f10583a;
        Iterator it8 = this.e.iterator();
        if (!it8.hasNext()) {
            throw new NoSuchElementException();
        }
        long j5 = ((p3) it8.next()).f10463b;
        while (it8.hasNext()) {
            long j16 = ((p3) it8.next()).f10463b;
            if (j5 > j16) {
                j5 = j16;
            }
        }
        long[] other = {j2, j3, j5};
        Intrinsics.checkNotNullParameter(other, "other");
        for (int i = 0; i < 3; i++) {
            jMin = Math.min(jMin, other[i]);
        }
        return jMin;
    }
}
