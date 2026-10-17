package y20;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d1 implements e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f310484a;

    public d1(String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f310484a = reason;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d1) && Intrinsics.f(this.f310484a, ((d1) obj2).f310484a);
    }

    public final int hashCode() {
        return this.f310484a.hashCode();
    }
}
