package com.revolut.feature_travel_hotels_models.booking.details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.rev_points.models.RevPoints;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/booking/details/CancellationRefundBreakdown;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CancellationRefundBreakdown implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CancellationRefundBreakdown> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f97878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f97879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f97880c;
    public final d d;
    public final PointsMonetaryValue e;
    public final d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final PointsMonetaryValue f97881g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final RevPoints f97882h;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CancellationRefundBreakdown((d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), parcel.readInt() == 0 ? null : PointsMonetaryValue.CREATOR.createFromParcel(parcel), (d) parcel.readSerializable(), parcel.readInt() != 0 ? PointsMonetaryValue.CREATOR.createFromParcel(parcel) : null, (RevPoints) parcel.readParcelable(CancellationRefundBreakdown.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CancellationRefundBreakdown[i];
        }
    }

    public CancellationRefundBreakdown(d dVar, d dVar2, d dVar3, d dVar4, PointsMonetaryValue pointsMonetaryValue, d dVar5, PointsMonetaryValue pointsMonetaryValue2, RevPoints revPoints) {
        this.f97878a = dVar;
        this.f97879b = dVar2;
        this.f97880c = dVar3;
        this.d = dVar4;
        this.e = pointsMonetaryValue;
        this.f = dVar5;
        this.f97881g = pointsMonetaryValue2;
        this.f97882h = revPoints;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CancellationRefundBreakdown)) {
            return false;
        }
        CancellationRefundBreakdown cancellationRefundBreakdown = (CancellationRefundBreakdown) obj2;
        return Intrinsics.f(this.f97878a, cancellationRefundBreakdown.f97878a) && Intrinsics.f(this.f97879b, cancellationRefundBreakdown.f97879b) && Intrinsics.f(this.f97880c, cancellationRefundBreakdown.f97880c) && Intrinsics.f(this.d, cancellationRefundBreakdown.d) && Intrinsics.f(this.e, cancellationRefundBreakdown.e) && Intrinsics.f(this.f, cancellationRefundBreakdown.f) && Intrinsics.f(this.f97881g, cancellationRefundBreakdown.f97881g) && Intrinsics.f(this.f97882h, cancellationRefundBreakdown.f97882h);
    }

    public final int hashCode() {
        d dVar = this.f97878a;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        d dVar2 = this.f97879b;
        int iHashCode2 = (iHashCode + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        d dVar3 = this.f97880c;
        int iHashCode3 = (iHashCode2 + (dVar3 == null ? 0 : dVar3.hashCode())) * 31;
        d dVar4 = this.d;
        int iHashCode4 = (iHashCode3 + (dVar4 == null ? 0 : dVar4.hashCode())) * 31;
        PointsMonetaryValue pointsMonetaryValue = this.e;
        int iHashCode5 = (iHashCode4 + (pointsMonetaryValue == null ? 0 : pointsMonetaryValue.hashCode())) * 31;
        d dVar5 = this.f;
        int iHashCode6 = (iHashCode5 + (dVar5 == null ? 0 : dVar5.hashCode())) * 31;
        PointsMonetaryValue pointsMonetaryValue2 = this.f97881g;
        int iHashCode7 = (iHashCode6 + (pointsMonetaryValue2 == null ? 0 : pointsMonetaryValue2.hashCode())) * 31;
        RevPoints revPoints = this.f97882h;
        return iHashCode7 + (revPoints != null ? revPoints.f83960a.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f97878a);
        dest.writeSerializable(this.f97879b);
        dest.writeSerializable(this.f97880c);
        dest.writeSerializable(this.d);
        PointsMonetaryValue pointsMonetaryValue = this.e;
        if (pointsMonetaryValue == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            pointsMonetaryValue.writeToParcel(dest, i);
        }
        dest.writeSerializable(this.f);
        PointsMonetaryValue pointsMonetaryValue2 = this.f97881g;
        if (pointsMonetaryValue2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            pointsMonetaryValue2.writeToParcel(dest, i);
        }
        dest.writeParcelable(this.f97882h, i);
    }
}
