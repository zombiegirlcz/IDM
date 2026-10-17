package amd;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f6332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f6333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f6334c;
    public final boolean d;
    public final k e;

    public j(b netWorthGroupType, List netWorthProductGroups, List extraItems, boolean z, k kVar) {
        Intrinsics.checkNotNullParameter(netWorthGroupType, "netWorthGroupType");
        Intrinsics.checkNotNullParameter(netWorthProductGroups, "netWorthProductGroups");
        Intrinsics.checkNotNullParameter(extraItems, "extraItems");
        this.f6332a = netWorthGroupType;
        this.f6333b = netWorthProductGroups;
        this.f6334c = extraItems;
        this.d = z;
        this.e = kVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f6332a == jVar.f6332a && Intrinsics.f(this.f6333b, jVar.f6333b) && Intrinsics.f(this.f6334c, jVar.f6334c) && this.d == jVar.d && Intrinsics.f(this.e, jVar.e);
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.d(p.a.d(this.f6332a.hashCode() * 31, 31, this.f6333b), 31, this.f6334c), 31, this.d);
        k kVar = this.e;
        return iC + (kVar == null ? 0 : kVar.hashCode());
    }

    public j(b bVar, List list, ArrayList arrayList, boolean z, k kVar, int i) {
        this(bVar, list, (i & 4) != 0 ? zhm.f0.f322471a : arrayList, (i & 8) != 0 ? true : z, (i & 16) != 0 ? null : kVar);
    }
}
