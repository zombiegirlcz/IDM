package doc;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f116495a;

    public e(TextLocalisedClause textLocalisedClause) {
        this.f116495a = textLocalisedClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f116495a, ((e) obj2).f116495a);
    }

    public final int hashCode() {
        Clause clause = this.f116495a;
        if (clause == null) {
            return 0;
        }
        return clause.hashCode();
    }
}
