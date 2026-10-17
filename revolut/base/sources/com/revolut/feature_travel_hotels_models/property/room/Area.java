package com.revolut.feature_travel_hotels_models.property.room;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/property/room/Area;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "cgi/a", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Area implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Area> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f98085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cgi.a f98086b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Area(parcel.readDouble(), cgi.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Area[i];
        }
    }

    public Area(double d, cgi.a unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.f98085a = d;
        this.f98086b = unit;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Area)) {
            return false;
        }
        Area area = (Area) obj2;
        return Double.compare(this.f98085a, area.f98085a) == 0 && this.f98086b == area.f98086b;
    }

    public final int hashCode() {
        return this.f98086b.hashCode() + (Double.hashCode(this.f98085a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeDouble(this.f98085a);
        dest.writeString(this.f98086b.name());
    }
}
