package com.revolut.feature.apm.breb.impl.ui.transfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.breb.api.navigation.BrebTransferNavigation$InputData;
import com.revolut.feature.apm.core.models.recipients.BrebContact;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.kompot.navigable.flow.FlowStep;
import hrf.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"com/revolut/feature/apm/breb/impl/ui/transfer/BrebTransferFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Send", "NewContact", "ScanQr", "Transfer", "PeerToPeerTransfer", "Lcom/revolut/feature/apm/breb/impl/ui/transfer/BrebTransferFlowContract$Step$NewContact;", "Lcom/revolut/feature/apm/breb/impl/ui/transfer/BrebTransferFlowContract$Step$PeerToPeerTransfer;", "Lcom/revolut/feature/apm/breb/impl/ui/transfer/BrebTransferFlowContract$Step$ScanQr;", "Lcom/revolut/feature/apm/breb/impl/ui/transfer/BrebTransferFlowContract$Step$Send;", "Lcom/revolut/feature/apm/breb/impl/ui/transfer/BrebTransferFlowContract$Step$Transfer;", "feature_apm_breb_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BrebTransferFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/breb/impl/ui/transfer/BrebTransferFlowContract$Step$NewContact;", "Lcom/revolut/feature/apm/breb/impl/ui/transfer/BrebTransferFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_apm_breb_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NewContact extends BrebTransferFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<NewContact> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BrebTransferNavigation$InputData.NewContact f61763a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NewContact((BrebTransferNavigation$InputData.NewContact) parcel.readParcelable(NewContact.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NewContact[i];
            }
        }

        public NewContact(BrebTransferNavigation$InputData.NewContact input) {
            Intrinsics.checkNotNullParameter(input, "input");
            this.f61763a = input;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof NewContact) && Intrinsics.f(this.f61763a, ((NewContact) obj2).f61763a);
        }

        public final int hashCode() {
            return this.f61763a.f61706a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f61763a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/breb/impl/ui/transfer/BrebTransferFlowContract$Step$PeerToPeerTransfer;", "Lcom/revolut/feature/apm/breb/impl/ui/transfer/BrebTransferFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_apm_breb_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PeerToPeerTransfer extends BrebTransferFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PeerToPeerTransfer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zm3.a f61764a;

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
            this.f61764a = contact;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PeerToPeerTransfer) && Intrinsics.f(this.f61764a, ((PeerToPeerTransfer) obj2).f61764a);
        }

        public final int hashCode() {
            return this.f61764a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f61764a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/breb/impl/ui/transfer/BrebTransferFlowContract$Step$ScanQr;", "Lcom/revolut/feature/apm/breb/impl/ui/transfer/BrebTransferFlowContract$Step;", "<init>", "()V", "feature_apm_breb_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ScanQr extends BrebTransferFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ScanQr f61765a = new ScanQr();

        @NotNull
        public static final Parcelable.Creator<ScanQr> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ScanQr.f61765a;
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/breb/impl/ui/transfer/BrebTransferFlowContract$Step$Send;", "Lcom/revolut/feature/apm/breb/impl/ui/transfer/BrebTransferFlowContract$Step;", "<init>", "()V", "feature_apm_breb_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Send extends BrebTransferFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Send f61766a = new Send();

        @NotNull
        public static final Parcelable.Creator<Send> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Send.f61766a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Send[i];
            }
        }

        private Send() {
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

    private BrebTransferFlowContract$Step() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/breb/impl/ui/transfer/BrebTransferFlowContract$Step$Transfer;", "Lcom/revolut/feature/apm/breb/impl/ui/transfer/BrebTransferFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_apm_breb_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Transfer extends BrebTransferFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Transfer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BrebContact f61767a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f f61768b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TransferMoneyPocket f61769c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Transfer((BrebContact) parcel.readParcelable(Transfer.class.getClassLoader()), f.valueOf(parcel.readString()), (TransferMoneyPocket) parcel.readParcelable(Transfer.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Transfer[i];
            }
        }

        public Transfer(BrebContact contact, f direction, TransferMoneyPocket funding) {
            Intrinsics.checkNotNullParameter(contact, "contact");
            Intrinsics.checkNotNullParameter(direction, "direction");
            Intrinsics.checkNotNullParameter(funding, "funding");
            this.f61767a = contact;
            this.f61768b = direction;
            this.f61769c = funding;
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
            return Intrinsics.f(this.f61767a, transfer.f61767a) && this.f61768b == transfer.f61768b && Intrinsics.f(this.f61769c, transfer.f61769c);
        }

        public final int hashCode() {
            return this.f61769c.hashCode() + ((this.f61768b.hashCode() + (this.f61767a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f61767a, i);
            dest.writeString(this.f61768b.name());
            dest.writeParcelable(this.f61769c, i);
        }

        public /* synthetic */ Transfer(BrebContact brebContact, TransferMoneyPocket transferMoneyPocket, int i) {
            this(brebContact, f.OUTGOING, (i & 4) != 0 ? new TransferMoneyPocket(null, null, 3) : transferMoneyPocket);
        }
    }
}
