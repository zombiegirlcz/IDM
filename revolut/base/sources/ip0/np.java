package ip0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class np implements qp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mp f165556a;

    public np() {
        this(lp.f165247a);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof np) && Intrinsics.f(this.f165556a, ((np) obj2).f165556a);
    }

    public final int hashCode() {
        return this.f165556a.hashCode();
    }

    public np(mp justifyContent) {
        Intrinsics.checkNotNullParameter(justifyContent, "justifyContent");
        this.f165556a = justifyContent;
    }
}
