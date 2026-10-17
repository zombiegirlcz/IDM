package wrd;

import com.revolut.retail.feature.api.custom_assets.models.CustomAsset;
import com.revolut.retail.feature.api.custom_assets.models.CustomAssetCategoryDefinition;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CustomAsset f299549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CustomAssetCategoryDefinition f299550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f299551c;

    public a(CustomAsset asset, CustomAssetCategoryDefinition categoryDefinition, boolean z) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(categoryDefinition, "categoryDefinition");
        this.f299549a = asset;
        this.f299550b = categoryDefinition;
        this.f299551c = z;
    }

    public static a a(a aVar, CustomAsset asset, boolean z, int i) {
        if ((i & 1) != 0) {
            asset = aVar.f299549a;
        }
        CustomAssetCategoryDefinition categoryDefinition = aVar.f299550b;
        if ((i & 4) != 0) {
            z = aVar.f299551c;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(categoryDefinition, "categoryDefinition");
        return new a(asset, categoryDefinition, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f299549a, aVar.f299549a) && Intrinsics.f(this.f299550b, aVar.f299550b) && this.f299551c == aVar.f299551c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f299551c) + ((this.f299550b.hashCode() + (this.f299549a.hashCode() * 31)) * 31);
    }
}
