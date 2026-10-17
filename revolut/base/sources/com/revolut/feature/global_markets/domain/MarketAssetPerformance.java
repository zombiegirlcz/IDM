package com.revolut.feature.global_markets.domain;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/global_markets/domain/MarketAssetPerformance;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_global_markets_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MarketAssetPerformance implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MarketAssetPerformance> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f74574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f74575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f74576c;
    public final boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MarketAssetPerformance((b) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MarketAssetPerformance[i];
        }
    }

    public MarketAssetPerformance(b currency, BigDecimal currentRate, BigDecimal bigDecimal, boolean z) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(currentRate, "currentRate");
        this.f74574a = currency;
        this.f74575b = currentRate;
        this.f74576c = bigDecimal;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MarketAssetPerformance)) {
            return false;
        }
        MarketAssetPerformance marketAssetPerformance = (MarketAssetPerformance) obj2;
        return Intrinsics.f(this.f74574a, marketAssetPerformance.f74574a) && Intrinsics.f(this.f74575b, marketAssetPerformance.f74575b) && Intrinsics.f(this.f74576c, marketAssetPerformance.f74576c) && this.d == marketAssetPerformance.d;
    }

    public final int hashCode() {
        int iD = t61.a.d(this.f74575b, this.f74574a.hashCode() * 31, 31);
        BigDecimal bigDecimal = this.f74576c;
        return Boolean.hashCode(this.d) + ((iD + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f74574a);
        dest.writeSerializable(this.f74575b);
        dest.writeSerializable(this.f74576c);
        dest.writeInt(this.d ? 1 : 0);
    }
}
