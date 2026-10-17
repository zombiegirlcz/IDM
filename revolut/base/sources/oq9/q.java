package oq9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class q extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f227850a;

    public q(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        this.f227850a = email;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f227850a, ((q) obj2).f227850a);
    }

    public final int hashCode() {
        return this.f227850a.hashCode();
    }
}
