package srd;

import com.revolut.retail.feature.api.custom_assets.models.CustomAsset;
import com.revolut.retail.feature.api.custom_assets.models.CustomAssetCategoryDefinition;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CustomAsset f265160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CustomAssetCategoryDefinition f265161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f265162c;
    public final boolean d;
    public final Set e;
    public final Set f;

    public a(CustomAsset asset, CustomAssetCategoryDefinition categoryDefinition, xi0.b currency, boolean z, Set mileCountries, Set squareFootCountries) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(categoryDefinition, "categoryDefinition");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(mileCountries, "mileCountries");
        Intrinsics.checkNotNullParameter(squareFootCountries, "squareFootCountries");
        this.f265160a = asset;
        this.f265161b = categoryDefinition;
        this.f265162c = currency;
        this.d = z;
        this.e = mileCountries;
        this.f = squareFootCountries;
    }

    public static a a(a aVar, CustomAsset customAsset, boolean z, Set set, Set set2, int i) {
        if ((i & 1) != 0) {
            customAsset = aVar.f265160a;
        }
        CustomAsset asset = customAsset;
        CustomAssetCategoryDefinition categoryDefinition = aVar.f265161b;
        xi0.b currency = aVar.f265162c;
        if ((i & 8) != 0) {
            z = aVar.d;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            set = aVar.e;
        }
        Set mileCountries = set;
        if ((i & 32) != 0) {
            set2 = aVar.f;
        }
        Set squareFootCountries = set2;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(categoryDefinition, "categoryDefinition");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(mileCountries, "mileCountries");
        Intrinsics.checkNotNullParameter(squareFootCountries, "squareFootCountries");
        return new a(asset, categoryDefinition, currency, z3, mileCountries, squareFootCountries);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f265160a, aVar.f265160a) && Intrinsics.f(this.f265161b, aVar.f265161b) && Intrinsics.f(this.f265162c, aVar.f265162c) && this.d == aVar.d && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + p.a.f(j6.a.c(h30.l.j(this.f265162c, (this.f265161b.hashCode() + (this.f265160a.hashCode() * 31)) * 31, 31), 31, this.d), 31, this.e);
    }
}
