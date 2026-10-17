package com.revolut.feature.rev_points.models;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m1c.f1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/models/RevPointsYearlySaving;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevPointsYearlySaving implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RevPointsYearlySaving> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f1 f84074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f84075b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RevPointsYearlySaving(f1.valueOf(parcel.readString()), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevPointsYearlySaving[i];
        }
    }

    public RevPointsYearlySaving(f1 product, d value) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f84074a = product;
        this.f84075b = value;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RevPointsYearlySaving)) {
            return false;
        }
        RevPointsYearlySaving revPointsYearlySaving = (RevPointsYearlySaving) obj2;
        return this.f84074a == revPointsYearlySaving.f84074a && Intrinsics.f(this.f84075b, revPointsYearlySaving.f84075b);
    }

    public final int hashCode() {
        return this.f84075b.hashCode() + (this.f84074a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f84074a.name());
        dest.writeSerializable(this.f84075b);
    }
}
