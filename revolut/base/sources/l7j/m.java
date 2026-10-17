package l7j;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class m implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f192678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f192679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f192680c;

    public m(l navBar, k footer, ArrayList items) {
        Intrinsics.checkNotNullParameter(navBar, "navBar");
        Intrinsics.checkNotNullParameter(footer, "footer");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f192678a = navBar;
        this.f192679b = footer;
        this.f192680c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f192680c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f192678a.equals(mVar.f192678a) && this.f192679b.equals(mVar.f192679b) && this.f192680c.equals(mVar.f192680c);
    }

    public final int hashCode() {
        return this.f192680c.hashCode() + t61.a.a(this.f192678a.hashCode() * 31, 31, this.f192679b.f192674a);
    }
}
