package com.revolut.feature.pix.impl.flow.transfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.core.models.recipients.PixContact;
import com.revolut.feature.pix.api.model.PixQrCodeDecodeData;
import com.revolut.feature.pix.api.navigation.PixTransferNavigation$InputData;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.kompot.navigable.flow.FlowStep;
import hrf.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"com/revolut/feature/pix/impl/flow/transfer/PixTransferFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Beneficiaries", "Contacts", "InputKey", "NewContact", "ScanQr", "QrCodeTransfer", "ApmTransfer", "PeerToPeerTransfer", "Lcom/revolut/feature/pix/impl/flow/transfer/PixTransferFlowContract$Step$ApmTransfer;", "Lcom/revolut/feature/pix/impl/flow/transfer/PixTransferFlowContract$Step$Beneficiaries;", "Lcom/revolut/feature/pix/impl/flow/transfer/PixTransferFlowContract$Step$Contacts;", "Lcom/revolut/feature/pix/impl/flow/transfer/PixTransferFlowContract$Step$InputKey;", "Lcom/revolut/feature/pix/impl/flow/transfer/PixTransferFlowContract$Step$NewContact;", "Lcom/revolut/feature/pix/impl/flow/transfer/PixTransferFlowContract$Step$PeerToPeerTransfer;", "Lcom/revolut/feature/pix/impl/flow/transfer/PixTransferFlowContract$Step$QrCodeTransfer;", "Lcom/revolut/feature/pix/impl/flow/transfer/PixTransferFlowContract$Step$ScanQr;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PixTransferFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/transfer/PixTransferFlowContract$Step$Beneficiaries;", "Lcom/revolut/feature/pix/impl/flow/transfer/PixTransferFlowContract$Step;", "<init>", "()V", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Beneficiaries extends PixTransferFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Beneficiaries f80746a = new Beneficiaries();

        @NotNull
        public static final Parcelable.Creator<Beneficiaries> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Beneficiaries.f80746a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Beneficiaries[i];
            }
        }

        private Beneficiaries() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/transfer/PixTransferFlowContract$Step$Contacts;", "Lcom/revolut/feature/pix/impl/flow/transfer/PixTransferFlowContract$Step;", "<init>", "()V", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Contacts extends PixTransferFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Contacts f80747a = new Contacts();

        @NotNull
        public static final Parcelable.Creator<Contacts> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Contacts.f80747a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Contacts[i];
            }
        }

        private Contacts() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/transfer/PixTransferFlowContract$Step$InputKey;", "Lcom/revolut/feature/pix/impl/flow/transfer/PixTransferFlowContract$Step;", "<init>", "()V", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class InputKey extends PixTransferFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final InputKey f80748a = new InputKey();

        @NotNull
        public static final Parcelable.Creator<InputKey> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return InputKey.f80748a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InputKey[i];
            }
        }

        private InputKey() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/transfer/PixTransferFlowContract$Step$NewContact;", "Lcom/revolut/feature/pix/impl/flow/transfer/PixTransferFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NewContact extends PixTransferFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<NewContact> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PixTransferNavigation$InputData.NewContact f80749a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NewContact((PixTransferNavigation$InputData.NewContact) parcel.readParcelable(NewContact.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NewContact[i];
            }
        }

        public NewContact(PixTransferNavigation$InputData.NewContact input) {
            Intrinsics.checkNotNullParameter(input, "input");
            this.f80749a = input;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof NewContact) && Intrinsics.f(this.f80749a, ((NewContact) obj2).f80749a);
        }

        public final int hashCode() {
            return this.f80749a.f80529a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f80749a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/transfer/PixTransferFlowContract$Step$PeerToPeerTransfer;", "Lcom/revolut/feature/pix/impl/flow/transfer/PixTransferFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PeerToPeerTransfer extends PixTransferFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PeerToPeerTransfer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zm3.a f80750a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PeerToPeerTransfer((zm3.a) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PeerToPeerTransfer[i];
            }
        }

        public PeerToPeerTransfer(zm3.a contact) {
            Intrinsics.checkNotNullParameter(contact, "contact");
            this.f80750a = contact;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PeerToPeerTransfer) && Intrinsics.f(this.f80750a, ((PeerToPeerTransfer) obj2).f80750a);
        }

        public final int hashCode() {
            return this.f80750a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f80750a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/transfer/PixTransferFlowContract$Step$QrCodeTransfer;", "Lcom/revolut/feature/pix/impl/flow/transfer/PixTransferFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class QrCodeTransfer extends PixTransferFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<QrCodeTransfer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f80751a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PixQrCodeDecodeData f80752b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new QrCodeTransfer(parcel.readString(), (PixQrCodeDecodeData) parcel.readParcelable(QrCodeTransfer.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new QrCodeTransfer[i];
            }
        }

        public QrCodeTransfer(String qrCodeId, PixQrCodeDecodeData qrCodeData) {
            Intrinsics.checkNotNullParameter(qrCodeId, "qrCodeId");
            Intrinsics.checkNotNullParameter(qrCodeData, "qrCodeData");
            this.f80751a = qrCodeId;
            this.f80752b = qrCodeData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof QrCodeTransfer)) {
                return false;
            }
            QrCodeTransfer qrCodeTransfer = (QrCodeTransfer) obj2;
            return Intrinsics.f(this.f80751a, qrCodeTransfer.f80751a) && Intrinsics.f(this.f80752b, qrCodeTransfer.f80752b);
        }

        public final int hashCode() {
            return this.f80752b.hashCode() + (this.f80751a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f80751a);
            dest.writeParcelable(this.f80752b, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/transfer/PixTransferFlowContract$Step$ScanQr;", "Lcom/revolut/feature/pix/impl/flow/transfer/PixTransferFlowContract$Step;", "<init>", "()V", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ScanQr extends PixTransferFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ScanQr f80753a = new ScanQr();

        @NotNull
        public static final Parcelable.Creator<ScanQr> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ScanQr.f80753a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ScanQr[i];
            }
        }

        private ScanQr() {
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

    private PixTransferFlowContract$Step() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/transfer/PixTransferFlowContract$Step$ApmTransfer;", "Lcom/revolut/feature/pix/impl/flow/transfer/PixTransferFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ApmTransfer extends PixTransferFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ApmTransfer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PixContact f80743a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f f80744b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TransferMoneyPocket f80745c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ApmTransfer((PixContact) parcel.readParcelable(ApmTransfer.class.getClassLoader()), f.valueOf(parcel.readString()), (TransferMoneyPocket) parcel.readParcelable(ApmTransfer.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ApmTransfer[i];
            }
        }

        public ApmTransfer(PixContact contact, f direction, TransferMoneyPocket funding) {
            Intrinsics.checkNotNullParameter(contact, "contact");
            Intrinsics.checkNotNullParameter(direction, "direction");
            Intrinsics.checkNotNullParameter(funding, "funding");
            this.f80743a = contact;
            this.f80744b = direction;
            this.f80745c = funding;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ApmTransfer)) {
                return false;
            }
            ApmTransfer apmTransfer = (ApmTransfer) obj2;
            return Intrinsics.f(this.f80743a, apmTransfer.f80743a) && this.f80744b == apmTransfer.f80744b && Intrinsics.f(this.f80745c, apmTransfer.f80745c);
        }

        public final int hashCode() {
            return this.f80745c.hashCode() + ((this.f80744b.hashCode() + (this.f80743a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f80743a, i);
            dest.writeString(this.f80744b.name());
            dest.writeParcelable(this.f80745c, i);
        }

        public /* synthetic */ ApmTransfer(PixContact pixContact) {
            this(pixContact, f.OUTGOING, new TransferMoneyPocket(null, null, 3));
        }
    }
}
