package com.revolut.feature.defi.exchange.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/defi/exchange/impl/domain/model/DeFiSwapRate;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_defi_exchange_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DeFiSwapRate implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DeFiSwapRate> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeFiSwapSource f71734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f71735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f71736c;
    public final BigDecimal d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DeFiSwapRate((DeFiSwapSource) parcel.readParcelable(DeFiSwapRate.class.getClassLoader()), parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DeFiSwapRate[i];
        }
    }

    public DeFiSwapRate(DeFiSwapSource baseAsset, String counterAssetId, String counterAssetSymbol, BigDecimal bid2) {
        Intrinsics.checkNotNullParameter(baseAsset, "baseAsset");
        Intrinsics.checkNotNullParameter(counterAssetId, "counterAssetId");
        Intrinsics.checkNotNullParameter(counterAssetSymbol, "counterAssetSymbol");
        Intrinsics.checkNotNullParameter(bid2, "bid");
        this.f71734a = baseAsset;
        this.f71735b = counterAssetId;
        this.f71736c = counterAssetSymbol;
        this.d = bid2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DeFiSwapRate)) {
            return false;
        }
        DeFiSwapRate deFiSwapRate = (DeFiSwapRate) obj2;
        return Intrinsics.f(this.f71734a, deFiSwapRate.f71734a) && Intrinsics.f(this.f71735b, deFiSwapRate.f71735b) && Intrinsics.f(this.f71736c, deFiSwapRate.f71736c) && Intrinsics.f(this.d, deFiSwapRate.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f71734a.hashCode() * 31, 31, this.f71735b), 31, this.f71736c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f71734a, i);
        dest.writeString(this.f71735b);
        dest.writeString(this.f71736c);
        dest.writeSerializable(this.d);
    }
}
