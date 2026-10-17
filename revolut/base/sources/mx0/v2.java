package mx0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class v2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f210039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f210040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f210041c;
    public final int d;

    public v2(String listId, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f210039a = listId;
        this.f210040b = i;
        this.f210041c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v2)) {
            return false;
        }
        v2 v2Var = (v2) obj2;
        return Intrinsics.f(this.f210039a, v2Var.f210039a) && this.f210040b == v2Var.f210040b && this.f210041c == v2Var.f210041c && this.d == v2Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + j6.a.b(this.f210041c, j6.a.b(this.f210040b, this.f210039a.hashCode() * 31, 31), 31);
    }
}
