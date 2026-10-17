package m6f;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class m implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f203072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f203073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f203074c;

    public m(BigDecimal allocation, ArrayList items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(allocation, "allocation");
        this.f203072a = items;
        this.f203073b = allocation;
        this.f203074c = z;
    }

    public static m a(m mVar, boolean z) {
        ArrayList items = mVar.f203072a;
        BigDecimal allocation = mVar.f203073b;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(allocation, "allocation");
        return new m(allocation, items, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f203072a.equals(mVar.f203072a) && Intrinsics.f(this.f203073b, mVar.f203073b) && this.f203074c == mVar.f203074c;
    }

    @Override // m6f.p
    public final BigDecimal getAllocation() {
        return this.f203073b;
    }

    @Override // m6f.p
    public final List getItems() {
        return this.f203072a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f203074c) + t61.a.d(this.f203073b, this.f203072a.hashCode() * 31, 31);
    }

    @Override // m6f.p
    public final boolean isExpanded() {
        return this.f203074c;
    }
}
