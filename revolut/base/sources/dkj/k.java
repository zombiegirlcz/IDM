package dkj;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class k implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f115575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f115576b;

    public k(List items, h navBarConfig) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarConfig, "navBarConfig");
        this.f115575a = items;
        this.f115576b = navBarConfig;
    }

    @Override // cli.p
    public final List c() {
        return this.f115575a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f115575a, kVar.f115575a) && Intrinsics.f(this.f115576b, kVar.f115576b);
    }

    public final int hashCode() {
        return this.f115576b.hashCode() + (this.f115575a.hashCode() * 31);
    }
}
