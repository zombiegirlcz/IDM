package csj;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class l extends m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f108487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f108488c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(List updatedCategories, dj0.d overallBudget) {
        super(updatedCategories);
        Intrinsics.checkNotNullParameter(updatedCategories, "updatedCategories");
        Intrinsics.checkNotNullParameter(overallBudget, "overallBudget");
        this.f108487b = updatedCategories;
        this.f108488c = overallBudget;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f108487b, lVar.f108487b) && Intrinsics.f(this.f108488c, lVar.f108488c);
    }

    @Override // csj.m
    public final dj0.d f() {
        return this.f108488c;
    }

    @Override // csj.m
    public final List g() {
        return this.f108487b;
    }

    public final int hashCode() {
        return this.f108488c.hashCode() + (this.f108487b.hashCode() * 31);
    }
}
