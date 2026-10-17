package urd;

import com.revolut.retail.feature.api.custom_assets.models.CustomAsset;
import com.revolut.retail.feature.api.custom_assets.models.CustomAssetCategoryDefinition;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CustomAsset f282274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CustomAssetCategoryDefinition f282275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f282276c;

    public c(CustomAsset asset, CustomAssetCategoryDefinition categoryDefinition, xi0.b currency) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(categoryDefinition, "categoryDefinition");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f282274a = asset;
        this.f282275b = categoryDefinition;
        this.f282276c = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f282274a, cVar.f282274a) && Intrinsics.f(this.f282275b, cVar.f282275b) && Intrinsics.f(this.f282276c, cVar.f282276c);
    }

    public final int hashCode() {
        return this.f282276c.hashCode() + ((this.f282275b.hashCode() + (this.f282274a.hashCode() * 31)) * 31);
    }
}
