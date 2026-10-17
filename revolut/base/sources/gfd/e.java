package gfd;

import aii.r;
import kotlin.jvm.internal.Intrinsics;
import ogd.k;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f143392a;

    public e(k selected) {
        Intrinsics.checkNotNullParameter(selected, "selected");
        this.f143392a = selected;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f143392a, ((e) obj2).f143392a);
    }

    public final int hashCode() {
        return this.f143392a.hashCode();
    }
}
