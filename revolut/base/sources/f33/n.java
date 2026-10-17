package f33;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class n implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f131901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f131902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f131903c;
    public final Clause d;

    public n(aim.e items, Clause clause, TextLocalisedClause buttonText, List menuItems) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f131901a = items;
        this.f131902b = buttonText;
        this.f131903c = menuItems;
        this.d = clause;
    }

    @Override // cli.p
    public final List c() {
        return this.f131901a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f131901a, nVar.f131901a) && this.f131902b.equals(nVar.f131902b) && Intrinsics.f(this.f131903c, nVar.f131903c) && Intrinsics.f(this.d, nVar.d);
    }

    public final int hashCode() {
        int iD = p.a.d(t61.a.a(this.f131901a.hashCode() * 31, 31, this.f131902b), 31, this.f131903c);
        Clause clause = this.d;
        return iD + (clause == null ? 0 : clause.hashCode());
    }
}
