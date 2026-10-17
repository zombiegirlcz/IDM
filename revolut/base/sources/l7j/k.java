package l7j;

import com.revolut.core.ui_kit.models.TextLocalisedClause;

/* JADX INFO: loaded from: classes10.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f192674a;

    public k(TextLocalisedClause textLocalisedClause) {
        this.f192674a = textLocalisedClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && this.f192674a.equals(((k) obj2).f192674a);
    }

    public final int hashCode() {
        return this.f192674a.hashCode();
    }
}
