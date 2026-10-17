package sb3;

import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class m implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f261488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f261489b;

    public m(Clause title, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f261488a = items;
        this.f261489b = title;
    }

    @Override // cli.p
    public final List c() {
        return this.f261488a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f261488a, mVar.f261488a) && this.f261489b.equals(mVar.f261489b);
    }

    public final int hashCode() {
        return this.f261489b.hashCode() + (this.f261488a.hashCode() * 31);
    }
}
