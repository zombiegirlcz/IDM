package o97;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g0 extends d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f223104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f223105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f223106c;
    public final y d;

    public g0(Clause sectionTitle, TextLocalisedClause endLabel, String listId, y payload) {
        Intrinsics.checkNotNullParameter(sectionTitle, "sectionTitle");
        Intrinsics.checkNotNullParameter(endLabel, "endLabel");
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.f223104a = sectionTitle;
        this.f223105b = endLabel;
        this.f223106c = listId;
        this.d = payload;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return Intrinsics.f(this.f223104a, g0Var.f223104a) && this.f223105b.equals(g0Var.f223105b) && Intrinsics.f(this.f223106c, g0Var.f223106c) && this.d.equals(g0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(t61.a.a(this.f223104a.hashCode() * 31, 31, this.f223105b), 31, this.f223106c);
    }
}
