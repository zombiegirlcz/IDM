package com.revolut.feature.revolut_x_balances.api.fiat.navigation;

import a0.d;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"com/revolut/feature/revolut_x_balances/api/fiat/navigation/RevolutXFiatBalancesDetailsController$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "Stats", "feature_retail_revolut_x_balances_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevolutXFiatBalancesDetailsController$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<RevolutXFiatBalancesDetailsController$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f84249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Stats f84250b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolut_x_balances/api/fiat/navigation/RevolutXFiatBalancesDetailsController$InputData$Stats;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_revolut_x_balances_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Stats implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Stats> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f84251a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BigDecimal f84252b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f84253c;
        public final long d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Stats((b) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readLong(), parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Stats[i];
            }
        }

        public Stats(b displayCurrency, BigDecimal bigDecimal, long j2, long j3) {
            Intrinsics.checkNotNullParameter(displayCurrency, "displayCurrency");
            this.f84251a = displayCurrency;
            this.f84252b = bigDecimal;
            this.f84253c = j2;
            this.d = j3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Stats)) {
                return false;
            }
            Stats stats = (Stats) obj2;
            return Intrinsics.f(this.f84251a, stats.f84251a) && Intrinsics.f(this.f84252b, stats.f84252b) && this.f84253c == stats.f84253c && this.d == stats.d;
        }

        public final int hashCode() {
            int iHashCode = this.f84251a.hashCode() * 31;
            BigDecimal bigDecimal = this.f84252b;
            return Long.hashCode(this.d) + d.c((iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31, 31, this.f84253c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f84251a);
            dest.writeSerializable(this.f84252b);
            dest.writeLong(this.f84253c);
            dest.writeLong(this.d);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RevolutXFiatBalancesDetailsController$InputData((b) parcel.readSerializable(), parcel.readInt() == 0 ? null : Stats.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevolutXFiatBalancesDetailsController$InputData[i];
        }
    }

    public RevolutXFiatBalancesDetailsController$InputData(b currency, Stats stats) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f84249a = currency;
        this.f84250b = stats;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RevolutXFiatBalancesDetailsController$InputData)) {
            return false;
        }
        RevolutXFiatBalancesDetailsController$InputData revolutXFiatBalancesDetailsController$InputData = (RevolutXFiatBalancesDetailsController$InputData) obj2;
        return Intrinsics.f(this.f84249a, revolutXFiatBalancesDetailsController$InputData.f84249a) && Intrinsics.f(this.f84250b, revolutXFiatBalancesDetailsController$InputData.f84250b);
    }

    public final int hashCode() {
        int iHashCode = this.f84249a.hashCode() * 31;
        Stats stats = this.f84250b;
        return iHashCode + (stats == null ? 0 : stats.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f84249a);
        Stats stats = this.f84250b;
        if (stats == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            stats.writeToParcel(dest, i);
        }
    }
}
