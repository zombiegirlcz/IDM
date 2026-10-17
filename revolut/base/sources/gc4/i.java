package gc4;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f142328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f142329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f142330c;
    public final Object d;
    public final boolean e;

    public i(List items, TextLocalisedClause navBarTitle, TextClause textClause, Clause buttonText, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarTitle, "navBarTitle");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        this.f142328a = items;
        this.f142329b = navBarTitle;
        this.f142330c = textClause;
        this.d = buttonText;
        this.e = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f142328a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f142328a, iVar.f142328a) && Intrinsics.f(this.f142329b, iVar.f142329b) && Intrinsics.f(this.f142330c, iVar.f142330c) && Intrinsics.f(this.d, iVar.d) && this.e == iVar.e;
    }

    public final int hashCode() {
        int iA = t61.a.a(this.f142328a.hashCode() * 31, 31, this.f142329b);
        Clause clause = this.f142330c;
        return Boolean.hashCode(this.e) + p.a.b((iA + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.d);
    }
}
