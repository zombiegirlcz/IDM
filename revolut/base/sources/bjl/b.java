package bjl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16158a;

    public b(String authenticationId) {
        Intrinsics.checkNotNullParameter(authenticationId, "authenticationId");
        this.f16158a = authenticationId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f16158a, ((b) obj2).f16158a);
    }

    public final int hashCode() {
        return this.f16158a.hashCode();
    }
}
