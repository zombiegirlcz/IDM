package pyc;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f240773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f240774b;

    public /* synthetic */ e() {
        this(null, false);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f240773a == eVar.f240773a && Intrinsics.f(this.f240774b, eVar.f240774b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f240773a) * 31;
        Clause clause = this.f240774b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }

    public e(TextLocalisedClause textLocalisedClause, boolean z) {
        this.f240773a = z;
        this.f240774b = textLocalisedClause;
    }
}
