package yw9;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f317361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f317362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f317363c;

    public i(List items, boolean z, h navBarState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarState, "navBarState");
        this.f317361a = items;
        this.f317362b = z;
        this.f317363c = navBarState;
    }

    @Override // cli.p
    public final List c() {
        return this.f317361a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f317361a, iVar.f317361a) && this.f317362b == iVar.f317362b && Intrinsics.f(this.f317363c, iVar.f317363c);
    }

    public final int hashCode() {
        return this.f317363c.hashCode() + j6.a.c(this.f317361a.hashCode() * 31, 31, this.f317362b);
    }
}
