package gp3;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f145234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.i f145235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f145236c;

    public h(g gVar, aw0.i iVar, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f145234a = gVar;
        this.f145235b = iVar;
        this.f145236c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f145236c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f145234a, hVar.f145234a) && Intrinsics.f(this.f145235b, hVar.f145235b) && Intrinsics.f(this.f145236c, hVar.f145236c);
    }

    public final int hashCode() {
        g gVar = this.f145234a;
        int iHashCode = (gVar == null ? 0 : gVar.hashCode()) * 31;
        aw0.i iVar = this.f145235b;
        return this.f145236c.hashCode() + ((iHashCode + (iVar != null ? iVar.hashCode() : 0)) * 31);
    }
}
