package o97;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f223125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f223126b;

    public p(boolean z, Integer num) {
        this.f223125a = z;
        this.f223126b = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return this.f223125a == pVar.f223125a && Intrinsics.f(this.f223126b, pVar.f223126b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f223125a) * 31;
        Integer num = this.f223126b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
