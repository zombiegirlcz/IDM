package n94;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f213571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f213572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f213573c;
    public final boolean d;
    public final List e;

    public j(aim.e items, TextLocalisedClause title, TextLocalisedClause subtitle, TextLocalisedClause button, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f213571a = title;
        this.f213572b = subtitle;
        this.f213573c = button;
        this.d = z;
        this.e = items;
    }

    @Override // cli.p
    public final List c() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f213571a.equals(jVar.f213571a) && this.f213572b.equals(jVar.f213572b) && this.f213573c.equals(jVar.f213573c) && this.d == jVar.d && Intrinsics.f(this.e, jVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + j6.a.c(t61.a.a(t61.a.a(this.f213571a.hashCode() * 31, 31, this.f213572b), 31, this.f213573c), 31, this.d);
    }
}
