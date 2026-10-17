package vkh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f289942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f289943b;

    public e(String portfolioId, String str) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        this.f289942a = portfolioId;
        this.f289943b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f289942a, eVar.f289942a) && Intrinsics.f(this.f289943b, eVar.f289943b);
    }

    public final int hashCode() {
        int iHashCode = this.f289942a.hashCode() * 31;
        String str = this.f289943b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
