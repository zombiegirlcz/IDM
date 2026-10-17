package txl;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f275436a;

    public f(TextLocalisedClause text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f275436a = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f275436a.equals(((f) obj2).f275436a);
    }

    public final int hashCode() {
        return this.f275436a.hashCode();
    }
}
