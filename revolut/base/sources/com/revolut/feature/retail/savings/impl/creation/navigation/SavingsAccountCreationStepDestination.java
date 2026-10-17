package com.revolut.feature.retail.savings.impl.creation.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.retail.savings.api.challenge.model.SavingsChallengeCreationData;
import com.revolut.feature.vaults.common.SavingAccountType;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/retail/savings/impl/creation/navigation/SavingsAccountCreationStepDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "Lcom/revolut/kompot/common/IOData$Input;", "Fund", "Bank", "Lcom/revolut/feature/retail/savings/impl/creation/navigation/SavingsAccountCreationStepDestination$Bank;", "Lcom/revolut/feature/retail/savings/impl/creation/navigation/SavingsAccountCreationStepDestination$Fund;", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class SavingsAccountCreationStepDestination implements KompotDestination, IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/savings/impl/creation/navigation/SavingsAccountCreationStepDestination$Bank;", "Lcom/revolut/feature/retail/savings/impl/creation/navigation/SavingsAccountCreationStepDestination;", "", "toString", "()Ljava/lang/String;", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Bank extends SavingsAccountCreationStepDestination {

        @NotNull
        public static final Parcelable.Creator<Bank> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SavingAccountType f83227a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f83228b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f83229c;
        public final String d;
        public final NaviCommand e;
        public final SavingsChallengeCreationData f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f83230g;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Bank((SavingAccountType) parcel.readParcelable(Bank.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), (NaviCommand) parcel.readParcelable(Bank.class.getClassLoader()), (SavingsChallengeCreationData) parcel.readParcelable(Bank.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Bank[i];
            }
        }

        public Bank(SavingAccountType accountType, String productId, String currencyCode, String accountName, NaviCommand naviCommand, SavingsChallengeCreationData savingsChallengeCreationData, boolean z) {
            Intrinsics.checkNotNullParameter(accountType, "accountType");
            Intrinsics.checkNotNullParameter(productId, "productId");
            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
            Intrinsics.checkNotNullParameter(accountName, "accountName");
            this.f83227a = accountType;
            this.f83228b = productId;
            this.f83229c = currencyCode;
            this.d = accountName;
            this.e = naviCommand;
            this.f = savingsChallengeCreationData;
            this.f83230g = z;
        }

        @Override // com.revolut.feature.retail.savings.impl.creation.navigation.SavingsAccountCreationStepDestination
        /* JADX INFO: renamed from: C7, reason: from getter */
        public final boolean getF83235h() {
            return this.f83230g;
        }

        @Override // com.revolut.feature.retail.savings.impl.creation.navigation.SavingsAccountCreationStepDestination
        /* JADX INFO: renamed from: a, reason: from getter */
        public final SavingAccountType getF83231a() {
            return this.f83227a;
        }

        @Override // com.revolut.feature.retail.savings.impl.creation.navigation.SavingsAccountCreationStepDestination
        /* JADX INFO: renamed from: b, reason: from getter */
        public final SavingsChallengeCreationData getF83234g() {
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
            if (!(obj2 instanceof Bank)) {
                return false;
            }
            Bank bank = (Bank) obj2;
            return Intrinsics.f(this.f83227a, bank.f83227a) && Intrinsics.f(this.f83228b, bank.f83228b) && Intrinsics.f(this.f83229c, bank.f83229c) && Intrinsics.f(this.d, bank.d) && Intrinsics.f(this.e, bank.e) && Intrinsics.f(this.f, bank.f) && this.f83230g == bank.f83230g;
        }

        public final int hashCode() {
            int iC = p.a.c(p.a.c(p.a.c(this.f83227a.hashCode() * 31, 31, this.f83228b), 31, this.f83229c), 31, this.d);
            NaviCommand naviCommand = this.e;
            int iHashCode = (iC + (naviCommand == null ? 0 : naviCommand.hashCode())) * 31;
            SavingsChallengeCreationData savingsChallengeCreationData = this.f;
            return Boolean.hashCode(this.f83230g) + ((iHashCode + (savingsChallengeCreationData != null ? savingsChallengeCreationData.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f83227a, i);
            dest.writeString(this.f83228b);
            dest.writeString(this.f83229c);
            dest.writeString(this.d);
            dest.writeParcelable(this.e, i);
            dest.writeParcelable(this.f, i);
            dest.writeInt(this.f83230g ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/savings/impl/creation/navigation/SavingsAccountCreationStepDestination$Fund;", "Lcom/revolut/feature/retail/savings/impl/creation/navigation/SavingsAccountCreationStepDestination;", "", "toString", "()Ljava/lang/String;", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Fund extends SavingsAccountCreationStepDestination {

        @NotNull
        public static final Parcelable.Creator<Fund> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SavingAccountType f83231a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f83232b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f83233c;
        public final String d;
        public final NaviCommand e;
        public final boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final SavingsChallengeCreationData f83234g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f83235h;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Fund((SavingAccountType) parcel.readParcelable(Fund.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), (NaviCommand) parcel.readParcelable(Fund.class.getClassLoader()), parcel.readInt() != 0, (SavingsChallengeCreationData) parcel.readParcelable(Fund.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Fund[i];
            }
        }

        public Fund(SavingAccountType accountType, String productId, String currencyCode, String accountName, NaviCommand naviCommand, boolean z, SavingsChallengeCreationData savingsChallengeCreationData, boolean z3) {
            Intrinsics.checkNotNullParameter(accountType, "accountType");
            Intrinsics.checkNotNullParameter(productId, "productId");
            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
            Intrinsics.checkNotNullParameter(accountName, "accountName");
            this.f83231a = accountType;
            this.f83232b = productId;
            this.f83233c = currencyCode;
            this.d = accountName;
            this.e = naviCommand;
            this.f = z;
            this.f83234g = savingsChallengeCreationData;
            this.f83235h = z3;
        }

        @Override // com.revolut.feature.retail.savings.impl.creation.navigation.SavingsAccountCreationStepDestination
        /* JADX INFO: renamed from: C7, reason: from getter */
        public final boolean getF83235h() {
            return this.f83235h;
        }

        @Override // com.revolut.feature.retail.savings.impl.creation.navigation.SavingsAccountCreationStepDestination
        /* JADX INFO: renamed from: a, reason: from getter */
        public final SavingAccountType getF83231a() {
            return this.f83231a;
        }

        @Override // com.revolut.feature.retail.savings.impl.creation.navigation.SavingsAccountCreationStepDestination
        /* JADX INFO: renamed from: b, reason: from getter */
        public final SavingsChallengeCreationData getF83234g() {
            return this.f83234g;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Fund)) {
                return false;
            }
            Fund fund = (Fund) obj2;
            return Intrinsics.f(this.f83231a, fund.f83231a) && Intrinsics.f(this.f83232b, fund.f83232b) && Intrinsics.f(this.f83233c, fund.f83233c) && Intrinsics.f(this.d, fund.d) && Intrinsics.f(this.e, fund.e) && this.f == fund.f && Intrinsics.f(this.f83234g, fund.f83234g) && this.f83235h == fund.f83235h;
        }

        public final int hashCode() {
            int iC = p.a.c(p.a.c(p.a.c(this.f83231a.hashCode() * 31, 31, this.f83232b), 31, this.f83233c), 31, this.d);
            NaviCommand naviCommand = this.e;
            int iC2 = j6.a.c((iC + (naviCommand == null ? 0 : naviCommand.hashCode())) * 31, 31, this.f);
            SavingsChallengeCreationData savingsChallengeCreationData = this.f83234g;
            return Boolean.hashCode(this.f83235h) + ((iC2 + (savingsChallengeCreationData != null ? savingsChallengeCreationData.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f83231a, i);
            dest.writeString(this.f83232b);
            dest.writeString(this.f83233c);
            dest.writeString(this.d);
            dest.writeParcelable(this.e, i);
            dest.writeInt(this.f ? 1 : 0);
            dest.writeParcelable(this.f83234g, i);
            dest.writeInt(this.f83235h ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: C7 */
    public abstract boolean getF83235h();

    /* JADX INFO: renamed from: a */
    public abstract SavingAccountType getF83231a();

    /* JADX INFO: renamed from: b */
    public abstract SavingsChallengeCreationData getF83234g();
}
