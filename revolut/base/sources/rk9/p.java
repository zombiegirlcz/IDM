package rk9;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class p implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f254781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f254782b;

    public p(TextLocalisedClause title, TextLocalisedClause description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f254781a = title;
        this.f254782b = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return this.f254781a.equals(pVar.f254781a) && this.f254782b.equals(pVar.f254782b);
    }

    public final int hashCode() {
        return this.f254782b.hashCode() + (this.f254781a.hashCode() * 31);
    }
}
