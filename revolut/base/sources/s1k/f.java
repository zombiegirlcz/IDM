package s1k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f259151a;

    public f(String vaultId) {
        Intrinsics.checkNotNullParameter(vaultId, "vaultId");
        this.f259151a = vaultId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f259151a, ((f) obj2).f259151a);
    }

    public final int hashCode() {
        return this.f259151a.hashCode();
    }
}
