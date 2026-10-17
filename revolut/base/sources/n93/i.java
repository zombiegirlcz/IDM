package n93;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f213562a;

    public i(TextLocalisedClause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f213562a = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && this.f213562a.equals(((i) obj2).f213562a);
    }

    public final int hashCode() {
        return this.f213562a.hashCode() * 31;
    }
}
