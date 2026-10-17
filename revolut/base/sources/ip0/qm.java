package ip0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class qm implements tm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final an f166015a;

    public qm() {
        this(an.ITEMS_ONLY);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof qm) && this.f166015a == ((qm) obj2).f166015a;
    }

    public final int hashCode() {
        return this.f166015a.hashCode();
    }

    public qm(an scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f166015a = scope;
    }
}
