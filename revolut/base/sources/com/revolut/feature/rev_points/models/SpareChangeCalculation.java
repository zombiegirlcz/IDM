package com.revolut.feature.rev_points.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/models/SpareChangeCalculation;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SpareChangeCalculation implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SpareChangeCalculation> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f84081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SpareChangeAmount f84082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RevPoints f84083c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SpareChangeCalculation(parcel.readInt(), SpareChangeAmount.CREATOR.createFromParcel(parcel), RevPoints.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SpareChangeCalculation[i];
        }
    }

    public SpareChangeCalculation(int i, SpareChangeAmount roundUp, RevPoints points) {
        Intrinsics.checkNotNullParameter(roundUp, "roundUp");
        Intrinsics.checkNotNullParameter(points, "points");
        this.f84081a = i;
        this.f84082b = roundUp;
        this.f84083c = points;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SpareChangeCalculation)) {
            return false;
        }
        SpareChangeCalculation spareChangeCalculation = (SpareChangeCalculation) obj2;
        return this.f84081a == spareChangeCalculation.f84081a && Intrinsics.f(this.f84082b, spareChangeCalculation.f84082b) && Intrinsics.f(this.f84083c, spareChangeCalculation.f84083c);
    }

    public final int hashCode() {
        return this.f84083c.f83960a.hashCode() + ((this.f84082b.hashCode() + (Integer.hashCode(this.f84081a) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f84081a);
        this.f84082b.writeToParcel(dest, i);
        this.f84083c.writeToParcel(dest, i);
    }
}
