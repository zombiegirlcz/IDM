package obc;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f223922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f223923b;

    public l(i navBarState, List items) {
        Intrinsics.checkNotNullParameter(navBarState, "navBarState");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f223922a = navBarState;
        this.f223923b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f223923b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f223922a, lVar.f223922a) && Intrinsics.f(this.f223923b, lVar.f223923b);
    }

    public final int hashCode() {
        return this.f223923b.hashCode() + (this.f223922a.hashCode() * 31);
    }
}
