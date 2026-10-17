package com.revolut.feature.freelancer.common.models.tax_hub;

import android.os.Parcel;
import android.os.Parcelable;
import ds6.d;
import ds6.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/tax_hub/FreelancerTaxProfile;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FreelancerTaxProfile implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f73474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f73475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FreelancerTaxProfileSchedule f73476c;
    public final boolean d;
    public final d e;

    @NotNull
    public static final Parcelable.Creator<FreelancerTaxProfile> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FreelancerTaxProfile(parcel.readString(), j.valueOf(parcel.readString()), FreelancerTaxProfileSchedule.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, d.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FreelancerTaxProfile[i];
        }
    }

    public FreelancerTaxProfile(String id10, j taxType, FreelancerTaxProfileSchedule schedulingOptions, boolean z, d state) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(taxType, "taxType");
        Intrinsics.checkNotNullParameter(schedulingOptions, "schedulingOptions");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f73474a = id10;
        this.f73475b = taxType;
        this.f73476c = schedulingOptions;
        this.d = z;
        this.e = state;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FreelancerTaxProfile)) {
            return false;
        }
        FreelancerTaxProfile freelancerTaxProfile = (FreelancerTaxProfile) obj2;
        return Intrinsics.f(this.f73474a, freelancerTaxProfile.f73474a) && this.f73475b == freelancerTaxProfile.f73475b && Intrinsics.f(this.f73476c, freelancerTaxProfile.f73476c) && this.d == freelancerTaxProfile.d && this.e == freelancerTaxProfile.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + j6.a.c((this.f73476c.hashCode() + ((this.f73475b.hashCode() + (this.f73474a.hashCode() * 31)) * 31)) * 31, 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f73474a);
        dest.writeString(this.f73475b.name());
        this.f73476c.writeToParcel(dest, i);
        dest.writeInt(this.d ? 1 : 0);
        dest.writeString(this.e.name());
    }
}
