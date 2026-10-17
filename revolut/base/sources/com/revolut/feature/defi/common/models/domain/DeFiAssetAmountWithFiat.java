package com.revolut.feature.defi.common.models.domain;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/defi/common/models/domain/DeFiAssetAmountWithFiat;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_defi_common_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DeFiAssetAmountWithFiat implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeFiAssetAmount f71683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DeFiFiatAmount f71684b;

    @NotNull
    public static final Parcelable.Creator<DeFiAssetAmountWithFiat> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DeFiAssetAmountWithFiat(DeFiAssetAmount.CREATOR.createFromParcel(parcel), DeFiFiatAmount.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DeFiAssetAmountWithFiat[i];
        }
    }

    public DeFiAssetAmountWithFiat(DeFiAssetAmount assetAmount, DeFiFiatAmount fiatAmount) {
        Intrinsics.checkNotNullParameter(assetAmount, "assetAmount");
        Intrinsics.checkNotNullParameter(fiatAmount, "fiatAmount");
        this.f71683a = assetAmount;
        this.f71684b = fiatAmount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DeFiAssetAmountWithFiat)) {
            return false;
        }
        DeFiAssetAmountWithFiat deFiAssetAmountWithFiat = (DeFiAssetAmountWithFiat) obj2;
        return Intrinsics.f(this.f71683a, deFiAssetAmountWithFiat.f71683a) && Intrinsics.f(this.f71684b, deFiAssetAmountWithFiat.f71684b);
    }

    public final int hashCode() {
        return this.f71684b.hashCode() + (this.f71683a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f71683a.writeToParcel(dest, i);
        this.f71684b.writeToParcel(dest, i);
    }
}
