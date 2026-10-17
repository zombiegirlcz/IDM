package ggc;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f143623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f143624b;

    public f0(List displayCategories, List sortCategories) {
        Intrinsics.checkNotNullParameter(displayCategories, "displayCategories");
        Intrinsics.checkNotNullParameter(sortCategories, "sortCategories");
        this.f143623a = displayCategories;
        this.f143624b = sortCategories;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj2;
        return Intrinsics.f(this.f143623a, f0Var.f143623a) && Intrinsics.f(this.f143624b, f0Var.f143624b);
    }

    public final int hashCode() {
        return this.f143624b.hashCode() + (this.f143623a.hashCode() * 31);
    }
}
