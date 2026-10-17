package d7j;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f112051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r0 f112052b;

    public s0(List rates, r0 params) {
        Intrinsics.checkNotNullParameter(rates, "rates");
        Intrinsics.checkNotNullParameter(params, "params");
        this.f112051a = rates;
        this.f112052b = params;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj2;
        return Intrinsics.f(this.f112051a, s0Var.f112051a) && Intrinsics.f(this.f112052b, s0Var.f112052b);
    }

    public final int hashCode() {
        return this.f112052b.hashCode() + (this.f112051a.hashCode() * 31);
    }
}
