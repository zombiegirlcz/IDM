package pck;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f234929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f234930b;

    public i(String username, h reason) {
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f234929a = username;
        this.f234930b = reason;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f234929a, iVar.f234929a) && this.f234930b == iVar.f234930b;
    }

    public final int hashCode() {
        return this.f234930b.hashCode() + (this.f234929a.hashCode() * 31);
    }
}
