package yfe;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f313247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f313248b;

    public d1(x0 iconGroup, boolean z) {
        Intrinsics.checkNotNullParameter(iconGroup, "iconGroup");
        this.f313247a = iconGroup;
        this.f313248b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj2;
        return Intrinsics.f(this.f313247a, d1Var.f313247a) && this.f313248b == d1Var.f313248b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f313248b) + (this.f313247a.hashCode() * 31);
    }
}
