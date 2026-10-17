package com.revolut.feature.spending_analytics.impl.ui.budget;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.core.model.domain.wallet.WalletId;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qzi.i;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"com/revolut/feature/spending_analytics/impl/ui/budget/BudgetFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "SetupBudget", "BudgetOverview", "CategoryBudgets", "CreateCategory", "UpcomingPayments", "Lcom/revolut/feature/spending_analytics/impl/ui/budget/BudgetFlowContract$Step$BudgetOverview;", "Lcom/revolut/feature/spending_analytics/impl/ui/budget/BudgetFlowContract$Step$CategoryBudgets;", "Lcom/revolut/feature/spending_analytics/impl/ui/budget/BudgetFlowContract$Step$CreateCategory;", "Lcom/revolut/feature/spending_analytics/impl/ui/budget/BudgetFlowContract$Step$SetupBudget;", "Lcom/revolut/feature/spending_analytics/impl/ui/budget/BudgetFlowContract$Step$UpcomingPayments;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BudgetFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/budget/BudgetFlowContract$Step$BudgetOverview;", "Lcom/revolut/feature/spending_analytics/impl/ui/budget/BudgetFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BudgetOverview implements BudgetFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<BudgetOverview> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f87504a;

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
            this.f87504a = budgetingAccountType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BudgetOverview) && this.f87504a == ((BudgetOverview) obj2).f87504a;
        }

        public final int hashCode() {
            return this.f87504a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f87504a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/budget/BudgetFlowContract$Step$CategoryBudgets;", "Lcom/revolut/feature/spending_analytics/impl/ui/budget/BudgetFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CategoryBudgets implements BudgetFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CategoryBudgets> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f87505a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CategoryBudgets(((WalletId) parcel.readParcelable(CategoryBudgets.class.getClassLoader())).f66106a);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CategoryBudgets[i];
            }
        }

        public CategoryBudgets(String walletId) {
            Intrinsics.checkNotNullParameter(walletId, "walletId");
            this.f87505a = walletId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CategoryBudgets) && Intrinsics.f(this.f87505a, ((CategoryBudgets) obj2).f87505a);
        }

        public final int hashCode() {
            return this.f87505a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(new WalletId(this.f87505a), i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/budget/BudgetFlowContract$Step$CreateCategory;", "Lcom/revolut/feature/spending_analytics/impl/ui/budget/BudgetFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CreateCategory implements BudgetFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CreateCategory> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f87506a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CreateCategory(((WalletId) parcel.readParcelable(CreateCategory.class.getClassLoader())).f66106a);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreateCategory[i];
            }
        }

        public CreateCategory(String walletId) {
            Intrinsics.checkNotNullParameter(walletId, "walletId");
            this.f87506a = walletId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CreateCategory) && Intrinsics.f(this.f87506a, ((CreateCategory) obj2).f87506a);
        }

        public final int hashCode() {
            return this.f87506a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(new WalletId(this.f87506a), i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/budget/BudgetFlowContract$Step$SetupBudget;", "Lcom/revolut/feature/spending_analytics/impl/ui/budget/BudgetFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SetupBudget implements BudgetFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SetupBudget> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f87507a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SetupBudget(i.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SetupBudget[i];
            }
        }

        public SetupBudget(i budgetingAccountType) {
            Intrinsics.checkNotNullParameter(budgetingAccountType, "budgetingAccountType");
            this.f87507a = budgetingAccountType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SetupBudget) && this.f87507a == ((SetupBudget) obj2).f87507a;
        }

        public final int hashCode() {
            return this.f87507a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f87507a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/budget/BudgetFlowContract$Step$UpcomingPayments;", "Lcom/revolut/feature/spending_analytics/impl/ui/budget/BudgetFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UpcomingPayments implements BudgetFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<UpcomingPayments> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f87508a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UpcomingPayments(i.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UpcomingPayments[i];
            }
        }

        public UpcomingPayments(i budgetingAccountType) {
            Intrinsics.checkNotNullParameter(budgetingAccountType, "budgetingAccountType");
            this.f87508a = budgetingAccountType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof UpcomingPayments) && this.f87508a == ((UpcomingPayments) obj2).f87508a;
        }

        public final int hashCode() {
            return this.f87508a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f87508a.name());
        }
    }
}
