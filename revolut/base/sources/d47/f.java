package d47;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f111233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f111234b;

    public f(Set availableCategories, Set selectedCategories) {
        Intrinsics.checkNotNullParameter(availableCategories, "availableCategories");
        Intrinsics.checkNotNullParameter(selectedCategories, "selectedCategories");
        this.f111233a = availableCategories;
        this.f111234b = selectedCategories;
    }

    public static f a(f fVar, Set selectedCategories) {
        Set availableCategories = fVar.f111233a;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(availableCategories, "availableCategories");
        Intrinsics.checkNotNullParameter(selectedCategories, "selectedCategories");
        return new f(availableCategories, selectedCategories);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f111233a, fVar.f111233a) && Intrinsics.f(this.f111234b, fVar.f111234b);
    }

    public final int hashCode() {
        return this.f111234b.hashCode() + (this.f111233a.hashCode() * 31);
    }
}
