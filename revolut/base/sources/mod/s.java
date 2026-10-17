package mod;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class s extends u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f207634b;

    public s(String walletId) {
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        this.f207634b = walletId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && Intrinsics.f(this.f207634b, ((s) obj2).f207634b);
    }

    public final int hashCode() {
        return this.f207634b.hashCode();
    }
}
