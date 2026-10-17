package dda;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f113190b;

    public n(String title, q action) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f113189a = title;
        this.f113190b = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f113189a, nVar.f113189a) && Intrinsics.f(this.f113190b, nVar.f113190b);
    }

    public final int hashCode() {
        return this.f113190b.hashCode() + (this.f113189a.hashCode() * 31);
    }
}
