package com.revolut.feature.rev_points.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m1c.f1;
import m1c.y0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/models/PointsSource;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PointsSource implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PointsSource> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f1 f83957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0 f83958b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PointsSource(f1.valueOf(parcel.readString()), y0.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PointsSource[i];
        }
    }

    public PointsSource(f1 type, y0 category) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(category, "category");
        this.f83957a = type;
        this.f83958b = category;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PointsSource)) {
            return false;
        }
        PointsSource pointsSource = (PointsSource) obj2;
        return this.f83957a == pointsSource.f83957a && this.f83958b == pointsSource.f83958b;
    }

    public final int hashCode() {
        return this.f83958b.hashCode() + (this.f83957a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f83957a.name());
        dest.writeString(this.f83958b.name());
    }
}
