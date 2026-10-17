package com.revolut.feature.trade_rev_points.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u2f.c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trade_rev_points/models/TradeRevPointsAccountTransferLimit;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_trade_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TradeRevPointsAccountTransferLimit implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TradeRevPointsAccountTransferLimit> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f91184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f91185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f91186c;
    public final c d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TradeRevPointsAccountTransferLimit(parcel.readInt(), parcel.readInt(), parcel.readInt(), c.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TradeRevPointsAccountTransferLimit[i];
        }
    }

    public TradeRevPointsAccountTransferLimit(int i, int i2, int i3, c period) {
        Intrinsics.checkNotNullParameter(period, "period");
        this.f91184a = i;
        this.f91185b = i2;
        this.f91186c = i3;
        this.d = period;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TradeRevPointsAccountTransferLimit)) {
            return false;
        }
        TradeRevPointsAccountTransferLimit tradeRevPointsAccountTransferLimit = (TradeRevPointsAccountTransferLimit) obj2;
        return this.f91184a == tradeRevPointsAccountTransferLimit.f91184a && this.f91185b == tradeRevPointsAccountTransferLimit.f91185b && this.f91186c == tradeRevPointsAccountTransferLimit.f91186c && this.d == tradeRevPointsAccountTransferLimit.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + j6.a.b(this.f91186c, j6.a.b(this.f91185b, Integer.hashCode(this.f91184a) * 31, 31), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f91184a);
        dest.writeInt(this.f91185b);
        dest.writeInt(this.f91186c);
        dest.writeString(this.d.name());
    }
}
