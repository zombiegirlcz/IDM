package ip0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h90 implements d90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f164522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f164523b;

    public h90(List items, Integer num) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f164522a = items;
        this.f164523b = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h90)) {
            return false;
        }
        h90 h90Var = (h90) obj2;
        return Intrinsics.f(this.f164522a, h90Var.f164522a) && Intrinsics.f(this.f164523b, h90Var.f164523b);
    }

    @Override // ip0.d90
    public final List getItems() {
        return this.f164522a;
    }

    public final int hashCode() {
        int iHashCode = this.f164522a.hashCode() * 31;
        Integer num = this.f164523b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
