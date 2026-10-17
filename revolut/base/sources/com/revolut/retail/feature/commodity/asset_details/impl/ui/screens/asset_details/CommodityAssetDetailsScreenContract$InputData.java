package com.revolut.retail.feature.commodity.asset_details.impl.ui.screens.asset_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.commodity.asset_details.api.navigation.DisplayConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/commodity/asset_details/impl/ui/screens/asset_details/CommodityAssetDetailsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_commodity_asset_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CommodityAssetDetailsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CommodityAssetDetailsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f99788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DisplayConfig f99789b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CommodityAssetDetailsScreenContract$InputData((b) parcel.readSerializable(), (DisplayConfig) parcel.readParcelable(CommodityAssetDetailsScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CommodityAssetDetailsScreenContract$InputData[i];
        }
    }

    public CommodityAssetDetailsScreenContract$InputData(b currency, DisplayConfig displayConfig) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f99788a = currency;
        this.f99789b = displayConfig;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CommodityAssetDetailsScreenContract$InputData)) {
            return false;
        }
        CommodityAssetDetailsScreenContract$InputData commodityAssetDetailsScreenContract$InputData = (CommodityAssetDetailsScreenContract$InputData) obj2;
        return Intrinsics.f(this.f99788a, commodityAssetDetailsScreenContract$InputData.f99788a) && Intrinsics.f(this.f99789b, commodityAssetDetailsScreenContract$InputData.f99789b);
    }

    public final int hashCode() {
        int iHashCode = this.f99788a.hashCode() * 31;
        DisplayConfig displayConfig = this.f99789b;
        return iHashCode + (displayConfig == null ? 0 : displayConfig.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f99788a);
        dest.writeParcelable(this.f99789b, i);
    }
}
