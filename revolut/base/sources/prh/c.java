package prh;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f239019a;

    public c(TextLocalisedClause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f239019a = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f239019a.equals(((c) obj2).f239019a);
    }

    public final int hashCode() {
        return this.f239019a.hashCode();
    }
}
