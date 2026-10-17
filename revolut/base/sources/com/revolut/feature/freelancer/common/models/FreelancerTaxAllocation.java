package com.revolut.feature.freelancer.common.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/FreelancerTaxAllocation;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FreelancerTaxAllocation implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FreelancerTaxAllocation> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f73333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f73334b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FreelancerTaxAllocation(parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FreelancerTaxAllocation[i];
        }
    }

    public FreelancerTaxAllocation(String str, Double d) {
        this.f73333a = d;
        this.f73334b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FreelancerTaxAllocation)) {
            return false;
        }
        FreelancerTaxAllocation freelancerTaxAllocation = (FreelancerTaxAllocation) obj2;
        return Intrinsics.f(this.f73333a, freelancerTaxAllocation.f73333a) && Intrinsics.f(this.f73334b, freelancerTaxAllocation.f73334b);
    }

    public final int hashCode() {
        Double d = this.f73333a;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        String str = this.f73334b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Double d = this.f73333a;
        if (d == null) {
            dest.writeInt(0);
        } else {
            org.bouncycastle.jcajce.provider.digest.a.v(dest, 1, d);
        }
        dest.writeString(this.f73334b);
    }
}
