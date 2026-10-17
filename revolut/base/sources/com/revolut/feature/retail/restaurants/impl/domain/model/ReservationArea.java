package com.revolut.feature.retail.restaurants.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/retail/restaurants/impl/domain/model/ReservationArea;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_retail_restaurants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ReservationArea implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f82827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f82828b;

    @NotNull
    public static final Parcelable.Creator<ReservationArea> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ReservationArea(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ReservationArea[i];
        }
    }

    public ReservationArea(String id10, String name) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f82827a = id10;
        this.f82828b = name;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ReservationArea)) {
            return false;
        }
        ReservationArea reservationArea = (ReservationArea) obj2;
        return Intrinsics.f(this.f82827a, reservationArea.f82827a) && Intrinsics.f(this.f82828b, reservationArea.f82828b);
    }

    public final int hashCode() {
        return this.f82828b.hashCode() + (this.f82827a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f82827a);
        dest.writeString(this.f82828b);
    }
}
