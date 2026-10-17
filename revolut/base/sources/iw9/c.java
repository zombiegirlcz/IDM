package iw9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f169000a;

    public c(String username) {
        Intrinsics.checkNotNullParameter(username, "username");
        this.f169000a = username;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f169000a, ((c) obj2).f169000a);
    }

    public final int hashCode() {
        return this.f169000a.hashCode();
    }
}
