package prh;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f239020a;

    public d(TextLocalisedClause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f239020a = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f239020a.equals(((d) obj2).f239020a);
    }

    public final int hashCode() {
        return this.f239020a.hashCode();
    }
}
