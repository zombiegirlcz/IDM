package c17;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f20396a;

    public l(TextLocalisedClause textLocalisedClause) {
        this.f20396a = textLocalisedClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f20396a, ((l) obj2).f20396a);
    }

    public final int hashCode() {
        Clause clause = this.f20396a;
        if (clause == null) {
            return 0;
        }
        return clause.hashCode();
    }
}
