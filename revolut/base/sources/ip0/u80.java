package ip0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class u80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f166631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f166632b;

    public u80(String listId, int i) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f166631a = listId;
        this.f166632b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u80)) {
            return false;
        }
        u80 u80Var = (u80) obj2;
        return Intrinsics.f(this.f166631a, u80Var.f166631a) && this.f166632b == u80Var.f166632b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f166632b) + (this.f166631a.hashCode() * 31);
    }
}
