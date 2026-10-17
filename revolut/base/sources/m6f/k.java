package m6f;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class k implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f203066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f203067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f203068c;

    public k(BigDecimal allocation, ArrayList items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(allocation, "allocation");
        this.f203066a = items;
        this.f203067b = allocation;
        this.f203068c = z;
    }

    public static k a(k kVar, boolean z) {
        ArrayList items = kVar.f203066a;
        BigDecimal allocation = kVar.f203067b;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(allocation, "allocation");
        return new k(allocation, items, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f203066a.equals(kVar.f203066a) && Intrinsics.f(this.f203067b, kVar.f203067b) && this.f203068c == kVar.f203068c;
    }

    @Override // m6f.p
    public final BigDecimal getAllocation() {
        return this.f203067b;
    }

    @Override // m6f.p
    public final List getItems() {
        return this.f203066a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f203068c) + t61.a.d(this.f203067b, this.f203066a.hashCode() * 31, 31);
    }

    @Override // m6f.p
    public final boolean isExpanded() {
        return this.f203068c;
    }
}
