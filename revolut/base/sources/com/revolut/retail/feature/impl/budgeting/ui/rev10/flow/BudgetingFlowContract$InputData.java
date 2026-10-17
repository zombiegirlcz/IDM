package com.revolut.retail.feature.impl.budgeting.ui.rev10.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qzi.i;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/retail/feature/impl/budgeting/ui/rev10/flow/BudgetingFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "ViewBudget", "CreateBudget", "Lcom/revolut/retail/feature/impl/budgeting/ui/rev10/flow/BudgetingFlowContract$InputData$CreateBudget;", "Lcom/revolut/retail/feature/impl/budgeting/ui/rev10/flow/BudgetingFlowContract$InputData$ViewBudget;", "feature_budgeting_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BudgetingFlowContract$InputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/impl/budgeting/ui/rev10/flow/BudgetingFlowContract$InputData$CreateBudget;", "Lcom/revolut/retail/feature/impl/budgeting/ui/rev10/flow/BudgetingFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_budgeting_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CreateBudget implements BudgetingFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<CreateBudget> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AccountId f101504a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CreateBudget((AccountId) parcel.readParcelable(CreateBudget.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreateBudget[i];
            }
        }

        public CreateBudget(AccountId accountId) {
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            this.f101504a = accountId;
        }

        @Override // com.revolut.retail.feature.impl.budgeting.ui.rev10.flow.BudgetingFlowContract$InputData
        /* JADX INFO: renamed from: Y7 */
        public final i getF101505a() {
            AccountId accountId = this.f101504a;
            if (accountId instanceof AccountId.Personal) {
                return i.Personal;
            }
            if (accountId instanceof AccountId.Joint) {
                return i.Joint;
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CreateBudget) && Intrinsics.f(this.f101504a, ((CreateBudget) obj2).f101504a);
        }

        public final int hashCode() {
            return this.f101504a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f101504a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/impl/budgeting/ui/rev10/flow/BudgetingFlowContract$InputData$ViewBudget;", "Lcom/revolut/retail/feature/impl/budgeting/ui/rev10/flow/BudgetingFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_budgeting_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ViewBudget implements BudgetingFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<ViewBudget> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f101505a;

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
            this.f101505a = budgetingAccountType;
        }

        @Override // com.revolut.retail.feature.impl.budgeting.ui.rev10.flow.BudgetingFlowContract$InputData
        /* JADX INFO: renamed from: Y7, reason: from getter */
        public final i getF101505a() {
            return this.f101505a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ViewBudget) && this.f101505a == ((ViewBudget) obj2).f101505a;
        }

        public final int hashCode() {
            return this.f101505a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f101505a.name());
        }
    }

    /* JADX INFO: renamed from: Y7 */
    i getF101505a();
}
