package com.revolut.feature.defi.remittances.impl.ui.send.add_beneficiary;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/defi/remittances/impl/ui/send/add_beneficiary/DeFiSendAddBeneficiaryScreenContract$Modal", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "AddressTypeInfo", "QrScanner", "Lcom/revolut/feature/defi/remittances/impl/ui/send/add_beneficiary/DeFiSendAddBeneficiaryScreenContract$Modal$AddressTypeInfo;", "Lcom/revolut/feature/defi/remittances/impl/ui/send/add_beneficiary/DeFiSendAddBeneficiaryScreenContract$Modal$QrScanner;", "feature_defi_remittances_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface DeFiSendAddBeneficiaryScreenContract$Modal extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/defi/remittances/impl/ui/send/add_beneficiary/DeFiSendAddBeneficiaryScreenContract$Modal$AddressTypeInfo;", "Lcom/revolut/feature/defi/remittances/impl/ui/send/add_beneficiary/DeFiSendAddBeneficiaryScreenContract$Modal;", "<init>", "()V", "feature_defi_remittances_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AddressTypeInfo implements DeFiSendAddBeneficiaryScreenContract$Modal {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AddressTypeInfo f71814a = new AddressTypeInfo();

        @NotNull
        public static final Parcelable.Creator<AddressTypeInfo> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AddressTypeInfo.f71814a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddressTypeInfo[i];
            }
        }

        private AddressTypeInfo() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/defi/remittances/impl/ui/send/add_beneficiary/DeFiSendAddBeneficiaryScreenContract$Modal$QrScanner;", "Lcom/revolut/feature/defi/remittances/impl/ui/send/add_beneficiary/DeFiSendAddBeneficiaryScreenContract$Modal;", "<init>", "()V", "feature_defi_remittances_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class QrScanner implements DeFiSendAddBeneficiaryScreenContract$Modal {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final QrScanner f71815a = new QrScanner();

        @NotNull
        public static final Parcelable.Creator<QrScanner> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return QrScanner.f71815a;
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
}
