package com.revolut.retail.feature.impl.budgeting.ui.rev10.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.kompot.navigable.flow.FlowStep;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qzi.i;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/retail/feature/impl/budgeting/ui/rev10/flow/BudgetingFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Overview", "CreateBudgetFlow", "EditBudgetFlow", "Lcom/revolut/retail/feature/impl/budgeting/ui/rev10/flow/BudgetingFlowContract$Step$CreateBudgetFlow;", "Lcom/revolut/retail/feature/impl/budgeting/ui/rev10/flow/BudgetingFlowContract$Step$EditBudgetFlow;", "Lcom/revolut/retail/feature/impl/budgeting/ui/rev10/flow/BudgetingFlowContract$Step$Overview;", "feature_budgeting_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BudgetingFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/impl/budgeting/ui/rev10/flow/BudgetingFlowContract$Step$CreateBudgetFlow;", "Lcom/revolut/retail/feature/impl/budgeting/ui/rev10/flow/BudgetingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_budgeting_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CreateBudgetFlow extends BudgetingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CreateBudgetFlow> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AccountId f101506a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CreateBudgetFlow((AccountId) parcel.readParcelable(CreateBudgetFlow.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreateBudgetFlow[i];
            }
        }

        public CreateBudgetFlow(AccountId accountId) {
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            this.f101506a = accountId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CreateBudgetFlow) && Intrinsics.f(this.f101506a, ((CreateBudgetFlow) obj2).f101506a);
        }

        public final int hashCode() {
            return this.f101506a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f101506a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/impl/budgeting/ui/rev10/flow/BudgetingFlowContract$Step$EditBudgetFlow;", "Lcom/revolut/retail/feature/impl/budgeting/ui/rev10/flow/BudgetingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "com/revolut/retail/feature/impl/budgeting/ui/rev10/flow/c", "feature_budgeting_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EditBudgetFlow extends BudgetingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<EditBudgetFlow> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final dj0.d f101507a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AccountId f101508b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c f101509c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EditBudgetFlow((dj0.d) parcel.readSerializable(), (AccountId) parcel.readParcelable(EditBudgetFlow.class.getClassLoader()), c.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EditBudgetFlow[i];
            }
        }

        public EditBudgetFlow(dj0.d budgetAmount, AccountId accountId, c flowType) {
            Intrinsics.checkNotNullParameter(budgetAmount, "budgetAmount");
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            Intrinsics.checkNotNullParameter(flowType, "flowType");
            this.f101507a = budgetAmount;
            this.f101508b = accountId;
            this.f101509c = flowType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof EditBudgetFlow)) {
                return false;
            }
            EditBudgetFlow editBudgetFlow = (EditBudgetFlow) obj2;
            return Intrinsics.f(this.f101507a, editBudgetFlow.f101507a) && Intrinsics.f(this.f101508b, editBudgetFlow.f101508b) && this.f101509c == editBudgetFlow.f101509c;
        }

        public final int hashCode() {
            return this.f101509c.hashCode() + l.b(this.f101508b, this.f101507a.hashCode() * 31, 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f101507a);
            dest.writeParcelable(this.f101508b, i);
            dest.writeString(this.f101509c.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/impl/budgeting/ui/rev10/flow/BudgetingFlowContract$Step$Overview;", "Lcom/revolut/retail/feature/impl/budgeting/ui/rev10/flow/BudgetingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_budgeting_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Overview extends BudgetingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Overview> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f101510a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Overview(i.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Overview[i];
            }
        }

        public Overview(i budgetingAccountType) {
            Intrinsics.checkNotNullParameter(budgetingAccountType, "budgetingAccountType");
            this.f101510a = budgetingAccountType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Overview) && this.f101510a == ((Overview) obj2).f101510a;
        }

        public final int hashCode() {
            return this.f101510a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f101510a.name());
        }
    }

    private BudgetingFlowContract$Step() {
    }
}
