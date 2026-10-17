package com.revolut.feature.rev_points.models;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m1c.w1;
import m72.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/models/SpareChangeRefund;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SpareChangeRefund implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SpareChangeRefund> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1 f84090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f84091c;
    public final d d;
    public final d e;
    public final Long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f84092g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SpareChangeRefund(parcel.readString(), w1.valueOf(parcel.readString()), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SpareChangeRefund[i];
        }
    }

    public SpareChangeRefund(String id10, w1 state, d reversalAmount, d refundAmount, d dVar, Long l2, Long l3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(reversalAmount, "reversalAmount");
        Intrinsics.checkNotNullParameter(refundAmount, "refundAmount");
        this.f84089a = id10;
        this.f84090b = state;
        this.f84091c = reversalAmount;
        this.d = refundAmount;
        this.e = dVar;
        this.f = l2;
        this.f84092g = l3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SpareChangeRefund)) {
            return false;
        }
        SpareChangeRefund spareChangeRefund = (SpareChangeRefund) obj2;
        return Intrinsics.f(this.f84089a, spareChangeRefund.f84089a) && this.f84090b == spareChangeRefund.f84090b && Intrinsics.f(this.f84091c, spareChangeRefund.f84091c) && Intrinsics.f(this.d, spareChangeRefund.d) && Intrinsics.f(this.e, spareChangeRefund.e) && Intrinsics.f(this.f, spareChangeRefund.f) && Intrinsics.f(this.f84092g, spareChangeRefund.f84092g);
    }

    public final int hashCode() {
        int iC = v7.c(v7.c((this.f84090b.hashCode() + (this.f84089a.hashCode() * 31)) * 31, 31, this.f84091c), 31, this.d);
        d dVar = this.e;
        int iHashCode = (iC + (dVar == null ? 0 : dVar.hashCode())) * 31;
        Long l2 = this.f;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f84092g;
        return iHashCode2 + (l3 != null ? l3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f84089a);
        dest.writeString(this.f84090b.name());
        dest.writeSerializable(this.f84091c);
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
        Long l2 = this.f;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            b.A(dest, 1, l2);
        }
        Long l3 = this.f84092g;
        if (l3 == null) {
            dest.writeInt(0);
        } else {
            b.A(dest, 1, l3);
        }
    }
}
