package csj;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class k extends m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f108485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f108486c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(List updatedCategories, dj0.d overallBudget) {
        super(updatedCategories);
        Intrinsics.checkNotNullParameter(updatedCategories, "updatedCategories");
        Intrinsics.checkNotNullParameter(overallBudget, "overallBudget");
        this.f108485b = updatedCategories;
        this.f108486c = overallBudget;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f108485b, kVar.f108485b) && Intrinsics.f(this.f108486c, kVar.f108486c);
    }

    @Override // csj.m
    public final dj0.d f() {
        return this.f108486c;
    }

    @Override // csj.m
    public final List g() {
        return this.f108485b;
    }

    public final int hashCode() {
        return this.f108486c.hashCode() + (this.f108485b.hashCode() * 31);
    }
}
