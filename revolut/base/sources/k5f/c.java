package k5f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f181501a;

    public c(String portfolioId) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        this.f181501a = portfolioId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f181501a, ((c) obj2).f181501a);
    }

    public final int hashCode() {
        return this.f181501a.hashCode();
    }
}
