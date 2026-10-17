package lrd;

import cli.j;
import com.revolut.retail.feature.api.custom_assets.models.CustomAssetCategoryDefinition;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f199494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CustomAssetCategoryDefinition f199495b;

    public b(boolean z, CustomAssetCategoryDefinition customAssetCategoryDefinition) {
        this.f199494a = z;
        this.f199495b = customAssetCategoryDefinition;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f199494a == bVar.f199494a && Intrinsics.f(this.f199495b, bVar.f199495b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f199494a) * 31;
        CustomAssetCategoryDefinition customAssetCategoryDefinition = this.f199495b;
        return iHashCode + (customAssetCategoryDefinition == null ? 0 : customAssetCategoryDefinition.hashCode());
    }
}
