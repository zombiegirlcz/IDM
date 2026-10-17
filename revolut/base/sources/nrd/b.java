package nrd;

import aii.r;
import com.revolut.retail.feature.api.custom_assets.models.CustomAssetCategoryDefinition;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CustomAssetCategoryDefinition f218611a;

    public b(CustomAssetCategoryDefinition categoryDefinition) {
        Intrinsics.checkNotNullParameter(categoryDefinition, "categoryDefinition");
        this.f218611a = categoryDefinition;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f218611a, ((b) obj2).f218611a);
    }

    public final int hashCode() {
        return this.f218611a.hashCode();
    }
}
