package rmd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f255245b;

    public b(String walletId) {
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        this.f255245b = walletId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f255245b, ((b) obj2).f255245b);
    }

    public final int hashCode() {
        return this.f255245b.hashCode();
    }
}
