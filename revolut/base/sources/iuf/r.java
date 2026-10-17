package iuf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n61.d f168576a;

    public r(n61.d bankInformation) {
        Intrinsics.checkNotNullParameter(bankInformation, "bankInformation");
        this.f168576a = bankInformation;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && Intrinsics.f(this.f168576a, ((r) obj2).f168576a);
    }

    public final int hashCode() {
        return this.f168576a.hashCode();
    }
}
