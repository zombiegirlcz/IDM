package com.revolut.feature_crypto_order_flow.api.exchange;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kyh.f;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/revolut/feature_crypto_order_flow/api/exchange/CryptoExchangeContract$MoneyDetails", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "BalanceIdentifier", "kyh/f", "feature_crypto_order_flow_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoExchangeContract$MoneyDetails implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CryptoExchangeContract$MoneyDetails> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f96683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f96684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f96685c;
    public final boolean d;
    public final BalanceIdentifier e;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature_crypto_order_flow/api/exchange/CryptoExchangeContract$MoneyDetails$BalanceIdentifier;", "Landroid/os/Parcelable;", "Pocket", "LoyaltyAccount", "Lcom/revolut/feature_crypto_order_flow/api/exchange/CryptoExchangeContract$MoneyDetails$BalanceIdentifier$LoyaltyAccount;", "Lcom/revolut/feature_crypto_order_flow/api/exchange/CryptoExchangeContract$MoneyDetails$BalanceIdentifier$Pocket;", "feature_crypto_order_flow_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface BalanceIdentifier extends Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_crypto_order_flow/api/exchange/CryptoExchangeContract$MoneyDetails$BalanceIdentifier$LoyaltyAccount;", "Lcom/revolut/feature_crypto_order_flow/api/exchange/CryptoExchangeContract$MoneyDetails$BalanceIdentifier;", "", "toString", "()Ljava/lang/String;", "feature_crypto_order_flow_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class LoyaltyAccount implements BalanceIdentifier {

            @NotNull
            public static final Parcelable.Creator<LoyaltyAccount> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f96686a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new LoyaltyAccount(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new LoyaltyAccount[i];
                }
            }

            public LoyaltyAccount(String pointsAccountId) {
                Intrinsics.checkNotNullParameter(pointsAccountId, "pointsAccountId");
                this.f96686a = pointsAccountId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof LoyaltyAccount) && Intrinsics.f(this.f96686a, ((LoyaltyAccount) obj2).f96686a);
            }

            public final int hashCode() {
                return this.f96686a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f96686a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_crypto_order_flow/api/exchange/CryptoExchangeContract$MoneyDetails$BalanceIdentifier$Pocket;", "Lcom/revolut/feature_crypto_order_flow/api/exchange/CryptoExchangeContract$MoneyDetails$BalanceIdentifier;", "", "toString", "()Ljava/lang/String;", "feature_crypto_order_flow_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Pocket implements BalanceIdentifier {

            @NotNull
            public static final Parcelable.Creator<Pocket> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f96687a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final AccountId f96688b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Pocket((AccountId) parcel.readParcelable(Pocket.class.getClassLoader()), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Pocket[i];
                }
            }

            public Pocket(AccountId ownerAccountId, String str) {
                Intrinsics.checkNotNullParameter(ownerAccountId, "ownerAccountId");
                this.f96687a = str;
                this.f96688b = ownerAccountId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Pocket)) {
                    return false;
                }
                Pocket pocket = (Pocket) obj2;
                return Intrinsics.f(this.f96687a, pocket.f96687a) && Intrinsics.f(this.f96688b, pocket.f96688b);
            }

            public final int hashCode() {
                String str = this.f96687a;
                return this.f96688b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f96687a);
                dest.writeParcelable(this.f96688b, i);
            }
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoExchangeContract$MoneyDetails((b) parcel.readSerializable(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? f.valueOf(parcel.readString()) : null, parcel.readInt() != 0, (BalanceIdentifier) parcel.readParcelable(CryptoExchangeContract$MoneyDetails.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoExchangeContract$MoneyDetails[i];
        }
    }

    public CryptoExchangeContract$MoneyDetails(b currency, Long l2, f fVar, boolean z, BalanceIdentifier balanceIdentifier) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(balanceIdentifier, "balanceIdentifier");
        this.f96683a = currency;
        this.f96684b = l2;
        this.f96685c = fVar;
        this.d = z;
        this.e = balanceIdentifier;
    }

    public static CryptoExchangeContract$MoneyDetails a(CryptoExchangeContract$MoneyDetails cryptoExchangeContract$MoneyDetails, b currency, Long l2, f fVar) {
        boolean z = cryptoExchangeContract$MoneyDetails.d;
        BalanceIdentifier balanceIdentifier = cryptoExchangeContract$MoneyDetails.e;
        cryptoExchangeContract$MoneyDetails.getClass();
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(balanceIdentifier, "balanceIdentifier");
        return new CryptoExchangeContract$MoneyDetails(currency, l2, fVar, z, balanceIdentifier);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CryptoExchangeContract$MoneyDetails)) {
            return false;
        }
        CryptoExchangeContract$MoneyDetails cryptoExchangeContract$MoneyDetails = (CryptoExchangeContract$MoneyDetails) obj2;
        return Intrinsics.f(this.f96683a, cryptoExchangeContract$MoneyDetails.f96683a) && Intrinsics.f(this.f96684b, cryptoExchangeContract$MoneyDetails.f96684b) && this.f96685c == cryptoExchangeContract$MoneyDetails.f96685c && this.d == cryptoExchangeContract$MoneyDetails.d && Intrinsics.f(this.e, cryptoExchangeContract$MoneyDetails.e);
    }

    public final int hashCode() {
        int iHashCode = this.f96683a.hashCode() * 31;
        Long l2 = this.f96684b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        f fVar = this.f96685c;
        return this.e.hashCode() + j6.a.c((iHashCode2 + (fVar != null ? fVar.hashCode() : 0)) * 31, 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f96683a);
        Long l2 = this.f96684b;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            m72.b.A(dest, 1, l2);
        }
        f fVar = this.f96685c;
        if (fVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(fVar.name());
        }
        dest.writeInt(this.d ? 1 : 0);
        dest.writeParcelable(this.e, i);
    }

    public /* synthetic */ CryptoExchangeContract$MoneyDetails(b bVar, Long l2, boolean z, BalanceIdentifier balanceIdentifier, int i) {
        this(bVar, (i & 2) != 0 ? null : l2, (f) null, (i & 8) != 0 ? false : z, balanceIdentifier);
    }
}
