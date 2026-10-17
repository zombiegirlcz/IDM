package amd;

import com.revolut.retail.feature.api.custom_assets.models.CustomAsset;
import com.revolut.retail.feature.api.custom_assets.models.CustomAssetCategoryDefinition;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class r implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CustomAsset f6343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CustomAssetCategoryDefinition f6344b;

    public r(CustomAsset asset, CustomAssetCategoryDefinition categoryDefinition) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(categoryDefinition, "categoryDefinition");
        this.f6343a = asset;
        this.f6344b = categoryDefinition;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f6343a, rVar.f6343a) && Intrinsics.f(this.f6344b, rVar.f6344b);
    }

    public final int hashCode() {
        return this.f6344b.hashCode() + (this.f6343a.hashCode() * 31);
    }
}
