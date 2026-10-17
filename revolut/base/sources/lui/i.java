package lui;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f200247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f200248b;

    public i(aim.e items, TextLocalisedClause navBarDescription) {
        Intrinsics.checkNotNullParameter(navBarDescription, "navBarDescription");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f200247a = navBarDescription;
        this.f200248b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f200248b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f200247a.equals(iVar.f200247a) && Intrinsics.f(this.f200248b, iVar.f200248b);
    }

    public final int hashCode() {
        return this.f200248b.hashCode() + (this.f200247a.hashCode() * 31);
    }
}
