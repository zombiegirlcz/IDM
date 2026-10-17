package au0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class o0 extends p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f9298a;

    public o0(Clause clause) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        this.f9298a = clause;
    }

    @Override // au0.p0
    public final Clause a() {
        return this.f9298a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o0) && Intrinsics.f(this.f9298a, ((o0) obj2).f9298a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f9298a.hashCode() * 31);
    }
}
