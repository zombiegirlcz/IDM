package bxb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19651a;

    public g(String userVoucherId) {
        Intrinsics.checkNotNullParameter(userVoucherId, "userVoucherId");
        this.f19651a = userVoucherId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f19651a, ((g) obj2).f19651a);
    }

    public final int hashCode() {
        return this.f19651a.hashCode();
    }
}
