package com.revolut.feature.defi.common.models.domain;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/defi/common/models/domain/DeFiRate;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_defi_common_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DeFiRate implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f71703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f71704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f71705c;
    public final String d;
    public final BigDecimal e;

    @NotNull
    public static final Parcelable.Creator<DeFiRate> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DeFiRate(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DeFiRate[i];
        }
    }

    public DeFiRate(String baseAssetId, String baseAssetSymbol, String counterAssetId, String counterAssetSymbol, BigDecimal bid2) {
        Intrinsics.checkNotNullParameter(baseAssetId, "baseAssetId");
        Intrinsics.checkNotNullParameter(baseAssetSymbol, "baseAssetSymbol");
        Intrinsics.checkNotNullParameter(counterAssetId, "counterAssetId");
        Intrinsics.checkNotNullParameter(counterAssetSymbol, "counterAssetSymbol");
        Intrinsics.checkNotNullParameter(bid2, "bid");
        this.f71703a = baseAssetId;
        this.f71704b = baseAssetSymbol;
        this.f71705c = counterAssetId;
        this.d = counterAssetSymbol;
        this.e = bid2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DeFiRate)) {
            return false;
        }
        DeFiRate deFiRate = (DeFiRate) obj2;
        return Intrinsics.f(this.f71703a, deFiRate.f71703a) && Intrinsics.f(this.f71704b, deFiRate.f71704b) && Intrinsics.f(this.f71705c, deFiRate.f71705c) && Intrinsics.f(this.d, deFiRate.d) && Intrinsics.f(this.e, deFiRate.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.c(p.a.c(p.a.c(this.f71703a.hashCode() * 31, 31, this.f71704b), 31, this.f71705c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f71703a);
        dest.writeString(this.f71704b);
        dest.writeString(this.f71705c);
        dest.writeString(this.d);
        dest.writeSerializable(this.e);
    }
}
