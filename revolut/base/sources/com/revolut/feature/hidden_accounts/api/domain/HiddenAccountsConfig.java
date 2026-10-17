package com.revolut.feature.hidden_accounts.api.domain;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.feature.balance.picker.api.interactor.BalancesInteractor$InputData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/revolut/feature/hidden_accounts/api/domain/HiddenAccountsConfig;", "Landroid/os/Parcelable;", "Companion", "na7/b", "Accounts", "Balance", "a", "Lcom/revolut/feature/hidden_accounts/api/domain/HiddenAccountsConfig$Accounts;", "Lcom/revolut/feature/hidden_accounts/api/domain/HiddenAccountsConfig$Balance;", "feature_hidden_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class HiddenAccountsConfig implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f74646a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/hidden_accounts/api/domain/HiddenAccountsConfig$Accounts;", "Lcom/revolut/feature/hidden_accounts/api/domain/HiddenAccountsConfig;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "feature_hidden_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Accounts extends HiddenAccountsConfig {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Accounts f74647b = new Accounts();

        @NotNull
        public static final Parcelable.Creator<Accounts> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Accounts.f74647b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Accounts[i];
            }
        }

        private Accounts() {
            super("ACCOUNTS");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof Accounts);
        }

        public final int hashCode() {
            return 896668179;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/hidden_accounts/api/domain/HiddenAccountsConfig$Balance;", "Lcom/revolut/feature/hidden_accounts/api/domain/HiddenAccountsConfig;", "", "toString", "()Ljava/lang/String;", "feature_hidden_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Balance extends HiddenAccountsConfig {

        @NotNull
        public static final Parcelable.Creator<Balance> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BalancesInteractor$InputData f74648b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Balance((BalancesInteractor$InputData) parcel.readParcelable(Balance.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Balance[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Balance(BalancesInteractor$InputData inputData) {
            super("BALANCE");
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f74648b = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Balance) && Intrinsics.f(this.f74648b, ((Balance) obj2).f74648b);
        }

        public final int hashCode() {
            return this.f74648b.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f74648b, i);
        }
    }

    public HiddenAccountsConfig(String str) {
        this.f74646a = str;
    }
}
