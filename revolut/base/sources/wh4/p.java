package wh4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class p implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f297409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f297410b;

    public p(List items, n contentState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentState, "contentState");
        this.f297409a = items;
        this.f297410b = contentState;
    }

    @Override // cli.p
    public final List c() {
        return this.f297409a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f297409a, pVar.f297409a) && Intrinsics.f(this.f297410b, pVar.f297410b);
    }

    public final int hashCode() {
        return this.f297410b.hashCode() + (this.f297409a.hashCode() * 31);
    }
}
