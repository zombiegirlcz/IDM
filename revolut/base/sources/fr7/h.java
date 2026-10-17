package fr7;

import cli.p;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f137400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CompositeClause f137401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f137402c;

    public h(CompositeClause subtitle, TextLocalisedClause title, List items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f137400a = title;
        this.f137401b = subtitle;
        this.f137402c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f137402c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f137400a.equals(hVar.f137400a) && this.f137401b.equals(hVar.f137401b) && Intrinsics.f(this.f137402c, hVar.f137402c);
    }

    public final int hashCode() {
        return this.f137402c.hashCode() + h30.l.c(this.f137401b, this.f137400a.hashCode() * 31, 31);
    }
}
