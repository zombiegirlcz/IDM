package gqd;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f145686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f145687b;

    public k(List items, j toolbarState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(toolbarState, "toolbarState");
        this.f145686a = items;
        this.f145687b = toolbarState;
    }

    @Override // cli.p
    public final List c() {
        return this.f145686a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f145686a, kVar.f145686a) && Intrinsics.f(this.f145687b, kVar.f145687b);
    }

    public final int hashCode() {
        return this.f145687b.hashCode() + (this.f145686a.hashCode() * 31);
    }
}
