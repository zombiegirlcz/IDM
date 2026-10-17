package com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary;

import android.os.Parcel;
import android.os.Parcelable;
import bq5.j0;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"com/revolut/feature/crypto/withdraw/impl/ui_v3/addbeneficiary/createbeneficiary/CryptoCreateBeneficiaryScreenContract$Modal", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Multichain", "Hosting", "DestinationTagInfo", "RecipientInfo", "SelectRecipientType", "TransformedAddressInfo", "QrScanner", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/addbeneficiary/createbeneficiary/CryptoCreateBeneficiaryScreenContract$Modal$DestinationTagInfo;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/addbeneficiary/createbeneficiary/CryptoCreateBeneficiaryScreenContract$Modal$Hosting;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/addbeneficiary/createbeneficiary/CryptoCreateBeneficiaryScreenContract$Modal$Multichain;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/addbeneficiary/createbeneficiary/CryptoCreateBeneficiaryScreenContract$Modal$QrScanner;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/addbeneficiary/createbeneficiary/CryptoCreateBeneficiaryScreenContract$Modal$RecipientInfo;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/addbeneficiary/createbeneficiary/CryptoCreateBeneficiaryScreenContract$Modal$SelectRecipientType;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/addbeneficiary/createbeneficiary/CryptoCreateBeneficiaryScreenContract$Modal$TransformedAddressInfo;", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CryptoCreateBeneficiaryScreenContract$Modal extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/addbeneficiary/createbeneficiary/CryptoCreateBeneficiaryScreenContract$Modal$DestinationTagInfo;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/addbeneficiary/createbeneficiary/CryptoCreateBeneficiaryScreenContract$Modal;", "", "toString", "()Ljava/lang/String;", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DestinationTagInfo implements CryptoCreateBeneficiaryScreenContract$Modal {

        @NotNull
        public static final Parcelable.Creator<DestinationTagInfo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f71227a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DestinationTagInfo((b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DestinationTagInfo[i];
            }
        }

        public DestinationTagInfo(b currency) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.f71227a = currency;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DestinationTagInfo) && Intrinsics.f(this.f71227a, ((DestinationTagInfo) obj2).f71227a);
        }

        public final int hashCode() {
            return this.f71227a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f71227a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/addbeneficiary/createbeneficiary/CryptoCreateBeneficiaryScreenContract$Modal$Hosting;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/addbeneficiary/createbeneficiary/CryptoCreateBeneficiaryScreenContract$Modal;", "", "toString", "()Ljava/lang/String;", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Hosting implements CryptoCreateBeneficiaryScreenContract$Modal {

        @NotNull
        public static final Parcelable.Creator<Hosting> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f71228a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Hosting(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Hosting[i];
            }
        }

        public Hosting(boolean z) {
            this.f71228a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Hosting) && this.f71228a == ((Hosting) obj2).f71228a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f71228a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f71228a ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/addbeneficiary/createbeneficiary/CryptoCreateBeneficiaryScreenContract$Modal$Multichain;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/addbeneficiary/createbeneficiary/CryptoCreateBeneficiaryScreenContract$Modal;", "<init>", "()V", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Multichain implements CryptoCreateBeneficiaryScreenContract$Modal {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Multichain f71229a = new Multichain();

        @NotNull
        public static final Parcelable.Creator<Multichain> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Multichain.f71229a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Multichain[i];
            }
        }

        private Multichain() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/addbeneficiary/createbeneficiary/CryptoCreateBeneficiaryScreenContract$Modal$QrScanner;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/addbeneficiary/createbeneficiary/CryptoCreateBeneficiaryScreenContract$Modal;", "<init>", "()V", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class QrScanner implements CryptoCreateBeneficiaryScreenContract$Modal {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final QrScanner f71230a = new QrScanner();

        @NotNull
        public static final Parcelable.Creator<QrScanner> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return QrScanner.f71230a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new QrScanner[i];
            }
        }

        private QrScanner() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/addbeneficiary/createbeneficiary/CryptoCreateBeneficiaryScreenContract$Modal$RecipientInfo;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/addbeneficiary/createbeneficiary/CryptoCreateBeneficiaryScreenContract$Modal;", "<init>", "()V", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RecipientInfo implements CryptoCreateBeneficiaryScreenContract$Modal {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RecipientInfo f71231a = new RecipientInfo();

        @NotNull
        public static final Parcelable.Creator<RecipientInfo> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RecipientInfo.f71231a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RecipientInfo[i];
            }
        }

        private RecipientInfo() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/addbeneficiary/createbeneficiary/CryptoCreateBeneficiaryScreenContract$Modal$SelectRecipientType;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/addbeneficiary/createbeneficiary/CryptoCreateBeneficiaryScreenContract$Modal;", "", "toString", "()Ljava/lang/String;", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SelectRecipientType implements CryptoCreateBeneficiaryScreenContract$Modal {

        @NotNull
        public static final Parcelable.Creator<SelectRecipientType> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j0 f71232a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SelectRecipientType(j0.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectRecipientType[i];
            }
        }

        public SelectRecipientType(j0 selectedRecipientType) {
            Intrinsics.checkNotNullParameter(selectedRecipientType, "selectedRecipientType");
            this.f71232a = selectedRecipientType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SelectRecipientType) && this.f71232a == ((SelectRecipientType) obj2).f71232a;
        }

        public final int hashCode() {
            return this.f71232a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f71232a.name());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/addbeneficiary/createbeneficiary/CryptoCreateBeneficiaryScreenContract$Modal$TransformedAddressInfo;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/addbeneficiary/createbeneficiary/CryptoCreateBeneficiaryScreenContract$Modal;", "<init>", "()V", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TransformedAddressInfo implements CryptoCreateBeneficiaryScreenContract$Modal {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TransformedAddressInfo f71233a = new TransformedAddressInfo();

        @NotNull
        public static final Parcelable.Creator<TransformedAddressInfo> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TransformedAddressInfo.f71233a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TransformedAddressInfo[i];
            }
        }

        private TransformedAddressInfo() {
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
}
