package com.revolut.feature.crypto.withdraw.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.crypto.withdraw.api.models.CryptoWithdrawFeesBreakdown;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/api/navigation/CryptoFeeBreakdownDialogInput;", "Lcom/revolut/kompot/common/IOData$Input;", "WithBreakdown", "WithTransactionId", "Lcom/revolut/feature/crypto/withdraw/api/navigation/CryptoFeeBreakdownDialogInput$WithBreakdown;", "Lcom/revolut/feature/crypto/withdraw/api/navigation/CryptoFeeBreakdownDialogInput$WithTransactionId;", "feature_crypto_withdraw_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CryptoFeeBreakdownDialogInput extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/api/navigation/CryptoFeeBreakdownDialogInput$WithBreakdown;", "Lcom/revolut/feature/crypto/withdraw/api/navigation/CryptoFeeBreakdownDialogInput;", "", "toString", "()Ljava/lang/String;", "feature_crypto_withdraw_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WithBreakdown implements CryptoFeeBreakdownDialogInput {

        @NotNull
        public static final Parcelable.Creator<WithBreakdown> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CryptoWithdrawFeesBreakdown f71135a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final n9l.a f71136b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WithBreakdown(CryptoWithdrawFeesBreakdown.CREATOR.createFromParcel(parcel), (n9l.a) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WithBreakdown[i];
            }
        }

        public WithBreakdown(CryptoWithdrawFeesBreakdown breakdown, n9l.a aVar) {
            Intrinsics.checkNotNullParameter(breakdown, "breakdown");
            this.f71135a = breakdown;
            this.f71136b = aVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof WithBreakdown)) {
                return false;
            }
            WithBreakdown withBreakdown = (WithBreakdown) obj2;
            return Intrinsics.f(this.f71135a, withBreakdown.f71135a) && Intrinsics.f(this.f71136b, withBreakdown.f71136b);
        }

        public final int hashCode() {
            int iHashCode = this.f71135a.hashCode() * 31;
            n9l.a aVar = this.f71136b;
            return iHashCode + (aVar == null ? 0 : aVar.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f71135a.writeToParcel(dest, i);
            dest.writeSerializable(this.f71136b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/api/navigation/CryptoFeeBreakdownDialogInput$WithTransactionId;", "Lcom/revolut/feature/crypto/withdraw/api/navigation/CryptoFeeBreakdownDialogInput;", "", "toString", "()Ljava/lang/String;", "feature_crypto_withdraw_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WithTransactionId implements CryptoFeeBreakdownDialogInput {

        @NotNull
        public static final Parcelable.Creator<WithTransactionId> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f71137a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final n9l.a f71138b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WithTransactionId(parcel.readString(), (n9l.a) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WithTransactionId[i];
            }
        }

        public WithTransactionId(String transactionGroupId, n9l.a aVar) {
            Intrinsics.checkNotNullParameter(transactionGroupId, "transactionGroupId");
            this.f71137a = transactionGroupId;
            this.f71138b = aVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof WithTransactionId)) {
                return false;
            }
            WithTransactionId withTransactionId = (WithTransactionId) obj2;
            return Intrinsics.f(this.f71137a, withTransactionId.f71137a) && Intrinsics.f(this.f71138b, withTransactionId.f71138b);
        }

        public final int hashCode() {
            int iHashCode = this.f71137a.hashCode() * 31;
            n9l.a aVar = this.f71138b;
            return iHashCode + (aVar == null ? 0 : aVar.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f71137a);
            dest.writeSerializable(this.f71138b);
        }
    }
}
