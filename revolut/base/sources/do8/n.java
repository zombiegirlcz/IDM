package do8;

import aw0.n6;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class n implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f116458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f116459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n6 f116460c;

    public n(m navBarConfig, List items, n6 n6Var) {
        Intrinsics.checkNotNullParameter(navBarConfig, "navBarConfig");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f116458a = navBarConfig;
        this.f116459b = items;
        this.f116460c = n6Var;
    }

    @Override // cli.p
    public final List c() {
        return this.f116459b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f116458a, nVar.f116458a) && Intrinsics.f(this.f116459b, nVar.f116459b) && Intrinsics.f(this.f116460c, nVar.f116460c);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f116458a.hashCode() * 31, 31, this.f116459b);
        n6 n6Var = this.f116460c;
        return iD + (n6Var == null ? 0 : n6Var.hashCode());
    }
}
