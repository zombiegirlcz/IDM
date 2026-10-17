package com.revolut.feature.crypto_feed.dependencies.fiatbalances;

import a0.d;
import android.os.Parcel;
import android.os.Parcelable;
import h30.l;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/crypto_feed/dependencies/fiatbalances/RevolutXFiatBalancesContract$RevolutXFiatBalanceData", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_crypto_feed_dependencies_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevolutXFiatBalancesContract$RevolutXFiatBalanceData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RevolutXFiatBalancesContract$RevolutXFiatBalanceData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f71355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f71356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f71357c;
    public final long d;
    public final long e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RevolutXFiatBalancesContract$RevolutXFiatBalanceData((b) parcel.readSerializable(), (b) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevolutXFiatBalancesContract$RevolutXFiatBalanceData[i];
        }
    }

    public RevolutXFiatBalancesContract$RevolutXFiatBalanceData(b currency, b baseCurrency, BigDecimal bigDecimal, long j2, long j3) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        this.f71355a = currency;
        this.f71356b = baseCurrency;
        this.f71357c = bigDecimal;
        this.d = j2;
        this.e = j3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RevolutXFiatBalancesContract$RevolutXFiatBalanceData)) {
            return false;
        }
        RevolutXFiatBalancesContract$RevolutXFiatBalanceData revolutXFiatBalancesContract$RevolutXFiatBalanceData = (RevolutXFiatBalancesContract$RevolutXFiatBalanceData) obj2;
        return Intrinsics.f(this.f71355a, revolutXFiatBalancesContract$RevolutXFiatBalanceData.f71355a) && Intrinsics.f(this.f71356b, revolutXFiatBalancesContract$RevolutXFiatBalanceData.f71356b) && Intrinsics.f(this.f71357c, revolutXFiatBalancesContract$RevolutXFiatBalanceData.f71357c) && this.d == revolutXFiatBalancesContract$RevolutXFiatBalanceData.d && this.e == revolutXFiatBalancesContract$RevolutXFiatBalanceData.e;
    }

    public final int hashCode() {
        int iJ = l.j(this.f71356b, this.f71355a.hashCode() * 31, 31);
        BigDecimal bigDecimal = this.f71357c;
        return Long.hashCode(this.e) + d.c((iJ + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31, 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f71355a);
        dest.writeSerializable(this.f71356b);
        dest.writeSerializable(this.f71357c);
        dest.writeLong(this.d);
        dest.writeLong(this.e);
    }
}
