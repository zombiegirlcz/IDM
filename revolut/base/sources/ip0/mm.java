package ip0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class mm implements tm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final an f165399a;

    public mm() {
        this(an.ITEMS_ONLY);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof mm) && this.f165399a == ((mm) obj2).f165399a;
    }

    public final int hashCode() {
        return this.f165399a.hashCode();
    }

    public mm(an scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f165399a = scope;
    }
}
