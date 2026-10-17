package ts7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f274045a;

    public d(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        this.f274045a = email;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f274045a, ((d) obj2).f274045a);
    }

    public final int hashCode() {
        return this.f274045a.hashCode();
    }
}
