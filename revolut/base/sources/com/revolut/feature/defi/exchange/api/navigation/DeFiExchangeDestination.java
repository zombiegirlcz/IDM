package com.revolut.feature.defi.exchange.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wd6.e;
import xi0.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/defi/exchange/api/navigation/DeFiExchangeDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_defi_exchange_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DeFiExchangeDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<DeFiExchangeDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f71720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f71721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f71722c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DeFiExchangeDestination(e.valueOf(parcel.readString()), (b) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DeFiExchangeDestination[i];
        }
    }

    public DeFiExchangeDestination(e side, b targetCurrency, String deFiAccountId) {
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        Intrinsics.checkNotNullParameter(deFiAccountId, "deFiAccountId");
        this.f71720a = side;
        this.f71721b = targetCurrency;
        this.f71722c = deFiAccountId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DeFiExchangeDestination)) {
            return false;
        }
        DeFiExchangeDestination deFiExchangeDestination = (DeFiExchangeDestination) obj2;
        return this.f71720a == deFiExchangeDestination.f71720a && Intrinsics.f(this.f71721b, deFiExchangeDestination.f71721b) && Intrinsics.f(this.f71722c, deFiExchangeDestination.f71722c);
    }

    public final int hashCode() {
        return this.f71722c.hashCode() + l.j(this.f71721b, this.f71720a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f71720a.name());
        dest.writeSerializable(this.f71721b);
        dest.writeString(this.f71722c);
    }
}
