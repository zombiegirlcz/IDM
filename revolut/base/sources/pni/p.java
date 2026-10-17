package pni;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class p implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f237821a;

    public p(List otpMethods) {
        Intrinsics.checkNotNullParameter(otpMethods, "otpMethods");
        this.f237821a = otpMethods;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f237821a, ((p) obj2).f237821a);
    }

    public final int hashCode() {
        return this.f237821a.hashCode();
    }
}
