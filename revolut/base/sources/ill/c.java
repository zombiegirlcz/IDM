package ill;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jkl.i f162264a;

    public c(jkl.i authenticationMethod) {
        Intrinsics.checkNotNullParameter(authenticationMethod, "authenticationMethod");
        this.f162264a = authenticationMethod;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f162264a == ((c) obj2).f162264a;
    }

    public final int hashCode() {
        return this.f162264a.hashCode();
    }
}
