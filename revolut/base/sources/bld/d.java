package bld;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f16530a;

    public d(TextLocalisedClause title) {
        Intrinsics.checkNotNullParameter("submission_error", "dialogId");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f16530a = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f16530a.equals(((d) obj2).f16530a);
    }

    public final int hashCode() {
        return this.f16530a.hashCode() - 2088754357;
    }
}
