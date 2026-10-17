package lki;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class k implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f196464a;

    public k(j mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f196464a = mode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f196464a, ((k) obj2).f196464a);
    }

    public final int hashCode() {
        return this.f196464a.hashCode();
    }
}
