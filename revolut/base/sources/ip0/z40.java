package ip0;

import com.revolut.core.ui_kit.models.TextClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class z40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f167397a;

    public z40(TextClause text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f167397a = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof z40) && this.f167397a.equals(((z40) obj2).f167397a);
    }

    public final int hashCode() {
        return this.f167397a.hashCode();
    }
}
