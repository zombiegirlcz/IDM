package qsa;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f248768a;

    public h(TextLocalisedClause submitButtonClause) {
        Intrinsics.checkNotNullParameter(submitButtonClause, "submitButtonClause");
        this.f248768a = submitButtonClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f248768a.equals(((h) obj2).f248768a);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f248768a.hashCode() * 31);
    }
}
