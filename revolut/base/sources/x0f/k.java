package x0f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class k implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f301591a;

    public k(String baseCurrencyCode) {
        Intrinsics.checkNotNullParameter(baseCurrencyCode, "baseCurrencyCode");
        this.f301591a = baseCurrencyCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f301591a, ((k) obj2).f301591a);
    }

    public final int hashCode() {
        return this.f301591a.hashCode();
    }
}
