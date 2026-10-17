package com.revolut.feature.rev_points.models;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m1c.f1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/models/RevPointsEarningRate;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevPointsEarningRate implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RevPointsEarningRate> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f1 f83975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RevPoints f83976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f83977c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RevPointsEarningRate(f1.valueOf(parcel.readString()), RevPoints.CREATOR.createFromParcel(parcel), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevPointsEarningRate[i];
        }
    }

    public RevPointsEarningRate(f1 product, RevPoints pointsForCardSpend, d cashForCardSpend) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(pointsForCardSpend, "pointsForCardSpend");
        Intrinsics.checkNotNullParameter(cashForCardSpend, "cashForCardSpend");
        this.f83975a = product;
        this.f83976b = pointsForCardSpend;
        this.f83977c = cashForCardSpend;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RevPointsEarningRate)) {
            return false;
        }
        RevPointsEarningRate revPointsEarningRate = (RevPointsEarningRate) obj2;
        return this.f83975a == revPointsEarningRate.f83975a && Intrinsics.f(this.f83976b, revPointsEarningRate.f83976b) && Intrinsics.f(this.f83977c, revPointsEarningRate.f83977c);
    }

    public final int hashCode() {
        return this.f83977c.hashCode() + v7.c(this.f83975a.hashCode() * 31, 31, this.f83976b.f83960a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f83975a.name());
        this.f83976b.writeToParcel(dest, i);
        dest.writeSerializable(this.f83977c);
    }
}
