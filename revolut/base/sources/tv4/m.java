package tv4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class m implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f274706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f274707b;

    public m(l toolbar, List items) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f274706a = toolbar;
        this.f274707b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f274707b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f274706a, mVar.f274706a) && Intrinsics.f(this.f274707b, mVar.f274707b);
    }

    public final int hashCode() {
        return this.f274707b.hashCode() + (this.f274706a.hashCode() * 31);
    }
}
