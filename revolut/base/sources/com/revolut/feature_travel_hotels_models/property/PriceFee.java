package com.revolut.feature_travel_hotels_models.property;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ufi.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/property/PriceFee;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PriceFee implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PriceFee> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f98063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f98064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f98065c;
    public final d d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PriceFee(b.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0, (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PriceFee[i];
        }
    }

    public PriceFee(b type, String str, boolean z, d value) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f98063a = type;
        this.f98064b = str;
        this.f98065c = z;
        this.d = value;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PriceFee)) {
            return false;
        }
        PriceFee priceFee = (PriceFee) obj2;
        return this.f98063a == priceFee.f98063a && Intrinsics.f(this.f98064b, priceFee.f98064b) && this.f98065c == priceFee.f98065c && Intrinsics.f(this.d, priceFee.d);
    }

    public final int hashCode() {
        int iHashCode = this.f98063a.hashCode() * 31;
        String str = this.f98064b;
        return this.d.hashCode() + j6.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f98065c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f98063a.name());
        dest.writeString(this.f98064b);
        dest.writeInt(this.f98065c ? 1 : 0);
        dest.writeSerializable(this.d);
    }
}
