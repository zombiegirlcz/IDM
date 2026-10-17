package ht6;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f155328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f155329b;

    public b(ArrayList visibleCategories, List perks) {
        Intrinsics.checkNotNullParameter(perks, "perks");
        Intrinsics.checkNotNullParameter(visibleCategories, "visibleCategories");
        this.f155328a = perks;
        this.f155329b = visibleCategories;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f155328a, bVar.f155328a) && this.f155329b.equals(bVar.f155329b);
    }

    public final int hashCode() {
        return this.f155329b.hashCode() + (this.f155328a.hashCode() * 31);
    }
}
