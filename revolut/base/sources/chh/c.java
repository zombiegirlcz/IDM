package chh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24232a;

    public c(String juniorId) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        this.f24232a = juniorId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f24232a, ((c) obj2).f24232a);
    }

    public final int hashCode() {
        return this.f24232a.hashCode();
    }
}
