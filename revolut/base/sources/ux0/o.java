package ux0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f283786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f283787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f283788c;

    public o(Clause title, Clause clause, n highlightedItems) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(highlightedItems, "highlightedItems");
        this.f283786a = title;
        this.f283787b = clause;
        this.f283788c = highlightedItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f283786a, oVar.f283786a) && Intrinsics.f(this.f283787b, oVar.f283787b) && Intrinsics.f(this.f283788c, oVar.f283788c);
    }

    public final int hashCode() {
        int iHashCode = this.f283786a.hashCode() * 31;
        Clause clause = this.f283787b;
        return this.f283788c.hashCode() + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
