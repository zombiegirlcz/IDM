package pcd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class l extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f234871a;

    public l(String juniorId) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        this.f234871a = juniorId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f234871a, ((l) obj2).f234871a);
    }

    public final int hashCode() {
        return this.f234871a.hashCode();
    }
}
