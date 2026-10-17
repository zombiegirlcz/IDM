package urd;

import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.common.SmartEstimationAccess;
import com.revolut.retail.feature.api.custom_assets.models.CustomAsset;
import com.revolut.retail.feature.api.custom_assets.models.CustomAssetCategoryDefinition;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CustomAsset f282264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CustomAssetCategoryDefinition f282265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f282266c;
    public final amd.a d;
    public final int e;
    public final SmartEstimationAccess f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set f282267g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Set f282268h;

    public a(CustomAsset asset, CustomAssetCategoryDefinition categoryDefinition, boolean z, amd.a selectedTimeframe, int i, SmartEstimationAccess smartEstimationAccess, Set mileCountries, Set squareFootCountries) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(categoryDefinition, "categoryDefinition");
        Intrinsics.checkNotNullParameter(selectedTimeframe, "selectedTimeframe");
        Intrinsics.checkNotNullParameter(mileCountries, "mileCountries");
        Intrinsics.checkNotNullParameter(squareFootCountries, "squareFootCountries");
        this.f282264a = asset;
        this.f282265b = categoryDefinition;
        this.f282266c = z;
        this.d = selectedTimeframe;
        this.e = i;
        this.f = smartEstimationAccess;
        this.f282267g = mileCountries;
        this.f282268h = squareFootCountries;
    }

    public static a a(a aVar, CustomAsset customAsset, amd.a aVar2, int i, SmartEstimationAccess smartEstimationAccess, Set set, Set set2, int i2) {
        if ((i2 & 1) != 0) {
            customAsset = aVar.f282264a;
        }
        CustomAsset asset = customAsset;
        CustomAssetCategoryDefinition categoryDefinition = aVar.f282265b;
        boolean z = aVar.f282266c;
        if ((i2 & 8) != 0) {
            aVar2 = aVar.d;
        }
        amd.a selectedTimeframe = aVar2;
        if ((i2 & 16) != 0) {
            i = aVar.e;
        }
        int i3 = i;
        SmartEstimationAccess smartEstimationAccess2 = (i2 & 32) != 0 ? aVar.f : smartEstimationAccess;
        Set mileCountries = (i2 & 64) != 0 ? aVar.f282267g : set;
        Set squareFootCountries = (i2 & 128) != 0 ? aVar.f282268h : set2;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(categoryDefinition, "categoryDefinition");
        Intrinsics.checkNotNullParameter(selectedTimeframe, "selectedTimeframe");
        Intrinsics.checkNotNullParameter(mileCountries, "mileCountries");
        Intrinsics.checkNotNullParameter(squareFootCountries, "squareFootCountries");
        return new a(asset, categoryDefinition, z, selectedTimeframe, i3, smartEstimationAccess2, mileCountries, squareFootCountries);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f282264a, aVar.f282264a) && Intrinsics.f(this.f282265b, aVar.f282265b) && this.f282266c == aVar.f282266c && this.d == aVar.d && this.e == aVar.e && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f282267g, aVar.f282267g) && Intrinsics.f(this.f282268h, aVar.f282268h);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.e, (this.d.hashCode() + j6.a.c((this.f282265b.hashCode() + (this.f282264a.hashCode() * 31)) * 31, 31, this.f282266c)) * 31, 31);
        SmartEstimationAccess smartEstimationAccess = this.f;
        return this.f282268h.hashCode() + p.a.f((iB + (smartEstimationAccess == null ? 0 : smartEstimationAccess.hashCode())) * 31, 31, this.f282267g);
    }
}
