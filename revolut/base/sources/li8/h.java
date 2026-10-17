package li8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f195431a;

    public h(String firstName) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        this.f195431a = firstName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f195431a, ((h) obj2).f195431a);
    }

    public final int hashCode() {
        return this.f195431a.hashCode();
    }
}
