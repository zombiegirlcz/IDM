package xob;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f307770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f307771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f307772c;

    public h(Clause clause, TextLocalisedClause title, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f307770a = z;
        this.f307771b = title;
        this.f307772c = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f307770a == hVar.f307770a && Intrinsics.f(this.f307771b, hVar.f307771b) && Intrinsics.f(this.f307772c, hVar.f307772c);
    }

    public final int hashCode() {
        int iA = t61.a.a(Boolean.hashCode(this.f307770a) * 31, 31, this.f307771b);
        Clause clause = this.f307772c;
        return iA + (clause == null ? 0 : clause.hashCode());
    }
}
