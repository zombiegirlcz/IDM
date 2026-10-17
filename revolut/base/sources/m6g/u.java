package m6g;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f203115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f203116b;

    public u(int i, Integer num) {
        this.f203115a = i;
        this.f203116b = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return this.f203115a == uVar.f203115a && Intrinsics.f(this.f203116b, uVar.f203116b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f203115a) * 31;
        Integer num = this.f203116b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
