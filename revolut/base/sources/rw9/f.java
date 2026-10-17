package rw9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements xo9.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f257858a;

    public f(String username) {
        Intrinsics.checkNotNullParameter(username, "username");
        this.f257858a = username;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f257858a, ((f) obj2).f257858a);
    }

    public final int hashCode() {
        return this.f257858a.hashCode();
    }
}
