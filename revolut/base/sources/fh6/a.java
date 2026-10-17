package fh6;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f135152a;

    public a(TextLocalisedClause clause) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        this.f135152a = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f135152a.equals(((a) obj2).f135152a);
    }

    public final int hashCode() {
        return this.f135152a.hashCode();
    }
}
