package com.fourthline.orca.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class bb0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final a f27076s = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f27077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f27078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f27079c;
    private final Double d;
    private final Double e;
    private final Double f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Double f27080g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Double f27081h;
    private final Double i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Double f27082j;
    private final Double k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Double f27083l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Double f27084m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Double f27085n;
    private final Boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final String f27086p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final String f27087q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final String f27088r;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public bb0(long j2, long j3, long j5, Double d, Double d5, Double d6, Double d10, Double d15, Double d41, Double d51, Double d68, Double d81, Double d82, Double d95, Boolean bool, String str, String str2, String str3) {
        this.f27077a = j2;
        this.f27078b = j3;
        this.f27079c = j5;
        this.d = d;
        this.e = d5;
        this.f = d6;
        this.f27080g = d10;
        this.f27081h = d15;
        this.i = d41;
        this.f27082j = d51;
        this.k = d68;
        this.f27083l = d81;
        this.f27084m = d82;
        this.f27085n = d95;
        this.o = bool;
        this.f27086p = str;
        this.f27087q = str2;
        this.f27088r = str3;
    }

    public final bb0 a(long j2, long j3, long j5, Double d, Double d5, Double d6, Double d10, Double d15, Double d41, Double d51, Double d68, Double d81, Double d82, Double d95, Boolean bool, String str, String str2, String str3) {
        return new bb0(j2, j3, j5, d, d5, d6, d10, d15, d41, d51, d68, d81, d82, d95, bool, str, str2, str3);
    }

    public final Double b() {
        return this.d;
    }

    public final Double c() {
        return this.f27085n;
    }

    public final String d() {
        return this.f27087q;
    }

    public final Double e() {
        return this.f27082j;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof bb0)) {
            return false;
        }
        bb0 bb0Var = (bb0) obj2;
        return this.f27077a == bb0Var.f27077a && this.f27078b == bb0Var.f27078b && this.f27079c == bb0Var.f27079c && Intrinsics.f(this.d, bb0Var.d) && Intrinsics.f(this.e, bb0Var.e) && Intrinsics.f(this.f, bb0Var.f) && Intrinsics.f(this.f27080g, bb0Var.f27080g) && Intrinsics.f(this.f27081h, bb0Var.f27081h) && Intrinsics.f(this.i, bb0Var.i) && Intrinsics.f(this.f27082j, bb0Var.f27082j) && Intrinsics.f(this.k, bb0Var.k) && Intrinsics.f(this.f27083l, bb0Var.f27083l) && Intrinsics.f(this.f27084m, bb0Var.f27084m) && Intrinsics.f(this.f27085n, bb0Var.f27085n) && Intrinsics.f(this.o, bb0Var.o) && Intrinsics.f(this.f27086p, bb0Var.f27086p) && Intrinsics.f(this.f27087q, bb0Var.f27087q) && Intrinsics.f(this.f27088r, bb0Var.f27088r);
    }

    public final Double f() {
        return this.f27083l;
    }

    public final String g() {
        return this.f27088r;
    }

    public final String h() {
        return this.f27086p;
    }

    public int hashCode() {
        int iHashCode = ((((Long.hashCode(this.f27077a) * 31) + Long.hashCode(this.f27078b)) * 31) + Long.hashCode(this.f27079c)) * 31;
        Double d = this.d;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d5 = this.e;
        int iHashCode3 = (iHashCode2 + (d5 == null ? 0 : d5.hashCode())) * 31;
        Double d6 = this.f;
        int iHashCode4 = (iHashCode3 + (d6 == null ? 0 : d6.hashCode())) * 31;
        Double d10 = this.f27080g;
        int iHashCode5 = (iHashCode4 + (d10 == null ? 0 : d10.hashCode())) * 31;
        Double d15 = this.f27081h;
        int iHashCode6 = (iHashCode5 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d41 = this.i;
        int iHashCode7 = (iHashCode6 + (d41 == null ? 0 : d41.hashCode())) * 31;
        Double d51 = this.f27082j;
        int iHashCode8 = (iHashCode7 + (d51 == null ? 0 : d51.hashCode())) * 31;
        Double d68 = this.k;
        int iHashCode9 = (iHashCode8 + (d68 == null ? 0 : d68.hashCode())) * 31;
        Double d81 = this.f27083l;
        int iHashCode10 = (iHashCode9 + (d81 == null ? 0 : d81.hashCode())) * 31;
        Double d82 = this.f27084m;
        int iHashCode11 = (iHashCode10 + (d82 == null ? 0 : d82.hashCode())) * 31;
        Double d95 = this.f27085n;
        int iHashCode12 = (iHashCode11 + (d95 == null ? 0 : d95.hashCode())) * 31;
        Boolean bool = this.o;
        int iHashCode13 = (iHashCode12 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f27086p;
        int iHashCode14 = (iHashCode13 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f27087q;
        int iHashCode15 = (iHashCode14 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f27088r;
        return iHashCode15 + (str3 != null ? str3.hashCode() : 0);
    }

    public final long i() {
        return this.f27078b;
    }

    public final Double j() {
        return this.f27080g;
    }

    public final long k() {
        return this.f27079c;
    }

    public final Double l() {
        return this.i;
    }

    public final Double m() {
        return this.e;
    }

    public final Double n() {
        return this.f27081h;
    }

    public final Double o() {
        return this.f;
    }

    public final long p() {
        return this.f27077a;
    }

    public final Double q() {
        return this.f27084m;
    }

    public final Boolean r() {
        return this.o;
    }

    public String toString() {
        return "NetworkRequestMetrics(totalDurationMs=" + this.f27077a + ", requestBodyBytesSent=" + this.f27078b + ", responseBodyBytesReceived=" + this.f27079c + ", dnsLookupDurationMs=" + this.d + ", tcpConnectDurationMs=" + this.e + ", tlsHandshakeDurationMs=" + this.f + ", requestUploadDurationMs=" + this.f27080g + ", timeToFirstByteMs=" + this.f27081h + ", responseDownloadDurationMs=" + this.i + ", networkLatencyMs=" + this.f27082j + ", backendLatencyMs=" + this.k + ", networkPhaseMs=" + this.f27083l + ", uploadThroughputKbps=" + this.f27084m + ", downloadThroughputKbps=" + this.f27085n + ", isReusedConnection=" + this.o + ", protocolName=" + this.f27086p + ", latencyDiagnosis=" + this.f27087q + ", networkStrength=" + this.f27088r + ")";
    }

    public static /* synthetic */ bb0 a(bb0 bb0Var, long j2, long j3, long j5, Double d, Double d5, Double d6, Double d10, Double d15, Double d41, Double d51, Double d68, Double d81, Double d82, Double d95, Boolean bool, String str, String str2, String str3, int i, Object obj2) {
        String str4;
        String str5;
        long j16 = (i & 1) != 0 ? bb0Var.f27077a : j2;
        long j22 = (i & 2) != 0 ? bb0Var.f27078b : j3;
        long j42 = (i & 4) != 0 ? bb0Var.f27079c : j5;
        Double d100 = (i & 8) != 0 ? bb0Var.d : d;
        Double d101 = (i & 16) != 0 ? bb0Var.e : d5;
        Double d102 = (i & 32) != 0 ? bb0Var.f : d6;
        Double d103 = (i & 64) != 0 ? bb0Var.f27080g : d10;
        Double d104 = (i & 128) != 0 ? bb0Var.f27081h : d15;
        Double d105 = (i & 256) != 0 ? bb0Var.i : d41;
        Double d106 = (i & 512) != 0 ? bb0Var.f27082j : d51;
        Double d107 = (i & 1024) != 0 ? bb0Var.k : d68;
        long j46 = j16;
        Double d108 = (i & 2048) != 0 ? bb0Var.f27083l : d81;
        Double d109 = (i & 4096) != 0 ? bb0Var.f27084m : d82;
        Double d110 = d108;
        Double d111 = (i & 8192) != 0 ? bb0Var.f27085n : d95;
        Boolean bool2 = (i & 16384) != 0 ? bb0Var.o : bool;
        String str6 = (i & 32768) != 0 ? bb0Var.f27086p : str;
        String str7 = (i & 65536) != 0 ? bb0Var.f27087q : str2;
        if ((i & 131072) != 0) {
            str5 = str7;
            str4 = bb0Var.f27088r;
        } else {
            str4 = str3;
            str5 = str7;
        }
        return bb0Var.a(j46, j22, j42, d100, d101, d102, d103, d104, d105, d106, d107, d110, d109, d111, bool2, str6, str5, str4);
    }

    public final Double a() {
        return this.k;
    }

    public /* synthetic */ bb0(long j2, long j3, long j5, Double d, Double d5, Double d6, Double d10, Double d15, Double d41, Double d51, Double d68, Double d81, Double d82, Double d95, Boolean bool, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, (i & 2) != 0 ? 0L : j3, (i & 4) != 0 ? 0L : j5, (i & 8) != 0 ? null : d, (i & 16) != 0 ? null : d5, (i & 32) != 0 ? null : d6, (i & 64) != 0 ? null : d10, (i & 128) != 0 ? null : d15, (i & 256) != 0 ? null : d41, (i & 512) != 0 ? null : d51, (i & 1024) != 0 ? null : d68, (i & 2048) != 0 ? null : d81, (i & 4096) != 0 ? null : d82, (i & 8192) != 0 ? null : d95, (i & 16384) != 0 ? null : bool, (32768 & i) != 0 ? null : str, (65536 & i) != 0 ? null : str2, (i & 131072) != 0 ? null : str3);
    }
}
