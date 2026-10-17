package k50;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class g1 implements j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f181073a;

    public g1(TextLocalisedClause text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f181073a = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g1) && this.f181073a.equals(((g1) obj2).f181073a);
    }

    public final int hashCode() {
        return this.f181073a.hashCode();
    }
}
