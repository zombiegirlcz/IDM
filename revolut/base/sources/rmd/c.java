package rmd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f255246b;

    public c(String walletId) {
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        this.f255246b = walletId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f255246b, ((c) obj2).f255246b);
    }

    public final int hashCode() {
        return this.f255246b.hashCode();
    }
}
