package sl2;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class m implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.feature.backend_driven_limits.impl.v2.ui.list.c f264092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.feature.backend_driven_limits.impl.v2.ui.list.b f264093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f264094c;

    public m(com.revolut.feature.backend_driven_limits.impl.v2.ui.list.c headerState, com.revolut.feature.backend_driven_limits.impl.v2.ui.list.b actionButtonState, List items) {
        Intrinsics.checkNotNullParameter(headerState, "headerState");
        Intrinsics.checkNotNullParameter(actionButtonState, "actionButtonState");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f264092a = headerState;
        this.f264093b = actionButtonState;
        this.f264094c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f264094c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f264092a, mVar.f264092a) && Intrinsics.f(this.f264093b, mVar.f264093b) && Intrinsics.f(this.f264094c, mVar.f264094c);
    }

    public final int hashCode() {
        return this.f264094c.hashCode() + ((this.f264093b.hashCode() + (this.f264092a.hashCode() * 31)) * 31);
    }
}
