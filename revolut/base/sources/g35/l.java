package g35;

import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class l implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f140198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f140199b;

    public l(Clause title, List items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f140198a = title;
        this.f140199b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f140199b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f140198a, lVar.f140198a) && Intrinsics.f(this.f140199b, lVar.f140199b);
    }

    public final int hashCode() {
        return this.f140199b.hashCode() + (this.f140198a.hashCode() * 31);
    }
}
