package zvd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f325662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f325663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f325664c;

    public c(long j2, String requestId, String stakingPocketId) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(stakingPocketId, "stakingPocketId");
        this.f325662a = j2;
        this.f325663b = requestId;
        this.f325664c = stakingPocketId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f325662a == cVar.f325662a && Intrinsics.f(this.f325663b, cVar.f325663b) && Intrinsics.f(this.f325664c, cVar.f325664c);
    }

    public final int hashCode() {
        return this.f325664c.hashCode() + p.a.c(Long.hashCode(this.f325662a) * 31, 31, this.f325663b);
    }
}
