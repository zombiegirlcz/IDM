package anc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f6746b;

    public f(String portfolioId, boolean z) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        this.f6745a = portfolioId;
        this.f6746b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f6745a, fVar.f6745a) && this.f6746b == fVar.f6746b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f6746b) + (this.f6745a.hashCode() * 31);
    }
}
