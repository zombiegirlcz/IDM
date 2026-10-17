package boh;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class p implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f17474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f17475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f17476c;
    public final List d;

    public p(aim.e items, TextLocalisedClause title, TextLocalisedClause description, List actions) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f17474a = items;
        this.f17475b = title;
        this.f17476c = description;
        this.d = actions;
    }

    @Override // cli.p
    public final List c() {
        return this.f17474a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f17474a, pVar.f17474a) && this.f17475b.equals(pVar.f17475b) && this.f17476c.equals(pVar.f17476c) && Intrinsics.f(this.d, pVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + t61.a.a(t61.a.a(this.f17474a.hashCode() * 31, 31, this.f17475b), 31, this.f17476c);
    }
}
