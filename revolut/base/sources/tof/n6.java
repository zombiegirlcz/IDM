package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class n6 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l6 f272950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l6 f272951b;

    public n6(l6 grossAmount, l6 tax) {
        Intrinsics.checkNotNullParameter(grossAmount, "grossAmount");
        Intrinsics.checkNotNullParameter(tax, "tax");
        this.f272950a = grossAmount;
        this.f272951b = tax;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n6)) {
            return false;
        }
        n6 n6Var = (n6) obj2;
        return Intrinsics.f(this.f272950a, n6Var.f272950a) && Intrinsics.f(this.f272951b, n6Var.f272951b);
    }

    public final int hashCode() {
        return this.f272951b.hashCode() + (this.f272950a.hashCode() * 31);
    }
}
