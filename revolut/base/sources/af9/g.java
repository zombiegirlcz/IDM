package af9;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3968a;

    public g(String password) {
        Intrinsics.checkNotNullParameter(password, "password");
        this.f3968a = password;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f3968a, ((g) obj2).f3968a);
    }

    public final int hashCode() {
        return this.f3968a.hashCode();
    }
}
