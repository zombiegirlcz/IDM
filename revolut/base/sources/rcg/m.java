package rcg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class m implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f253260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f253261b;

    public m(List items, h navBarModel) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarModel, "navBarModel");
        this.f253260a = items;
        this.f253261b = navBarModel;
    }

    @Override // cli.p
    public final List c() {
        return this.f253260a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f253260a, mVar.f253260a) && Intrinsics.f(this.f253261b, mVar.f253261b);
    }

    public final int hashCode() {
        return this.f253261b.hashCode() + (this.f253260a.hashCode() * 31);
    }
}
