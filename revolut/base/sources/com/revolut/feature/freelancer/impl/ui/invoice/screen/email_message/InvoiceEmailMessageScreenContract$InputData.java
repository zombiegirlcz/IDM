package com.revolut.feature.freelancer.impl.ui.invoice.screen.email_message;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/freelancer/impl/ui/invoice/screen/email_message/InvoiceEmailMessageScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "DefaultEmailMessage", "SingleInvoiceEmailMessage", "Lcom/revolut/feature/freelancer/impl/ui/invoice/screen/email_message/InvoiceEmailMessageScreenContract$InputData$DefaultEmailMessage;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/screen/email_message/InvoiceEmailMessageScreenContract$InputData$SingleInvoiceEmailMessage;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface InvoiceEmailMessageScreenContract$InputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/invoice/screen/email_message/InvoiceEmailMessageScreenContract$InputData$DefaultEmailMessage;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/screen/email_message/InvoiceEmailMessageScreenContract$InputData;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DefaultEmailMessage implements InvoiceEmailMessageScreenContract$InputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DefaultEmailMessage f73889a = new DefaultEmailMessage();

        @NotNull
        public static final Parcelable.Creator<DefaultEmailMessage> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DefaultEmailMessage.f73889a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DefaultEmailMessage[i];
            }
        }

        private DefaultEmailMessage() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/invoice/screen/email_message/InvoiceEmailMessageScreenContract$InputData$SingleInvoiceEmailMessage;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/screen/email_message/InvoiceEmailMessageScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SingleInvoiceEmailMessage implements InvoiceEmailMessageScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<SingleInvoiceEmailMessage> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f73890a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SingleInvoiceEmailMessage(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SingleInvoiceEmailMessage[i];
            }
        }

        public SingleInvoiceEmailMessage(String invoiceId) {
            Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
            this.f73890a = invoiceId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SingleInvoiceEmailMessage) && Intrinsics.f(this.f73890a, ((SingleInvoiceEmailMessage) obj2).f73890a);
        }

        public final int hashCode() {
            return this.f73890a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f73890a);
        }
    }
}
