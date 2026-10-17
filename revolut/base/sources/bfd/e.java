package bfd;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mgd.f f14963a;

    public e(mgd.f selected) {
        Intrinsics.checkNotNullParameter(selected, "selected");
        this.f14963a = selected;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f14963a == ((e) obj2).f14963a;
    }

    public final int hashCode() {
        return this.f14963a.hashCode();
    }
}
