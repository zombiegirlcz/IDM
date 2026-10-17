package iuf;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f168566a;

    public k(TextLocalisedClause submitButtonClause) {
        Intrinsics.checkNotNullParameter(submitButtonClause, "submitButtonClause");
        this.f168566a = submitButtonClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && this.f168566a.equals(((k) obj2).f168566a);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f168566a.hashCode() * 31);
    }
}
