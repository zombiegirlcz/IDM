package z5i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j8l.a f319630a;

    public b(j8l.a sourceAccountType) {
        Intrinsics.checkNotNullParameter(sourceAccountType, "sourceAccountType");
        this.f319630a = sourceAccountType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f319630a == ((b) obj2).f319630a;
    }

    public final int hashCode() {
        return this.f319630a.hashCode();
    }
}
