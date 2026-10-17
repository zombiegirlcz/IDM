package mel;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f204742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f204743b;

    public e0(u actual, u reference) {
        Intrinsics.checkNotNullParameter(actual, "actual");
        Intrinsics.checkNotNullParameter(reference, "reference");
        this.f204742a = actual;
        this.f204743b = reference;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return Intrinsics.f(this.f204742a, e0Var.f204742a) && Intrinsics.f(this.f204743b, e0Var.f204743b);
    }

    public final int hashCode() {
        return this.f204743b.hashCode() + (this.f204742a.hashCode() * 31);
    }
}
