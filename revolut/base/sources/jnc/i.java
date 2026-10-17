package jnc;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f176691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f176692b;

    public i(Clause clause, boolean z) {
        this.f176691a = z;
        this.f176692b = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f176691a == iVar.f176691a && Intrinsics.f(this.f176692b, iVar.f176692b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f176691a) * 31;
        Clause clause = this.f176692b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
