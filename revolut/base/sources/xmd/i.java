package xmd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f307174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f307175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f307176c;

    public i(b budgetSuggestion, a step, dj0.d from) {
        Intrinsics.checkNotNullParameter(budgetSuggestion, "budgetSuggestion");
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(from, "from");
        this.f307174a = budgetSuggestion;
        this.f307175b = step;
        this.f307176c = from;
    }

    @Override // xmd.m
    public final b a() {
        return this.f307174a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f307174a, iVar.f307174a) && this.f307175b == iVar.f307175b && Intrinsics.f(this.f307176c, iVar.f307176c);
    }

    public final int hashCode() {
        return this.f307176c.hashCode() + ((this.f307175b.hashCode() + (this.f307174a.hashCode() * 31)) * 31);
    }
}
