package znd;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ind.y f323727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f323728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f323729c;

    public c(ind.y pieChartSelection, boolean z, List selectedCategories) {
        Intrinsics.checkNotNullParameter(pieChartSelection, "pieChartSelection");
        Intrinsics.checkNotNullParameter(selectedCategories, "selectedCategories");
        this.f323727a = pieChartSelection;
        this.f323728b = z;
        this.f323729c = selectedCategories;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f323727a, cVar.f323727a) && this.f323728b == cVar.f323728b && Intrinsics.f(this.f323729c, cVar.f323729c);
    }

    public final int hashCode() {
        return this.f323729c.hashCode() + j6.a.c(this.f323727a.hashCode() * 31, 31, this.f323728b);
    }
}
