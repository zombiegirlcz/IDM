package qpd;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class l implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f248360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f248361b;

    public l(List items, k navBarState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarState, "navBarState");
        this.f248360a = items;
        this.f248361b = navBarState;
    }

    @Override // cli.p
    public final List c() {
        return this.f248360a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f248360a, lVar.f248360a) && Intrinsics.f(this.f248361b, lVar.f248361b);
    }

    public final int hashCode() {
        return this.f248361b.hashCode() + (this.f248360a.hashCode() * 31);
    }
}
