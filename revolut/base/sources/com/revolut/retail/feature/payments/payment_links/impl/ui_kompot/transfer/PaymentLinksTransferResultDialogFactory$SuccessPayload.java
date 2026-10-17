package com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.transfer;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/payments/payment_links/impl/ui_kompot/transfer/PaymentLinksTransferResultDialogFactory$SuccessPayload", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_payments_payment_links_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PaymentLinksTransferResultDialogFactory$SuccessPayload implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PaymentLinksTransferResultDialogFactory$SuccessPayload> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f102240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f102241b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PaymentLinksTransferResultDialogFactory$SuccessPayload((d) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PaymentLinksTransferResultDialogFactory$SuccessPayload[i];
        }
    }

    public PaymentLinksTransferResultDialogFactory$SuccessPayload(d amount, String note) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(note, "note");
        this.f102240a = amount;
        this.f102241b = note;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PaymentLinksTransferResultDialogFactory$SuccessPayload)) {
            return false;
        }
        PaymentLinksTransferResultDialogFactory$SuccessPayload paymentLinksTransferResultDialogFactory$SuccessPayload = (PaymentLinksTransferResultDialogFactory$SuccessPayload) obj2;
        return Intrinsics.f(this.f102240a, paymentLinksTransferResultDialogFactory$SuccessPayload.f102240a) && Intrinsics.f(this.f102241b, paymentLinksTransferResultDialogFactory$SuccessPayload.f102241b);
    }

    public final int hashCode() {
        return this.f102241b.hashCode() + (this.f102240a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f102240a);
        dest.writeString(this.f102241b);
    }
}
