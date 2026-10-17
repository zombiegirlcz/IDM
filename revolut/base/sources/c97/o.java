package c97;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f22338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f22339b;

    public o(boolean z, Integer num) {
        this.f22338a = z;
        this.f22339b = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.f22338a == oVar.f22338a && Intrinsics.f(this.f22339b, oVar.f22339b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f22338a) * 31;
        Integer num = this.f22339b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
