package com.revolut.feature.freelancer.impl.ui.profile.account;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.freelancer.common.models.tax_hub.FreelancerTaxProfile;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/freelancer/impl/ui/profile/account/FreelancerAccountScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FreelancerAccountScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<FreelancerAccountScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f74035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f74036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f74037c;
    public final String d;
    public final FreelancerTaxProfile e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f74038g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FreelancerAccountScreenContract$InputData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (FreelancerTaxProfile) parcel.readParcelable(FreelancerAccountScreenContract$InputData.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FreelancerAccountScreenContract$InputData[i];
        }
    }

    public FreelancerAccountScreenContract$InputData(String str, String str2, String str3, String str4, FreelancerTaxProfile freelancerTaxProfile, String str5, String str6) {
        this.f74035a = str;
        this.f74036b = str2;
        this.f74037c = str3;
        this.d = str4;
        this.e = freelancerTaxProfile;
        this.f = str5;
        this.f74038g = str6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FreelancerAccountScreenContract$InputData)) {
            return false;
        }
        FreelancerAccountScreenContract$InputData freelancerAccountScreenContract$InputData = (FreelancerAccountScreenContract$InputData) obj2;
        return Intrinsics.f(this.f74035a, freelancerAccountScreenContract$InputData.f74035a) && Intrinsics.f(this.f74036b, freelancerAccountScreenContract$InputData.f74036b) && Intrinsics.f(this.f74037c, freelancerAccountScreenContract$InputData.f74037c) && Intrinsics.f(this.d, freelancerAccountScreenContract$InputData.d) && Intrinsics.f(this.e, freelancerAccountScreenContract$InputData.e) && Intrinsics.f(this.f, freelancerAccountScreenContract$InputData.f) && Intrinsics.f(this.f74038g, freelancerAccountScreenContract$InputData.f74038g);
    }

    public final int hashCode() {
        String str = this.f74035a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f74036b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f74037c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        FreelancerTaxProfile freelancerTaxProfile = this.e;
        int iHashCode5 = (iHashCode4 + (freelancerTaxProfile == null ? 0 : freelancerTaxProfile.hashCode())) * 31;
        String str5 = this.f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f74038g;
        return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f74035a);
        dest.writeString(this.f74036b);
        dest.writeString(this.f74037c);
        dest.writeString(this.d);
        dest.writeParcelable(this.e, i);
        dest.writeString(this.f);
        dest.writeString(this.f74038g);
    }
}
