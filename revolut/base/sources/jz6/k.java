package jz6;

import com.revolut.core.ui_kit.models.TextLocalisedClause;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f179596a;

    public k(TextLocalisedClause textLocalisedClause) {
        this.f179596a = textLocalisedClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && this.f179596a.equals(((k) obj2).f179596a);
    }

    public final int hashCode() {
        return this.f179596a.hashCode();
    }
}
