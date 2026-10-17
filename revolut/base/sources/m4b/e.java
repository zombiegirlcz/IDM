package m4b;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f202686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f202687b;

    public e() {
        this(null, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f202686a, eVar.f202686a) && Intrinsics.f(this.f202687b, eVar.f202687b);
    }

    public final int hashCode() {
        Clause clause = this.f202686a;
        int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
        Clause clause2 = this.f202687b;
        return iHashCode + (clause2 != null ? clause2.hashCode() : 0);
    }

    public e(Clause clause, Clause clause2) {
        this.f202686a = clause;
        this.f202687b = clause2;
    }
}
