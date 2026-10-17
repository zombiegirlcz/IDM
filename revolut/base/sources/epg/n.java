package epg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class n implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f128185a;

    public n(String username) {
        Intrinsics.checkNotNullParameter(username, "username");
        this.f128185a = username;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f128185a, ((n) obj2).f128185a);
    }

    public final int hashCode() {
        return this.f128185a.hashCode();
    }
}
