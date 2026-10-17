package com.revolut.feature.tab.accounts.impl.ui.spaces;

import com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import pie.v;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductSpaceIdentifier f89624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f89625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f89626c;
    public final List d;
    public final List e;
    public final int f;

    public b(ProductSpaceIdentifier spaceIdentifier, v subSpaceIdentifier, List items, List initialOrderIds, List latestOrderIds, int i) {
        Intrinsics.checkNotNullParameter(spaceIdentifier, "spaceIdentifier");
        Intrinsics.checkNotNullParameter(subSpaceIdentifier, "subSpaceIdentifier");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(initialOrderIds, "initialOrderIds");
        Intrinsics.checkNotNullParameter(latestOrderIds, "latestOrderIds");
        this.f89624a = spaceIdentifier;
        this.f89625b = subSpaceIdentifier;
        this.f89626c = items;
        this.d = initialOrderIds;
        this.e = latestOrderIds;
        this.f = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f89624a, bVar.f89624a) && this.f89625b == bVar.f89625b && Intrinsics.f(this.f89626c, bVar.f89626c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && this.f == bVar.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + p.a.d(p.a.d(p.a.d((this.f89625b.hashCode() + (this.f89624a.hashCode() * 31)) * 31, 31, this.f89626c), 31, this.d), 31, this.e);
    }
}
