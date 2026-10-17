package com.revolut.feature.pix.impl.flow.qr;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.core.models.recipients.PixContact;
import com.revolut.feature.pix.api.model.PixQrCodeDecodeData;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/pix/impl/flow/qr/PixQrCodeFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "OpenQrScanner", "QrTransaction", "Transfer", "Lcom/revolut/feature/pix/impl/flow/qr/PixQrCodeFlowContract$Step$OpenQrScanner;", "Lcom/revolut/feature/pix/impl/flow/qr/PixQrCodeFlowContract$Step$QrTransaction;", "Lcom/revolut/feature/pix/impl/flow/qr/PixQrCodeFlowContract$Step$Transfer;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PixQrCodeFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/qr/PixQrCodeFlowContract$Step$OpenQrScanner;", "Lcom/revolut/feature/pix/impl/flow/qr/PixQrCodeFlowContract$Step;", "<init>", "()V", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class OpenQrScanner implements PixQrCodeFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OpenQrScanner f80680a = new OpenQrScanner();

        @NotNull
        public static final Parcelable.Creator<OpenQrScanner> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return OpenQrScanner.f80680a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OpenQrScanner[i];
            }
        }

        private OpenQrScanner() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/qr/PixQrCodeFlowContract$Step$QrTransaction;", "Lcom/revolut/feature/pix/impl/flow/qr/PixQrCodeFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class QrTransaction implements PixQrCodeFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<QrTransaction> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f80681a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PixQrCodeDecodeData f80682b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new QrTransaction(parcel.readString(), (PixQrCodeDecodeData) parcel.readParcelable(QrTransaction.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new QrTransaction[i];
            }
        }

        public QrTransaction(String qrCodeId, PixQrCodeDecodeData qrCodeData) {
            Intrinsics.checkNotNullParameter(qrCodeId, "qrCodeId");
            Intrinsics.checkNotNullParameter(qrCodeData, "qrCodeData");
            this.f80681a = qrCodeId;
            this.f80682b = qrCodeData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof QrTransaction)) {
                return false;
            }
            QrTransaction qrTransaction = (QrTransaction) obj2;
            return Intrinsics.f(this.f80681a, qrTransaction.f80681a) && Intrinsics.f(this.f80682b, qrTransaction.f80682b);
        }

        public final int hashCode() {
            return this.f80682b.hashCode() + (this.f80681a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f80681a);
            dest.writeParcelable(this.f80682b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/qr/PixQrCodeFlowContract$Step$Transfer;", "Lcom/revolut/feature/pix/impl/flow/qr/PixQrCodeFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Transfer implements PixQrCodeFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Transfer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PixContact f80683a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Transfer((PixContact) parcel.readParcelable(Transfer.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Transfer[i];
            }
        }

        public Transfer(PixContact contact) {
            Intrinsics.checkNotNullParameter(contact, "contact");
            this.f80683a = contact;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Transfer) && Intrinsics.f(this.f80683a, ((Transfer) obj2).f80683a);
        }

        public final int hashCode() {
            return this.f80683a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f80683a, i);
        }
    }
}
