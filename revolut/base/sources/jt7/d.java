package jt7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ps7.b f178419a;

    public d(ps7.b action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f178419a = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f178419a == ((d) obj2).f178419a;
    }

    public final int hashCode() {
        return this.f178419a.hashCode();
    }
}
