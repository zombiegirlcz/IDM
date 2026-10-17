package y2h;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f310663a;

    public b(String securityRef) {
        Intrinsics.checkNotNullParameter(securityRef, "securityRef");
        this.f310663a = securityRef;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f310663a, ((b) obj2).f310663a);
    }

    public final int hashCode() {
        return this.f310663a.hashCode();
    }
}
