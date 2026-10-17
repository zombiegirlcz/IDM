package com.revolut.feature.freelancer.impl.ui.invoice.screen.customer_list;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/feature/freelancer/impl/ui/invoice/screen/customer_list/InvoiceCustomerListScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "AddCustomer", "Lcom/revolut/feature/freelancer/impl/ui/invoice/screen/customer_list/InvoiceCustomerListScreenContract$ModalStep$AddCustomer;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface InvoiceCustomerListScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/invoice/screen/customer_list/InvoiceCustomerListScreenContract$ModalStep$AddCustomer;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/screen/customer_list/InvoiceCustomerListScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddCustomer implements InvoiceCustomerListScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<AddCustomer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f73881a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f73882b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AddCustomer(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddCustomer[i];
            }
        }

        public AddCustomer(String str, String str2) {
            this.f73881a = str;
            this.f73882b = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AddCustomer)) {
                return false;
            }
            AddCustomer addCustomer = (AddCustomer) obj2;
            return Intrinsics.f(this.f73881a, addCustomer.f73881a) && Intrinsics.f(this.f73882b, addCustomer.f73882b);
        }

        public final int hashCode() {
            String str = this.f73881a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f73882b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f73881a);
            dest.writeString(this.f73882b);
        }
    }
}
