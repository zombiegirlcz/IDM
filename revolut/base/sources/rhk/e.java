package rhk;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f254511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f254512b;

    public e() {
        this(3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f254511a == eVar.f254511a && Intrinsics.f(this.f254512b, eVar.f254512b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f254511a) * 31;
        Clause clause = this.f254512b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }

    public /* synthetic */ e(int i) {
        this(null, (i & 1) == 0);
    }

    public e(TextLocalisedClause textLocalisedClause, boolean z) {
        this.f254511a = z;
        this.f254512b = textLocalisedClause;
    }
}
