package oo0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f226990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d70.c f226991b;

    public m(long j2, d70.c amplitudes) {
        Intrinsics.checkNotNullParameter(amplitudes, "amplitudes");
        this.f226990a = j2;
        this.f226991b = amplitudes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f226990a == mVar.f226990a && this.f226991b.equals(mVar.f226991b);
    }

    public final int hashCode() {
        return this.f226991b.hashCode() + (Long.hashCode(this.f226990a) * 31);
    }
}
