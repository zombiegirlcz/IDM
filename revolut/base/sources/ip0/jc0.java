package ip0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class jc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final koi.j f164813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f164814b;

    public jc0(koi.j item, boolean z) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f164813a = item;
        this.f164814b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof jc0)) {
            return false;
        }
        jc0 jc0Var = (jc0) obj2;
        return Intrinsics.f(this.f164813a, jc0Var.f164813a) && this.f164814b == jc0Var.f164814b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f164814b) + (this.f164813a.hashCode() * 31);
    }
}
