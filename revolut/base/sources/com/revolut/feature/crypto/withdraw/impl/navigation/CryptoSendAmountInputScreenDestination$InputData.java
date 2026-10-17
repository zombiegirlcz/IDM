package com.revolut.feature.crypto.withdraw.impl.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/crypto/withdraw/impl/navigation/CryptoSendAmountInputScreenDestination$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "ExistingBeneficiary", "QuickSend", "Lcom/revolut/feature/crypto/withdraw/impl/navigation/CryptoSendAmountInputScreenDestination$InputData$ExistingBeneficiary;", "Lcom/revolut/feature/crypto/withdraw/impl/navigation/CryptoSendAmountInputScreenDestination$InputData$QuickSend;", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CryptoSendAmountInputScreenDestination$InputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/impl/navigation/CryptoSendAmountInputScreenDestination$InputData$ExistingBeneficiary;", "Lcom/revolut/feature/crypto/withdraw/impl/navigation/CryptoSendAmountInputScreenDestination$InputData;", "", "toString", "()Ljava/lang/String;", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ExistingBeneficiary implements CryptoSendAmountInputScreenDestination$InputData {

        @NotNull
        public static final Parcelable.Creator<ExistingBeneficiary> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CryptoAddress f71151a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f71152b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ExistingBeneficiary((CryptoAddress) parcel.readParcelable(ExistingBeneficiary.class.getClassLoader()), (b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExistingBeneficiary[i];
            }
        }

        public ExistingBeneficiary(CryptoAddress beneficiary, b bVar) {
            Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
            this.f71151a = beneficiary;
            this.f71152b = bVar;
        }

        @Override // com.revolut.feature.crypto.withdraw.impl.navigation.CryptoSendAmountInputScreenDestination$InputData
        public final boolean F7() {
            return false;
        }

        @Override // com.revolut.feature.crypto.withdraw.impl.navigation.CryptoSendAmountInputScreenDestination$InputData
        /* JADX INFO: renamed from: T8, reason: from getter */
        public final b getF71154b() {
            return this.f71152b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ExistingBeneficiary)) {
                return false;
            }
            ExistingBeneficiary existingBeneficiary = (ExistingBeneficiary) obj2;
            return Intrinsics.f(this.f71151a, existingBeneficiary.f71151a) && Intrinsics.f(this.f71152b, existingBeneficiary.f71152b);
        }

        public final int hashCode() {
            int iHashCode = this.f71151a.hashCode() * 31;
            b bVar = this.f71152b;
            return iHashCode + (bVar == null ? 0 : bVar.hashCode());
        }

        @Override // com.revolut.feature.crypto.withdraw.impl.navigation.CryptoSendAmountInputScreenDestination$InputData
        /* JADX INFO: renamed from: s, reason: from getter */
        public final CryptoAddress getF71153a() {
            return this.f71151a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f71151a, i);
            dest.writeSerializable(this.f71152b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/impl/navigation/CryptoSendAmountInputScreenDestination$InputData$QuickSend;", "Lcom/revolut/feature/crypto/withdraw/impl/navigation/CryptoSendAmountInputScreenDestination$InputData;", "", "toString", "()Ljava/lang/String;", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class QuickSend implements CryptoSendAmountInputScreenDestination$InputData {

        @NotNull
        public static final Parcelable.Creator<QuickSend> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CryptoAddress f71153a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f71154b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new QuickSend((CryptoAddress) parcel.readParcelable(QuickSend.class.getClassLoader()), (b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new QuickSend[i];
            }
        }

        public QuickSend(CryptoAddress beneficiary, b bVar) {
            Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
            this.f71153a = beneficiary;
            this.f71154b = bVar;
        }

        @Override // com.revolut.feature.crypto.withdraw.impl.navigation.CryptoSendAmountInputScreenDestination$InputData
        public final boolean F7() {
            return true;
        }

        @Override // com.revolut.feature.crypto.withdraw.impl.navigation.CryptoSendAmountInputScreenDestination$InputData
        /* JADX INFO: renamed from: T8, reason: from getter */
        public final b getF71154b() {
            return this.f71154b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof QuickSend)) {
                return false;
            }
            QuickSend quickSend = (QuickSend) obj2;
            return Intrinsics.f(this.f71153a, quickSend.f71153a) && Intrinsics.f(this.f71154b, quickSend.f71154b);
        }

        public final int hashCode() {
            int iHashCode = this.f71153a.hashCode() * 31;
            b bVar = this.f71154b;
            return iHashCode + (bVar == null ? 0 : bVar.hashCode());
        }

        @Override // com.revolut.feature.crypto.withdraw.impl.navigation.CryptoSendAmountInputScreenDestination$InputData
        /* JADX INFO: renamed from: s, reason: from getter */
        public final CryptoAddress getF71153a() {
            return this.f71153a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f71153a, i);
            dest.writeSerializable(this.f71154b);
        }
    }

    boolean F7();

    /* JADX INFO: renamed from: T8 */
    b getF71154b();

    /* JADX INFO: renamed from: s */
    CryptoAddress getF71153a();
}
