package com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.asset_details.investment;

import android.os.Parcel;
import android.os.Parcelable;
import io3.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/crypto/asset_details/impl/ui/screens/asset_details/investment/AssetDetailsInvestmentContract$ClickParcel$Holding", "", "", "toString", "()Ljava/lang/String;", "feature_crypto_asset_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AssetDetailsInvestmentContract$ClickParcel$Holding implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AssetDetailsInvestmentContract$ClickParcel$Holding> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f99978a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AssetDetailsInvestmentContract$ClickParcel$Holding((g) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AssetDetailsInvestmentContract$ClickParcel$Holding[i];
        }
    }

    public AssetDetailsInvestmentContract$ClickParcel$Holding(g pocketBalance) {
        Intrinsics.checkNotNullParameter(pocketBalance, "pocketBalance");
        this.f99978a = pocketBalance;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof AssetDetailsInvestmentContract$ClickParcel$Holding) && Intrinsics.f(this.f99978a, ((AssetDetailsInvestmentContract$ClickParcel$Holding) obj2).f99978a);
    }

    public final int hashCode() {
        return this.f99978a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f99978a);
    }
}
