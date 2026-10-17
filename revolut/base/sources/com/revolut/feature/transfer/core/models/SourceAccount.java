package com.revolut.feature.transfer.core.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import io3.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/transfer/core/models/SourceAccount;", "Landroid/os/Parcelable;", "Default", "Pocket", "SavingsAccount", "TradingPortfolioAccount", "Lcom/revolut/feature/transfer/core/models/SourceAccount$Default;", "Lcom/revolut/feature/transfer/core/models/SourceAccount$Pocket;", "Lcom/revolut/feature/transfer/core/models/SourceAccount$SavingsAccount;", "Lcom/revolut/feature/transfer/core/models/SourceAccount$TradingPortfolioAccount;", "feature_transfer_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SourceAccount extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/transfer/core/models/SourceAccount$Default;", "Lcom/revolut/feature/transfer/core/models/SourceAccount;", "<init>", "()V", "feature_transfer_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Default implements SourceAccount {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Default f92247a = new Default();

        @NotNull
        public static final Parcelable.Creator<Default> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Default.f92247a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Default[i];
            }
        }

        private Default() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.transfer.core.models.SourceAccount
        /* JADX INFO: renamed from: getAccountId */
        public final AccountId getF92252b() {
            return AccountId.Personal.f51414a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer/core/models/SourceAccount$SavingsAccount;", "Lcom/revolut/feature/transfer/core/models/SourceAccount;", "", "toString", "()Ljava/lang/String;", "feature_transfer_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SavingsAccount implements SourceAccount {

        @NotNull
        public static final Parcelable.Creator<SavingsAccount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f92251a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AccountId f92252b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SavingsAccount((AccountId) parcel.readParcelable(SavingsAccount.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavingsAccount[i];
            }
        }

        public SavingsAccount(AccountId accountId, String savingsAccountId) {
            Intrinsics.checkNotNullParameter(savingsAccountId, "savingsAccountId");
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            this.f92251a = savingsAccountId;
            this.f92252b = accountId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SavingsAccount)) {
                return false;
            }
            SavingsAccount savingsAccount = (SavingsAccount) obj2;
            return Intrinsics.f(this.f92251a, savingsAccount.f92251a) && Intrinsics.f(this.f92252b, savingsAccount.f92252b);
        }

        @Override // com.revolut.feature.transfer.core.models.SourceAccount
        /* JADX INFO: renamed from: getAccountId, reason: from getter */
        public final AccountId getF92252b() {
            return this.f92252b;
        }

        public final int hashCode() {
            return this.f92252b.hashCode() + (this.f92251a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f92251a);
            dest.writeParcelable(this.f92252b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer/core/models/SourceAccount$TradingPortfolioAccount;", "Lcom/revolut/feature/transfer/core/models/SourceAccount;", "", "toString", "()Ljava/lang/String;", "feature_transfer_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TradingPortfolioAccount implements SourceAccount {

        @NotNull
        public static final Parcelable.Creator<TradingPortfolioAccount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f92253a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f92254b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TradingPortfolioAccount(parcel.readString(), (b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TradingPortfolioAccount[i];
            }
        }

        public TradingPortfolioAccount(String tradingPortfolioId, b currency) {
            Intrinsics.checkNotNullParameter(tradingPortfolioId, "tradingPortfolioId");
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.f92253a = tradingPortfolioId;
            this.f92254b = currency;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TradingPortfolioAccount)) {
                return false;
            }
            TradingPortfolioAccount tradingPortfolioAccount = (TradingPortfolioAccount) obj2;
            return Intrinsics.f(this.f92253a, tradingPortfolioAccount.f92253a) && Intrinsics.f(this.f92254b, tradingPortfolioAccount.f92254b);
        }

        @Override // com.revolut.feature.transfer.core.models.SourceAccount
        /* JADX INFO: renamed from: getAccountId */
        public final AccountId getF92252b() {
            return AccountId.Personal.f51414a;
        }

        public final int hashCode() {
            return this.f92254b.hashCode() + (this.f92253a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f92253a);
            dest.writeSerializable(this.f92254b);
        }
    }

    /* JADX INFO: renamed from: getAccountId */
    AccountId getF92252b();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer/core/models/SourceAccount$Pocket;", "Lcom/revolut/feature/transfer/core/models/SourceAccount;", "", "toString", "()Ljava/lang/String;", "feature_transfer_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Pocket implements SourceAccount {

        @NotNull
        public static final Parcelable.Creator<Pocket> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f92248a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l f92249b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AccountId f92250c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                return new Pocket((AccountId) parcel.readParcelable(Pocket.class.getClassLoader()), l.valueOf(parcel.readString()), string);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Pocket[i];
            }
        }

        public Pocket(AccountId accountId, l pocketType, String str) {
            Intrinsics.checkNotNullParameter(pocketType, "pocketType");
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            this.f92248a = str;
            this.f92249b = pocketType;
            this.f92250c = accountId;
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
            return Intrinsics.f(this.f92248a, pocket.f92248a) && this.f92249b == pocket.f92249b && Intrinsics.f(this.f92250c, pocket.f92250c);
        }

        @Override // com.revolut.feature.transfer.core.models.SourceAccount
        /* JADX INFO: renamed from: getAccountId, reason: from getter */
        public final AccountId getF92252b() {
            return this.f92250c;
        }

        public final int hashCode() {
            String str = this.f92248a;
            return this.f92250c.hashCode() + t61.a.c(this.f92249b, (str == null ? 0 : str.hashCode()) * 31, 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f92248a);
            dest.writeString(this.f92249b.name());
            dest.writeParcelable(this.f92250c, i);
        }

        public /* synthetic */ Pocket(String str, l lVar, AccountId accountId, int i) {
            this((i & 4) != 0 ? AccountId.Personal.f51414a : accountId, (i & 2) != 0 ? l.CURRENT : lVar, str);
        }
    }
}
