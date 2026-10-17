package com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.models;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tof.i3;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/impl/budgeting/ui/rev10/set_budgets/models/CategoryBudgetEditingInfo;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_budgeting_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CategoryBudgetEditingInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CategoryBudgetEditingInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i3 f101547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f101548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f101549c;
    public final d d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CategoryBudgetEditingInfo((i3) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CategoryBudgetEditingInfo[i];
        }
    }

    public CategoryBudgetEditingInfo(i3 transactionCategory, d initialBudget, d enteredBudget, d lastPeriodSpent) {
        Intrinsics.checkNotNullParameter(transactionCategory, "transactionCategory");
        Intrinsics.checkNotNullParameter(initialBudget, "initialBudget");
        Intrinsics.checkNotNullParameter(enteredBudget, "enteredBudget");
        Intrinsics.checkNotNullParameter(lastPeriodSpent, "lastPeriodSpent");
        this.f101547a = transactionCategory;
        this.f101548b = initialBudget;
        this.f101549c = enteredBudget;
        this.d = lastPeriodSpent;
    }

    public static CategoryBudgetEditingInfo a(CategoryBudgetEditingInfo categoryBudgetEditingInfo, d enteredBudget) {
        i3 transactionCategory = categoryBudgetEditingInfo.f101547a;
        d initialBudget = categoryBudgetEditingInfo.f101548b;
        d lastPeriodSpent = categoryBudgetEditingInfo.d;
        categoryBudgetEditingInfo.getClass();
        Intrinsics.checkNotNullParameter(transactionCategory, "transactionCategory");
        Intrinsics.checkNotNullParameter(initialBudget, "initialBudget");
        Intrinsics.checkNotNullParameter(enteredBudget, "enteredBudget");
        Intrinsics.checkNotNullParameter(lastPeriodSpent, "lastPeriodSpent");
        return new CategoryBudgetEditingInfo(transactionCategory, initialBudget, enteredBudget, lastPeriodSpent);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CategoryBudgetEditingInfo)) {
            return false;
        }
        CategoryBudgetEditingInfo categoryBudgetEditingInfo = (CategoryBudgetEditingInfo) obj2;
        return Intrinsics.f(this.f101547a, categoryBudgetEditingInfo.f101547a) && Intrinsics.f(this.f101548b, categoryBudgetEditingInfo.f101548b) && Intrinsics.f(this.f101549c, categoryBudgetEditingInfo.f101549c) && Intrinsics.f(this.d, categoryBudgetEditingInfo.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + v7.c(v7.c(this.f101547a.hashCode() * 31, 31, this.f101548b), 31, this.f101549c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f101547a);
        dest.writeSerializable(this.f101548b);
        dest.writeSerializable(this.f101549c);
        dest.writeSerializable(this.d);
    }
}
