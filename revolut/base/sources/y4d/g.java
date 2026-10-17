package y4d;

import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f310878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f310879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f310880c;
    public final List d;

    public g(TextLocalisedClause title, TextLocalisedClause disclaimerTitle, List previews, List selectionOptions) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(disclaimerTitle, "disclaimerTitle");
        Intrinsics.checkNotNullParameter(previews, "previews");
        Intrinsics.checkNotNullParameter(selectionOptions, "selectionOptions");
        this.f310878a = title;
        this.f310879b = disclaimerTitle;
        this.f310880c = previews;
        this.d = selectionOptions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f310878a.equals(gVar.f310878a) && this.f310879b.equals(gVar.f310879b) && Intrinsics.f(this.f310880c, gVar.f310880c) && Intrinsics.f(this.d, gVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.d(t61.a.a(this.f310878a.hashCode() * 31, 31, this.f310879b), 31, this.f310880c);
    }
}
