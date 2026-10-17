package mtg;

import aii.e;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f208825a;

    public a(String portfolioId) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        this.f208825a = portfolioId;
    }

    public final String b() {
        return this.f208825a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f208825a, ((a) obj2).f208825a);
    }

    public final int hashCode() {
        return this.f208825a.hashCode();
    }
}
