package o7j;

import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class t extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f222875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CompositeClause f222876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f222877c;

    public t(CompositeClause subtitleClause, TextLocalisedClause titleClause, List menuItems) {
        Intrinsics.checkNotNullParameter(titleClause, "titleClause");
        Intrinsics.checkNotNullParameter(subtitleClause, "subtitleClause");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f222875a = titleClause;
        this.f222876b = subtitleClause;
        this.f222877c = menuItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return this.f222875a.equals(tVar.f222875a) && this.f222876b.equals(tVar.f222876b) && Intrinsics.f(this.f222877c, tVar.f222877c);
    }

    public final int hashCode() {
        return this.f222877c.hashCode() + h30.l.c(this.f222876b, this.f222875a.hashCode() * 31, 31);
    }
}
