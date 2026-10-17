package lf7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f194656a;

    public b(k reward) {
        Intrinsics.checkNotNullParameter(reward, "reward");
        this.f194656a = reward;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f194656a, ((b) obj2).f194656a);
    }

    public final int hashCode() {
        return this.f194656a.hashCode();
    }
}
