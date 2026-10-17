package eec;

import kotlin.jvm.internal.Intrinsics;
import u6c.z;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f125168a;

    public d(z usageCheckCondition) {
        Intrinsics.checkNotNullParameter(usageCheckCondition, "usageCheckCondition");
        this.f125168a = usageCheckCondition;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f125168a == ((d) obj2).f125168a;
    }

    public final int hashCode() {
        return this.f125168a.hashCode();
    }
}
