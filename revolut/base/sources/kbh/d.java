package kbh;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f182583a;

    public d(Clause clause) {
        this.f182583a = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f182583a, ((d) obj2).f182583a);
    }

    public final int hashCode() {
        Clause clause = this.f182583a;
        if (clause == null) {
            return 0;
        }
        return clause.hashCode();
    }
}
