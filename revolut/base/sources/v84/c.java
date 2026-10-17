package v84;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pu3.b f286709a;

    public c(pu3.b debt) {
        Intrinsics.checkNotNullParameter(debt, "debt");
        this.f286709a = debt;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f286709a, ((c) obj2).f286709a);
    }

    public final int hashCode() {
        return this.f286709a.hashCode();
    }
}
