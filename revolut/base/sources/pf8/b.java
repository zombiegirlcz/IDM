package pf8;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f235505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f235506b;

    public b(int i, Integer num) {
        this.f235505a = i;
        this.f235506b = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f235505a == bVar.f235505a && Intrinsics.f(this.f235506b, bVar.f235506b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f235505a) * 31;
        Integer num = this.f235506b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
