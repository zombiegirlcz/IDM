package com.revolut.feature.rev_points.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m1c.f1;
import m1c.r;
import m72.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/models/RevPointsProductRate;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevPointsProductRate implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RevPointsProductRate> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f84035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f1 f84036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f84037c;
    public final double d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RevPointsProductRate(r.valueOf(parcel.readString()), f1.valueOf(parcel.readString()), parcel.readDouble(), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevPointsProductRate[i];
        }
    }

    public RevPointsProductRate(r tier, f1 product, double d, double d5) {
        Intrinsics.checkNotNullParameter(tier, "tier");
        Intrinsics.checkNotNullParameter(product, "product");
        this.f84035a = tier;
        this.f84036b = product;
        this.f84037c = d;
        this.d = d5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RevPointsProductRate)) {
            return false;
        }
        RevPointsProductRate revPointsProductRate = (RevPointsProductRate) obj2;
        return this.f84035a == revPointsProductRate.f84035a && this.f84036b == revPointsProductRate.f84036b && Double.compare(this.f84037c, revPointsProductRate.f84037c) == 0 && Double.compare(this.d, revPointsProductRate.d) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.d) + b.c((this.f84036b.hashCode() + (this.f84035a.hashCode() * 31)) * 31, this.f84037c, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f84035a.name());
        dest.writeString(this.f84036b.name());
        dest.writeDouble(this.f84037c);
        dest.writeDouble(this.d);
    }
}
