package ip0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class sm implements tm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final an f166367a;

    public sm() {
        this(an.ITEMS_ONLY);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof sm) && this.f166367a == ((sm) obj2).f166367a;
    }

    public final int hashCode() {
        return this.f166367a.hashCode();
    }

    public sm(an scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f166367a = scope;
    }
}
