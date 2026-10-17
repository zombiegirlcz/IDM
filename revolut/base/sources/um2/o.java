package um2;

import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class o extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f281210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f281211b;

    public o(Clause title, List menuItems) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f281210a = title;
        this.f281211b = menuItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f281210a, oVar.f281210a) && Intrinsics.f(this.f281211b, oVar.f281211b);
    }

    public final int hashCode() {
        return this.f281211b.hashCode() + (this.f281210a.hashCode() * 31);
    }
}
