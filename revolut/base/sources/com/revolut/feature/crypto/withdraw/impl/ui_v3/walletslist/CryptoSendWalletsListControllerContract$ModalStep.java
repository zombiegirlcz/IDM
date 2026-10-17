package com.revolut.feature.crypto.withdraw.impl.ui_v3.walletslist;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"com/revolut/feature/crypto/withdraw/impl/ui_v3/walletslist/CryptoSendWalletsListControllerContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Multichain", "ScanQr", "Transfer", "AddRecipientBottomSheet", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/walletslist/CryptoSendWalletsListControllerContract$ModalStep$AddRecipientBottomSheet;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/walletslist/CryptoSendWalletsListControllerContract$ModalStep$Multichain;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/walletslist/CryptoSendWalletsListControllerContract$ModalStep$ScanQr;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/walletslist/CryptoSendWalletsListControllerContract$ModalStep$Transfer;", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CryptoSendWalletsListControllerContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/walletslist/CryptoSendWalletsListControllerContract$ModalStep$AddRecipientBottomSheet;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/walletslist/CryptoSendWalletsListControllerContract$ModalStep;", "<init>", "()V", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AddRecipientBottomSheet implements CryptoSendWalletsListControllerContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AddRecipientBottomSheet f71337a = new AddRecipientBottomSheet();

        @NotNull
        public static final Parcelable.Creator<AddRecipientBottomSheet> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AddRecipientBottomSheet.f71337a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddRecipientBottomSheet[i];
            }
        }

        private AddRecipientBottomSheet() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/walletslist/CryptoSendWalletsListControllerContract$ModalStep$Multichain;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/walletslist/CryptoSendWalletsListControllerContract$ModalStep;", "<init>", "()V", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Multichain implements CryptoSendWalletsListControllerContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Multichain f71338a = new Multichain();

        @NotNull
        public static final Parcelable.Creator<Multichain> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Multichain.f71338a;
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/walletslist/CryptoSendWalletsListControllerContract$ModalStep$ScanQr;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/walletslist/CryptoSendWalletsListControllerContract$ModalStep;", "<init>", "()V", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ScanQr implements CryptoSendWalletsListControllerContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ScanQr f71339a = new ScanQr();

        @NotNull
        public static final Parcelable.Creator<ScanQr> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ScanQr.f71339a;
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/walletslist/CryptoSendWalletsListControllerContract$ModalStep$Transfer;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/walletslist/CryptoSendWalletsListControllerContract$ModalStep;", "<init>", "()V", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Transfer implements CryptoSendWalletsListControllerContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Transfer f71340a = new Transfer();

        @NotNull
        public static final Parcelable.Creator<Transfer> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Transfer.f71340a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Transfer[i];
            }
        }

        private Transfer() {
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
