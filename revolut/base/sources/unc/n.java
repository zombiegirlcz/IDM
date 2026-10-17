package unc;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f281403a;

    public n(TextLocalisedClause textLocalisedClause) {
        this.f281403a = textLocalisedClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f281403a, ((n) obj2).f281403a);
    }

    public final int hashCode() {
        Clause clause = this.f281403a;
        if (clause == null) {
            return 0;
        }
        return clause.hashCode();
    }
}
