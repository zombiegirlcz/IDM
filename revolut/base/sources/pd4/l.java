package pd4;

import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import ip0.v7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class l implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f235076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f235077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextClause f235078c;
    public final TextLocalisedClause d;
    public final boolean e;

    public l(aim.e items, TextLocalisedClause navBarTitle, TextClause navBarDescription, TextLocalisedClause buttonText, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarTitle, "navBarTitle");
        Intrinsics.checkNotNullParameter(navBarDescription, "navBarDescription");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        this.f235076a = items;
        this.f235077b = navBarTitle;
        this.f235078c = navBarDescription;
        this.d = buttonText;
        this.e = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f235076a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f235076a, lVar.f235076a) && this.f235077b.equals(lVar.f235077b) && this.f235078c.equals(lVar.f235078c) && this.d.equals(lVar.d) && this.e == lVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + t61.a.a(v7.b(t61.a.a(this.f235076a.hashCode() * 31, 31, this.f235077b), 31, this.f235078c), 31, this.d);
    }
}
