package gzd;

import aii.r;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f148056a;

    public f(Set selectedCategories) {
        Intrinsics.checkNotNullParameter(selectedCategories, "selectedCategories");
        this.f148056a = selectedCategories;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f148056a, ((f) obj2).f148056a);
    }

    public final int hashCode() {
        return this.f148056a.hashCode();
    }
}
