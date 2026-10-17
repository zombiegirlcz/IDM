package com.revolut.feature.rev_points.models;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r6.b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/models/IssuedPoints;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IssuedPoints implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<IssuedPoints> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f83947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f83948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f83949c;
    public final d d;
    public final d e;
    public final TimeInterval f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final PointsSource f83950g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Instant f83951h;
    public final Instant i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Instant f83952j;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new IssuedPoints(parcel.readString(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), TimeInterval.CREATOR.createFromParcel(parcel), PointsSource.CREATOR.createFromParcel(parcel), (Instant) parcel.readSerializable(), (Instant) parcel.readSerializable(), (Instant) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new IssuedPoints[i];
        }
    }

    public IssuedPoints(String id10, d amount, d utilisedAmount, d expiredAmount, d remainingUnused, TimeInterval period, PointsSource source, Instant expirationDate, Instant createdDate, Instant updatedDate) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(utilisedAmount, "utilisedAmount");
        Intrinsics.checkNotNullParameter(expiredAmount, "expiredAmount");
        Intrinsics.checkNotNullParameter(remainingUnused, "remainingUnused");
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        Intrinsics.checkNotNullParameter(updatedDate, "updatedDate");
        this.f83947a = id10;
        this.f83948b = amount;
        this.f83949c = utilisedAmount;
        this.d = expiredAmount;
        this.e = remainingUnused;
        this.f = period;
        this.f83950g = source;
        this.f83951h = expirationDate;
        this.i = createdDate;
        this.f83952j = updatedDate;
    }

    public final LocalDate a() {
        ZoneId zoneId = g0m.a.f139502a;
        LocalDate localDateMinusDays = oi0.d.V(this.f83951h, g0m.a.f139502a).minusDays(1L);
        Intrinsics.checkNotNullExpressionValue(localDateMinusDays, "minusDays(...)");
        return localDateMinusDays;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof IssuedPoints)) {
            return false;
        }
        IssuedPoints issuedPoints = (IssuedPoints) obj2;
        return Intrinsics.f(this.f83947a, issuedPoints.f83947a) && Intrinsics.f(this.f83948b, issuedPoints.f83948b) && Intrinsics.f(this.f83949c, issuedPoints.f83949c) && Intrinsics.f(this.d, issuedPoints.d) && Intrinsics.f(this.e, issuedPoints.e) && Intrinsics.f(this.f, issuedPoints.f) && Intrinsics.f(this.f83950g, issuedPoints.f83950g) && Intrinsics.f(this.f83951h, issuedPoints.f83951h) && Intrinsics.f(this.i, issuedPoints.i) && Intrinsics.f(this.f83952j, issuedPoints.f83952j);
    }

    public final int hashCode() {
        return this.f83952j.hashCode() + b.c(b.c((this.f83950g.hashCode() + ((this.f.hashCode() + v7.c(v7.c(v7.c(v7.c(this.f83947a.hashCode() * 31, 31, this.f83948b), 31, this.f83949c), 31, this.d), 31, this.e)) * 31)) * 31, 31, this.f83951h), 31, this.i);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f83947a);
        dest.writeSerializable(this.f83948b);
        dest.writeSerializable(this.f83949c);
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
        this.f.writeToParcel(dest, i);
        this.f83950g.writeToParcel(dest, i);
        dest.writeSerializable(this.f83951h);
        dest.writeSerializable(this.i);
        dest.writeSerializable(this.f83952j);
    }
}
