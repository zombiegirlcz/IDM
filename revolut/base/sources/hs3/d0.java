package hs3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d0 implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final is3.a f154876a;

    public d0(is3.a reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f154876a = reason;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d0) && this.f154876a == ((d0) obj2).f154876a;
    }

    public final int hashCode() {
        return this.f154876a.hashCode();
    }
}
