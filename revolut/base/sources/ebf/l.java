package ebf;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class l implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f124327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f124328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.e f124329c;
    public final List d;

    public l(TextLocalisedClause title, TextLocalisedClause subtitle, aw0.e actionFooterModel, aim.e items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(actionFooterModel, "actionFooterModel");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f124327a = title;
        this.f124328b = subtitle;
        this.f124329c = actionFooterModel;
        this.d = items;
    }

    @Override // cli.p
    public final List c() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f124327a.equals(lVar.f124327a) && this.f124328b.equals(lVar.f124328b) && this.f124329c.equals(lVar.f124329c) && Intrinsics.f(this.d, lVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ehe.n.c(this.f124329c, t61.a.a(this.f124327a.hashCode() * 31, 31, this.f124328b), 31);
    }
}
