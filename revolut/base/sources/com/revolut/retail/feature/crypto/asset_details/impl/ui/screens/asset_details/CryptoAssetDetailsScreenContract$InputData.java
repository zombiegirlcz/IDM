package com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.asset_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.exchange.models.BuyFundingCurrencyPrefill;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/crypto/asset_details/impl/ui/screens/asset_details/CryptoAssetDetailsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_crypto_asset_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoAssetDetailsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CryptoAssetDetailsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f99962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BuyFundingCurrencyPrefill f99963b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoAssetDetailsScreenContract$InputData((b) parcel.readSerializable(), (BuyFundingCurrencyPrefill) parcel.readParcelable(CryptoAssetDetailsScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoAssetDetailsScreenContract$InputData[i];
        }
    }

    public CryptoAssetDetailsScreenContract$InputData(b currency, BuyFundingCurrencyPrefill buyFundingCurrencyPrefill) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f99962a = currency;
        this.f99963b = buyFundingCurrencyPrefill;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CryptoAssetDetailsScreenContract$InputData)) {
            return false;
        }
        CryptoAssetDetailsScreenContract$InputData cryptoAssetDetailsScreenContract$InputData = (CryptoAssetDetailsScreenContract$InputData) obj2;
        return Intrinsics.f(this.f99962a, cryptoAssetDetailsScreenContract$InputData.f99962a) && Intrinsics.f(this.f99963b, cryptoAssetDetailsScreenContract$InputData.f99963b);
    }

    public final int hashCode() {
        int iHashCode = this.f99962a.hashCode() * 31;
        BuyFundingCurrencyPrefill buyFundingCurrencyPrefill = this.f99963b;
        return iHashCode + (buyFundingCurrencyPrefill == null ? 0 : buyFundingCurrencyPrefill.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f99962a);
        dest.writeParcelable(this.f99963b, i);
    }
}
