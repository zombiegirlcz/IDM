package oe1;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f224511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f224512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f224513c;

    public i(List items, boolean z, List menuItems) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f224511a = items;
        this.f224512b = menuItems;
        this.f224513c = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f224511a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f224511a, iVar.f224511a) && Intrinsics.f(this.f224512b, iVar.f224512b) && this.f224513c == iVar.f224513c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f224513c) + p.a.d(this.f224511a.hashCode() * 31, 31, this.f224512b);
    }
}
