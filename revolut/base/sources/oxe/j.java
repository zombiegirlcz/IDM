package oxe;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class j implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f230791a;

    public j(String cvv) {
        Intrinsics.checkNotNullParameter(cvv, "cvv");
        this.f230791a = cvv;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f230791a, ((j) obj2).f230791a);
    }

    public final int hashCode() {
        return this.f230791a.hashCode();
    }
}
