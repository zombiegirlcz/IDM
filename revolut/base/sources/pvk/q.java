package pvk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class q implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f240302a;

    public q(e0 selectedSection) {
        Intrinsics.checkNotNullParameter(selectedSection, "selectedSection");
        this.f240302a = selectedSection;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f240302a, ((q) obj2).f240302a);
    }

    public final int hashCode() {
        return this.f240302a.hashCode();
    }
}
