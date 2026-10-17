package pk6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ho3.a f236930a;

    public g(ho3.a branch) {
        Intrinsics.checkNotNullParameter(branch, "branch");
        this.f236930a = branch;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f236930a, ((g) obj2).f236930a);
    }

    public final int hashCode() {
        return this.f236930a.hashCode();
    }
}
