package kkj;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class m implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f185082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f185083b;

    public m(List items, g navBarConfig) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarConfig, "navBarConfig");
        this.f185082a = items;
        this.f185083b = navBarConfig;
    }

    @Override // cli.p
    public final List c() {
        return this.f185082a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f185082a, mVar.f185082a) && Intrinsics.f(this.f185083b, mVar.f185083b);
    }

    public final int hashCode() {
        return this.f185083b.hashCode() + (this.f185082a.hashCode() * 31);
    }
}
