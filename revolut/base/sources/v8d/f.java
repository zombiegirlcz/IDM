package v8d;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f286736a;

    public f(String rootFaqKey) {
        Intrinsics.checkNotNullParameter(rootFaqKey, "rootFaqKey");
        this.f286736a = rootFaqKey;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f286736a, ((f) obj2).f286736a);
    }

    public final int hashCode() {
        return this.f286736a.hashCode();
    }
}
