package wph;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class o implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f299335a;

    public o(String updatedScreenerId) {
        Intrinsics.checkNotNullParameter(updatedScreenerId, "updatedScreenerId");
        this.f299335a = updatedScreenerId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f299335a, ((o) obj2).f299335a);
    }

    public final int hashCode() {
        return this.f299335a.hashCode();
    }
}
