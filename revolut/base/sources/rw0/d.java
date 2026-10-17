package rw0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f257796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f257797b;

    public d(Clause prefixText, Clause clause) {
        Intrinsics.checkNotNullParameter(prefixText, "prefixText");
        this.f257796a = prefixText;
        this.f257797b = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f257796a.equals(dVar.f257796a) && Intrinsics.f(this.f257797b, dVar.f257797b);
    }

    public final int hashCode() {
        int iHashCode = this.f257796a.hashCode() * 31;
        Clause clause = this.f257797b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
