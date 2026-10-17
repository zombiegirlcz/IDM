package sul;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f265795a;

    public e(TextLocalisedClause textLocalisedClause) {
        this.f265795a = textLocalisedClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f265795a, ((e) obj2).f265795a);
    }

    public final int hashCode() {
        Clause clause = this.f265795a;
        if (clause == null) {
            return 0;
        }
        return clause.hashCode();
    }
}
