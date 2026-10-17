package bx8;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f19528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f19529b;

    public p(Clause clause, boolean z) {
        this.f19528a = z;
        this.f19529b = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return this.f19528a == pVar.f19528a && Intrinsics.f(this.f19529b, pVar.f19529b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f19528a) * 31;
        Clause clause = this.f19529b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
