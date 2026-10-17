package com.revolut.feature.travel.flights.models.domain.payment;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.rev_points.models.RevPoints;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/models/domain/payment/PointsRedeemOption;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PointsRedeemOption implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PointsRedeemOption> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f93539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RevPoints f93540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f93541c;
    public final String d;
    public final RevPoints e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            return new PointsRedeemOption((RevPoints) parcel.readParcelable(PointsRedeemOption.class.getClassLoader()), (RevPoints) parcel.readParcelable(PointsRedeemOption.class.getClassLoader()), (d) parcel.readSerializable(), string, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PointsRedeemOption[i];
        }
    }

    public PointsRedeemOption(RevPoints points, RevPoints pointsReward, d fiatEquivalentDiscount, String id10, String token) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(fiatEquivalentDiscount, "fiatEquivalentDiscount");
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(pointsReward, "pointsReward");
        this.f93539a = id10;
        this.f93540b = points;
        this.f93541c = fiatEquivalentDiscount;
        this.d = token;
        this.e = pointsReward;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PointsRedeemOption)) {
            return false;
        }
        PointsRedeemOption pointsRedeemOption = (PointsRedeemOption) obj2;
        return Intrinsics.f(this.f93539a, pointsRedeemOption.f93539a) && Intrinsics.f(this.f93540b, pointsRedeemOption.f93540b) && Intrinsics.f(this.f93541c, pointsRedeemOption.f93541c) && Intrinsics.f(this.d, pointsRedeemOption.d) && Intrinsics.f(this.e, pointsRedeemOption.e);
    }

    public final int hashCode() {
        return this.e.f83960a.hashCode() + p.a.c(v7.c(v7.c(this.f93539a.hashCode() * 31, 31, this.f93540b.f83960a), 31, this.f93541c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f93539a);
        dest.writeParcelable(this.f93540b, i);
        dest.writeSerializable(this.f93541c);
        dest.writeString(this.d);
        dest.writeParcelable(this.e, i);
    }
}
