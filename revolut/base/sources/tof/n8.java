package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class n8 extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272952a;

    public n8(String username) {
        Intrinsics.checkNotNullParameter(username, "username");
        this.f272952a = username;
    }

    public final String N0() {
        return this.f272952a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n8) && Intrinsics.f(this.f272952a, ((n8) obj2).f272952a);
    }

    public final int hashCode() {
        return this.f272952a.hashCode();
    }
}
