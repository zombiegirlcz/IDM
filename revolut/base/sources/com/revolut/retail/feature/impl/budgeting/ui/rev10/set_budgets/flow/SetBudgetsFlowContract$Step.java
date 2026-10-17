package com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/retail/feature/impl/budgeting/ui/rev10/set_budgets/flow/SetBudgetsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "OverallBudget", "CategoryBudgets", "Lcom/revolut/retail/feature/impl/budgeting/ui/rev10/set_budgets/flow/SetBudgetsFlowContract$Step$CategoryBudgets;", "Lcom/revolut/retail/feature/impl/budgeting/ui/rev10/set_budgets/flow/SetBudgetsFlowContract$Step$OverallBudget;", "feature_budgeting_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SetBudgetsFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/impl/budgeting/ui/rev10/set_budgets/flow/SetBudgetsFlowContract$Step$CategoryBudgets;", "Lcom/revolut/retail/feature/impl/budgeting/ui/rev10/set_budgets/flow/SetBudgetsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_budgeting_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CategoryBudgets implements SetBudgetsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CategoryBudgets> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f101539a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CategoryBudgets((d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CategoryBudgets[i];
            }
        }

        public CategoryBudgets(d overallBudget) {
            Intrinsics.checkNotNullParameter(overallBudget, "overallBudget");
            this.f101539a = overallBudget;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CategoryBudgets) && Intrinsics.f(this.f101539a, ((CategoryBudgets) obj2).f101539a);
        }

        public final int hashCode() {
            return this.f101539a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f101539a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/impl/budgeting/ui/rev10/set_budgets/flow/SetBudgetsFlowContract$Step$OverallBudget;", "Lcom/revolut/retail/feature/impl/budgeting/ui/rev10/set_budgets/flow/SetBudgetsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_budgeting_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OverallBudget implements SetBudgetsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<OverallBudget> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final bsj.a f101540a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OverallBudget(bsj.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OverallBudget[i];
            }
        }

        public OverallBudget(bsj.a budgetAction) {
            Intrinsics.checkNotNullParameter(budgetAction, "budgetAction");
            this.f101540a = budgetAction;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof OverallBudget) && this.f101540a == ((OverallBudget) obj2).f101540a;
        }

        public final int hashCode() {
            return this.f101540a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f101540a.name());
        }
    }
}
