package d0j;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f110385a;

    public d0(String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.f110385a = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d0) && Intrinsics.f(this.f110385a, ((d0) obj2).f110385a);
    }

    public final int hashCode() {
        return this.f110385a.hashCode();
    }
}
