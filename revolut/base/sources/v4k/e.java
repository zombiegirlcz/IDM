package v4k;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f286125a;

    public e(TextLocalisedClause text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f286125a = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f286125a.equals(((e) obj2).f286125a);
    }

    public final int hashCode() {
        return this.f286125a.hashCode();
    }
}
