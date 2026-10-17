package hz4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class m implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f157030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f157031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f157032c;

    public m(List items, l toolbar, k button) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(button, "button");
        this.f157030a = items;
        this.f157031b = toolbar;
        this.f157032c = button;
    }

    @Override // cli.p
    public final List c() {
        return this.f157030a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f157030a, mVar.f157030a) && Intrinsics.f(this.f157031b, mVar.f157031b) && Intrinsics.f(this.f157032c, mVar.f157032c);
    }

    public final int hashCode() {
        return this.f157032c.hashCode() + ((this.f157031b.hashCode() + (this.f157030a.hashCode() * 31)) * 31);
    }
}
