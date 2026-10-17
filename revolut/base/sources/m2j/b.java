package m2j;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k1j.b f202014a;

    public b(k1j.b balanceGroup) {
        Intrinsics.checkNotNullParameter(balanceGroup, "balanceGroup");
        this.f202014a = balanceGroup;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f202014a, ((b) obj2).f202014a);
    }

    public final int hashCode() {
        return this.f202014a.hashCode();
    }
}
