package com.revolut.feature.address.common.api.flow;

import aii.r;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.address.models.Address;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/address/common/api/flow/AddressFlowContract$OutputData", "Laii/r;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_address_common_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AddressFlowContract$OutputData implements r, Parcelable {

    @NotNull
    public static final Parcelable.Creator<AddressFlowContract$OutputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Address f60940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Address f60941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f60942c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AddressFlowContract$OutputData((Address) parcel.readParcelable(AddressFlowContract$OutputData.class.getClassLoader()), (Address) parcel.readParcelable(AddressFlowContract$OutputData.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AddressFlowContract$OutputData[i];
        }
    }

    public AddressFlowContract$OutputData(Address address, Address address2, String str, String str2) {
        Intrinsics.checkNotNullParameter(address, "address");
        this.f60940a = address;
        this.f60941b = address2;
        this.f60942c = str;
        this.d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AddressFlowContract$OutputData)) {
            return false;
        }
        AddressFlowContract$OutputData addressFlowContract$OutputData = (AddressFlowContract$OutputData) obj2;
        return Intrinsics.f(this.f60940a, addressFlowContract$OutputData.f60940a) && Intrinsics.f(this.f60941b, addressFlowContract$OutputData.f60941b) && Intrinsics.f(this.f60942c, addressFlowContract$OutputData.f60942c) && Intrinsics.f(this.d, addressFlowContract$OutputData.d);
    }

    public final int hashCode() {
        int iHashCode = this.f60940a.hashCode() * 31;
        Address address = this.f60941b;
        int iHashCode2 = (iHashCode + (address == null ? 0 : address.hashCode())) * 31;
        String str = this.f60942c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f60940a, i);
        dest.writeParcelable(this.f60941b, i);
        dest.writeString(this.f60942c);
        dest.writeString(this.d);
    }
}
