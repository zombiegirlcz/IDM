package com.revolut.feature.store.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.rev_points.models.RevPoints;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/store/api/model/StoreAuctionOffer;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_store_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StoreAuctionOffer implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<StoreAuctionOffer> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f88422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f88423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RevPoints f88424c;
    public final String d;
    public final String e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StoreAuctionOffer((RevPoints) parcel.readParcelable(StoreAuctionOffer.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StoreAuctionOffer[i];
        }
    }

    public StoreAuctionOffer(RevPoints currentBid, String id10, String endTime, String str, String str2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(endTime, "endTime");
        Intrinsics.checkNotNullParameter(currentBid, "currentBid");
        this.f88422a = id10;
        this.f88423b = endTime;
        this.f88424c = currentBid;
        this.d = str;
        this.e = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StoreAuctionOffer)) {
            return false;
        }
        StoreAuctionOffer storeAuctionOffer = (StoreAuctionOffer) obj2;
        return Intrinsics.f(this.f88422a, storeAuctionOffer.f88422a) && Intrinsics.f(this.f88423b, storeAuctionOffer.f88423b) && Intrinsics.f(this.f88424c, storeAuctionOffer.f88424c) && Intrinsics.f(this.d, storeAuctionOffer.d) && Intrinsics.f(this.e, storeAuctionOffer.e);
    }

    public final int hashCode() {
        int iC = v7.c(p.a.c(this.f88422a.hashCode() * 31, 31, this.f88423b), 31, this.f88424c.f83960a);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f88422a);
        dest.writeString(this.f88423b);
        dest.writeParcelable(this.f88424c, i);
        dest.writeString(this.d);
        dest.writeString(this.e);
    }
}
