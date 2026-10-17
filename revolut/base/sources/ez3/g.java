package ez3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f130895a;

    public g(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        this.f130895a = email;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f130895a, ((g) obj2).f130895a);
    }

    public final int hashCode() {
        return this.f130895a.hashCode();
    }
}
