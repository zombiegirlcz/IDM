package kbh;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f182581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f182582b;

    public c(Clause clause, Clause clause2) {
        this.f182581a = clause;
        this.f182582b = clause2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f182581a, cVar.f182581a) && Intrinsics.f(this.f182582b, cVar.f182582b);
    }

    public final int hashCode() {
        Clause clause = this.f182581a;
        int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
        Clause clause2 = this.f182582b;
        return iHashCode + (clause2 != null ? clause2.hashCode() : 0);
    }
}
