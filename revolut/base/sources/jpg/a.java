package jpg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f177272a;

    public a(String vaultId) {
        Intrinsics.checkNotNullParameter(vaultId, "vaultId");
        this.f177272a = vaultId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f177272a, ((a) obj2).f177272a);
    }

    public final int hashCode() {
        return this.f177272a.hashCode();
    }
}
