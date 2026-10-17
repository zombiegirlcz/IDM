package com.revolut.feature.spending_analytics.impl.ui.budget;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qzi.i;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/spending_analytics/impl/ui/budget/BudgetFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "SetupBudget", "ViewBudget", "Lcom/revolut/feature/spending_analytics/impl/ui/budget/BudgetFlowContract$InputData$SetupBudget;", "Lcom/revolut/feature/spending_analytics/impl/ui/budget/BudgetFlowContract$InputData$ViewBudget;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BudgetFlowContract$InputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/budget/BudgetFlowContract$InputData$SetupBudget;", "Lcom/revolut/feature/spending_analytics/impl/ui/budget/BudgetFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SetupBudget implements BudgetFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<SetupBudget> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f87502a;

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
            this.f87502a = budgetingAccountType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SetupBudget) && this.f87502a == ((SetupBudget) obj2).f87502a;
        }

        public final int hashCode() {
            return this.f87502a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f87502a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/budget/BudgetFlowContract$InputData$ViewBudget;", "Lcom/revolut/feature/spending_analytics/impl/ui/budget/BudgetFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ViewBudget implements BudgetFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<ViewBudget> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f87503a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ViewBudget(i.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ViewBudget[i];
            }
        }

        public ViewBudget(i budgetingAccountType) {
            Intrinsics.checkNotNullParameter(budgetingAccountType, "budgetingAccountType");
            this.f87503a = budgetingAccountType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ViewBudget) && this.f87503a == ((ViewBudget) obj2).f87503a;
        }

        public final int hashCode() {
            return this.f87503a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f87503a.name());
        }
    }
}
