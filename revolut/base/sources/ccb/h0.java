package ccb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h0 extends f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22989a;

    public h0(String vaultId) {
        Intrinsics.checkNotNullParameter(vaultId, "vaultId");
        this.f22989a = vaultId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h0) && Intrinsics.f(this.f22989a, ((h0) obj2).f22989a);
    }

    public final int hashCode() {
        return this.f22989a.hashCode();
    }
}
