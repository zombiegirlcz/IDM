package hs3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class z implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final is3.a f154978a;

    public z(is3.a reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f154978a = reason;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof z) && this.f154978a == ((z) obj2).f154978a;
    }

    public final int hashCode() {
        return this.f154978a.hashCode();
    }
}
