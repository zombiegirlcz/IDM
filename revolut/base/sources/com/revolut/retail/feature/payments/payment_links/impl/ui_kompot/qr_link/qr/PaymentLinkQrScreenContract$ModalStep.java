package com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.qr_link.qr;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.payments.payment_links.api.model.TransferLinkLimits;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/retail/feature/payments/payment_links/impl/ui_kompot/qr_link/qr/PaymentLinkQrScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "SetAmountAndNote", "ShowLimits", "Lcom/revolut/retail/feature/payments/payment_links/impl/ui_kompot/qr_link/qr/PaymentLinkQrScreenContract$ModalStep$SetAmountAndNote;", "Lcom/revolut/retail/feature/payments/payment_links/impl/ui_kompot/qr_link/qr/PaymentLinkQrScreenContract$ModalStep$ShowLimits;", "feature_payments_payment_links_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PaymentLinkQrScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/payments/payment_links/impl/ui_kompot/qr_link/qr/PaymentLinkQrScreenContract$ModalStep$SetAmountAndNote;", "Lcom/revolut/retail/feature/payments/payment_links/impl/ui_kompot/qr_link/qr/PaymentLinkQrScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_payments_payment_links_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SetAmountAndNote implements PaymentLinkQrScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<SetAmountAndNote> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f102224a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f102225b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SetAmountAndNote((d) parcel.readSerializable(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SetAmountAndNote[i];
            }
        }

        public SetAmountAndNote() {
            this(null, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SetAmountAndNote)) {
                return false;
            }
            SetAmountAndNote setAmountAndNote = (SetAmountAndNote) obj2;
            return Intrinsics.f(this.f102224a, setAmountAndNote.f102224a) && Intrinsics.f(this.f102225b, setAmountAndNote.f102225b);
        }

        public final int hashCode() {
            d dVar = this.f102224a;
            int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
            String str = this.f102225b;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f102224a);
            dest.writeString(this.f102225b);
        }

        public SetAmountAndNote(d dVar, String str) {
            this.f102224a = dVar;
            this.f102225b = str;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/payments/payment_links/impl/ui_kompot/qr_link/qr/PaymentLinkQrScreenContract$ModalStep$ShowLimits;", "Lcom/revolut/retail/feature/payments/payment_links/impl/ui_kompot/qr_link/qr/PaymentLinkQrScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_payments_payment_links_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ShowLimits implements PaymentLinkQrScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ShowLimits> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TransferLinkLimits f102226a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ShowLimits((TransferLinkLimits) parcel.readParcelable(ShowLimits.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShowLimits[i];
            }
        }

        public ShowLimits(TransferLinkLimits limits) {
            Intrinsics.checkNotNullParameter(limits, "limits");
            this.f102226a = limits;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ShowLimits) && Intrinsics.f(this.f102226a, ((ShowLimits) obj2).f102226a);
        }

        public final int hashCode() {
            return this.f102226a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f102226a, i);
        }
    }
}
