package m6f;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class l implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f203069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f203070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f203071c;

    public l(BigDecimal allocation, ArrayList items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(allocation, "allocation");
        this.f203069a = items;
        this.f203070b = allocation;
        this.f203071c = z;
    }

    public static l a(l lVar, boolean z) {
        ArrayList items = lVar.f203069a;
        BigDecimal allocation = lVar.f203070b;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(allocation, "allocation");
        return new l(allocation, items, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f203069a.equals(lVar.f203069a) && Intrinsics.f(this.f203070b, lVar.f203070b) && this.f203071c == lVar.f203071c;
    }

    @Override // m6f.p
    public final BigDecimal getAllocation() {
        return this.f203070b;
    }

    @Override // m6f.p
    public final List getItems() {
        return this.f203069a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f203071c) + t61.a.d(this.f203070b, this.f203069a.hashCode() * 31, 31);
    }

    @Override // m6f.p
    public final boolean isExpanded() {
        return this.f203071c;
    }
}
