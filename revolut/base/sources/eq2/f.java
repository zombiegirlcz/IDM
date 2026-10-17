package eq2;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wn2.a f128228a;

    public f(wn2.a selection) {
        Intrinsics.checkNotNullParameter(selection, "selection");
        this.f128228a = selection;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f128228a == ((f) obj2).f128228a;
    }

    public final int hashCode() {
        return this.f128228a.hashCode();
    }
}
