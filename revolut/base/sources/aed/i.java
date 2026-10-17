package aed;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pcd.b f3537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3538b;

    public i(pcd.b accountType, String currentUserId) {
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(currentUserId, "currentUserId");
        this.f3537a = accountType;
        this.f3538b = currentUserId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f3537a == iVar.f3537a && Intrinsics.f(this.f3538b, iVar.f3538b);
    }

    public final int hashCode() {
        return this.f3538b.hashCode() + (this.f3537a.hashCode() * 31);
    }
}
