package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class w0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f273123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d5 f273124b;

    public w0(String id10, d5 d5Var) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f273123a = id10;
        this.f273124b = d5Var;
    }

    public final d5 a() {
        return this.f273124b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj2;
        return Intrinsics.f(this.f273123a, w0Var.f273123a) && Intrinsics.f(this.f273124b, w0Var.f273124b);
    }

    public final int hashCode() {
        int iHashCode = this.f273123a.hashCode() * 31;
        d5 d5Var = this.f273124b;
        return iHashCode + (d5Var == null ? 0 : d5Var.hashCode());
    }
}
