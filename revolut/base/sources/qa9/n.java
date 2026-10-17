package qa9;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class n implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f243994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f243995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f243996c;
    public final Clause d;
    public final TextLocalisedClause e;
    public final boolean f;

    public n(ArrayList items, TextLocalisedClause navBarTitleClause, TextLocalisedClause navBarSubTitleClause, Clause textAboveMainButtonTermClause, TextLocalisedClause mainButtonTextClause, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarTitleClause, "navBarTitleClause");
        Intrinsics.checkNotNullParameter(navBarSubTitleClause, "navBarSubTitleClause");
        Intrinsics.checkNotNullParameter(textAboveMainButtonTermClause, "textAboveMainButtonTermClause");
        Intrinsics.checkNotNullParameter(mainButtonTextClause, "mainButtonTextClause");
        this.f243994a = items;
        this.f243995b = navBarTitleClause;
        this.f243996c = navBarSubTitleClause;
        this.d = textAboveMainButtonTermClause;
        this.e = mainButtonTextClause;
        this.f = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f243994a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f243994a.equals(nVar.f243994a) && this.f243995b.equals(nVar.f243995b) && this.f243996c.equals(nVar.f243996c) && Intrinsics.f(this.d, nVar.d) && this.e.equals(nVar.e) && this.f == nVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + t61.a.a(p.a.a(t61.a.a(t61.a.a(this.f243994a.hashCode() * 31, 31, this.f243995b), 31, this.f243996c), 31, this.d), 31, this.e);
    }
}
