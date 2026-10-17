package com.revolut.feature.trade_rev_points.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u2f.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trade_rev_points/models/TradeRevPointsLoyaltyProgrammeSummary;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_trade_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TradeRevPointsLoyaltyProgrammeSummary implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TradeRevPointsLoyaltyProgrammeSummary> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f91187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f91188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f91189c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TradeRevPointsLoyaltyProgrammeSummary(parcel.readString(), j.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TradeRevPointsLoyaltyProgrammeSummary[i];
        }
    }

    public TradeRevPointsLoyaltyProgrammeSummary(String id10, j product, String name, String logoUrl) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
        this.f91187a = id10;
        this.f91188b = product;
        this.f91189c = name;
        this.d = logoUrl;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TradeRevPointsLoyaltyProgrammeSummary)) {
            return false;
        }
        TradeRevPointsLoyaltyProgrammeSummary tradeRevPointsLoyaltyProgrammeSummary = (TradeRevPointsLoyaltyProgrammeSummary) obj2;
        return Intrinsics.f(this.f91187a, tradeRevPointsLoyaltyProgrammeSummary.f91187a) && this.f91188b == tradeRevPointsLoyaltyProgrammeSummary.f91188b && Intrinsics.f(this.f91189c, tradeRevPointsLoyaltyProgrammeSummary.f91189c) && Intrinsics.f(this.d, tradeRevPointsLoyaltyProgrammeSummary.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c((this.f91188b.hashCode() + (this.f91187a.hashCode() * 31)) * 31, 31, this.f91189c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f91187a);
        dest.writeString(this.f91188b.name());
        dest.writeString(this.f91189c);
        dest.writeString(this.d);
    }
}
