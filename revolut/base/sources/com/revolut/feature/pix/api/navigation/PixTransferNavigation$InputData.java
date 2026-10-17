package com.revolut.feature.pix.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.core.models.recipients.PixContact;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import hrf.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/pix/api/navigation/PixTransferNavigation$InputData", "Lcom/revolut/feature/pix/api/navigation/PixNavigation$InputData;", "Send", "NewContact", "ApmTransfer", "Lcom/revolut/feature/pix/api/navigation/PixTransferNavigation$InputData$ApmTransfer;", "Lcom/revolut/feature/pix/api/navigation/PixTransferNavigation$InputData$NewContact;", "Lcom/revolut/feature/pix/api/navigation/PixTransferNavigation$InputData$Send;", "feature_pix_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PixTransferNavigation$InputData extends PixNavigation$InputData {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pix/api/navigation/PixTransferNavigation$InputData$NewContact;", "Lcom/revolut/feature/pix/api/navigation/PixTransferNavigation$InputData;", "", "toString", "()Ljava/lang/String;", "feature_pix_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NewContact implements PixTransferNavigation$InputData {

        @NotNull
        public static final Parcelable.Creator<NewContact> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f80529a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NewContact(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NewContact[i];
            }
        }

        public NewContact() {
            this(0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof NewContact) && Intrinsics.f(this.f80529a, ((NewContact) obj2).f80529a);
        }

        public final int hashCode() {
            return this.f80529a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f80529a);
        }

        public NewContact(String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.f80529a = key;
        }

        public /* synthetic */ NewContact(int i) {
            this("");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pix/api/navigation/PixTransferNavigation$InputData$Send;", "Lcom/revolut/feature/pix/api/navigation/PixTransferNavigation$InputData;", "<init>", "()V", "feature_pix_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Send implements PixTransferNavigation$InputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Send f80530a = new Send();

        @NotNull
        public static final Parcelable.Creator<Send> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Send.f80530a;
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pix/api/navigation/PixTransferNavigation$InputData$ApmTransfer;", "Lcom/revolut/feature/pix/api/navigation/PixTransferNavigation$InputData;", "", "toString", "()Ljava/lang/String;", "feature_pix_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ApmTransfer implements PixTransferNavigation$InputData {

        @NotNull
        public static final Parcelable.Creator<ApmTransfer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PixContact f80526a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f f80527b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TransferMoneyPocket f80528c;

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
            this.f80526a = contact;
            this.f80527b = direction;
            this.f80528c = funding;
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
            return Intrinsics.f(this.f80526a, apmTransfer.f80526a) && this.f80527b == apmTransfer.f80527b && Intrinsics.f(this.f80528c, apmTransfer.f80528c);
        }

        public final int hashCode() {
            return this.f80528c.hashCode() + ((this.f80527b.hashCode() + (this.f80526a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f80526a, i);
            dest.writeString(this.f80527b.name());
            dest.writeParcelable(this.f80528c, i);
        }

        public /* synthetic */ ApmTransfer(PixContact pixContact, f fVar, int i) {
            this(pixContact, (i & 2) != 0 ? f.OUTGOING : fVar, new TransferMoneyPocket(null, null, 3));
        }
    }
}
