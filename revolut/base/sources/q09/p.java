package q09;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class p implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f241207a;

    public p(k data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f241207a = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f241207a, ((p) obj2).f241207a);
    }

    public final int hashCode() {
        return this.f241207a.hashCode();
    }
}
