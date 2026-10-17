package iwg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f169086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f169087b;

    public b(List calculationMethods, c initialCalculationMethod) {
        Intrinsics.checkNotNullParameter(calculationMethods, "calculationMethods");
        Intrinsics.checkNotNullParameter(initialCalculationMethod, "initialCalculationMethod");
        this.f169086a = calculationMethods;
        this.f169087b = initialCalculationMethod;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f169086a, bVar.f169086a) && this.f169087b == bVar.f169087b;
    }

    public final int hashCode() {
        return this.f169087b.hashCode() + (this.f169086a.hashCode() * 31);
    }
}
