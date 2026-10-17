package y7k;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f311577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f311578b;

    public t(TextLocalisedClause navBarTitle, List menuItems) {
        Intrinsics.checkNotNullParameter(navBarTitle, "navBarTitle");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f311577a = navBarTitle;
        this.f311578b = menuItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return this.f311577a.equals(tVar.f311577a) && Intrinsics.f(this.f311578b, tVar.f311578b);
    }

    public final int hashCode() {
        return this.f311578b.hashCode() + (this.f311577a.hashCode() * 31);
    }
}
