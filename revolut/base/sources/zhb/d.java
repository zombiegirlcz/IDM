package zhb;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f322384a;

    public d(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        this.f322384a = email;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f322384a, ((d) obj2).f322384a);
    }

    public final int hashCode() {
        return this.f322384a.hashCode();
    }
}
