package br7;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aim.e f17939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f17940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CompositeClause f17941c;
    public final TextLocalisedClause d;
    public final boolean e;

    public j(aim.e items, Clause title, CompositeClause subtitle, TextLocalisedClause button, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(button, "button");
        this.f17939a = items;
        this.f17940b = title;
        this.f17941c = subtitle;
        this.d = button;
        this.e = z;
    }

    @Override // jki.n
    public final List c() {
        return this.f17939a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f17939a.equals(jVar.f17939a) && this.f17940b.equals(jVar.f17940b) && this.f17941c.equals(jVar.f17941c) && this.d.equals(jVar.d) && this.e == jVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + t61.a.a(h30.l.c(this.f17941c, p.a.b(this.f17939a.hashCode() * 31, 31, this.f17940b), 31), 31, this.d);
    }
}
