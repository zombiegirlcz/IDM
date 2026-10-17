package wrd;

import com.revolut.retail.feature.api.custom_assets.models.CustomAsset;
import com.revolut.retail.feature.api.custom_assets.models.CustomAssetCategoryDefinition;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CustomAsset f299554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CustomAssetCategoryDefinition f299555b;

    public c(CustomAsset asset, CustomAssetCategoryDefinition categoryDefinition) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(categoryDefinition, "categoryDefinition");
        this.f299554a = asset;
        this.f299555b = categoryDefinition;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f299554a, cVar.f299554a) && Intrinsics.f(this.f299555b, cVar.f299555b);
    }

    public final int hashCode() {
        return this.f299555b.hashCode() + (this.f299554a.hashCode() * 31);
    }
}
