package ip0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class j90 implements d90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f164806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f164807b;

    public j90(List items, Integer num) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f164806a = items;
        this.f164807b = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j90)) {
            return false;
        }
        j90 j90Var = (j90) obj2;
        return Intrinsics.f(this.f164806a, j90Var.f164806a) && Intrinsics.f(this.f164807b, j90Var.f164807b);
    }

    @Override // ip0.d90
    public final List getItems() {
        return this.f164806a;
    }

    public final int hashCode() {
        int iHashCode = this.f164806a.hashCode() * 31;
        Integer num = this.f164807b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
