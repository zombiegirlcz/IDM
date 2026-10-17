package twb;

import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f274991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f274992b;

    public n(TextClause title, List navBarMenuItems) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(navBarMenuItems, "navBarMenuItems");
        this.f274991a = title;
        this.f274992b = navBarMenuItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f274991a.equals(nVar.f274991a) && Intrinsics.f(this.f274992b, nVar.f274992b);
    }

    public final int hashCode() {
        return this.f274992b.hashCode() + (this.f274991a.hashCode() * 31);
    }
}
