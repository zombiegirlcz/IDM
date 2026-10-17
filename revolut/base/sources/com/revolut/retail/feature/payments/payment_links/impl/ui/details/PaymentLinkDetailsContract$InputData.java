package com.revolut.retail.feature.payments.payment_links.impl.ui.details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.domain.models.moneyrequest.TransferLinkDetails;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/retail/feature/payments/payment_links/impl/ui/details/PaymentLinkDetailsContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "ByTransferLink", "ByCode", "Lcom/revolut/retail/feature/payments/payment_links/impl/ui/details/PaymentLinkDetailsContract$InputData$ByCode;", "Lcom/revolut/retail/feature/payments/payment_links/impl/ui/details/PaymentLinkDetailsContract$InputData$ByTransferLink;", "feature_payments_payment_links_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PaymentLinkDetailsContract$InputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/payments/payment_links/impl/ui/details/PaymentLinkDetailsContract$InputData$ByCode;", "Lcom/revolut/retail/feature/payments/payment_links/impl/ui/details/PaymentLinkDetailsContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_payments_payment_links_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ByCode implements PaymentLinkDetailsContract$InputData {

        @NotNull
        public static final Parcelable.Creator<ByCode> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f102180a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ByCode(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ByCode[i];
            }
        }

        public ByCode(String paymentLinkCode) {
            Intrinsics.checkNotNullParameter(paymentLinkCode, "paymentLinkCode");
            this.f102180a = paymentLinkCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ByCode) && Intrinsics.f(this.f102180a, ((ByCode) obj2).f102180a);
        }

        public final int hashCode() {
            return this.f102180a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f102180a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/payments/payment_links/impl/ui/details/PaymentLinkDetailsContract$InputData$ByTransferLink;", "Lcom/revolut/retail/feature/payments/payment_links/impl/ui/details/PaymentLinkDetailsContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_payments_payment_links_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ByTransferLink implements PaymentLinkDetailsContract$InputData {

        @NotNull
        public static final Parcelable.Creator<ByTransferLink> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TransferLinkDetails f102181a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ByTransferLink((TransferLinkDetails) parcel.readParcelable(ByTransferLink.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ByTransferLink[i];
            }
        }

        public ByTransferLink(TransferLinkDetails transferLink) {
            Intrinsics.checkNotNullParameter(transferLink, "transferLink");
            this.f102181a = transferLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ByTransferLink) && Intrinsics.f(this.f102181a, ((ByTransferLink) obj2).f102181a);
        }

        public final int hashCode() {
            return this.f102181a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f102181a, i);
        }
    }
}
