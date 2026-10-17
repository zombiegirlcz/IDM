package q2e;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class r extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aim.e f241615a;

    public r(aim.e tabs) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        this.f241615a = tabs;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && this.f241615a.equals(((r) obj2).f241615a);
    }

    public final int hashCode() {
        return this.f241615a.hashCode();
    }
}
