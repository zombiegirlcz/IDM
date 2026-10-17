package dz7;

import kotlin.jvm.internal.Intrinsics;
import zw7.d0;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f121270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f121271b;

    public d(d0 d0Var, dj0.d amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f121270a = d0Var;
        this.f121271b = amount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f121270a, dVar.f121270a) && Intrinsics.f(this.f121271b, dVar.f121271b);
    }

    public final int hashCode() {
        d0 d0Var = this.f121270a;
        return this.f121271b.hashCode() + ((d0Var == null ? 0 : d0Var.hashCode()) * 31);
    }
}
