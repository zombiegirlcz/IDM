package com.revolut.feature.trade_rev_points.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u2f.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trade_rev_points/models/TradeRevPointsAccount;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_trade_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TradeRevPointsAccount implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TradeRevPointsAccount> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f91181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f91182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f91183c;
    public final TradeRevPointsLoyaltyProgrammeSummary d;
    public final List e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TradeRevPointsAccount(parcel.readString(), j.valueOf(parcel.readString()), parcel.readString(), TradeRevPointsLoyaltyProgrammeSummary.CREATOR.createFromParcel(parcel), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TradeRevPointsAccount[i];
        }
    }

    public TradeRevPointsAccount(String id10, j product, String externalId, TradeRevPointsLoyaltyProgrammeSummary loyaltyProgramme, List primaryAgents) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(externalId, "externalId");
        Intrinsics.checkNotNullParameter(loyaltyProgramme, "loyaltyProgramme");
        Intrinsics.checkNotNullParameter(primaryAgents, "primaryAgents");
        this.f91181a = id10;
        this.f91182b = product;
        this.f91183c = externalId;
        this.d = loyaltyProgramme;
        this.e = primaryAgents;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TradeRevPointsAccount)) {
            return false;
        }
        TradeRevPointsAccount tradeRevPointsAccount = (TradeRevPointsAccount) obj2;
        return Intrinsics.f(this.f91181a, tradeRevPointsAccount.f91181a) && this.f91182b == tradeRevPointsAccount.f91182b && Intrinsics.f(this.f91183c, tradeRevPointsAccount.f91183c) && Intrinsics.f(this.d, tradeRevPointsAccount.d) && Intrinsics.f(this.e, tradeRevPointsAccount.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + p.a.c((this.f91182b.hashCode() + (this.f91181a.hashCode() * 31)) * 31, 31, this.f91183c)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f91181a);
        dest.writeString(this.f91182b.name());
        dest.writeString(this.f91183c);
        this.d.writeToParcel(dest, i);
        dest.writeStringList(this.e);
    }
}
