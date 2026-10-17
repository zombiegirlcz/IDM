package h6e;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f149643a;

    public g(String juniorId) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        this.f149643a = juniorId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f149643a, ((g) obj2).f149643a);
    }

    public final int hashCode() {
        return this.f149643a.hashCode();
    }
}
