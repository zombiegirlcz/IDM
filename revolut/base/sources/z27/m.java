package z27;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f318987a;

    public m(TextLocalisedClause textLocalisedClause) {
        this.f318987a = textLocalisedClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f318987a, ((m) obj2).f318987a);
    }

    public final int hashCode() {
        Clause clause = this.f318987a;
        if (clause == null) {
            return 0;
        }
        return clause.hashCode();
    }
}
