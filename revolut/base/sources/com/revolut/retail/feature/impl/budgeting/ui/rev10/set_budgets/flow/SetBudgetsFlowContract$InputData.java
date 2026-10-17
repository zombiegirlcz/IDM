package com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.kompot.common.IOData$Input;
import dj0.d;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/retail/feature/impl/budgeting/ui/rev10/set_budgets/flow/SetBudgetsFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "<init>", "()V", "SetBudget", "UpdateOverallBudget", "SetCategoriesBudget", "Lcom/revolut/retail/feature/impl/budgeting/ui/rev10/set_budgets/flow/SetBudgetsFlowContract$InputData$SetBudget;", "Lcom/revolut/retail/feature/impl/budgeting/ui/rev10/set_budgets/flow/SetBudgetsFlowContract$InputData$SetCategoriesBudget;", "Lcom/revolut/retail/feature/impl/budgeting/ui/rev10/set_budgets/flow/SetBudgetsFlowContract$InputData$UpdateOverallBudget;", "feature_budgeting_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class SetBudgetsFlowContract$InputData implements IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/impl/budgeting/ui/rev10/set_budgets/flow/SetBudgetsFlowContract$InputData$SetBudget;", "Lcom/revolut/retail/feature/impl/budgeting/ui/rev10/set_budgets/flow/SetBudgetsFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_budgeting_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SetBudget extends SetBudgetsFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<SetBudget> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AccountId f101531a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f101532b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SetBudget((AccountId) parcel.readParcelable(SetBudget.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SetBudget[i];
            }
        }

        public SetBudget(AccountId accountId, boolean z) {
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            this.f101531a = accountId;
            this.f101532b = z;
        }

        @Override // com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.flow.SetBudgetsFlowContract$InputData
        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getF101538c() {
            return this.f101532b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SetBudget)) {
                return false;
            }
            SetBudget setBudget = (SetBudget) obj2;
            return Intrinsics.f(this.f101531a, setBudget.f101531a) && this.f101532b == setBudget.f101532b;
        }

        @Override // com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.flow.SetBudgetsFlowContract$InputData
        /* JADX INFO: renamed from: getAccountId, reason: from getter */
        public final AccountId getF101537b() {
            return this.f101531a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f101532b) + (this.f101531a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f101531a, i);
            dest.writeInt(this.f101532b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/impl/budgeting/ui/rev10/set_budgets/flow/SetBudgetsFlowContract$InputData$SetCategoriesBudget;", "Lcom/revolut/retail/feature/impl/budgeting/ui/rev10/set_budgets/flow/SetBudgetsFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_budgeting_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SetCategoriesBudget extends SetBudgetsFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<SetCategoriesBudget> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f101533a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AccountId f101534b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f101535c;
        public final boolean d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SetCategoriesBudget((d) parcel.readSerializable(), (AccountId) parcel.readParcelable(SetCategoriesBudget.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SetCategoriesBudget[i];
            }
        }

        public SetCategoriesBudget(d overallBudget, AccountId accountId, boolean z, boolean z3) {
            Intrinsics.checkNotNullParameter(overallBudget, "overallBudget");
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            this.f101533a = overallBudget;
            this.f101534b = accountId;
            this.f101535c = z;
            this.d = z3;
        }

        @Override // com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.flow.SetBudgetsFlowContract$InputData
        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getF101538c() {
            return this.f101535c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SetCategoriesBudget)) {
                return false;
            }
            SetCategoriesBudget setCategoriesBudget = (SetCategoriesBudget) obj2;
            return Intrinsics.f(this.f101533a, setCategoriesBudget.f101533a) && Intrinsics.f(this.f101534b, setCategoriesBudget.f101534b) && this.f101535c == setCategoriesBudget.f101535c && this.d == setCategoriesBudget.d;
        }

        @Override // com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.flow.SetBudgetsFlowContract$InputData
        /* JADX INFO: renamed from: getAccountId, reason: from getter */
        public final AccountId getF101537b() {
            return this.f101534b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + j6.a.c(l.b(this.f101534b, this.f101533a.hashCode() * 31, 31), 31, this.f101535c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f101533a);
            dest.writeParcelable(this.f101534b, i);
            dest.writeInt(this.f101535c ? 1 : 0);
            dest.writeInt(this.d ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/impl/budgeting/ui/rev10/set_budgets/flow/SetBudgetsFlowContract$InputData$UpdateOverallBudget;", "Lcom/revolut/retail/feature/impl/budgeting/ui/rev10/set_budgets/flow/SetBudgetsFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_budgeting_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UpdateOverallBudget extends SetBudgetsFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<UpdateOverallBudget> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f101536a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AccountId f101537b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f101538c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UpdateOverallBudget((d) parcel.readSerializable(), (AccountId) parcel.readParcelable(UpdateOverallBudget.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UpdateOverallBudget[i];
            }
        }

        public UpdateOverallBudget(d overallBudget, AccountId accountId, boolean z) {
            Intrinsics.checkNotNullParameter(overallBudget, "overallBudget");
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            this.f101536a = overallBudget;
            this.f101537b = accountId;
            this.f101538c = z;
        }

        @Override // com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.flow.SetBudgetsFlowContract$InputData
        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getF101538c() {
            return this.f101538c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof UpdateOverallBudget)) {
                return false;
            }
            UpdateOverallBudget updateOverallBudget = (UpdateOverallBudget) obj2;
            return Intrinsics.f(this.f101536a, updateOverallBudget.f101536a) && Intrinsics.f(this.f101537b, updateOverallBudget.f101537b) && this.f101538c == updateOverallBudget.f101538c;
        }

        @Override // com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.flow.SetBudgetsFlowContract$InputData
        /* JADX INFO: renamed from: getAccountId, reason: from getter */
        public final AccountId getF101537b() {
            return this.f101537b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f101538c) + l.b(this.f101537b, this.f101536a.hashCode() * 31, 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f101536a);
            dest.writeParcelable(this.f101537b, i);
            dest.writeInt(this.f101538c ? 1 : 0);
        }
    }

    private SetBudgetsFlowContract$InputData() {
    }

    /* JADX INFO: renamed from: a */
    public boolean getF101538c() {
        return false;
    }

    /* JADX INFO: renamed from: getAccountId */
    public abstract AccountId getF101537b();
}
