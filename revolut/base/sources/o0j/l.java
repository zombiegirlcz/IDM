package o0j;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class l extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f221242a;

    public l(String password) {
        Intrinsics.checkNotNullParameter(password, "password");
        this.f221242a = password;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f221242a, ((l) obj2).f221242a);
    }

    public final int hashCode() {
        return this.f221242a.hashCode();
    }
}
