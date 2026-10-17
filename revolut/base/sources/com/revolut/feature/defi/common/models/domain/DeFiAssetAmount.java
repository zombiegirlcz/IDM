package com.revolut.feature.defi.common.models.domain;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.defi.common.models.domain.DeFiAssetAmount;
import java.math.BigDecimal;
import java.math.BigInteger;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/defi/common/models/domain/DeFiAssetAmount;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_defi_common_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DeFiAssetAmount implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f71680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f71681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigInteger f71682c;
    public final int d;
    public final Lazy e;
    public final Lazy f;

    @NotNull
    public static final Parcelable.Creator<DeFiAssetAmount> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DeFiAssetAmount(parcel.readString(), parcel.readString(), (BigInteger) parcel.readSerializable(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DeFiAssetAmount[i];
        }
    }

    public DeFiAssetAmount(String assetId, String ticker, BigInteger amount, int i) {
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        Intrinsics.checkNotNullParameter(ticker, "ticker");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f71680a = assetId;
        this.f71681b = ticker;
        this.f71682c = amount;
        this.d = i;
        final int i2 = 0;
        this.e = j.b(new Function0(this) { // from class: b36.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeFiAssetAmount f12008b;

            {
                this.f12008b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        DeFiAssetAmount deFiAssetAmount = this.f12008b;
                        return new BigDecimal(deFiAssetAmount.f71682c, deFiAssetAmount.d);
                    default:
                        DeFiAssetAmount deFiAssetAmount2 = this.f12008b;
                        return new xi0.b(4, deFiAssetAmount2.f71680a, Integer.valueOf(deFiAssetAmount2.d));
                }
            }
        });
        final int i3 = 1;
        this.f = j.b(new Function0(this) { // from class: b36.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeFiAssetAmount f12008b;

            {
                this.f12008b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        DeFiAssetAmount deFiAssetAmount = this.f12008b;
                        return new BigDecimal(deFiAssetAmount.f71682c, deFiAssetAmount.d);
                    default:
                        DeFiAssetAmount deFiAssetAmount2 = this.f12008b;
                        return new xi0.b(4, deFiAssetAmount2.f71680a, Integer.valueOf(deFiAssetAmount2.d));
                }
            }
        });
    }

    public final BigDecimal a() {
        return (BigDecimal) this.e.getValue();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DeFiAssetAmount)) {
            return false;
        }
        DeFiAssetAmount deFiAssetAmount = (DeFiAssetAmount) obj2;
        return Intrinsics.f(this.f71680a, deFiAssetAmount.f71680a) && Intrinsics.f(this.f71681b, deFiAssetAmount.f71681b) && Intrinsics.f(this.f71682c, deFiAssetAmount.f71682c) && this.d == deFiAssetAmount.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + ((this.f71682c.hashCode() + p.a.c(this.f71680a.hashCode() * 31, 31, this.f71681b)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f71680a);
        dest.writeString(this.f71681b);
        dest.writeSerializable(this.f71682c);
        dest.writeInt(this.d);
    }
}
