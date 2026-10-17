package com.revolut.retail.feature.crypto_deposits.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/crypto_deposits/api/navigation/CryptoDepositInput;", "Lcom/revolut/kompot/common/IOData$Input;", "Overview", "DeFi", "DirectDeposit", "Lcom/revolut/retail/feature/crypto_deposits/api/navigation/CryptoDepositInput$DeFi;", "Lcom/revolut/retail/feature/crypto_deposits/api/navigation/CryptoDepositInput$DirectDeposit;", "Lcom/revolut/retail/feature/crypto_deposits/api/navigation/CryptoDepositInput$Overview;", "feature_crypto_deposits_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CryptoDepositInput extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/crypto_deposits/api/navigation/CryptoDepositInput$DeFi;", "Lcom/revolut/retail/feature/crypto_deposits/api/navigation/CryptoDepositInput;", "", "toString", "()Ljava/lang/String;", "feature_crypto_deposits_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DeFi implements CryptoDepositInput {

        @NotNull
        public static final Parcelable.Creator<DeFi> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100041a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f100042b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DeFi(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DeFi[i];
            }
        }

        public DeFi(String accountId, String assetExternalId) {
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            Intrinsics.checkNotNullParameter(assetExternalId, "assetExternalId");
            this.f100041a = accountId;
            this.f100042b = assetExternalId;
        }

        @Override // com.revolut.retail.feature.crypto_deposits.api.navigation.CryptoDepositInput
        /* JADX INFO: renamed from: D0 */
        public final boolean getE() {
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
            if (!(obj2 instanceof DeFi)) {
                return false;
            }
            DeFi deFi = (DeFi) obj2;
            return Intrinsics.f(this.f100041a, deFi.f100041a) && Intrinsics.f(this.f100042b, deFi.f100042b);
        }

        public final int hashCode() {
            return this.f100042b.hashCode() + (this.f100041a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100041a);
            dest.writeString(this.f100042b);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/crypto_deposits/api/navigation/CryptoDepositInput$DirectDeposit;", "Lcom/revolut/retail/feature/crypto_deposits/api/navigation/CryptoDepositInput;", "AllOptions", "Option", "Lcom/revolut/retail/feature/crypto_deposits/api/navigation/CryptoDepositInput$DirectDeposit$AllOptions;", "Lcom/revolut/retail/feature/crypto_deposits/api/navigation/CryptoDepositInput$DirectDeposit$Option;", "feature_crypto_deposits_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface DirectDeposit extends CryptoDepositInput {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/crypto_deposits/api/navigation/CryptoDepositInput$DirectDeposit$AllOptions;", "Lcom/revolut/retail/feature/crypto_deposits/api/navigation/CryptoDepositInput$DirectDeposit;", "", "toString", "()Ljava/lang/String;", "feature_crypto_deposits_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class AllOptions implements DirectDeposit {

            @NotNull
            public static final Parcelable.Creator<AllOptions> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f100043a;

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
                this.f100043a = z;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof AllOptions) && this.f100043a == ((AllOptions) obj2).f100043a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f100043a);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.f100043a ? 1 : 0);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/crypto_deposits/api/navigation/CryptoDepositInput$DirectDeposit$Option;", "Lcom/revolut/retail/feature/crypto_deposits/api/navigation/CryptoDepositInput$DirectDeposit;", "", "toString", "()Ljava/lang/String;", "feature_crypto_deposits_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Option implements DirectDeposit {

            @NotNull
            public static final Parcelable.Creator<Option> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b f100044a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final wk5.a f100045b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Option(wk5.a.valueOf(parcel.readString()), (b) parcel.readSerializable());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Option[i];
                }
            }

            public Option(wk5.a blockchain, b currency) {
                Intrinsics.checkNotNullParameter(currency, "currency");
                Intrinsics.checkNotNullParameter(blockchain, "blockchain");
                this.f100044a = currency;
                this.f100045b = blockchain;
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
                return Intrinsics.f(this.f100044a, option.f100044a) && this.f100045b == option.f100045b;
            }

            public final int hashCode() {
                return this.f100045b.hashCode() + (this.f100044a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f100044a);
                dest.writeString(this.f100045b.name());
            }
        }

        @Override // com.revolut.retail.feature.crypto_deposits.api.navigation.CryptoDepositInput
        /* JADX INFO: renamed from: D0 */
        default boolean getE() {
            return false;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/crypto_deposits/api/navigation/CryptoDepositInput$Overview;", "Lcom/revolut/retail/feature/crypto_deposits/api/navigation/CryptoDepositInput;", "", "toString", "()Ljava/lang/String;", "com/revolut/retail/feature/crypto_deposits/api/navigation/a", "feature_crypto_deposits_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Overview implements CryptoDepositInput {

        @NotNull
        public static final Parcelable.Creator<Overview> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f100046a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.revolut.retail.feature.crypto_deposits.api.navigation.a f100047b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f100048c;
        public final hbj.b d;
        public final boolean e;
        public final wk5.a f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Overview((b) parcel.readSerializable(), parcel.readInt() == 0 ? null : com.revolut.retail.feature.crypto_deposits.api.navigation.a.valueOf(parcel.readString()), parcel.readInt() != 0, hbj.b.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0 ? wk5.a.valueOf(parcel.readString()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Overview[i];
            }
        }

        public Overview() {
            this((b) null, (com.revolut.retail.feature.crypto_deposits.api.navigation.a) null, false, (hbj.b) null, (wk5.a) null, 63);
        }

        @Override // com.revolut.retail.feature.crypto_deposits.api.navigation.CryptoDepositInput
        /* JADX INFO: renamed from: D0, reason: from getter */
        public final boolean getE() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Overview)) {
                return false;
            }
            Overview overview = (Overview) obj2;
            return Intrinsics.f(this.f100046a, overview.f100046a) && this.f100047b == overview.f100047b && this.f100048c == overview.f100048c && this.d == overview.d && this.e == overview.e && this.f == overview.f;
        }

        public final int hashCode() {
            b bVar = this.f100046a;
            int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
            com.revolut.retail.feature.crypto_deposits.api.navigation.a aVar = this.f100047b;
            int iC = j6.a.c((this.d.hashCode() + j6.a.c((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.f100048c)) * 31, 31, this.e);
            wk5.a aVar2 = this.f;
            return iC + (aVar2 != null ? aVar2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f100046a);
            com.revolut.retail.feature.crypto_deposits.api.navigation.a aVar = this.f100047b;
            if (aVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(aVar.name());
            }
            dest.writeInt(this.f100048c ? 1 : 0);
            dest.writeString(this.d.name());
            dest.writeInt(this.e ? 1 : 0);
            wk5.a aVar2 = this.f;
            if (aVar2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(aVar2.name());
            }
        }

        public Overview(b bVar, com.revolut.retail.feature.crypto_deposits.api.navigation.a aVar, boolean z, hbj.b insidePopupToShow, boolean z3, wk5.a aVar2) {
            Intrinsics.checkNotNullParameter(insidePopupToShow, "insidePopupToShow");
            this.f100046a = bVar;
            this.f100047b = aVar;
            this.f100048c = z;
            this.d = insidePopupToShow;
            this.e = z3;
            this.f = aVar2;
        }

        public /* synthetic */ Overview(b bVar, com.revolut.retail.feature.crypto_deposits.api.navigation.a aVar, boolean z, hbj.b bVar2, wk5.a aVar2, int i) {
            this((i & 1) != 0 ? null : bVar, (i & 2) != 0 ? null : aVar, (i & 4) != 0 ? false : z, (i & 8) != 0 ? hbj.b.NETWORK_PICKER : bVar2, (i & 16) != 0, (i & 32) != 0 ? null : aVar2);
        }
    }

    /* JADX INFO: renamed from: D0 */
    boolean getE();
}
