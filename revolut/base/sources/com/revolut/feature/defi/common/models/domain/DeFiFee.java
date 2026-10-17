package com.revolut.feature.defi.common.models.domain;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/defi/common/models/domain/DeFiFee;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_defi_common_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DeFiFee implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeFiAssetAmountWithFiat f71691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DeFiExchangeFee f71692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DeFiAssetAmountWithFiat f71693c;

    @NotNull
    public static final Parcelable.Creator<DeFiFee> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Parcelable.Creator<DeFiAssetAmountWithFiat> creator = DeFiAssetAmountWithFiat.CREATOR;
            return new DeFiFee(creator.createFromParcel(parcel), DeFiExchangeFee.CREATOR.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DeFiFee[i];
        }
    }

    public DeFiFee(DeFiAssetAmountWithFiat total, DeFiExchangeFee exchange, DeFiAssetAmountWithFiat network) {
        Intrinsics.checkNotNullParameter(total, "total");
        Intrinsics.checkNotNullParameter(exchange, "exchange");
        Intrinsics.checkNotNullParameter(network, "network");
        this.f71691a = total;
        this.f71692b = exchange;
        this.f71693c = network;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DeFiFee)) {
            return false;
        }
        DeFiFee deFiFee = (DeFiFee) obj2;
        return Intrinsics.f(this.f71691a, deFiFee.f71691a) && Intrinsics.f(this.f71692b, deFiFee.f71692b) && Intrinsics.f(this.f71693c, deFiFee.f71693c);
    }

    public final int hashCode() {
        return this.f71693c.hashCode() + ((this.f71692b.hashCode() + (this.f71691a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f71691a.writeToParcel(dest, i);
        this.f71692b.writeToParcel(dest, i);
        this.f71693c.writeToParcel(dest, i);
    }
}
