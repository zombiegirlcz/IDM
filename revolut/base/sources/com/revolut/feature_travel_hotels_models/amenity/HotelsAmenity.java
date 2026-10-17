package com.revolut.feature_travel_hotels_models.amenity;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/amenity/HotelsAmenity;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "oei/a", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class HotelsAmenity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<HotelsAmenity> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f97837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oei.a f97838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f97839c;
    public final String d;
    public final int e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HotelsAmenity(parcel.readString(), oei.a.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new HotelsAmenity[i];
        }
    }

    public HotelsAmenity(String id10, oei.a type, String description, String str, int i) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f97837a = id10;
        this.f97838b = type;
        this.f97839c = description;
        this.d = str;
        this.e = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof HotelsAmenity)) {
            return false;
        }
        HotelsAmenity hotelsAmenity = (HotelsAmenity) obj2;
        return Intrinsics.f(this.f97837a, hotelsAmenity.f97837a) && this.f97838b == hotelsAmenity.f97838b && Intrinsics.f(this.f97839c, hotelsAmenity.f97839c) && Intrinsics.f(this.d, hotelsAmenity.d) && this.e == hotelsAmenity.e;
    }

    public final int hashCode() {
        int iC = p.a.c((this.f97838b.hashCode() + (this.f97837a.hashCode() * 31)) * 31, 31, this.f97839c);
        String str = this.d;
        return Integer.hashCode(this.e) + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f97837a);
        dest.writeString(this.f97838b.name());
        dest.writeString(this.f97839c);
        dest.writeString(this.d);
        dest.writeInt(this.e);
    }
}
