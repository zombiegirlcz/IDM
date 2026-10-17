package us4;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f282431a;

    public l(TextLocalisedClause textLocalisedClause) {
        this.f282431a = textLocalisedClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f282431a, ((l) obj2).f282431a);
    }

    public final int hashCode() {
        Clause clause = this.f282431a;
        if (clause == null) {
            return 0;
        }
        return clause.hashCode();
    }
}
