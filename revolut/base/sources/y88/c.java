package y88;

import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f311636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f311637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SavingsProductData f311638c;
    public final wi0.b d;

    public c(dj0.d dVar, boolean z, SavingsProductData savingsProductData, wi0.b bVar) {
        this.f311636a = dVar;
        this.f311637b = z;
        this.f311638c = savingsProductData;
        this.d = bVar;
    }

    @Override // y88.d
    public final dj0.d a() {
        return this.f311636a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f311636a, cVar.f311636a) && this.f311637b == cVar.f311637b && Intrinsics.f(this.f311638c, cVar.f311638c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        dj0.d dVar = this.f311636a;
        int iC = j6.a.c((dVar == null ? 0 : dVar.hashCode()) * 31, 31, this.f311637b);
        SavingsProductData savingsProductData = this.f311638c;
        int iHashCode = (iC + (savingsProductData == null ? 0 : savingsProductData.hashCode())) * 31;
        wi0.b bVar = this.d;
        return iHashCode + (bVar != null ? bVar.f297794a.hashCode() : 0);
    }
}
