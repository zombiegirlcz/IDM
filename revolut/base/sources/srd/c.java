package srd;

import com.revolut.retail.feature.api.custom_assets.models.CustomAsset;
import com.revolut.retail.feature.api.custom_assets.models.CustomAssetCategoryDefinition;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CustomAsset f265166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CustomAssetCategoryDefinition f265167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f265168c;

    public c(CustomAsset asset, CustomAssetCategoryDefinition categoryDefinition, xi0.b currency) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(categoryDefinition, "categoryDefinition");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f265166a = asset;
        this.f265167b = categoryDefinition;
        this.f265168c = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f265166a, cVar.f265166a) && Intrinsics.f(this.f265167b, cVar.f265167b) && Intrinsics.f(this.f265168c, cVar.f265168c);
    }

    public final int hashCode() {
        return this.f265168c.hashCode() + ((this.f265167b.hashCode() + (this.f265166a.hashCode() * 31)) * 31);
    }
}
