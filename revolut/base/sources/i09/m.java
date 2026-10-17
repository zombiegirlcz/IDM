package i09;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f157331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.feature.learn.shared.impl.ui.course.overview.d f157332b;

    public m(List items, com.revolut.feature.learn.shared.impl.ui.course.overview.d headerState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(headerState, "headerState");
        this.f157331a = items;
        this.f157332b = headerState;
    }

    @Override // jki.n
    public final List c() {
        return this.f157331a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f157331a, mVar.f157331a) && Intrinsics.f(this.f157332b, mVar.f157332b);
    }

    public final int hashCode() {
        return this.f157332b.hashCode() + (this.f157331a.hashCode() * 31);
    }
}
