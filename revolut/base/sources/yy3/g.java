package yy3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f317771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f317772b;

    public g(String oneTimePassword, long j2) {
        Intrinsics.checkNotNullParameter(oneTimePassword, "oneTimePassword");
        this.f317771a = oneTimePassword;
        this.f317772b = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f317771a, gVar.f317771a) && this.f317772b == gVar.f317772b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f317772b) + (this.f317771a.hashCode() * 31);
    }
}
