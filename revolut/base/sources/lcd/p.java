package lcd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class p implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f193867a;

    public p(String juniorId) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        this.f193867a = juniorId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f193867a, ((p) obj2).f193867a);
    }

    public final int hashCode() {
        return this.f193867a.hashCode();
    }
}
