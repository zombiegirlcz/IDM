package com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.asset_details.investment;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.staking.api.model.StakingPocket;
import com.revolut.feature.staking.api.model.StakingProduct;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/crypto/asset_details/impl/ui/screens/asset_details/investment/AssetDetailsInvestmentContract$ClickParcel$Stake", "", "", "toString", "()Ljava/lang/String;", "feature_crypto_asset_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AssetDetailsInvestmentContract$ClickParcel$Stake implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AssetDetailsInvestmentContract$ClickParcel$Stake> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f99980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StakingProduct f99981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StakingPocket f99982c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AssetDetailsInvestmentContract$ClickParcel$Stake(parcel.readString(), (StakingProduct) parcel.readParcelable(AssetDetailsInvestmentContract$ClickParcel$Stake.class.getClassLoader()), (StakingPocket) parcel.readParcelable(AssetDetailsInvestmentContract$ClickParcel$Stake.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AssetDetailsInvestmentContract$ClickParcel$Stake[i];
        }
    }

    public AssetDetailsInvestmentContract$ClickParcel$Stake(String str, StakingProduct stakingProduct, StakingPocket stakingPocket) {
        Intrinsics.checkNotNullParameter(stakingProduct, "stakingProduct");
        this.f99980a = str;
        this.f99981b = stakingProduct;
        this.f99982c = stakingPocket;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AssetDetailsInvestmentContract$ClickParcel$Stake)) {
            return false;
        }
        AssetDetailsInvestmentContract$ClickParcel$Stake assetDetailsInvestmentContract$ClickParcel$Stake = (AssetDetailsInvestmentContract$ClickParcel$Stake) obj2;
        return Intrinsics.f(this.f99980a, assetDetailsInvestmentContract$ClickParcel$Stake.f99980a) && Intrinsics.f(this.f99981b, assetDetailsInvestmentContract$ClickParcel$Stake.f99981b) && Intrinsics.f(this.f99982c, assetDetailsInvestmentContract$ClickParcel$Stake.f99982c);
    }

    public final int hashCode() {
        String str = this.f99980a;
        int iHashCode = (this.f99981b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        StakingPocket stakingPocket = this.f99982c;
        return iHashCode + (stakingPocket != null ? stakingPocket.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f99980a);
        dest.writeParcelable(this.f99981b, i);
        dest.writeParcelable(this.f99982c, i);
    }
}
