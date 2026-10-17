package xmd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f307172a;

    public h(b budgetSuggestion) {
        Intrinsics.checkNotNullParameter(budgetSuggestion, "budgetSuggestion");
        this.f307172a = budgetSuggestion;
    }

    @Override // xmd.m
    public final b a() {
        return this.f307172a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f307172a, ((h) obj2).f307172a);
    }

    public final int hashCode() {
        return this.f307172a.hashCode();
    }
}
