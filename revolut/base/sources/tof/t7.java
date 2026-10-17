package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class t7 extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f273090a;

    public t7(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        this.f273090a = email;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t7) && Intrinsics.f(this.f273090a, ((t7) obj2).f273090a);
    }

    public final String getEmail() {
        return this.f273090a;
    }

    public final int hashCode() {
        return this.f273090a.hashCode();
    }
}
