package r58;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f251546a;

    public d(String juniorCode) {
        Intrinsics.checkNotNullParameter(juniorCode, "juniorCode");
        this.f251546a = juniorCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f251546a, ((d) obj2).f251546a);
    }

    public final int hashCode() {
        return this.f251546a.hashCode();
    }
}
