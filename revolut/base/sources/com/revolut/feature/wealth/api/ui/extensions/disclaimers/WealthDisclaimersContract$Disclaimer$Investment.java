package com.revolut.feature.wealth.api.ui.extensions.disclaimers;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.shared.feature.wealth.models.config.Links;
import hel.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nel.z;
import org.jetbrains.annotations.NotNull;
import z0h.f1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000`\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u00012\u00020\u0002:\u0014\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0082\u0001\u0014\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*¨\u0006+À\u0006\u0003"}, d2 = {"com/revolut/feature/wealth/api/ui/extensions/disclaimers/WealthDisclaimersContract$Disclaimer$Investment", "Lz0h/f1;", "Landroid/os/Parcelable;", "TopUpConfirmation", "GeneralTopUp", "ExternalCardCreation", "AddMoney", "Withdraw", "TransferBalancePicker", "TransferBalancePickerFooter", "TransferFeesBreakdown", "BankTransferWithdraw", "Fx", "AccountSelector", "InvestmentPlanProjections", "MoveMoneyDetailedTC", "MoveMoneyDetailedTCJunior", "MoveMoneyDetailedTCPro", "MoveMoneyDetailedTCJoint", "MoveMoneyInvestmentFundsBreakdown", "News", "Stats", "CashBalance", "Lcom/revolut/feature/wealth/api/ui/extensions/disclaimers/WealthDisclaimersContract$Disclaimer$Investment$AccountSelector;", "Lcom/revolut/feature/wealth/api/ui/extensions/disclaimers/WealthDisclaimersContract$Disclaimer$Investment$AddMoney;", "Lcom/revolut/feature/wealth/api/ui/extensions/disclaimers/WealthDisclaimersContract$Disclaimer$Investment$BankTransferWithdraw;", "Lcom/revolut/feature/wealth/api/ui/extensions/disclaimers/WealthDisclaimersContract$Disclaimer$Investment$CashBalance;", "Lcom/revolut/feature/wealth/api/ui/extensions/disclaimers/WealthDisclaimersContract$Disclaimer$Investment$ExternalCardCreation;", "Lcom/revolut/feature/wealth/api/ui/extensions/disclaimers/WealthDisclaimersContract$Disclaimer$Investment$Fx;", "Lcom/revolut/feature/wealth/api/ui/extensions/disclaimers/WealthDisclaimersContract$Disclaimer$Investment$GeneralTopUp;", "Lcom/revolut/feature/wealth/api/ui/extensions/disclaimers/WealthDisclaimersContract$Disclaimer$Investment$InvestmentPlanProjections;", "Lcom/revolut/feature/wealth/api/ui/extensions/disclaimers/WealthDisclaimersContract$Disclaimer$Investment$MoveMoneyDetailedTC;", "Lcom/revolut/feature/wealth/api/ui/extensions/disclaimers/WealthDisclaimersContract$Disclaimer$Investment$MoveMoneyDetailedTCJoint;", "Lcom/revolut/feature/wealth/api/ui/extensions/disclaimers/WealthDisclaimersContract$Disclaimer$Investment$MoveMoneyDetailedTCJunior;", "Lcom/revolut/feature/wealth/api/ui/extensions/disclaimers/WealthDisclaimersContract$Disclaimer$Investment$MoveMoneyDetailedTCPro;", "Lcom/revolut/feature/wealth/api/ui/extensions/disclaimers/WealthDisclaimersContract$Disclaimer$Investment$MoveMoneyInvestmentFundsBreakdown;", "Lcom/revolut/feature/wealth/api/ui/extensions/disclaimers/WealthDisclaimersContract$Disclaimer$Investment$News;", "Lcom/revolut/feature/wealth/api/ui/extensions/disclaimers/WealthDisclaimersContract$Disclaimer$Investment$Stats;", "Lcom/revolut/feature/wealth/api/ui/extensions/disclaimers/WealthDisclaimersContract$Disclaimer$Investment$TopUpConfirmation;", "Lcom/revolut/feature/wealth/api/ui/extensions/disclaimers/WealthDisclaimersContract$Disclaimer$Investment$TransferBalancePicker;", "Lcom/revolut/feature/wealth/api/ui/extensions/disclaimers/WealthDisclaimersContract$Disclaimer$Investment$TransferBalancePickerFooter;", "Lcom/revolut/feature/wealth/api/ui/extensions/disclaimers/WealthDisclaimersContract$Disclaimer$Investment$TransferFeesBreakdown;", "Lcom/revolut/feature/wealth/api/ui/extensions/disclaimers/WealthDisclaimersContract$Disclaimer$Investment$Withdraw;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface WealthDisclaimersContract$Disclaimer$Investment extends f1, Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/wealth/api/ui/extensions/disclaimers/WealthDisclaimersContract$Disclaimer$Investment$AccountSelector;", "Lcom/revolut/feature/wealth/api/ui/extensions/disclaimers/WealthDisclaimersContract$Disclaimer$Investment;", "Securities", "Lcom/revolut/feature/wealth/api/ui/extensions/disclaimers/WealthDisclaimersContract$Disclaimer$Investment$AccountSelector$Securities;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface AccountSelector extends WealthDisclaimersContract$Disclaimer$Investment {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/api/ui/extensions/disclaimers/WealthDisclaimersContract$Disclaimer$Investment$AccountSelector$Securities;", "Lcom/revolut/feature/wealth/api/ui/extensions/disclaimers/WealthDisclaimersContract$Disclaimer$Investment$AccountSelector;", "", "toString", "()Ljava/lang/String;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Securities implements AccountSelector {

            @NotNull
            public static final Parcelable.Creator<Securities> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b f95326a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final xi0.b f95327b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Securities(b.valueOf(parcel.readString()), (xi0.b) parcel.readSerializable());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Securities[i];
                }
            }

            public Securities(b context, xi0.b instrumentCurrency) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(instrumentCurrency, "instrumentCurrency");
                this.f95326a = context;
                this.f95327b = instrumentCurrency;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Securities)) {
                    return false;
                }
                Securities securities = (Securities) obj2;
                return this.f95326a == securities.f95326a && Intrinsics.f(this.f95327b, securities.f95327b);
            }

            @Override // com.revolut.feature.wealth.api.ui.extensions.disclaimers.WealthDisclaimersContract$Disclaimer$Investment
            /* JADX INFO: renamed from: getContext, reason: from getter */
            public final b getF95354a() {
                return this.f95326a;
            }

            public final int hashCode() {
                return this.f95327b.hashCode() + (this.f95326a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f95326a.name());
                dest.writeSerializable(this.f95327b);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/api/ui/extensions/disclaimers/WealthDisclaimersContract$Disclaimer$Investment$AddMoney;", "Lcom/revolut/feature/wealth/api/ui/extensions/disclaimers/WealthDisclaimersContract$Disclaimer$Investment;", "", "toString", "()Ljava/lang/String;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddMoney implements WealthDisclaimersContract$Disclaimer$Investment {

        @NotNull
        public static final Parcelable.Creator<AddMoney> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f95328a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AddMoney(b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddMoney[i];
            }
        }

        public AddMoney(b context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.f95328a = context;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AddMoney) && this.f95328a == ((AddMoney) obj2).f95328a;
        }

        @Override // com.revolut.feature.wealth.api.ui.extensions.disclaimers.WealthDisclaimersContract$Disclaimer$Investment
        /* JADX INFO: renamed from: getContext, reason: from getter */
        public final b getF95354a() {
            return this.f95328a;
        }

        public final int hashCode() {
            return this.f95328a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f95328a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/api/ui/extensions/disclaimers/WealthDisclaimersContract$Disclaimer$Investment$BankTransferWithdraw;", "Lcom/revolut/feature/wealth/api/ui/extensions/disclaimers/WealthDisclaimersContract$Disclaimer$Investment;", "", "toString", "()Ljava/lang/String;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BankTransferWithdraw implements WealthDisclaimersContract$Disclaimer$Investment {

        @NotNull
        public static final Parcelable.Creator<BankTransferWithdraw> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f95329a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BankTransferWithdraw(b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BankTransferWithdraw[i];
            }
        }

        public BankTransferWithdraw(b context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.f95329a = context;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BankTransferWithdraw) && this.f95329a == ((BankTransferWithdraw) obj2).f95329a;
        }

        @Override // com.revolut.feature.wealth.api.ui.extensions.disclaimers.WealthDisclaimersContract$Disclaimer$Investment
        /* JADX INFO: renamed from: getContext, reason: from getter */
        public final b getF95354a() {
            return this.f95329a;
        }

        public final int hashCode() {
            return this.f95329a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f95329a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/api/ui/extensions/disclaimers/WealthDisclaimersContract$Disclaimer$Investment$CashBalance;", "Lcom/revolut/feature/wealth/api/ui/extensions/disclaimers/WealthDisclaimersContract$Disclaimer$Investment;", "", "toString", "()Ljava/lang/String;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CashBalance implements WealthDisclaimersContract$Disclaimer$Investment {

        @NotNull
        public static final Parcelable.Creator<CashBalance> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f95330a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Links f95331b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CashBalance((Links) parcel.readParcelable(CashBalance.class.getClassLoader()), b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CashBalance[i];
            }
        }

        public CashBalance(Links links, b context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(links, "links");
            this.f95330a = context;
            this.f95331b = links;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CashBalance)) {
                return false;
            }
            CashBalance cashBalance = (CashBalance) obj2;
            return this.f95330a == cashBalance.f95330a && Intrinsics.f(this.f95331b, cashBalance.f95331b);
        }

        @Override // com.revolut.feature.wealth.api.ui.extensions.disclaimers.WealthDisclaimersContract$Disclaimer$Investment
        /* JADX INFO: renamed from: getContext, reason: from getter */
        public final b getF95354a() {
            return this.f95330a;
        }

        public final int hashCode() {
            return this.f95331b.hashCode() + (this.f95330a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f95330a.name());
            dest.writeParcelable(this.f95331b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/api/ui/extensions/disclaimers/WealthDisclaimersContract$Disclaimer$Investment$ExternalCardCreation;", "Lcom/revolut/feature/wealth/api/ui/extensions/disclaimers/WealthDisclaimersContract$Disclaimer$Investment;", "", "toString", "()Ljava/lang/String;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ExternalCardCreation implements WealthDisclaimersContract$Disclaimer$Investment {

        @NotNull
        public static final Parcelable.Creator<ExternalCardCreation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f95332a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ExternalCardCreation(b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExternalCardCreation[i];
            }
        }

        public ExternalCardCreation(b context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.f95332a = context;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ExternalCardCreation) && this.f95332a == ((ExternalCardCreation) obj2).f95332a;
        }

        @Override // com.revolut.feature.wealth.api.ui.extensions.disclaimers.WealthDisclaimersContract$Disclaimer$Investment
        /* JADX INFO: renamed from: getContext, reason: from getter */
        public final b getF95354a() {
            return this.f95332a;
        }

        public final int hashCode() {
            return this.f95332a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f95332a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/api/ui/extensions/disclaimers/WealthDisclaimersContract$Disclaimer$Investment$Fx;", "Lcom/revolut/feature/wealth/api/ui/extensions/disclaimers/WealthDisclaimersContract$Disclaimer$Investment;", "", "toString", "()Ljava/lang/String;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Fx implements WealthDisclaimersContract$Disclaimer$Investment {

        @NotNull
        public static final Parcelable.Creator<Fx> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f95333a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Links f95334b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Fx((Links) parcel.readParcelable(Fx.class.getClassLoader()), b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Fx[i];
            }
        }

        public Fx(Links links, b context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(links, "links");
            this.f95333a = context;
            this.f95334b = links;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Fx)) {
                return false;
            }
            Fx fx2 = (Fx) obj2;
            return this.f95333a == fx2.f95333a && Intrinsics.f(this.f95334b, fx2.f95334b);
        }

        @Override // com.revolut.feature.wealth.api.ui.extensions.disclaimers.WealthDisclaimersContract$Disclaimer$Investment
        /* JADX INFO: renamed from: getContext, reason: from getter */
        public final b getF95354a() {
            return this.f95333a;
        }

        public final int hashCode() {
            return this.f95334b.hashCode() + (this.f95333a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f95333a.name());
            dest.writeParcelable(this.f95334b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/api/ui/extensions/disclaimers/WealthDisclaimersContract$Disclaimer$Investment$GeneralTopUp;", "Lcom/revolut/feature/wealth/api/ui/extensions/disclaimers/WealthDisclaimersContract$Disclaimer$Investment;", "", "toString", "()Ljava/lang/String;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GeneralTopUp implements WealthDisclaimersContract$Disclaimer$Investment {

        @NotNull
        public static final Parcelable.Creator<GeneralTopUp> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f95335a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GeneralTopUp(b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GeneralTopUp[i];
            }
        }

        public GeneralTopUp(b context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.f95335a = context;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof GeneralTopUp) && this.f95335a == ((GeneralTopUp) obj2).f95335a;
        }

        @Override // com.revolut.feature.wealth.api.ui.extensions.disclaimers.WealthDisclaimersContract$Disclaimer$Investment
        /* JADX INFO: renamed from: getContext, reason: from getter */
        public final b getF95354a() {
            return this.f95335a;
        }

        public final int hashCode() {
            return this.f95335a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f95335a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/api/ui/extensions/disclaimers/WealthDisclaimersContract$Disclaimer$Investment$InvestmentPlanProjections;", "Lcom/revolut/feature/wealth/api/ui/extensions/disclaimers/WealthDisclaimersContract$Disclaimer$Investment;", "", "toString", "()Ljava/lang/String;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InvestmentPlanProjections implements WealthDisclaimersContract$Disclaimer$Investment {

        @NotNull
        public static final Parcelable.Creator<InvestmentPlanProjections> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f95336a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Links f95337b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InvestmentPlanProjections((Links) parcel.readParcelable(InvestmentPlanProjections.class.getClassLoader()), b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InvestmentPlanProjections[i];
            }
        }

        public InvestmentPlanProjections(Links links, b context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(links, "links");
            this.f95336a = context;
            this.f95337b = links;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof InvestmentPlanProjections)) {
                return false;
            }
            InvestmentPlanProjections investmentPlanProjections = (InvestmentPlanProjections) obj2;
            return this.f95336a == investmentPlanProjections.f95336a && Intrinsics.f(this.f95337b, investmentPlanProjections.f95337b);
        }

        @Override // com.revolut.feature.wealth.api.ui.extensions.disclaimers.WealthDisclaimersContract$Disclaimer$Investment
        /* JADX INFO: renamed from: getContext, reason: from getter */
        public final b getF95354a() {
            return this.f95336a;
        }

        public final int hashCode() {
            return this.f95337b.hashCode() + (this.f95336a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f95336a.name());
            dest.writeParcelable(this.f95337b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/api/ui/extensions/disclaimers/WealthDisclaimersContract$Disclaimer$Investment$MoveMoneyDetailedTC;", "Lcom/revolut/feature/wealth/api/ui/extensions/disclaimers/WealthDisclaimersContract$Disclaimer$Investment;", "", "toString", "()Ljava/lang/String;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MoveMoneyDetailedTC implements WealthDisclaimersContract$Disclaimer$Investment {

        @NotNull
        public static final Parcelable.Creator<MoveMoneyDetailedTC> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f95338a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MoveMoneyDetailedTC(b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MoveMoneyDetailedTC[i];
            }
        }

        public MoveMoneyDetailedTC(b context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.f95338a = context;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof MoveMoneyDetailedTC) && this.f95338a == ((MoveMoneyDetailedTC) obj2).f95338a;
        }

        @Override // com.revolut.feature.wealth.api.ui.extensions.disclaimers.WealthDisclaimersContract$Disclaimer$Investment
        /* JADX INFO: renamed from: getContext, reason: from getter */
        public final b getF95354a() {
            return this.f95338a;
        }

        public final int hashCode() {
            return this.f95338a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f95338a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/api/ui/extensions/disclaimers/WealthDisclaimersContract$Disclaimer$Investment$MoveMoneyDetailedTCJoint;", "Lcom/revolut/feature/wealth/api/ui/extensions/disclaimers/WealthDisclaimersContract$Disclaimer$Investment;", "", "toString", "()Ljava/lang/String;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MoveMoneyDetailedTCJoint implements WealthDisclaimersContract$Disclaimer$Investment {

        @NotNull
        public static final Parcelable.Creator<MoveMoneyDetailedTCJoint> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f95339a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MoveMoneyDetailedTCJoint(b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MoveMoneyDetailedTCJoint[i];
            }
        }

        public MoveMoneyDetailedTCJoint(b context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.f95339a = context;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof MoveMoneyDetailedTCJoint) && this.f95339a == ((MoveMoneyDetailedTCJoint) obj2).f95339a;
        }

        @Override // com.revolut.feature.wealth.api.ui.extensions.disclaimers.WealthDisclaimersContract$Disclaimer$Investment
        /* JADX INFO: renamed from: getContext, reason: from getter */
        public final b getF95354a() {
            return this.f95339a;
        }

        public final int hashCode() {
            return this.f95339a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f95339a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/api/ui/extensions/disclaimers/WealthDisclaimersContract$Disclaimer$Investment$MoveMoneyDetailedTCJunior;", "Lcom/revolut/feature/wealth/api/ui/extensions/disclaimers/WealthDisclaimersContract$Disclaimer$Investment;", "", "toString", "()Ljava/lang/String;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MoveMoneyDetailedTCJunior implements WealthDisclaimersContract$Disclaimer$Investment {

        @NotNull
        public static final Parcelable.Creator<MoveMoneyDetailedTCJunior> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f95340a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MoveMoneyDetailedTCJunior(b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MoveMoneyDetailedTCJunior[i];
            }
        }

        public MoveMoneyDetailedTCJunior(b context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.f95340a = context;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof MoveMoneyDetailedTCJunior) && this.f95340a == ((MoveMoneyDetailedTCJunior) obj2).f95340a;
        }

        @Override // com.revolut.feature.wealth.api.ui.extensions.disclaimers.WealthDisclaimersContract$Disclaimer$Investment
        /* JADX INFO: renamed from: getContext, reason: from getter */
        public final b getF95354a() {
            return this.f95340a;
        }

        public final int hashCode() {
            return this.f95340a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f95340a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/api/ui/extensions/disclaimers/WealthDisclaimersContract$Disclaimer$Investment$MoveMoneyDetailedTCPro;", "Lcom/revolut/feature/wealth/api/ui/extensions/disclaimers/WealthDisclaimersContract$Disclaimer$Investment;", "", "toString", "()Ljava/lang/String;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MoveMoneyDetailedTCPro implements WealthDisclaimersContract$Disclaimer$Investment {

        @NotNull
        public static final Parcelable.Creator<MoveMoneyDetailedTCPro> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f95341a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MoveMoneyDetailedTCPro(b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MoveMoneyDetailedTCPro[i];
            }
        }

        public MoveMoneyDetailedTCPro(b context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.f95341a = context;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof MoveMoneyDetailedTCPro) && this.f95341a == ((MoveMoneyDetailedTCPro) obj2).f95341a;
        }

        @Override // com.revolut.feature.wealth.api.ui.extensions.disclaimers.WealthDisclaimersContract$Disclaimer$Investment
        /* JADX INFO: renamed from: getContext, reason: from getter */
        public final b getF95354a() {
            return this.f95341a;
        }

        public final int hashCode() {
            return this.f95341a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f95341a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/api/ui/extensions/disclaimers/WealthDisclaimersContract$Disclaimer$Investment$MoveMoneyInvestmentFundsBreakdown;", "Lcom/revolut/feature/wealth/api/ui/extensions/disclaimers/WealthDisclaimersContract$Disclaimer$Investment;", "", "toString", "()Ljava/lang/String;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MoveMoneyInvestmentFundsBreakdown implements WealthDisclaimersContract$Disclaimer$Investment {

        @NotNull
        public static final Parcelable.Creator<MoveMoneyInvestmentFundsBreakdown> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f95342a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MoveMoneyInvestmentFundsBreakdown(b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MoveMoneyInvestmentFundsBreakdown[i];
            }
        }

        public MoveMoneyInvestmentFundsBreakdown(b context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.f95342a = context;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof MoveMoneyInvestmentFundsBreakdown) && this.f95342a == ((MoveMoneyInvestmentFundsBreakdown) obj2).f95342a;
        }

        @Override // com.revolut.feature.wealth.api.ui.extensions.disclaimers.WealthDisclaimersContract$Disclaimer$Investment
        /* JADX INFO: renamed from: getContext, reason: from getter */
        public final b getF95354a() {
            return this.f95342a;
        }

        public final int hashCode() {
            return this.f95342a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f95342a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/api/ui/extensions/disclaimers/WealthDisclaimersContract$Disclaimer$Investment$News;", "Lcom/revolut/feature/wealth/api/ui/extensions/disclaimers/WealthDisclaimersContract$Disclaimer$Investment;", "", "toString", "()Ljava/lang/String;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class News implements WealthDisclaimersContract$Disclaimer$Investment {

        @NotNull
        public static final Parcelable.Creator<News> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f95343a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Links f95344b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new News((Links) parcel.readParcelable(News.class.getClassLoader()), b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new News[i];
            }
        }

        public News(Links links, b context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(links, "links");
            this.f95343a = context;
            this.f95344b = links;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof News)) {
                return false;
            }
            News news = (News) obj2;
            return this.f95343a == news.f95343a && Intrinsics.f(this.f95344b, news.f95344b);
        }

        @Override // com.revolut.feature.wealth.api.ui.extensions.disclaimers.WealthDisclaimersContract$Disclaimer$Investment
        /* JADX INFO: renamed from: getContext, reason: from getter */
        public final b getF95354a() {
            return this.f95343a;
        }

        public final int hashCode() {
            return this.f95344b.hashCode() + (this.f95343a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f95343a.name());
            dest.writeParcelable(this.f95344b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/wealth/api/ui/extensions/disclaimers/WealthDisclaimersContract$Disclaimer$Investment$Stats;", "Lcom/revolut/feature/wealth/api/ui/extensions/disclaimers/WealthDisclaimersContract$Disclaimer$Investment;", "", "toString", "()Ljava/lang/String;", "com/revolut/feature/wealth/api/ui/extensions/disclaimers/a", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Stats implements WealthDisclaimersContract$Disclaimer$Investment {

        @NotNull
        public static final Parcelable.Creator<Stats> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f95345a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Links f95346b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final z f95347c;
        public final com.revolut.feature.wealth.api.ui.extensions.disclaimers.a d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Stats(b.valueOf(parcel.readString()), (Links) parcel.readParcelable(Stats.class.getClassLoader()), z.valueOf(parcel.readString()), com.revolut.feature.wealth.api.ui.extensions.disclaimers.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Stats[i];
            }
        }

        public Stats(b context, Links links, z instrumentType, com.revolut.feature.wealth.api.ui.extensions.disclaimers.a screen) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(links, "links");
            Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
            Intrinsics.checkNotNullParameter(screen, "screen");
            this.f95345a = context;
            this.f95346b = links;
            this.f95347c = instrumentType;
            this.d = screen;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Stats)) {
                return false;
            }
            Stats stats = (Stats) obj2;
            return this.f95345a == stats.f95345a && Intrinsics.f(this.f95346b, stats.f95346b) && this.f95347c == stats.f95347c && this.d == stats.d;
        }

        @Override // com.revolut.feature.wealth.api.ui.extensions.disclaimers.WealthDisclaimersContract$Disclaimer$Investment
        /* JADX INFO: renamed from: getContext, reason: from getter */
        public final b getF95354a() {
            return this.f95345a;
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.f95347c.hashCode() + ((this.f95346b.hashCode() + (this.f95345a.hashCode() * 31)) * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f95345a.name());
            dest.writeParcelable(this.f95346b, i);
            dest.writeString(this.f95347c.name());
            dest.writeString(this.d.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/api/ui/extensions/disclaimers/WealthDisclaimersContract$Disclaimer$Investment$TopUpConfirmation;", "Lcom/revolut/feature/wealth/api/ui/extensions/disclaimers/WealthDisclaimersContract$Disclaimer$Investment;", "", "toString", "()Ljava/lang/String;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TopUpConfirmation implements WealthDisclaimersContract$Disclaimer$Investment {

        @NotNull
        public static final Parcelable.Creator<TopUpConfirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f95348a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TopUpConfirmation(b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TopUpConfirmation[i];
            }
        }

        public TopUpConfirmation(b context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.f95348a = context;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TopUpConfirmation) && this.f95348a == ((TopUpConfirmation) obj2).f95348a;
        }

        @Override // com.revolut.feature.wealth.api.ui.extensions.disclaimers.WealthDisclaimersContract$Disclaimer$Investment
        /* JADX INFO: renamed from: getContext, reason: from getter */
        public final b getF95354a() {
            return this.f95348a;
        }

        public final int hashCode() {
            return this.f95348a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f95348a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/api/ui/extensions/disclaimers/WealthDisclaimersContract$Disclaimer$Investment$TransferBalancePicker;", "Lcom/revolut/feature/wealth/api/ui/extensions/disclaimers/WealthDisclaimersContract$Disclaimer$Investment;", "", "toString", "()Ljava/lang/String;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TransferBalancePicker implements WealthDisclaimersContract$Disclaimer$Investment {

        @NotNull
        public static final Parcelable.Creator<TransferBalancePicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f95349a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Links f95350b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TransferBalancePicker((Links) parcel.readParcelable(TransferBalancePicker.class.getClassLoader()), b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TransferBalancePicker[i];
            }
        }

        public TransferBalancePicker(Links links, b context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(links, "links");
            this.f95349a = context;
            this.f95350b = links;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TransferBalancePicker)) {
                return false;
            }
            TransferBalancePicker transferBalancePicker = (TransferBalancePicker) obj2;
            return this.f95349a == transferBalancePicker.f95349a && Intrinsics.f(this.f95350b, transferBalancePicker.f95350b);
        }

        @Override // com.revolut.feature.wealth.api.ui.extensions.disclaimers.WealthDisclaimersContract$Disclaimer$Investment
        /* JADX INFO: renamed from: getContext, reason: from getter */
        public final b getF95354a() {
            return this.f95349a;
        }

        public final int hashCode() {
            return this.f95350b.hashCode() + (this.f95349a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f95349a.name());
            dest.writeParcelable(this.f95350b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/api/ui/extensions/disclaimers/WealthDisclaimersContract$Disclaimer$Investment$TransferBalancePickerFooter;", "Lcom/revolut/feature/wealth/api/ui/extensions/disclaimers/WealthDisclaimersContract$Disclaimer$Investment;", "", "toString", "()Ljava/lang/String;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TransferBalancePickerFooter implements WealthDisclaimersContract$Disclaimer$Investment {

        @NotNull
        public static final Parcelable.Creator<TransferBalancePickerFooter> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f95351a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TransferBalancePickerFooter(b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TransferBalancePickerFooter[i];
            }
        }

        public TransferBalancePickerFooter(b context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.f95351a = context;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TransferBalancePickerFooter) && this.f95351a == ((TransferBalancePickerFooter) obj2).f95351a;
        }

        @Override // com.revolut.feature.wealth.api.ui.extensions.disclaimers.WealthDisclaimersContract$Disclaimer$Investment
        /* JADX INFO: renamed from: getContext, reason: from getter */
        public final b getF95354a() {
            return this.f95351a;
        }

        public final int hashCode() {
            return this.f95351a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f95351a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/api/ui/extensions/disclaimers/WealthDisclaimersContract$Disclaimer$Investment$TransferFeesBreakdown;", "Lcom/revolut/feature/wealth/api/ui/extensions/disclaimers/WealthDisclaimersContract$Disclaimer$Investment;", "", "toString", "()Ljava/lang/String;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TransferFeesBreakdown implements WealthDisclaimersContract$Disclaimer$Investment {

        @NotNull
        public static final Parcelable.Creator<TransferFeesBreakdown> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f95352a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Links f95353b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TransferFeesBreakdown((Links) parcel.readParcelable(TransferFeesBreakdown.class.getClassLoader()), b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TransferFeesBreakdown[i];
            }
        }

        public TransferFeesBreakdown(Links links, b context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(links, "links");
            this.f95352a = context;
            this.f95353b = links;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TransferFeesBreakdown)) {
                return false;
            }
            TransferFeesBreakdown transferFeesBreakdown = (TransferFeesBreakdown) obj2;
            return this.f95352a == transferFeesBreakdown.f95352a && Intrinsics.f(this.f95353b, transferFeesBreakdown.f95353b);
        }

        @Override // com.revolut.feature.wealth.api.ui.extensions.disclaimers.WealthDisclaimersContract$Disclaimer$Investment
        /* JADX INFO: renamed from: getContext, reason: from getter */
        public final b getF95354a() {
            return this.f95352a;
        }

        public final int hashCode() {
            return this.f95353b.hashCode() + (this.f95352a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f95352a.name());
            dest.writeParcelable(this.f95353b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/api/ui/extensions/disclaimers/WealthDisclaimersContract$Disclaimer$Investment$Withdraw;", "Lcom/revolut/feature/wealth/api/ui/extensions/disclaimers/WealthDisclaimersContract$Disclaimer$Investment;", "", "toString", "()Ljava/lang/String;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Withdraw implements WealthDisclaimersContract$Disclaimer$Investment {

        @NotNull
        public static final Parcelable.Creator<Withdraw> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f95354a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Withdraw(b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Withdraw[i];
            }
        }

        public Withdraw(b context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.f95354a = context;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Withdraw) && this.f95354a == ((Withdraw) obj2).f95354a;
        }

        @Override // com.revolut.feature.wealth.api.ui.extensions.disclaimers.WealthDisclaimersContract$Disclaimer$Investment
        /* JADX INFO: renamed from: getContext, reason: from getter */
        public final b getF95354a() {
            return this.f95354a;
        }

        public final int hashCode() {
            return this.f95354a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f95354a.name());
        }
    }

    /* JADX INFO: renamed from: getContext */
    b getF95354a();
}
