package hha;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f152297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f152298b;

    public d0(String planId, boolean z) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        this.f152297a = planId;
        this.f152298b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.f152297a, d0Var.f152297a) && this.f152298b == d0Var.f152298b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f152298b) + (this.f152297a.hashCode() * 31);
    }
}
