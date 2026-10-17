package elj;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class k implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f127503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f127504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f127505c;

    public k(h navBarConfig, List items, boolean z) {
        Intrinsics.checkNotNullParameter(navBarConfig, "navBarConfig");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f127503a = navBarConfig;
        this.f127504b = items;
        this.f127505c = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f127504b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f127503a, kVar.f127503a) && Intrinsics.f(this.f127504b, kVar.f127504b) && this.f127505c == kVar.f127505c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f127505c) + p.a.d(this.f127503a.hashCode() * 31, 31, this.f127504b);
    }
}
