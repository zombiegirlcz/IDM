package rk9;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class n implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f254777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f254778b;

    public n(TextLocalisedClause title, TextLocalisedClause description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f254777a = title;
        this.f254778b = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f254777a.equals(nVar.f254777a) && this.f254778b.equals(nVar.f254778b);
    }

    public final int hashCode() {
        return this.f254778b.hashCode() + (this.f254777a.hashCode() * 31);
    }
}
