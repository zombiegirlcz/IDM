package com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_methods;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/freelancer/impl/ui/invoice/screen/payment_methods/InvoicePaymentMethodsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "DefaultInvoicePaymentMethods", "SingleInvoicePaymentMethods", "Lcom/revolut/feature/freelancer/impl/ui/invoice/screen/payment_methods/InvoicePaymentMethodsScreenContract$InputData$DefaultInvoicePaymentMethods;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/screen/payment_methods/InvoicePaymentMethodsScreenContract$InputData$SingleInvoicePaymentMethods;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface InvoicePaymentMethodsScreenContract$InputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/invoice/screen/payment_methods/InvoicePaymentMethodsScreenContract$InputData$DefaultInvoicePaymentMethods;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/screen/payment_methods/InvoicePaymentMethodsScreenContract$InputData;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DefaultInvoicePaymentMethods implements InvoicePaymentMethodsScreenContract$InputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DefaultInvoicePaymentMethods f73891a = new DefaultInvoicePaymentMethods();

        @NotNull
        public static final Parcelable.Creator<DefaultInvoicePaymentMethods> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DefaultInvoicePaymentMethods.f73891a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DefaultInvoicePaymentMethods[i];
            }
        }

        private DefaultInvoicePaymentMethods() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/invoice/screen/payment_methods/InvoicePaymentMethodsScreenContract$InputData$SingleInvoicePaymentMethods;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/screen/payment_methods/InvoicePaymentMethodsScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SingleInvoicePaymentMethods implements InvoicePaymentMethodsScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<SingleInvoicePaymentMethods> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f73892a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SingleInvoicePaymentMethods(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SingleInvoicePaymentMethods[i];
            }
        }

        public SingleInvoicePaymentMethods(String invoiceId) {
            Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
            this.f73892a = invoiceId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SingleInvoicePaymentMethods) && Intrinsics.f(this.f73892a, ((SingleInvoicePaymentMethods) obj2).f73892a);
        }

        public final int hashCode() {
            return this.f73892a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f73892a);
        }
    }
}
