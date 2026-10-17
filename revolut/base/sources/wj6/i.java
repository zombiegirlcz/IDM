package wj6;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f297967a;

    public i(TextLocalisedClause textLocalisedClause) {
        this.f297967a = textLocalisedClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f297967a, ((i) obj2).f297967a);
    }

    public final int hashCode() {
        Clause clause = this.f297967a;
        if (clause == null) {
            return 0;
        }
        return clause.hashCode();
    }
}
