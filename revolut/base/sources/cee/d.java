package cee;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import tde.q;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f23476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f23477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f23478c;
    public final Clause d;

    public d(TextClause title, TextClause content, q icon, Clause clause) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f23476a = title;
        this.f23477b = content;
        this.f23478c = icon;
        this.d = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f23476a.equals(dVar.f23476a) && this.f23477b.equals(dVar.f23477b) && this.f23478c == dVar.f23478c && Intrinsics.f(this.d, dVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f23478c.hashCode() + v7.b(this.f23476a.hashCode() * 31, 31, this.f23477b)) * 31;
        Clause clause = this.d;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
