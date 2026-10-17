package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
final class g80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile long f28790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile long f28791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile long f28792c;
    private volatile long d;
    private volatile long e;
    private volatile long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile long f28793g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile long f28794h;
    private volatile long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile long f28795j;
    private volatile long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private volatile long f28796l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private volatile long f28797m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile long f28798n;
    private volatile long o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private volatile long f28799p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private volatile long f28800q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private volatile long f28801r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private volatile Boolean f28802s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private volatile String f28803t;

    public final void a(long j2) {
        this.f28791b = j2;
    }

    public final void b(long j2) {
        this.f28790a = j2;
    }

    public final void c(long j2) {
        this.f = j2;
    }

    public final void d(long j2) {
        this.e = j2;
    }

    public final void e(long j2) {
        this.d = j2;
    }

    public final void f(long j2) {
        this.f28792c = j2;
    }

    public final void g(long j2) {
        this.f28800q = j2;
    }

    public final void h(long j2) {
        this.f28796l = j2;
    }

    public final void i(long j2) {
        this.k = j2;
    }

    public final void j(long j2) {
        this.f28795j = j2;
    }

    public final void k(long j2) {
        this.i = j2;
    }

    public final void l(long j2) {
        this.f28801r = j2;
    }

    public final void m(long j2) {
        this.f28799p = j2;
    }

    public final void n(long j2) {
        this.o = j2;
    }

    public final void o(long j2) {
        this.f28798n = j2;
    }

    public final void p(long j2) {
        this.f28797m = j2;
    }

    public final void q(long j2) {
        this.f28794h = j2;
    }

    public final void r(long j2) {
        this.f28793g = j2;
    }

    public final void a(Boolean bool) {
        this.f28802s = bool;
    }

    public final long b() {
        return this.e;
    }

    public final void a(String str) {
        this.f28803t = str;
    }

    public final bb0 a() {
        long j2;
        Double dValueOf;
        long j3 = this.f28791b > this.f28790a ? (this.f28791b - this.f28790a) / ((long) 1000000) : 0L;
        Double dA = a(this.f28792c, this.d);
        Double dA2 = a(this.e, this.f28793g);
        Double dA3 = a(this.f28793g, this.f28794h);
        long j5 = this.f28796l > 0 ? this.f28796l : this.f28795j;
        Double dA4 = a(this.i, j5);
        Double dA5 = a(j5, this.f28797m);
        Double dA6 = a(this.f28797m, this.f28799p);
        Double[] elements = {dA, dA2, dA3};
        Intrinsics.checkNotNullParameter(elements, "elements");
        double dR0 = zhm.d0.R0(kotlin.collections.d.L(elements));
        if (this.f28800q <= 0 || dA4 == null || dA4.doubleValue() <= 0.0d) {
            j2 = 0;
            dValueOf = null;
        } else {
            j2 = 0;
            dValueOf = Double.valueOf((this.f28800q / 1024.0d) / (dA4.doubleValue() / 1000.0d));
        }
        Double dValueOf2 = (this.f28801r <= j2 || dA6 == null || dA6.doubleValue() <= 0.0d) ? null : Double.valueOf((this.f28801r / 1024.0d) / (dA6.doubleValue() / 1000.0d));
        long j16 = this.f28800q;
        long j22 = this.f28801r;
        if (dA2 == null || dA2.doubleValue() < 0.0d) {
            dA2 = null;
        }
        return cb0.b(new bb0(j3, j16, j22, dA, dA2, dA3, dA4, dA5, dA6, dR0 > 0.0d ? Double.valueOf(dR0) : null, dA5, null, dValueOf, dValueOf2, this.f28802s, this.f28803t, null, null, 198656, null));
    }

    private final Double a(long j2, long j3) {
        if (j2 <= 0 || j3 <= j2) {
            return null;
        }
        return Double.valueOf((j3 - j2) / 1000000.0d);
    }
}
