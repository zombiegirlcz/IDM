package r84;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pu3.b f252357a;

    public f(pu3.b debt) {
        Intrinsics.checkNotNullParameter(debt, "debt");
        this.f252357a = debt;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f252357a, ((f) obj2).f252357a);
    }

    public final int hashCode() {
        return this.f252357a.hashCode();
    }
}
