package r6f;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f251829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f251830b;

    public e() {
        this(0);
    }

    public static e a(e eVar, Data product, Data riskMetrics, int i) {
        if ((i & 1) != 0) {
            product = eVar.f251829a;
        }
        if ((i & 2) != 0) {
            riskMetrics = eVar.f251830b;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(riskMetrics, "riskMetrics");
        return new e(product, riskMetrics);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f251829a, eVar.f251829a) && Intrinsics.f(this.f251830b, eVar.f251830b);
    }

    public final int hashCode() {
        return this.f251830b.hashCode() + (this.f251829a.hashCode() * 31);
    }

    public e(Data product, Data riskMetrics) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(riskMetrics, "riskMetrics");
        this.f251829a = product;
        this.f251830b = riskMetrics;
    }

    public /* synthetic */ e(int i) {
        this(new Data(null, null, false, 7, null), new Data(null, null, false, 7, null));
    }
}
