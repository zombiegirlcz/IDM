package ccb;

import ccb.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n extends l.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23008a;

    public n(String vaultId) {
        Intrinsics.checkNotNullParameter(vaultId, "vaultId");
        this.f23008a = vaultId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f23008a, ((n) obj2).f23008a);
    }

    public final int hashCode() {
        return this.f23008a.hashCode();
    }
}
