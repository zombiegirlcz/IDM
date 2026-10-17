package rbc;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f253013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f253014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f253015c;

    public h(Clause clause, TextLocalisedClause title, List menuItems) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f253013a = title;
        this.f253014b = clause;
        this.f253015c = menuItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f253013a.equals(hVar.f253013a) && this.f253014b.equals(hVar.f253014b) && Intrinsics.f(this.f253015c, hVar.f253015c);
    }

    public final int hashCode() {
        return this.f253015c.hashCode() + p.a.b(this.f253013a.hashCode() * 31, 31, this.f253014b);
    }
}
