package asj;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f8936a;

    public d(List categoryBudgetEditingInfos) {
        Intrinsics.checkNotNullParameter(categoryBudgetEditingInfos, "categoryBudgetEditingInfos");
        this.f8936a = categoryBudgetEditingInfos;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f8936a, ((d) obj2).f8936a);
    }

    public final int hashCode() {
        return this.f8936a.hashCode();
    }
}
