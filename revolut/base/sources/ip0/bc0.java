package ip0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class bc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f163580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f163581b;

    public bc0(l4 l4Var, boolean z) {
        this.f163580a = l4Var;
        this.f163581b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof bc0)) {
            return false;
        }
        bc0 bc0Var = (bc0) obj2;
        return Intrinsics.f(this.f163580a, bc0Var.f163580a) && this.f163581b == bc0Var.f163581b;
    }

    public final int hashCode() {
        Object obj2 = this.f163580a;
        return Boolean.hashCode(this.f163581b) + ((obj2 == null ? 0 : obj2.hashCode()) * 31);
    }
}
