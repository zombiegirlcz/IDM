package com.revolut.feature.freelancer.impl.ui.invoice.details.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/freelancer/impl/ui/invoice/details/flow/InvoiceDetailsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "EditInvoice", "InvoiceDetails", "Lcom/revolut/feature/freelancer/impl/ui/invoice/details/flow/InvoiceDetailsFlowContract$Step$EditInvoice;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/details/flow/InvoiceDetailsFlowContract$Step$InvoiceDetails;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface InvoiceDetailsFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/invoice/details/flow/InvoiceDetailsFlowContract$Step$EditInvoice;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/details/flow/InvoiceDetailsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EditInvoice implements InvoiceDetailsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<EditInvoice> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f73860a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f73861b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EditInvoice(parcel.readString(), (b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EditInvoice[i];
            }
        }

        public EditInvoice(String invoiceId, b currency) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
            this.f73860a = currency;
            this.f73861b = invoiceId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof EditInvoice)) {
                return false;
            }
            EditInvoice editInvoice = (EditInvoice) obj2;
            return Intrinsics.f(this.f73860a, editInvoice.f73860a) && Intrinsics.f(this.f73861b, editInvoice.f73861b);
        }

        public final int hashCode() {
            return this.f73861b.hashCode() + (this.f73860a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f73860a);
            dest.writeString(this.f73861b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/invoice/details/flow/InvoiceDetailsFlowContract$Step$InvoiceDetails;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/details/flow/InvoiceDetailsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InvoiceDetails implements InvoiceDetailsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<InvoiceDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f73862a;

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
            this.f73862a = invoiceId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InvoiceDetails) && Intrinsics.f(this.f73862a, ((InvoiceDetails) obj2).f73862a);
        }

        public final int hashCode() {
            return this.f73862a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f73862a);
        }
    }
}
