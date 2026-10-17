package o0j;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class o extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f221245a;

    public o(String username) {
        Intrinsics.checkNotNullParameter(username, "username");
        this.f221245a = username;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f221245a, ((o) obj2).f221245a);
    }

    public final int hashCode() {
        return this.f221245a.hashCode();
    }
}
