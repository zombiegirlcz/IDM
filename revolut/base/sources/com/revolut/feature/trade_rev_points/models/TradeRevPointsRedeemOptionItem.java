package com.revolut.feature.trade_rev_points.models;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trade_rev_points/models/TradeRevPointsRedeemOptionItem;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_trade_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TradeRevPointsRedeemOptionItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TradeRevPointsRedeemOptionItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f91198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f91199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f91200c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TradeRevPointsRedeemOptionItem((d) parcel.readSerializable(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TradeRevPointsRedeemOptionItem[i];
        }
    }

    public TradeRevPointsRedeemOptionItem(d startingPrice, String title, String icon) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(startingPrice, "startingPrice");
        this.f91198a = title;
        this.f91199b = icon;
        this.f91200c = startingPrice;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TradeRevPointsRedeemOptionItem)) {
            return false;
        }
        TradeRevPointsRedeemOptionItem tradeRevPointsRedeemOptionItem = (TradeRevPointsRedeemOptionItem) obj2;
        return Intrinsics.f(this.f91198a, tradeRevPointsRedeemOptionItem.f91198a) && Intrinsics.f(this.f91199b, tradeRevPointsRedeemOptionItem.f91199b) && Intrinsics.f(this.f91200c, tradeRevPointsRedeemOptionItem.f91200c);
    }

    public final int hashCode() {
        return this.f91200c.hashCode() + p.a.c(this.f91198a.hashCode() * 31, 31, this.f91199b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f91198a);
        dest.writeString(this.f91199b);
        dest.writeSerializable(this.f91200c);
    }
}
