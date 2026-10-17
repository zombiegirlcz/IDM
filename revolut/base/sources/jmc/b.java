package jmc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f176523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f176524b;

    public b(String portfolioId, boolean z) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        this.f176523a = portfolioId;
        this.f176524b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f176523a, bVar.f176523a) && this.f176524b == bVar.f176524b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f176524b) + (this.f176523a.hashCode() * 31);
    }
}
