package com.revolut.feature_travel_hotels_models.property;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/property/HotelsPropertyCashback;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class HotelsPropertyCashback implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<HotelsPropertyCashback> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f98011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f98012b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HotelsPropertyCashback(parcel.readDouble(), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new HotelsPropertyCashback[i];
        }
    }

    public HotelsPropertyCashback(double d, d value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f98011a = value;
        this.f98012b = d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof HotelsPropertyCashback)) {
            return false;
        }
        HotelsPropertyCashback hotelsPropertyCashback = (HotelsPropertyCashback) obj2;
        return Intrinsics.f(this.f98011a, hotelsPropertyCashback.f98011a) && Double.compare(this.f98012b, hotelsPropertyCashback.f98012b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f98012b) + (this.f98011a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f98011a);
        dest.writeDouble(this.f98012b);
    }
}
