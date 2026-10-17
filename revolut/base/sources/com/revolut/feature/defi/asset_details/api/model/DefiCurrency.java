package com.revolut.feature.defi.asset_details.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import co7.a;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/defi/asset_details/api/model/DefiCurrency;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_defi_asset_details_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DefiCurrency implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f71671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f71672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f71673c;
    public final int d;
    public final int e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Lazy f71674g;

    @NotNull
    public static final Parcelable.Creator<DefiCurrency> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DefiCurrency(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DefiCurrency[i];
        }
    }

    public DefiCurrency(int i, int i2, String externalAssetId, String name, String ticker, String str) {
        Intrinsics.checkNotNullParameter(externalAssetId, "externalAssetId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(ticker, "ticker");
        this.f71671a = externalAssetId;
        this.f71672b = name;
        this.f71673c = ticker;
        this.d = i;
        this.e = i2;
        this.f = str;
        this.f71674g = j.b(new a(this, 20));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DefiCurrency)) {
            return false;
        }
        DefiCurrency defiCurrency = (DefiCurrency) obj2;
        return Intrinsics.f(this.f71671a, defiCurrency.f71671a) && Intrinsics.f(this.f71672b, defiCurrency.f71672b) && Intrinsics.f(this.f71673c, defiCurrency.f71673c) && this.d == defiCurrency.d && this.e == defiCurrency.e && Intrinsics.f(this.f, defiCurrency.f);
    }

    public final xi0.b getCurrency() {
        return (xi0.b) this.f71674g.getValue();
    }

    public final int hashCode() {
        int iB = j6.a.b(this.e, j6.a.b(this.d, p.a.c(p.a.c(this.f71671a.hashCode() * 31, 31, this.f71672b), 31, this.f71673c), 31), 31);
        String str = this.f;
        return iB + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f71671a);
        dest.writeString(this.f71672b);
        dest.writeString(this.f71673c);
        dest.writeInt(this.d);
        dest.writeInt(this.e);
        dest.writeString(this.f);
    }
}
