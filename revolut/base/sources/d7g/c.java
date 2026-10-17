package d7g;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r7g.g f111962a;

    public c(r7g.g selectedSort) {
        Intrinsics.checkNotNullParameter(selectedSort, "selectedSort");
        this.f111962a = selectedSort;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f111962a == ((c) obj2).f111962a;
    }

    public final int hashCode() {
        return this.f111962a.hashCode();
    }
}
