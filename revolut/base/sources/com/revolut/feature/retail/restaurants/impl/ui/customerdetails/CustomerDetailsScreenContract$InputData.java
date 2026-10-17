package com.revolut.feature.retail.restaurants.impl.ui.customerdetails;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.retail.restaurants.impl.domain.model.Customer;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/retail/restaurants/impl/ui/customerdetails/CustomerDetailsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_restaurants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CustomerDetailsScreenContract$InputData implements IOData$Input, Parcelable {

    @NotNull
    public static final Parcelable.Creator<CustomerDetailsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Customer f82841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f82842b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CustomerDetailsScreenContract$InputData(parcel.readInt() == 0 ? null : Customer.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CustomerDetailsScreenContract$InputData[i];
        }
    }

    public CustomerDetailsScreenContract$InputData(Customer customer, String str) {
        this.f82841a = customer;
        this.f82842b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CustomerDetailsScreenContract$InputData)) {
            return false;
        }
        CustomerDetailsScreenContract$InputData customerDetailsScreenContract$InputData = (CustomerDetailsScreenContract$InputData) obj2;
        return Intrinsics.f(this.f82841a, customerDetailsScreenContract$InputData.f82841a) && Intrinsics.f(this.f82842b, customerDetailsScreenContract$InputData.f82842b);
    }

    public final int hashCode() {
        Customer customer = this.f82841a;
        int iHashCode = (customer == null ? 0 : customer.hashCode()) * 31;
        String str = this.f82842b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Customer customer = this.f82841a;
        if (customer == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            customer.writeToParcel(dest, i);
        }
        dest.writeString(this.f82842b);
    }

    public CustomerDetailsScreenContract$InputData() {
        this(null, null);
    }
}
