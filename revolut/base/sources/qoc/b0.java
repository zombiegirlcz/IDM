package qoc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f248099a;

    public b0(String portfolioId) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        this.f248099a = portfolioId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b0) && Intrinsics.f(this.f248099a, ((b0) obj2).f248099a);
    }

    public final int hashCode() {
        return this.f248099a.hashCode();
    }
}
