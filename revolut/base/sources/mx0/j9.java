package mx0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class j9 implements n9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f209784a;

    public j9(TextLocalisedClause text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f209784a = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j9) && this.f209784a.equals(((j9) obj2).f209784a);
    }

    @Override // mx0.n9
    public final Clause getText() {
        return this.f209784a;
    }

    public final int hashCode() {
        return this.f209784a.hashCode();
    }
}
