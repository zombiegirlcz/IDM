package s6h;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f260349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f260350b;

    public h(TextLocalisedClause textLocalisedClause, List menuItems) {
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f260349a = textLocalisedClause;
        this.f260350b = menuItems;
    }

    @Override // s6h.i
    public final List a() {
        return this.f260350b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f260349a, hVar.f260349a) && Intrinsics.f(this.f260350b, hVar.f260350b);
    }

    public final int hashCode() {
        Clause clause = this.f260349a;
        return this.f260350b.hashCode() + ((clause == null ? 0 : clause.hashCode()) * 31);
    }
}
