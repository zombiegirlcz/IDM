package rn6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ho3.a f255507a;

    public e(ho3.a branch) {
        Intrinsics.checkNotNullParameter(branch, "branch");
        this.f255507a = branch;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f255507a, ((e) obj2).f255507a);
    }

    public final int hashCode() {
        return this.f255507a.hashCode();
    }
}
