package com.revolut.feature.freelancer.impl.ui.create_sale.invoice.customer;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.address.models.Address;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/freelancer/impl/ui/create_sale/invoice/customer/FreelancerAddCustomerScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FreelancerAddCustomerScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<FreelancerAddCustomerScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f73761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f73762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f73763c;
    public final String d;
    public final String e;
    public final Address f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FreelancerAddCustomerScreenContract$InputData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (Address) parcel.readParcelable(FreelancerAddCustomerScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FreelancerAddCustomerScreenContract$InputData[i];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FreelancerAddCustomerScreenContract$InputData() {
        String str = null;
        this(str, str, 63);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FreelancerAddCustomerScreenContract$InputData)) {
            return false;
        }
        FreelancerAddCustomerScreenContract$InputData freelancerAddCustomerScreenContract$InputData = (FreelancerAddCustomerScreenContract$InputData) obj2;
        return Intrinsics.f(this.f73761a, freelancerAddCustomerScreenContract$InputData.f73761a) && Intrinsics.f(this.f73762b, freelancerAddCustomerScreenContract$InputData.f73762b) && Intrinsics.f(this.f73763c, freelancerAddCustomerScreenContract$InputData.f73763c) && Intrinsics.f(this.d, freelancerAddCustomerScreenContract$InputData.d) && Intrinsics.f(this.e, freelancerAddCustomerScreenContract$InputData.e) && Intrinsics.f(this.f, freelancerAddCustomerScreenContract$InputData.f);
    }

    public final int hashCode() {
        String str = this.f73761a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f73762b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f73763c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Address address = this.f;
        return iHashCode5 + (address != null ? address.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f73761a);
        dest.writeString(this.f73762b);
        dest.writeString(this.f73763c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeParcelable(this.f, i);
    }

    public FreelancerAddCustomerScreenContract$InputData(String str, String str2, String str3, String str4, String str5, Address address) {
        this.f73761a = str;
        this.f73762b = str2;
        this.f73763c = str3;
        this.d = str4;
        this.e = str5;
        this.f = address;
    }

    public /* synthetic */ FreelancerAddCustomerScreenContract$InputData(String str, String str2, int i) {
        this(null, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, null, null, null);
    }
}
