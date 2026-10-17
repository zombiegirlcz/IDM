package ip0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class pm implements tm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final an f165851a;

    public pm() {
        this(an.ITEMS_ONLY);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof pm) && this.f165851a == ((pm) obj2).f165851a;
    }

    public final int hashCode() {
        return this.f165851a.hashCode();
    }

    public pm(an scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f165851a = scope;
    }
}
