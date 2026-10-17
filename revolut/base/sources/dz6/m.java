package dz6;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f121249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f121250b;

    public m(l header, List items) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f121249a = header;
        this.f121250b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f121250b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f121249a, mVar.f121249a) && Intrinsics.f(this.f121250b, mVar.f121250b);
    }

    public final int hashCode() {
        return this.f121250b.hashCode() + (this.f121249a.hashCode() * 31);
    }
}
