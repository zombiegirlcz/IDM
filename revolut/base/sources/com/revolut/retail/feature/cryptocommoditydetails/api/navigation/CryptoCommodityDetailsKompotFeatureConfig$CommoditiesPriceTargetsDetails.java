package com.revolut.retail.feature.cryptocommoditydetails.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ncj.d;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/cryptocommoditydetails/api/navigation/CryptoCommodityDetailsKompotFeatureConfig$CommoditiesPriceTargetsDetails", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_cryptocommodity_details_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoCommodityDetailsKompotFeatureConfig$CommoditiesPriceTargetsDetails implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<CryptoCommodityDetailsKompotFeatureConfig$CommoditiesPriceTargetsDetails> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f100139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f100140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f100141c;

    /* JADX INFO: loaded from: classes11.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoCommodityDetailsKompotFeatureConfig$CommoditiesPriceTargetsDetails((b) parcel.readSerializable(), (b) parcel.readSerializable(), d.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoCommodityDetailsKompotFeatureConfig$CommoditiesPriceTargetsDetails[i];
        }
    }

    public CryptoCommodityDetailsKompotFeatureConfig$CommoditiesPriceTargetsDetails(b currency, b baseCurrency, d chartType) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(chartType, "chartType");
        this.f100139a = currency;
        this.f100140b = baseCurrency;
        this.f100141c = chartType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CryptoCommodityDetailsKompotFeatureConfig$CommoditiesPriceTargetsDetails)) {
            return false;
        }
        CryptoCommodityDetailsKompotFeatureConfig$CommoditiesPriceTargetsDetails cryptoCommodityDetailsKompotFeatureConfig$CommoditiesPriceTargetsDetails = (CryptoCommodityDetailsKompotFeatureConfig$CommoditiesPriceTargetsDetails) obj2;
        return Intrinsics.f(this.f100139a, cryptoCommodityDetailsKompotFeatureConfig$CommoditiesPriceTargetsDetails.f100139a) && Intrinsics.f(this.f100140b, cryptoCommodityDetailsKompotFeatureConfig$CommoditiesPriceTargetsDetails.f100140b) && this.f100141c == cryptoCommodityDetailsKompotFeatureConfig$CommoditiesPriceTargetsDetails.f100141c;
    }

    public final int hashCode() {
        return this.f100141c.hashCode() + l.j(this.f100140b, this.f100139a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f100139a);
        dest.writeSerializable(this.f100140b);
        dest.writeString(this.f100141c.name());
    }
}
