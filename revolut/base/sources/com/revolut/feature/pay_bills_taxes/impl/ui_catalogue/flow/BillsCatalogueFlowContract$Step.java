package com.revolut.feature.pay_bills_taxes.impl.ui_catalogue.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.bills.billers.api.model.Biller;
import com.revolut.feature.apm.bills.core.api.model.search.tapi.BillSearchTapiResult;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/pay_bills_taxes/impl/ui_catalogue/flow/BillsCatalogueFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Billers", "Bill", "Transfer", "Lcom/revolut/feature/pay_bills_taxes/impl/ui_catalogue/flow/BillsCatalogueFlowContract$Step$Bill;", "Lcom/revolut/feature/pay_bills_taxes/impl/ui_catalogue/flow/BillsCatalogueFlowContract$Step$Billers;", "Lcom/revolut/feature/pay_bills_taxes/impl/ui_catalogue/flow/BillsCatalogueFlowContract$Step$Transfer;", "feature_pay_bills_taxes_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BillsCatalogueFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pay_bills_taxes/impl/ui_catalogue/flow/BillsCatalogueFlowContract$Step$Bill;", "Lcom/revolut/feature/pay_bills_taxes/impl/ui_catalogue/flow/BillsCatalogueFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_pay_bills_taxes_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Bill implements BillsCatalogueFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Bill> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Biller f78745a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Bill((Biller) parcel.readParcelable(Bill.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Bill[i];
            }
        }

        public Bill(Biller biller) {
            Intrinsics.checkNotNullParameter(biller, "biller");
            this.f78745a = biller;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Bill) && Intrinsics.f(this.f78745a, ((Bill) obj2).f78745a);
        }

        public final int hashCode() {
            return this.f78745a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f78745a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pay_bills_taxes/impl/ui_catalogue/flow/BillsCatalogueFlowContract$Step$Billers;", "Lcom/revolut/feature/pay_bills_taxes/impl/ui_catalogue/flow/BillsCatalogueFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_pay_bills_taxes_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Billers implements BillsCatalogueFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Billers> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final xo1.b f78746a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Billers(xo1.b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Billers[i];
            }
        }

        public Billers(xo1.b category) {
            Intrinsics.checkNotNullParameter(category, "category");
            this.f78746a = category;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Billers) && this.f78746a == ((Billers) obj2).f78746a;
        }

        public final int hashCode() {
            return this.f78746a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f78746a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pay_bills_taxes/impl/ui_catalogue/flow/BillsCatalogueFlowContract$Step$Transfer;", "Lcom/revolut/feature/pay_bills_taxes/impl/ui_catalogue/flow/BillsCatalogueFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_pay_bills_taxes_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Transfer implements BillsCatalogueFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Transfer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Biller f78747a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BillSearchTapiResult f78748b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Transfer((Biller) parcel.readParcelable(Transfer.class.getClassLoader()), (BillSearchTapiResult) parcel.readParcelable(Transfer.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Transfer[i];
            }
        }

        public Transfer(Biller biller, BillSearchTapiResult bill) {
            Intrinsics.checkNotNullParameter(biller, "biller");
            Intrinsics.checkNotNullParameter(bill, "bill");
            this.f78747a = biller;
            this.f78748b = bill;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Transfer)) {
                return false;
            }
            Transfer transfer = (Transfer) obj2;
            return Intrinsics.f(this.f78747a, transfer.f78747a) && Intrinsics.f(this.f78748b, transfer.f78748b);
        }

        public final int hashCode() {
            return this.f78748b.hashCode() + (this.f78747a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f78747a, i);
            dest.writeParcelable(this.f78748b, i);
        }
    }
}
