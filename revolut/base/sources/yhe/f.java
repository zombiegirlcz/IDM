package yhe;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lw0.m f313916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.i f313917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f313918c;

    public f(lw0.m navBar, aw0.g gVar, List items) {
        Intrinsics.checkNotNullParameter(navBar, "navBar");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f313916a = navBar;
        this.f313917b = gVar;
        this.f313918c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f313918c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f313916a, fVar.f313916a) && Intrinsics.f(this.f313917b, fVar.f313917b) && Intrinsics.f(this.f313918c, fVar.f313918c);
    }

    public final int hashCode() {
        int iHashCode = this.f313916a.hashCode() * 31;
        aw0.i iVar = this.f313917b;
        return this.f313918c.hashCode() + ((iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31);
    }
}
