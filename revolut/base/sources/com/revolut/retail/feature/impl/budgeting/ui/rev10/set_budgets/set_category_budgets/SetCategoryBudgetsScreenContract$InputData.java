package com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.set_category_budgets;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.kompot.common.IOData$Input;
import csj.h;
import dj0.d;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/impl/budgeting/ui/rev10/set_budgets/set_category_budgets/SetCategoryBudgetsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_budgeting_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SetCategoryBudgetsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<SetCategoryBudgetsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f101555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f101556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AccountId f101557c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z3;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            d dVar = (d) parcel.readSerializable();
            h hVarValueOf = h.valueOf(parcel.readString());
            AccountId accountId = (AccountId) parcel.readParcelable(SetCategoryBudgetsScreenContract$InputData.class.getClassLoader());
            boolean z4 = false;
            boolean z6 = true;
            if (parcel.readInt() != 0) {
                z = false;
                z4 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = true;
                z6 = z;
            }
            if (parcel.readInt() == 0) {
                z3 = z;
            }
            return new SetCategoryBudgetsScreenContract$InputData(dVar, hVarValueOf, accountId, z4, z6, z3);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SetCategoryBudgetsScreenContract$InputData[i];
        }
    }

    public SetCategoryBudgetsScreenContract$InputData(d overallBudget, h categoryAction, AccountId accountId, boolean z, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(overallBudget, "overallBudget");
        Intrinsics.checkNotNullParameter(categoryAction, "categoryAction");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f101555a = overallBudget;
        this.f101556b = categoryAction;
        this.f101557c = accountId;
        this.d = z;
        this.e = z3;
        this.f = z4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SetCategoryBudgetsScreenContract$InputData)) {
            return false;
        }
        SetCategoryBudgetsScreenContract$InputData setCategoryBudgetsScreenContract$InputData = (SetCategoryBudgetsScreenContract$InputData) obj2;
        return Intrinsics.f(this.f101555a, setCategoryBudgetsScreenContract$InputData.f101555a) && this.f101556b == setCategoryBudgetsScreenContract$InputData.f101556b && Intrinsics.f(this.f101557c, setCategoryBudgetsScreenContract$InputData.f101557c) && this.d == setCategoryBudgetsScreenContract$InputData.d && this.e == setCategoryBudgetsScreenContract$InputData.e && this.f == setCategoryBudgetsScreenContract$InputData.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + j6.a.c(j6.a.c(l.b(this.f101557c, (this.f101556b.hashCode() + (this.f101555a.hashCode() * 31)) * 31, 31), 31, this.d), 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f101555a);
        dest.writeString(this.f101556b.name());
        dest.writeParcelable(this.f101557c, i);
        dest.writeInt(this.d ? 1 : 0);
        dest.writeInt(this.e ? 1 : 0);
        dest.writeInt(this.f ? 1 : 0);
    }
}
