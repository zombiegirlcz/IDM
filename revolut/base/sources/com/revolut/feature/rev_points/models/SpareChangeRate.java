package com.revolut.feature.rev_points.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/models/SpareChangeRate;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SpareChangeRate implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SpareChangeRate> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f84087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RevPoints f84088b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SpareChangeRate(parcel.readInt(), RevPoints.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SpareChangeRate[i];
        }
    }

    public SpareChangeRate(int i, RevPoints points) {
        Intrinsics.checkNotNullParameter(points, "points");
        this.f84087a = i;
        this.f84088b = points;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SpareChangeRate)) {
            return false;
        }
        SpareChangeRate spareChangeRate = (SpareChangeRate) obj2;
        return this.f84087a == spareChangeRate.f84087a && Intrinsics.f(this.f84088b, spareChangeRate.f84088b);
    }

    public final int hashCode() {
        return this.f84088b.f83960a.hashCode() + (Integer.hashCode(this.f84087a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f84087a);
        this.f84088b.writeToParcel(dest, i);
    }
}
