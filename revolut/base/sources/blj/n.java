package blj;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class n implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f16718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f16719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f16720c;

    public n(m navBarConfig, List items, l footerState) {
        Intrinsics.checkNotNullParameter(navBarConfig, "navBarConfig");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(footerState, "footerState");
        this.f16718a = navBarConfig;
        this.f16719b = items;
        this.f16720c = footerState;
    }

    @Override // cli.p
    public final List c() {
        return this.f16719b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f16718a, nVar.f16718a) && Intrinsics.f(this.f16719b, nVar.f16719b) && Intrinsics.f(this.f16720c, nVar.f16720c);
    }

    public final int hashCode() {
        return this.f16720c.hashCode() + p.a.d(this.f16718a.hashCode() * 31, 31, this.f16719b);
    }
}
