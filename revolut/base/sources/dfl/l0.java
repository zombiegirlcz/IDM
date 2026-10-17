package dfl;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class l0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0 f114426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f114427b;

    public l0(m0 type, dj0.d amount) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f114426a = type;
        this.f114427b = amount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj2;
        return this.f114426a == l0Var.f114426a && Intrinsics.f(this.f114427b, l0Var.f114427b);
    }

    public final int hashCode() {
        return this.f114427b.hashCode() + (this.f114426a.hashCode() * 31);
    }
}
