package com.revolut.retail.feature.commodity.asset_details.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/commodity/asset_details/api/navigation/CommodityAssetDetailsDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_commodity_asset_details_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CommodityAssetDetailsDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<CommodityAssetDetailsDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f99775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DisplayConfig f99776b;

    /* JADX INFO: loaded from: classes10.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CommodityAssetDetailsDestination((b) parcel.readSerializable(), (DisplayConfig) parcel.readParcelable(CommodityAssetDetailsDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CommodityAssetDetailsDestination[i];
        }
    }

    public CommodityAssetDetailsDestination(b currency, DisplayConfig displayConfig) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f99775a = currency;
        this.f99776b = displayConfig;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CommodityAssetDetailsDestination)) {
            return false;
        }
        CommodityAssetDetailsDestination commodityAssetDetailsDestination = (CommodityAssetDetailsDestination) obj2;
        return Intrinsics.f(this.f99775a, commodityAssetDetailsDestination.f99775a) && Intrinsics.f(this.f99776b, commodityAssetDetailsDestination.f99776b);
    }

    public final int hashCode() {
        int iHashCode = this.f99775a.hashCode() * 31;
        DisplayConfig displayConfig = this.f99776b;
        return iHashCode + (displayConfig == null ? 0 : displayConfig.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f99775a);
        dest.writeParcelable(this.f99776b, i);
    }
}
