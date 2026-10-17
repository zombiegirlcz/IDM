package com.revolut.retail.feature.cryptocommoditydetails.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.exchange.models.BuyFundingCurrencyPrefill;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import com.revolut.retail.feature.cryptocommoditydetails.api.navigation.CryptoCommodityDetailsTabPayload;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/cryptocommoditydetails/api/navigation/CryptoCommodityDetailsFeatureConfig;", "Lcom/revolut/retail/core/navigation/feature/FeatureConfig;", "", "toString", "()Ljava/lang/String;", "ocj/a", "feature_cryptocommodity_details_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoCommodityDetailsFeatureConfig implements FeatureConfig {

    @NotNull
    public static final Parcelable.Creator<CryptoCommodityDetailsFeatureConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f100136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ocj.a f100137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CryptoCommodityDetailsTabPayload f100138c;
    public final boolean d;
    public final boolean e;
    public final BuyFundingCurrencyPrefill f;

    /* JADX INFO: loaded from: classes11.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoCommodityDetailsFeatureConfig((b) parcel.readSerializable(), parcel.readInt() == 0 ? null : ocj.a.valueOf(parcel.readString()), (CryptoCommodityDetailsTabPayload) parcel.readParcelable(CryptoCommodityDetailsFeatureConfig.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, (BuyFundingCurrencyPrefill) parcel.readParcelable(CryptoCommodityDetailsFeatureConfig.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoCommodityDetailsFeatureConfig[i];
        }
    }

    public CryptoCommodityDetailsFeatureConfig(b currency, ocj.a aVar, CryptoCommodityDetailsTabPayload cryptoCommodityDetailsTabPayload, boolean z, boolean z3, BuyFundingCurrencyPrefill buyFundingCurrencyPrefill) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f100136a = currency;
        this.f100137b = aVar;
        this.f100138c = cryptoCommodityDetailsTabPayload;
        this.d = z;
        this.e = z3;
        this.f = buyFundingCurrencyPrefill;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CryptoCommodityDetailsFeatureConfig)) {
            return false;
        }
        CryptoCommodityDetailsFeatureConfig cryptoCommodityDetailsFeatureConfig = (CryptoCommodityDetailsFeatureConfig) obj2;
        return Intrinsics.f(this.f100136a, cryptoCommodityDetailsFeatureConfig.f100136a) && this.f100137b == cryptoCommodityDetailsFeatureConfig.f100137b && Intrinsics.f(this.f100138c, cryptoCommodityDetailsFeatureConfig.f100138c) && this.d == cryptoCommodityDetailsFeatureConfig.d && this.e == cryptoCommodityDetailsFeatureConfig.e && Intrinsics.f(this.f, cryptoCommodityDetailsFeatureConfig.f);
    }

    public final int hashCode() {
        int iHashCode = this.f100136a.hashCode() * 31;
        ocj.a aVar = this.f100137b;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        CryptoCommodityDetailsTabPayload cryptoCommodityDetailsTabPayload = this.f100138c;
        int iC = j6.a.c(j6.a.c((iHashCode2 + (cryptoCommodityDetailsTabPayload == null ? 0 : cryptoCommodityDetailsTabPayload.hashCode())) * 31, 31, this.d), 31, this.e);
        BuyFundingCurrencyPrefill buyFundingCurrencyPrefill = this.f;
        return iC + (buyFundingCurrencyPrefill != null ? buyFundingCurrencyPrefill.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f100136a);
        ocj.a aVar = this.f100137b;
        if (aVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(aVar.name());
        }
        dest.writeParcelable(this.f100138c, i);
        dest.writeInt(this.d ? 1 : 0);
        dest.writeInt(this.e ? 1 : 0);
        dest.writeParcelable(this.f, i);
    }

    public /* synthetic */ CryptoCommodityDetailsFeatureConfig(b bVar, ocj.a aVar, CryptoCommodityDetailsTabPayload.CryptoCommodityDetailsTransactionsTabPayloadForExchange cryptoCommodityDetailsTransactionsTabPayloadForExchange, BuyFundingCurrencyPrefill buyFundingCurrencyPrefill, int i) {
        this(bVar, (i & 2) != 0 ? null : aVar, (i & 4) != 0 ? null : cryptoCommodityDetailsTransactionsTabPayloadForExchange, (i & 8) == 0, (i & 16) == 0, (i & 32) != 0 ? null : buyFundingCurrencyPrefill);
    }
}
