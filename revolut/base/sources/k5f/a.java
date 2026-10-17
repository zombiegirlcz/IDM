package k5f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f181498a;

    public a(String portfolioId) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        this.f181498a = portfolioId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f181498a, ((a) obj2).f181498a);
    }

    public final int hashCode() {
        return this.f181498a.hashCode();
    }
}
