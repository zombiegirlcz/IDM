package xmd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f307178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f307179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f307180c;

    public k(b budgetSuggestion, a fromStep, a toStep) {
        Intrinsics.checkNotNullParameter(budgetSuggestion, "budgetSuggestion");
        Intrinsics.checkNotNullParameter(fromStep, "fromStep");
        Intrinsics.checkNotNullParameter(toStep, "toStep");
        this.f307178a = budgetSuggestion;
        this.f307179b = fromStep;
        this.f307180c = toStep;
    }

    @Override // xmd.m
    public final b a() {
        return this.f307178a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f307178a, kVar.f307178a) && this.f307179b == kVar.f307179b && this.f307180c == kVar.f307180c;
    }

    public final int hashCode() {
        return this.f307180c.hashCode() + ((this.f307179b.hashCode() + (this.f307178a.hashCode() * 31)) * 31);
    }
}
