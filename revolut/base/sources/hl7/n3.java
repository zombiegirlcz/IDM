package hl7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class n3 {

    @NotNull
    public static final m3 Companion = new m3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v5 f153223b;

    public /* synthetic */ n3(int i, String str, v5 v5Var) {
        if (3 != (i & 3)) {
            qlm.j1.f(l3.f153184a.getDescriptor(), i, 3);
            throw null;
        }
        this.f153222a = str;
        this.f153223b = v5Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n3)) {
            return false;
        }
        n3 n3Var = (n3) obj2;
        return Intrinsics.f(this.f153222a, n3Var.f153222a) && Intrinsics.f(this.f153223b, n3Var.f153223b);
    }

    public final int hashCode() {
        int iHashCode = this.f153222a.hashCode() * 31;
        v5 v5Var = this.f153223b;
        return iHashCode + (v5Var == null ? 0 : v5Var.hashCode());
    }

    public n3(String status, v5 v5Var) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f153222a = status;
        this.f153223b = v5Var;
    }
}
