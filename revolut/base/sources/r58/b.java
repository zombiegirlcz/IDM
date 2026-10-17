package r58;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f251540a;

    public b(String juniorCode) {
        Intrinsics.checkNotNullParameter(juniorCode, "juniorCode");
        this.f251540a = juniorCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f251540a, ((b) obj2).f251540a);
    }

    public final int hashCode() {
        return this.f251540a.hashCode();
    }
}
