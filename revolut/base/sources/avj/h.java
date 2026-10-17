package avj;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f10053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f10054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f10055c;
    public final Clause d;
    public final TextLocalisedClause e;
    public final List f;

    public h(List items, boolean z, TextLocalisedClause title, TextLocalisedClause textLocalisedClause, TextLocalisedClause disclaimer, List menuItems) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f10053a = items;
        this.f10054b = z;
        this.f10055c = title;
        this.d = textLocalisedClause;
        this.e = disclaimer;
        this.f = menuItems;
    }

    @Override // cli.p
    public final List c() {
        return this.f10053a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f10053a, hVar.f10053a) && this.f10054b == hVar.f10054b && this.f10055c.equals(hVar.f10055c) && Intrinsics.f(this.d, hVar.d) && this.e.equals(hVar.e) && Intrinsics.f(this.f, hVar.f);
    }

    public final int hashCode() {
        int iA = t61.a.a(j6.a.c(this.f10053a.hashCode() * 31, 31, this.f10054b), 31, this.f10055c);
        Clause clause = this.d;
        return this.f.hashCode() + t61.a.a((iA + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.e);
    }
}
