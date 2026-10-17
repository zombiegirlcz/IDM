package com.revolut.feature.freelancer.common.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/FreelancerOrderCustomer;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FreelancerOrderCustomer implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FreelancerOrderCustomer> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f73305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f73306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f73307c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FreelancerOrderCustomer(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FreelancerOrderCustomer[i];
        }
    }

    public FreelancerOrderCustomer(String id10, String str, String str2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f73305a = id10;
        this.f73306b = str;
        this.f73307c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FreelancerOrderCustomer)) {
            return false;
        }
        FreelancerOrderCustomer freelancerOrderCustomer = (FreelancerOrderCustomer) obj2;
        return Intrinsics.f(this.f73305a, freelancerOrderCustomer.f73305a) && Intrinsics.f(this.f73306b, freelancerOrderCustomer.f73306b) && Intrinsics.f(this.f73307c, freelancerOrderCustomer.f73307c);
    }

    public final int hashCode() {
        int iHashCode = this.f73305a.hashCode() * 31;
        String str = this.f73306b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f73307c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f73305a);
        dest.writeString(this.f73306b);
        dest.writeString(this.f73307c);
    }
}
