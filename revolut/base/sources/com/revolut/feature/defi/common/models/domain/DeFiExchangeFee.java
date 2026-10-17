package com.revolut.feature.defi.common.models.domain;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/defi/common/models/domain/DeFiExchangeFee;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_defi_common_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DeFiExchangeFee implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeFiAssetAmountWithFiat f71689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f71690b;

    @NotNull
    public static final Parcelable.Creator<DeFiExchangeFee> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DeFiExchangeFee(DeFiAssetAmountWithFiat.CREATOR.createFromParcel(parcel), (BigDecimal) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DeFiExchangeFee[i];
        }
    }

    public DeFiExchangeFee(DeFiAssetAmountWithFiat amount, BigDecimal percent) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(percent, "percent");
        this.f71689a = amount;
        this.f71690b = percent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DeFiExchangeFee)) {
            return false;
        }
        DeFiExchangeFee deFiExchangeFee = (DeFiExchangeFee) obj2;
        return Intrinsics.f(this.f71689a, deFiExchangeFee.f71689a) && Intrinsics.f(this.f71690b, deFiExchangeFee.f71690b);
    }

    public final int hashCode() {
        return this.f71690b.hashCode() + (this.f71689a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f71689a.writeToParcel(dest, i);
        dest.writeSerializable(this.f71690b);
    }
}
