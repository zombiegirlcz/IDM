package jlk;

import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextClause;
import ip0.v7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class l implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f175858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f175859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CompositeClause f175860c;

    public l(aim.e items, TextClause headerTitle, CompositeClause headerSubtitle) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(headerTitle, "headerTitle");
        Intrinsics.checkNotNullParameter(headerSubtitle, "headerSubtitle");
        this.f175858a = items;
        this.f175859b = headerTitle;
        this.f175860c = headerSubtitle;
    }

    @Override // cli.p
    public final List c() {
        return this.f175858a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f175858a, lVar.f175858a) && this.f175859b.equals(lVar.f175859b) && this.f175860c.equals(lVar.f175860c);
    }

    public final int hashCode() {
        return this.f175860c.hashCode() + v7.b(this.f175858a.hashCode() * 31, 31, this.f175859b);
    }
}
