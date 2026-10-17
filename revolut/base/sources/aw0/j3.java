package aw0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class j3 implements k3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f10370a;

    public j3(TextLocalisedClause clause) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        this.f10370a = clause;
    }

    public final Clause a() {
        return this.f10370a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j3) && this.f10370a.equals(((j3) obj2).f10370a);
    }

    public final int hashCode() {
        return this.f10370a.hashCode();
    }
}
