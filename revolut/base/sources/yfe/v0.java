package yfe;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class v0 extends x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0 f313312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u0 f313313b;

    public v0(y0 leadingIcon, u0 trailingItem) {
        Intrinsics.checkNotNullParameter(leadingIcon, "leadingIcon");
        Intrinsics.checkNotNullParameter(trailingItem, "trailingItem");
        this.f313312a = leadingIcon;
        this.f313313b = trailingItem;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj2;
        return Intrinsics.f(this.f313312a, v0Var.f313312a) && Intrinsics.f(this.f313313b, v0Var.f313313b);
    }

    public final int hashCode() {
        return this.f313313b.hashCode() + (this.f313312a.hashCode() * 31);
    }
}
