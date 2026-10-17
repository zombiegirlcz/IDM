package com.revolut.retail.feature.crypto_deposits.impl.ui.directdeposit;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/retail/feature/crypto_deposits/impl/ui/directdeposit/CryptoDirectDepositFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "AllOptions", "Option", "Lcom/revolut/retail/feature/crypto_deposits/impl/ui/directdeposit/CryptoDirectDepositFlowContract$InputData$AllOptions;", "Lcom/revolut/retail/feature/crypto_deposits/impl/ui/directdeposit/CryptoDirectDepositFlowContract$InputData$Option;", "feature_crypto_deposits_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CryptoDirectDepositFlowContract$InputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/crypto_deposits/impl/ui/directdeposit/CryptoDirectDepositFlowContract$InputData$AllOptions;", "Lcom/revolut/retail/feature/crypto_deposits/impl/ui/directdeposit/CryptoDirectDepositFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_crypto_deposits_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AllOptions implements CryptoDirectDepositFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<AllOptions> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f100062a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AllOptions(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AllOptions[i];
            }
        }

        public AllOptions(boolean z) {
            this.f100062a = z;
        }

        @Override // com.revolut.retail.feature.crypto_deposits.impl.ui.directdeposit.CryptoDirectDepositFlowContract$InputData
        /* JADX INFO: renamed from: L6, reason: from getter */
        public final boolean getF100062a() {
            return this.f100062a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AllOptions) && this.f100062a == ((AllOptions) obj2).f100062a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f100062a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f100062a ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/crypto_deposits/impl/ui/directdeposit/CryptoDirectDepositFlowContract$InputData$Option;", "Lcom/revolut/retail/feature/crypto_deposits/impl/ui/directdeposit/CryptoDirectDepositFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_crypto_deposits_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Option implements CryptoDirectDepositFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Option> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final xi0.b f100063a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final wk5.a f100064b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Option(wk5.a.valueOf(parcel.readString()), (xi0.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Option[i];
            }
        }

        public Option(wk5.a blockchain, xi0.b currency) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(blockchain, "blockchain");
            this.f100063a = currency;
            this.f100064b = blockchain;
        }

        @Override // com.revolut.retail.feature.crypto_deposits.impl.ui.directdeposit.CryptoDirectDepositFlowContract$InputData
        /* JADX INFO: renamed from: L6 */
        public final boolean getF100062a() {
            return false;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Option)) {
                return false;
            }
            Option option = (Option) obj2;
            return Intrinsics.f(this.f100063a, option.f100063a) && this.f100064b == option.f100064b;
        }

        public final int hashCode() {
            return this.f100064b.hashCode() + (this.f100063a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f100063a);
            dest.writeString(this.f100064b.name());
        }
    }

    /* JADX INFO: renamed from: L6 */
    boolean getF100062a();
}
