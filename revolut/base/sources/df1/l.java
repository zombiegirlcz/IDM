package df1;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class l implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f113754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f113755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f113756c;
    public final TextLocalisedClause d;

    public l(TextLocalisedClause ctaText, List items, List menuItems, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(ctaText, "ctaText");
        this.f113754a = items;
        this.f113755b = menuItems;
        this.f113756c = z;
        this.d = ctaText;
    }

    @Override // cli.p
    public final List c() {
        return this.f113754a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f113754a.equals(lVar.f113754a) && Intrinsics.f(this.f113755b, lVar.f113755b) && this.f113756c == lVar.f113756c && this.d.equals(lVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + j6.a.c(p.a.d(this.f113754a.hashCode() * 31, 31, this.f113755b), 31, this.f113756c);
    }
}
