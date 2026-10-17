package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
final class mf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f31177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f31178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f31179c;

    public mf(double d, double d5, String diagnosis) {
        Intrinsics.checkNotNullParameter(diagnosis, "diagnosis");
        this.f31177a = d;
        this.f31178b = d5;
        this.f31179c = diagnosis;
    }

    public final double a() {
        return this.f31177a;
    }

    public final double b() {
        return this.f31178b;
    }

    public final String c() {
        return this.f31179c;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof mf)) {
            return false;
        }
        mf mfVar = (mf) obj2;
        return Double.compare(this.f31177a, mfVar.f31177a) == 0 && Double.compare(this.f31178b, mfVar.f31178b) == 0 && Intrinsics.f(this.f31179c, mfVar.f31179c);
    }

    public int hashCode() {
        return (((Double.hashCode(this.f31177a) * 31) + Double.hashCode(this.f31178b)) * 31) + this.f31179c.hashCode();
    }

    public String toString() {
        return "DiagnosisResult(networkTime=" + this.f31177a + ", serverTime=" + this.f31178b + ", diagnosis=" + this.f31179c + ")";
    }
}
