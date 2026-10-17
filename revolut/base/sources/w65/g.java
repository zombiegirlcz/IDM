package w65;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f295383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f295384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f295385c;

    public g(aim.e items, TextLocalisedClause title, TextLocalisedClause subtitle) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f295383a = items;
        this.f295384b = title;
        this.f295385c = subtitle;
    }

    @Override // cli.p
    public final List c() {
        return this.f295383a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f295383a, gVar.f295383a) && this.f295384b.equals(gVar.f295384b) && this.f295385c.equals(gVar.f295385c);
    }

    public final int hashCode() {
        return this.f295385c.hashCode() + t61.a.a(this.f295383a.hashCode() * 31, 31, this.f295384b);
    }
}
