package m1c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f201466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f201467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f201468c;

    public v1(String id10, boolean z, int i) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f201466a = id10;
        this.f201467b = z;
        this.f201468c = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v1)) {
            return false;
        }
        v1 v1Var = (v1) obj2;
        return Intrinsics.f(this.f201466a, v1Var.f201466a) && this.f201467b == v1Var.f201467b && this.f201468c == v1Var.f201468c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f201468c) + j6.a.c(this.f201466a.hashCode() * 31, 31, this.f201467b);
    }
}
