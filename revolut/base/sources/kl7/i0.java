package kl7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f185337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f185338b;

    public i0(String label, Integer num) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.f185337a = label;
        this.f185338b = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj2;
        return Intrinsics.f(this.f185337a, i0Var.f185337a) && Intrinsics.f(this.f185338b, i0Var.f185338b);
    }

    public final int hashCode() {
        int iHashCode = this.f185337a.hashCode() * 31;
        Integer num = this.f185338b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
