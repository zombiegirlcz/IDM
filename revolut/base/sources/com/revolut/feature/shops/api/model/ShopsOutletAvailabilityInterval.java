package com.revolut.feature.shops.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalTime;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shops/api/model/ShopsOutletAvailabilityInterval;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shops_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ShopsOutletAvailabilityInterval implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ShopsOutletAvailabilityInterval> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalTime f87059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalTime f87060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f87061c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ShopsOutletAvailabilityInterval((LocalTime) parcel.readSerializable(), (LocalTime) parcel.readSerializable(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ShopsOutletAvailabilityInterval[i];
        }
    }

    public ShopsOutletAvailabilityInterval(LocalTime start, LocalTime end2, boolean z) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end2, "end");
        this.f87059a = start;
        this.f87060b = end2;
        this.f87061c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ShopsOutletAvailabilityInterval)) {
            return false;
        }
        ShopsOutletAvailabilityInterval shopsOutletAvailabilityInterval = (ShopsOutletAvailabilityInterval) obj2;
        return Intrinsics.f(this.f87059a, shopsOutletAvailabilityInterval.f87059a) && Intrinsics.f(this.f87060b, shopsOutletAvailabilityInterval.f87060b) && this.f87061c == shopsOutletAvailabilityInterval.f87061c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f87061c) + ((this.f87060b.hashCode() + (this.f87059a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f87059a);
        dest.writeSerializable(this.f87060b);
        dest.writeInt(this.f87061c ? 1 : 0);
    }
}
