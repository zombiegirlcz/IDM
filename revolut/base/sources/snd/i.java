package snd;

import kotlin.jvm.internal.Intrinsics;
import xnd.n0;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0 f264537a;

    public i(n0 budgetTools) {
        Intrinsics.checkNotNullParameter(budgetTools, "budgetTools");
        this.f264537a = budgetTools;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f264537a, ((i) obj2).f264537a);
    }

    public final int hashCode() {
        return this.f264537a.hashCode();
    }
}
