package com.revolut.feature.tab.accounts.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/tab/accounts/api/model/ProductAccountBalance;", "Landroid/os/Parcelable;", "WithAmount", "CurrencyOnly", "Lcom/revolut/feature/tab/accounts/api/model/ProductAccountBalance$CurrencyOnly;", "Lcom/revolut/feature/tab/accounts/api/model/ProductAccountBalance$WithAmount;", "feature_tab_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ProductAccountBalance extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tab/accounts/api/model/ProductAccountBalance$CurrencyOnly;", "Lcom/revolut/feature/tab/accounts/api/model/ProductAccountBalance;", "", "toString", "()Ljava/lang/String;", "feature_tab_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CurrencyOnly implements ProductAccountBalance {

        @NotNull
        public static final Parcelable.Creator<CurrencyOnly> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f89508a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CurrencyOnly((b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CurrencyOnly[i];
            }
        }

        public CurrencyOnly(b currency) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.f89508a = currency;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CurrencyOnly) && Intrinsics.f(this.f89508a, ((CurrencyOnly) obj2).f89508a);
        }

        @Override // com.revolut.feature.tab.accounts.api.model.ProductAccountBalance
        /* JADX INFO: renamed from: getCurrency, reason: from getter */
        public final b getF89508a() {
            return this.f89508a;
        }

        public final int hashCode() {
            return this.f89508a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f89508a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tab/accounts/api/model/ProductAccountBalance$WithAmount;", "Lcom/revolut/feature/tab/accounts/api/model/ProductAccountBalance;", "", "toString", "()Ljava/lang/String;", "feature_tab_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WithAmount implements ProductAccountBalance {

        @NotNull
        public static final Parcelable.Creator<WithAmount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f89509a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WithAmount((d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WithAmount[i];
            }
        }

        public WithAmount(d money) {
            Intrinsics.checkNotNullParameter(money, "money");
            this.f89509a = money;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof WithAmount) && Intrinsics.f(this.f89509a, ((WithAmount) obj2).f89509a);
        }

        @Override // com.revolut.feature.tab.accounts.api.model.ProductAccountBalance
        /* JADX INFO: renamed from: getCurrency */
        public final b getF89508a() {
            return this.f89509a.f115083b;
        }

        public final int hashCode() {
            return this.f89509a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f89509a);
        }
    }

    /* JADX INFO: renamed from: getCurrency */
    b getF89508a();
}
