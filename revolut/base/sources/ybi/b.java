package ybi;

import aii.r;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f312372a;

    public b(List purposes) {
        Intrinsics.checkNotNullParameter(purposes, "purposes");
        this.f312372a = purposes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f312372a, ((b) obj2).f312372a);
    }

    public final int hashCode() {
        return this.f312372a.hashCode();
    }
}
