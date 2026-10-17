package y58;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f311001a;

    public b(String juniorId) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        this.f311001a = juniorId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f311001a, ((b) obj2).f311001a);
    }

    public final int hashCode() {
        return this.f311001a.hashCode();
    }
}
