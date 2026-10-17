package zl4;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f323184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f323185b;

    public h(String previous, String selected) {
        Intrinsics.checkNotNullParameter(previous, "previous");
        Intrinsics.checkNotNullParameter(selected, "selected");
        this.f323184a = previous;
        this.f323185b = selected;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f323184a, hVar.f323184a) && Intrinsics.f(this.f323185b, hVar.f323185b);
    }

    public final int hashCode() {
        return this.f323185b.hashCode() + (this.f323184a.hashCode() * 31);
    }
}
