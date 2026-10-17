package iuf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class p implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k71.i f168575a;

    public p(k71.i result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.f168575a = result;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f168575a, ((p) obj2).f168575a);
    }

    public final int hashCode() {
        return this.f168575a.hashCode();
    }
}
