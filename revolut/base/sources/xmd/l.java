package xmd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class l implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f307182a;

    public l(b budgetSuggestion) {
        Intrinsics.checkNotNullParameter(budgetSuggestion, "budgetSuggestion");
        this.f307182a = budgetSuggestion;
    }

    @Override // xmd.m
    public final b a() {
        return this.f307182a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f307182a, ((l) obj2).f307182a);
    }

    public final int hashCode() {
        return this.f307182a.hashCode();
    }
}
