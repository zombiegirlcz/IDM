package csj;

import com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.models.CategoryBudgetEditingInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CategoryBudgetEditingInfo f108483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f108484b;

    public j(CategoryBudgetEditingInfo categoryBudgetEditingInfo, String amountString) {
        Intrinsics.checkNotNullParameter(categoryBudgetEditingInfo, "categoryBudgetEditingInfo");
        Intrinsics.checkNotNullParameter(amountString, "amountString");
        this.f108483a = categoryBudgetEditingInfo;
        this.f108484b = amountString;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f108483a, jVar.f108483a) && Intrinsics.f(this.f108484b, jVar.f108484b);
    }

    public final int hashCode() {
        return this.f108484b.hashCode() + (this.f108483a.hashCode() * 31);
    }
}
