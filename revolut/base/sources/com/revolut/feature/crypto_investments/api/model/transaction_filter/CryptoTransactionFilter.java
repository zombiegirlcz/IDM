package com.revolut.feature.crypto_investments.api.model.transaction_filter;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/crypto_investments/api/model/transaction_filter/CryptoTransactionFilter;", "Landroid/os/Parcelable;", "TransactionTypeFilter", "CurrencyFilter", "AccountTypeFilter", "Lcom/revolut/feature/crypto_investments/api/model/transaction_filter/CryptoTransactionFilter$AccountTypeFilter;", "Lcom/revolut/feature/crypto_investments/api/model/transaction_filter/CryptoTransactionFilter$CurrencyFilter;", "Lcom/revolut/feature/crypto_investments/api/model/transaction_filter/CryptoTransactionFilter$TransactionTypeFilter;", "feature_crypto_investments_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CryptoTransactionFilter implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto_investments/api/model/transaction_filter/CryptoTransactionFilter$AccountTypeFilter;", "Lcom/revolut/feature/crypto_investments/api/model/transaction_filter/CryptoTransactionFilter;", "", "toString", "()Ljava/lang/String;", "feature_crypto_investments_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AccountTypeFilter extends CryptoTransactionFilter {

        @NotNull
        public static final Parcelable.Creator<AccountTypeFilter> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final it5.a f71388a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f71389b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f71390c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AccountTypeFilter(it5.a.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AccountTypeFilter[i];
            }
        }

        public AccountTypeFilter(it5.a accountType, boolean z) {
            Intrinsics.checkNotNullParameter(accountType, "accountType");
            this.f71388a = accountType;
            this.f71389b = z;
            this.f71390c = accountType.name();
        }

        public static AccountTypeFilter d(AccountTypeFilter accountTypeFilter, boolean z) {
            it5.a accountType = accountTypeFilter.f71388a;
            Intrinsics.checkNotNullParameter(accountType, "accountType");
            return new AccountTypeFilter(accountType, z);
        }

        @Override // com.revolut.feature.crypto_investments.api.model.transaction_filter.CryptoTransactionFilter
        public final CryptoTransactionFilter a() {
            return d(this, !this.f71389b);
        }

        @Override // com.revolut.feature.crypto_investments.api.model.transaction_filter.CryptoTransactionFilter
        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getF71395b() {
            return this.f71389b;
        }

        @Override // com.revolut.feature.crypto_investments.api.model.transaction_filter.CryptoTransactionFilter
        public final CryptoTransactionFilter c() {
            return d(this, false);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AccountTypeFilter)) {
                return false;
            }
            AccountTypeFilter accountTypeFilter = (AccountTypeFilter) obj2;
            return this.f71388a == accountTypeFilter.f71388a && this.f71389b == accountTypeFilter.f71389b;
        }

        @Override // com.revolut.feature.crypto_investments.api.model.transaction_filter.CryptoTransactionFilter
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF71396c() {
            return this.f71390c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f71389b) + (this.f71388a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f71388a.name());
            dest.writeInt(this.f71389b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto_investments/api/model/transaction_filter/CryptoTransactionFilter$CurrencyFilter;", "Lcom/revolut/feature/crypto_investments/api/model/transaction_filter/CryptoTransactionFilter;", "", "toString", "()Ljava/lang/String;", "feature_crypto_investments_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CurrencyFilter extends CryptoTransactionFilter {

        @NotNull
        public static final Parcelable.Creator<CurrencyFilter> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f71391a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f71392b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f71393c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CurrencyFilter((b) parcel.readSerializable(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CurrencyFilter[i];
            }
        }

        public CurrencyFilter(b currency, boolean z) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.f71391a = currency;
            this.f71392b = z;
            this.f71393c = currency.f306286a;
        }

        public static CurrencyFilter d(CurrencyFilter currencyFilter, boolean z) {
            b currency = currencyFilter.f71391a;
            Intrinsics.checkNotNullParameter(currency, "currency");
            return new CurrencyFilter(currency, z);
        }

        @Override // com.revolut.feature.crypto_investments.api.model.transaction_filter.CryptoTransactionFilter
        public final CryptoTransactionFilter a() {
            return d(this, !this.f71392b);
        }

        @Override // com.revolut.feature.crypto_investments.api.model.transaction_filter.CryptoTransactionFilter
        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getF71395b() {
            return this.f71392b;
        }

        @Override // com.revolut.feature.crypto_investments.api.model.transaction_filter.CryptoTransactionFilter
        public final CryptoTransactionFilter c() {
            return d(this, false);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CurrencyFilter)) {
                return false;
            }
            CurrencyFilter currencyFilter = (CurrencyFilter) obj2;
            return Intrinsics.f(this.f71391a, currencyFilter.f71391a) && this.f71392b == currencyFilter.f71392b;
        }

        @Override // com.revolut.feature.crypto_investments.api.model.transaction_filter.CryptoTransactionFilter
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF71396c() {
            return this.f71393c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f71392b) + (this.f71391a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f71391a);
            dest.writeInt(this.f71392b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto_investments/api/model/transaction_filter/CryptoTransactionFilter$TransactionTypeFilter;", "Lcom/revolut/feature/crypto_investments/api/model/transaction_filter/CryptoTransactionFilter;", "", "toString", "()Ljava/lang/String;", "feature_crypto_investments_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TransactionTypeFilter extends CryptoTransactionFilter {

        @NotNull
        public static final Parcelable.Creator<TransactionTypeFilter> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final kt5.a f71394a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f71395b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f71396c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TransactionTypeFilter(kt5.a.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TransactionTypeFilter[i];
            }
        }

        public TransactionTypeFilter(kt5.a type, boolean z) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.f71394a = type;
            this.f71395b = z;
            this.f71396c = type.name();
        }

        public static TransactionTypeFilter d(TransactionTypeFilter transactionTypeFilter, boolean z) {
            kt5.a type = transactionTypeFilter.f71394a;
            Intrinsics.checkNotNullParameter(type, "type");
            return new TransactionTypeFilter(type, z);
        }

        @Override // com.revolut.feature.crypto_investments.api.model.transaction_filter.CryptoTransactionFilter
        public final CryptoTransactionFilter a() {
            return d(this, !this.f71395b);
        }

        @Override // com.revolut.feature.crypto_investments.api.model.transaction_filter.CryptoTransactionFilter
        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getF71395b() {
            return this.f71395b;
        }

        @Override // com.revolut.feature.crypto_investments.api.model.transaction_filter.CryptoTransactionFilter
        public final CryptoTransactionFilter c() {
            return d(this, false);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TransactionTypeFilter)) {
                return false;
            }
            TransactionTypeFilter transactionTypeFilter = (TransactionTypeFilter) obj2;
            return this.f71394a == transactionTypeFilter.f71394a && this.f71395b == transactionTypeFilter.f71395b;
        }

        @Override // com.revolut.feature.crypto_investments.api.model.transaction_filter.CryptoTransactionFilter
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF71396c() {
            return this.f71396c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f71395b) + (this.f71394a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f71394a.name());
            dest.writeInt(this.f71395b ? 1 : 0);
        }
    }

    public abstract CryptoTransactionFilter a();

    /* JADX INFO: renamed from: b */
    public abstract boolean getF71395b();

    public abstract CryptoTransactionFilter c();

    /* JADX INFO: renamed from: getId */
    public abstract String getF71396c();
}
