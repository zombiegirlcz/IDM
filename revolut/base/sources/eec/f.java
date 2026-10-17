package eec;

import kotlin.jvm.internal.Intrinsics;
import u6c.z;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f125170a;

    public f(z usageCheckCondition) {
        Intrinsics.checkNotNullParameter(usageCheckCondition, "usageCheckCondition");
        this.f125170a = usageCheckCondition;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f125170a == ((f) obj2).f125170a;
    }

    public final int hashCode() {
        return this.f125170a.hashCode();
    }
}
