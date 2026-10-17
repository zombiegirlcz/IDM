package com.revolut.feature.trade_rev_points.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u2f.k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/trade_rev_points/models/TradeRevPointsRate;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Display", "feature_trade_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TradeRevPointsRate implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TradeRevPointsRate> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f91190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f91191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f91192c;
    public final Display d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trade_rev_points/models/TradeRevPointsRate$Display;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_trade_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Display implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Display> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f91193a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f91194b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Display(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Display[i];
            }
        }

        public Display(String revPoints, String partnerPoints) {
            Intrinsics.checkNotNullParameter(revPoints, "revPoints");
            Intrinsics.checkNotNullParameter(partnerPoints, "partnerPoints");
            this.f91193a = revPoints;
            this.f91194b = partnerPoints;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Display)) {
                return false;
            }
            Display display = (Display) obj2;
            return Intrinsics.f(this.f91193a, display.f91193a) && Intrinsics.f(this.f91194b, display.f91194b);
        }

        public final int hashCode() {
            return this.f91194b.hashCode() + (this.f91193a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f91193a);
            dest.writeString(this.f91194b);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TradeRevPointsRate(parcel.readDouble(), parcel.readString(), k.valueOf(parcel.readString()), Display.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TradeRevPointsRate[i];
        }
    }

    public TradeRevPointsRate(double d, String partnerPointsBuyRateRaw, k partnerUnit, Display display) {
        Intrinsics.checkNotNullParameter(partnerPointsBuyRateRaw, "partnerPointsBuyRateRaw");
        Intrinsics.checkNotNullParameter(partnerUnit, "partnerUnit");
        Intrinsics.checkNotNullParameter(display, "display");
        this.f91190a = d;
        this.f91191b = partnerPointsBuyRateRaw;
        this.f91192c = partnerUnit;
        this.d = display;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TradeRevPointsRate)) {
            return false;
        }
        TradeRevPointsRate tradeRevPointsRate = (TradeRevPointsRate) obj2;
        return Double.compare(this.f91190a, tradeRevPointsRate.f91190a) == 0 && Intrinsics.f(this.f91191b, tradeRevPointsRate.f91191b) && this.f91192c == tradeRevPointsRate.f91192c && Intrinsics.f(this.d, tradeRevPointsRate.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f91192c.hashCode() + p.a.c(Double.hashCode(this.f91190a) * 31, 31, this.f91191b)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeDouble(this.f91190a);
        dest.writeString(this.f91191b);
        dest.writeString(this.f91192c.name());
        this.d.writeToParcel(dest, i);
    }
}
