package com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.spending_analytics.api.models.NetWorthAccount;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.dashboard.AnalyticsDashboardContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.AnalyticsDetailsContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.custom_period.select.CustomPeriodSelectContract$CustomPeriodConfig;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qzi.i;
import wp5.y;
import yld.d;
import yld.g;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u000e\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000e\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, d2 = {"com/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/flow/AnalyticsDashboardFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Dashboard", "AccountPicker", "BudgetCreation", "BudgetSetupAccountPicker", "BudgetOverview", "Settings", "AnalyticsDetails", "IncomeSorter", "TotalWealth", "Trips", "AddAsset", "AddTrip", "SpareChange", "CustomPeriodSelect", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/flow/AnalyticsDashboardFlowContract$Step$AccountPicker;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/flow/AnalyticsDashboardFlowContract$Step$AddAsset;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/flow/AnalyticsDashboardFlowContract$Step$AddTrip;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/flow/AnalyticsDashboardFlowContract$Step$AnalyticsDetails;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/flow/AnalyticsDashboardFlowContract$Step$BudgetCreation;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/flow/AnalyticsDashboardFlowContract$Step$BudgetOverview;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/flow/AnalyticsDashboardFlowContract$Step$BudgetSetupAccountPicker;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/flow/AnalyticsDashboardFlowContract$Step$CustomPeriodSelect;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/flow/AnalyticsDashboardFlowContract$Step$Dashboard;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/flow/AnalyticsDashboardFlowContract$Step$IncomeSorter;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/flow/AnalyticsDashboardFlowContract$Step$Settings;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/flow/AnalyticsDashboardFlowContract$Step$SpareChange;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/flow/AnalyticsDashboardFlowContract$Step$TotalWealth;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/flow/AnalyticsDashboardFlowContract$Step$Trips;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AnalyticsDashboardFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/flow/AnalyticsDashboardFlowContract$Step$AccountPicker;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/flow/AnalyticsDashboardFlowContract$Step;", "<init>", "()V", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AccountPicker extends AnalyticsDashboardFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AccountPicker f87578a = new AccountPicker();

        @NotNull
        public static final Parcelable.Creator<AccountPicker> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AccountPicker.f87578a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AccountPicker[i];
            }
        }

        private AccountPicker() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/flow/AnalyticsDashboardFlowContract$Step$AddAsset;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/flow/AnalyticsDashboardFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddAsset extends AnalyticsDashboardFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AddAsset> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final xi0.b f87579a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AddAsset((xi0.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddAsset[i];
            }
        }

        public AddAsset(xi0.b currency) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.f87579a = currency;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AddAsset) && Intrinsics.f(this.f87579a, ((AddAsset) obj2).f87579a);
        }

        public final int hashCode() {
            return this.f87579a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f87579a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/flow/AnalyticsDashboardFlowContract$Step$AddTrip;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/flow/AnalyticsDashboardFlowContract$Step;", "<init>", "()V", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AddTrip extends AnalyticsDashboardFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AddTrip f87580a = new AddTrip();

        @NotNull
        public static final Parcelable.Creator<AddTrip> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AddTrip.f87580a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddTrip[i];
            }
        }

        private AddTrip() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/flow/AnalyticsDashboardFlowContract$Step$AnalyticsDetails;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/flow/AnalyticsDashboardFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AnalyticsDetails extends AnalyticsDashboardFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AnalyticsDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AnalyticsDetailsContract$InputData f87581a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AnalyticsDetails(AnalyticsDetailsContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AnalyticsDetails[i];
            }
        }

        public AnalyticsDetails(AnalyticsDetailsContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f87581a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AnalyticsDetails) && Intrinsics.f(this.f87581a, ((AnalyticsDetails) obj2).f87581a);
        }

        public final int hashCode() {
            return this.f87581a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f87581a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/flow/AnalyticsDashboardFlowContract$Step$BudgetCreation;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/flow/AnalyticsDashboardFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BudgetCreation extends AnalyticsDashboardFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<BudgetCreation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AccountId f87582a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BudgetCreation((AccountId) parcel.readParcelable(BudgetCreation.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BudgetCreation[i];
            }
        }

        public BudgetCreation(AccountId accountId) {
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            this.f87582a = accountId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BudgetCreation) && Intrinsics.f(this.f87582a, ((BudgetCreation) obj2).f87582a);
        }

        public final int hashCode() {
            return this.f87582a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f87582a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/flow/AnalyticsDashboardFlowContract$Step$BudgetOverview;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/flow/AnalyticsDashboardFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BudgetOverview extends AnalyticsDashboardFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<BudgetOverview> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f87583a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BudgetOverview(i.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BudgetOverview[i];
            }
        }

        public BudgetOverview(i budgetingAccountType) {
            Intrinsics.checkNotNullParameter(budgetingAccountType, "budgetingAccountType");
            this.f87583a = budgetingAccountType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BudgetOverview) && this.f87583a == ((BudgetOverview) obj2).f87583a;
        }

        public final int hashCode() {
            return this.f87583a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f87583a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/flow/AnalyticsDashboardFlowContract$Step$BudgetSetupAccountPicker;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/flow/AnalyticsDashboardFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BudgetSetupAccountPicker extends AnalyticsDashboardFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<BudgetSetupAccountPicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f87584a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(BudgetSetupAccountPicker.class, parcel, arrayList, iE, 1);
                }
                return new BudgetSetupAccountPicker(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BudgetSetupAccountPicker[i];
            }
        }

        public BudgetSetupAccountPicker(ArrayList accountIds) {
            Intrinsics.checkNotNullParameter(accountIds, "accountIds");
            this.f87584a = accountIds;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BudgetSetupAccountPicker) && this.f87584a.equals(((BudgetSetupAccountPicker) obj2).f87584a);
        }

        public final int hashCode() {
            return this.f87584a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            ArrayList arrayList = this.f87584a;
            dest.writeInt(arrayList.size());
            Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                dest.writeParcelable((Parcelable) it8.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/flow/AnalyticsDashboardFlowContract$Step$CustomPeriodSelect;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/flow/AnalyticsDashboardFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CustomPeriodSelect extends AnalyticsDashboardFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CustomPeriodSelect> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f87585a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f87586b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final LocalDate f87587c;
        public final LocalDate d;
        public final LocalDate e;
        public final boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final CustomPeriodSelectContract$CustomPeriodConfig f87588g;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(CustomPeriodSelect.class, parcel, arrayList, iE, 1);
                }
                return new CustomPeriodSelect(arrayList, d.valueOf(parcel.readString()), (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : CustomPeriodSelectContract$CustomPeriodConfig.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CustomPeriodSelect[i];
            }
        }

        public CustomPeriodSelect(List accounts, d screenType, LocalDate localDate, LocalDate initialStartDate, LocalDate initialEndDate, boolean z, CustomPeriodSelectContract$CustomPeriodConfig customPeriodSelectContract$CustomPeriodConfig) {
            Intrinsics.checkNotNullParameter(accounts, "accounts");
            Intrinsics.checkNotNullParameter(screenType, "screenType");
            Intrinsics.checkNotNullParameter(initialStartDate, "initialStartDate");
            Intrinsics.checkNotNullParameter(initialEndDate, "initialEndDate");
            this.f87585a = accounts;
            this.f87586b = screenType;
            this.f87587c = localDate;
            this.d = initialStartDate;
            this.e = initialEndDate;
            this.f = z;
            this.f87588g = customPeriodSelectContract$CustomPeriodConfig;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CustomPeriodSelect)) {
                return false;
            }
            CustomPeriodSelect customPeriodSelect = (CustomPeriodSelect) obj2;
            return Intrinsics.f(this.f87585a, customPeriodSelect.f87585a) && this.f87586b == customPeriodSelect.f87586b && Intrinsics.f(this.f87587c, customPeriodSelect.f87587c) && Intrinsics.f(this.d, customPeriodSelect.d) && Intrinsics.f(this.e, customPeriodSelect.e) && this.f == customPeriodSelect.f && Intrinsics.f(this.f87588g, customPeriodSelect.f87588g);
        }

        public final int hashCode() {
            int iHashCode = (this.f87586b.hashCode() + (this.f87585a.hashCode() * 31)) * 31;
            LocalDate localDate = this.f87587c;
            int iC = j6.a.c(y.a(y.a((iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f);
            CustomPeriodSelectContract$CustomPeriodConfig customPeriodSelectContract$CustomPeriodConfig = this.f87588g;
            return iC + (customPeriodSelectContract$CustomPeriodConfig != null ? customPeriodSelectContract$CustomPeriodConfig.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f87585a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            dest.writeString(this.f87586b.name());
            dest.writeSerializable(this.f87587c);
            dest.writeSerializable(this.d);
            dest.writeSerializable(this.e);
            dest.writeInt(this.f ? 1 : 0);
            CustomPeriodSelectContract$CustomPeriodConfig customPeriodSelectContract$CustomPeriodConfig = this.f87588g;
            if (customPeriodSelectContract$CustomPeriodConfig == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                customPeriodSelectContract$CustomPeriodConfig.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/flow/AnalyticsDashboardFlowContract$Step$Dashboard;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/flow/AnalyticsDashboardFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Dashboard extends AnalyticsDashboardFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Dashboard> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AnalyticsDashboardContract$InputData f87589a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Dashboard(AnalyticsDashboardContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Dashboard[i];
            }
        }

        public Dashboard(AnalyticsDashboardContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f87589a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Dashboard) && Intrinsics.f(this.f87589a, ((Dashboard) obj2).f87589a);
        }

        public final int hashCode() {
            return this.f87589a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f87589a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/flow/AnalyticsDashboardFlowContract$Step$IncomeSorter;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/flow/AnalyticsDashboardFlowContract$Step;", "<init>", "()V", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IncomeSorter extends AnalyticsDashboardFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final IncomeSorter f87590a = new IncomeSorter();

        @NotNull
        public static final Parcelable.Creator<IncomeSorter> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return IncomeSorter.f87590a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new IncomeSorter[i];
            }
        }

        private IncomeSorter() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/flow/AnalyticsDashboardFlowContract$Step$Settings;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/flow/AnalyticsDashboardFlowContract$Step;", "<init>", "()V", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Settings extends AnalyticsDashboardFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Settings f87591a = new Settings();

        @NotNull
        public static final Parcelable.Creator<Settings> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Settings.f87591a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Settings[i];
            }
        }

        private Settings() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/flow/AnalyticsDashboardFlowContract$Step$SpareChange;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/flow/AnalyticsDashboardFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SpareChange extends AnalyticsDashboardFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SpareChange> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f87592a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SpareChange(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SpareChange[i];
            }
        }

        public SpareChange(String targetId) {
            Intrinsics.checkNotNullParameter(targetId, "targetId");
            this.f87592a = targetId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SpareChange) && Intrinsics.f(this.f87592a, ((SpareChange) obj2).f87592a);
        }

        public final int hashCode() {
            return this.f87592a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f87592a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/flow/AnalyticsDashboardFlowContract$Step$TotalWealth;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/flow/AnalyticsDashboardFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TotalWealth extends AnalyticsDashboardFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<TotalWealth> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g f87593a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final NetWorthAccount f87594b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TotalWealth(g.valueOf(parcel.readString()), (NetWorthAccount) parcel.readParcelable(TotalWealth.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TotalWealth[i];
            }
        }

        public TotalWealth(g netWorthType, NetWorthAccount netWorthAccount) {
            Intrinsics.checkNotNullParameter(netWorthType, "netWorthType");
            Intrinsics.checkNotNullParameter(netWorthAccount, "netWorthAccount");
            this.f87593a = netWorthType;
            this.f87594b = netWorthAccount;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TotalWealth)) {
                return false;
            }
            TotalWealth totalWealth = (TotalWealth) obj2;
            return this.f87593a == totalWealth.f87593a && Intrinsics.f(this.f87594b, totalWealth.f87594b);
        }

        public final int hashCode() {
            return this.f87594b.hashCode() + (this.f87593a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f87593a.name());
            dest.writeParcelable(this.f87594b, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/flow/AnalyticsDashboardFlowContract$Step$Trips;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/flow/AnalyticsDashboardFlowContract$Step;", "<init>", "()V", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Trips extends AnalyticsDashboardFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Trips f87595a = new Trips();

        @NotNull
        public static final Parcelable.Creator<Trips> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Trips.f87595a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Trips[i];
            }
        }

        private Trips() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    private AnalyticsDashboardFlowContract$Step() {
    }
}
