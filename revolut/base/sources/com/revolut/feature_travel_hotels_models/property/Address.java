package com.revolut.feature_travel_hotels_models.property;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/property/Address;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Address implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Address> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f97966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f97967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f97968c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f97969g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Address(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Address[i];
        }
    }

    public Address(String str, String str2, String str3, String str4, String country, String str5, String str6) {
        Intrinsics.checkNotNullParameter(country, "country");
        this.f97966a = str;
        this.f97967b = str2;
        this.f97968c = str3;
        this.d = str4;
        this.e = country;
        this.f = str5;
        this.f97969g = str6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Address)) {
            return false;
        }
        Address address = (Address) obj2;
        return Intrinsics.f(this.f97966a, address.f97966a) && Intrinsics.f(this.f97967b, address.f97967b) && Intrinsics.f(this.f97968c, address.f97968c) && Intrinsics.f(this.d, address.d) && Intrinsics.f(this.e, address.e) && Intrinsics.f(this.f, address.f) && Intrinsics.f(this.f97969g, address.f97969g);
    }

    public final int hashCode() {
        String str = this.f97966a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f97967b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f97968c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iC = p.a.c((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.e);
        String str5 = this.f;
        int iHashCode4 = (iC + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f97969g;
        return iHashCode4 + (str6 != null ? str6.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f97966a);
        dest.writeString(this.f97967b);
        dest.writeString(this.f97968c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
        dest.writeString(this.f97969g);
    }
}
