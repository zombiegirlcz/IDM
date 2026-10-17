package prh;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f239021a;

    public e(TextLocalisedClause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f239021a = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f239021a.equals(((e) obj2).f239021a);
    }

    public final int hashCode() {
        return this.f239021a.hashCode();
    }
}
