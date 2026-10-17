package com.revolut.feature_crypto_order_flow.impl.exchange.mappers;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature_crypto_order_flow.api.exchange.CryptoExchangeContract$AmountInputMapper$Params$CryptoTradeUsageLimit;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.Limit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"com/revolut/feature_crypto_order_flow/impl/exchange/mappers/CryptoExchangeAmountInputMapper$HintDialogReason", "Landroid/os/Parcelable;", "CryptoUpperLimitError", "CryptoLowerLimitError", "AccountBalanceLimitError", "CryptoTradeUsageLimitError", "Lcom/revolut/feature_crypto_order_flow/impl/exchange/mappers/CryptoExchangeAmountInputMapper$HintDialogReason$AccountBalanceLimitError;", "Lcom/revolut/feature_crypto_order_flow/impl/exchange/mappers/CryptoExchangeAmountInputMapper$HintDialogReason$CryptoLowerLimitError;", "Lcom/revolut/feature_crypto_order_flow/impl/exchange/mappers/CryptoExchangeAmountInputMapper$HintDialogReason$CryptoTradeUsageLimitError;", "Lcom/revolut/feature_crypto_order_flow/impl/exchange/mappers/CryptoExchangeAmountInputMapper$HintDialogReason$CryptoUpperLimitError;", "feature_crypto_order_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CryptoExchangeAmountInputMapper$HintDialogReason extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_crypto_order_flow/impl/exchange/mappers/CryptoExchangeAmountInputMapper$HintDialogReason$AccountBalanceLimitError;", "Lcom/revolut/feature_crypto_order_flow/impl/exchange/mappers/CryptoExchangeAmountInputMapper$HintDialogReason;", "", "toString", "()Ljava/lang/String;", "feature_crypto_order_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AccountBalanceLimitError implements CryptoExchangeAmountInputMapper$HintDialogReason {

        @NotNull
        public static final Parcelable.Creator<AccountBalanceLimitError> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Limit.UsageLimit f96758a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AccountBalanceLimitError((Limit.UsageLimit) parcel.readParcelable(AccountBalanceLimitError.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AccountBalanceLimitError[i];
            }
        }

        public AccountBalanceLimitError(Limit.UsageLimit limit) {
            Intrinsics.checkNotNullParameter(limit, "limit");
            this.f96758a = limit;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AccountBalanceLimitError) && Intrinsics.f(this.f96758a, ((AccountBalanceLimitError) obj2).f96758a);
        }

        public final int hashCode() {
            return this.f96758a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f96758a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_crypto_order_flow/impl/exchange/mappers/CryptoExchangeAmountInputMapper$HintDialogReason$CryptoLowerLimitError;", "Lcom/revolut/feature_crypto_order_flow/impl/exchange/mappers/CryptoExchangeAmountInputMapper$HintDialogReason;", "", "toString", "()Ljava/lang/String;", "feature_crypto_order_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CryptoLowerLimitError implements CryptoExchangeAmountInputMapper$HintDialogReason {

        @NotNull
        public static final Parcelable.Creator<CryptoLowerLimitError> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Amount f96759a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CryptoLowerLimitError((Amount) parcel.readParcelable(CryptoLowerLimitError.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CryptoLowerLimitError[i];
            }
        }

        public CryptoLowerLimitError(Amount amount) {
            this.f96759a = amount;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CryptoLowerLimitError) && Intrinsics.f(this.f96759a, ((CryptoLowerLimitError) obj2).f96759a);
        }

        public final int hashCode() {
            Amount amount = this.f96759a;
            if (amount == null) {
                return 0;
            }
            return amount.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f96759a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_crypto_order_flow/impl/exchange/mappers/CryptoExchangeAmountInputMapper$HintDialogReason$CryptoTradeUsageLimitError;", "Lcom/revolut/feature_crypto_order_flow/impl/exchange/mappers/CryptoExchangeAmountInputMapper$HintDialogReason;", "", "toString", "()Ljava/lang/String;", "feature_crypto_order_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CryptoTradeUsageLimitError implements CryptoExchangeAmountInputMapper$HintDialogReason {

        @NotNull
        public static final Parcelable.Creator<CryptoTradeUsageLimitError> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CryptoExchangeContract$AmountInputMapper$Params$CryptoTradeUsageLimit f96760a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CryptoTradeUsageLimitError((CryptoExchangeContract$AmountInputMapper$Params$CryptoTradeUsageLimit) parcel.readParcelable(CryptoTradeUsageLimitError.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CryptoTradeUsageLimitError[i];
            }
        }

        public CryptoTradeUsageLimitError(CryptoExchangeContract$AmountInputMapper$Params$CryptoTradeUsageLimit limit) {
            Intrinsics.checkNotNullParameter(limit, "limit");
            this.f96760a = limit;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CryptoTradeUsageLimitError) && Intrinsics.f(this.f96760a, ((CryptoTradeUsageLimitError) obj2).f96760a);
        }

        public final int hashCode() {
            return this.f96760a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f96760a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_crypto_order_flow/impl/exchange/mappers/CryptoExchangeAmountInputMapper$HintDialogReason$CryptoUpperLimitError;", "Lcom/revolut/feature_crypto_order_flow/impl/exchange/mappers/CryptoExchangeAmountInputMapper$HintDialogReason;", "", "toString", "()Ljava/lang/String;", "feature_crypto_order_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CryptoUpperLimitError implements CryptoExchangeAmountInputMapper$HintDialogReason {

        @NotNull
        public static final Parcelable.Creator<CryptoUpperLimitError> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Amount f96761a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CryptoUpperLimitError((Amount) parcel.readParcelable(CryptoUpperLimitError.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CryptoUpperLimitError[i];
            }
        }

        public CryptoUpperLimitError(Amount amount) {
            this.f96761a = amount;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CryptoUpperLimitError) && Intrinsics.f(this.f96761a, ((CryptoUpperLimitError) obj2).f96761a);
        }

        public final int hashCode() {
            Amount amount = this.f96761a;
            if (amount == null) {
                return 0;
            }
            return amount.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f96761a, i);
        }
    }
}
