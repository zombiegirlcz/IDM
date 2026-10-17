package pni;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class q implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f237822a;

    public q(String otp) {
        Intrinsics.checkNotNullParameter(otp, "otp");
        this.f237822a = otp;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f237822a, ((q) obj2).f237822a);
    }

    public final int hashCode() {
        return this.f237822a.hashCode();
    }
}
