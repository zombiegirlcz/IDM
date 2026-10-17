package com.revolut.feature.freelancer.common.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.address.models.Address;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/FreelancerCustomer;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FreelancerCustomer implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FreelancerCustomer> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f73281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f73282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f73283c;
    public final String d;
    public final String e;
    public final Address f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final DateTime f73284g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final DateTime f73285h;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FreelancerCustomer(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (Address) parcel.readParcelable(FreelancerCustomer.class.getClassLoader()), (DateTime) parcel.readSerializable(), (DateTime) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FreelancerCustomer[i];
        }
    }

    public FreelancerCustomer(String id10, String str, String str2, String str3, String str4, Address address, DateTime createdAt, DateTime updatedAt) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        this.f73281a = id10;
        this.f73282b = str;
        this.f73283c = str2;
        this.d = str3;
        this.e = str4;
        this.f = address;
        this.f73284g = createdAt;
        this.f73285h = updatedAt;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FreelancerCustomer)) {
            return false;
        }
        FreelancerCustomer freelancerCustomer = (FreelancerCustomer) obj2;
        return Intrinsics.f(this.f73281a, freelancerCustomer.f73281a) && Intrinsics.f(this.f73282b, freelancerCustomer.f73282b) && Intrinsics.f(this.f73283c, freelancerCustomer.f73283c) && Intrinsics.f(this.d, freelancerCustomer.d) && Intrinsics.f(this.e, freelancerCustomer.e) && Intrinsics.f(this.f, freelancerCustomer.f) && Intrinsics.f(this.f73284g, freelancerCustomer.f73284g) && Intrinsics.f(this.f73285h, freelancerCustomer.f73285h);
    }

    public final int hashCode() {
        int iHashCode = this.f73281a.hashCode() * 31;
        String str = this.f73282b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f73283c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Address address = this.f;
        return this.f73285h.hashCode() + b.f(this.f73284g, (iHashCode5 + (address != null ? address.hashCode() : 0)) * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f73281a);
        dest.writeString(this.f73282b);
        dest.writeString(this.f73283c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeParcelable(this.f, i);
        dest.writeSerializable(this.f73284g);
        dest.writeSerializable(this.f73285h);
    }
}
