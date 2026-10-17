package aw0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f10620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f10621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f10622c;

    public y2(TextClause top, TextClause title, Clause subtitle) {
        Intrinsics.checkNotNullParameter(top, "top");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f10620a = top;
        this.f10621b = title;
        this.f10622c = subtitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y2)) {
            return false;
        }
        y2 y2Var = (y2) obj2;
        return this.f10620a.equals(y2Var.f10620a) && this.f10621b.equals(y2Var.f10621b) && this.f10622c.equals(y2Var.f10622c);
    }

    public final int hashCode() {
        return this.f10622c.hashCode() + ip0.v7.b(this.f10620a.hashCode() * 31, 31, this.f10621b);
    }
}
