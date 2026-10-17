package o7j;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class v extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f222879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f222880b;

    public v(TextLocalisedClause titleClause, List menuItems) {
        Intrinsics.checkNotNullParameter(titleClause, "titleClause");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f222879a = titleClause;
        this.f222880b = menuItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return this.f222879a.equals(vVar.f222879a) && Intrinsics.f(this.f222880b, vVar.f222880b);
    }

    public final int hashCode() {
        return this.f222880b.hashCode() + (this.f222879a.hashCode() * 31);
    }
}
