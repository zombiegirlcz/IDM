package m6f;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class o implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f203076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f203077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f203078c;

    public o(BigDecimal allocation, ArrayList items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(allocation, "allocation");
        this.f203076a = items;
        this.f203077b = allocation;
        this.f203078c = z;
    }

    public static o a(o oVar, boolean z) {
        ArrayList items = oVar.f203076a;
        BigDecimal allocation = oVar.f203077b;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(allocation, "allocation");
        return new o(allocation, items, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.f203076a.equals(oVar.f203076a) && Intrinsics.f(this.f203077b, oVar.f203077b) && this.f203078c == oVar.f203078c;
    }

    @Override // m6f.p
    public final BigDecimal getAllocation() {
        return this.f203077b;
    }

    @Override // m6f.p
    public final List getItems() {
        return this.f203076a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f203078c) + t61.a.d(this.f203077b, this.f203076a.hashCode() * 31, 31);
    }

    @Override // m6f.p
    public final boolean isExpanded() {
        return this.f203078c;
    }
}
