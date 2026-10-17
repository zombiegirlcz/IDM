package jld;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f175713a;

    public b(TextLocalisedClause title) {
        Intrinsics.checkNotNullParameter("fincrime_nps_submission_error", "dialogId");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f175713a = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f175713a.equals(((b) obj2).f175713a);
    }

    public final int hashCode() {
        return this.f175713a.hashCode() - 52288763;
    }
}
