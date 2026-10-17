package xo0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f307539a;

    public a(Clause clause) {
        this.f307539a = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f307539a, ((a) obj2).f307539a);
    }

    public final int hashCode() {
        Clause clause = this.f307539a;
        if (clause == null) {
            return 0;
        }
        return clause.hashCode();
    }
}
