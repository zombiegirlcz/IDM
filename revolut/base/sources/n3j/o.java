package n3j;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final do3.n f212149a;

    public o(do3.n user) {
        Intrinsics.checkNotNullParameter(user, "user");
        this.f212149a = user;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f212149a, ((o) obj2).f212149a);
    }

    public final int hashCode() {
        return this.f212149a.hashCode();
    }
}
