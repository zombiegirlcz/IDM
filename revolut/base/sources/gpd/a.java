package gpd;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f145434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f145435b;

    public a(List predefinedCategories, List customCategories) {
        Intrinsics.checkNotNullParameter(predefinedCategories, "predefinedCategories");
        Intrinsics.checkNotNullParameter(customCategories, "customCategories");
        this.f145434a = predefinedCategories;
        this.f145435b = customCategories;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f145434a, aVar.f145434a) && Intrinsics.f(this.f145435b, aVar.f145435b);
    }

    public final int hashCode() {
        return this.f145435b.hashCode() + (this.f145434a.hashCode() * 31);
    }
}
