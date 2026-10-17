package ml;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class k extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f206533a;

    public k(j reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f206533a = reason;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && this.f206533a == ((k) obj2).f206533a;
    }

    public final int hashCode() {
        return this.f206533a.hashCode();
    }

    public final String toString() {
        return "Exit(reason=" + this.f206533a + ")";
    }
}
