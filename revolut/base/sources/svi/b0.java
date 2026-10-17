package svi;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f265880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f265881b;

    public b0(dj0.d passPrice, List passPricePerPlan) {
        Intrinsics.checkNotNullParameter(passPrice, "passPrice");
        Intrinsics.checkNotNullParameter(passPricePerPlan, "passPricePerPlan");
        this.f265880a = passPrice;
        this.f265881b = passPricePerPlan;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return Intrinsics.f(this.f265880a, b0Var.f265880a) && Intrinsics.f(this.f265881b, b0Var.f265881b);
    }

    public final int hashCode() {
        return this.f265881b.hashCode() + (this.f265880a.hashCode() * 31);
    }
}
