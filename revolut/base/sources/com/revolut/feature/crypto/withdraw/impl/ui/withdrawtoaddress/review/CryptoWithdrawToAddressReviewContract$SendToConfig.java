package com.revolut.feature.crypto.withdraw.impl.ui.withdrawtoaddress.review;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.crypto.withdraw.api.navigation.WithdrawFinishBehavior;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/crypto/withdraw/impl/ui/withdrawtoaddress/review/CryptoWithdrawToAddressReviewContract$SendToConfig", "Landroid/os/Parcelable;", "ExistingAddress", "MatchOrCreateAddressForCurrency", "QuickSend", "Lcom/revolut/feature/crypto/withdraw/impl/ui/withdrawtoaddress/review/CryptoWithdrawToAddressReviewContract$SendToConfig$ExistingAddress;", "Lcom/revolut/feature/crypto/withdraw/impl/ui/withdrawtoaddress/review/CryptoWithdrawToAddressReviewContract$SendToConfig$MatchOrCreateAddressForCurrency;", "Lcom/revolut/feature/crypto/withdraw/impl/ui/withdrawtoaddress/review/CryptoWithdrawToAddressReviewContract$SendToConfig$QuickSend;", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CryptoWithdrawToAddressReviewContract$SendToConfig implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f71182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f71183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f71184c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/impl/ui/withdrawtoaddress/review/CryptoWithdrawToAddressReviewContract$SendToConfig$ExistingAddress;", "Lcom/revolut/feature/crypto/withdraw/impl/ui/withdrawtoaddress/review/CryptoWithdrawToAddressReviewContract$SendToConfig;", "", "toString", "()Ljava/lang/String;", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ExistingAddress extends CryptoWithdrawToAddressReviewContract$SendToConfig {

        @NotNull
        public static final Parcelable.Creator<ExistingAddress> CREATOR = new a();
        public final String d;
        public final WithdrawFinishBehavior e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ExistingAddress(parcel.readString(), (WithdrawFinishBehavior) parcel.readParcelable(ExistingAddress.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExistingAddress[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ExistingAddress(String existingAddressId, WithdrawFinishBehavior withdrawFinishBehavior) {
            super(existingAddressId, null, null);
            Intrinsics.checkNotNullParameter(existingAddressId, "existingAddressId");
            Intrinsics.checkNotNullParameter(withdrawFinishBehavior, "withdrawFinishBehavior");
            this.d = existingAddressId;
            this.e = withdrawFinishBehavior;
        }

        @Override // com.revolut.feature.crypto.withdraw.impl.ui.withdrawtoaddress.review.CryptoWithdrawToAddressReviewContract$SendToConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final WithdrawFinishBehavior getE() {
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
            if (!(obj2 instanceof ExistingAddress)) {
                return false;
            }
            ExistingAddress existingAddress = (ExistingAddress) obj2;
            return Intrinsics.f(this.d, existingAddress.d) && Intrinsics.f(this.e, existingAddress.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + (this.d.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.d);
            dest.writeParcelable(this.e, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/impl/ui/withdrawtoaddress/review/CryptoWithdrawToAddressReviewContract$SendToConfig$MatchOrCreateAddressForCurrency;", "Lcom/revolut/feature/crypto/withdraw/impl/ui/withdrawtoaddress/review/CryptoWithdrawToAddressReviewContract$SendToConfig;", "", "toString", "()Ljava/lang/String;", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MatchOrCreateAddressForCurrency extends CryptoWithdrawToAddressReviewContract$SendToConfig {

        @NotNull
        public static final Parcelable.Creator<MatchOrCreateAddressForCurrency> CREATOR = new a();
        public final String d;
        public final b e;
        public final WithdrawFinishBehavior f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MatchOrCreateAddressForCurrency((WithdrawFinishBehavior) parcel.readParcelable(MatchOrCreateAddressForCurrency.class.getClassLoader()), parcel.readString(), (b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MatchOrCreateAddressForCurrency[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MatchOrCreateAddressForCurrency(WithdrawFinishBehavior withdrawFinishBehavior, String existingAddressId, b currency) {
            super(existingAddressId, null, currency);
            Intrinsics.checkNotNullParameter(existingAddressId, "existingAddressId");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(withdrawFinishBehavior, "withdrawFinishBehavior");
            this.d = existingAddressId;
            this.e = currency;
            this.f = withdrawFinishBehavior;
        }

        @Override // com.revolut.feature.crypto.withdraw.impl.ui.withdrawtoaddress.review.CryptoWithdrawToAddressReviewContract$SendToConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final WithdrawFinishBehavior getE() {
            return this.f;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof MatchOrCreateAddressForCurrency)) {
                return false;
            }
            MatchOrCreateAddressForCurrency matchOrCreateAddressForCurrency = (MatchOrCreateAddressForCurrency) obj2;
            return Intrinsics.f(this.d, matchOrCreateAddressForCurrency.d) && Intrinsics.f(this.e, matchOrCreateAddressForCurrency.e) && Intrinsics.f(this.f, matchOrCreateAddressForCurrency.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + l.j(this.e, this.d.hashCode() * 31, 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.d);
            dest.writeSerializable(this.e);
            dest.writeParcelable(this.f, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/impl/ui/withdrawtoaddress/review/CryptoWithdrawToAddressReviewContract$SendToConfig$QuickSend;", "Lcom/revolut/feature/crypto/withdraw/impl/ui/withdrawtoaddress/review/CryptoWithdrawToAddressReviewContract$SendToConfig;", "", "toString", "()Ljava/lang/String;", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class QuickSend extends CryptoWithdrawToAddressReviewContract$SendToConfig {

        @NotNull
        public static final Parcelable.Creator<QuickSend> CREATOR = new a();
        public final CryptoAddress d;
        public final WithdrawFinishBehavior e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new QuickSend((CryptoAddress) parcel.readParcelable(QuickSend.class.getClassLoader()), (WithdrawFinishBehavior) parcel.readParcelable(QuickSend.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new QuickSend[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QuickSend(CryptoAddress beneficiary, WithdrawFinishBehavior withdrawFinishBehavior) {
            super(beneficiary.f71059a, beneficiary.f71061c, beneficiary.f71060b);
            Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
            Intrinsics.checkNotNullParameter(withdrawFinishBehavior, "withdrawFinishBehavior");
            this.d = beneficiary;
            this.e = withdrawFinishBehavior;
        }

        @Override // com.revolut.feature.crypto.withdraw.impl.ui.withdrawtoaddress.review.CryptoWithdrawToAddressReviewContract$SendToConfig
        public final boolean F7() {
            return true;
        }

        @Override // com.revolut.feature.crypto.withdraw.impl.ui.withdrawtoaddress.review.CryptoWithdrawToAddressReviewContract$SendToConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final WithdrawFinishBehavior getE() {
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
            if (!(obj2 instanceof QuickSend)) {
                return false;
            }
            QuickSend quickSend = (QuickSend) obj2;
            return Intrinsics.f(this.d, quickSend.d) && Intrinsics.f(this.e, quickSend.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + (this.d.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.d, i);
            dest.writeParcelable(this.e, i);
        }
    }

    public CryptoWithdrawToAddressReviewContract$SendToConfig(String str, String str2, b bVar) {
        this.f71182a = str;
        this.f71183b = bVar;
        this.f71184c = str2;
    }

    public boolean F7() {
        return false;
    }

    /* JADX INFO: renamed from: a */
    public abstract WithdrawFinishBehavior getE();
}
