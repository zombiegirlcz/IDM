package fy4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class p implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f138899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lw0.a f138900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.i f138901c;

    public p(aim.e items, lw0.a header, aw0.i iVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(header, "header");
        this.f138899a = items;
        this.f138900b = header;
        this.f138901c = iVar;
    }

    @Override // cli.p
    public final List c() {
        return this.f138899a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f138899a, pVar.f138899a) && this.f138900b.equals(pVar.f138900b) && Intrinsics.f(this.f138901c, pVar.f138901c);
    }

    public final int hashCode() {
        int iHashCode = (this.f138900b.hashCode() + (this.f138899a.hashCode() * 31)) * 31;
        aw0.i iVar = this.f138901c;
        return iHashCode + (iVar == null ? 0 : iVar.hashCode());
    }
}
