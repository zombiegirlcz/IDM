package com.revolut.feature.atm.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/atm/api/model/AtmLocation;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_atm_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AtmLocation implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AtmLocation> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f63138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f63139b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AtmLocation(parcel.readDouble(), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AtmLocation[i];
        }
    }

    public AtmLocation(double d, double d5) {
        this.f63138a = d;
        this.f63139b = d5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AtmLocation)) {
            return false;
        }
        AtmLocation atmLocation = (AtmLocation) obj2;
        return Double.compare(this.f63138a, atmLocation.f63138a) == 0 && Double.compare(this.f63139b, atmLocation.f63139b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f63139b) + (Double.hashCode(this.f63138a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeDouble(this.f63138a);
        dest.writeDouble(this.f63139b);
    }
}
