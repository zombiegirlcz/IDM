package eh3;

import com.revolut.core.ui_kit.models.TextClause;
import ip0.v7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class m implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f125719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f125720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f125721c;

    public m(TextClause toolbarTitle, List headerPages, List menuItems) {
        Intrinsics.checkNotNullParameter(headerPages, "headerPages");
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f125719a = headerPages;
        this.f125720b = toolbarTitle;
        this.f125721c = menuItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f125719a, mVar.f125719a) && this.f125720b.equals(mVar.f125720b) && Intrinsics.f(this.f125721c, mVar.f125721c);
    }

    public final int hashCode() {
        return this.f125721c.hashCode() + v7.b(this.f125719a.hashCode() * 31, 31, this.f125720b);
    }
}
