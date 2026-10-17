package cuj;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class p implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f109051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f109052b;

    public p(k headerState, List items) {
        Intrinsics.checkNotNullParameter(headerState, "headerState");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f109051a = headerState;
        this.f109052b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f109052b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f109051a, pVar.f109051a) && Intrinsics.f(this.f109052b, pVar.f109052b);
    }

    public final int hashCode() {
        return this.f109052b.hashCode() + (this.f109051a.hashCode() * 31);
    }
}
