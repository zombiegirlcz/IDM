package com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.set_overall_budget;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.kompot.common.IOData$Input;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/impl/budgeting/ui/rev10/set_budgets/set_overall_budget/SetOverallBudgetScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_budgeting_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SetOverallBudgetScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<SetOverallBudgetScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bsj.a f101562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccountId f101563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f101564c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SetOverallBudgetScreenContract$InputData(bsj.a.valueOf(parcel.readString()), (AccountId) parcel.readParcelable(SetOverallBudgetScreenContract$InputData.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SetOverallBudgetScreenContract$InputData[i];
        }
    }

    public SetOverallBudgetScreenContract$InputData(bsj.a budgetAction, AccountId accountId, boolean z) {
        Intrinsics.checkNotNullParameter(budgetAction, "budgetAction");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f101562a = budgetAction;
        this.f101563b = accountId;
        this.f101564c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SetOverallBudgetScreenContract$InputData)) {
            return false;
        }
        SetOverallBudgetScreenContract$InputData setOverallBudgetScreenContract$InputData = (SetOverallBudgetScreenContract$InputData) obj2;
        return this.f101562a == setOverallBudgetScreenContract$InputData.f101562a && Intrinsics.f(this.f101563b, setOverallBudgetScreenContract$InputData.f101563b) && this.f101564c == setOverallBudgetScreenContract$InputData.f101564c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f101564c) + l.b(this.f101563b, this.f101562a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f101562a.name());
        dest.writeParcelable(this.f101563b, i);
        dest.writeInt(this.f101564c ? 1 : 0);
    }
}
