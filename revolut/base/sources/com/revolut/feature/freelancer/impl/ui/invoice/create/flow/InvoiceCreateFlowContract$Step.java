package com.revolut.feature.freelancer.impl.ui.invoice.create.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"com/revolut/feature/freelancer/impl/ui/invoice/create/flow/InvoiceCreateFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "CustomerDetails", "CustomerList", "InvoiceCreation", "InvoiceDetails", "PaymentMethods", "PaymentSchedule", "Templates", "Lcom/revolut/feature/freelancer/impl/ui/invoice/create/flow/InvoiceCreateFlowContract$Step$CustomerDetails;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/create/flow/InvoiceCreateFlowContract$Step$CustomerList;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/create/flow/InvoiceCreateFlowContract$Step$InvoiceCreation;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/create/flow/InvoiceCreateFlowContract$Step$InvoiceDetails;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/create/flow/InvoiceCreateFlowContract$Step$PaymentMethods;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/create/flow/InvoiceCreateFlowContract$Step$PaymentSchedule;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/create/flow/InvoiceCreateFlowContract$Step$Templates;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface InvoiceCreateFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/invoice/create/flow/InvoiceCreateFlowContract$Step$CustomerDetails;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/create/flow/InvoiceCreateFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CustomerDetails implements InvoiceCreateFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CustomerDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f73818a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CustomerDetails(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CustomerDetails[i];
            }
        }

        public CustomerDetails(String customerId) {
            Intrinsics.checkNotNullParameter(customerId, "customerId");
            this.f73818a = customerId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CustomerDetails) && Intrinsics.f(this.f73818a, ((CustomerDetails) obj2).f73818a);
        }

        public final int hashCode() {
            return this.f73818a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f73818a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/invoice/create/flow/InvoiceCreateFlowContract$Step$CustomerList;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/create/flow/InvoiceCreateFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CustomerList implements InvoiceCreateFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CustomerList> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f73819a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CustomerList(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CustomerList[i];
            }
        }

        public CustomerList(String invoiceId) {
            Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
            this.f73819a = invoiceId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CustomerList) && Intrinsics.f(this.f73819a, ((CustomerList) obj2).f73819a);
        }

        public final int hashCode() {
            return this.f73819a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f73819a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/invoice/create/flow/InvoiceCreateFlowContract$Step$InvoiceCreation;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/create/flow/InvoiceCreateFlowContract$Step;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class InvoiceCreation implements InvoiceCreateFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final InvoiceCreation f73820a = new InvoiceCreation();

        @NotNull
        public static final Parcelable.Creator<InvoiceCreation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return InvoiceCreation.f73820a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InvoiceCreation[i];
            }
        }

        private InvoiceCreation() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/invoice/create/flow/InvoiceCreateFlowContract$Step$InvoiceDetails;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/create/flow/InvoiceCreateFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InvoiceDetails implements InvoiceCreateFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<InvoiceDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f73821a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InvoiceDetails(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InvoiceDetails[i];
            }
        }

        public InvoiceDetails(String invoiceId) {
            Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
            this.f73821a = invoiceId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InvoiceDetails) && Intrinsics.f(this.f73821a, ((InvoiceDetails) obj2).f73821a);
        }

        public final int hashCode() {
            return this.f73821a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f73821a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/invoice/create/flow/InvoiceCreateFlowContract$Step$PaymentMethods;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/create/flow/InvoiceCreateFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PaymentMethods implements InvoiceCreateFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PaymentMethods> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f73822a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PaymentMethods(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PaymentMethods[i];
            }
        }

        public PaymentMethods(String invoiceId) {
            Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
            this.f73822a = invoiceId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PaymentMethods) && Intrinsics.f(this.f73822a, ((PaymentMethods) obj2).f73822a);
        }

        public final int hashCode() {
            return this.f73822a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f73822a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/invoice/create/flow/InvoiceCreateFlowContract$Step$PaymentSchedule;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/create/flow/InvoiceCreateFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PaymentSchedule implements InvoiceCreateFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PaymentSchedule> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FreelancerInvoice f73823a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PaymentSchedule((FreelancerInvoice) parcel.readParcelable(PaymentSchedule.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PaymentSchedule[i];
            }
        }

        public PaymentSchedule(FreelancerInvoice invoice) {
            Intrinsics.checkNotNullParameter(invoice, "invoice");
            this.f73823a = invoice;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PaymentSchedule) && Intrinsics.f(this.f73823a, ((PaymentSchedule) obj2).f73823a);
        }

        public final int hashCode() {
            return this.f73823a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f73823a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/invoice/create/flow/InvoiceCreateFlowContract$Step$Templates;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/create/flow/InvoiceCreateFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Templates implements InvoiceCreateFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Templates> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f73824a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Templates(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Templates[i];
            }
        }

        public Templates(String invoiceId) {
            Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
            this.f73824a = invoiceId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Templates) && Intrinsics.f(this.f73824a, ((Templates) obj2).f73824a);
        }

        public final int hashCode() {
            return this.f73824a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f73824a);
        }
    }
}
