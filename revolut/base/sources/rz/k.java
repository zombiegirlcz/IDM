package rz;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f258450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f258451b;

    public k(j text, Integer num) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f258450a = text;
        this.f258451b = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f258450a, kVar.f258450a) && Intrinsics.f(this.f258451b, kVar.f258451b);
    }

    public final int hashCode() {
        int iHashCode = this.f258450a.hashCode() * 31;
        Integer num = this.f258451b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
