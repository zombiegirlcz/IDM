package com.revolut.feature.shops.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import h30.l;
import java.time.ZonedDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;
import shd.c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0006\u0007\bJ\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/revolut/feature/shops/api/model/ShopsAuction;", "Lcom/revolut/feature/shops/api/model/ShopsContext;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Offer", "Bid", "shd/c", "feature_shops_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ShopsAuction implements ShopsContext, Parcelable {

    @NotNull
    public static final Parcelable.Creator<ShopsAuction> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Offer f87010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bid f87011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f87012c;
    public final String d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shops/api/model/ShopsAuction$Bid;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shops_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Bid implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Bid> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final double f87013a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c f87014b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Bid(parcel.readDouble(), c.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Bid[i];
            }
        }

        public Bid(double d, c status) {
            Intrinsics.checkNotNullParameter(status, "status");
            this.f87013a = d;
            this.f87014b = status;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Bid)) {
                return false;
            }
            Bid bid2 = (Bid) obj2;
            return Double.compare(this.f87013a, bid2.f87013a) == 0 && this.f87014b == bid2.f87014b;
        }

        public final int hashCode() {
            return this.f87014b.hashCode() + (Double.hashCode(this.f87013a) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeDouble(this.f87013a);
            dest.writeString(this.f87014b.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shops/api/model/ShopsAuction$Offer;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shops_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Offer implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Offer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f87015a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ZonedDateTime f87016b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final double f87017c;
        public final String d;
        public final String e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Offer(parcel.readString(), (ZonedDateTime) parcel.readSerializable(), parcel.readDouble(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Offer[i];
            }
        }

        public Offer(String id10, ZonedDateTime endTime, double d, String str, String analyticsRef) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(endTime, "endTime");
            Intrinsics.checkNotNullParameter(analyticsRef, "analyticsRef");
            this.f87015a = id10;
            this.f87016b = endTime;
            this.f87017c = d;
            this.d = str;
            this.e = analyticsRef;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Offer)) {
                return false;
            }
            Offer offer = (Offer) obj2;
            return Intrinsics.f(this.f87015a, offer.f87015a) && Intrinsics.f(this.f87016b, offer.f87016b) && Double.compare(this.f87017c, offer.f87017c) == 0 && Intrinsics.f(this.d, offer.d) && Intrinsics.f(this.e, offer.e);
        }

        public final int hashCode() {
            int iC = b.c(l.h(this.f87016b, this.f87015a.hashCode() * 31, 31), this.f87017c, 31);
            String str = this.d;
            return this.e.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f87015a);
            dest.writeSerializable(this.f87016b);
            dest.writeDouble(this.f87017c);
            dest.writeString(this.d);
            dest.writeString(this.e);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ShopsAuction(Offer.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Bid.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ShopsAuction[i];
        }
    }

    public ShopsAuction(Offer offer, Bid bid2, String carouselId, String analyticsRef) {
        Intrinsics.checkNotNullParameter(offer, "offer");
        Intrinsics.checkNotNullParameter(carouselId, "carouselId");
        Intrinsics.checkNotNullParameter(analyticsRef, "analyticsRef");
        this.f87010a = offer;
        this.f87011b = bid2;
        this.f87012c = carouselId;
        this.d = analyticsRef;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ShopsAuction)) {
            return false;
        }
        ShopsAuction shopsAuction = (ShopsAuction) obj2;
        return Intrinsics.f(this.f87010a, shopsAuction.f87010a) && Intrinsics.f(this.f87011b, shopsAuction.f87011b) && Intrinsics.f(this.f87012c, shopsAuction.f87012c) && Intrinsics.f(this.d, shopsAuction.d);
    }

    public final int hashCode() {
        int iHashCode = this.f87010a.hashCode() * 31;
        Bid bid2 = this.f87011b;
        return this.d.hashCode() + p.a.c((iHashCode + (bid2 == null ? 0 : bid2.hashCode())) * 31, 31, this.f87012c);
    }

    @Override // com.revolut.feature.shops.api.model.ShopsContext
    /* JADX INFO: renamed from: o0, reason: from getter */
    public final String getD() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f87010a.writeToParcel(dest, i);
        Bid bid2 = this.f87011b;
        if (bid2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            bid2.writeToParcel(dest, i);
        }
        dest.writeString(this.f87012c);
        dest.writeString(this.d);
    }
}
